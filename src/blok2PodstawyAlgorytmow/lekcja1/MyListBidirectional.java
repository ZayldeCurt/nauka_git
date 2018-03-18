package blok2PodstawyAlgorytmow.lekcja1;

public class MyListBidirectional {
    MyListBidirectionalElement head;
    MyListBidirectionalElement tail;
    int count;

    public MyListBidirectional() {
        this.count = 0;
    }
    public boolean isEmpty()
    {
        return head ==null;
    }
    public void addInFirstMyList(MyListBidirectionalElement element){
        if (isEmpty()) {
            head = element;
            tail = element;
        }
        else
        {
            element.setNext(head);
            head.setPrevious(element);
            head=element;
        }
        count++;
    }
    public void addInMyList(MyListBidirectionalElement element) {
        if (isEmpty()) {
            head = element;
            tail = element;
        }
        else
        {
            element.setPrevious(tail);
            tail.setNext(element);
            tail=element;
        }
        count++;

    }

    public void showMyList(){

        if(isEmpty())
        {
            System.out.println("is empty");
        }
        else
        {
            MyListBidirectionalElement currentElement = head;
            while(currentElement.getNext()!=null)
            {
                System.out.println(currentElement.getValue());
                currentElement=currentElement.getNext();
            }
            System.out.println(currentElement.getValue());
        }
    }
    public void deleteElementlikeLinkedList(MyListBidirectionalElement element)
    {

        if(!isEmpty()) {
            MyListBidirectionalElement currentElement = head;
            boolean flaga = true;
            while(flaga) {
                if(currentElement.equals(element)) {
                    //TODO delete
                    if(currentElement.equals(head)) {
                        MyListBidirectionalElement nextElement= currentElement.getNext();
                        nextElement.setPrevious(null);
                        head=nextElement;
                    }
                    else if(currentElement.equals(tail)) {
                        MyListBidirectionalElement previousElement= currentElement.getPrevious();
                        previousElement.setNext(null);
                        tail=previousElement;
                    }
                    else{
                        MyListBidirectionalElement nextElement= currentElement.getNext(); //nie tworzy nowych elementów tylko przekazuje referencje
                        MyListBidirectionalElement previousElement = currentElement.getPrevious();
                        previousElement.setNext(nextElement);
                        nextElement.setPrevious(previousElement);
//                        currentElement.getPrevious().setNext(currentElement.getNext()); //brzydko to wyglada, jest mało czytelne
//                        currentElement.getNext().setPrevious(currentElement.getPrevious());
                    }


                    currentElement=null;
                    flaga=false;
                }
                else{
                    currentElement = currentElement.getNext();
                }
            }

        }
    }
    public void deleteElement(MyListBidirectionalElement element)
    {
        if(!isEmpty()) {
            if(element.equals(element)) {
                //TODO delete
                if(element.equals(head)) {
                    MyListBidirectionalElement nextElement= element.getNext();
                    nextElement.setPrevious(null);
                    head=nextElement;
                }
                else if(element.equals(tail)) {
                    MyListBidirectionalElement previousElement= element.getPrevious();
                    previousElement.setNext(null);
                    tail=previousElement;
                }
                else{
                    MyListBidirectionalElement nextElement= element.getNext(); //nie tworzy nowych elementów tylko przekazuje referencje
                    MyListBidirectionalElement previousElement = element.getPrevious();
                    previousElement.setNext(nextElement);
                    nextElement.setPrevious(previousElement);
                }
                element=null;
            }

        }
    }

}
