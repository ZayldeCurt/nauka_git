package blok2PodstawyAlgorytmow.lekcja2;

public class MyQueueElement<T> {
        MyQueueElement next;
        T valude;

    public MyQueueElement(T valude) {
        this.valude = valude;
    }

    public MyQueueElement getNext() {
        return next;
    }

    public void setNext(MyQueueElement next) {
        this.next = next;
    }
}
