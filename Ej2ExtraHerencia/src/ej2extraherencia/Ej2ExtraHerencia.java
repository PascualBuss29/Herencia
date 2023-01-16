/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej2extraherencia;

import Entidades.Edificio;
import Entidades.EdificioDeOficinas;
import Entidades.Polideportivo;
import java.util.ArrayList;

/**
 *
 * @author USUARIO
 */
public class Ej2ExtraHerencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Edificio> edificios = new ArrayList();
        Polideportivo Poli = new Polideportivo("A", true, 20, 10, 30);
        Polideportivo Poli2 = new Polideportivo("B", true, 30, 15, 40);

        EdificioDeOficinas EDO = new EdificioDeOficinas(10, 10, 10, 8, 4, 5);
        EdificioDeOficinas EDO1 = new EdificioDeOficinas(15, 12, 12, 10, 6, 6);

        edificios.add(Poli);
        edificios.add(Poli2);
        edificios.add(EDO);
        edificios.add(EDO1);

        int cont = 0;
        int cantEdif = 0;
        int cantPoli = 0;
        for (Edificio edificio : edificios) {
            if (edificio instanceof EdificioDeOficinas) {
                cantEdif++;
                System.out.println("Edificio  ");
                System.out.println("Superficie");
                System.out.println(edificio.calcularSuperficie() + "Mts2");
                System.out.println("Valumen");
                System.out.println(edificio.calcularVolumen() + "Mts3");
                ((EdificioDeOficinas) edificio).cantPersonas();
            }

            if (edificio instanceof Polideportivo) {
                cantPoli++;
                System.out.println("Polideportivo " + ((Polideportivo) edificio).getNombre());
                System.out.println("Superficie");
                System.out.println(edificio.calcularSuperficie() + "Mts2");
                System.out.println("Volumen");
                System.out.println(edificio.calcularVolumen() + "Mts3");
                System.out.println("Polideportivos" + ((Polideportivo) edificio).techo());
                if (((Polideportivo) edificio).isTipoTecho());
                cont++;

            }

        }
        System.out.println("");
        System.out.println("La cantidad de Polideportivos es: " + cantPoli);
        System.out.println("de los cuales " + cont + " son techados, y " + (cantPoli - cont) + " no son techados");
        System.out.println("");
        System.out.println("La cantidad de Edificios de oficinas es: " + cantEdif);
    }
}


