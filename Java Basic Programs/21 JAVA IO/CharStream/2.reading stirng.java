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
String str;
System.out.print("Enter Line:");
  
	str=br.readLine();
	System.out.print("\n\nEntered String:"+str);	


}


}