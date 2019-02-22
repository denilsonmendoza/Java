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
public class e31 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        
        float circulo = 0;
        double PI = 3.14;
        float area = 0;
        
        System.out.println("Ingrese el radio del circulo:.");
        circulo = Float.valueOf(sc.next());
        
        area= (float)(PI * circulo * circulo);
        System.out.println("el area del circulo es:." +area);
    }
    
}
