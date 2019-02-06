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
public class tarea4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner introduzca = new Scanner (System.in);
        float numero = 0;
        float cubo = 0;
        float cuadrado = 0;
        int aumento = 0;
        
        while (aumento != 5)
            {
                System.out.println("Por favor ingrese el numero que desea para elevarlo al cubo y al cuadrado:.");
                numero = Float.valueOf(introduzca.next());
                cubo = numero*numero*numero;
                cuadrado = numero*numero;
                System.out.println("su numero al cuadrado es:." + cuadrado);
                System.out.println("su numero al cubo es:." + cubo);
                aumento++;
            }
            
    }
    
}
