/*
BufferWriter Class used to provide buffer to write into the file.makes performance fast

*/

import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;

public class cube
{
public static void main(String args[]) throws IOException
{
FileWriter fr=new FileWriter("F:\\rv.txt");
BufferedWriter buf_obj=new BufferedWriter(fr);
int i=0;
try{
  buf_obj.write("This is data is to be written on file");
  System.out.println("Data Written");
  buf_obj.close();
   }
catch(Exception e){System.out.println(e);}
}
}