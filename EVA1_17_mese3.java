/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_17_mese3;

import java.util.Scanner;

/**
 *
 * @author pawlu
 */
public class EVA1_17_mese3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Hey person, i need'ya help. Gimme a good number from 1 to 12. You gotta be clever and do as i said, very please.");
        int mes;
        mes = input.nextInt();
        if(mes == 1){
            System.out.println("First month, huh?, tough start from JANUARY");
        }
        else if(mes == 2)
        {System.out.println("Second is our lovely month, February.. ");}
         else if(mes == 3)
        {System.out.println("Hey, this one is nice, March it is.");}
         else if(mes == 4)
        {System.out.println("Good.. simply increible, we are on April.");}
         else if(mes == 5)
        {System.out.println("Ah well, may is nice, beware of the sun.It's May");}
         else if(mes == 6)
        {System.out.println("Oh gosh, june.. here comes the sun. It's summer JUNE");}
         else if(mes == 7)
        {System.out.println("July? how soon. Well, JULY it is.");}
        else if(mes == 8)
        {System.out.println("Ah, August is not that memorable i guess, but it is AUGUST.");}
        else if(mes == 9)
        {System.out.println("September it is. Seems a bit more likeable. It usually pours day to day.. in some lucky countries.");}
        else if(mes == 10)
        {System.out.println("October?... oh man, that's even greater!, it has one of the best days. anyways. OCTOBER it is.");}
        else if(mes == 11)
        {System.out.println("November.. well, if it wasn't for some special days, it would be pretty forgettable. Nice, NOVEMBER!");}
        else if(mes == 12)
        {System.out.println("December, the end of the year.. and X-MAS.. lovely. Nice vacation, nice DECEMBER.");}
       else
            {System.out.println("Choose a number...");
             System.out.println("One.. to twelve.");}
                
    }
    
}
