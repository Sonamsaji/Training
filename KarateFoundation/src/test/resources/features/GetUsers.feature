Feature: verify user can get booking id's


  Scenario: verify user can retrieve list of bookings
    Given url host
    When method get
    Then status 200
    And print response



