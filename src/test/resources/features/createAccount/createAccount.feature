Feature: Sign up new customer functionality

  Scenario: Positive scenario fill out all the info standard way
    Given user is main page user clicks on create account button
    Then user is on create account page and verifies title
      | title | Create New Customer Account |
    And user enters firstname and lastname
      | firstname | Kobe |
      | lastname  | Abdy |
    When user enters email and password and confirms the password
      | email           | mtbtb@ttt.com |
      | password        | QAertyuioP@   |
      | confirmPassword | QAertyuioP@   |
    Then user clicks create account and verifies success message
      | successMessage | Thank you for registering with Main Website Store. |

