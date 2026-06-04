/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q1;

public class Lab04Main {

    public static void main(String[] args) {

        Lecturer lecturer =
                new Lecturer("Kamal Perera",
                        "L001",
                        "IT",
                        3,
                        50000);

        lecturer.displayLecturerDetails();

        System.out.println("Monthly Payment: "
                + lecturer.calculateMonthlyPayment());
    }
}