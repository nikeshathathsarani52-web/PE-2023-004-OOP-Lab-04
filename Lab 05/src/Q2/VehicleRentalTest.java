/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q2;

public class VehicleRentalTest {

    public static void main(String[] args) {

        Vehicle vehicle1 = new Car("CAR101", "Toyota", 5, 5000);
        Vehicle vehicle2 = new Bike("BIKE202", "Honda", 10, 300);

        System.out.println("Car Details");
        vehicle1.displayVehicleInfo();
        System.out.println("Rental Cost: " +
                vehicle1.calculateRentalCost());

        System.out.println();

        System.out.println("Bike Details");
        vehicle2.displayVehicleInfo();
        System.out.println("Rental Cost: " +
                vehicle2.calculateRentalCost());

        // Runtime polymorphism because the overridden method is selected based on the actual object type at runtime.
    }
}