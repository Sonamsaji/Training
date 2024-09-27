Feature: verify user can get booking id's


  Scenario: verify user can retrieve list of bookings
  Given url 'https://restful-booker.herokuapp.com/booking'
  When method get
  Then status 201