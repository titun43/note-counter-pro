package m4;

import androidx.activity.w;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class c implements d {

    /* renamed from: a, reason: collision with root package name */
    public final w f2605a;

    /* renamed from: b, reason: collision with root package name */
    public final g f2606b;

    public c(w wVar, g gVar) {
        this.f2605a = wVar;
        this.f2606b = gVar;
    }

    @Override // m4.d
    public final Iterator iterator() {
        return new b(this);
    }
}
