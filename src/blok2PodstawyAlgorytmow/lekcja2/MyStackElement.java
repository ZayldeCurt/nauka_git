package blok2PodstawyAlgorytmow.lekcja2;

public class MyStackElement {
    private MyStackElement next;
    private Integer value;

    public MyStackElement(Integer value) {
        this.value = value;
    }
    public MyStackElement getNext() {
        return next;
    }
    public void setNext(MyStackElement next) {
        this.next = next;
    }
    public Integer getValue() {
        return value;
    }
    public void setValue(Integer value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value.toString();
    }
}
