# Developer Guide

## Setting up

**Prerequisites**

* JDK 8 or later 
* Eclipse IDE

**Importing the project into Eclipse**

0. Fork this repo, and clone the fork to your computer
1. Open Eclipse
2. Click `File` > `Import`
3. Click `General` > `Existing Projects into Workspace` > `Next`
4. Click `Browse`, then locate the project's directory
5. Click `Finish`

## Design
<img src="images/mainClassDiagram.png"/>

## Testing

### System tests

**Windows**

1. Open a DOS window in the `test` folder
2. Run the `runtests.bat` script
3. If the script reports that there is no difference between `actual.txt` and `expected.txt`, 
   the test has passed.

**Mac/Unix/Linux**

1. Open a terminal window in the `test` folder
2. Run the `runtests.sh` script
3. If the script reports that there is no difference between `actual.txt` and `expected.txt`, 
   the test has passed.

### JUnit tests

* In Eclipse, right-click on the `test/java` folder and choose `Run as` > `JUnit Test`

### Troubleshooting test failures

* Problem: How do I examine the exact differences between `actual.txt` and `expected.txt`?<br>
  Solution: You can use a diff/merge tool with a GUI e.g. WinMerge (on Windows)
* Problem: The two files look exactly the same, but the test script reports they are different.<br>
  Solution: This can happen because the line endings used by Windows is different from Unix-based
  OSes. Convert the actual.txt to the format used by your OS using some [utility](https://kb.iu.edu/d/acux).
* Problem: Test fails during the very first time.<br>
  Solution: The output of the very first test run could be slightly different because the program
  creates a new storage file. Tests should pass from the 2nd run onwards.
  
  
### User Stories
  As a busy businessman, I can change my tags, so that they stay updated.
  As a student, I can mass add contacts, so that I don't have to manually type every single one of my contacts.
  As a student, I can see a list of my contacts sorted according to how frequently I search for them, so that it is more convenient for me to find people I frequently connect with.
  
### Use Case

 1 
  System: Edit existing tag
  Use case: UC01
  Actor: User
  MSS: 
      1. User chooses to edit tag of existing person.
      2. System requests for which tag of person to change.
      3. User selects tag to be changed.
      4. System requests for details of the changed tag.
      5. User inputs details for changed tag.
      6. System requests for confirmation.
      7. User confirms.
      8. System changes tag and display new information of user.
      		Use case ends.
  Extensions:
  	  3a. System detects invalid tag selected.
  	  	3a1. System requests for valid data.
  	  	3a2. User selects valid data.
  	  Steps 3a1-3a2 are repeated until tag selected is valid.
  	  Use case resumes from step 4.
  	  
  	  *a. At any time user chooses to cancel edit
  	  	  Use case ends.
