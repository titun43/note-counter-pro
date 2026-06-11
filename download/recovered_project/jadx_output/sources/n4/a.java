package n4;

import java.nio.charset.Charset;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final Charset f2703a;

    static {
        Charset forName = Charset.forName("UTF-8");
        g4.i.d(forName, "forName(...)");
        f2703a = forName;
        g4.i.d(Charset.forName("UTF-16"), "forName(...)");
        g4.i.d(Charset.forName("UTF-16BE"), "forName(...)");
        g4.i.d(Charset.forName("UTF-16LE"), "forName(...)");
        g4.i.d(Charset.forName("US-ASCII"), "forName(...)");
        g4.i.d(Charset.forName("ISO-8859-1"), "forName(...)");
    }
}
