//Dynamice Method Dispatch
/*When a call to an overriden method is resolved at runtime rather than compile time
This is How It Implements Runtime Polymorphism.

Super class reference variable can be used to refer the subclass object
java uses this concept to resolve the CALL to an overriden method.

*/
import java.util.*;

class A
{
	
void show(){
System.out.println("A class Method");	
   }

}

class B extends A
{

void show(){
System.out.println("B class Method");   

   }
}

class C extends A
{
void show(){
  System.out.println("C class Method");  

   }

}


public class cube
{
public static void main(String args[])
{
A a=new A();
B b=new B();
C c=new C();

A r;//reference of type A

r=a;
r.show();

r=b;
r.show();

r=c;
r.show();

}


}