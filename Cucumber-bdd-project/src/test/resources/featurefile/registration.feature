Feature: Registration Page
  As a User
  I’d like to be able to fill in the form
  So that I can request a demonstration

  Background: As a user I should be able to land on demo registration page successfully
    Given User is on Home Page
    When  User click on demo registration form link
    Then  User should land on demo registration page successfully
#
  Scenario: As a user I should be able to fill in the form successfully
    Given User is on demo registration page
    When User enter <first name> in “Hello! My first name” text field
    And User enter <last name> in “My last name” text field
    And User enter <email> in “you can email me at” text field
    And User enter <organisation name> in “I work at organisation” field
    And User select <country of residence> from “My country of residence”
    And User select <jadu service> from “I am interested in seeing more of” text field
    And User enter postcode
    And User select fileuplod
    And User click on check box
    And User click on next link
    Then User navigate to <next page>

  Example
# Positive scenarios
  | first name| last name | email | number | organisation name |country of residence|jadu service|
  | Minal     | Patel     |minal@gmail.com | Admin             |UK & Ireland        | Tesco |
#  Negative scenarios
  |12Minal    |           | SDrirgmail     | 7348736£378       | 3874837|
  |           |           |                |                   |        |















