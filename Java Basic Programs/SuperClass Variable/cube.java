class A
{ 
void display()
{
System.out.println("This is Class A");
}
} //class a end

class B extends A
{ void show()
{System.out.println("class b show func"); }

}

//class b end
class cube
{

public static void main(String arg[])
{
B b1= new B();
b1.show();
b1.display();
                                                                                                               
}	}