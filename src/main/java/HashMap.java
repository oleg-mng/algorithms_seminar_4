import org.w3c.dom.Node;

public class HashMap {

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
