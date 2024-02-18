To play this game there are two ways you can give input, the command line and a file
When you run the program it will ask you to choose either CMD for command line or FILE for file input
I have added a players.txt for ease of testing if you choose FILE. You are free to add your own file and test. Please check your file path and that it is correct wehn testing.
If you choose CMD you can add values of your choice

Design Patterns used in this game:

Factory Method Pattern: Used to create input handlers (InputHandler) based on different input sources.

Strategy Pattern: Used to encapsulate different strategies for rolling dice (DiceStrategy).

Observer Pattern: Used to observe changes in players' health. The HealthObserver class observes changes in player health and takes action when a player's health reaches zero.
In the scope of the current problem, in the provided implementation, the Observer interface is not strictly necessary as it only contains a single method, but it has been added
to ensure that the logic for handling changes in players' health (i.e., determining the winner when a player's health reaches zero) is decoupled from the main logic of the Magical Arena. 
This separation of concerns makes the code easier to understand, maintain, and extend.

