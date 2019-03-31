/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaPackage.io.InputStreamClass;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.SequenceInputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;

/**
 *
 * @author Priyang
 */
/*
    public class SequenceInputStream extends InputStream
    
        This class is used to combine two or more 
            inputStreams in one Object

*/


public class SequenceInputStreamDemo {
    /*
    Constructors :
    SequenceInputStream(InputStream s1, InputStream s2)
    creates a new input stream by reading the data of
    two input stream in order, first s1 and then s2.

    SequenceInputStream(Enumeration e)	
    creates a new input stream by reading the data of 
    an enumeration whose type is InputStream
    */
    
    public static void main(String[] args) throws IOException {
        
        /*
        methods : 
            	available();
                close();
            read();
            read(byte[] b,int offset);
        
        
        methods from InputStream :
            mark, markSupported, read, reset, skip
        
        
        */
        
        FileInputStream fis1 = new FileInputStream("d:/java1/A.txt");
        FileInputStream fis2 = new FileInputStream("d:/java1/B.txt");
        FileInputStream fis3 = new FileInputStream("d:/java1/C.txt");
        
        SequenceInputStream sis = new SequenceInputStream(fis1,fis2);
        
        int a=0;
        while((a=sis.read())!=-1)
            System.out.print((char)a);
        
        sis.close();
        System.out.println("\n\n\n\n\ntraversing again for three files:");
        
        fis1 = new FileInputStream("d:/java1/A.txt");
         fis2 = new FileInputStream("d:/java1/B.txt");
         fis3 = new FileInputStream("d:/java1/C.txt");
        ArrayList<FileInputStream> list = new ArrayList<>();
        list.add(fis1);
        list.add(fis2);
        list.add(fis3);
        
        
        SequenceInputStream stream = new SequenceInputStream(Collections.enumeration(list));
        
        int a1=0;
        while((a1=stream.read())!=-1)
            System.out.print((char)a1);
        stream.close();
    }
}
