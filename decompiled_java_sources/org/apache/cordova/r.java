package org.apache.cordova;

import java.util.HashMap;
import java.util.Locale;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f2955a = new HashMap(20);

    public final boolean a(String str, boolean z4) {
        String str2 = (String) this.f2955a.get(str.toLowerCase(Locale.ENGLISH));
        return str2 != null ? Boolean.parseBoolean(str2) : z4;
    }

    public final int b(int i5, String str) {
        String str2 = (String) this.f2955a.get(str.toLowerCase(Locale.ENGLISH));
        return str2 != null ? (int) Long.decode(str2).longValue() : i5;
    }

    public final String c(String str, String str2) {
        String str3 = (String) this.f2955a.get(str.toLowerCase(Locale.ENGLISH));
        return str3 != null ? str3 : str2;
    }
}
