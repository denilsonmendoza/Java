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
public class e15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int anios = 0;
        int mes = 0;
        int edad = 0;
        System.out.println("Ingresa los años ");
        anios = Integer.valueOf(sc.next());
        System.out.println("Ingresa los meses ");
        mes = Integer.valueOf(sc.next());
        edad = (anios * 12) + mes;
        System.out.println("tu edad en meses es:."+ edad);
        
    }
    
}
