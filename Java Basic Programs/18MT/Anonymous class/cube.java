import java.util.*;



class cube extends Thread
{

	public static void main(String args[])
	{  
	   Thread t1=new Thread() {public void run()
				  
					{  System.out.println("Thread1 task:\n");
					}
				
				};
	   Thread t2=new Thread(){ public void run()
				  
					{  System.out.println("Thread2 task:\n");
					}
				
				};  
	t1.start();				
	t2.start();

	}


}