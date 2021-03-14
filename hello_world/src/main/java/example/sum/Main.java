/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package example.sum;

import java.io.DataInputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author aeremina
 */
public class Main {
    public static void main(String[] argv) {
        try {
            String s;
            int a, b, c;
            // Standart data type
            DataInputStream dis = new DataInputStream(System.in);
            s = dis.readLine();
            a = Integer.parseInt(s);
            s = dis.readLine();
            b = Integer.parseInt(s);
            c = a + b;
            System.out.println(a + " + " + b + " = " + c);
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
