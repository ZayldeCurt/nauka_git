package blok2PodstawyAlgorytmow.lekcja1;

public class MyListBidirectionalElement {
    private MyListBidirectionalElement previous;
    private MyListBidirectionalElement next;
    private Integer value;

    public MyListBidirectionalElement(Integer value) {
        this.value = value;
    }

    public MyListBidirectionalElement getPrevious() {
        return previous;
    }

    public void setPrevious(MyListBidirectionalElement previous) {
        this.previous = previous;
    }

    public MyListBidirectionalElement getNext() {
        return next;
    }

    public void setNext(MyListBidirectionalElement next) {
        this.next = next;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }
}
