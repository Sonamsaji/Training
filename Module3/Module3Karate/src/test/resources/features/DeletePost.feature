
Feature: Delete Posts

  Background:
    * def responseOfCreatePost = call read("classpath://features/CreatePost.feature")

  Scenario: verify user can delete post
    Given url host
    And path "/1"
    When method delete
    Then status 204
    And print response


