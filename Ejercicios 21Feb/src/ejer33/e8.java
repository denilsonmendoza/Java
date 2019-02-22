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
public class e8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
 
        Scanner dato = new Scanner(System.in);
        float MONEDA1 = (float) 0.05;
        float MONEDA2 = (float) 0.1;
        float MONEDA3 = (float) 0.12;
        float MONEDA4 = (float) 0.25;
        float MONEDA5 = (float) 0.50;
        float MONEDA6 = (float) 1;
        float mone1 = (float) 0;
        float mone2 = (float) 0;
        float mone3 = (float) 0;
        float mone4 = (float) 0;
        float mone5 = (float) 0;
        float mone6 = (float) 0;
        float total = (float) 0;
        System.out.println("Ingrese la cantidad de monedas de 0.05:");
        mone1 = Float.valueOf(dato.next());
        System.out.println("Ingrese la cantidad de monedas de 0.10:");
        mone2 = Float.valueOf(dato.next());
        System.out.println("Ingrese la cantidad de monedas de 0.12:");
        mone3 = Float.valueOf(dato.next());
        System.out.println("Ingrese la cantidad de monedas de 0.25:");
        mone4 = Float.valueOf(dato.next());
        System.out.println("Ingrese la cantidad de monedas de 0.5:");
        mone5 = Float.valueOf(dato.next());
        System.out.println("Ingrese la cantidad de monedas de 1:");
        mone6 = Float.valueOf(dato.next());
        total = (mone1 * MONEDA1) + (mone2 * MONEDA2) + (mone3 * MONEDA3) + (mone4 * MONEDA4) + (mone5 * MONEDA5) + (mone6 * MONEDA6); 
        System.out.println("El Total es: "+ total);
    }
    
}
