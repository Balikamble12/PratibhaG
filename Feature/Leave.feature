Feature: user validate Calender
@leave
Scenario: User validate calender functionality
Given user click on Leave
And user select starting leave date
And user select ending leave date
Then user unchecked pending approval status
And user selects Rejected status
Then user entered Leave emp Name as "sunita"
And user click on include past employees