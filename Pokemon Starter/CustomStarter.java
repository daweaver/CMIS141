/* File name: CustomStarter.java
*  Author:  Devere Weaver
*  Date:  16 NOV 2019
*  Purpose: Let the user create their dream starter Pokemon.
*/

import java.util.Scanner;

public class CustomStarter {
    public static void main(String[] args) {
        int customize = 0;
        int hitPoints, attack, specialAttack, defense, specialDefense, speed, level;
        String pokemonName = " ";
        char giveNickname = ' ';
        String nickname = " ";

        // Create scanner object to read user input
        Scanner myScanner = new Scanner(System.in);

        // Prompt user for customization option
        System.out.println("Welcome to the wonderful world of Pokemon.");
        System.out.println("My name is Prof. Weaver, the Pokemon professor they call me.");
        System.out.println("\nHow would you like to customize your starter Pokemon?");
        System.out.println("1. Choose your mon and customize all of its stats.\n"
                + "2. Choose your mon with random stats.\n" + "3. Choose a random mon with random stats.\n");
        System.out.print("Selection: ");
        customize = myScanner.nextInt();

        switch (customize) {
        case 1:
            // Get the mon and its stats from user input
            System.out.print("Enter the Pokemon you want: ");
            pokemonName = myScanner.next();
            System.out.print("Enter its HP: ");
            hitPoints = myScanner.nextInt();
            System.out.print("Enter its Attack: ");
            attack = myScanner.nextInt();
            System.out.print("Enter its Special Attack: ");
            specialAttack = myScanner.nextInt();
            System.out.print("Enter its Defense: ");
            defense = myScanner.nextInt();
            System.out.print("Enter its Special Defense: ");
            specialDefense = myScanner.nextInt();
            System.out.print("Enter its Speed: ");
            speed = myScanner.nextInt();
            System.out.print("Enter desired level: ");
            level = myScanner.nextInt();

            // Create a new Starter object with the user input using constructor 1
            Starter CustomStarter = new Starter(pokemonName, hitPoints, attack, specialAttack, defense, specialDefense,
                    speed, level);

            // Prompt user for nickname
            System.out.print("Would you like to give your mon a nickname? (y/N) ");
            giveNickname = myScanner.next().charAt(0);
            if (giveNickname == 'y' || giveNickname == 'Y') {
                System.out.print("Enter it's nickname: ");
                nickname = myScanner.next();
                CustomStarter.setNickname(nickname);
            }
            System.out.println("\nLet's see what you got!\n");
            System.out.println(CustomStarter.getSummary());
            break;
        case 2:
            // Get the users mon and randomize the stats
            System.out.print("Enter the Pokemon you want: ");
            pokemonName = myScanner.next();

            // Create starter with user input using constrcutor 2
            Starter SemiCustomStarter = new Starter(pokemonName);

            // Create a new Starter object with the user input u System.out.println("Would
            // you like to give your mon a nickname? (y/N)");

            // Prompt user for nickname
            System.out.print("Would you like to give your mon a nickname? (y/N) ");
            giveNickname = myScanner.next().charAt(0);
            if (giveNickname == 'y' || giveNickname == 'Y') {
                System.out.print("Enter it's nickname: ");
                nickname = myScanner.next();
                SemiCustomStarter.setNickname(nickname);
            }
            System.out.println("\nLet's see what you got!\n");
            System.out.println(SemiCustomStarter.getSummary());
            break;
        case 3:
            // You're getting a Magikarp!!
            System.out.println("So you want to leave it up to chance?....Okay...");
            Starter randomStarter = new Starter();

            // Prompt user for nickname
            System.out.println("\nWould you like to give your mon a nickname? (y/N) ");
            giveNickname = myScanner.next().charAt(0);
            if (giveNickname == 'y' || giveNickname == 'Y') {
                System.out.print("Enter it's nickname: ");
                nickname = myScanner.next();
                randomStarter.setNickname(nickname);
            }
            System.out.println("\nLet's see what you got!\n");
            System.out.println(randomStarter.getSummary());
            break;
        default:
            System.out.println("I'm sorry, I didn't recognize that input.");
            System.out.println("Please try again and choose 1, 2, or 3.");
            break;

        }
    }
}