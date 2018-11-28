package counters;

public class FloatCounter {
    public static void countAllForSmall(float a, float b, int times) {
        System.out.println();
        countPlus("small", a, b, times);
        countMinus("small", a, b, times);
        countMultiply("small", a, b, times);
        countDivide("small", a, b, times);
    }

    public static void countAllForBig(float a, float b, int times) {
        countPlus("big", a, b, times);
        countMinus("big", a, b, times);
        countMultiply("big", a, b, times);
        countDivide("big", a, b, times);
    }

    private static void countPlus(String type, float a, float b, int times) {
        long before = System.nanoTime();
        for (int i = 0; i < times; i++) {
            float c = a + b;
        }
        long after = System.nanoTime();

        int result = (int) (after - before) / times;
        System.out.println(String.format("+, float, %s values(%f, %f), time: %d nanoseconds", type,  a, b, result));
    }

    private static void countMinus(String type, float a, float b, int times) {
        long before = System.nanoTime();
        for (int i = 0; i < times; i++) {
            float c = a - b;
        }
        long after = System.nanoTime();

        int result = (int) (after - before) / times;
        System.out.println(String.format("-, float, %s values(%f, %f), time: %d nanoseconds", type,  a, b, result));
    }

    private static void countMultiply(String type, float a, float b, int times) {
        long before = System.nanoTime();
        for (int i = 0; i < times; i++) {
            float c = a * b;
        }
        long after = System.nanoTime();

        int result = (int) (after - before) / times;
        System.out.println(String.format("*, float, %s values(%f, %f), time: %d nanoseconds", type,  a, b, result));
    }

    private static void countDivide(String type, float a, float b, int times) {
        long before = System.nanoTime();
        for (int i = 0; i < times; i++) {
            float c = a / b;
        }
        long after = System.nanoTime();

        int result = (int) (after - before) / times;
        System.out.println(String.format("/, float, %s values(%f, %f), time: %d nanoseconds", type,  a, b, result));
    }
}
