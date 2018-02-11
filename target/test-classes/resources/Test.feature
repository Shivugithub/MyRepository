#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: Login
 This feature is going to test the login functionality of magento
 This feature involves following scenarios.
 Valid credentials
 Invalid credentials
 
 Background:
 
 Scenario: Valid credentials
 Given I am able to access the magento web page 
 And I am a registerd user on magento 
 When I update the valid username
 And I update the valid password
 And I click on the SignIn buttons
 Then  I should get access to the dashboard
 
Scenario: Valid credentials
 Given I am able to access the magento web page 
 And I am a registerd user on magento 
 When I update the valid username as "natarajan.ramanathan93@gmail.com"
 And I update the valid password as "Welcome123"
 And I click on the SignIn buttons 
 Then  I should get access to the dashboard
 
      
      
      
      
      
      
      
      