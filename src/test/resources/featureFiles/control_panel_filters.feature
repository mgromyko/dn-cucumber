Feature: Control Panel - Formats filter

  Background:
    Given I open a browser and go to login page

    Scenario: Test 739: Control Panel - Formats filter
      When I login as valid user
      Then I am at "Dashboard" page
      And I verify that "DASHBOARD" is selected in navigation panel menu
      And I click MoreFilters link at Control Panel
      Then I verify that "Status" additional filter has "All statuses" value
      And I verify that "Tasks" additional filter has "Any task" value
      And I verify that "Users" additional filter has "All" value
      Then I wait for 3 seconds