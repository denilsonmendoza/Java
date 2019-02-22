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
public class e14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        int num3 = 0;
        int resultado = 0;
        System.out.println("Ingresa el primer numero:");
        num1 = Integer.valueOf(sc.next());
        System.out.println("Ingresa el segundo numero:");
        num2 = Integer.valueOf(sc.next());
        System.out.println("Ingresa el tercer numero:");
        num3 = Integer.valueOf(sc.next());
        
        resultado = Integer.valueOf(String.valueOf(num1)+String.valueOf(num2)+String.valueOf(num3));
        System.out.println("El resultado es:" + resultado);
    }
    
}
