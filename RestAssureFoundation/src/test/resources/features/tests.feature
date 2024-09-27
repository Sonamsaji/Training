Feature: verify Get, Post, Put, Delete

  Scenario: Verify user can check get
    Given user wants to call "/users" end point
    When  user performs get call
    Then verify status code is 200

  Scenario: Verify user can create and update users
    Given user wants to call "/users" end point
    And set header "Content-Type" to "application/json"
    And set request body from the file "create_user.json"
    When user performs post call
    Then verify status code is 201
    And stores created user id into "users.id"
    When user wants to call "/users/@id" end point
    And set request body from the file "update_user.json"
    And user performs put call
    Then verify status code is 200


  Scenario: Verify user can delete users
    Given user wants to call "/users/3" end point
    And user performs delete call
    Then verify status code is 204


