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
public class Ruleta {

    private int intNumAzar; //Numero al girar la ruleta
    private String strColor; //color del numero elegido
    

    public Ruleta() {
        this.intNumAzar = 0;
        this.strColor = "";
    }

    public void girarRuleta() {
        this.intNumAzar = (int) (Math.random() * 10) + 1; //Numero aleatorio entre 1 y 10
        if ((this.intNumAzar % 2) == 0) { //Residuo de dividir en 2 es igual a 0 (indica que es par)
            this.strColor = "Negro"; //negro par
        } else {
            this.strColor = "Blanco"; //blanco impar
        }
        System.out.println("La ruleta ha girado, el resultado fue Numero: " + this.intNumAzar + ", Color: " + this.strColor);
        System.out.println("Veamos los resultados de la apuesta: ");
    }
    
    public void validarResultado(Jugador objJugador) {
        if (objJugador.getStrTipoApuesta().equals("Numero")) { //apostar por un numero
            if(objJugador.getIntNumeroSelec() == this.intNumAzar) {
                System.out.println("Apostaste al numero: " + objJugador.getIntNumeroSelec());
                System.out.println("Felicidades, has ganado 30 creditos!!!");
                objJugador.recibirPremio("Numero"); //abonar creditos a jugador
            }else {
                System.out.println("Apostaste al numero: " + objJugador.getIntNumeroSelec());
                 System.out.println("Lo sentimos, has perdido!!!");
            }
        } else {
            if(objJugador.getStrColorSelec().equals(this.strColor)) {
                System.out.println("Apostaste al color: " + objJugador.getStrColorSelec());
                System.out.println("Felicidades, has ganado 20 creditos!!!");
                objJugador.recibirPremio("Color"); //abonar creditos a jugador
            }else{
                System.out.println("Apostaste al color: " + objJugador.getStrColorSelec());
                System.out.println("Lo sentimos, has perdido!!!"); //no se abona ningun credito al jugador
            }
        }
    }    

}
