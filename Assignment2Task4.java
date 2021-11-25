/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package assignment2task4;
import java.util.Scanner;

/**
 *
 * @author ramananthirugnanasundaram
 */
public class Assignment2Task4 {

    /**
     * @param args the command line arguments
     */
        // TODO code application logic here

    static char toLetterScore(double digitScore) {

        char letterScore = ' ';

        // converts the digtScore to letterScore based off of a table
        if ((digitScore >= 90)&&(digitScore <=100)){
            letterScore = 'A';}
        else if ((digitScore >= 80)&&(digitScore <90)){
            letterScore = 'B';}
        else if ((digitScore >= 70)&&(digitScore <80)){
            letterScore = 'C';}
        else if ((digitScore >= 60)&&(digitScore <70)){
            letterScore = 'D';}
        else if ((digitScore < 60)){
            letterScore = 'F';}

        return letterScore;

    }

    private static void printMessage(char letterScore){

        String message = "";

        if (toLetterScore(letterScore) == 'A'){
            message = "Excellent";}
        else if ((toLetterScore(letterScore) == 'B')||(toLetterScore(letterScore) == 'C')){
            message = "Well Done";}
        else if (toLetterScore(letterScore) == 'D') {
            message = "Passed";}
        else if (toLetterScore(letterScore) == 'F'){
            message = "Better Try Again";}

        System.out.println(message);
    }

    private static void printMessage2(char letterScore){

        String message;

        switch (letterScore) {
            case 'A' -> {
                message = "Excellent";
                System.out.println(message);
            }
            case 'B', 'C' -> {
                message = "Well Done";
                System.out.println(message);
            }
            case 'D' -> {
                message = "Passed";
                System.out.println(message);
            }
            case 'F' -> {
                message = "Better Try Again";
                System.out.println(message);
            }
        }


    }


    public static void main(String[] args) {
	// returns the letter score
        Scanner scan = new Scanner(System.in);
        System.out.println("Insert score : ");
        int x = scan.nextInt();


        char letterScore = toLetterScore(x);

        printMessage2(letterScore);
        System.out.println("Your letter score is : " + letterScore);
    }


}