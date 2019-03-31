/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaPackage.io.OutputStreamClass.FilterOutputStreamClass;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;


/*
    class BufferedOutputStream extends FilterOutputStream :

    fields : 
        1. protected byte[] buffered :
            buffer where data stores

        2.protected int count : number of valid bytes in buffer

        3.protected OutputStream out :
            inherited from FilterOutputStream
*/

public class BufferedOutputStreamDemo {
    
    /*
    Constructors :  
        1. BufferedOutputStream(OutputStream out) : 
        2. BufferedOutputStream(OutputStream out,int size) :
            created buffer with size given to the parameter
    */
    
    public static void main(String[] args) throws Exception{
        
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("d:/A.java"));
        
        bos.write(97);//implemented in this class
        bos.write("\nhello".getBytes(), 0, 3);//implemented in this class
        
        bos.write("how r u".getBytes());//inherited from FilterOutputStream
        
        bos.flush();//implemented in this class
        bos.close();//inherited from parent
    }
    
}
