/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q5;

public class Lab04Main {

    public static void main(String[] args) {

        StaffMember.showSystemName();

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

        lecturer1.displayLecturerDetails();

        System.out.println();

        lecturer2.displayLecturerDetails();

        System.out.println();

        assistant.displayLabAssistantDetails();

        System.out.println();
        System.out.println("Total Staff Objects: "
                + StaffMember.getStaffCount());
    }
}