# ViewTube

## ViewTube with livestream functionality

### Context 

The eZone developer team wants to expand their market by attacting more number of users to their ViewTube application. For this, they have come up with a plan of scheduling live events over the OTT platform called ViewTube Live.​

ViewTube Live is an easy way for creators to reach their community in real time. Whether streaming an event, teaching a class or hosting a workshop, ViewTube has tools that will help manage live streams and interact with viewers in real time​

### Challenge
As a Front-end developer, you have been given the responsibility of creating a form to schedule live events which is more reactive in nature. 

### Problem
This exercise is a continuation of the previous exercise(ViewTube with upload functionality).
Create a reactive form in angular to schedule an event with various details like event title, event start datetime, event end datetime, event description and guest list.​Add appropriate validators for the fields to make the form more robust.

Following are the things that learners have to complete:

1. Create studio-livestream component
2. Web Page should have a title in the header and side nav-bar (with menu item to schedule livestream) created using schematics
3. For scheduling a live stream event, following are the form fields required:
    - Livestream Event Title(Mandatory, Max Length:100)
    - Event start date (Mandatory)
    - Event start time (Mandatory, Drop down)
    - Event end date (Mandatory)
    - Event end time (Mandatory, Drop down)
    - Event details 
    - Guest List  (Chip list)
        
4. Built-in Validators should be used for form fields appropriately
5. Custom validators has to be created to check that 
    - Event start date time is greater than the current date time.
    - Event end date time is greater than the event start date time.
    - Guest emails are valid
6. On clicking the save button, valid form should be submitted and a toast message stating that "Your live stream event is scheduled successfully" should be displayed.

**Note: Do not modify/delete any of the other existing files/folders**


   


