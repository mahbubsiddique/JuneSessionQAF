@googleSearch
Feature: Google Search

Scenario Outline: simple search

Given I am on google homepage
When I enter search "<term>"
And I click on google search button
Then I receive relavant results

Examples: 
|term									|
|Quality Assurance		|
|Software Testing			|
|Software Engineering	|