/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package assignment2task2;
import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author ramananthirugnanasundaram
 */
public class Assignment2Task2 {

    /**
     * @param args the command line arguments
     */
   static double calcAverageScore (double numb, double divisor) {
        return numb/divisor;
    }

    public static void main(String[] args) {
     //Creates scanner and random
       Scanner scan = new Scanner(System.in);
        System.out.println("How many scores do you want?: ");
        int x = scan.nextInt();
        System.out.println(x + " scores generated");
        Random random = new Random();
        int i = 0;
        int max = 100;
        double numb = 0;
        double divisor = 0;


        System.out.println("-------");
        System.out.println("Scores 40 or over:");


        while (i<x){ //While i is less than x, the loop continues

            double score = random.nextInt(max);  //Generates a random number for every time the loop is executed
            i++;

            if (score >= 40){ // if score is >= to 40, add score to numb, and increments divisor by 1
                numb = score + numb;
                divisor++;
                System.out.println(score);}
        }
        double average = calcAverageScore(numb, divisor);
        System.out.println("-------");

        System.out.println("Average: " + average);


    }


}



