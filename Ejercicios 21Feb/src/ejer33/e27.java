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
public class e27 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner sc = new Scanner(System.in);
        
        int año_actual = 0;
        int año_nacimiento = 0;
        
        System.out.println("ingrese su anio de nacimiento");
        año_nacimiento=Integer.valueOf(sc.next());
        
        System.out.println("ingrese el año actual");
        año_actual=Integer.valueOf(sc.next());
        
        
        System.out.println("su edad exacta es:."+(año_actual - año_nacimiento));
    }
    
}
