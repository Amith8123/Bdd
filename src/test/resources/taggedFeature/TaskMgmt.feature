@PhaseTwo
Feature: Task Management
CRUD Operations for Task

@SmokeTest
Scenario: Create a task
Given User is logged in
When User create a task
 
 Scenario: Update a task
Given User is logged in
When User update a task

@SmokeTest
Scenario: Delete a task
Given User is logged in
When User delete a task