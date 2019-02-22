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
public class e26 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int num = 0;
        int num1 = 0;
        int num2 = 0;
        System.out.println("ingrese el primer numero");
        num = Integer.valueOf(sc.next());
        System.out.println("ingrese el segundo numero");
        num1 = Integer.valueOf(sc.next());
        System.out.println("ingrese el tercer numero");
        num2 = Integer.valueOf(sc.next());
        
        
        int suma = (num+num1+num2);
        int resta = (num-num1-num2);
        int multi = (num*num1*num2);
        if (suma > 0 && resta > 0 && multi > 0){
            System.out.println("la suma total es "+suma);
            System.out.println("la resta total es "+resta);
            System.out.println("la multipĺicacion total es "+multi);

        }
        else{
            System.out.println("Por favor Ingrese numero positivos");
        }
    }
    
}
