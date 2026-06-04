/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q6;

public class Lab04Main {

    public static void main(String[] args) {

        StaffMember.showSystemName();

        UniversityPolicy.showPolicyHeader();

        Lecturer lecturer1 =
                new Lecturer(
                        "Kamal Perera",
                        "L001",
                        "IT",
                        3,
                        50000
                );

        Lecturer lecturer2 =
                new Lecturer(
                        "Sunil Fernando",
                        "L002",
                        "Computer Science",
                        2,
                        60000
                );

        LabAssistant assistant =
                new LabAssistant(
                        "Nimal Silva",
                        "A001",
                        "IT",
                        80,
                        1500
                );

        lecturer1.changeDepartment("Software Engineering");

        System.out.println();
        lecturer1.displayLecturerDetails();

        System.out.println();
        lecturer2.displayLecturerDetails();

        System.out.println();
        assistant.displayLabAssistantDetails();

        double payment1 = lecturer1.calculateMonthlyPayment();
        double payment2 = lecturer2.calculateMonthlyPayment();
        double payment3 = assistant.calculateMonthlyPayment();

        System.out.println();
        System.out.println("Lecturer 1 Monthly Payment: " + payment1);
        System.out.println("Lecturer 2 Monthly Payment: " + payment2);
        System.out.println("Lab Assistant Monthly Payment: " + payment3);

        double totalMonthlyPayment = payment1 + payment2 + payment3;

        System.out.println();
        System.out.println("Total Monthly Payment: " + totalMonthlyPayment);

        System.out.println("Total Staff Objects: "
                + StaffMember.getStaffCount());

        System.out.println();
        lecturer1.showCommonNotice();
        lecturer2.showCommonNotice();
        assistant.showCommonNotice();
    }
}