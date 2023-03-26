import org.w3c.dom.Node;

public class HashMap {
    private static final int INIT_SIZE = 16;
    Basket[] baskets;

    public HashMap() {
        this(INIT_SIZE);
    }

    public HashMap(int size) {
        baskets = new Basket[size];
    }

    public int calcindex(int key) {
        return key % baskets.length;
    }
    public Entity find(int key){
        int index = calcindex(key);
        Basket basket = baskets[index];
        if (basket != null){
            return basket.find(key);
        }
        return null;
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
        public Entity find(int key)
    }
}
