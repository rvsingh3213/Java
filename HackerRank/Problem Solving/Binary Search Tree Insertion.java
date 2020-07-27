

//https://www.hackerrank.com/challenges/binary-search-tree-insertion/problem
//Binary Search Tree : Insertion

	public static Node insert(Node root,int data) {

    	Node node=new Node(data);
    
        if(root==null)return node;

        Node current=root;Node parent=null;

        while(current!=null)
        {
            parent=current;

            if(current.data<=data)
            current=current.right;
            else
            current=current.left;

        }

        if(parent.data<data)
        parent.right=node;
        else
        parent.left=node;

         return root;

    }
