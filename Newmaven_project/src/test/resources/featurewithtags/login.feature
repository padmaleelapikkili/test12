Feature: login  to HRM Application

Background:
Given user is on HRMLogin page "https://opensource-demo.orange"

@ValidCrenditials
Scenario: Login with valid crendentials

When user enters username as "Admin" and password as "admin123"
Then user should be able to login successfully and new page opens

@Missingusername
Scenario:

When user enters username as " " and password as "admin123"
Then user should be able to see a message "required" below usename and password
