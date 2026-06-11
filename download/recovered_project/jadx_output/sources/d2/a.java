package d2;

import f2.m;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class a implements m {

    /* renamed from: c, reason: collision with root package name */
    public static final String f1187c;

    /* renamed from: d, reason: collision with root package name */
    public static final Set f1188d;

    /* renamed from: e, reason: collision with root package name */
    public static final a f1189e;

    /* renamed from: a, reason: collision with root package name */
    public final String f1190a;

    /* renamed from: b, reason: collision with root package name */
    public final String f1191b;

    static {
        String z4 = y4.b.z("hts/frbslgiggolai.o/0clgbthfra=snpoo", "tp:/ieaeogn.ogepscmvc/o/ac?omtjo_rt3");
        f1187c = z4;
        y4.b.z("hts/frbslgigp.ogepscmv/ieo/eaybtho", "tp:/ieaeogn-agolai.o/1frlglgc/aclg");
        y4.b.z("AzSCki82AwsLzKd5O8zo", "IayckHiZRO1EFl1aGoK");
        f1188d = Collections.unmodifiableSet(new HashSet(Arrays.asList(new c2.b("proto"), new c2.b("json"))));
        f1189e = new a(z4, null);
    }

    public a(String str, String str2) {
        this.f1190a = str;
        this.f1191b = str2;
    }

    public static a a(byte[] bArr) {
        String str = new String(bArr, Charset.forName("UTF-8"));
        if (!str.startsWith("1$")) {
            throw new IllegalArgumentException("Version marker missing from extras");
        }
        String[] split = str.substring(2).split(Pattern.quote("\\"), 2);
        if (split.length != 2) {
            throw new IllegalArgumentException("Extra is not a valid encoded LegacyFlgDestination");
        }
        String str2 = split[0];
        if (str2.isEmpty()) {
            throw new IllegalArgumentException("Missing endpoint in CCTDestination extras");
        }
        String str3 = split[1];
        if (str3.isEmpty()) {
            str3 = null;
        }
        return new a(str2, str3);
    }
}
