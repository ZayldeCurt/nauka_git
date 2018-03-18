package blok2PodstawyAlgorytmow.lekcja1;

public class zad4 {
    public static void main(String[] args) {

        MyListBidirectionalElement first = new MyListBidirectionalElement(10);
        MyListBidirectionalElement second = new MyListBidirectionalElement(5);
        MyListBidirectionalElement third = new MyListBidirectionalElement(20);

        MyListBidirectional myListBidirectional = new MyListBidirectional();
        myListBidirectional.addInFirstMyList(second);
        myListBidirectional.addInFirstMyList(first);
        myListBidirectional.addInMyList(third);


//        myListBidirectional.deleteElementlikeLinkedList(third);
        myListBidirectional.deleteElement(third);
        myListBidirectional.showMyList();
        System.out.println("blababla");


    }


}
