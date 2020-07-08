/*
Deeerialisation is a Reverse process of Sezialization

ObjectInputStream class use to deserialize the object. using its Function readObject()

*/

import java.io.Serializable;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

class Employee implements Serializable
{
int id;
String name;
Employee(){}
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

//Now Deserialize

ObjectInputStream obj2=new ObjectInputStream(new FileInputStream("F:\\rv1.txt"));
Employee s_obj=new Employee();
try{
s_obj=(Employee)obj2.readObject();
}
catch(Exception e){System.out.println();}
System.out.println("\n\nDeserializing Now:");
System.out.println("Id:"+s_obj.id+"\nName:"+s_obj.name);
obj2.close();

}
}