/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_14_descu3nto;

import java.util.Scanner;

/**
 *
 * @author pawlu
 */
public class EVA1_14_DESCU3NTO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                        Scanner input = new Scanner (System.in);

        double Monto, Descuento;
        System.out.println("Hey!, so you made a purchase, huh? thanks lots, how much was the total?");
        Monto = input.nextDouble();
        Descuento = Monto - Monto * 0.15;
        if (Monto > 1000) {
            System.out.println("Oh, looks like you bought yourself items worth 1000$+, let me cheer you...");
            System.out.println("Because");
            System.out.println("You just got a discount!");
            System.out.println(Descuento + " is your new total, Cheers!");}
        else{
            System.out.println("Ohh.. nice!, that's all then, thanks for your purchase!..");}
    }
    
}
