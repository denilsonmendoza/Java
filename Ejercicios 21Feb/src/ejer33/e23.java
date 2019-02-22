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
public class e23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner introduzca = new Scanner (System.in);
        float numero = 0;
        float cubo = 0;
        
        

        System.out.println("Por favor ingrese el numero que desea elevar al cubo:.");
        numero = Float.valueOf(introduzca.next());
        cubo = numero*numero*numero;

        System.out.println("su numero al cubo es:." + cubo);
        
    }
}
    

