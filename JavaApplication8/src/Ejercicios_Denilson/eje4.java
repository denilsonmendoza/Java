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
public class eje4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner entrada = new Scanner(System.in);
        int dia = 0, mes = 0, anio = 0;
        System.out.println("Ingrese el dia:.");
        dia = Integer.valueOf(entrada.next());
        System.out.println("Ingrese el mes:.");
        mes = Integer.valueOf(entrada.next());
        System.out.println("Ingrese el año:.");
        anio = Integer.valueOf(entrada.next());
        
        if(anio > 0){
            if(mes > 0 && mes < 13){
                if(dia > 0 && dia < 30){
                    System.out.println("La fecha es correcta");
                }else{
                    System.out.println("El dia ingresado es incorrecto");
                }
            }else{
                    System.out.println("El mes ingresado es incorrecto");
                }
        }else{
            System.out.println("El año ingresado es incorrecto:.");
        }
        
    }
    
}
