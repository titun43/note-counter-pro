package org.apache.cordova;

import java.net.MalformedURLException;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final Pattern f2890a;

    /* renamed from: b, reason: collision with root package name */
    public final Pattern f2891b;

    /* renamed from: c, reason: collision with root package name */
    public final Integer f2892c;

    /* renamed from: d, reason: collision with root package name */
    public final Pattern f2893d;

    public a(String str, String str2, String str3, String str4) {
        try {
            if ("*".equals(str)) {
                this.f2890a = null;
            } else {
                this.f2890a = Pattern.compile(a(str, false), 2);
            }
            if ("*".equals(str2)) {
                this.f2891b = null;
            } else if (str2.startsWith("*.")) {
                this.f2891b = Pattern.compile("([a-z0-9.-]*\\.)?" + a(str2.substring(2), false), 2);
            } else {
                this.f2891b = Pattern.compile(a(str2, false), 2);
            }
            if (str3 != null && !"*".equals(str3)) {
                this.f2892c = Integer.valueOf(Integer.parseInt(str3, 10));
                if (str4 != null && !"/*".equals(str4)) {
                    this.f2893d = Pattern.compile(a(str4, true));
                    return;
                }
                this.f2893d = null;
            }
            this.f2892c = null;
            if (str4 != null) {
                this.f2893d = Pattern.compile(a(str4, true));
                return;
            }
            this.f2893d = null;
        } catch (NumberFormatException unused) {
            throw new MalformedURLException("Port must be a number");
        }
    }

    public static String a(String str, boolean z4) {
        StringBuilder sb = new StringBuilder();
        for (int i5 = 0; i5 < str.length(); i5++) {
            char charAt = str.charAt(i5);
            if (charAt == '*' && z4) {
                sb.append(".");
            } else if ("\\.[]{}()^$?+|".indexOf(charAt) > -1) {
                sb.append('\\');
            }
            sb.append(charAt);
        }
        return sb.toString();
    }
}
