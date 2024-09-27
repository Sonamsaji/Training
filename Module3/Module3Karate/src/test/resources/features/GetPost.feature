Feature: verify user can get posts


  Scenario: verify user can retrieve list of all posts
    Given url host
    When method get
    Then status 200
    And print response





