// A class that can refer to any type is called generic class

import java.util.*;


class my_gen<T>{
T obj;

void add(T obj)
{
 this.obj=obj;
}

T get()
{
  return obj;
}

}

public class cube
{

public static void main(String args[])
{
my_gen<String> ob1=new my_gen<String>();
ob1.add("Ravi");
String s=ob1.get();
System.out.println("name:"+s);


my_gen<Integer> int_val=new my_gen<Integer>();
int_val.add(1881);
System.out.println("Int:"+int_val.get());

}


}