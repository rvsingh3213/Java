/* ByteArrayOutputStream class is used to write common data into multiple files.

the data is written into a byte array which can be written to multiple files

buffer of ByteArrayOutputStream grows  automatically according to data.

*/

import java.io.*;

public class cube{
public static void main(String args[]) throws IOException
{

FileOutputStream fis1=new FileOutputStream("F:\\rv1.txt");//for 1st file
FileOutputStream fis2=new FileOutputStream("F:\\rv2.txt"); //for 2nd file

ByteArrayOutputStream bos=new ByteArrayOutputStream();

try{
  
    bos.write('R');
    bos.writeTo(fis1);
    bos.writeTo(fis2);
  System.out.println("Success");

   }
catch(IOException e){System.out.println(e);}
}

}

