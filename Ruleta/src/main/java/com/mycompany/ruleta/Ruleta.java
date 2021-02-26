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

    private int intNumAzar;
    

    public Ruleta() {

    }

    public int girarRuleta() {
        int intNumAzar = (int) (Math.random() * 10) + 1; //Numero aleatorio entre 1 y 10
        return intNumAzar;
    }

}
