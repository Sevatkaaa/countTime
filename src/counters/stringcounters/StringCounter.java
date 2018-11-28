package counters.stringcounters;

public class StringCounter {
    public static void countAllForSmall(String a, String b, int times) {
        System.out.println();
        countPlus("small", a, b, times);
        countConcat("small", a, b, times);
    }

    public static void countAllForBig(String a, String b, int times) {
        countPlus("big", a, b, times);
        countConcat("big", a, b, times);
    }

    private static void countPlus(String type, String a, String b, int times) {
        long before = System.nanoTime();
        for (int i = 0; i < times; i++) {
            String c = a + b;
        }
        long after = System.nanoTime();

        int result = (int) (after - before) / times;
        System.out.println(String.format("+, String, %s, time: %d nanoseconds", type, result));
    }

    private static void countConcat(String type, String a, String b, int times) {
        long before = System.nanoTime();
        for (int i = 0; i < times; i++) {
            String c = a .concat(b);
        }
        long after = System.nanoTime();

        int result = (int) (after - before) / times;
        System.out.println(String.format("concat(), String, %s, time: %d nanoseconds", type, result));
    }
}
