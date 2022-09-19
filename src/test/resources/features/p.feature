Feature: facebook page

  @test1
  Scenario: i want to open facebook page with invalid credentials
    Given i open the facebook page
    And i Enter invalid username and password
    When I click on login button
    Then I want to see the inline error message

  @test2
  Scenario: i want to open the facebook login page and search for the person
    Given i open the facebook page
    And i Enter username and password
    When I click on login button

  @api
  Scenario: i want to hit the api for getting country details
    Given I send the GET request to the end point url
    
    #Then response code is 200
    #And Response body should contain values:
      #| REG_EXP                                                  |
      #| .*\\"message\\":\\"Invalid request - Rule not found\\".* |
