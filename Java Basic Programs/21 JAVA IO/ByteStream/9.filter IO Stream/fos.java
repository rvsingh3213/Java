/* FilterOutputStream implements Outputstream

*/

import java.io.*;

public class cube{
public static void main(String args[]) throws IOException
{

FileOutputStream fis=new FileOutputStream("F:\\rv1.txt");

FilterOutputStream fos=new FilterOutputStream(fis);
String s="writing to file  string";
byte[]b=s.getBytes();

try{
  
fos.write(b);    
System.out.println("Success");

   }
catch(IOException e){System.out.println(e);}
}

}

