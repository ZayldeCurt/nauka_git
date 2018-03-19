package blok2PodstawyAlgorytmow.lekcja2;

public class zad1 {
    public static void main(String[] args) {
        MyStackElement element1= new MyStackElement(1);
        MyStackElement element2= new MyStackElement(2);
        MyStackElement element3= new MyStackElement(3);
        MyStackElement element4= new MyStackElement(4);

        MyStack stack = new MyStack();
        stack.push(element1);
        stack.push(element2);
        stack.push(element3);
        System.out.println(stack.pop());
        stack.push(element4);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());

//        System.out.println(element1);
    }
}
