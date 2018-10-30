class BinarySearchTree{
/*Class containing left and right child of current noed and key value*/
    class Node{
        int key;
        Node left, right;

        public Node(int item){
            key=item;
            left=right=null;

        }
    }

    //Root of BST
    Node root;

    //Constructor
    BinarySearchTree(){
        root=null;
    }

    //This method mainly calls instertRec()
    void insert(int key){
        root=insertRec(root,key);
    }

    /*A recursive function to insert a new key in BST*/
    Node insertRec(Node root, int key){
        /*If the tree is empty, return a new node*/
        if(root==null){
            root = new Node(key);
            return root;
        }

        //Otherwise, recur down the tree
        //Your code here


        /*return the (unchanged) node pointer*/
        return root;
    }

    //This method mainly calls InorderRec()
    void inorder(){
        inorderRec(root);
    }

    //A utility function to do inorder traversal of BST
    void inorderRec(Node root){
        if(root != null){
            inorderRec(root.left);
            System.out.println(root.key);
            inorderRec(root.right);
        }
    }

    //Driver program to test above functions
    public static void main(String[] args){
        BinarySearchTree tree = new BinarySearchTree();
        //Let us create following BST

        tree.insert(50);
        tree.insert(30);
        tree.insert(20);
        tree.insert(40);
        tree.insert(70);
        tree.insert(60);
        tree.insert(80);

        //print inorder traversal of BST
        tree.inorder();
    }
}
