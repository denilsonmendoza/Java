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
public class e16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   
        Scanner sc = new Scanner(System.in);
        
        float TASA = (float) 0.025;
        float capital = (float) 0;
        float interes = (float) 0;
        
        System.out.println("Ingresa el capital:");
        capital = Float.valueOf(sc.next());
        interes = (capital * TASA) *12;
        System.out.println("Tu interes es de:." + interes);
        
    }
    
}
