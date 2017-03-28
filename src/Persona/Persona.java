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
public class Persona {
    protected String direccion;
    protected String telefono;
    protected String materia;

    public Persona(String direccion, String telefono, String materia) {
        this.direccion = direccion;
        this.telefono = telefono;
        this.materia = materia;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getMateria() {
        return materia;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }
    
    
}
