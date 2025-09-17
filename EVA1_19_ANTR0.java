/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_19_antr0;
import java.util.Scanner;
/**
 *
 * @author pawlu
 */
public class EVA1_19_ANTR0 {
            final static String Respuesta1 = "Yes";
            final static String Respuesta2 = "No";
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        Scanner input = new Scanner (System.in);
        String ans;
        int edad;
         
        System.out.println("Night, fella, how old are you, huh?");
        edad = input.nextInt();
        System.out.println("Right.. well, now we gotta make sure that's true, bud.");
        System.out.println("How about an ID?.. do you have that with you?");
         Thread.sleep(1000);
        System.out.println("(You're forced to make a choice.)");
        Thread.sleep(1000);
        System.out.println("(Show the guard your ID?)");
        System.out.println("..Yes / No..");
        input.nextLine();
        ans = input.nextLine();
                
        if ( ans.equals(Respuesta1) ){
            System.out.println("(You search in your pockets and show the guard your ID)");
            System.out.println("Aha... well, that's enough then.. you're in. Enjoy the night.");}
        else{
             System.out.println("Now.. no ID, then no going in, bud. Out!");
             System.out.println("(The harsh repriment hits you low, but you reclutanly leave the place..)");}
        
    }
    
}
