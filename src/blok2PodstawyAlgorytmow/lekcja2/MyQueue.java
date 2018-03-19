package blok2PodstawyAlgorytmow.lekcja2;

public class MyQueue<T> {
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
    public void add(T element){
        MyQueueElement newElement = new MyQueueElement(element);
        if(isEmpty()){
           firstelement = newElement;
           lastelement = newElement;
        }
        else{
            MyQueueElement currentLast = lastelement;
            currentLast.setNext(newElement);
            lastelement = newElement;
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
