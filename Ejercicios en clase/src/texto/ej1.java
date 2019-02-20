/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package texto;

import java.util.Scanner;

/**
 *
 * @author denilson
 */
public class ej1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner entrada = new Scanner(System.in);
        float numero = 0;
        
        System.out.println("Ingrese un numero entre el 0 y 9,999:.");
        numero = Float.valueOf(entrada.next());
        
        System.out.println("---------------------------------------------");
        
        if (numero > 0 && numero <10 ){
            System.out.println("el numero ingresado tiene una cifra");
        }
        if (numero >= 10 && numero < 100){
            System.out.println("el numero ingresado tiene dos cifras");
        }
        if (numero >=100 && numero <= 999){
            System.out.println("el numero tiene tres cifras");
        }
        else if (numero >=1000 && numero <= 9999){
            System.out.println("el numero tiene cuatro cifras");
        }
        if (numero >= 10000){
            System.out.println("opcion no valida");
            }
    }  
    
}
