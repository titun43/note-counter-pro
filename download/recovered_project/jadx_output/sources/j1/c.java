package j1;

import androidx.fragment.app.h1;
import java.util.Objects;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final String f2014a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2015b;

    public c(String str) {
        this.f2014a = str;
        this.f2015b = 0;
    }

    public final String a() {
        int i5 = this.f2015b;
        if (i5 == 0) {
            return this.f2014a;
        }
        throw new IllegalStateException(h1.b(new StringBuilder("Wrong data accessor type detected. "), i5 != 0 ? i5 != 1 ? "Unknown" : "ArrayBuffer" : "String", " expected, but got ", "String"));
    }

    public c(byte[] bArr) {
        Objects.requireNonNull(bArr);
        this.f2014a = null;
        this.f2015b = 1;
    }
}
