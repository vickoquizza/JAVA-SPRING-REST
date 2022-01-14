package com.vicko.java.nt3ex2;

public class HarmonicSum {
    public static void main(String[] args){
        final int MAX_NUMBER = 5000;
        double sumaIzquierdaDerecha = 0.0;
        double sumaDerechaIzquierda = 0.0;
        double diferenciaAbsoluta = 0.0;
        double unoFlotante = 1.0;

        for(int i = 1; i <= MAX_NUMBER; i++){
            sumaDerechaIzquierda = sumaIzquierdaDerecha + (unoFlotante/i);
        }

        for(int i = MAX_NUMBER; i >= 0; i--){
            sumaDerechaIzquierda = sumaDerechaIzquierda + (unoFlotante/i);
        }

        System.out.println("La suma de derecha a Izquierda es: " + sumaDerechaIzquierda);
        System.out.println("La suma de Izquierda a derecha es: " + sumaIzquierdaDerecha);
        
    }
}
