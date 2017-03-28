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
public class Clase28Marzo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        A a = new A(5);
        System.out.println(a.getA());
        a.xx();
        
        
       B b = new B(5,6);
       b.xx();
       b.yy();
       
       A c = new B(5,7);
       
    }
    
}
