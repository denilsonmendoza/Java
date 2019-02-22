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
public class e20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int numero_hombre = 0;
        int numero_mujeres = 0;
        int total = 0;
        
        System.out.println("Ingresa el numero de hombres:");
        numero_hombre = Integer.valueOf(sc.next());
        System.out.println("Ingresa el numero de mujeres:");
        numero_mujeres = Integer.valueOf(sc.next());
        
        total = numero_hombre + numero_mujeres;
        
        System.out.println("El porcentaje total de mujeres es:" + ((numero_mujeres *100) / total));
        System.out.println("El porcentaje total de hombres es:" + ((numero_hombre *100) / total));
    }
    
}
