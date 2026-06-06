/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q1;

/**
 *
 * @author hashini
 */
public class StudentAverageTest {
     public static void main(String[] args) {

        StudentAverageCalculator calculator =
                new StudentAverageCalculator(500, 0);

        try {
// Exception occurs because division by zero is not allowed.
            int average = calculator.calculateAverage();

            System.out.println("Average = " + average);

        } catch (ArithmeticException e) {

            System.out.println("Error: Number of students cannot be zero.");

        } finally {

            System.out.println("Average calculation completed.");

        }

        System.out.println("Program continues...");
    }
    
}
