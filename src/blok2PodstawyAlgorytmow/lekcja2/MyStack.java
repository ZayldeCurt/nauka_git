package blok2PodstawyAlgorytmow.lekcja2;

public class MyStack {

    MyStackElement head;
    Integer sizeStack;

    public MyStack() {
        this.sizeStack = 0;
    }

    public boolean isEmpty()
    {
        return head ==null;
    }
    public void push(MyStackElement element){
        if (isEmpty()) {
            head = element;
        }
        else {
            MyStackElement previousHead=head;
            head=element;
            head.setNext(previousHead);
        }
        sizeStack++;
    }
    public MyStackElement pop(){
        if(this.head==null)
        {
            return null;
        }
        MyStackElement currentHead = this.head;
        head  = currentHead.getNext();
        sizeStack--;
        return currentHead;

    }
}
