/*InputStreamReader this class is used to translate the byte to characters

BufferedInputStream --use to read charac using buffer

*/

import java.io.*;
import java.lang.*;

public class cube
{
public static void main(String args[]) throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
String str[]=new String[100];
System.out.println("Enter Lines:");
  for(int i=0;i<100;i++)
  {
	str[i]=br.nextLine();
	if(str[i].equals("stop")) {break;	}

  }   
 
System.out.println("\n\nEntered Lines Are:");
for(int i=0;i<100;i++)
  {     

	System.out.println(str[i]);	
	if(str[i].equals("stop")) break;
  }   

  

}


}