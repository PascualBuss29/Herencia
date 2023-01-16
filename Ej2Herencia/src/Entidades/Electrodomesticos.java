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
public class Electrodomesticos {

    protected double precio;
    protected String color; 
    protected char consumoEnergetico;
    
    protected Integer peso;

    public Electrodomesticos() {
    }

    public Electrodomesticos(double precio, Integer peso) {
        this.precio = precio;
        this.peso = peso;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public void setConsumoEnergetico(char consumoEnergetico) {
        this.consumoEnergetico = consumoEnergetico;
    }

    public Integer getPeso() {
        return peso;
    }

    public void setPeso(Integer peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Electrodomesticos{" + "precio=" + precio + ", color=" + color + ", consumoEnergetico=" + consumoEnergetico + ", peso=" + peso + '}';
    }
    
    

//    Método comprobarConsumoEnergetico(char letra): comprueba que la letra es correcta,
//sino es correcta usara la letra F por defecto. Este método se debe invocar al crear el
//objeto y no será visible.
    public char comprobarConsumoEnergetico(char letra) {
        letra = Character.toLowerCase(letra);
        switch (letra) {
            case 'A':
                return 'A';
            case 'B':
                return 'B';
            case 'C':
                return 'C';
            case 'D':
                return 'D';
            default:
                return 'F';

        }

    }

    public String comprobarColor(String color) {
        color = color.toLowerCase();
        switch (color) {

            case "NEGRO":
                return "Negro";
            case "ROJO":
                return "Rojo";
            case "AZUL":
                return "Azul";
            case "GRIS":
                return "Gris";
            default:
                return "Blanco";

        }
    }

    public void crearElectrodomestico() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        System.out.println("Ingresa el color");
        color=comprobarColor(leer.next());
        System.out.println("Ingrese el consumo 'A', 'B', 'C', 'D', 'E', 'F' ");
        consumoEnergetico=comprobarConsumoEnergetico(leer.next().charAt(0));
        System.out.println("Ingresa el peso en Kg");
        peso=leer.nextInt();
        precio=1000;

    }

    public void precioFinal() {
        double precioFinal = precio;
        switch (consumoEnergetico){ 
            case 'A':
                precio += 1000;
                break;

            case 'B':
                precio += 800;
                break;

            case 'C':
                precio += 600;
                break;

            case 'D':
                precio += 500;
                break;

            case 'E':
                precio += 300;
                break;

            case 'F':
                precio += 100;
                break;

        }
        if (peso >= 1 && peso <= 19) {
            precio += 100;
        } else if (peso >= 20 && peso <= 49) {
            precio += 500;
        } else if (peso >= 50 && peso <= 79) {
            precio += 800;
        } else if (peso >= 80) {
            precio += 1000;
        }
       
    }
}
