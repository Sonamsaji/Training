Feature: Create User

  Background:
    * def requestBody = read('../json/create_user.json')
    * def body = read('classpath://json//create_user.json')

  Scenario: Verify post request with create user
    When url host
    Given header Content-type = 'application/json'
    And header Accept = 'application/json'
    And request requestBody
    When method post
    Then status 201
    And print response