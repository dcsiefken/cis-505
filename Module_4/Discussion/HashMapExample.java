package Module_4.Discussion;

import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {
        HashMap<HashableItem, HashableItem> bad = new HashMap<HashableItem, HashableItem>();
        HashMap<Integer, Integer> good = new HashMap<Integer, Integer>();
        final int ITERATIONS = 10000;
        long goodStart = System.nanoTime();
        for (int i = 0; i < ITERATIONS; i++) {
            good.put(i, i);
        }
        long goodEnd = System.nanoTime();
        long goodTime = (goodEnd - goodStart);

        System.out.printf("good hash: %d milliseconds\r\n", goodTime / 1000000);

        long badStart = System.nanoTime();
        for (int i = 0; i < ITERATIONS; i++) {
            HashableItem item = new HashableItem();
            bad.put(item, item);
        }
        long badEnd = System.nanoTime();
        long badTime = (badEnd - badStart);

        System.out.printf("bad hash: %d milliseconds\r\n", badTime / 1000000);

    }
}
