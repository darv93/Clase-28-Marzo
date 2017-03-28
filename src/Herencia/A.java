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
public class A {
    protected int a1;
    
    public A (int a){
        this.a1=a;
    }
    
    public void xx(){
        System.out.println("En A");
    }
    
    public void setA(int a){
        this.a1=a;
    }
    
    public int getA(){
        return this.a1;
    }
}
