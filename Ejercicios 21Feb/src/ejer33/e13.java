/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer33;

import java.util.Scanner;

/**
 *
 * @author Denilson
 */
public class e13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        int numero1 = 0;
        int numero2 = 0;
        int operacion1 = 0;
        int operacion2 = 0;
        
        System.out.println("Ingresa el primer numero:");
        numero1 = Integer.valueOf(sc.next());
        System.out.println("Ingresa el segundo numero:");
        numero2 = Integer.valueOf(sc.next());
        operacion1 = (numero1 * 2) + (numero2 *numero2);
        operacion2 = ((numero1 * numero1 * numero1)+(numero2 * numero2 * numero2))/3;
        
        System.out.println("La primera operacion es: " + operacion1);
        System.out.println("La segunda operacion es: " + operacion2);
    }
    
}
