/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class Velero extends Barco {

    protected Integer numeroMastiles;

    public Velero() {
        crearVelero();
    }

    public Velero(Integer numeroMastiles) {
        this.numeroMastiles = numeroMastiles;
    }

    public Velero(Integer numeroMastiles, String matricula, Integer eslora, Integer anioFabricacion) {
        super(matricula, eslora, anioFabricacion);
        this.numeroMastiles = numeroMastiles;
    }

    public void crearVelero() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        super.crearBarco();
        System.out.println("Cargamos el Velero");
        System.out.println("Numero de mastiles: ");
        numeroMastiles = leer.nextInt();
    }

    @Override
    public int modulo() {
        return eslora * 10 + numeroMastiles;

    }
}
