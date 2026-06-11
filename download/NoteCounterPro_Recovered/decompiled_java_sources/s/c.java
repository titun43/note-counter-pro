package s;

/* loaded from: classes.dex */
public abstract /* synthetic */ class c {
    public static String a(String str, String str2) {
        return str + str2;
    }

    public static String b(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    public static String c(StringBuilder sb, String str, int i5, String str2, int i6) {
        sb.append(str);
        sb.append(i5);
        sb.append(str2);
        sb.append(i6);
        return sb.toString();
    }

    public static String d(StringBuilder sb, String str, String str2) {
        sb.append(str);
        sb.append(str2);
        return sb.toString();
    }

    public static void e(StringBuilder sb, String str, String str2, String str3, String str4) {
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
        sb.append(str4);
    }
}
