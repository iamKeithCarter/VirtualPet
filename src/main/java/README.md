

                                     Road Map

 Virtual pet allows for the player to name and care for their own Virtual Pet.  They must take care and provide for it.  
 The tick() is based on the time between user interactions with the pet.  If the user should happen to loose their pet 
 they have the option of creating or adopting a new Virtual Pet.
 
The following are options, ideas and suggestions for approaching the solution to virtual pet. 


Welcome to virtual pet.  
	Syso

 All pets need a name what would you like to call your pet.
	scanner (name)
when name has a value  begin pet
You will need to Feed,Play with, Cleanup after and Care for your pet.
	syso
What do you want to do? //syso

Interact with pet = H //keylistener and event handler
1. Feed Horace    ///HungerLevel  feed()
2. Water Horace  ///ThirstLevel  giveWater()
3. Play with Horace  //bordomlevel playWith()
4. Put Horace to sleep //sleepinees()  when sleep he cant be feed or watered only play with till sleep
less than 45
5. Clean up

Use scanner to input values from one to five.

tick()   Basic (method) occurs after each input using the system timer to determine how much time has past between keyboard
entries and use this to modify the attributes modifyAttributesFactor()  This method is called when user provides input it updates 
all attributes.

tick() Alt (method) is called continually and updates the attributes.  It receives input from the eventhandler/listener() 
from keyboard input and updates the attributes.

Rule: the only time the attributes show and increase is when the tick() aka:the passage of time method is called.

The App calls tick() and  tick returns values to the App that are displayed on the screen as Status().
Status() displays the attribute values based on the return from tick() the loop is in the App (every 3 sec it calls tick() if possible)
 (or Tick updates after each user entry).

Ask for user input KeyboardEvent()[[[[ if there is KeyboardEvent it takes that argument and calls tick()
if after 10 sec there is no keyboardEvent() ]]]] if .5 sec pass without an event it uses the value of 0 for the event and calls tick().  if it receives a value of 1-5 it uses this to 
affect the attibutes based on the number 1 = feed etc.  If keyboardEvent is anything other than 5 it returns 0 and tick() continues

Each input value 1-5 affects each of the pets attributes ex: feed reduces hunger by 5 but increases sleepiness by 1 etc  use integers ,
 uses values up to 100 = death run away etc



 
 ***************************
 methods
 runVPA() one time through to assign name give instructions and start tick
 tick()  loop as long as  isAlive == true
 
 
 displayStatus()// the raw attribute values could be images this could also be in evaluetesStatus
 askWhatdoYouWantToDo() keyboardListener() or Scanner() input after displaying a list of choices.
 feed()   change the feed value and other attributes
 giveWater() change the water value and other attributes
 playWith()  change the play value and other attributes
 selfSleep()  change the sleep value and other attributes
 
 evaluateStatus() evaluates Int petTramaValue based on each attribute value using an algorithm.
 isPetAlive = summation of each attribute with thier value factor
 
 Attributes tick increase		actions changes by
 hunger     2 after 5 tick      feed hunger -5 thirt 1	sleep 2 poop 2
 thirst 	1 after 2 tick		water thrist -3 hunger -1 sleep -1 poop 1
 play		2 after 6 tick		played -4 hunger 3 thrist 2 sleep 3 poop 2
 sleep		5 after 5 tick		sleep -8 hunger -2	thirst -2 play 0 poop 1
 poop       1 after each tick	cleanup -5 hunger 1 thirst 0 play 0 sleep 0
 
 
 

 
