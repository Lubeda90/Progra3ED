/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.ruleta;

import java.util.Scanner;

/**
 *
 * @author luisu
 */
public class MesaCasino {
    
    public static void main(String[] args) {
        Ruleta objRuleta = new Ruleta();
        Jugador objJugador = new Jugador();
        int intNumSelec = 0;
        int intColorSelec = 0;
        Scanner objNumSelec = new Scanner(System.in); //Numero que selecciona el jugador
        Scanner objColorSelec = new Scanner(System.in); //Color y tipo de apuesta que selecciona el jugador
        System.out.println("+------------------------------------------------------+");
        System.out.println("");
        System.out.println("Bienvenido a la ruleta de la suerte");
        System.out.println("");
        System.out.println("+------------------------------------------------------+");
        System.out.println("Bienvenido Apostador, tienes un total de " + objJugador.getIntBalance() + " creditos para jugar");
        System.out.println("Empecemos!!!!!");
        System.out.println("");
        System.out.println("");
        System.out.println("+------------------------------------------------------+");
        System.out.println("Primera apuesta a realizar va por un numero, escoge tu numero: ");
        intNumSelec = objNumSelec.nextInt();
        objNumSelec.nextLine(); //ejecuta la siguiente linea, nextInt no lo hace
        objJugador.hacerApuesta(intNumSelec, "","Numero");
        objRuleta.girarRuleta();
        objRuleta.validarResultado(objJugador);
        do {
            System.out.println("+------------------------------------------------------+");
            System.out.println("Continua, selecciona tu tipo de apuesta [1. Numero(1 al 10) | 2. Color]: ");
            intColorSelec = objColorSelec.nextInt();
            objColorSelec.nextLine(); //ejecuta la siguiente linea, nextInt no lo hace
            switch(intColorSelec) {
                case 1:
                    System.out.println("Escoge tu numero: ");
                    intNumSelec = objNumSelec.nextInt();
                    objNumSelec.nextLine(); //ejecuta la siguiente linea, nextInt no lo hace
                    if ((intNumSelec <=10) && (intNumSelec >=1)) {
                        objJugador.hacerApuesta(intNumSelec, "","Numero");
                        objRuleta.girarRuleta();
                        objRuleta.validarResultado(objJugador);
                    }else{
                         System.out.println("Selecciona una numero valid0 (1 al 10), debes volver a apostar!!!");    
                    }
                    break;
                case 2:
                    System.out.println("Escoge tu color: [1. Negro | 2. Blanco]");
                    intColorSelec = objColorSelec.nextInt();
                    objColorSelec.nextLine(); //ejecuta la siguiente linea, nextInt no lo hace
                    switch (intColorSelec) {
                        case 1:
                            objJugador.hacerApuesta(0, "Negro","Color");
                            objRuleta.girarRuleta();
                            objRuleta.validarResultado(objJugador);
                            break;
                        case 2:
                            objJugador.hacerApuesta(0, "Blanco","Color");
                            objRuleta.girarRuleta();
                            objRuleta.validarResultado(objJugador);
                            break;
                        default:
                            System.out.println("Selecciona una opcion valida [1. Negro | 2. Blanco], debes volver a apostar!!!");
                            break;
                    }
                    break;
                default:
                    System.out.println("Selecciona una opcion valida [1. Numero | 2. Color],  debes volver a apostar!!!");
                    break;
            }
        } while (objJugador.getIntBalance() > 0);
        System.out.println("+------------------------------------------------------+");
        System.out.println("Ha terminado la ronda de apuestas, no tienes mas creditos, Vuelve pronto!!!");
    }

}
