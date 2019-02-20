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
public class ej4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   Scanner entrada=new Scanner(System.in);
   int dia = 0;
   int mes = 0;
   int año = 0;
   
   
   
   System.out.print("Introduzca día: ");
   dia=Integer.valueOf(entrada.next());
   System.out.print("Introduzca mes: ");
   mes=Integer.valueOf(entrada.next());
   System.out.print("Introduzca año: ");
   año=Integer.valueOf(entrada.next());
   
   if (dia >= 1 && dia <=30){
       System.out.println ("Fecha correcta");
    }
   
   else{
       System.out.println("fecha incorrecta");
   }
   
        System.out.println("------------------------------------------");
   
   if (mes >= 1 && mes <= 12){
       System.out.println("Mes correcto");
    }
   else{
       System.out.println("Mes incorrecto");
   }
   
   
   System.out.println("------------------------------------------");
   
   
   if (año > 0){
       System.out.println("Año correcto");
    }
   else{
       System.out.println("Año incorrecto");
   }
     
 }
    
}
