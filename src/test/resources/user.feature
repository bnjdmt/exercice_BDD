Feature: User connection

  As a User, i want to be connected

  Scenario: Creation of an account
    When I am on the home-page
    Then I click on login
    And a pop-up appear
    Then I click on register
    Then I am redirected on register page
    And I fill the username field with "LeBossDuCode", the email field with "toto@test.fr" and the password field with "caputDraconis"
    And I click on "submit"
    Then I am registered and have an account

  Scenario: Login
    When I am on the home-page
    Then I click on login
    And a pop-up appear
    Then I click on connection
    And I am redirected on login page
    And I fill username field with "LeBossDuCode" and password field with "caputDraconis"
    And I click on connect
    Then I am logged

