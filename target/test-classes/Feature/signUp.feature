Feature: SignUp

Scenario: SignUp without keyword example
Given I open browser
And I navigate to FreeCRM
And I click on SignUp
When I enter "John" and "Doe" and "abcd124@abc.com"
And I enter credentials "anonymous123" and "abcd12345"
And I check conditions and click submit
Then I enter comapny information "SyntaxTech" and "918-999-9999"
And I click on continue
Then I click on Complete Registeration
Then I quit browser
