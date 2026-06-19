package d4;

import java.io.File;
import java.io.IOException;

/* loaded from: classes.dex */
public final class n implements f4.p {

    /* renamed from: g, reason: collision with root package name */
    public static final n f1224g = new n();

    @Override // f4.p
    public final Object invoke(Object obj, Object obj2) {
        IOException iOException = (IOException) obj2;
        g4.i.e((File) obj, "<unused var>");
        g4.i.e(iOException, "exception");
        throw iOException;
    }
}
