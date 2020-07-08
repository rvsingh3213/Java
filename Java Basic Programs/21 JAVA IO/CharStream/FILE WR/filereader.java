/*
FileReader is a Character Stream class which used to read data from the file.

it returns the data in byte Format.

int read() <--RType int so need Explicit Conversion
*/

import java.io.FileReader;
import java.io.IOException;

public class cube
{
public static void main(String args[]) throws IOException
{
FileReader fr=new FileReader("F:\\rv.txt");
int i=0;
try{
  while((i=fr.read())!=-1)
      {
	System.out.print((char)i);

      }
   fr.close();
   }
catch(Exception e){System.out.println(e);}
}
}