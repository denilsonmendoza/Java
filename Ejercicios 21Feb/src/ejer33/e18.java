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
public class e18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        float TASA = (float) 0.15;
        float valorcompra = 0;
        float descuento = 0;
        
        System.out.println("Ingrese valor de la compra:");
        valorcompra = Float.valueOf(sc.next());
        
        descuento = valorcompra * TASA;
        System.out.println("Tu descuento es:"+ descuento);
        
        System.out.println("Tu total a pagar es:" + (valorcompra - descuento));
        
        
    }
    
}
