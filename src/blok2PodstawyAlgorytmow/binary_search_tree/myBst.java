package blok2PodstawyAlgorytmow.binary_search_tree;

import java.util.Arrays;

public class myBst {
    private Leaf root;

    public myBst(int[] tab) {
        this.initial(tab);
    }

    public void initial(int[] array){
        Arrays.sort(array);
        root=add(array,root);
    }
    public Leaf add(int[] array,Leaf parent){
        int size = array.length/2;
        Leaf mid = new Leaf(array[size]);
        mid.setParent(parent);
        int[] tabL= Arrays.copyOfRange(array,0,size);
        int[] tabP= Arrays.copyOfRange(array,size+1,array.length);
        if(tabL.length!=0){
            mid.setLeft(add(tabL,mid));
        }
        if(tabP.length!=0){
            mid.setRight(add(tabP,mid));
        }
        return mid;
    }
    public Leaf search(int temp){
        return this.search(16,this.root);
    }
    private Leaf search(int temp,Leaf root){
        System.out.println(root.getValue());
        if(root.getValue()==temp){
//            System.out.println("koniec"+root.getValue());
            return root;
        }
        else if(root.getValue()>temp && root.getLeft()!=null){
            return search(temp,root.getLeft());
        }
        else if(root.getValue()<temp && root.getRight()!=null) {
            return search(temp,root.getRight());
        }
        else
            return null;
    }
    public Leaf getMin(){
        return getMin(root);
    }
    public Leaf getMin (Leaf root){
        if (root.getLeft() != null){
            return getMin(root.getLeft());
        }
        return root;
    }
    public Leaf getMax(){
        return getMax(root);
    }
    public Leaf getMax (Leaf root){
        if (root.getRight() != null){
            return getMax(root.getRight());
        }
        return root;
    }
    public Leaf getRoot() {
        return root;
    }
}
