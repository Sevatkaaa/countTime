package counters.stringcounters;

public class StringBuilderCounter {
    public static void countAllForSmall(StringBuilder a, StringBuilder b, int times) {
        System.out.println();
        countPlus("small", a, b, times);
        countAppend("small", a, b, times);
    }

    public static void countAllForBig(StringBuilder a, StringBuilder b, int times) {
        countPlus("big", a, b, times);
        countAppend("big", a, b, times);
    }

    private static void countPlus(String type, StringBuilder a, StringBuilder b, int times) {
        long before = System.nanoTime();
        for (int i = 0; i < times; i++) {
            String c = a.toString() + b.toString();
        }
        long after = System.nanoTime();

        int result = (int) (after - before) / times;
        System.out.println(String.format("+, StringBuilder, %s, time: %d nanoseconds", type, result));
    }

    private static void countAppend(String type, StringBuilder a, StringBuilder b, int times) {
        long before = System.nanoTime();
        for (int i = 0; i < times; i++) {
            StringBuilder c = a.append(b);
        }
        long after = System.nanoTime();

        int result = (int) (after - before) / times;
        System.out.println(String.format("append(), StringBuilder, %s, time: %d nanoseconds", type, result));
    }
}
