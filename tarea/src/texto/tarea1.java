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
public class tarea1 {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner (System.in);
        
        float quetzales = 0;
        float dolares = 0;
        float cambio = 0;
        System.out.println("cantidad de quetzales:");
        quetzales = Float.valueOf(entrada.next());
        System.out.println("valor del dolares");
        dolares = Float.valueOf(entrada.next());
      
        
        cambio = (quetzales/dolares);
        
        System.out.println("el total es: "+cambio);
        
    }
    
}
