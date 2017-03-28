/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persona;

/**
 *
 * @author Estudiante
 */
public class Main {
    public static void main(String[] args) {
    Profesor p = new Profesor("f","123","poo");
    double notas[] = {2.4,4,3,3,3.5};
    Estudiante e = new Estudiante(notas,p,"V","456","poo");
        //Direccion estudiante
        System.out.println(e.getDireccion());
        //Direccion profesor asignado al estudiante;
        System.out.println(e.getAsignado().getDireccion());
        System.out.println(e.getMateria());
        System.out.println(e.calcularPromedio());
        
        
    }
}
