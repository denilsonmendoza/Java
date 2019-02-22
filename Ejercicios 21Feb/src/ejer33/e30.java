/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer33;

import java.util.Scanner;

/**
 *
 * @author denilson
 */
public class e30 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int numero = 0;
        
        
        System.out.println("ingrese el numero:.");
        numero = sc.nextInt();
        
        float resultado = (float) Math.sqrt(numero);
        System.out.println("la raiz cuadrada de:."+numero+"es:."+resultado);
       
    }
}
