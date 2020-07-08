/*
BufferWriter Class used to provide buffer to read data from file.makes performance fast

*/

import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class cube
{
public static void main(String args[]) throws IOException
{
FileReader fr=new FileReader("F:\\rv.txt");
BufferedReader buf_obj=new BufferedReader(fr);
int i=0;
try{
  while((i=buf_obj.read())!=-1)
	{
	System.out.print((char)i);
	}
  buf_obj.close();
   }
catch(Exception e){System.out.println(e);}
}
}