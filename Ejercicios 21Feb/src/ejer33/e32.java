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
public class e32 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        
        float numero = 0;
        double PULGADAS = (float) 0.39737;
        double total = 0;
        
        System.out.println("ingrese el dato que desea convertir:.");
        numero = Float.valueOf(sc.next());
        
        total = numero * PULGADAS;
        
        System.out.println("el resultado es de:."+total);
    }
    
}
