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
public class e9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        float precios = (float) 0;
        int horas = 0;
        int horas_extras = 0;
        
        System.out.println("Ingresa el precio de hora:");
        precios = Float.valueOf(sc.next());
        System.out.println("Ingresa las horas trabajadas:.");
        horas = Integer.valueOf(sc.next());
        System.out.println("Ingresa las horas extra trabajadas:.");
        horas_extras = Integer.valueOf(sc.next());
        
        System.out.println("Tu sueldo es:."+ ((precios * horas) +(precios * (horas_extras * 2))));
    }
    
}
