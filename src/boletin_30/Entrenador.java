/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin_30;

import javax.swing.JOptionPane;

/**
 *
 * @author Marcos
 */
public class Entrenador extends SeleccionFutbol implements IntegranteSeleccionFutbol {

    Integer idFederacion;

    public Entrenador() {
    }

    public Entrenador(int idFederacion, int id, String nombre, String apellidos, int edad) {
        super(id, nombre, apellidos, edad);
        this.idFederacion = idFederacion;
    }

    public void planificarEntrenamiento() {
        System.out.println("O entrenador planifica o entrenamiento");
    }

   
    @Override
    public void concentrarse() {
        System.out.println("Centrase o entrenador");
    }

    @Override
    public void viajar() {
        System.out.println("Viaxa o entrenador");
    }

    @Override
    public void entrenar() {
        System.out.println("Entrena o entrenador");
    }

    @Override
    public void jugarPartido() {
        System.out.println("Xoga o entrenador");
    }
    

    @Override
    public String toString() {
        return "Entrenador{" + super.toString() + "idFederacion=" + idFederacion + '}';
    }

}