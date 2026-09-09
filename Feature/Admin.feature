
Feature: User validate Admin functionality


@Admin

Scenario Outline: user validate Admin Module
Given  user click on admin module
And user enters system user name as "sulbha"
And user select userrole
And  user enter employee name "<emp>"
And user select user status
Then user click on Search
Then user should see error message



Examples:
|emp|
|pratibha|
@Add
Scenario: user Add New Admin user

Given  user click on admin module
Given user click on Add
And user add user role
And user add emp name
And user add username
And user add password
Then user confirm password
And user click on Save Button


