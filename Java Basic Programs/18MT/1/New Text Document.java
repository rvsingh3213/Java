/*
How to create thread
There are two ways to create a thread:

1.By extending Thread class
2.By implementing Runnable interface.

*/

1.Code

public class cube extends Thread
{
public void run()
 {
 System.out.println("Thread is Running");

 }
public static void main(String args[])
{
cube obj=new cube();
obj.start();
}
}

2.Runnable Interface

public class cube implements Runnable
{
public void run()
 {
 System.out.println("Thread is Running:runnale interface");

 }
public static void main(String args[])
{
cube obj=new cube();
Thread t=new Thread(obj);
t.start();
}
}

