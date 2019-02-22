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
public class e12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        float DESCUENTO =(float) 0.20;
        float sueldo = 0;
        
        System.out.println("Ingresa su sueldo actual:");
        sueldo = Float.valueOf(sc.next());
        System.out.println("su nuevo sueldo es: "+ (sueldo - (sueldo * DESCUENTO)));
    }
    
}
