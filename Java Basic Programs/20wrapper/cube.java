/*Wrapper classes provides way to convert primitive type into object type and vice-versa.
 */
public class cube{

public static void main(String args[])
{
int i=100;
Integer s=i;  //by compiler
Integer a=Integer.valueOf(i);
System.out.println(s+" "+a+"\n\n");

Integer i_obj=new Integer(30);
int r=i_obj; //implicit
int k=i_obj.intValue();

System.out.println(r+" "+k);

}
}