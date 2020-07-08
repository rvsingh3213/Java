/*Method of enum
1. values() it will return the all the elements of defined enum as an array like here.

also enum must not be declared locally

2.


*/ 

enum states{pb,jk,hp,hr,dl,up,uk}

public class cube
{

public static void main(String args[])
{


states arr[]=states.values();

for(states a:arr)
System.out.print(a+" ");



}


}