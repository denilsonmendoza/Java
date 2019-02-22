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
public class e5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float DESCUENTO =(float) 0.35;
        float precio = (float) 0;
        System.out.println("Ingrese el precio del medicamento:");
        precio = Integer.valueOf(sc.next());
        System.out.println("Tu descuento es: " + (precio * DESCUENTO));
        System.out.println("Tu pago es: " + (precio - (precio * DESCUENTO)));
    }
    
}
