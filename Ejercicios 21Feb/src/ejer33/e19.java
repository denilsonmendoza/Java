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
public class e19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner dato = new Scanner(System.in);
        int no1 = 0;
        int no2 = 0;
        int no3 = 0;
        int n_final = 0;
        
        System.out.println("Ingresa la primera nota:.");
        no1 = Integer.valueOf(dato.next());
        System.out.println("Ingresa la segunda nota:.");
        no2 = Integer.valueOf(dato.next());
        System.out.println("Ingresa la tercera nota:.");
        no3 = Integer.valueOf(dato.next());
        
        System.out.println("Tu nota final es:"+(no1 + no2 + no3));
    }
    
}
