public class ProgressTextTest {
    static int pass = 0, fail = 0;

    static void ok(boolean c, String what) {
        if (c) { pass++; } else { fail++; System.out.println("  FAIL: " + what); }
    }

    public static void main(String[] a) {
        // --- percentage ---
        ok(ProgressText.pct(0, 100) == 0, "0 of 100 = 0%");
        ok(ProgressText.pct(50, 100) == 47, "half of 95 = 47%");
        ok(ProgressText.pct(100, 100) == 95, "done caps at 95%");
        ok(ProgressText.pct(200, 100) == 95, "overflow caps at 95%");
        ok(ProgressText.pct(10, 0) == 0, "unknown total = 0%");
        ok(ProgressText.pct(-5, 100) == 0, "negative got = 0%");
        ok(ProgressText.pct(1, 3) == 31, "1/3 of 95 = 31%");

        // --- known total: percentage AND speed AND amounts ---
        String s = ProgressText.line(5242880L, 10485760L, 1.5, "1m 20s left", "  \u00b7  ");
        ok(s.contains("47%"), "known total shows percentage: " + s);
        ok(s.contains("1.5 MB/s"), "shows speed: " + s);
        ok(s.contains("5.0 of 10.0 MB"), "shows amounts: " + s);
        ok(s.contains("1m 20s left"), "shows eta: " + s);

        // --- unknown total: no percentage, but speed still shown ---
        String u = ProgressText.line(3145728L, 0, 2.25, null, " - ");
        ok(!u.contains("%"), "unknown total hides percentage: " + u);
        ok(u.contains("2.3 MB/s"), "speed still shown when total unknown: " + u);
        ok(u.contains("3.0 MB"), "amount shown when total unknown: " + u);

        // --- null eta must not print "null" ---
        String n = ProgressText.line(1L << 20, 4L << 20, 1.0, null, " - ");
        ok(n.indexOf("null") < 0, "null eta omitted");

        // --- gb-scale sanity ---
        String big = ProgressText.line(1073741824L, 2147483648L, 9.9, null, "  \u00b7  ");
        ok(big.contains("1024.0 of 2048.0 MB"), "large sizes render: " + big);

        System.out.println(pass + " passed, " + fail + " failed");
        System.exit(fail > 0 ? 1 : 0);
    }
}
