/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaPackage.io.InputStreamClass.FilterInputStreamClass;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


//public class BufferedInputStream extends FilterInputStream
/*
fields : 
    protected byte[] buf;
        used as buffer
    
    protected int count;
        length of buffer
        
    protected int marklimit :
        maximum read ahead allowed between mark() and reset() methods
        
    protected int markpos :
        marked position with mark() method

    protected int pos :
        current buffer position
*/

public class BufferedInputStreamDemo {
    
    /*
         Constructor :
        public BufferedInputStream(InputStream in)
            Creates an input stream Buffer built on top of the
            specified underlying input stream.
    
            public BufferedInputStream(InputStream in , int size)
            size parameter specifoes size of buffer
    */
    
    
    public static void main(String[] args) throws FileNotFoundException, IOException {
        
        /*
        Methods :
       -- from current class or overridden
        1.available()
        2.close()
        3.mark()
        4.markSupported()
        5.read()
        6.read(byte[] b,int off,int len)
        7.reset()
        8.skip(long n)
        
        --inherited from FilterInputStream class
        1.read(byte[] b)
        */
        
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("d:/A.java"));
        
        System.out.println((char)bis.read());
        System.out.println((char)bis.read());
        System.out.println((char)bis.read());
        System.out.println((char)bis.read());
        System.out.println((char)bis.read());
        
        
        bis.mark(5);
        System.out.println("after mark..");
        for(int i=0;i<=5;i++)
            System.out.println((char)bis.read());
        
        bis.reset();
        
        System.out.println("after reste");
        for(int i=0;i<5;i++)
            System.out.println((char)bis.read());
    }
    
}
