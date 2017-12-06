import java.util.Scanner;
import java.util.*;

public class OddorEven {
    public static void main(String[] args) {

        //Start playing the game
        Scanner input = new Scanner(System.in);
        System.out.println("Let's play a game called Odds and Evens");
        System.out.println("What is your name?");
        String name = input.nextLine();
        System.out.println("Hello " + name + ", which do you choose? (O)dds or (E)vens?");
        String choice = input.next();

        //This is the result of your actions
        if (choice.equals("O") || choice.equals("o")) {
            System.out.println(name + " has picked odds! The computer will be evens.");
            System.out.println("-----------------------------------------------------------------------");
        }
        else if (choice.equals("E") || choice.equals("e")) {
            System.out.println(name + " has picked evens! The computer will be odds.");
            System.out.println("-----------------------------------------------------------------------");
        }
        else {
            System.out.println("Your choices are odd or even. Try again");
            System.out.println("-----------------------------------------------------------------------");
        }

        //How many fingers are you playing?
        System.out.println("How many fingers do you print out? ");
        int fingers = input.nextInt();
        fingers %= 5;

        //The computer can play as many fingers as it wants as long as its between 1 and 5
        Random rand = new Random();
        int computer = rand.nextInt(6);
        System.out.println("The computer plays " + computer + " fingers");
        System.out.println("-----------------------------------------------------------------------");

        //Take the sum
        int sum = fingers + computer;
        System.out.println(fingers + " + " + computer + " = " + sum);

        //Determine whether the sum is odd or even
        if(sum % 2 == 1){
            System.out.println("The sum is ...odd");
        }
        else{
            System.out.println("The sum is ...even");
        }

        //Who won?
        if(sum % 2 == 0){
            if((choice.equals("e")) || (choice.equals("E"))){
                System.out.println("That means " + name + " wins.");
            }
            else{
                System.out.println("That means the computer wins.");
            }
        }
        else{
            if((choice.equals("o")) || (choice.equals("O"))){
                System.out.println("That means " + name + " wins.");
            }
            else{
                System.out.println("That means the computer wins.");
            }
        }
    }
}
