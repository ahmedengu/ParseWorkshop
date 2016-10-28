require_relative 'boot'

require 'rails/all'
require 'parse-ruby-client'

# Require the gems listed in Gemfile, including any gems
# you've limited to :test, :development, or :production.
Bundler.require(*Rails.groups)

module TodoRails
  class Application < Rails::Application
    Parse.init :application_id => "myAppId",
               :api_key => "myClientKey",
               :master_key => "mySecretMasterKey",
               :host => 'http://docker19107-env-2854709.mircloud.host',
               :path => '/parse'
  end
end
