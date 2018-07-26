# Java-Capstone-Project
Health Care System
I developed a full-stack Java Spring Boot application from scratch. This application is able to register and authenticate users.
There are two kinds of users - Administrator and normal user (i.e., staff).
Administrators are able to assign tasks to normal users. When normal users login they can see tasks which need to be performed.
Administrator are able to see profile pages and user information and can assign tasks to oneself as well as to normal users.
They are also able to search users' names, e.g., if an administrator types 'e' letter in search box, all the user names containing 'e' in their name appear.
If one logs in as a normal user, they are able to see all the tasks they need to perform. Normal users will not able to assign tasks to other users.
This application also includes some basic entry validation.  In the registration form if a user tries to submit empty form, the user will see a warning that the user needs to enter email, password and name in order to continue.
If a user tries to register with an email which already exists in the database, the user will see a message that the user email already exists and suggests that they should login if that is their intention.
If a user tries to register with a new email which does not exist in the database, then the user will get a succesful registration message.
