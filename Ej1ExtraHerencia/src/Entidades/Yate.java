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
public class Yate extends BarcoMotor {

    protected Integer numCamarotes;

    public Yate() {
       crearYate();
    }

    public Yate(Integer numCamarotes) {
        this.numCamarotes = numCamarotes;
    }

    public Yate(Integer numCamarotes, Integer potenciaCv) {
        super(potenciaCv);
        this.numCamarotes = numCamarotes;
    }

    public Yate(Integer numCamarotes, Integer potenciaCv, String matricula, Integer eslora, Integer anioFabricacion) {
        super(potenciaCv, matricula, eslora, anioFabricacion);
        this.numCamarotes = numCamarotes;
    }

    public void crearYate() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        super.crearBarco();
        System.out.println("Cargamos el Yate");
        System.out.println("Numero de Camarotes: ");
        numCamarotes = leer.nextInt();
    }

    @Override
    public int modulo() {
        return eslora * 10 + potenciaCv + numCamarotes;

    }
}
