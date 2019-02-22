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
public class e25 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        System.out.println("ingrese el primer numero");
        num1 = Integer.valueOf(sc.next());
        System.out.println("ingrese el segundo numero");
        num2 = Integer.valueOf(sc.next());
        if (num1 >= 0 && num2 >= 0)
        {
            System.out.println("la suma es:."+(num1+num2));
            System.out.println("la multiplicacion es:."+(num1*num2));
        }
        else{
            System.out.println("Por Favor ingrese un numero positivo");
        }
    }
    
}
