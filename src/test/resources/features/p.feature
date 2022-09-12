Feature: facebook page

  @test1
  Scenario: i want to open facebook page with invalid credentials
    Given i open the facebook page
    And i Enter invalid username and password
    When I click on login button
    Then I want to see the inline error message

  @test1
  Scenario: i want to open the facebook login page and search for the person
    Given i open the facebook page
    And i Enter username and password
    When I click on login button
    
    
    
  #@test1
  #Scenario Outline: i want to open the facebook login page
    #Given i open the facebook page
    #And i Enter <username> and <password>
    #When I click on login button

    #Examples: 
      #| <userName>       | <password> |
      #| tejadt@gmail.com | nitt@123   |
