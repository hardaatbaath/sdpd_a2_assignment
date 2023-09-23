[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-24ddc0f5d75046c5622901739e7c5dd533143b0c8e959d652212380cedb1ea36.svg)](https://classroom.github.com/a/tI1Hnuga)
# A2-PersistUI

In this Android app, the user has to roll the dice .

**Name of the Project:** A2-Persist UI Dice Game

**Name:** Kinshuk Goel\
**ID:** 2021A7PS2726G\
**Email:** f20212726@goa.bits-pilani.ac.in

**Name:** Hardaat Singh Baath\
**ID:** 2021A7PS2662G\
**Email:** f20212662@goa.bits-pilani.ac.in

## Description
A simple game where you click the die to roll it. It gives a number between 1 and 6. On the basis of what number you roll, 
you gain or lose coins. The rules for the game are given below:
1. If you roll a six, you still get 5 coins. 
2. If you roll two sixes in a row, you earn 10 coins. 
3. But if you roll any other number twice in a row, you lose 5 coins.

On the basis of the information that we get, we also display total number of coins, the previous number, total dice rolls,
total number of single sixes, total number of double sixes, total number of other number doubles etc.

One challenge that we are facing is that we are not able to seperate the landscape mode from the portrait mode.

## Implementation
Task 1 - Construction of the WalletActivity Class and WalletViewModel Class and Persistence using WalletViewModel Class
In Task 1, we need to create the WalletActivity class and the WalletViewModel class to manage data persistence and user interface interactions related to a dice rolling game. Here's a summary of what needs to be done:

Task 2 - Toast
In Task 2, we are required to show a Toast message in the WalletActivity class based on the outcome of the dice roll. When a six is rolled, display a "congratulations!" message using a Toast. This provides quick feedback to the user.

Task 3 - Showing User Stats
In Task 3, we needed to display various game statistics to the user in real-time. These statistics should persist through UI changes and configuration changes. The stats and initial die value are assumed to be 0 at the beginning. 

Task 4 - Upping the Stakes
In Task 4, we were expected to make changes to the WalletViewModel class to accommodate specific game rules, such as handling double sixes and other rules related to consecutive rolls. We had ensure that the logic in the ViewModel is updated to reflect these rules without providing the actual code.
 

## Testing
For testing, we used test driven development. We used basic test cases and made changes to code according to the edge cases and errors that we faced.

## Accessibility
In Accessibility we faced the following errors:
1. Text Scaling: This was an error caused due to the size of the heading.
2. Text Contrast: The forground to background contrast ratio was not accepted

**Hours taken to complete the assignment:** Approximately 15-18 hours spread across the entire time duration between the release of
the assignment and the deadline.

**Pair Programming Rating:** 5(Both the team members actively involved in the development of this application)

**Difficulty-wise Rating:** 6/10
