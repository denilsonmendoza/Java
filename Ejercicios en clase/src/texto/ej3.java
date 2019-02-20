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
public class ej3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner num=new Scanner(System.in);
        
        int numero = 0;
	int faltante = 0;
	int numeroInvertido = 0;
	int restante = 0;
        
        
        System.out.println("ingrese el numero que desee:.");
        numero=Integer.valueOf(num.next());
        
        faltante=numero;
        
        while(faltante!=0) {
       
	    restante=faltante%10;
            numeroInvertido=numeroInvertido*10+restante;
            faltante=faltante/10;
	}
        
        	
	if(numeroInvertido==numero){
	System.out.println("El numero ingresado es capicua");
        
	}
        else{
       
        System.out.println("El numero ingresado no es capicua");
		
	}
		
}
	

}
   


