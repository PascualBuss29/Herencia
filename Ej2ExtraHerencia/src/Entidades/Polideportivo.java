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
public class Polideportivo extends Edificio{
    private String nombre;
    private boolean tipoTecho;

    public Polideportivo() {
    }

    public Polideportivo(String nombre, boolean tipoTecho) {
        this.nombre = nombre;
        this.tipoTecho = tipoTecho;
    }

    public Polideportivo(String nombre, boolean tipoTecho, int ancho, int alto, int largo) {
        super(ancho, alto, largo);
        this.nombre = nombre;
        this.tipoTecho = tipoTecho;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isTipoTecho() {
        return tipoTecho;
    }

    public void setTipoTecho(boolean tipoTecho) {
        this.tipoTecho = tipoTecho;
    }

 
    @Override
     public  int calcularSuperficie(){
         return super.ancho*super.largo;
     }
     
     @Override
     public int  calcularVolumen(){
        return super.alto*super.largo*super.ancho;
     }
     
     public String techo(){
         String techo= "Techado";
         if(tipoTecho== false)
             techo = "Destechado";
         
         return "Tipo de techo: " + techo;
     }
}
