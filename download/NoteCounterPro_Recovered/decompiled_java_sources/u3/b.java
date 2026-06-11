package u3;

import androidx.emoji2.text.u;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public final class b extends c implements RandomAccess {

    /* renamed from: g, reason: collision with root package name */
    public final c f3540g;
    public final int h;

    /* renamed from: i, reason: collision with root package name */
    public final int f3541i;

    public b(c cVar, int i5, int i6) {
        this.f3540g = cVar;
        this.h = i5;
        a.a.f(i5, i6, cVar.a());
        this.f3541i = i6 - i5;
    }

    @Override // u3.c
    public final int a() {
        return this.f3541i;
    }

    @Override // java.util.List
    public final Object get(int i5) {
        int i6 = this.f3541i;
        if (i5 < 0 || i5 >= i6) {
            throw new IndexOutOfBoundsException(u.g(i5, i6, "index: ", ", size: "));
        }
        return this.f3540g.get(this.h + i5);
    }

    @Override // u3.c, java.util.List
    public final List subList(int i5, int i6) {
        a.a.f(i5, i6, this.f3541i);
        int i7 = this.h;
        return new b(this.f3540g, i5 + i7, i7 + i6);
    }
}
