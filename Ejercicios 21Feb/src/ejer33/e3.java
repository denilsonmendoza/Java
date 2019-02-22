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
public class e3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner dato = new Scanner(System.in);
        double PRECIO_H = 1.5;
        int horas = 0;
        int horas_gratis = 0;
        
        System.out.println("Ingrese la cantidad de horas utilizadas:.");
        horas = Integer.valueOf(dato.next());
        
        horas_gratis = (horas / 5);
        System.out.println("Tu total a pagar es :." + (horas * PRECIO_H));
        System.out.println("por el uso de internet te damos"+ horas_gratis + " horas gratis");
        
        
    }
    
}
