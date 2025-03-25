package tree;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {

    private Node root;

    public Node getRoot(){
        return root;
    }

    public void add(int val){
        if(root == null){
            root = new Node(val);
            return;
        }

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while(!queue.isEmpty()){
          Node temp =  queue.poll();
          if(temp.left == null){
              temp.left = new Node(val);
              break;
          }
          if(temp.right == null){
              temp.right = new Node(val);
              break;
          }

          queue.add(temp.left);
          queue.add(temp.right);

        }
    }


     static class Node {
        int val;
        Node left;
        Node right;

        Node(int val){
            this.val = val;
        }

    }
}
