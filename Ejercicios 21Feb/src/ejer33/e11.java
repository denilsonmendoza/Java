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
public class e11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float segundos = (float ) 0;
        float minutos = (float ) 0;
        float hora = (float ) 0;
        float PRE_SEG = (float ) 0.25;
        float tiempo_s = (float ) 0;
        System.out.println("Ingresa la cantidad de horas:.");
        hora = Float.valueOf(sc.next());
        System.out.println("Ingresa la cantidad de minutos:.");
        minutos = Float.valueOf(sc.next());
        System.out.println("Ingresa la cantidad de segundos:.");
        segundos = Float.valueOf(sc.next());
        tiempo_s = segundos + (minutos * 60 )+ ((hora * 60)*60) ;
        System.out.println("El total a pagar es:."+ (tiempo_s * PRE_SEG));
    }
    
}
