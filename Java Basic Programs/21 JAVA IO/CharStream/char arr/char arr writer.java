/*
CharArrayWriter this class is used to write the common data  to multiple Files
it inherits the Writer class.
size of its buffer auto grows as data is written into its buffer

*/

import java.io.CharArrayWriter;
import java.io.FileWriter;
import java.io.IOException;

public class cube
{
public static void main(String args[]) throws IOException
{
CharArrayWriter cw=new CharArrayWriter();
FileWriter fr1=new FileWriter("F:\\rv1.txt");
FileWriter fr2=new FileWriter("F:\\rv2.txt");
FileWriter fr3=new FileWriter("F:\\rv3.txt");
FileWriter fr4=new FileWriter("F:\\rv4.txt");

try{
   cw.write("this is getting wrtn down to all files");
	
   cw.writeTo(fr1);
   cw.writeTo(fr2);
   cw.writeTo(fr3);
   cw.writeTo(fr4);
 
   cw.close();
   fr1.close();
   fr2.close();
   fr3.close();
   fr4.close();
   }
catch(Exception e){System.out.println(e);}
}

}