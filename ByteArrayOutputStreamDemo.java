/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaPackage.io.OutputStreamClass;

import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 *
 * @author Priyang
 */

/*
public class ByteArrayOutputStream extends OutputStream 
fields :
    byte[] buffer;
    int count;//no. of valid bytes
*/
public class ByteArrayOutputStreamDemo {
    /*
    Constructors :
    1.ByteArrayOutputStream();
    2.ByteArrayOutputStream(int size);
    */
    
    
    /*
    methods : 
    close()
    reset()
        --reset the count to 0
    int size"()
        --returns current size of buffer
    tobyteArray()
        --creates a newly allocated byte[]
    toString()
    
    */
    
    public static void main(String[] args) throws Exception {
        
        ByteArrayOutputStream baos1 = new ByteArrayOutputStream();
        ByteArrayOutputStream baos2 = new ByteArrayOutputStream(100);
        
        System.out.println(baos1.size());
        System.out.println(baos2.size());
        
        baos1.write("Hello".getBytes());
        baos2.write("HelloJava".getBytes());
        
        System.out.println(baos1.size());
        System.out.println(baos2.size());
    
        System.out.println(baos1.toString());
        System.out.println(baos2.toString("UTF-8"));
    
        baos1.reset();//if we want to overwrite everything
                //in Buffer
                
                
        baos1.write("Friends".getBytes());
        System.out.println(baos1.toString());
        
        FileOutputStream fis1 = new FileOutputStream("d:/java1/A.txt");
        FileOutputStream fis2 = new FileOutputStream("d:/java1/B.txt");
    
        baos2.writeTo(fis1);
        baos2.writeTo(fis2);
        
        baos2.writeTo(System.out);
        
        baos1.close();
        baos2.close();
    }
    
    /*
    flush(), write(byte[] b)
Methods inherited from class java.io.OutputStream
    */
}
