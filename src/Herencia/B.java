/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Herencia;

/**
 *
 * @author Estudiante
 */
public class B extends A{
    
    private int b1;
    
    public B(int b1, int a1) {
        super(a1);
        this.b1=b1;
    }
    
    public void yy(){
        System.out.println("yy");
    
    }
    
    @Override
    public void xx(){
        System.out.println("en B");            
    }
    
    
}

// P

/*
 
Persona , Estudiante, Profesor
Estudiante y Profesor heredan de persona

La app debe pedir por pantalla los datos para crear un objeto de la clase estudiante incluyendo el profesor tiene asignado.
Se sabe que un est para un semestre tiene 1 materia, 4 notas y 1 profesor.

Se debe mostrar en pantalla para cada estudiante el promedio, la materia y el profesor asignado. Direccion y telefono tanto del estudiante como del profesor.



*/

