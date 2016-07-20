class Celeb < ActiveRecord::Base
    validates :name, presence: true
    validates :followers, presence: true
    validates :profession, presence: true
end