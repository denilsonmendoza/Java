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
public class tarea2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner (System.in);
        
        float quetzales = 0;
        float dolares = 0;
        float cambio = 0;
        System.out.println("cantidad de dolares:");
        quetzales = Float.valueOf(entrada.next());
        System.out.println("valor de quetzales");
        dolares = Float.valueOf(entrada.next());
        
      
        
        cambio = (quetzales*dolares);
        
        System.out.println("el total es: "+cambio);
    }
    
}
