/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.arbolbinario;

/**
 *
 * @author luisu
 */
public class Nodo {
    public Nodo izquierdo;
    private int dato;
    public Nodo derecho;

    public Nodo(int dato) {
        this.dato = dato;
        this.izquierdo = this.derecho = null;
    }

    public int getDato() {
        return dato;
    }

    public void setDato(int dato) {
        this.dato = dato;
    }
    
    
    
}
