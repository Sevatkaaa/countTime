import counters.*;
import counters.stringcounters.StringBuilderCounter;
import counters.stringcounters.StringCounter;

public class CountTime {
    public static void main(String[] args) {
        ByteCounter.countAllForSmall((byte)2, (byte)2, 1000);
        ByteCounter.countAllForBig((byte)127, (byte)127, 1000);

        ShortCounter.countAllForSmall((short)2, (short)2, 1000);
        ShortCounter.countAllForBig((short)10000, (short)10000, 1000);

        CharCounter.countAllForSmall('a', 'a', 1000);
        CharCounter.countAllForBig((char)250, (char)250, 1000);

        IntCounter.countAllForSmall(2, 2, 1000);
        IntCounter.countAllForBig(1000000, 1000000, 1000);

        LongCounter.countAllForSmall(2, 2, 1000);
        LongCounter.countAllForBig(100000000000000L, 100000000000000L, 1000);

        FloatCounter.countAllForSmall(2.1f, 2.1f, 1000);
        FloatCounter.countAllForBig(987654321.12345f, 987654321.12345f, 1000);

        DoubleCounter.countAllForSmall(2.1f, 2.1f, 1000);
        DoubleCounter.countAllForBig(987654321.12345f, 987654321.12345f, 100000);

        StringCounter.countAllForSmall("abc", "abc", 1000);
        StringCounter.countAllForBig("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa",
                "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 100000);

        StringBuilderCounter.countAllForSmall(new StringBuilder("abc"), new StringBuilder("abc"), 100000);
        StringBuilderCounter.countAllForBig(new StringBuilder("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"),
                new StringBuilder("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"), 100000);
    }
}
