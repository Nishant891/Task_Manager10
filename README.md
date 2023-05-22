# Task_Manager10
Description -
The Task_Manager class is a Java program that provides a simple command-line task manager. It allows users to manage their to-do list, mark tasks as done, and play a game of Rock Paper Scissors as a break. The program utilizes the java.util library for handling user input and generating random numbers.

currentList: A private static List of type string that stores the current to-do list.
doneList: A private static List of type string that stores the list of completed tasks.

Methods Used -

1. public static void main(String[] args)
Description: The main entry point of the program.
Parameters:
args: An array of command-line arguments (not used in this program).

2. public static int menu()
Description: Displays the main menu and prompts the user to enter their choice.
Returns:
int: The user's menu choice.

3. public static void showList()
Description: Displays the current to-do list.
Output: The current to-do list is printed to the console.

4. public static void addItem()
Description: Adds an item to the current to-do list.
Input: The user is prompted to enter an item.

5. public static void removeItem()
Description: Removes an item from the current to-do list.
Input: The user is prompted to enter the index of the item to be removed.

6. public static void markdone()
Description: Marks a task as done by moving it from the current to-do list to the done list.
Input: The user is prompted to enter the index of the completed task.
Output: The completed task is moved to the done list.

7. public static void showdone()
Description: Displays the list of completed tasks (done list).
Output: The list of completed tasks is printed to the console.

8. public static void solve()
Description: Plays a game of Rock Paper Scissors with the user.
Input: The user is prompted to enter their choice (0 for Rock, 1 for Paper, 2 for Scissors).
Output: The user's choice and the computer's random choice are displayed, and the winner is determined.


