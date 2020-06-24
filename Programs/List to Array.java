import java.util.ArrayList;
public class test {
   public static void main(String args[]){
      ArrayList<Integer> list = new ArrayList<>();
      list.add(100);
      list.add(200);
      list.add(300);

      System.out.println("Contents of list ::"+list);
      Integer[] myArray = new Integer[list.size()];
      list.toArray(myArray);

      for(int i=0; i<myArray.length; i++){
         System.out.println("index "+i+" "+myArray[i]);
      }
   }
}