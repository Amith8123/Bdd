Feature: Google Page Search
Background: Launch App
Given User Launch Google Page

Scenario: Search Java Tutorial

When User search Java Tutorial
Then Should display Java Search result page


Scenario: Search Selenium Tutorial

When User search Selenium Tutorial
Then Should display Selenium Search result page

Scenario: Search Cypress Tutorial

When User search Cypress Tutorial
Then Should display Selenium Search result page