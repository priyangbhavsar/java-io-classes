/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaPackage.io;




public interface DataOutputDemo {
    /*
    The DataOutput interface provides for converting data
    from any of the Java primitive types to a series 
    of bytes and writing these bytes to a binary stream.
    There is also a facility for converting a String into
    modified UTF-8 format and writing the resulting series of bytes.
    For all the methods in this interface that write bytes, it is generally true that if a byte cannot be written for any reason, an IOException is thrown.
    */
    
    
    /*
    methods :
    
    
void	write(byte[] b):
Writes to the output stream all the bytes in array b.
void	write(byte[] b, int off, int len)
Writes len bytes from array b, in order, to the output stream.
void	write(int b)
Writes to the output stream the eight low-order bits of the argument b.
void	writeBoolean(boolean v)
Writes a boolean value to this output stream.
void	writeByte(int v)
Writes to the output stream the eight low- order bits of the argument v.
void	writeBytes(String s)
Writes a string to the output stream.
void	writeChar(int v)
Writes a char value, which is comprised of two bytes, to the output stream.
void	writeChars(String s)
Writes every character in the string s, to the output stream, in order, two bytes per character.
void	writeDouble(double v)
Writes a double value, which is comprised of eight bytes, to the output stream.
void	writeFloat(float v)
Writes a float value, which is comprised of four bytes, to the output stream.
void	writeInt(int v)
Writes an int value, which is comprised of four bytes, to the output stream.
void	writeLong(long v)
Writes a long value, which is comprised of eight bytes, to the output stream.
void	writeShort(int v)
Writes two bytes to the output stream to represent the value of the argument.
void	writeUTF(String s)
Writes two bytes of length information to the output stream, followed by the modified UTF-8 representation of every character in the string s.
    */
}
