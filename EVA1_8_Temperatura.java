/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_8_temperatura;

import java.util.Scanner;

/**
 *
 * @author pawlu
 */
import java.util.Scanner;
public class EVA1_8_Temperatura {
        private static Scanner input = new Scanner(System.in);


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double fahrenheit,celsius;
        Scanner input = new Scanner(System.in);
        System.out.println("Vale, danos un valor para Fahrenheit, necesitamos Celsius!");
        fahrenheit = input.nextDouble();
        //operation
        celsius = ((fahrenheit-32)*5)/9;
        System.out.println("Woah, eso en celsius parece ser: " + celsius + " grados");       
    /**
     * @param args the command line arguments
     */

    }
    
}
