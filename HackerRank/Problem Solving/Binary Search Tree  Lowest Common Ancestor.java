

//https://www.hackerrank.com/challenges/binary-search-tree-lowest-common-ancestor/problem
//Binary Search Tree : Lowest Common Ancestor




	public static Node lca(Node root, int v1, int v2) {
        
        if(root==null) return null;

        if(root.data>Math.max(v1,v2))
        return lca(root.left,v1,v2);

        if(root.data<Math.min(v1,v2))
        return lca(root.right,v1,v2);
        else
        return root;
    }