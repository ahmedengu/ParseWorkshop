Rails.application.routes.draw do
  get 'todo', to: 'todo#index'

  post 'add', to: 'todo#add'

  get 'remove/:id', to: 'todo#remove'

  get 'check/:id', to: 'todo#check'

  get 'uncheck/:id', to: 'todo#uncheck'

  root 'home#index'

  post 'login', to: 'home#login'
  post 'signup', to: 'home#signup'
  get 'logout', to: 'home#logout'
end
