/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.ruleta;

/**
 *
 * @author luisu
 */
public class MesaCasino {
    
    public static void main(String[] args) {
        Ruleta objRuleta = new Ruleta();
        Jugador objJugador = new Jugador();
        do {
            objJugador.hacerApuesta(7, "","Color");
            objRuleta.girarRuleta();
            objRuleta.validarResultado(objJugador);
        } while (objJugador.getIntBalance() > 0);
        System.out.println("Ha terminado la ronda de apuestas, no tienes mas creditos, Vuelve pronto!!!");
    }

}
