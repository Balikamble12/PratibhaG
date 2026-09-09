Feature: User validate Login functionality with valid credentails

Scenario Outline: user login application with valid credentials

And user enters username as "<username>"
And  user enters password "<Pwd>"
Then user click on login
And user see admin module
Examples:
|username|Pwd|
|Admin|Qedge123!@#|

@sanity

Scenario Outline: user login application with invalid credentials

And user enters username as "<username>"
And  user enters password "<Pwd>"
Then user click on login
Then user should see invalid credential error message

Examples:
|username|Pwd|
|Admins|1234|
|Adminss|1234567893|
|Admin|12|











