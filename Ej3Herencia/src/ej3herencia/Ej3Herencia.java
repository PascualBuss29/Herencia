/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej3herencia;

import Entidades.Electrodomesticos;
import Entidades.Lavadora;
import Entidades.Televisor;
import java.util.ArrayList;

/**
 *
 * @author USUARIO
 */
public class Ej3Herencia {

    /**
     * @param args the command line arguments Siguiendo el ejercicio anterior,
     * en el main vamos a crear un ArrayList de Electrodomésticos para guardar 4
     * electrodomésticos, ya sean lavadoras o televisores, con valores ya
     * asignados. Luego, recorrer este array y ejecutar el método precioFinal()
     * en cada electrodoméstico. Se deberá también mostrar el precio de cada
     * tipo de objeto, es decir, el precio de todos los televisores y el de las
     * lavadoras. Una vez hecho eso, también deberemos mostrar, la suma del
     * precio de todos los Electrodomésticos. Por ejemplo, si tenemos una
     * lavadora con un precio de 2000 y un televisor de 5000, el resultado final
     * será de 7000 (2000+5000) para electrodomésticos, 2000 para lavadora y
     * 5000 para televisor.
     */
    public static void main(String[] args) {
        ArrayList<Electrodomesticos> electros = new ArrayList();
        int suma = 0;
        for (int i = 0; i < 2; i++) {
            Lavadora L1 = new Lavadora();
            L1.crearLavadora();
            L1.precioFinal();
            electros.add(L1);
            System.out.println(L1.toString());

            Televisor T1 = new Televisor();
            T1.crearTelevisor();
            T1.precioFinal();
            electros.add(T1);
            System.out.println(T1.toString());
        }

        for (Electrodomesticos electro : electros) {
            suma += electro.getPrecio();
        }
        System.out.println("El precio de los electrodomesticos es: $" + suma);

    }
}
