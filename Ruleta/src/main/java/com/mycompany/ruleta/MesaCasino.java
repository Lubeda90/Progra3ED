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
        for (int i = 0; i < 20; i++) {
           System.out.println(objRuleta.girarRuleta());     
        }
    }

}
