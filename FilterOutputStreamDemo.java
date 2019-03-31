
import java.io.FileOutputStream;
import java.io.FilterOutputStream;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*


public class FilterOutputStream extends OutputStream :

subclasses : BufferedOutputStream, CheckedOutputStream, 
CipherOutputStream, DataOutputStream, DeflaterOutputStream, 
DigestOutputStream, InflaterOutputStream, PrintStream



This class is the superclass of all classes that filter output streams
    field  :
        protected OutputStream out;
            The underlying output stream to be filtered.

*/

/*
    Constructor :
        FilterOutputStream(OutputStream out)
            Creates an output stream filter built on top of the
            specified underlying output stream.
*/
public class FilterOutputStreamDemo {
    
    /*
    methods : 
        close();
        flush();
        write(byte[] b);
        write(byte[] b,int offset , int length);
        write(int b);
    */
    public static void main(String[] args)throws Exception {
         FilterOutputStream fos = new FilterOutputStream(new FileOutputStream("d:/A.java"));
         
         fos.write("Hello Folks".getBytes());
         fos.flush();
         fos.close();
         
    }
   
    
}
