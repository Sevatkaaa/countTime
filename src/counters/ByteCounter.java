package counters;

public class ByteCounter {
    public static void countAllForSmall(byte a, byte b, int times) {
        System.out.println();
        countPlus("small", a, b, times);
        countMinus("small", a, b, times);
        countMultiply("small", a, b, times);
        countDivide("small", a, b, times);
    }

    public static void countAllForBig(byte a, byte b, int times) {
        countPlus("big", a, b, times);
        countMinus("big", a, b, times);
        countMultiply("big", a, b, times);
        countDivide("big", a, b, times);
    }

    private static void countPlus(String type, byte a, byte b, int times) {
        long before = System.nanoTime();
        for (int i = 0; i < times; i++) {
            int c = a + b;
        }
        long after = System.nanoTime();

        int result = (int) (after - before) / times;
        System.out.println(String.format("+, byte, %s values(%d, %d), time: %d nanoseconds", type,  a, b, result));
    }

    private static void countMinus(String type, byte a, byte b, int times) {
        long before = System.nanoTime();
        for (int i = 0; i < times; i++) {
            int c = a - b;
        }
        long after = System.nanoTime();

        int result = (int) (after - before) / times;
        System.out.println(String.format("-, byte, %s values(%d, %d), time: %d nanoseconds", type,  a, b, result));
    }

    private static void countMultiply(String type, byte a, byte b, int times) {
        long before = System.nanoTime();
        for (int i = 0; i < times; i++) {
            int c = a * b;
        }
        long after = System.nanoTime();

        int result = (int) (after - before) / times;
        System.out.println(String.format("*, byte, %s values(%d, %d), time: %d nanoseconds", type,  a, b, result));
    }

    private static void countDivide(String type, byte a, byte b, int times) {
        long before = System.nanoTime();
        for (int i = 0; i < times; i++) {
            int c = a / b;
        }
        long after = System.nanoTime();

        int result = (int) (after - before) / times;
        System.out.println(String.format("/, byte, %s values(%d, %d), time: %d nanoseconds", type,  a, b, result));
    }
}
