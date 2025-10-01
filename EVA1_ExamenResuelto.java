/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg25550696_exa1;

import java.util.Scanner;

/**
 *
 * @author pawlu
 */
public class Main {
    final static String PIN = "1234";
    final static String acn1 = "1";
    final static String acn2 = "2";
    final static String acn3 = "3";
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        Scanner input = new Scanner (System.in);
        String pinn,acn;
        int saldo, ret, dep, saldoF, saldoD;
        saldo = 5000;
        System.out.println("Bienvenido al Instituto Nacional del BANCO AZTECA");
        Thread.sleep(1100);
        System.out.println("Para realizar acciones, introduzca su PIN de seguridad:");
        pinn = input.nextLine();
        if (pinn.equals(PIN)){
          Thread.sleep(1000); System.out.println("A continuacion seleccione una accion:");
          Thread.sleep(1000); System.out.println("1~Consultar saldo");
          Thread.sleep(1000); System.out.println("2~Retiro de dinero");
          Thread.sleep(1000); System.out.println("3~Deposito a cuenta");
          acn = input.nextLine();
             if(acn.equals(acn1)){
                    System.out.println("A continuacion su saldo: $" + saldo);
                    System.out.println("Gracias por usar nuestros servicios. Vuelva a ingresar sus datos si desea realizar otra accion");}
             
             else if(acn.equals(acn2)){
                   System.out.println("A continuacion va a realizar un retiro, ingrese la cantidad que desea: ");
                   ret = input.nextInt();
                   saldoF = saldo - ret;
                         if(saldoF < 0){System.out.println("Saldo insuficiente, reinicie accion.");}
                         else if(saldoF >= 0 && saldoF < saldo){System.out.println("Accion hecha,saldo final: " + saldoF);}
                         else{System.out.println("Accion invalida...");}
                         }
             else if(acn.equals(acn3)){
                 System.out.println("A continuacion introduzca la cantidad a depositar: ");
                 dep = input.nextInt();
                 saldoD = saldo + dep;
                        if(dep >= 0)
                            System.out.println("Proceso exitoso, monto final de cuenta: " + saldoD);
                        else{System.out.println("Monto no valido, repita proceso.");}
                        }
                      }
             else{
                System.out.println("PIN no encontrado.");}
        } 
    }