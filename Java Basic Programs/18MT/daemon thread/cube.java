
/*daemon thread is  like a service provider it provides the services to the user threads. it is running until the user threads are running. if there
 is no user thread it automatically dies. eg of daeomn threads gc,finalizer

low priority Threads,provides background serivces to user Threads.

*/


import java.util.*;

public class cube extends Thread
{  
	public void run()
	{
	if(Thread.currentThread().isDaemon())
	 {
	   System.out.println("Daemon thread running");
	 }
	else
	   System.out.println("User Thread Working");
	}
  public static void main(String args[])
   {
    cube t1=new cube();
    cube t2=new cube();
    cube t3=new cube();
	
	t1.setDaemon(true);

	t1.start();	
	t2.start();
	t3.start();


   }


}