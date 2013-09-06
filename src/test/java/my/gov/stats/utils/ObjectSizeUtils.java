package my.gov.stats.utils;

import java.lang.instrument.Instrumentation;

/**
 * @author rafizan.baharum
 * @since 9/6/13
 */
public class ObjectSizeUtils {

    private static Instrumentation instrumentation;

    public static void premain(String args, Instrumentation inst) {
        instrumentation = inst;
    }

    public static long getObjectSize(Object o) {
        return instrumentation.getObjectSize(o);
    }
}
