/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_10_captur4;

import java.util.Scanner;

/**
 *
 * @author pawlu
 */
public class EVA1_10_captur4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        
        Scanner input = new Scanner (System.in);
        
        //Velocidad = distancia / tiempo
    double velocidad,tiempo,distancia;
   
    System.out.println("GOOD, so, today we'll be needing some physics concepts to get 'velocidad'', which is speed, right?");
    System.out.println("Therefore... give me values for: Velocidad, Distancia and Tiempo, we'll refer to them in spanish though.");
    Thread.sleep(2000);
    System.out.println("Now, give me a value for Distance: ");
    distancia = input.nextDouble();
        
    System.out.println(distancia + " meters?" + "..Ah, so we have this distance, now we just got to have some TIEMPO, come on, give me a value!: ");
    tiempo = input.nextDouble();

    System.out.println("GREAT, we have " + tiempo + " seconds now!");
    System.out.println("There we go.. we have all the required data. We just have to.. divide " + distancia + " by " + tiempo);
    System.out.println("working... This won't take long!");
        Thread.sleep(2000);
    velocidad = tiempo / distancia;
    System.out.print("There we go!   ");
        Thread.sleep(1000);
     System.out.println(" we got ourselves  " + velocidad + " m/s");
     

    }
    
}
