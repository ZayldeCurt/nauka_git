package blok2PodstawyAlgorytmow.lekcja2;

public class zad3 {
    public static void main(String[] args) {

        MyQueue myQueue = new MyQueue();
        myQueue.add(new MyQueueElement(1));
        myQueue.add(new MyQueueElement(2));
        myQueue.add(new MyQueueElement(3));
        myQueue.add(new MyQueueElement(4));

        MyQueueElement element = myQueue.remove();

    }
}
