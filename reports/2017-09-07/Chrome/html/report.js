$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("control_panel_filters.feature");
formatter.feature({
  "line": 1,
  "name": "Control Panel - Formats filter",
  "description": "",
  "id": "control-panel---formats-filter",
  "keyword": "Feature"
});
formatter.before({
  "duration": 103287,
  "status": "passed"
});
formatter.before({
  "duration": 421548,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "I open a desktop version of site",
  "keyword": "Given "
});
formatter.match({
  "location": "NavigationSteps.iOpenDesktopVersionOfSite()"
});
formatter.result({
  "duration": 1712243049,
  "status": "passed"
});
formatter.scenario({
  "line": 6,
  "name": "Test 739: Control Panel - Formats filter",
  "description": "",
  "id": "control-panel---formats-filter;test-739:-control-panel---formats-filter",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 7,
  "name": "I login as valid user",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "I am at \"Dashboard\" page",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "I verify that \"DASHBOARD\" is selected in navigation panel menu",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.iLoginAsValidUser()"
});
formatter.result({
  "duration": 916762735,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Dashboard",
      "offset": 9
    }
  ],
  "location": "NavigationSteps.iAmAtPage(String)"
});
formatter.result({
  "duration": 862178178,
  "status": "passed"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.after({
  "duration": 63822,
  "status": "passed"
});
});