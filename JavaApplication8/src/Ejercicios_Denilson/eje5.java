/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios_Denilson;

import java.util.Scanner;

/**
 *
 * @author denilson
 */
public class eje5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        int dia = 0, mes = 0, anio = 0;
        System.out.println("Ingrese el dia:.");
        dia = Integer.valueOf(entrada.next());
        System.out.println("Ingrese el mes:.");
        mes = Integer.valueOf(entrada.next());
        System.out.println("Ingrese el año:.");
        anio = Integer.valueOf(entrada.next());
        
        if(anio > 0){
            if(mes == 1 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12){
                if(dia > 0 && dia <= 31){
                    System.out.println("La fecha es correcta (meses de 31 dias)");
                }else{
                    System.out.println("dia ingresado invalido");
                }
            }else if(mes == 2){
                if(dia > 0 && dia <= 28){
                    System.out.println("La fecha es correcta (mes de febrero)");
                }else{
                    System.out.println("dia ingresado invalido");
                }
            }else if(mes == 4 || mes == 6 || mes == 9 || mes == 11){
                if(dia > 0 && dia <= 30){
                    System.out.println("La fecha es correcta (meses de 30 dias)");
                }else{
                    System.out.println("dia ingresado invalido");
                }
            }else{
                System.out.println("el mes ingresado es invalido");
            }
        }else{
            System.out.println("El año ingresado es incorrecto");
        }
    }
    
}
