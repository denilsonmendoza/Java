/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios_Denilson;

import java.util.Scanner;

/**
 *
 * @author denilson
 */
public class eje2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner sc = new Scanner(System.in);
        int numero = 0;
        String comodin = "";
        String salida = "";
        System.out.print("Ingrese el numero por favor:.");
        numero = Integer.valueOf(sc.next());
        if(numero >= 0 && numero <=9999){
            int longitud = String.valueOf(numero).length();
            comodin = String.valueOf(numero);
            for(int i = (longitud); i-1 >= 0 ; i--){
                
                salida = salida + (comodin.subSequence(i-1, i));
                
            }
            System.out.println(salida);
            
            
        }else{
            System.out.println("Opcion no Valida");
        }
        
    }
    
}
