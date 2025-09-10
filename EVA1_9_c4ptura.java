/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_9_c4ptura;

import java.util.Scanner;

/**
 *
 * @author pawlu
 */
public class EVA1_9_c4ptura {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         String nombre;
         int edad;
         double promedio;
        System.out.println("Dame tu nombre..");
        
        Scanner input = new Scanner(System.in);
        
        nombre = input.nextLine(); //HERE GOES YOUR NAME
        System.out.println("Vale, parece que te llamas.." + nombre);
        
        System.out.println("Ahora, necesito tu edad.");
         edad = input.nextInt();//HERE GOES YOUR AGE
         
        System.out.println("Y tienes.. " + edad + " de edad?, bien. Dime tu promedio de preparatoria");
        promedio = input.nextDouble();
        
        System.out.println("Excelente.. te llamas " + nombre + " ,tu edad es " + edad + " Y tu promedio " + promedio);
        System.out.println("Bueno, eso es todo " +  nombre);
        
    }
    
}
