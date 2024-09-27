Feature: Update user

  Background:
    * def responseOfCreateToken = call read("classpath://features/CreateUser.feature")
    * def requestBody = read('../json/update_user.json')
    * def body = read('classpath://json//update_user.json')

  Scenario: Verify user can update booking
    Given url host
    And path '/2'
    Given header Content-type = 'application/json'
    And header Cookie = "token=" + responseOfCreateToken.response.token
    And request requestBody
    When method put
    Then status 200
    And print response
