package t4;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ServiceConfigurationError;

/* loaded from: classes.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    public static final List f3412a;

    static {
        try {
            Iterator it = Arrays.asList(new p4.b()).iterator();
            g4.i.e(it, "<this>");
            f3412a = m4.e.Q(new m4.a(new m4.h(it)));
        } catch (Throwable th) {
            throw new ServiceConfigurationError(th.getMessage(), th);
        }
    }
}
