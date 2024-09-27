Feature: validate create booking end point

  Scenario: verify user can create booking
    Given user wants to call "/booking" end point
    And set header "content-Type"  to "application/json"
    And set request from the file "create_booking.json"
    When user performs post call
    Then verify status code is 200