package blok2PodstawyAlgorytmow.lekcja2;

public class MyBinaryTree {
    public static void main(String[] args) {
        BinaryTreeNode nodeA = new BinaryTreeNode("A");
        BinaryTreeNode nodeB = new BinaryTreeNode("B");
        BinaryTreeNode nodeC = new BinaryTreeNode("C");
        BinaryTreeNode nodeD = new BinaryTreeNode("D");
        BinaryTreeNode nodeE = new BinaryTreeNode("E");
        BinaryTreeNode nodeF = new BinaryTreeNode("F");
        BinaryTreeNode nodeG = new BinaryTreeNode("G");

        nodeA.addLeftChild(nodeB);
        nodeA.addRightChild(nodeC);

        nodeB.addLeftChild(nodeD);
        nodeB.addRightChild(nodeE);

        nodeC.addLeftChild(nodeF);
        nodeC.addRightChild(nodeG);

//        System.out.println(heightOfTree(nodeA));
//        printPreOrder(nodeA);
//        printInOrder(nodeA);
        printPostOrder(nodeA);
    }

    private static int heightOfTree(BinaryTreeNode node){
        if(node == null) {
            return 0;
        }
        int leftHeight = heightOfTree(node.getLeft());
        int rightHeight = heightOfTree(node.getRight());
        return Math.max(leftHeight, rightHeight) + 1;
    }
    private static void printPreOrder(BinaryTreeNode node){
        System.out.println(node.toString()+" ");
        if(node.getLeft()!=null){
            printPreOrder(node.getLeft());
        }
        if(node.getRight()!=null){
            printPreOrder(node.getRight());
        }
    }
    private static void printInOrder(BinaryTreeNode node){
        if(node.getLeft()!=null){
            printInOrder(node.getLeft());
        }
        System.out.println(node.toString() + " ");
        if(node.getRight()!=null){
            printInOrder(node.getRight());
        }
    }
    private static void printPostOrder(BinaryTreeNode node){
        if(node.getLeft()!=null){
            printInOrder(node.getLeft());
        }

        if(node.getRight()!=null){
            printInOrder(node.getRight());
        }
        System.out.println(node.toString() + " ");
    }

}
