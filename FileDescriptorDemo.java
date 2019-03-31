/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaPackage.io;

import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 *
 * @author Priyang
 */


//public final class FileDescriptor extends Object
//two its own methods
//public boolean valid() : return whether current object is valid or not
//                          empty object of File Descriptor is invalid
//public void sync() : confirms that the file has been written
public class FileDescriptorDemo {
    
    public static void main(String[] args) throws Exception{
         FileInputStream fis=null;
      FileOutputStream fos=null;
      try{
         fos = new FileOutputStream("d:/A.txt");
        FileDescriptor fd = fos.getFD();
        
        fos.write("Hello".getBytes());
        
        fos.flush();
       fd.sync();//Confirms that the file is written
        
        fis = new FileInputStream("d:/A.txt");
        int t=0;
        while((t=fis.read())!=-1)
        {
            System.out.print((char)t);
        }
      }
      catch(Exception e){
          System.out.println(e);
      }
      finally
      {
          if(fis!=null)
              fis.close();
          if(fos!=null)
              fos.close();
      }
    }
}
