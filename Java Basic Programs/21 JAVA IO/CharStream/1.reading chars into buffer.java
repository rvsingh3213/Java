/*InputStreamRreader this class is used to translate the byte to characters

BufferedInputStream --use to read charac using buffer

*/

import java.io.*;
import java.lang.*;

public class cube
{
public static void main(String args[]) throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
char c;
System.out.print("Enter character:");
	do{ 
	    c=(char)br.read();
	    System.out.print(c);	

   }while(c!='q');
  

}


}