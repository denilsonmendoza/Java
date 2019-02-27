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
public class eje2_array {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // TODO code application logic here
         // Leer 5 números por teclado y a continuación 
        //realizar la media de los números positivos, 
        //la media de los negativos y contar el número de ceros.
        
        Scanner sc = new Scanner(System.in);
        int datos[];
        datos = new int[5];
        int conta_pos = 0, conta_neg = 0, conta_ceros = 0;
        
        for (int i = 0; i < 5; i++) {
            System.out.println("introduzca un valor ");
            datos[i] = Integer.valueOf(sc.next());
            if(datos[i] > 0){
                conta_pos++;
            }
            else if(datos[i] < 0){
                conta_neg++;
            }
            else{
                conta_ceros++;
            }
        }
        
        System.out.println("La cantidad de numeros positivos son "+ conta_pos);
        System.out.println("La cantidad de numeros negativos son "+ conta_neg);
        System.out.println("La cantidad de ceros es "+ conta_ceros);
    }
    
}
