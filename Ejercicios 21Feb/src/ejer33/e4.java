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
public class e4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        Scanner sc = new Scanner(System.in);
        int T_DOLARES = 2150;
        int T_EUROS = 145;
        float dinero = (float)  0;
        
        System.out.println("Ingresa la cantidad a convertir:+");
        dinero = Float.valueOf(sc.next());
        
        System.out.println("La conversion a Dolares es:."+(dinero * T_DOLARES));
        System.out.println("La conversion a Euros es:."+(dinero * T_EUROS));
    }
    
}
