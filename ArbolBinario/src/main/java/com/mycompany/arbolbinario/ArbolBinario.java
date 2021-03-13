/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.arbolbinario;

/**
 *
 * @author alumno
 */
public class ArbolBinario {
    public static void preOrden(Nodo APNodo) { //recorrido preorden
        if (APNodo != null) {
            System.out.print(APNodo.getDato() + "-->");
            preOrden(APNodo.izquierdo);
            preOrden(APNodo.derecho);
        }
    }
    
    public static void inOrden(Nodo APNodo) { //recorrido inorden
        if (APNodo != null) {
            inOrden(APNodo.izquierdo);
            System.out.print(APNodo.getDato() + "-->");
            inOrden(APNodo.derecho);
        }
    }
    
    public static void postOrden(Nodo APNodo) { //recorrido postorden
        if (APNodo != null) {
            postOrden(APNodo.izquierdo);
            postOrden(APNodo.derecho);
            System.out.print(APNodo.getDato() + "-->");
        }
    }
    
    public static void insercionABB (Nodo APNodo, int intDato) {
        if (intDato < APNodo.getDato()) {
            if (APNodo.izquierdo == null) {
                APNodo.izquierdo = new Nodo(intDato);
            }else{
                insercionABB(APNodo.izquierdo, intDato);
            }
        }else if (intDato > APNodo.getDato()) {
            if (APNodo.derecho == null) {
                APNodo.derecho = new Nodo(intDato);
            }else{
                insercionABB(APNodo.derecho, intDato);
            }
        }else
            System.out.println("El nodo ya se encuentra en el arbol");
    }
   
    public static void main(String[] args) {
        /*Nodo raiz = new Nodo(31);
        raiz.izquierdo = new Nodo(10);
        raiz.derecho = new Nodo(37);
        
        System.out.println(raiz.getDato());
        System.out.println(raiz.izquierdo.getDato());
        System.out.println(raiz.derecho.getDato());*/
        
        /*Nodo raiz = new Nodo(87);
        raiz.izquierdo = new Nodo(43);
        raiz.derecho = new Nodo(99);
        
        //sub izquierdo
        raiz.izquierdo.izquierdo = new Nodo(22);
        raiz.izquierdo.derecho = new Nodo(65);
        
        //sub izquierdo nivel 4
        raiz.izquierdo.derecho.izquierdo = new Nodo(56);
        
        //sub derecho
        raiz.derecho.izquierdo = new Nodo(93);
        
        //impresion dato
        System.out.println(raiz.izquierdo.derecho.izquierdo.getDato());*/
        
        /*Nodo subArbol;
        
        Nodo raiz = new Nodo(87);
        raiz.izquierdo = new Nodo(43);
        raiz.derecho = new Nodo(99);
        
        //SubArbol 43
        subArbol = raiz.izquierdo;
        subArbol.izquierdo = new Nodo(22);
        subArbol.derecho = new Nodo(65);
        
        //subArbol 65
        subArbol = subArbol.derecho;
        subArbol.izquierdo = new Nodo(56);
        
        //subArbol 99
        subArbol = raiz.derecho;
        subArbol.izquierdo = new Nodo(93);*/
        
        /*preOrden(raiz);
        System.out.println("");
        inOrden(raiz);
        System.out.println("");
        postOrden(raiz);*/
        
        Nodo raiz = new Nodo(120);
        
        insercionABB(raiz,87);
        insercionABB(raiz,43);
        insercionABB(raiz,65);
        insercionABB(raiz,140);
        insercionABB(raiz,99);
        insercionABB(raiz,130);
        insercionABB(raiz,22);
        insercionABB(raiz,56);
        
        inOrden(raiz);
    }   
}
