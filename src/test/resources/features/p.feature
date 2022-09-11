Feature: facebook page

@test1
  Scenario Outline: i want to open the facebook login page 
    Given i open the facebook page
    And i Enter username and password
    When I click on login button

@test2
  Scenario Outline: i want to open the facebook login page and search for the person
    Given i open the facebook page
    And i Enter username and password
    When I click on login button
    Then I want to see the home page
    And I want to search the person in home page    