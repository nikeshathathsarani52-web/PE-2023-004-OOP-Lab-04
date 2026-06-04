/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q1;

public class DeliveryChargeTest {

    public static void main(String[] args) {

        DeliveryChargeCalculator calculator = new DeliveryChargeCalculator();

        System.out.println("Base Charge: " +
                calculator.calculateCharge(1000));

        System.out.println("Base + Distance Charge: " +
                calculator.calculateCharge(1000, 5));

        System.out.println("Base + Distance + Weight Charge: " +
                calculator.calculateCharge(1000, 5, 10));

        System.out.println("Express Delivery Charge: " +
                calculator.calculateCharge(1000, true));

        // Compile-time polymorphism because Java selects the correct overloaded method during compilation.
    }
}