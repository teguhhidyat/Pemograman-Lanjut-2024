import java.security.Key;

class TreeNode{
    int key;
    TreeNode lift, right;

    public TreeNode(int item) {
        key = item;
        lift = right = null;

    }
}
public class BinarySearchTree {
    TreeNode root;

    BinarySearchTree(){
        root = null;

    }

    void insert(int key){
        root = inserRec(root, key);
    }


    TreeNode inserRec(TreeNode root, int key){
        if (root == null) {
            return new TreeNode(key);
        }
        if (key < root.key)
            root.lift = inserRec(root.lift, key);
        else if (key  > root.key)
            root.right = inserRec(root.right, key);

        return root;
    }

    void inorder() {
        inorderRec(root);
    }


    void  inorderRec(TreeNode root) {
        if (root != null) {
            inorderRec(root.lift);
            System.out.println(root.key + "");
            inorderRec(root.right);
        }
    }
    public static  void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        bst.insert(50);
        bst.insert(30);
        bst.insert(70);
        bst.insert(20);
        bst.insert(40);
        bst.insert(60);
        bst.insert(80);

        System.out.println("Inorder traverdal");
        bst.inorder();

    }
}
