# Autor: Liseth Troncoso
@stories
Feature: Login
  As a user of the Eribank application
  I want to login
  to see my balance


  @Scenario
  Scenario Outline:
    When liseth login to the Eribank application with <user> and <password>
    Then liseth visualizes her balance
    Examples:
      | user        | password |
      | company     | company  |

