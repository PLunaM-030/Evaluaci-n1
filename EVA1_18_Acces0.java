/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_18_acces0;

import java.util.Scanner;
/**
 *
 * @author pawlu
 */
public class EVA1_18_Acces0 {
    final static String USUARIO = "honeybooboo";
    final static String PSW = "ICRD";

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        String us,pw;
        Scanner input = new Scanner (System.in);
        System.out.println("Yo, yo, yo! It seems you got some  user and password, yo. Give me that to access!");
        System.out.println("Type yo username: ");
        us = input.nextLine();
        System.out.println("Yo, welcome Miss/Mr " + us);
        System.out.println("We need thus password i'm telling ya, type here: ");
        pw = input.nextLine();
        
        if( us.equals(USUARIO)) {
            System.out.println("Yo what's good Miss Booboo, Welcome to the system.");
            if (pw.equals(PSW)){
                Thread.sleep(1200);
            System.out.println("Ayy, it's really you Miss Boo, we glad you back in the house Miss.");}
            else{
                Thread.sleep(2000);
            System.out.println("Nahh.. this ain't no Miss boo, get outta here.");}
        }
        else {
            System.out.println("Ay, that ain't no valid user, try again, yo.");
        }
        
    }
    
}