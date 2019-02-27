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
public class eje3_array {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        System.out.println("Leer 10 números enteros. Debemos mostrarlos, "
                + "en el siguiente orden: el primero, el último, el segundo,"
                + "el penúltimo, el tercero ");
        
        Scanner sc = new Scanner(System.in);
        int numero[];
        numero = new int[10];
        
        for (int i = 0; i < 10; i++) {
            System.out.println("introduzca un numero");
            numero[i] = Integer.valueOf(sc.next());
        }
        System.out.println("los valores son");
        
        for (int i = 0; i < 5; i++) {
            System.out.println("valor-"+ numero[i]+" valor2-"+numero[9-i]);
        }
    }
    
    
}
