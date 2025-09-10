/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_16_anidad0;

import java.util.Scanner;

/**
 *
 * @author pawlu
 */
public class EVA1_16_anidad0 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                Scanner input = new Scanner (System.in);
        int dia;
        System.out.println("Hey man, give me a number from 1-7.. i guess i can tell which day of the week it is.");
        dia = input.nextInt();
        
        if(dia == 1){
            System.out.println("It looks like it might be sunday. Day before a long week.");
        }
        else if(dia == 2)
        {System.out.println("Number 2?, i guess that's monday.. technically the second day of the week.");}
         else if(dia == 3)
        {System.out.println("Number 3, ok, so it is tuesday.");}
         else if(dia == 4)
        {System.out.println("All right, 4. It must be wednesday");}
         else if(dia == 5)
        {System.out.println("Fine, fifth day, thursday.");}
         else if(dia == 6)
        {System.out.println("Day 6!.. friday, good!");}
         else if(dia == 7)
        {System.out.println("7?.. Oh delightful, that's saturday for you.");}
         else { System.out.println("Choose a number...");
                 { System.out.println("One.. to seven.");}
            
        }
        
    }
    
}
