class TodoController < ApplicationController
  def index
    if !session[:user]
      redirect_to action: 'index', controller: 'home'
    end
    @tasks = Parse.client.query("Task").eq("user", Parse::Pointer.new({"className" => "_User",
                                                                       "objectId" => session[:user]['objectId']
                                                                      })).get
  end

  def add
    task = Parse.client.object("Task")
    task["user"] = Parse::Pointer.new({"className" => "_User",
                                       "objectId" => session[:user]['objectId']
                                      })
    task["data"] = params[:taskData]
    task["checked"] = false
    task.save
    redirect_to action: 'index'
  end

  def remove
    task = Parse.client.query("Task").eq("objectId", params[:id]).get.first
    task.parse_delete
    redirect_to action: 'index'
  end

  def check
    task = Parse.client.query("Task").eq("objectId", params[:id]).get.first
    task['checked']=true
    task.save
    redirect_to action: 'index'
  end

  def uncheck
    task = Parse.client.query("Task").eq("objectId", params[:id]).get.first
    task['checked']=false
    task.save
    redirect_to action: 'index'
  end
end
