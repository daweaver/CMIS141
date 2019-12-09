/* File name: Fibonacci.java
*  Author: Devere Weaver
*  Date: 10 NOV 2019
*  Purpose: Display the Fibonacci sequence up until the largest 
*  number that will fit inside of an int object. 
*/

public class Fibonacci {
    public static void main(String[] args){
        // Declare 3 ints 
        int previous = 0;
        int current = 1;
        int next = previous + current; 

        // While loop to calculate each number in the sequence and print them 
        while (current > 0){
            next = previous + current; 
            System.out.println(current);
            previous = current;
            current = next;
        }

        System.out.println("The largest Fibanacci number that first in an int is " + 
                            previous);
    }
}