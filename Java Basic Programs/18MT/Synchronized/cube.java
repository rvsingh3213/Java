/* Concept of Synchronisation:- it controls the access to the shared resource.like if two or more threads want to access
 the shared resource

then sync. would ensure that at one time only one Thread can access it.

It uses the concept of Monitor.if One Thread is has been locked up for the Method it is called "entered " monitor and 

during this time no other thread can enter into the Monitor if other try they will be suspended and are called "waiting" monitor

When it leaves is called "exit" monitor.

The Method which is Described as "synchronised" Method will let only one thread at time to enter into it.


*/

class call_d		//call which is being called
{
	synchronized public void show(String s)
	 {
	 	System.out.print("["+s);
		 try
	 	   {
			Thread.sleep(1000);		   

		   }
		 catch(InterruptedException e)
		   {
			System.out.println(e);		   

	  	    }			

	 	System.out.println("]");
	}

}


class call_er implements Runnable	//class which call
{
call_d target;
String s;
Thread t;
call_er(String ss,call_d trg)
{
s=ss;
target=trg;
t=new Thread(this);
t.start();

}

public void run()
{
target.show(s);

}


}
public class cube
{

public static void main(String args[])
{
call_d target=new call_d();

call_er obj1=new call_er("hello",target);
call_er obj2=new call_er("java",target);
call_er obj3=new call_er("practical",target);



}

}
