Feature: Control Panel - Formats filter

  Background:
    Given I open a browser and go to login page
    And I am at Login page

  Scenario: Test 739: Control Panel - Formats filter
    When I login as valid user
    Then I am at "Dashboard" page
    And I verify that "DASHBOARD" is selected in navigation panel menu
    And I click MoreFilters link at Control Panel
    Then I verify that Status additional filter has "All statuses" value
    And I verify that Tasks additional filter has "Any task" value
    And I verify that Users additional filter has "All" value
    Then I click on Tasks filter
    And I verify that parent filter option "All" is checked
    And I verify child filter options checked status
      | Text          | checked |
      | Photo         | checked |
      | Photo Gallery | checked |
      | Graphic       | checked |
      | Video         | checked |
      | Audio         | checked |
      | Live          | checked |
      | Table         | checked |
      | Poll          | checked |
      | Quiz          | checked |
      | Sweepstakes   | checked |
      | Advertisement | checked |
      | Other         | checked |
      | Other (2)     | checked |
      | Other (3)     | checked |
      | Other (4)     | checked |
      | Other (5)     | checked |
      | No tasks      | checked |
    Then I press CANCEL in filters pop-up
    And I verify that Tasks additional filter has "Any task" value
    And I verify APPLY filters button is disabled
    Then I create a new Story
    And I am at new Story creation page
    And I enter Story Description "Test 739: Control Panel - Formats filter"
    And I add Photo to Story
    And I add Audio to Story
    Then I click Save Story top link
    And I am at Dashboard page
    Then I click on Tasks filter
    And I uncheck All filters
    And I check "Text" filter
    Then I press ENTER in filters pop-up
    And I verify that Tasks additional filter has "Text" value
    And I verify APPLY filters button is enabled
    Then I wait for 3 seconds