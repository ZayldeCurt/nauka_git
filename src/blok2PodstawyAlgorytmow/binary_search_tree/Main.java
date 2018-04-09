package blok2PodstawyAlgorytmow.binary_search_tree;

public class Main {


    public static void main(String[] args) {
        int[] tab = {1,2,5,6,3,4,7,8,9,12,15,18};
        myBst myTree = new myBst(tab);

        System.out.println(myTree.search(16).getValue());


    }




}
