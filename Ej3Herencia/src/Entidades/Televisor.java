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
public class Televisor extends Electrodomesticos{
     private Double resolucion;
    private Boolean sintonizadorTDT;

    public Televisor() {
    }

    public Televisor(Double resolucion, Boolean sintonizadorTDT) {
        this.resolucion = resolucion;
        this.sintonizadorTDT = sintonizadorTDT;
    }

    public Televisor(Double resolucion, Boolean sintonizadorTDT, Integer precio, Integer peso) {
        super(precio, peso);
        this.resolucion = resolucion;
        this.sintonizadorTDT = sintonizadorTDT;
    }

    public Double getResolucion() {
        return resolucion;
    }

    public void setResolucion(Double resolucion) {
        this.resolucion = resolucion;
    }

    public Boolean getSintonizadorTDT() {
        return sintonizadorTDT;
    }

    public void setSintonizadorTDT(Boolean sintonizadorTDT) {
        this.sintonizadorTDT = sintonizadorTDT;
    }

    @Override
    public String toString() {
        return "Televisor{" + " resolucion= " + resolucion + " , sintonizadorTDT= " + sintonizadorTDT + " PrecioFinal: " + precio + " Color: " + color + '}';
    }
    
    

    public void crearTelevisor() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        crearElectrodomestico();
        System.out.println("Resolucion del televisor en pulgadas");
        resolucion = leer.nextDouble();
        System.out.println("Tiene sintonidador TDA? S/N");
        char aux = leer.next().charAt(0);

        sintonizadorTDT = ((aux == 's' || aux == 'S'));
    }

    @Override
    public void precioFinal() {
        super.precioFinal();
        if (resolucion > 40) {
            precio *= 1.3;
        }
        if (sintonizadorTDT) {
            precio += 500;
        }
    }
}
