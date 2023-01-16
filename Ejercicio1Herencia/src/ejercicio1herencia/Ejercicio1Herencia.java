/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1herencia;

import Entidades.Animal;
import Entidades.Caballo;
import Entidades.Gato;
import Entidades.Perro;

/**
 *
 * @author USUARIO
 */
public class Ejercicio1Herencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Animal perro1 = new Perro("Tom","Carne",10,"Callejero" );
        perro1.alimentar();
        
        Animal gato1 = new Gato("Coco", "Balanceado", 2, "Atigrado");
        gato1.alimentar();
        
        Animal caballo1 = new Caballo("Rozillo", "Pasto", 15, "Criollo");
        caballo1.alimentar();
    }
    
}
