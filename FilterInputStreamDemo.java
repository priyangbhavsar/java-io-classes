/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaPackage.io.InputStreamClass.FilterInputStreamClass;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FilterInputStream;

/*


public class FilterInputStream extends InputStream :

subclasses : BufferedInputStream, CheckedInputStream, 
CipherInputStream, DataInputStream, DeflaterInputStream, 
DigestInputStream, InflaterInputStream, PrintStream



This class is the superclass of all classes that filter input streams
    field  :
        protected InputStream in;
            The underlying input stream to be filtered.

*/

/*
    Constructor :
        private FilterInputStream(InputStream in)
            This constructor of FilterInputStream is private
                We can't access it outside the class
            Creates an input stream filter built on top of the
            specified underlying input stream.
*/
public class FilterInputStreamDemo {
    public static void main(String[] args) throws Exception{
        
        /*
        methods : 
            int available()
This method returns an estimate of the number of bytes that can be read (or skipped over) from this input stream without blocking by the next caller of a method for this input stream.

2	void close()
This method closes this input stream and releases any system resources associated with the stream.

3	void mark(int readlimit)
This method marks the current position in this input stream.

4	boolean markSupported()
This method tests if this input stream supports the mark and reset methods.

5	int read()
This method reads the next byte of data from this input stream.

6	int read(byte[] b)
This method reads up to byte.length bytes of data from this input stream into an array of bytes.

7	int read(byte[] b, int off, int len)
This method reads up to len bytes of data from this input stream into an array of bytes.

8	void reset()
This method repositions this stream to the position at the time the mark method was last called on this input stream.

9	long skip(long n)
This method skips over and discards n bytes of data from this input stream.
        */
        
        FilterInputStream fis = new BufferedInputStream(new FileInputStream("d:/A.java"));
        
        System.out.println((char)fis.read());
        System.out.println((char)fis.read());
        System.out.println((char)fis.read());
        System.out.println((char)fis.read());
        System.out.println((char)fis.read());
        
        fis.skip(10);
        System.out.println((char)fis.read());
        fis.close();
    }
}
