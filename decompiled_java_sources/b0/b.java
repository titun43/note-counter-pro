package b0;

import android.os.Build;
import java.util.Locale;

/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f684a = 0;

    static {
        int i5 = Build.VERSION.SDK_INT;
        if (i5 >= 30) {
            a.e(30);
        }
        if (i5 >= 30) {
            a.e(31);
        }
        if (i5 >= 30) {
            a.e(33);
        }
        if (i5 >= 30) {
            a.e(1000000);
        }
    }

    public static final boolean a(String str) {
        String str2 = Build.VERSION.CODENAME;
        g4.i.e(str2, "buildCodename");
        if (!"REL".equals(str2)) {
            Locale locale = Locale.ROOT;
            String upperCase = str2.toUpperCase(locale);
            g4.i.d(upperCase, "toUpperCase(...)");
            Integer num = upperCase.equals("BAKLAVA") ? r2 : null;
            String upperCase2 = str.toUpperCase(locale);
            g4.i.d(upperCase2, "toUpperCase(...)");
            r2 = upperCase2.equals("BAKLAVA") ? 0 : null;
            if (num == null || r2 == null) {
                if (num == null && r2 == null) {
                    String upperCase3 = str2.toUpperCase(locale);
                    g4.i.d(upperCase3, "toUpperCase(...)");
                    String upperCase4 = str.toUpperCase(locale);
                    g4.i.d(upperCase4, "toUpperCase(...)");
                    if (upperCase3.compareTo(upperCase4) >= 0) {
                        return true;
                    }
                } else if (num != null) {
                    return true;
                }
            } else if (num.intValue() >= r2.intValue()) {
                return true;
            }
        }
        return false;
    }

    public static final boolean b() {
        int i5 = Build.VERSION.SDK_INT;
        if (i5 >= 31) {
            return true;
        }
        if (i5 < 30) {
            return false;
        }
        g4.i.d(Build.VERSION.CODENAME, "CODENAME");
        return a("S");
    }
}
