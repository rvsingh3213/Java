/* Thread Group multiple threads are group to form a single object so we can do the suspend,resume operation on multiple

threads using single method call.

*/

public class cube implements Runnable
{
 public void run()
	{}
public static void main(String args[])
{
cube obj=new cube();

ThreadGroup tg1=new ThreadGroup("ThreadGP");

Thread t1=new Thread(tg1,obj,"first");
Thread t2=new Thread(tg1,obj,"Second");
Thread t3=new Thread(tg1,obj,"Third");


System.out.println("Thread Group Name:"+tg1.getName());

tg1.list();

}




}