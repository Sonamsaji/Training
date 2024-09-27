Feature: create auth token

  Background:
    * def requestBody = read('../json/create_token.json')
    * def body = read('classpath://json//create_token.json')
  Scenario: verify user can create token
    Given url host
    And path '/auth'
    Given header Content-type = 'application/json'
    And header Accept = 'application/json'
    And request requestBody
    When method post
    Then status 200
    And print response
