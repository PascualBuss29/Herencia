/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author USUARIO
 */
public class Gato extends Animal {

    public Gato() {
    }

    public Gato(String nombre, String alimento, Integer edad, String raza) {
        super(nombre, alimento, edad, raza);
    }
    
    @Override
      public void alimentar(){
             System.out.println(nombre +" Se alimenta de Balanceado");
         }   
}
