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
public class e33 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        
        float libras = 0;
        double KILOGRAMOS = 2.2046;
        float total = 0;
        
     
        System.out.println("ingrese el valor que desee convertir:.");
        libras = Float.valueOf(sc.next());
        
        total = (float) (libras * KILOGRAMOS);
        System.out.println("el resultado es de :."+total);
    }
    
}
