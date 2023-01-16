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
public class EdificioDeOficinas extends Edificio{
    private Integer numOficinas;
    private Integer cantPersonasOfic;
    private Integer numPisos;

    public EdificioDeOficinas() {
    }

    public EdificioDeOficinas(Integer numOficinas, Integer cantPersonasOfic, Integer numPisos) {
        this.numOficinas = numOficinas;
        this.cantPersonasOfic = cantPersonasOfic;
        this.numPisos = numPisos;
    }

    public EdificioDeOficinas(Integer numOficinas, Integer cantPersonasOfic, Integer numPisos, int ancho, int alto, int largo) {
        super(ancho, alto, largo);
        this.numOficinas = numOficinas;
        this.cantPersonasOfic = cantPersonasOfic;
        this.numPisos = numPisos;
    }

    public Integer getNumOficinas() {
        return numOficinas;
    }

    public void setNumOficinas(Integer numOficinas) {
        this.numOficinas = numOficinas;
    }

    public Integer getCantPersonasOfic() {
        return cantPersonasOfic;
    }

    public void setCantPersonasOfic(Integer cantPersonasOfic) {
        this.cantPersonasOfic = cantPersonasOfic;
    }

    public Integer getNumPisos() {
        return numPisos;
    }

    public void setNumPisos(Integer numPisos) {
        this.numPisos = numPisos;
    }

  
    
    @Override
     public  int calcularSuperficie(){
         return super.ancho*super.largo;
     }
     
     @Override
     public int  calcularVolumen(){
        return super.alto*super.largo*super.ancho;
     }
     
     public void cantPersonas(){
         System.out.println("La cantidad de Personas por piso es: " + cantPersonasOfic* numPisos);
         System.out.println("La cantidad de personas en el edificio es: " + cantPersonasOfic* numOficinas* numPisos);
     }
    
}
