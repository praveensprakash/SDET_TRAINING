Feature: To open Learning Website

Scenario: Launch learning url and Submit all mandatory deatils in the form
Given Learning url is launched
When Homepage is visible
And Click on sign up
And Registration page is visible
Then Enter all mandatory details
And Click on register
When Registration is successfull
Then Click on Next
When name is visible
Then click on name 
And open select profile from dropdown
When message box is open
Then message box is clicked
Then compose a message
And click on send
And close the browser