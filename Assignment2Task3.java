/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package assignment2task3;
import java.util.Scanner;

/**
 *
 * @author ramananthirugnanasundaram
 */
public class Assignment2Task3 {

    /**
     * @param args the command line arguments
     */
    static double calcFutureSalary(double currentSalary, int years) {

        double salary = 0;

        if (years < 3) { //if years < 3, the rate is 0.03, and raises the salary by 3% for every year worked
            double rate = 0.03;
            double math = 0.03 * years;
            double math2 = (math * currentSalary) + currentSalary;
        salary = math2;}

        else if ((years > 3) && (years < 10)){ //if years > 3 & < 10, the rate is 0.05, and raises the salary by 5% for every year worked
            double rate = 0.05;
            double math = 0.05 * years;
            double math2 = (math * currentSalary) + currentSalary;
            salary = math2;}

        else if (years >= 10){ //if years >= 10, the rate is 0.08, and raises the salary by 8% for every year worked
            double rate = 0.08;
            double math = 0.08 * years;
            double math2 = (math * currentSalary) + currentSalary;
            salary = math2;}
        return salary;
        }





    public static void main(String[] args) {
        //returns the future salary
        Scanner scan = new Scanner(System.in);
        System.out.println("Insert current salary: ");
        int x = scan.nextInt();
        System.out.println("Insert amount of years: ");
        int y = scan.nextInt();

        double salary = calcFutureSalary(x,y);
        System.out.println("Your future salary is: " + "$" + salary);

    }
}
        
 
