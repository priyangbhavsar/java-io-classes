/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaPackage.io.OutputStreamClass.FilterOutputStreamClass;

import java.io.DataOutputStream;
import java.io.IOException;
import javaPackage.io.DataOutputDemo;

/**
 *
 * @author Priyang
 */

/*
public class DataOutputStream
extends FilterOutputStream
implements DataOutput


fields : 
    protected int written;
    The number of bytes written to the
    data output stream so far.
*/
public class DataOutputStreamDemo{
    /*
    constructor : 
        DataOutputStream(OutputStream out);
    */
    
    
    
    /*
        DataOutputStream contains methods to write to
        OutputStream for every primitives
        eg:writeBoolean(boolean b);
    
        exception : for int we can use write(int i) or writeInt(int i) method
                for String we can use writeUTF(String s) method
    
        some other methods discussed here
        
        size() method returns size of buffer
    */
    
    public static void main(String[] args) throws IOException {
        DataOutputStream dos = new DataOutputStream(System.out);
        dos.writeBytes("abc\n");
        dos.flush();
        
        dos.writeChars("Heello\n");
        dos.flush();
        
        dos.writeUTF("JAva");
        dos.flush();
        dos.close();
    }
}
