Feature: Login into App


Scenario Outline: Send email to user
Given User must launch the application
When User should send email to register
"""
Hello <user>

Welcome to our community !....

Click on the below link for registration...

From Support team

"""

Examples:
| user |
| testuser1 | welcome123 |
| testuser2 | welcome123 |
