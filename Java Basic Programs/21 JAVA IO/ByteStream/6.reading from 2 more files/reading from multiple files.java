/* 
SequenceInputStream is used to read data from multiple files

*/
import java.io.*;

public class cube
{
public static void main(String args[])throws IOException
{
FileInputStream fis1=new FileInputStream("F:\\rv1.txt");
FileInputStream fis2=new FileInputStream("F:\\rv2.txt");
SequenceInputStream sis=new SequenceInputStream(fis1,fis2);

int i=0;
try{
while((i=sis.read())!=-1)
{
System.out.print((char)i);
}

   }
catch(Exception e){System.out.println(e);}

}


}