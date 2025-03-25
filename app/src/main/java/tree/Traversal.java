package tree;

import java.util.LinkedList;
import java.util.Queue;

public class Traversal {

    public void levelOrderTraversal(BinaryTree tree){
        if(tree.getRoot() == null){
            return;
        }
        int level = 1;

        Queue<BinaryTree.Node> queue = new LinkedList<>();
        queue.add(tree.getRoot());

        while (!queue.isEmpty()){
            int size = queue.size();
            while (size > 0){
                BinaryTree.Node node = queue.poll();
                System.out.println("Level :: " + level + " Value :: " + node.val);
                size--;
                if(node.left != null){
                    queue.add(node.left);
                }

                if(node.right != null){
                    queue.add(node.right);
                }
            }
            level++;
        }
    }


    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.add(1);
        tree.add(11);tree.add(12);
        tree.add(14);tree.add(16);tree.add(17);tree.add(21);
        tree.add(31);tree.add(41);tree.add(51);tree.add(61);tree.add(19);

        Traversal traversal = new Traversal();
        traversal.levelOrderTraversal(tree);

    }

}
