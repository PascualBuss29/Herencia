/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej1extraherencia;

import Entidades.Alquiler;
import Entidades.Barco;
import Entidades.BarcoMotor;
import Entidades.Velero;
import Entidades.Yate;

/**
 *
 * @author USUARIO
 */
public class Ej1ExtraHerencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Alquiler a1 = new Alquiler();
        Barco b1 = new Barco();
        Velero v1 = new Velero();
        BarcoMotor Bm1 = new BarcoMotor();
        Yate y1 = new Yate();
        v1.crearVelero();
        Bm1.crearBarcoMotor();
        y1.crearYate();
        a1.crearCliente();
        System.out.println(a1.getNombre() + " su barco le será alquilado por ." + a1.diasAlquilados() + "dias"
                + "\nEl costo del mismo es de $" + a1.calcularAlquiler());
        System.out.println("Barco matrícula " + a1.getBarco().getMatricula() + " ubicado en el amarre Nº " + a1.getPosicionAmarre());

    }

}
