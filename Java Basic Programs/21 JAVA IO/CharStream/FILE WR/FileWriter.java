/*
FileWriter is a Character Stream class which used to write data into the file.

unlike FileOutputStream we dont need to convert the data into byte directly write into string
*/

import java.io.FileWriter;
import java.io.IOException;

public class cube2
{
public static void main(String args[]) throws IOException
{
FileWriter fw=new FileWriter("F:\\rv.txt");
try{
  fw.write("this string is getting written on file");
  fw.close();
  System.out.println("Data Written");
   }
catch(Exception e){System.out.println(e);}
}
}