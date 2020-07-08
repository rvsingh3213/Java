1.
public class cube extends Thread
{
public void run()
 {
 for(int i=1;i<=5;i++)
{
try{ Thread.sleep(1000); }
catch(InterruptedException e){System.out.println(e); }
System.out.println(i);
 }
}
public static void main(String args[])
{
cube t1=new cube();
cube t2=new cube();
t2.start();
t1.start();
}

}
/*
//1st selected by scheduler enters into sleep then comes 2nd one which also enters into sleep
 then 1 resume and print 1 and
i++ then 1st sleep again 2nd print its value and this keep going until condition get false
*/


//WITHOUT sleep() method 1 thread executes and finish then next enters and finish