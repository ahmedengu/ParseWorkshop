require 'test_helper'

class TodoControllerTest < ActionDispatch::IntegrationTest
  test "should get index" do
    get todo_index_url
    assert_response :success
  end

  test "should get add" do
    get todo_add_url
    assert_response :success
  end

  test "should get remove" do
    get todo_remove_url
    assert_response :success
  end

  test "should get check" do
    get todo_check_url
    assert_response :success
  end

  test "should get uncheck" do
    get todo_uncheck_url
    assert_response :success
  end

end
