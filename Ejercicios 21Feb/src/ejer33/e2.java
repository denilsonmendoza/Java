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
public class e2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner dato = new Scanner(System.in);
        double PRECIO_KILOMETROS = 10.5;
        int km = 0;
        
        System.out.println("Ingres la cantidad de km:.");
        km = Integer.valueOf(dato.next());
        System.out.println("el total a pagar es:." + (km * PRECIO_KILOMETROS));
    }
    
}
