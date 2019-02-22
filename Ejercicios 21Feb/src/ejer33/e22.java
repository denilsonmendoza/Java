/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer33;

import java.util.Scanner;

/**
 *
 * @author denilson
 */
public class e22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        float dist = 0;
       
        
        System.out.println("ingrese la distancia en mestros");
        dist = Float.valueOf(sc.next());
        System.out.println("la distancia en pulgadas es de:."+(dist*39.37));
        System.out.println("la distancia en pies es de:."+(dist*3.28));
        
    }
    
}
