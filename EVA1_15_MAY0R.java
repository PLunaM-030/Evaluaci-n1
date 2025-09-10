/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_15_may0r;

import java.util.Scanner;


/**
 *
 * @author pawlu
 */
public class EVA1_15_MAY0R {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int Num1,Num2;
        System.out.println("Hey!, i'd like to try out my code, could you give me.. TWO different numbers?");
        Num1 = input.nextInt();
        System.out.println("Good, starting with " + Num1 + " Huh?");
        System.out.println("Now we need a second number, hun..");
        Num2 = input.nextInt();
         if(Num1 > Num2){
             System.out.println("Excelent.. wait, the greatest number is " + Num1);}
         else{
             if(Num2 > Num1)
             System.out.println("So.. biggest number is " + Num2);
             else{ System.out.println("It's the same..");}
         }
         
    }
    
}
