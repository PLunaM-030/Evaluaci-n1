/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_13_if;

import java.util.Scanner;

/**
 *
 * @author pawlu
 */
public class EVA1_13_if {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        Scanner input = new Scanner (System.in);
        int edad;
        
        System.out.println("Sois un nene, o ya tenes edad de tomar?, decime tu edad: ");
        Thread.sleep(1000);
        edad = input.nextInt();
        if( edad >= 18){
            Thread.sleep(2000);
            System.out.println("Vale, vale.. pues espero sea verdad");
        Thread.sleep(1200);
            System.out.println("Bien, podes llevarte alcohol. Sin excesos!");}
        else{
          System.out.println("Intentas acaso tomar sin la edad apropiada?..");
          Thread.sleep(2000);
          System.out.println("Fuera!");}
}   
    }