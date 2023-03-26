public class Program {
    public static void main(String[] args) {
        HashMap hm = new HashMap();
        hm.add(4, 1);
        hm.add(33, 222222);

        System.out.printf("%d", hm.find(33));
    }
}
