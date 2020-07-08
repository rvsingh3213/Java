/*Creating object of Console  and reading id + password
char [] readPassword()  <---reatruns char array

is in java.io.Console package.

can read text and passwordsS

*/

import java.io.*;

public class cube
{
public static void main(String args[])
{
Console c=System.console();
System.out.print("Enter id:");
String id=c.readLine();

System.out.print("\n\nEnter Password:");
char arr[]=c.readPassword();
String pass=new String(arr);

System.out.print("\n\nEntered id is:"+id);

System.out.print("\n\nEntered pass is:"+pass);

}


}