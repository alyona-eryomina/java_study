/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package example.i_ex.Op;

/**
 *
 * @author aeremina
 */
class Sum implements Iop {

    @Override
    public int init() {
        return 0;
    }

    @Override
    public int op(int a, int b) {
        return a + b;
    }
    
}
