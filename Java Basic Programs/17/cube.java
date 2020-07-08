/*another kind of ambiguity even if we use interface but if there is variable with the same name.

//correct it by using interface name with variable

parent1.x;

*/



// First Parent class
interface Parent1 
{  int x=10;
    void fun();
}
 
// Second Parent Class
interface Parent2 
{ int x=30;
    void fun();
}


class cube implements Parent1, Parent2
{
public void fun()
  {	
 	System.out.println("inheritance using interface:"+x);
 

  }
   public static void main(String args[])
   {
       cube t = new cube();
       t.fun();
   }
}