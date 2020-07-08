/* Reading data from console console class.

is in java.io.Console package.

can read text and passwordsS

*/

import java.io.*;

public class cube{
public static void main(String args[]) throws IOException
{
System.out.println("Enter the Name:");
String name=System.console().readLine();
System.out.println("\n\nEntered Name is:"+name);

}

}

