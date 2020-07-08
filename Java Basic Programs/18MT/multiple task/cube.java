/*PERFORMING Multiple Tasks By Multiple Threads*/
 class cube1 extends Thread
{

 public void run()
	{
	System.out.println("Thread func 1");
	}
}

 class cube2 extends Thread
{
 public void run()
	{
	System.out.println("Thread func 2");
	}

}

//output depends upon which thread has been selected by Thread Scheduler

public class cube 
{

public static void main(String args[])
{
cube1 obj1=new cube1();
cube2 obj2=new cube2();

obj1.start();
obj2.start();
}

}