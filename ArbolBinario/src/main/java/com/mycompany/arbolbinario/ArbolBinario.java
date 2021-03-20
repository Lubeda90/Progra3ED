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
    
    public static void inOrdenNodosInternos(Nodo APNodo) { //recorrido inorden nodos internos
        Nodo auxizq = APNodo.izquierdo;
        Nodo auxder = APNodo.derecho;
        if ((auxizq != null) && (auxder != null)){
            inOrdenNodosInternos(APNodo.izquierdo);
            System.out.print(APNodo.getDato() + "-->");
            inOrdenNodosInternos(APNodo.derecho);
        }else if ((auxizq != null) && (auxder == null)) {
            inOrdenNodosInternos(APNodo.izquierdo);
            System.out.print(APNodo.getDato() + "-->");
        }else if ((auxizq == null) && (auxder != null)) {
            System.out.print(APNodo.getDato() + "-->");
            inOrdenNodosInternos(APNodo.derecho);
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
    
    public static void eliminarHojasABB(Nodo APNodo) {
        Nodo auxizq = APNodo.izquierdo;
        Nodo auxder = APNodo.derecho;
        if ((auxizq.izquierdo != null) || (auxizq.derecho != null)) {
            eliminarHojasABB(auxizq);
        }else if ((auxder.izquierdo != null) || (auxder.derecho != null)) {
            eliminarHojasABB(auxder);
        }
        if ((auxizq.izquierdo == null) && (auxizq.derecho == null)){
            //System.out.println("Hoja Eliminada -- " + APNodo.getDato());
            APNodo.izquierdo = null;
        }
        if ((auxder.izquierdo == null) && (auxder.derecho == null)){
            //System.out.println("Hoja Eliminada -- " + APNodo.getDato());
            APNodo.derecho = null;
        }
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
        
        Nodo raiz = new Nodo(62);
        
        insercionABB(raiz,49);
        insercionABB(raiz,78);
        insercionABB(raiz,31);
        insercionABB(raiz,55);
        insercionABB(raiz,69);
        insercionABB(raiz,90);
        insercionABB(raiz,10);
        insercionABB(raiz,37);
        insercionABB(raiz,66);
        insercionABB(raiz,96);
        insercionABB(raiz,93);
        
        //inOrdenNodosInternos(raiz);
       // System.out.println("");
        inOrden(raiz);
        System.out.println("");
        eliminarHojasABB(raiz);
        System.out.println("");
        inOrden(raiz);
    }   
};
