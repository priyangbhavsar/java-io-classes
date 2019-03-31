/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaPackage.io.OutputStreamClass;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;


//extends Object implements Closable , Flushable
public class OutputStreamDemo {
    public static void main(String[] args) throws IOException{
        
        OutputStream os = new BufferedOutputStream(System.out);
        //os.write(121); it is an abstract method write(int i);
        
        
        String s = "\nHello world\n";
         os.write(new byte[]{97,98,99,100});
        os.write(s.getBytes());
        os.write(s.getBytes(), 4, s.length()-4);
         os.flush();
    }
}
