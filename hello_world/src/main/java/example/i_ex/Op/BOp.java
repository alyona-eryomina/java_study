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
public class BOp {
    static public Iop build() {
        //return new Sum();
        return new Mult();
    }
}
