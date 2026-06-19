package u3;

import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public abstract class h extends y4.b {
    public static List S(Object... objArr) {
        if (objArr.length <= 0) {
            return o.f3547g;
        }
        List asList = Arrays.asList(objArr);
        g4.i.d(asList, "asList(...)");
        return asList;
    }
}
