/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaPackage.io;


/*
public class ObjectStreamField
extends Object
implements Comparable<Object>
*/

/*
A description of a Serializable field from a 
Serializable class. An array of ObjectStreamFields is
used to declare the Serializable fields of a class.
*/
public class ObjectStreamFieldDemo {
    /*
    constructors :
    ObjectStreamField(String name, Class<?> type)
    Create a Serializable field with the specified type.
    
    ObjectStreamField(String name, Class<?> type, boolean unshared)
    Creates an ObjectStreamField representing a serializable field with the given name and type.
    
    
    */

    public static void main(String[] args) {
        /*
        1
int compareTo(Object obj) 
This method compares this field with another ObjectStreamField.
2
String getName() 
This method gets the name of this field.
3
int getOffset() 
This method returns the offset of field within instance data.
4
Class<?> getType() 
This method gets the type of the field.
5
char getTypeCode() 
This method returns character encoding of field type.
6
String getTypeString() 
This method returns the JVM type signature.
7
boolean isPrimitive() 
This method returns true if this field has a primitive type.
8
boolean isUnshared() 
This method returns boolean value indicating whether or not the serializable field represented by this ObjectStreamField instance is unshared.
9
protected void setOffset(int offset) 
This method returns offset within instance data.
10
String toString() 
This method returns a string that describes this field.
        */
    }
}
