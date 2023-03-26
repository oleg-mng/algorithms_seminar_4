import org.w3c.dom.Node;

public class HashMap {
    private static final int INIT_SIZE=16;
    Basket[] baskets;
    public HashMap{
        this(INIT_SIZE);
    }
    public HashMap(int size){
        baskets = new Basket[size];
    }

    private class Entity {
        int key;
        int value;
    }

    private class Basket {
        Node head;

        private class Node {
            Entity value;
            Node next;
        }
    }
}
