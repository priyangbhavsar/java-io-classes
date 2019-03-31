/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaPackage.io.InputStreamClass;

import java.io.ByteArrayInputStream;

/**
 *
 * @author Priyang
 */

/*
public class ByteArrayInputStream extends InputStream  

fields : byte[] buf;
        int count;
        int mark;
        int pos;//urrent position
*/
public class ByteArrayInputStreamDemo {
    /*
    constructors :
    ByteArrayInputStream(byte[] ary) :
    ByteArrayInputStream(byte[] ary, int offset, int len) :
    ary is used as buffer in the object of ByteArrayInputStream
    */
    
    /*
    
    */
    
    public static void main(String[] args) throws Exception{
        ByteArrayInputStream bais = new ByteArrayInputStream("Hello JAVA".getBytes());
        System.out.println(bais.available());
        System.out.println((char)bais.read());
        System.out.println(bais.skip(3));
        System.out.println((char)bais.read());
    
        System.out.println(bais.markSupported());
        //mark() and reset() methods are also available
        bais.close();
    }
}
