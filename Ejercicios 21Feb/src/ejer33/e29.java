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
public class e29 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        float num1 = 0;
        float num2 = 0;
        float num3 = 0;
        float promedio = 0;
        
        System.out.println("ingresa nota1");
        num1 = Float.valueOf(sc.next());
        System.out.println("ingresa nota2");
        num2 = Float.valueOf(sc.next());
        System.out.println("ingresa nota3");
        num3 = Float.valueOf(sc.next());
        promedio = (num1+num2+num3)/3;
        
        if(promedio >= 16){
            System.out.println(promedio);
            System.out.println("el promedio total es 20 GANO");
            
        }
        else if(promedio >= 9.5){
            System.out.println("aprobado");
        }
        else{
            System.out.println("desaprobado");
        }
        
        
            
        }
    }
    

