/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_2_sw1tch;

import java.util.Scanner;

/**
 *
 * @author pawlu
 */
public class EVA2_2_Sw1tch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int opc;
        
        Scanner captu = new Scanner(System.in);
        System.out.println("Bienvenido, elija su siguiente accion");
        System.out.println("1. Consultar saldo");
        System.out.println("2. Retiro de saldo");
        System.out.println("3. Deposito de saldo");
         opc = captu.nextInt();
         
         switch(opc){
             case 1:
                 System.out.println("Has seleccionado imprimir saldo");
                 break; //break line and finish command!
             case 2:
                 System.out.println("Has seleccionado retiro de saldo");
                 break;
             case 3:
                 System.out.println("Has seleccionado deposito de saldo");
                 break;
             default:
                 System.out.println("!Value not found");
                    }         
         
         
         
        }
    }
