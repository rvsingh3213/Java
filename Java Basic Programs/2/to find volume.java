import java.util.*;

class vol
{
int length,height,breadth;
vol()
{length=0;
height=0;breadth=0;

}



public void volume()
{
System.out.println("Volume is:"+length*height*breadth);
}
}

	
public class cube
{

public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
vol obj=new vol();
System.out.println("ENter length:");
obj.length=sc.nextInt();


System.out.println("ENter width:");
obj.breadth=sc.nextInt();

System.out.println("ENter height:");
obj.height=sc.nextInt();
obj.volume();


}

}