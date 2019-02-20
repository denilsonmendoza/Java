/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package texto;

import java.util.Scanner;

/**
 *
 * @author denilson
 */
public class ej2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
       
        String num = "";
        String alrevez = "";
        
         System.out.println("Ingrese el numero que desee:. ");
        num =String.valueOf(sc.next());
        
        for (int i = num.length() -1; i >= 0 ; i--)
            alrevez = alrevez + num.charAt(i);
        System.out.println(alrevez);        
      
    }
    
}
