package BinaryTree;

import java.util.LinkedList;
import java.util.Queue;

class Node{
    int val;
    Node left;
    Node right;
    Node(int val){
        this.val = val;
    }
}
class Pair{
    int level;
    Node node;
    Pair(Node node, int level){
        this.node = node;
        this.level = level;
    }
}
public class BTImplementation {
    public static void main(String[] args) {
        Node a  = new Node(3);
        Node b = new Node(4);
        Node c = new Node(2);
        Node d = new Node(-1);
        Node e = new Node(1);
        Node f = new Node(6);
        Node g = new Node(9);
        a.left = b; a.right = c;
        b.left = d; b.right = e;
        c.left = f; c.right = g;
//        
//        levelsOrder(a);
//        LevelOrderLineWise(a);
//        KthlevelVlaues(a,0,2);
        preorder(a);
        System.out.println();
        postorder(a);
        System.out.println();
        inorder(a);
    }
//print the values of any kth level(Zero base) .......
    private static void KthlevelVlaues(Node root, int level, int k) {
//level is starting level of tree and kth is the level we are printing the values .......
        if(root == null) return;
        if(level == k) System.out.print(root.val+" ");
        KthlevelVlaues(root.left,level+1,k);
        KthlevelVlaues(root.right,level+1,k);
    }
    //print the tree in the Line By Line......
    private static void LevelOrderLineWise(Node root) {
        Queue<Pair> q = new LinkedList<>();
        int currlevel = 0;
        q.add(new Pair(root,0));
        while (q.size()>0) {
            Pair front = q.remove();
            Node node = front.node;
            int level = front.level;
            if(front.level != currlevel){
                currlevel += 1;
                System.out.println();
            }
            System.out.print(front.node.val + " ");
            if(node.left != null) q.add(new Pair(node.left, level+1));
            if(node.right != null) q.add(new Pair(node.right, level+1));
        }
        System.out.println();
    }
    //find the number of the levels in the tree.....
    private static void levelsOrder(Node root) {
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {
            Node front = q.remove();
            System.out.print(front.val + " ");
            if(front.left != null) q.add(front.left);
            if(front.right != null) q.add(front.right);
        }
        System.out.println();
    }
//print tree in preOrder....(N -> L -> R)
    private static void preorder(Node root) {
        if(root == null) return;
        System.out.print(root.val+" ");
        preorder(root.left);
        preorder(root.right);
    }
//print the Tree in InOrder....(L -> N -> R)
    private static void inorder(Node root) {
        if(root == null) return;
        inorder(root.left);
        System.out.print(root.val+" ");
        inorder(root.right);
    }
//print the Tree in postOrder....(L -> R -> N)
    private static void postorder(Node root) {
        if(root == null) return;
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.val+" ");
    }
//find the minimum value in the Binary Tree
    private static int MinBT(Node root) {
        if(root == null) return Integer.MAX_VALUE;
        int LMin = MinBT(root.left);
        int RMin = MinBT(root.right);
        int minimum = Math.min(root.val, Math.min(LMin, RMin));
        return minimum;
    }
//Find the maximum values in the Binary Tree
    private static int MaxBT(Node root) {
        if(root == null) return Integer.MIN_VALUE;
        int LMax = MaxBT(root.left);
        int RMax = MaxBT(root.right);
        int maximum = Math.max(root.val, Math.max(LMax, RMax));
        return maximum;
    }
// Find the product of all the node's values of the Binary Tree
    private static int productBT(Node root) {
        if(root == null) return 1;
        int Pleft = productBT(root.left);
        int Pright = productBT(root.right);
        return root.val*Pleft *  Pright;
    }
//Find the summ of all the values of the Binary Tree
    private static int sumBT(Node root) {
        if(root == null) return 0;
        int Sleft = sumBT(root.left);
        int Sright = sumBT(root.right);
        return root.val + Sright + Sleft;
    }
//Find the number of the number
    private static int sizeBT(Node root) {
        if (root == null) return 0;
        return sizeBT(root.left) + sizeBT(root.right) + 1;
    }
// to treverse the whole Tree and print all the elements
    private static void DisplayBT(Node root) {
        if(root == null) return;
        System.out.print(root.val+" ");
        DisplayBT(root.left);
        DisplayBT(root.right);
    }
}
