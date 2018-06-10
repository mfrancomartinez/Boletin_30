/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin_30;

/**
 *
 * @author Marcos
 */
public class Futbolista extends SeleccionFutbol implements IntegranteSeleccionFutbol {

    int dorsal;
    String demarcacion;

    public Futbolista() {
    }

    public Futbolista(int dorsal, String demarcacion, int id, String nombre, String apellidos, int edad) {
        super(id, nombre, apellidos, edad);
        this.dorsal = dorsal;
        this.demarcacion = demarcacion;
    }

    public void entrevista() {
        System.out.println("Entrevistan o futbolista");
    }

    
    @Override
    public void concentrarse() {
        System.out.println("Centrase o futbolista");
    }

    @Override
    public void viajar() {
        System.out.println("Viaxa o futbolista");
    }

    @Override
    public void entrenar() {
        System.out.println("Entrena o futbolista");
    }

    @Override
    public void jugarPartido() {
        System.out.println("Xoga o futbolista");
    }
    

    @Override
    public String toString() {
        return "Futbolista{" + super.toString() + "dorsal=" + dorsal + ", demarcacion=" + demarcacion + '}';
    }

    
    

}
