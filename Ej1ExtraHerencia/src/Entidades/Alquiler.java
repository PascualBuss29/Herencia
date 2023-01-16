/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class Alquiler {

    protected String nombre;
    protected Integer dni;
    protected Date fechaAlquiler;
    protected Date fechadevolucion;
    protected Integer posicionAmarre;
    protected Barco barco;

    public Alquiler() {
    }

    public Alquiler(String nombre, Integer dni, Date fechaAlquiler, Date fechadevolucion, Integer posicionAmarre, Barco barco) {
        this.nombre = nombre;
        this.dni = dni;
        this.fechaAlquiler = fechaAlquiler;
        this.fechadevolucion = fechadevolucion;
        this.posicionAmarre = posicionAmarre;
        this.barco = barco;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getDni() {
        return dni;
    }

    public void setDni(Integer dni) {
        this.dni = dni;
    }

    public Date getFechaAlquiler() {
        return fechaAlquiler;
    }

    public void setFechaAlquiler(Date fechaAlquiler) {
        this.fechaAlquiler = fechaAlquiler;
    }

    public Date getFechadevolucion() {
        return fechadevolucion;
    }

    public void setFechadevolucion(Date fechadevolucion) {
        this.fechadevolucion = fechadevolucion;
    }

    public Integer getPosicionAmarre() {
        return posicionAmarre;
    }

    public void setPosicionAmarre(Integer posicionAmarre) {
        this.posicionAmarre = posicionAmarre;
    }

    public Barco getBarco() {
        return barco;
    }

    public void setBarco(Barco barco) {
        this.barco = barco;
    }

    @Override
    public String toString() {
        return "Alquiler{" + "nombre=" + nombre + ", dni=" + dni + ", fechaAlquiler=" + fechaAlquiler + ", fechadevolucion=" + fechadevolucion + ", posicionAmarre=" + posicionAmarre + ", barco=" + barco + '}';
    }

    public void crearCliente() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Nombre del cliente: ");
        nombre = leer.next();
        System.out.println("DNI: ");
        dni = leer.nextInt();
        System.out.println("Fecha de alquiler: ");
        System.out.println("Anio: ");
        int anio = leer.nextInt();
        System.out.println("Mes: ");
        int mes = leer.nextInt();
        System.out.println("Dia: ");
        int dia = leer.nextInt();
        fechaAlquiler = new Date(anio - 1900, mes - 1, dia);
        System.out.println("Fecha de devolucion: ");
        System.out.println("Anio: ");
        anio = leer.nextInt();
        System.out.println("Mes: ");
        mes = leer.nextInt();
        System.out.println("Dia: ");
        dia = leer.nextInt();
        fechadevolucion = new Date(anio - 1900, mes - 1, dia);
        System.out.println("Posicion amarre n°: ");
        posicionAmarre = leer.nextInt();
        System.out.println("Catalogo de barcos");
        System.out.println("1: Velero"
                + "\n2: Barco Motor"
                + "\n3: Yate");
        int opc;
        System.out.println("Opción: ");
        opc = leer.nextInt();
        while (opc < 1 || opc > 3) {
            System.out.println("Opción inválida. Reingrese: ");
            opc = leer.nextInt();
        }
        switch (opc) {
            case 1:
                barco = new Velero();
                break;
            case 2:
                barco = new BarcoMotor();
                break;
            case 3:
                barco = new Yate();
                break;
        }
    }
     public long diasAlquilados() {
        return fechadevolucion.getTime() - fechaAlquiler.getTime();
        
    }

    public int calcularAlquiler() {

        int costo = (int) diasAlquilados() * barco.modulo();
        System.out.println("El costo del alquiler es: " + costo);
        return costo;
    }

   
}
