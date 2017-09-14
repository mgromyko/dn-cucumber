Feature: Control Panel - Formats filter

  Background:
    Given I open a browser and go to login page
    And I am at Login page
    Then I login as valid user
    And I reset all Dashboard filters

  Scenario: Test 739: Control Panel - Formats filter
    When I am at "Dashboard" page
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
    And I enter Story Description "Test 739: Story without content"
    And I delete first Text article at Tasks Panel
    Then I click SAVE & NEXT bottom button
    And I enter Story Description "Test 739: Story with Text only"
    Then I click SAVE & NEXT bottom button
    And I enter Story Description "Test 739: Story with Photo only"
    And I add Photo to Story
    And I delete first Text article at Tasks Panel
    Then I click SAVE & NEXT bottom button
    And I enter Story Description "Test 739: Story with Audio only"
    And I add Audio to Story
    And I delete first Text article at Tasks Panel
    Then I click Save Story top link
    And I am at Dashboard page
    Then I click on Tasks filter
    And I uncheck All filters
    And I check "Text" filter
    Then I press ENTER in filters pop-up
    And I verify that Tasks additional filter has "Text" value
    And I verify APPLY filters button is enabled
    Then I click APPLY filters button
    And I see active filters: "tasks"
    And I verify that "Test 739: Story with Text only" displayed at Story List
    Then I click MoreFilters link at Control Panel
    And I click on Tasks filter
    And I check "Photo" filter
    Then I press ENTER in filters pop-up
    And I verify that Tasks additional filter has "2 selected" value
    Then I click APPLY filters button
    And I wait for page loading has been completed
    And I see active filters: "tasks"
    And I verify that "Test 739: Story with Text only" displayed at Story List
    And I verify that "Test 739: Story with Photo only" displayed at Story List
    Then I wait for 5 seconds