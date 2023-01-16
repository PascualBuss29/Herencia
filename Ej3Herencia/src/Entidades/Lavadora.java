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
public class Lavadora extends Electrodomesticos{
    
    private Integer carga;

    public Lavadora() {
    }

    public Lavadora(Integer carga, Integer precio, Integer peso) {
        super(precio, peso);
        this.carga = carga;
    }

    public Integer getCarga() {
        return carga;
    }

    public void setCarga(Integer carga) {
        this.carga = carga;
    }

    @Override
    public String toString() {
        return "Lavadora{" + " carga= " + carga + " PrecioFinal: " + precio + " Color: " + color + '}';
    }
    
    

    public void crearLavadora() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        crearElectrodomestico();
        System.out.println("Ingrese la carga maxima en kg");
        carga = leer.nextInt();
    }

    @Override
    public void precioFinal() {
        super.precioFinal();
        if (carga > 30) {
            precio += 500;
        }else{
            precioFinal();
        }

    }
}
