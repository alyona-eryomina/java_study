/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package example.i_ex;

import example.i_ex.Op.BOp;
import example.i_ex.Op.Iop;
import example.i_ex.P.A;
import example.i_ex.P.B;
/**
 *
 * @author aeremina
 */
public class Main {
    public static void main(String[] args) {
        A obj1= new B(10, 20);
        obj1.print();
        
        //Iop op = BOp.build();
        
        Iop max = new Iop(){
            @Override
            public int init() {
                return Integer.MIN_VALUE;
            }

            @Override
            public int op(int a, int b) {
                if (a > b) return a;
                return b;
            }
        };
        
        Algorithm a = new Algorithm(max);
        
        int[] arr;
        arr = new int[10];
        for (int i = 0; i < 10; i++) {
            arr[i] = i;
        }
        
        System.out.println("Result = " + a.calc(arr, 5));
        
        Iop2 op1 = new Iop2(){
            @Override
            public int op(int a, int b) {
                return a + b;
            }
        };
        
        System.out.println("Result = " + op1.op(2, 3));
        
        // lambda
        Iop2 op2 = (a1, b1) -> {
            return a1*b1;
        };
        
        System.out.println("Result = " + op2.op(2, 3));
    }
}
