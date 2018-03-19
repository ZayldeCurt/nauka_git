package blok2PodstawyAlgorytmow.lekcja2;

public class MyQueueElement {
        MyQueueElement next;
        Integer valude;

    public MyQueueElement(Integer valude) {
        this.valude = valude;
    }

    public MyQueueElement getNext() {
        return next;
    }

    public void setNext(MyQueueElement next) {
        this.next = next;
    }
}
