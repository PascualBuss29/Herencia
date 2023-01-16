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
public class BarcoMotor extends Barco {

    protected Integer potenciaCv;

    public BarcoMotor() {
        crearBarcoMotor();
    }

    public BarcoMotor(Integer potenciaCv) {
        this.potenciaCv = potenciaCv;
    }

    public BarcoMotor(Integer potenciaCv, String matricula, Integer eslora, Integer anioFabricacion) {
        super(matricula, eslora, anioFabricacion);
        this.potenciaCv = potenciaCv;
    }

    public void crearBarcoMotor() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        super.crearBarco();
        System.out.println("Cargamos el Barco Motor");
        System.out.println("Potencia CV: ");
        potenciaCv = leer.nextInt();
    }

    @Override
    public int modulo() {
        return eslora * 10 + potenciaCv;

    }
}
