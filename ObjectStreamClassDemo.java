/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaPackage.io;

import java.io.ObjectStreamClass;
import java.io.ObjectStreamField;

/**
 *
 * @author Priyang
 */

/*
public class ObjectStreamClass
extends Object
implements Serializable

this class is serialization descriptor class
this class contains the name and serialVersionUID of the class.
it can find specific class loaded in java vm using lookup() method

fields :
    static ObjectStreamField[] NO_FIELDS;
        indicating no serializable fields
*/
public class ObjectStreamClassDemo {
    //no constructors

    public static void main(String[] args) {
            ObjectStreamClass osc = ObjectStreamClass.lookup(java.lang.Integer.class);
            System.out.println(osc.forClass());
            
            ObjectStreamField[] fields=osc.getFields();
            for(ObjectStreamField field : fields)
                System.out.println(field.getName());
    
            System.out.println(osc.getSerialVersionUID());
            System.out.println(osc.toString());
    }
    
}
