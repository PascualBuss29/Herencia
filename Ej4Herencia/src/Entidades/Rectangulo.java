/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import Interfaz.calculosFormas;

/**
 *
 * @author USUARIO
 */
public class Rectangulo implements calculosFormas{
    private double lado;

    public Rectangulo() {
    }

    public Rectangulo(double lado) {
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

   

    @Override
    public double area() {
        return lado*lado;
    }

    @Override
    public double perimetro() {
        return lado*4;
    }

    
    
    
}
