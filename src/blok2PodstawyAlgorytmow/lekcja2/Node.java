package blok2PodstawyAlgorytmow.lekcja2;

import java.util.ArrayList;
import java.util.List;

public class Node<T> {
    Node parernt;
    List<Node> children;
    T data;

    public Node(Node parernt,T data) {
        this.data = data;
        this.parernt = parernt;
        this.children = new ArrayList<>();
    }

    public T getData() {
        return data;
    }
    public void addChild(Node node){
        node.parernt=this;
        children.add(node);
    }

    @Override
    public String toString() {
        return "Node{" +
                "data=" + data +
                '}';
    }
}
