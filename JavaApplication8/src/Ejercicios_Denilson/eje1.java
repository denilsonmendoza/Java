/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios_Denilson;

import java.util.Scanner;

/**
 *
 * @author denilson
 */
public class eje1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          Scanner sc = new Scanner(System.in);
        int numero = 0;
        
        
        System.out.print("Ingresa un numero:.");
        numero = Integer.valueOf(sc.next());
        
        if(numero >= 0 && numero <=9999){
            if(numero >= 0 && numero <= 9){
                System.out.println("El numero ingresado tiene 1 cifras");
            }
            else if(numero >= 10 && numero <=99){
                System.out.println("El numero ingresado tiene 2 cifras");
            }
            else if(numero >= 100 && numero <=999){
                System.out.println("El numero ingresado tiene 3 cifras");
            }
            else if(numero >= 1000 && numero <=9999){
                System.out.println("El numero ingresado tiene 4 cifras");
            }
            
        }else{
            System.out.println("Opcion No valida");
        }
    }
    
}
