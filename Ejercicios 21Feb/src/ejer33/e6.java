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
public class e6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner dato = new Scanner(System.in);
        float AUMENTO = (float) 0.08;
        float DESCUENTO = (float) 0.025;
        float sueldo = (float) 0;
        float aumento_sueldo = (float) 0;
        float descuento_sueldo = (float) 0;
        
        System.out.println("Ingresa su sueldo:.");
        sueldo = Float.valueOf(dato.next());
        aumento_sueldo = sueldo * AUMENTO;
        descuento_sueldo = sueldo * DESCUENTO;
        System.out.println("su descuento es: "+ (descuento_sueldo));
        System.out.println("su aumento es:" + (aumento_sueldo));
        System.out.println("su sueldo actual:." + ((sueldo -descuento_sueldo)+ aumento_sueldo));
        
    }
    
}
