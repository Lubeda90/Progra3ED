/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.calculadora;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Principal {
    
    //Metodo principal
    public static void main(String[] args) {
        //Definir variables
        Scanner objInput = new Scanner(System.in);
        String strContinuar = null;
        
        do {
            System.out.println("Seleccionar una opcion:");
            System.out.println("a - Si desea sumar");
            System.out.println("b - Si desea restar");
            
            //Escribe el valor del buffer de teclado
            System.out.println("Eliga su opcion:");
            String strOpcion = objInput.nextLine();
            
            //Definir variables para las operaciones
            float[] fltArrNumeros = new float[2];
            float fltResultado = 0;
            
            //Define variable error
            boolean blnError = true;
            
            switch (strOpcion) {
                case "a":
                   strOpcion = "Suma";
                    System.out.println("");
                    
                    //solicitar valores numericos
                    for (int i=0; i<2; i++) {
                        System.out.println("Ingrese el numero " + (i+1) + " : ");
                        fltArrNumeros[i] = objInput.nextFloat();
                    }
                    
                    fltResultado = fltArrNumeros[0] + fltArrNumeros[1];
                    
                    //Control
                    blnError = false;
                    
                    //Sale del case
                    break;
                case "b":
                   strOpcion = "Resta";
                    System.out.println("");
                    
                    //solicitar valores numericos
                    for (int i=0; i<2; i++) {
                        System.out.println("Ingrese el numero " + (i+1) + " : ");
                        fltArrNumeros[i] = objInput.nextFloat();
                    }
                    
                    fltResultado = fltArrNumeros[0] - fltArrNumeros[1];
                    
                    //Control
                    blnError = false;
                    
                    //Sale del case
                    break;
                    
                default:
                    blnError = true;
                    break;
            }
            
            System.out.println("");
            
            //Despliegue de los datos si no hay error
            if (blnError == false) {
                System.out.println("El resultado es: " + fltResultado);
            }else if (blnError == true) {
                System.out.println("Error no se puede realizar su operacion");
            }
            
            System.out.println("La opcion seleccionada es: " + strOpcion);
            
            System.out.println("Desea continuar [S/N]: ");
            //Capturar el buffer para continuar
            Scanner objInput2 = new Scanner(System.in);
            strContinuar = objInput2.nextLine();
        }while(strContinuar.equals("s") || strContinuar.equals("S"));               
    }
    
}
