/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaPackage.io.OutputStreamClass;

import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.nio.channels.FileChannel;

/**
 *
 * @author Priyang
 */

//public class FileOutputStream extends OutputStream
/*
    5 constructors : 
    FileOutputStream(File f);
    FileOutputStream(File f,boolean b);  
        --if we don't want to remove previous records then we
        --will make boolean value true
    FileOutputStream(String s);
    FileOutputStream(String s,boolean b);
    FileOutputStream(FileDescriptor fd);
*/

public class FileOutputStreamDemo {
 
    public static void main(String[] args) throws Exception{
        
        //finalize() method implemented to call close()
        //method of OutputStream class if no Object attached with refrance
        
        /*write(byte[] b) , write(byte[] b,int offset,int length) : 
            this method implemented here from OutputStream class 
        
            write(int i) :
            implemented in this class declared in parent class
        */  
        
        FileOutputStream fos = new FileOutputStream("d:/A.java");
        FileChannel fc = fos.getChannel();
        FileDescriptor fd = fos.getFD();
                
        
    }
    
}
