package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.SparseIntArray;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.base.zau;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class a0 implements com.google.android.gms.common.api.n, com.google.android.gms.common.api.o {
    public final com.google.android.gms.common.api.g h;

    /* renamed from: i, reason: collision with root package name */
    public final a f941i;

    /* renamed from: j, reason: collision with root package name */
    public final androidx.emoji2.text.p f942j;

    /* renamed from: m, reason: collision with root package name */
    public final int f945m;

    /* renamed from: n, reason: collision with root package name */
    public final j0 f946n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f947o;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ g f951s;

    /* renamed from: g, reason: collision with root package name */
    public final LinkedList f940g = new LinkedList();

    /* renamed from: k, reason: collision with root package name */
    public final HashSet f943k = new HashSet();

    /* renamed from: l, reason: collision with root package name */
    public final HashMap f944l = new HashMap();

    /* renamed from: p, reason: collision with root package name */
    public final ArrayList f948p = new ArrayList();

    /* renamed from: q, reason: collision with root package name */
    public t2.b f949q = null;

    /* renamed from: r, reason: collision with root package name */
    public int f950r = 0;

    public a0(g gVar, com.google.android.gms.common.api.m mVar) {
        this.f951s = gVar;
        zau zauVar = gVar.f981s;
        com.google.android.gms.common.api.g zab = mVar.zab(zauVar.getLooper(), this);
        this.h = zab;
        this.f941i = mVar.getApiKey();
        this.f942j = new androidx.emoji2.text.p(5);
        this.f945m = mVar.zaa();
        if (zab.requiresSignIn()) {
            this.f946n = mVar.zac(gVar.f973k, zauVar);
        } else {
            this.f946n = null;
        }
    }

    @Override // com.google.android.gms.common.api.internal.f
    public final void a() {
        Looper myLooper = Looper.myLooper();
        zau zauVar = this.f951s.f981s;
        if (myLooper == zauVar.getLooper()) {
            f();
        } else {
            zauVar.post(new androidx.fragment.app.o(this, 5));
        }
    }

    public final void b(t2.b bVar) {
        HashSet hashSet = this.f943k;
        Iterator it = hashSet.iterator();
        if (!it.hasNext()) {
            hashSet.clear();
        } else {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (com.google.android.gms.common.internal.b0.j(bVar, t2.b.f3361l)) {
                this.h.getEndpointPackageName();
            }
            throw null;
        }
    }

    public final void c(Status status) {
        com.google.android.gms.common.internal.b0.c(this.f951s.f981s);
        d(status, null, false);
    }

    public final void d(Status status, Exception exc, boolean z4) {
        com.google.android.gms.common.internal.b0.c(this.f951s.f981s);
        if ((status == null) == (exc == null)) {
            throw new IllegalArgumentException("Status XOR exception should be null");
        }
        Iterator it = this.f940g.iterator();
        while (it.hasNext()) {
            r0 r0Var = (r0) it.next();
            if (!z4 || r0Var.f1018a == 2) {
                if (status != null) {
                    r0Var.a(status);
                } else {
                    r0Var.b(exc);
                }
                it.remove();
            }
        }
    }

    public final void e() {
        LinkedList linkedList = this.f940g;
        ArrayList arrayList = new ArrayList(linkedList);
        int size = arrayList.size();
        for (int i5 = 0; i5 < size; i5++) {
            r0 r0Var = (r0) arrayList.get(i5);
            if (!this.h.isConnected()) {
                return;
            }
            if (i(r0Var)) {
                linkedList.remove(r0Var);
            }
        }
    }

    public final void f() {
        g gVar = this.f951s;
        com.google.android.gms.common.internal.b0.c(gVar.f981s);
        this.f949q = null;
        b(t2.b.f3361l);
        zau zauVar = gVar.f981s;
        if (this.f947o) {
            a aVar = this.f941i;
            zauVar.removeMessages(11, aVar);
            zauVar.removeMessages(9, aVar);
            this.f947o = false;
        }
        Iterator it = this.f944l.values().iterator();
        if (it.hasNext()) {
            it.next().getClass();
            throw new ClassCastException();
        }
        e();
        h();
    }

    public final void g(int i5) {
        g gVar = this.f951s;
        zau zauVar = gVar.f981s;
        com.google.android.gms.common.internal.b0.c(gVar.f981s);
        this.f949q = null;
        this.f947o = true;
        String lastDisconnectMessage = this.h.getLastDisconnectMessage();
        androidx.emoji2.text.p pVar = this.f942j;
        pVar.getClass();
        StringBuilder sb = new StringBuilder("The connection to Google Play services was lost");
        if (i5 == 1) {
            sb.append(" due to service disconnection.");
        } else if (i5 == 3) {
            sb.append(" due to dead object exception.");
        }
        if (lastDisconnectMessage != null) {
            sb.append(" Last reason for disconnect: ");
            sb.append(lastDisconnectMessage);
        }
        pVar.G(true, new Status(20, sb.toString(), null, null));
        a aVar = this.f941i;
        zauVar.sendMessageDelayed(Message.obtain(zauVar, 9, aVar), 5000L);
        zauVar.sendMessageDelayed(Message.obtain(zauVar, 11, aVar), 120000L);
        ((SparseIntArray) gVar.f975m.h).clear();
        Iterator it = this.f944l.values().iterator();
        if (it.hasNext()) {
            androidx.emoji2.text.u.p(it.next());
            throw null;
        }
    }

    public final void h() {
        g gVar = this.f951s;
        zau zauVar = gVar.f981s;
        a aVar = this.f941i;
        zauVar.removeMessages(12, aVar);
        zauVar.sendMessageDelayed(zauVar.obtainMessage(12, aVar), gVar.f970g);
    }

    public final boolean i(r0 r0Var) {
        t2.d dVar;
        if (!(r0Var instanceof f0)) {
            androidx.emoji2.text.p pVar = this.f942j;
            com.google.android.gms.common.api.g gVar = this.h;
            r0Var.d(pVar, gVar.requiresSignIn());
            try {
                r0Var.c(this);
                return true;
            } catch (DeadObjectException unused) {
                onConnectionSuspended(1);
                gVar.disconnect("DeadObjectException thrown while running ApiCallRunner.");
                return true;
            }
        }
        f0 f0Var = (f0) r0Var;
        t2.d[] g5 = f0Var.g(this);
        if (g5 != null && g5.length != 0) {
            t2.d[] availableFeatures = this.h.getAvailableFeatures();
            if (availableFeatures == null) {
                availableFeatures = new t2.d[0];
            }
            o.f fVar = new o.f(availableFeatures.length);
            for (t2.d dVar2 : availableFeatures) {
                fVar.put(dVar2.f3368g, Long.valueOf(dVar2.a()));
            }
            int length = g5.length;
            for (int i5 = 0; i5 < length; i5++) {
                dVar = g5[i5];
                Long l5 = (Long) fVar.get(dVar.f3368g);
                if (l5 == null || l5.longValue() < dVar.a()) {
                    break;
                }
            }
        }
        dVar = null;
        if (dVar == null) {
            androidx.emoji2.text.p pVar2 = this.f942j;
            com.google.android.gms.common.api.g gVar2 = this.h;
            r0Var.d(pVar2, gVar2.requiresSignIn());
            try {
                r0Var.c(this);
                return true;
            } catch (DeadObjectException unused2) {
                onConnectionSuspended(1);
                gVar2.disconnect("DeadObjectException thrown while running ApiCallRunner.");
                return true;
            }
        }
        Log.w("GoogleApiManager", this.h.getClass().getName() + " could not execute call because it requires feature (" + dVar.f3368g + ", " + dVar.a() + ").");
        if (!this.f951s.f982t || !f0Var.f(this)) {
            f0Var.b(new com.google.android.gms.common.api.x(dVar));
            return true;
        }
        b0 b0Var = new b0(this.f941i, dVar);
        int indexOf = this.f948p.indexOf(b0Var);
        if (indexOf >= 0) {
            b0 b0Var2 = (b0) this.f948p.get(indexOf);
            this.f951s.f981s.removeMessages(15, b0Var2);
            zau zauVar = this.f951s.f981s;
            zauVar.sendMessageDelayed(Message.obtain(zauVar, 15, b0Var2), 5000L);
        } else {
            this.f948p.add(b0Var);
            zau zauVar2 = this.f951s.f981s;
            zauVar2.sendMessageDelayed(Message.obtain(zauVar2, 15, b0Var), 5000L);
            zau zauVar3 = this.f951s.f981s;
            zauVar3.sendMessageDelayed(Message.obtain(zauVar3, 16, b0Var), 120000L);
            t2.b bVar = new t2.b(2, null, null);
            if (!j(bVar)) {
                this.f951s.b(bVar, this.f945m);
            }
        }
        return false;
    }

    public final boolean j(t2.b bVar) {
        synchronized (g.w) {
        }
        return false;
    }

    public final boolean k(boolean z4) {
        com.google.android.gms.common.internal.b0.c(this.f951s.f981s);
        com.google.android.gms.common.api.g gVar = this.h;
        if (!gVar.isConnected() || !this.f944l.isEmpty()) {
            return false;
        }
        androidx.emoji2.text.p pVar = this.f942j;
        if (((Map) pVar.h).isEmpty() && ((Map) pVar.f274i).isEmpty()) {
            gVar.disconnect("Timing out service connection.");
            return true;
        }
        if (!z4) {
            return false;
        }
        h();
        return false;
    }

    public final void l() {
        g gVar = this.f951s;
        com.google.android.gms.common.internal.b0.c(gVar.f981s);
        com.google.android.gms.common.api.g gVar2 = this.h;
        if (gVar2.isConnected() || gVar2.isConnecting()) {
            return;
        }
        try {
            androidx.emoji2.text.p pVar = gVar.f975m;
            Context context = gVar.f973k;
            SparseIntArray sparseIntArray = (SparseIntArray) pVar.h;
            com.google.android.gms.common.internal.b0.g(context);
            int i5 = 0;
            if (gVar2.requiresGooglePlayServices()) {
                int minApkVersion = gVar2.getMinApkVersion();
                int i6 = ((SparseIntArray) pVar.h).get(minApkVersion, -1);
                if (i6 != -1) {
                    i5 = i6;
                } else {
                    int i7 = 0;
                    while (true) {
                        if (i7 >= sparseIntArray.size()) {
                            i5 = -1;
                            break;
                        }
                        int keyAt = sparseIntArray.keyAt(i7);
                        if (keyAt > minApkVersion && sparseIntArray.get(keyAt) == 0) {
                            break;
                        } else {
                            i7++;
                        }
                    }
                    if (i5 == -1) {
                        i5 = ((t2.e) pVar.f274i).c(context, minApkVersion);
                    }
                    sparseIntArray.put(minApkVersion, i5);
                }
            }
            if (i5 != 0) {
                t2.b bVar = new t2.b(i5, null, null);
                Log.w("GoogleApiManager", "The service for " + gVar2.getClass().getName() + " is not available: " + bVar.toString());
                n(bVar, null);
                return;
            }
            c0 c0Var = new c0(gVar, gVar2, this.f941i);
            if (gVar2.requiresSignIn()) {
                j0 j0Var = this.f946n;
                com.google.android.gms.common.internal.b0.g(j0Var);
                Handler handler = j0Var.h;
                com.google.android.gms.common.internal.i iVar = j0Var.f1000k;
                g3.a aVar = j0Var.f1001l;
                if (aVar != null) {
                    aVar.disconnect();
                }
                iVar.f1058f = Integer.valueOf(System.identityHashCode(j0Var));
                j0Var.f1001l = (g3.a) j0Var.f998i.buildClient(j0Var.f997g, handler.getLooper(), iVar, (Object) iVar.f1057e, (com.google.android.gms.common.api.n) j0Var, (com.google.android.gms.common.api.o) j0Var);
                j0Var.f1002m = c0Var;
                Set set = j0Var.f999j;
                if (set == null || set.isEmpty()) {
                    handler.post(new androidx.fragment.app.o(j0Var, 7));
                } else {
                    g3.a aVar2 = j0Var.f1001l;
                    aVar2.getClass();
                    aVar2.connect(new com.google.android.gms.common.internal.r(aVar2));
                }
            }
            try {
                gVar2.connect(c0Var);
            } catch (SecurityException e4) {
                n(new t2.b(10, null, null), e4);
            }
        } catch (IllegalStateException e5) {
            n(new t2.b(10, null, null), e5);
        }
    }

    public final void m(r0 r0Var) {
        com.google.android.gms.common.internal.b0.c(this.f951s.f981s);
        boolean isConnected = this.h.isConnected();
        LinkedList linkedList = this.f940g;
        if (isConnected) {
            if (i(r0Var)) {
                h();
                return;
            } else {
                linkedList.add(r0Var);
                return;
            }
        }
        linkedList.add(r0Var);
        t2.b bVar = this.f949q;
        if (bVar == null || bVar.h == 0 || bVar.f3363i == null) {
            l();
        } else {
            n(bVar, null);
        }
    }

    public final void n(t2.b bVar, RuntimeException runtimeException) {
        g3.a aVar;
        com.google.android.gms.common.internal.b0.c(this.f951s.f981s);
        j0 j0Var = this.f946n;
        if (j0Var != null && (aVar = j0Var.f1001l) != null) {
            aVar.disconnect();
        }
        com.google.android.gms.common.internal.b0.c(this.f951s.f981s);
        this.f949q = null;
        ((SparseIntArray) this.f951s.f975m.h).clear();
        b(bVar);
        if ((this.h instanceof v2.c) && bVar.h != 24) {
            g gVar = this.f951s;
            gVar.h = true;
            zau zauVar = gVar.f981s;
            zauVar.sendMessageDelayed(zauVar.obtainMessage(19), 300000L);
        }
        if (bVar.h == 4) {
            c(g.f968v);
            return;
        }
        if (this.f940g.isEmpty()) {
            this.f949q = bVar;
            return;
        }
        if (runtimeException != null) {
            com.google.android.gms.common.internal.b0.c(this.f951s.f981s);
            d(null, runtimeException, false);
            return;
        }
        if (!this.f951s.f982t) {
            c(g.c(this.f941i, bVar));
            return;
        }
        d(g.c(this.f941i, bVar), null, true);
        if (this.f940g.isEmpty() || j(bVar) || this.f951s.b(bVar, this.f945m)) {
            return;
        }
        if (bVar.h == 18) {
            this.f947o = true;
        }
        if (!this.f947o) {
            c(g.c(this.f941i, bVar));
            return;
        }
        g gVar2 = this.f951s;
        a aVar2 = this.f941i;
        zau zauVar2 = gVar2.f981s;
        zauVar2.sendMessageDelayed(Message.obtain(zauVar2, 9, aVar2), 5000L);
    }

    public final void o(t2.b bVar) {
        com.google.android.gms.common.internal.b0.c(this.f951s.f981s);
        com.google.android.gms.common.api.g gVar = this.h;
        gVar.disconnect("onSignInFailed for " + gVar.getClass().getName() + " with " + String.valueOf(bVar));
        n(bVar, null);
    }

    @Override // com.google.android.gms.common.api.internal.n
    public final void onConnectionFailed(t2.b bVar) {
        n(bVar, null);
    }

    @Override // com.google.android.gms.common.api.internal.f
    public final void onConnectionSuspended(int i5) {
        Looper myLooper = Looper.myLooper();
        zau zauVar = this.f951s.f981s;
        if (myLooper == zauVar.getLooper()) {
            g(i5);
        } else {
            zauVar.post(new androidx.emoji2.text.j(this, i5, 1));
        }
    }

    public final void p() {
        com.google.android.gms.common.internal.b0.c(this.f951s.f981s);
        Status status = g.f967u;
        c(status);
        this.f942j.G(false, status);
        for (j jVar : (j[]) this.f944l.keySet().toArray(new j[0])) {
            m(new q0(jVar, new h3.h()));
        }
        b(new t2.b(4, null, null));
        com.google.android.gms.common.api.g gVar = this.h;
        if (gVar.isConnected()) {
            gVar.onUserSignOut(new k1.j(this, 3));
        }
    }
}
