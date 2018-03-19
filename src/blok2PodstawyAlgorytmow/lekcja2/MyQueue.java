package blok2PodstawyAlgorytmow.lekcja2;

public class MyQueue {
    MyQueueElement firstelement;
    MyQueueElement lastelement;
    Integer count;

    public MyQueue() {
        this.count=0;
    }

    public boolean isEmpty()
    {
        return firstelement ==null;
    }
    public void add(MyQueueElement element){
        if(isEmpty()){
           firstelement = element;
           lastelement = element;
        }
        else{
            MyQueueElement currentLast = lastelement;
            currentLast.setNext(element);
            lastelement = element;
        }
        count++;
    }
    public MyQueueElement remove(){
        if(firstelement == null)
        {
            return null;
        }
        else {
            MyQueueElement currentFirst = this.firstelement;
            firstelement = currentFirst.getNext();
            count--;
            return currentFirst;
        }
    }

}
