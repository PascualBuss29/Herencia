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
public class Perro extends Animal {
    private String nombre;
    private String ladrar;
    
    
         
     @Override
     public void hacerRuido(){
        System.out.println("Guau");
    }
     

}
