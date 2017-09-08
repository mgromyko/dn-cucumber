$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("control_panel_filters.feature");
formatter.feature({
  "line": 1,
  "name": "Control Panel - Formats filter",
  "description": "",
  "id": "control-panel---formats-filter",
  "keyword": "Feature"
});
formatter.before({
  "duration": 98409,
  "status": "passed"
});
formatter.before({
  "duration": 537117,
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
  "name": "I open a mobile version of site",
  "keyword": "Given "
});
formatter.match({
  "location": "NavigationSteps.iOpenMobileVersionOfSite()"
});
formatter.result({
  "duration": 1956165003,
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
formatter.step({
  "line": 10,
  "name": "I click MoreFilters link at Control Panel",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I verify that \"Status\" additional filter has \"All statuses\" value",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "I verify that \"Tasks\" additional filter has \"Any task\" value",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "I verify that \"Users\" additional filter has \"All\" value",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "I wait for 3 seconds",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.iLoginAsValidUser()"
});
formatter.result({
  "duration": 10060490179,
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"id\",\"selector\":\"login-button\"}\n  (Session info: chrome\u003d60.0.3112.113)\n  (Driver info: chromedriver\u003d2.31.488774 (7e15618d1bf16df8bf0ecf2914ed1964a387ba0b),platform\u003dMac OS X 10.12.6 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 0 milliseconds\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.5.3\u0027, revision: \u0027a88d25fe6b\u0027, time: \u00272017-08-29T12:42:44.417Z\u0027\nSystem info: host: \u0027frantsuzov.atwss.com\u0027, ip: \u0027fe80:0:0:0:1c93:7321:27a8:d5cf%en0\u0027, os.name: \u0027Mac OS X\u0027, os.arch: \u0027x86_64\u0027, os.version: \u002710.12.6\u0027, java.version: \u00271.8.0_144\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities [{mobileEmulationEnabled\u003dfalse, hasTouchScreen\u003dfalse, platform\u003dMAC, acceptSslCerts\u003dtrue, webStorageEnabled\u003dtrue, browserName\u003dchrome, takesScreenshot\u003dtrue, javascriptEnabled\u003dtrue, platformName\u003dMAC, setWindowRect\u003dtrue, unexpectedAlertBehaviour\u003d, applicationCacheEnabled\u003dfalse, rotatable\u003dfalse, networkConnectionEnabled\u003dfalse, chrome\u003d{chromedriverVersion\u003d2.31.488774 (7e15618d1bf16df8bf0ecf2914ed1964a387ba0b), userDataDir\u003d/var/folders/qm/jrcklzmx7195mr1gkmnnh9_h0000gp/T/.org.chromium.Chromium.PWWMzM}, takesHeapSnapshot\u003dtrue, pageLoadStrategy\u003dnormal, unhandledPromptBehavior\u003d, databaseEnabled\u003dfalse, handlesAlerts\u003dtrue, version\u003d60.0.3112.113, browserConnectionEnabled\u003dfalse, nativeEvents\u003dtrue, locationContextEnabled\u003dtrue, cssSelectorsEnabled\u003dtrue}]\nSession ID: bdc4f36b772d1790d21721ff8e24e0a0\n*** Element info: {Using\u003did, value\u003dlogin-button}\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:215)\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:167)\n\tat org.openqa.selenium.remote.http.JsonHttpResponseCodec.reconstructValue(JsonHttpResponseCodec.java:40)\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:82)\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:45)\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:164)\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:82)\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:646)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:416)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementById(RemoteWebDriver.java:462)\n\tat org.openqa.selenium.By$ById.findElement(By.java:218)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:408)\n\tat pageObject.LoginPage.loginBtn(LoginPage.java:20)\n\tat pageAction.LoginActions.login(LoginActions.java:15)\n\tat stepDefinition.LoginSteps.iLoginAsValidUser(LoginSteps.java:12)\n\tat ✽.When I login as valid user(control_panel_filters.feature:7)\n",
  "status": "failed"
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
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "DASHBOARD",
      "offset": 15
    }
  ],
  "location": "TopPanelSteps.iVerifyThatIsSelectedInNavigationPanelMenu(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "ControlPanelSteps.iClickMoreFiltersLinkAtControlPanel()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Status",
      "offset": 15
    },
    {
      "val": "All statuses",
      "offset": 46
    }
  ],
  "location": "ControlPanelSteps.iVerifyThatAdditionalFilterHasValue(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Tasks",
      "offset": 15
    },
    {
      "val": "Any task",
      "offset": 45
    }
  ],
  "location": "ControlPanelSteps.iVerifyThatAdditionalFilterHasValue(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Users",
      "offset": 15
    },
    {
      "val": "All",
      "offset": 45
    }
  ],
  "location": "ControlPanelSteps.iVerifyThatAdditionalFilterHasValue(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "3",
      "offset": 11
    }
  ],
  "location": "GeneralPurpose.iWaitForSeconds(int)"
});
formatter.result({
  "status": "skipped"
});
formatter.embedding("image/png", "embedded0.png");
formatter.after({
  "duration": 493228705,
  "status": "passed"
});
});