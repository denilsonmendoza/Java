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
public class tarea3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int option;
        // TODO code application logic here
        Scanner introduzca = new Scanner (System.in);
        int elegir = 0;
        float quetzales = 0;
        float dolares = 0;
        float valor_quetz = 0;
        float total_quetz = 0;
        float total = 0;
        System.out.println("Desea convertir dolar a quetzal (1) \n Desea convertir quetzal a dolar (2)");
        elegir = introduzca.nextInt();
        
        if (elegir ==1)
            {
                System.out.println("introduzca la cantidad en dolares");
                dolares = Float.valueOf(introduzca.next());
                System.out.println("introduzca el valor del dolar");
                valor_quetz = Float.valueOf(introduzca.next());
                total_quetz = dolares*valor_quetz;
                System.out.println("el total en quetzales es:." + total_quetz);
                }
        else if (elegir ==2)
            {
                System.out.println("introduzca el valor del dolar:.");
                dolares = Float.valueOf(introduzca.next());
                System.out.println("introduzca la cantidad en quetzales:.");
                quetzales = Float.valueOf(introduzca.next());
                total = (quetzales/dolares);
                System.out.println("la cantidad de quetzales en dolares es de:." + total);
            }
        else
            {
                System.out.println("Error Opcion NO Valida");
            }
            
        }

        
    }
    
