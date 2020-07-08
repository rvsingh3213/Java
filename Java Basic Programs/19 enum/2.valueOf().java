/*Method of enum
1. values() it will return the all the elements of defined enum as an array like here.

also enum must not be declared locally

2.valueOf() this function return the value of enum which is being defined.see output

*/ 

enum states{pb,jk,hp,hr,dl,up,uk}

public class cube
{

public static void main(String args[])
{

states obj=states.dl;

System.out.println(obj+"\n");

obj=states.valueOf("jk");

System.out.println(obj);

}


}