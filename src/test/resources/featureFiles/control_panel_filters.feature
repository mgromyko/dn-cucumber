Feature: Control Panel - Formats filter

  Background:
    Given I open a desktop version of site

    Scenario: Test 739: Control Panel - Formats filter
      When I login as valid user
      Then I am at "Dashboard" page
      And I verify that "DASHBOARD" is selected in navigation panel menu
#      And I click MoreFilters link at FiltersPanel
#      Then I verify that "Status" additional filter has "All statuses" value
#      And I verify that "Tasks" additional filter has "Any task" value
#      And I verify that "Users" additional filter has "All" value