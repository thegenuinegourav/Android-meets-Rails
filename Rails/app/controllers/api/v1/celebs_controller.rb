class Api::V1::CelebsController < ApplicationController
  respond_to :json

  def index
    respond_with Celeb.all
  end
end  