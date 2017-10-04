@desktop @format_filters @test739
Feature: Control Panel - Formats filter

  Background:
    Given I open a browser and go to mobile login page

  Scenario: Mobile 1st Test
    When I am at Login page
    And I login as valid user
#    And I navigate to Story List
#    Then I am at "Stories" page
    And I click open filters at Control Panel
