class CreateCelebs < ActiveRecord::Migration
  def change
    create_table :celebs do |t|
      t.string :name
      t.integer :followers
      t.string :profession
      t.timestamps
    end
  end
end
