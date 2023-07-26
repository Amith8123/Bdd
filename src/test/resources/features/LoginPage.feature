Feature: Login into App

#Scenario: Valid Login
#Given User is on Login Page
#When User should enter credentials
#Then Should Display Home Page

#Scenario: Valid Login
#Given User is on Login Page
#When User should enter "tomsmith" and "SuperSecretPassword!"
#Then Should Display Home Page

#Scenario Outline: Valid Login
#Given User is on Login Page
#When User should enter "<username>" and "<password>"
#Then Should Display Home Page
#
#Examples:
#| username | password |
#| tomsmith | SuperSecretPassword! |
#| testuser1 | welcome123 |
#| testuser2 | welcome123 |

Scenario Outline: Valid Login
Given User is on Login Page
When User should enter login credentials
| username | password |
| tomsmith | SuperSecretPassword! |
Then Should Display Home Page
