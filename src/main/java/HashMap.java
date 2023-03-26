
public class HashMap {
    private static final int INIT_SIZE = 16;
    Basket[] baskets;

    public HashMap() {
        this(INIT_SIZE);
    }

    public HashMap(int size) {
        baskets = new Basket[size];
    }

    public int calcIndex(int key) {
        return key % baskets.length;
    }

    public Integer find(int key) {
        int index = calcIndex(key);
        Basket basket = baskets[index];
        if (basket != null) {
            return basket.find(key);
        }
        return null;
    }

    private class Entity {
        int key;
        int value;
    }

    public boolean add(int key, int value) {
        int index = calcIndex(key);
        Basket basket = baskets[index];
        if (basket == null) {
            basket = new Basket();
            baskets[index] = basket;
        }
        Entity entity = new Entity();
        entity.key = key;
        entity.value = value;
        return basket.add(entity);
    }

    private class Basket {
        Node head;

        private class Node {
            Entity value;
            Node next;
        }

        public Integer find(int key) {
            Node node = head;
            while (node != null) {
                if (node.value.key == key) {
                    return node.value.value;
                }
                node = node.next;
            }
            return null;
        }

        public boolean add(Entity entity) {
            Node node = new Node();
            node.value = entity;
            if (head == null) {
                head = node;
            } else {
                Node current = head;
                while (true) {
                    if (current.value.key == entity.key) {
                        return false;
                    }
                    if (current.next == null){
                        current.next = node;
                        return true;
                    }
                    current = current.next;
                }
            }
            return true;
        }

    }
}
