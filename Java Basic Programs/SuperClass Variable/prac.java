import java.util.*;

class A{

  void func(){ System.out.println("A class func");}

}

class B extends A{
	
 void func(){System.out.println("B class function");}

}

class C extends A{

  void func(){System.out.println("C class Function");}


}


public class prac{


public static void main(String args[])
{
 A obj=new A();
  
 A a=new A();
 B b=new B();
 C c=new C();

 obj=a;
 obj.func();

 obj=b;
 obj.func();

 obj=c;
 obj.func();



}




}