

//https://practice.geeksforgeeks.org/problems/level-order-traversal-in-spiral-form/1/
//Level order traversal in spiral form

class Spiral
{
      void printSpiral(Node node) 
      {
           if(node ==null)return;
           
           
           Stack <Node>s1=new Stack<>();
           Stack <Node>s2=new Stack<>();
           s1.push(node);
           while(!s1.isEmpty() || !s2.isEmpty())
           {
               
               while(!s1.isEmpty()){
                   Node root=s1.pop();
                   
                   System.out.print(root.data+" ");
                   if(root.right!=null)
                   s2.push(root.right);
                   if(root.left!=null)
                   s2.push(root.left);
               }
               
              while(!s2.isEmpty()){
                   
                   Node root=s2.pop();
                   System.out.print(root.data+" ");
                   if(root.left!=null){
                       s1.push(root.left);
                      }
                   if(root.right!=null)
                   s1.push(root.right);
                   
               }
               
           }
      }
}