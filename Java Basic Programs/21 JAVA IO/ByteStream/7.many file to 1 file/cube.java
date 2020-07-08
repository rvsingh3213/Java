/* here is a code for reading multiple files and writing to single file

*/

import java.io.*;

public class cube{
public static void main(String args[])
{

FileInputStream fis1=null; //for 1st file
FileInputStream fis2=null; //for 2nd file

FileOutputStream fos=null; //for 3rd file
if(args.length!=2)
System.out.println("Error in  Input files");

else
{

try{
fis1=new FileInputStream(args[0]);
fis2=new FileInputStream(args[1]);

fos=new FileOutputStream("F:\\rv3.txt");

SequenceInputStream sis=new SequenceInputStream(fis1,fis2);
    int i=0;
	while((i=sis.read())!=-1)
	{
	  fos.write(i);
	  System.out.print((char)i);

	}


}//try end

catch(IOException e){System.out.println(e);}

}

}






}