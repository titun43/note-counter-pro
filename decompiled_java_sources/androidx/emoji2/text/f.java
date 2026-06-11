package androidx.emoji2.text;

import android.os.Build;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class f extends z2.b {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g f255c;

    public f(g gVar) {
        this.f255c = gVar;
    }

    @Override // z2.b
    public final void s(Throwable th) {
        ((l) this.f255c.f257b).d(th);
    }

    @Override // z2.b
    public final void t(r1.h hVar) {
        g gVar = this.f255c;
        gVar.f258c = hVar;
        r1.h hVar2 = (r1.h) gVar.f258c;
        l lVar = (l) gVar.f257b;
        gVar.f256a = new t(hVar2, lVar.f269g, lVar.f270i, Build.VERSION.SDK_INT >= 34 ? o.a() : a.a.j());
        l lVar2 = (l) gVar.f257b;
        lVar2.getClass();
        ArrayList arrayList = new ArrayList();
        lVar2.f263a.writeLock().lock();
        try {
            lVar2.f265c = 1;
            arrayList.addAll(lVar2.f264b);
            lVar2.f264b.clear();
            lVar2.f263a.writeLock().unlock();
            lVar2.f266d.post(new j(arrayList, lVar2.f265c, (Throwable) null));
        } catch (Throwable th) {
            lVar2.f263a.writeLock().unlock();
            throw th;
        }
    }
}
