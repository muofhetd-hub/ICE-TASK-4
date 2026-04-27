/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.st10538230.ice_task4;

/**
 *
 * @author Admin
 */
import javax.swing.JOptionPane; // Import JOptionPane for GUI input/output

public class ICE_Task4 {

    public static void main(String[] args) {
        // Prompt user for first number
        String firstInput = JOptionPane.showInputDialog("Enter the first number:");
        // Convert input to integer
        int num1 = Integer.parseInt(firstInput);

        // Prompt user for second number
        String secondInput = JOptionPane.showInputDialog("Enter the second number:");
        // Convert input to integer
        int num2 = Integer.parseInt(secondInput);

        // Calculate the sum
        int sum = num1 + num2;

        // Display the result in a message box
        JOptionPane.showMessageDialog(null, "The sum of " + num1 + " and " + num2 + " is: " + sum);
    }
}
