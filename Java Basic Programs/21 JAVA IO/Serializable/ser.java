/*
Serialisation is a mechanism of writing the object state into file Stream.

Class must implement the serializable interface whose object has to be serialised.

serializable is a Marker Interface(which has no data mem or mem function).

ObjectOutputStream class use to serialize the object. using its Function writeObject()

*/

import java.io.Serializable;
import java.io.ObjectOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

class Employee implements Serializable
{
int id;
String name;

Employee(int i,String n)
{
this.id=i;
this.name=n;
}

}
public class cube
{
public static void main(String args[]) throws IOException
{
FileOutputStream fos=new FileOutputStream("F:\\rv1.txt");

ObjectOutputStream obj=new ObjectOutputStream(fos);

Employee s=new Employee(1881,"Ravi");

try{
obj.writeObject(s);
System.out.println("Object Written");
obj.flush();

}
catch(Exception e){System.out.println(e);}
}


}