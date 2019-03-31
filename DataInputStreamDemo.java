/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaPackage.io.InputStreamClass.FilterInputStreamClass;

import java.io.DataInputStream;
import java.io.IOException;
import javaPackage.io.DataInputDemo;

/**
 *
 * @author Priyang
 */

/*
public class DataInputStream implements DataInput
fields : 
    InputStream in ;
    inherited from FilterInputStream
*/
public class DataInputStreamDemo{
     /*
    constructor : 
        DataInputStream(InputStream in);
    */
    public static void main(String[] args) throws IOException {
         /*
        DataInputStream contains methods to read to
        InputStream for every primitives
        eg:boolean readBoolean();
    
        exception : for int we can use int readInt() method
                for String we can use String readUTF() method
    
        some other methods discussed here
        
      
    */
         
         DataInputStream dis = new DataInputStream(System.in);
         //System.out.println(dis.readLine());//deprecated
         byte[] b=new byte[5];
        dis.readFully(b);
        for(byte b1 : b)
            System.out.println((char)b1);
    
        /*int read(byte[] b) : 
            returns number of bytes read -1 if no bytes read 
        */
    }
}
