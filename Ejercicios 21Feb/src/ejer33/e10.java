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
public class e10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        float METROS_CUBICO = (float)0.5;
        float largo = 0;
        float anch = 0;
        
        System.out.println("Por favor Ingrese largo de la pared en metros:");
        largo = Float.valueOf(sc.next());
        System.out.println("Por favor Ingrese ancho de la pared en metros:");
        anch =  Float.valueOf(sc.next());
        
        System.out.println("La arena requerida es:."+ ((largo * anch )*METROS_CUBICO));
        
    }
    
}
