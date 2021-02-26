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
public class Jugador {
    
    private int intBalance;
    private int intNumeroSelec;
    private String strColorSelec;
    private String strTipoApuesta; //apuesta por color o por numero

    public Jugador() {
        this.intBalance = 100;
        this.intNumeroSelec = 0;
        this.strColorSelec = "";
        this.strTipoApuesta = "";
    }
    
    public void hacerApuesta(int intNumeroSelec, String strColorSelec, String strTipoApuesta) { //primer parametro numero a apostar, segundo parametro color, tercer parametro tipo de apuesta
        this.intBalance -= 10; 
        this.intNumeroSelec = intNumeroSelec;
        this.strColorSelec = strColorSelec;
        this.strTipoApuesta = strTipoApuesta;
        System.out.println("Has hecho una apuesta, tu balance es: " + this.intBalance);
    }
    
    public void recibirPremio(String strApuesta) {
        if (strApuesta.equals("Numero")) {
            this.intBalance += 30; //aposto por el numero
            System.out.println("Se te han dado 30 creditos, tu nuevo balance es: " + this.intBalance);
        } else {
            this.intBalance += 20;  //aposto por el color  
            System.out.println("Se te han dado 20 creditos, tu nuevo balance es: " + this.intBalance);
        }
    }

    public int getIntBalance() {
        return intBalance;
    }

    public int getIntNumeroSelec() {
        return intNumeroSelec;
    }

    public String getStrColorSelec() {
        return strColorSelec;
    }

    public String getStrTipoApuesta() {
        return strTipoApuesta;
    }
    
    
    
}
