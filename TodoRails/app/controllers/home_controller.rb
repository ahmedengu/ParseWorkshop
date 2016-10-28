class HomeController < ApplicationController
  def index
    if session[:user]
      redirect_to action: 'index', controller: 'todo'
    end
  end

  def login
    user = Parse::User.authenticate(params[:username], params[:username])
    session[:user]=user
    redirect_to action: 'index', controller: 'todo'
  rescue Exception => e
    render :text => e.message
  end

  def signup
    user = Parse.client.user({
                                 :username => params[:username],
                                 :password => params[:password]
                             })
    user.save
    session[:user]=user
    redirect_to action: 'index', controller: 'todo'
  rescue Exception => e
    render :text => e.message
  end

  def logout
    session[:user]=nil
    redirect_to action: 'index'
  end
end
