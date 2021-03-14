/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package example.i_ex.P;

/**
 *
 * @author aeremina
 */
public class B extends A {
    int b;
    
    public B(int a, int b) {
        super(a);
        
        this.b = b;
    }
    
    @Override
    public void print() {
        super.print();
        
        System.out.println("B = " + b);
    }
}
