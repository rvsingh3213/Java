import java.util.*;

public class cube extends Thread
{  
	public void run()
	{
	
	}
  public static void main(String args[])
   {
      cube t1=new cube();	
      cube t2=new cube();
      
      System.out.println("Prev Thread name:"+t1.getName()+"\n");
      t1.setName("rvTHREAD1");
      System.out.println("Changd Thread name:"+t1.getName());
      System.out.println(t1.getPriority());
      t1.setPriority(Thread.NORM_PRIORITY);
	
      System.out.println("Prev Thread name:"+t2.getName()+"\n");
      t1.setName("rvTHREAD2");
      System.out.println("Changd Thread name:"+t2.getName());
      System.out.println(t2.getPriority());
      t1.setPriority(10);
	
   }


}