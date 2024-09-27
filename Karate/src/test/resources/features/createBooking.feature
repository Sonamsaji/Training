Feature: CreateBooking
  Background:
    * def requestBody = read('../json/createBooking.json')
    * def body = read('classpath://json//createBooking.json')

  Scenario: Verify post request with create booking
    When url host+'/booking'
    Given header Content-type = 'application/json'
    And header Accept = 'application/json'
    And request requestBody
    When method post
    Then status 200
    And print response