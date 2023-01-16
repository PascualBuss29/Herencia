/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej4herencia;

import Entidades.Circulo;
import Entidades.Rectangulo;

/**
 *
 * @author USUARIO
 */
public class Ej4Herencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Circulo C1 = new Circulo(1);
        System.out.println("El area del circulo es: "+ C1.area() + " y su perimetro es: " + C1.perimetro());
        
        Rectangulo R1 = new Rectangulo(1);
        System.out.println("El area del rectangulo es: " + R1.area() + " y su perimetro es: " + R1.perimetro());
    }
    
}
