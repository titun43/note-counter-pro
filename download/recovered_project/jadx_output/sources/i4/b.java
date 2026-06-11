package i4;

import b3.i;
import java.util.Random;

/* loaded from: classes.dex */
public final class b extends a {
    public final i h = new i(2);

    @Override // i4.a
    public final Random a() {
        Object obj = this.h.get();
        g4.i.d(obj, "get(...)");
        return (Random) obj;
    }
}
