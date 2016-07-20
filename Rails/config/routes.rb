Rails.application.routes.draw do
  # API routes path
  namespace :api, defaults: { format: :json } do
    namespace :v1 do
      resources :celebs
    end
  end  
end 