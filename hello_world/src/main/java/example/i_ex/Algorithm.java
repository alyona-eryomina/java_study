/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package example.i_ex;

import example.i_ex.Op.Iop;

/**
 *
 * @author aeremina
 */
public class Algorithm {
    Iop op;

    public Algorithm(Iop op) {
        this.op = op;
    }
    
    int calc(int a[], int n) {
        int v = op.init();
        for(int i = 0; i < n; i++) {
            v = op.op(a[i], v);
        }
        return v;
    }
}
