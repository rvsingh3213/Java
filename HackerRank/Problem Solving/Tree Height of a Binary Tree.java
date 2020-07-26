

//https://www.hackerrank.com/challenges/tree-height-of-a-binary-tree/problem

 public static int H(Node root)
    {
        if(root==null) return 0;

        return 1+Math.max(H(root.left),H(root.right));

    }
	public static int height(Node root) {
      	
          if(root==null) return 0;
           
          return H(root)-1;
    }