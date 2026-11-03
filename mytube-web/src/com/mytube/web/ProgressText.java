package com.mytube.web;

/**
 * ডাউনলোডের অগ্রগতির হিসাব — Android-মুক্ত, তাই আলাদা করে টেস্ট করা যায়।
 *
 * <p>কেন আলাদা ক্লাস: নোটিফিকেশন ({@code DownloadService}) আর অ্যাপের ভেতরের
 * ডাউনলোড-স্ক্রিন ({@code DownloadsSheet}) — দুটোই একই শতাংশ দেখায়, কিন্তু
 * আগে হিসাবটা দুই জায়গায় আলাদা করে লেখা ছিল। একটাতে ভুল হলে অন্যটাতে ঠিক
 * থাকত। এখন একটি জায়গা, আর {@code tools/javatest} দিয়ে যাচাই করা যায়।
 */
public final class ProgressText {

    private ProgressText() {
    }

    /** শতাংশ, ০–৯৫। ১০০ তখনই যখন কাজ শেষ — রূপান্তরের জন্য ৫% আলাদা রাখা। */
    public static int pct(long got, long total) {
        if (total <= 0 || got <= 0) {
            return 0;
        }
        long p = 95L * got / total;
        return (int) (p > 95 ? 95 : p);
    }

    /**
     * অগ্রগতির এক লাইন।
     *
     * @param got   এ পর্যন্ত নামানো বাইট
     * @param total মোট বাইট — অজানা হলে (&lt;= 0) শতাংশ বাদ যায়, শুধু পরিমাণ
     * @param mbs   গতি (MB/s)
     * @param eta   বাকি সময়ের লেখা, না জানা থাকলে null
     * @param unit  "  ·  " (অ্যাপ) বা " - " (নোটিফিকেশন)
     */
    public static String line(long got, long total, double mbs, String eta, String unit) {
        String u = unit == null ? "  ·  " : unit;
        double g = got / 1048576.0;
        if (total > 0) {
            String s = pct(got, total) + "%" + u
                    + String.format(java.util.Locale.US, "%.1f MB/s", mbs) + u
                    + String.format(java.util.Locale.US, "%.1f of %.1f MB",
                    g, total / 1048576.0);
            return eta != null ? s + u + eta : s;
        }
        String s = String.format(java.util.Locale.US, "%.1f MB", g) + u
                + String.format(java.util.Locale.US, "%.1f MB/s", mbs);
        return eta != null ? s + u + eta : s;
    }
}
