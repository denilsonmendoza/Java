/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays;

import java.util.Scanner;

/**
 *
 * @author denilson
 */
public class eje4_array {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in); 
        
        int a[], b[], c[];
        
        a = new int [10];
        b = new int [10];
        c = new int [20];
        
        System.out.println("ingrese el primer arreglo:.");
        for (int i = 0; i < 10; i++) {
            System.out.print((i+1)+"Ingrese un numero:.");
            a[i] = sc.nextInt();
        }
        
        System.out.println("ingrese el segundo arreglo:.");
        for (int i = 0; i < 10; i++) {
            System.out.print((i+1)+"Ingrese un numero:.");
            b[i] = sc.nextInt();
        }
        
        int m=0;
        for (int i = 0; i < 10; i++) {
            c[m] = a[i];
            m++;
            c[m] = b[i];
            m++;
        }
        
        System.out.print("el tercer arreglo es:.");
        for (int i = 0; i < 20; i++) {
            System.out.print(c[i]+" ");
        }
        System.out.println("");
    }
    
}
