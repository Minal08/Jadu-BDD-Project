$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/featurefile/registration.feature");
formatter.feature({
  "line": 1,
  "name": "Registration Page",
  "description": "",
  "id": "registration-page",
  "keyword": "Feature"
});
formatter.before({
  "duration": 7152618900,
  "status": "passed"
});
formatter.scenario({
  "comments": [
    {
      "line": 2,
      "value": "#  As a User"
    },
    {
      "line": 3,
      "value": "#  I’d like to be able to fill in the form"
    },
    {
      "line": 4,
      "value": "#  So that I can request a demonstration"
    },
    {
      "line": 5,
      "value": "#"
    },
    {
      "line": 6,
      "value": "#  Background: As a user I should be able to land on demo registration page successfully"
    },
    {
      "line": 7,
      "value": "#    Given User is on Home Page"
    },
    {
      "line": 8,
      "value": "#    When  User click on demo registration form link"
    },
    {
      "line": 9,
      "value": "#    Then  User should land on demo registration page successfully"
    },
    {
      "line": 10,
      "value": "#"
    }
  ],
  "line": 11,
  "name": "As a user I should be able to fill in the form successfully",
  "description": "",
  "id": "registration-page;as-a-user-i-should-be-able-to-fill-in-the-form-successfully",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 12,
  "name": "User is on demo registration page",
  "keyword": "Given "
});
formatter.match({
  "location": "MyStepdefs.userIsOnDemoRegistrationPage()"
});
formatter.result({
  "duration": 176374900,
  "status": "passed"
});
formatter.after({
  "duration": 729424000,
  "status": "passed"
});
});