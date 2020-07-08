/* java Buffered I/O stream makes performance fast

*/
import java.io.*;

public class cube
{
public static void main(String args[])throws IOException
{
FileOutputStream fos=new FileOutputStream("F:\\rv.txt");
BufferedOutputStream bos=new BufferedOutputStream(fos);
String s="this is getting store using buffer";
byte b[]=s.getBytes();

try{
bos.write(b);
bos.close();
System.out.println("Data Written");
    }
catch(Exception e)
{System.out.println(e);}



}


}