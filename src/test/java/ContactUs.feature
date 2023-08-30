Feature: Contact Us TEST

  Scenario: Go to website and test Contact us Page

    Given navigate to website
    And click on contact us bottom
    And select Subject Heading
    And type Email
    And type Order referance
    And type a message
    When click on Submit button
    Then verify success message
