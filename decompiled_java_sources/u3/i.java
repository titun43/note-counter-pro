package u3;

import java.util.Collection;

/* loaded from: classes.dex */
public abstract class i extends h {
    public static int T(Iterable iterable) {
        g4.i.e(iterable, "<this>");
        if (iterable instanceof Collection) {
            return ((Collection) iterable).size();
        }
        return 10;
    }
}
