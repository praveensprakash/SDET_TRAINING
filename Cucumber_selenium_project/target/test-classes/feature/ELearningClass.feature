Feature: To edit profile in Learning Website

Scenario: Launch learning url and edit profile
Given Learning1 url is launched
When Homepage1 is visible
And Click1 on sign up
And Registration1 page is visible
Then Enter1 all mandatory details
And Click1 on register
When Registration1 is successfull
Then Click1 on Next
When name1 is visible
Then click1 on name
Then open1 select profile from dropdown
Then click on edit profile
And clear name
And change name
And clear Lastname
And change Lastname
And submit details
And close1 the browser