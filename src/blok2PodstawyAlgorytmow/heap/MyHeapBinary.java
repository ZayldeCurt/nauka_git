package blok2PodstawyAlgorytmow.heap;

import java.util.ArrayList;
import java.util.List;

public class MyHeapBinary {
    private List<Integer> values = new ArrayList<>();

    public void add(Integer value){
        int index = values.size();
        values.add(value);
        int parentIndex = calculateParentIndex(index);
        while(index>0 && values.get(parentIndex)<value){
            Integer parentValue =  values.get(parentIndex);
            values.set(index,parentIndex);
            index=parentIndex;
            parentIndex = calculateParentIndex(index);
        }
        values.set(index,value);
    }
    public Integer remove(){
        Integer currentRoot = values.get(0);



        return currentRoot;
    }

    public int getGreatestChildIndex(int index){
        if(isLeftSonExist(index)&&isRightSonExist(index)){
            int leftIndex= index*2+1;
            int rightIndex= index*2+1;
            Integer leftChild = values.get(leftIndex);
            Integer rightChild = values.get(rightIndex);

            if(leftChild>rightChild){
                return leftIndex;
            }
            else{
                return rightIndex;
            }
        }
        return 0;
    }
    public boolean isLeftSonExist(int index){
        return (2*index+1) < values.size();
    }
    public boolean isRightSonExist(int index){
        return (2*index+2) < values.size();
    }
    public int calculateParentIndex(int index){
        return Math.floorDiv(index-1,2);
    }

}
