/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q3;

public class Lab04Main {

    public static void main(String[] args) {

        Lecturer lecturer =
                new Lecturer("Kamal Perera",
                        "L001",
                        "IT",
                        3,
                        50000);

        LabAssistant assistant =
                new LabAssistant("Nimal Silva",
                        "A001",
                        "IT",
                        80,
                        1500);

        lecturer.displayLecturerDetails();

        System.out.println();

        assistant.displayLabAssistantDetails();
    }
}
