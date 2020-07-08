//Final Keyword
/*used with
1.variable: to prevent any change into its value
2.method:final method can't get overriden
3.class:final class can't be inherited
*/
import java.util.*;



 class A
{ 
  

final void Show(){
   System.out.println("A class method");

   }

}
class B extends A
{

void Show(){
   System.out.println("B class method");

   }

}

public class cube
{
public static void main(String args[])
{
A obj=new A();
obj.Show();

}


}