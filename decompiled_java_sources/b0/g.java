package b0;

import android.os.LocaleList;
import java.util.Locale;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: b, reason: collision with root package name */
    public static final g f688b = new g(new h(new LocaleList(new Locale[0])));

    /* renamed from: a, reason: collision with root package name */
    public final h f689a;

    public g(h hVar) {
        this.f689a = hVar;
    }

    public static g a(String str) {
        if (str == null || str.isEmpty()) {
            return f688b;
        }
        String[] split = str.split(",", -1);
        int length = split.length;
        Locale[] localeArr = new Locale[length];
        for (int i5 = 0; i5 < length; i5++) {
            String str2 = split[i5];
            int i6 = f.f687a;
            localeArr[i5] = Locale.forLanguageTag(str2);
        }
        return new g(new h(new LocaleList(localeArr)));
    }

    public final boolean b() {
        return this.f689a.f690a.isEmpty();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof g) {
            return this.f689a.equals(((g) obj).f689a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f689a.f690a.hashCode();
    }

    public final String toString() {
        return this.f689a.f690a.toString();
    }
}
