/** File name: Test2.java
 *  Author: Devere A. Weaver
 *  Date: 8 DEC 2019
 *  Purpose: Test the state object. 
 */


import java.util.Scanner;


public class Test2 {
    public static void main(String[] args) {
        String stateName = new String();
        String summary = "";
        Scanner myScanner = new Scanner(System.in);
        int stateCount = 0;     // Keep track of user input for summary display purposes

        while (true) {
            // Prompt user for state name
            System.out.println("Enter a state: ");
            stateName = myScanner.nextLine();

            // Mutate stateName for searching purposes
            stateName = stateName.toLowerCase();
            stateName = stateName.replaceAll("\\s", "");    // Repalce white spaces

            if (stateName.equals("none"))
                break;

            // Create a state object using user input
            State myState = new State(stateName);

            // Display information to user
            myState.getStateInfo();

            // Add myState object information to summary 
            summary += "State " + ++stateCount + ": " + myState.getName() + ", Bird: " + myState.getBird() + ", Flower: "
                    + myState.getFlower() + "\n------------------------------------------------------------------------\n";
        }
        System.out.println("\n**** Thank you ****");
        System.out.println("A summary report for each State, Bird, and Flower is:\n");
        System.out.println(summary);
        System.out.println("Please visit our site again!");
    }
}