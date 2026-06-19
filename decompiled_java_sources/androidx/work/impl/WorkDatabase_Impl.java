package androidx.work.impl;

import android.content.Context;
import androidx.emoji2.text.p;
import androidx.emoji2.text.t;
import d1.c;
import java.util.HashMap;
import l2.j;
import r1.h;
import t1.b;
import z0.a;
import z0.e;

/* loaded from: classes.dex */
public final class WorkDatabase_Impl extends WorkDatabase {

    /* renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ int f643s = 0;

    /* renamed from: l, reason: collision with root package name */
    public volatile j f644l;

    /* renamed from: m, reason: collision with root package name */
    public volatile p f645m;

    /* renamed from: n, reason: collision with root package name */
    public volatile p f646n;

    /* renamed from: o, reason: collision with root package name */
    public volatile t f647o;

    /* renamed from: p, reason: collision with root package name */
    public volatile p f648p;

    /* renamed from: q, reason: collision with root package name */
    public volatile h f649q;

    /* renamed from: r, reason: collision with root package name */
    public volatile p f650r;

    @Override // z0.i
    public final e d() {
        return new e(this, new HashMap(0), new HashMap(0), "Dependency", "WorkSpec", "WorkTag", "SystemIdInfo", "WorkName", "WorkProgress", "Preference");
    }

    @Override // z0.i
    public final c e(a aVar) {
        p pVar = new p(26, aVar, new k1.j(this, 16));
        Context context = aVar.f3888b;
        String str = aVar.f3889c;
        if (context == null) {
            throw new IllegalArgumentException("Must set a non-null context to create the configuration.");
        }
        return aVar.f3887a.f(new d1.a(context, str, pVar, false));
    }

    @Override // androidx.work.impl.WorkDatabase
    public final p i() {
        p pVar;
        if (this.f645m != null) {
            return this.f645m;
        }
        synchronized (this) {
            try {
                if (this.f645m == null) {
                    this.f645m = new p(this, 19);
                }
                pVar = this.f645m;
            } catch (Throwable th) {
                throw th;
            }
        }
        return pVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final p j() {
        p pVar;
        if (this.f650r != null) {
            return this.f650r;
        }
        synchronized (this) {
            try {
                if (this.f650r == null) {
                    this.f650r = new p(this, 20);
                }
                pVar = this.f650r;
            } catch (Throwable th) {
                throw th;
            }
        }
        return pVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final t k() {
        t tVar;
        if (this.f647o != null) {
            return this.f647o;
        }
        synchronized (this) {
            try {
                if (this.f647o == null) {
                    this.f647o = new t(this);
                }
                tVar = this.f647o;
            } catch (Throwable th) {
                throw th;
            }
        }
        return tVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final p l() {
        p pVar;
        if (this.f648p != null) {
            return this.f648p;
        }
        synchronized (this) {
            try {
                if (this.f648p == null) {
                    this.f648p = new p(this, 21);
                }
                pVar = this.f648p;
            } catch (Throwable th) {
                throw th;
            }
        }
        return pVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final h m() {
        h hVar;
        if (this.f649q != null) {
            return this.f649q;
        }
        synchronized (this) {
            try {
                if (this.f649q == null) {
                    h hVar2 = new h();
                    hVar2.f3161g = this;
                    hVar2.h = new b(this, 4);
                    hVar2.f3162i = new t1.e(this, 1);
                    hVar2.f3163j = new t1.e(this, 2);
                    this.f649q = hVar2;
                }
                hVar = this.f649q;
            } catch (Throwable th) {
                throw th;
            }
        }
        return hVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final j n() {
        j jVar;
        if (this.f644l != null) {
            return this.f644l;
        }
        synchronized (this) {
            try {
                if (this.f644l == null) {
                    this.f644l = new j(this);
                }
                jVar = this.f644l;
            } catch (Throwable th) {
                throw th;
            }
        }
        return jVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final p o() {
        p pVar;
        if (this.f646n != null) {
            return this.f646n;
        }
        synchronized (this) {
            try {
                if (this.f646n == null) {
                    this.f646n = new p(this, 22);
                }
                pVar = this.f646n;
            } catch (Throwable th) {
                throw th;
            }
        }
        return pVar;
    }
}
