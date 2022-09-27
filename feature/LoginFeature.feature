Feature: Hotel Booking In Adcation Application

Scenario: Login Page

Given User Launch The Application

When User Enter The Username In Username Field
    	|username|password|
    	|Starc|Starc123|
    	|ABC|123|
    	|Chandrusrinivasan|2ZRY7E|
  
And User Enter The Password In Password Field

Then User Click On The Login Button And It Navigates To The Search Hotel Page

Scenario: Search Hotel Page

When User Enter The Hotel Location

And User Select Hotels

And User Select Room Type

And User Select Number Of Rooms

And User Select Check In Date

And User Select Check Out Date

And User Select Adults Per Room

And user Select Childern Per Room

Then User Click On The Search Button And It Navigates to the Continue 

Scenario: Continue Button

When User Select Hotel

Then User Click On The Continue And It Navigates To The Book Now

Scenario: Book page For Hotel

When User Enter The First Name In First Name Field

And user Enter The Last Name In Last Name Field

And user Enter The Address In Address Field

And User Enter Credit Card No In Field

And User Enter Credit Card Type In Field 

And User Enter Expiry Date In Field

And User Enter CVV Number In Field

Then User Click On The Book Now And It Navigates to the Confirmed Page


