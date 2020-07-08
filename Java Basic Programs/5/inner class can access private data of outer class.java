import java.util.*;


public class cube
{	
	private int out_x;
	cube()
	{out_x=10;}
	
	void func()
	{
	  cube_inner in_obj=new cube_inner();	
	  in_obj.show();

	}
	class cube_inner
	{
		public void show()
		{
			System.out.println("Value of Outer_X:"+out_x);		

		}		


	}
	

public static void main(String args[])
{ 
Scanner sc=new Scanner(System.in);
cube obj=new cube();

System.out.println("Enter NUmber:");
obj.out_x=sc.nextInt();  //here mem func main accesing private data
			//of its own class
obj.func();

}

}