/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaPackage.io.InputStreamClass;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 *
 * @author Priyang
 *///it is an interface extends Object and implements Closable
//superclass of all InputStream type classes
public class InputStreamDemo {
    
    public static void main(String[] args) throws IOException{
        
        InputStream inputStream = new FileInputStream("d:/A.java");
        System.out.println(inputStream.available());
        //returns astimated number of bytes
        
        System.out.println(inputStream.markSupported());
       //FileInputStream doesnot support mark features BufferedInputStream does support
       
        byte[] b = new byte[inputStream.available()];
        
        inputStream.read(b);
        
        
        for(byte b1 : b)
        {
            
            System.out.print((char)b1);
        
        }
        System.out.println("Read is an abstract method : "+inputStream.read());
        
        inputStream.close();
        
        inputStream = new BufferedInputStream(new FileInputStream("d:/a.java"));
        
        System.out.println("\n\n------Buffered Input Stream-----");
        System.out.println("mark supported : "+inputStream.markSupported());
        
        System.out.println((char)inputStream.read());
        
        inputStream.mark(0);
        
        System.out.println((char)inputStream.read());
        System.out.println((char)inputStream.read());
        System.out.println((char)inputStream.read());
       
            inputStream.reset();
            System.out.println("back to mark.."+(char)inputStream.read());
        
    }
    
}
