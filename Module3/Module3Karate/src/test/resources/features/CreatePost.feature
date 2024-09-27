Feature: CreateBooking
  Background:
    * def requestBody = read('../json/createPost.json')
    * def body = read('classpath://json//createPost.json')

  Scenario: Verify post request with create booking
    When url host
    Given header Content-type = 'application/json'
    And header Accept = 'application/json'
    And request requestBody
    When method post
    Then status 201
    And print response
