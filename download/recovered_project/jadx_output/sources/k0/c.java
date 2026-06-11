package k0;

import java.io.Serializable;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class c extends y3.c {

    /* renamed from: g, reason: collision with root package name */
    public Serializable f2324g;
    public Iterator h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f2325i;

    /* renamed from: j, reason: collision with root package name */
    public int f2326j;

    @Override // y3.a
    public final Object invokeSuspend(Object obj) {
        this.f2325i = obj;
        this.f2326j |= Integer.MIN_VALUE;
        return a.a.c(null, null, this);
    }
}
