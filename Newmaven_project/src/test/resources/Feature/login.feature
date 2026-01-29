Feature: tesstlogin functionality

Scenario Outline: check login is succesful with user crendentials
Given  chrome browser is open
And user is on login page
When enters <username> and <password>
Then navigate to home page 

Examples:

|username|password|
|standard_user|secret_sauce|
|error_user|secret_sauce|

