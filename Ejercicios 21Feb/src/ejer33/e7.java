/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer33;

import java.util.Scanner;

/**
 *
 * @author Denilson
 */
public class e7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner dato = new Scanner(System.in);
        float URGENCIA = (float) 0.37;
        float PEDIATRIA = (float) 0.42;
        float TRAUMATOLOGIA = (float) 0.21;
        float presupuesto = (float) 0;
        System.out.println("Ingresa el presupuesto:.");
        presupuesto = Float.valueOf(dato.next());
        System.out.println("El presupuesto para Emergencias es:"+(presupuesto * URGENCIA) );
        System.out.println("El presupuesto para Pediatria es:"+(presupuesto * PEDIATRIA) );
        System.out.println("El presupuesto para Traumatologia es:"+(presupuesto * TRAUMATOLOGIA) );
    }
    
}
