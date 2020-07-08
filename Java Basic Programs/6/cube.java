//methods of inner class can access the outer cclass members but Opposite is not true

//y is declared instace of inner class this is unknown to outer calss
import java.util.*;


public class cube
{	
	
	
	void func()
	{
	  cube_inner in_obj=new cube_inner();	
		System.out.println("Inner class y:"+y);	  

	}
	class cube_inner
	{	int y;

		cube_inner()
		{y=10;}
					

	}
	
		

public static void main(String args[])
{ 
Scanner sc=new Scanner(System.in);
cube obj=new cube();

obj.func();

}

}