/* FilterInputStream implements Inputstream

It contains different sub classes as BufferedInputStream, DataInputStream

FilterInputStream fos=new FilterInputStream(fis);   ---> this gives protected access error

FileInputStream may be the Abstract class
*/

import java.io.*;

public class cube{
public static void main(String args[]) throws IOException
{

FileInputStream fis=new FileInputStream("F:\\rv1.txt");

FilterInputStream fos=new BufferedInputStream(fis);
int i=0;
try{
while((i=fos.read())!=-1)
{    
System.out.print((char)i);
}
   }
catch(IOException e){System.out.println(e);}
}

}

