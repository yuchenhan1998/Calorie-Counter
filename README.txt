In this file you should include:

Any information you think we should know about your submission
* Is there anything that doesn't work? Why?
So far everything is fine. I think I have completed all the requirements.

* Is there anything that you did that you feel might be unclear? Explain it here.
I am very confused about how to set up a global variable among all activities. I intend to do that initially but failed. So I chose the 
startactivityforresult method.
Besides, when one activity returns to another, I do not know whether it will start from oncreate or onstart or onresume

A description of the creative portion of the assignment
* Describe your feature
There are mainly three creative features right now. 1. Users can call the app company from the CALL US button.
2. Users can visit our company's website from the WEBSITE button.
3. I have added some regular and common food in one activity. Users can add food directly from the calories shortcuts button without adding manually.

* Why did you choose this feature?
The call button and the website button provide users' chances to get in contact with the company. If they encounter questions using the app, they can call
our custom service reps for assistance. Or, they can also contact us if they intend to carry on business cooperation. As for the website button, users can 
visit our official website directly from the button. They can get more information from our website about how to conduct more healthcare managemanet.
The calories shortcuts add much more convenience for the users. With calories of some food stored in our app, users can add them directly.
All in all, all these features aim to improve the convenience of users. Users' experience will be improved greatly with these features. Besides, setting up
connection between users and company is very important in modern corporation management field. These are great ways for the company to improve its service
based on users' feedback.

* How did you implement it?
For the call and website buttons, I add two buttons in the layout. And I add two functions in the mainactivity file to control them. The basic technology
is to use implicit intent to call system service.
For the calories shortcuts part, I add a new activity to complete the job. The basic idea is like the addFood activity. Using startactivityforresult and
onactivityresult to transfer the data from different activities.

1. (10 / 10 Points) User can enter total calorie amount on start up
2. (8 / 8 Points) User can add new food item by name
3. (8 / 8 Points) User can add new food item by calorie
4. (4 / 4 Points) Adding new food items is done in a second activity
5. (5 / 5 Points) Calories remaining is updated with each new food item
6. (5 / 5 Points) Calorie consumed is updated with each new food item
7. (10 / 10 Points) The list of food items displays foods and their respective calories amounts
8. (10 / 10 Points) Color change when calorie count becomes negative
9. (10 / 10 Points) All inputs are filtered and error messages are displayed accordingly
10. (2 / 2 Points) Code is clean and commented
11. (3 / 3 Points) App is visually appealing
12. (6 / 15 Points) Creative portion - design your own feature(s)!

I don't really understand the calling and website features that you added. They do not seem to add much value to the app. I don't know whose phone number that is, but I would be careful publishing that information if it is yours.

The common foods feature is more useful, however I think it would have been better for the app to remember foods that you have recently typed in.

The other features of the app work very well.

Total: 81 / 90
