Feature: Delete user

  Background:
    * def responseOfCreateToken = call read("classpath://features/CreateUser.feature")
    * def responseOfCreateUser = call read("classpath://features/CreateUser.feature")

  Scenario: Verify user can delete booking
    Given url host
    And path '/2'
    And header Cookie = "token=" + responseOfCreateToken.response.token
    When method delete
    Then status 204
    And print response
