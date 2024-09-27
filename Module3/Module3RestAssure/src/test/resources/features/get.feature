Feature: verify Get, Post, Put, Delete

  Scenario: Verify user can check get
    Given user wants to call "/posts" end point
    When  user performs get call
     Then verify status code is 200
    And verify post id is not empty

  Scenario: Verify user can check create and update posts
    Given user wants to call "/posts" end point
    And set header "Content-Type" to "application/json"
    And set request body from the file "create_post.json"
    When user performs post call
    Then verify status code is 201
    And verify post id is not empty
    And stores created post id into "post.id"
    When user wants to call "/posts/3" end point
    And set request body from the file "update_post.json"
    And user performs put call
    Then verify status code is 400

