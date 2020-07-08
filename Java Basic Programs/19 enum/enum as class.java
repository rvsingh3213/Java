/*Enumeration is a list of names

enum states{

pb(5),hr(10),jk(15),uk(20),hp(25),dl(30);
private int num;

states(int p){num=p;}
int getnum(){return num;}


}
public class cube{

public static void main(String args[])
{

states obj;
for(states s:states.values())
System.out.println("num of states "+s+" is:"+s.getnum());

}


}