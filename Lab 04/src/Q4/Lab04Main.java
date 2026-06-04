/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q4;

public class Lab04Main {

    public static void main(String[] args) {

        Lecturer lecturer =
                new Lecturer(
                        "Kamal Perera",
                        "L001",
                        "IT",
                        3,
                        50000
                );

        LabAssistant assistant =
                new LabAssistant(
                        "Nimal Silva",
                        "A001",
                        "Computer Science",
                        80,
                        1500
                );

        UniversityPolicy.showPolicyHeader();

        System.out.println("University Name: "
                + UniversityPolicy.UNIVERSITY_NAME);

        System.out.println();

        lecturer.displayLecturerDetails();

        System.out.println("Monthly Payment: "
                + lecturer.calculateMonthlyPayment());

        System.out.println("Bonus: "
                + UniversityPolicy.calculateBonus(
                        lecturer.calculateMonthlyPayment()));

        System.out.println();

        assistant.displayLabAssistantDetails();

        System.out.println("Monthly Payment: "
                + assistant.calculateMonthlyPayment());

        System.out.println("Bonus: "
                + UniversityPolicy.calculateBonus(
                        assistant.calculateMonthlyPayment()));
    }
}