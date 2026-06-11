package com.google.android.gms.common.api.internal;

import android.app.ActivityManager;
import android.app.Application;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import android.os.SystemClock;
import android.util.Log;
import android.util.SparseIntArray;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.base.zaf;
import com.google.android.gms.internal.base.zap;
import com.google.android.gms.internal.base.zau;
import com.google.android.gms.internal.common.zzi;
import com.google.android.gms.internal.common.zzj;
import com.google.android.gms.internal.common.zzx;
import com.google.android.gms.internal.common.zzy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class g implements Handler.Callback {

    /* renamed from: u, reason: collision with root package name */
    public static final Status f967u = new Status(4, "Sign-out occurred while this API call was in progress.", null, null);

    /* renamed from: v, reason: collision with root package name */
    public static final Status f968v = new Status(4, "The user must be signed in to make this API call.", null, null);
    public static final Object w = new Object();

    /* renamed from: x, reason: collision with root package name */
    public static g f969x;

    /* renamed from: g, reason: collision with root package name */
    public long f970g;
    public boolean h;

    /* renamed from: i, reason: collision with root package name */
    public com.google.android.gms.common.internal.t f971i;

    /* renamed from: j, reason: collision with root package name */
    public v2.b f972j;

    /* renamed from: k, reason: collision with root package name */
    public final Context f973k;

    /* renamed from: l, reason: collision with root package name */
    public final t2.e f974l;

    /* renamed from: m, reason: collision with root package name */
    public final androidx.emoji2.text.p f975m;

    /* renamed from: n, reason: collision with root package name */
    public final AtomicInteger f976n;

    /* renamed from: o, reason: collision with root package name */
    public final AtomicInteger f977o;

    /* renamed from: p, reason: collision with root package name */
    public final ConcurrentHashMap f978p;

    /* renamed from: q, reason: collision with root package name */
    public final o.g f979q;

    /* renamed from: r, reason: collision with root package name */
    public final o.g f980r;

    /* renamed from: s, reason: collision with root package name */
    public final zau f981s;

    /* renamed from: t, reason: collision with root package name */
    public volatile boolean f982t;

    public g(Context context, Looper looper) {
        t2.e eVar = t2.e.f3372d;
        this.f970g = 10000L;
        this.h = false;
        this.f976n = new AtomicInteger(1);
        this.f977o = new AtomicInteger(0);
        this.f978p = new ConcurrentHashMap(5, 0.75f, 1);
        this.f979q = new o.g(0);
        this.f980r = new o.g(0);
        this.f982t = true;
        this.f973k = context;
        zau zauVar = new zau(looper, this);
        this.f981s = zauVar;
        this.f974l = eVar;
        this.f975m = new androidx.emoji2.text.p(8);
        PackageManager packageManager = context.getPackageManager();
        if (x2.d.f3709f == null) {
            x2.d.f3709f = Boolean.valueOf(x2.d.f() && packageManager.hasSystemFeature("android.hardware.type.automotive"));
        }
        if (x2.d.f3709f.booleanValue()) {
            this.f982t = false;
        }
        zauVar.sendMessage(zauVar.obtainMessage(6));
    }

    public static Status c(a aVar, t2.b bVar) {
        return new Status(17, "API: " + aVar.f937b.f935c + " is not available on this device. Connection failed with: " + String.valueOf(bVar), bVar.f3363i, bVar);
    }

    public static g f(Context context) {
        g gVar;
        HandlerThread handlerThread;
        synchronized (w) {
            if (f969x == null) {
                synchronized (com.google.android.gms.common.internal.m.f1087a) {
                    try {
                        handlerThread = com.google.android.gms.common.internal.m.f1089c;
                        if (handlerThread == null) {
                            HandlerThread handlerThread2 = new HandlerThread("GoogleApiHandler", 9);
                            com.google.android.gms.common.internal.m.f1089c = handlerThread2;
                            handlerThread2.start();
                            handlerThread = com.google.android.gms.common.internal.m.f1089c;
                        }
                    } finally {
                    }
                }
                Looper looper = handlerThread.getLooper();
                Context applicationContext = context.getApplicationContext();
                Object obj = t2.e.f3371c;
                f969x = new g(applicationContext, looper);
            }
            gVar = f969x;
        }
        return gVar;
    }

    public final boolean a() {
        if (this.h) {
            return false;
        }
        com.google.android.gms.common.internal.s sVar = (com.google.android.gms.common.internal.s) com.google.android.gms.common.internal.r.b().f1116a;
        if (sVar != null && !sVar.h) {
            return false;
        }
        int i5 = ((SparseIntArray) this.f975m.h).get(203400000, -1);
        return i5 == -1 || i5 == 0;
    }

    public final boolean b(t2.b bVar, int i5) {
        t2.e eVar = this.f974l;
        eVar.getClass();
        Context context = this.f973k;
        if (!z2.b.q(context)) {
            int i6 = bVar.h;
            PendingIntent pendingIntent = bVar.f3363i;
            if (!((i6 == 0 || pendingIntent == null) ? false : true)) {
                pendingIntent = null;
                Intent b2 = eVar.b(context, null, i6);
                if (b2 != null) {
                    pendingIntent = PendingIntent.getActivity(context, 0, b2, 201326592);
                }
            }
            if (pendingIntent != null) {
                int i7 = GoogleApiActivity.h;
                Intent intent = new Intent(context, (Class<?>) GoogleApiActivity.class);
                intent.putExtra("pending_intent", pendingIntent);
                intent.putExtra("failing_client_id", i5);
                intent.putExtra("notify_manager", true);
                eVar.g(context, i6, PendingIntent.getActivity(context, 0, intent, zap.zaa | 134217728));
                return true;
            }
        }
        return false;
    }

    public final a0 d(com.google.android.gms.common.api.m mVar) {
        a apiKey = mVar.getApiKey();
        ConcurrentHashMap concurrentHashMap = this.f978p;
        a0 a0Var = (a0) concurrentHashMap.get(apiKey);
        if (a0Var == null) {
            a0Var = new a0(this, mVar);
            concurrentHashMap.put(apiKey, a0Var);
        }
        if (a0Var.h.requiresSignIn()) {
            this.f980r.add(apiKey);
        }
        a0Var.l();
        return a0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(h3.h hVar, int i5, com.google.android.gms.common.api.m mVar) {
        g0 g0Var;
        g gVar;
        if (i5 == 0) {
            return;
        }
        a apiKey = mVar.getApiKey();
        if (a()) {
            com.google.android.gms.common.internal.s sVar = (com.google.android.gms.common.internal.s) com.google.android.gms.common.internal.r.b().f1116a;
            boolean z4 = true;
            if (sVar != null) {
                if (sVar.h) {
                    boolean z5 = sVar.f1118i;
                    a0 a0Var = (a0) this.f978p.get(apiKey);
                    if (a0Var != null) {
                        Object obj = a0Var.h;
                        if (obj instanceof com.google.android.gms.common.internal.f) {
                            com.google.android.gms.common.internal.f fVar = (com.google.android.gms.common.internal.f) obj;
                            if (fVar.hasConnectionInfo() && !fVar.isConnecting()) {
                                com.google.android.gms.common.internal.j a5 = g0.a(a0Var, fVar, i5);
                                if (a5 != null) {
                                    a0Var.f950r++;
                                    z4 = a5.f1061i;
                                }
                            }
                        }
                    }
                    z4 = z5;
                }
            }
            gVar = this;
            g0Var = new g0(gVar, i5, apiKey, z4 ? System.currentTimeMillis() : 0L, z4 ? SystemClock.elapsedRealtime() : 0L);
            if (g0Var == null) {
                h3.n nVar = hVar.f1713a;
                zau zauVar = gVar.f981s;
                zauVar.getClass();
                b0.d dVar = new b0.d(zauVar, 2);
                nVar.getClass();
                nVar.f1728b.a(new h3.j(dVar, g0Var));
                nVar.h();
                return;
            }
            return;
        }
        g0Var = null;
        gVar = this;
        if (g0Var == null) {
        }
    }

    public final void g(t2.b bVar, int i5) {
        if (b(bVar, i5)) {
            return;
        }
        zau zauVar = this.f981s;
        zauVar.sendMessage(zauVar.obtainMessage(5, i5, 0, bVar));
    }

    /* JADX WARN: Removed duplicated region for block: B:175:0x03a3  */
    @Override // android.os.Handler.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean handleMessage(Message message) {
        a0 a0Var;
        boolean z4;
        boolean isIsolated;
        t2.d[] g5;
        int i5 = message.what;
        int i6 = 20;
        switch (i5) {
            case 1:
                this.f970g = true == ((Boolean) message.obj).booleanValue() ? 10000L : 300000L;
                this.f981s.removeMessages(12);
                for (a aVar : this.f978p.keySet()) {
                    zau zauVar = this.f981s;
                    zauVar.sendMessageDelayed(zauVar.obtainMessage(12, aVar), this.f970g);
                }
                return true;
            case 2:
                message.obj.getClass();
                throw new ClassCastException();
            case 3:
                for (a0 a0Var2 : this.f978p.values()) {
                    com.google.android.gms.common.internal.b0.c(a0Var2.f951s.f981s);
                    a0Var2.f949q = null;
                    a0Var2.l();
                }
                return true;
            case 4:
            case 8:
            case 13:
                i0 i0Var = (i0) message.obj;
                a0 a0Var3 = (a0) this.f978p.get(i0Var.f993c.getApiKey());
                if (a0Var3 == null) {
                    a0Var3 = d(i0Var.f993c);
                }
                if (!a0Var3.h.requiresSignIn() || this.f977o.get() == i0Var.f992b) {
                    a0Var3.m(i0Var.f991a);
                    return true;
                }
                i0Var.f991a.a(f967u);
                a0Var3.p();
                return true;
            case 5:
                int i7 = message.arg1;
                t2.b bVar = (t2.b) message.obj;
                Iterator it = this.f978p.values().iterator();
                while (true) {
                    if (it.hasNext()) {
                        a0Var = (a0) it.next();
                        if (a0Var.f945m == i7) {
                        }
                    } else {
                        a0Var = null;
                    }
                }
                if (a0Var == null) {
                    Log.wtf("GoogleApiManager", androidx.emoji2.text.u.i(i7, "Could not find API instance ", " while trying to fail enqueued calls."), new Exception());
                    return true;
                }
                int i8 = bVar.h;
                if (i8 != 13) {
                    a0Var.c(c(a0Var.f941i, bVar));
                    return true;
                }
                this.f974l.getClass();
                int i9 = t2.h.f3377c;
                a0Var.c(new Status(17, "Error resolution was canceled by the user, original error message: " + t2.b.a(i8) + ": " + bVar.f3364j, null, null));
                return true;
            case 6:
                if (this.f973k.getApplicationContext() instanceof Application) {
                    Application application = (Application) this.f973k.getApplicationContext();
                    b bVar2 = b.f952k;
                    synchronized (bVar2) {
                        try {
                            if (!bVar2.f955j) {
                                application.registerActivityLifecycleCallbacks(bVar2);
                                application.registerComponentCallbacks(bVar2);
                                bVar2.f955j = true;
                            }
                        } finally {
                        }
                    }
                    z zVar = new z(this);
                    synchronized (bVar2) {
                        bVar2.f954i.add(zVar);
                    }
                    AtomicBoolean atomicBoolean = bVar2.f953g;
                    AtomicBoolean atomicBoolean2 = bVar2.h;
                    if (!atomicBoolean2.get()) {
                        Boolean bool = x2.d.h;
                        if (bool == null) {
                            if (Build.VERSION.SDK_INT >= 28) {
                                isIsolated = Process.isIsolated();
                                bool = Boolean.valueOf(isIsolated);
                            } else {
                                try {
                                    Object zza = zzj.zza(Process.class, "isIsolated", new zzi[0]);
                                    Object[] objArr = new Object[0];
                                    if (zza == null) {
                                        throw new zzy(zzx.zza("expected a non-null reference", objArr));
                                    }
                                    bool = (Boolean) zza;
                                } catch (ReflectiveOperationException unused) {
                                    bool = Boolean.FALSE;
                                }
                            }
                            x2.d.h = bool;
                        }
                        if (bool.booleanValue()) {
                            z4 = true;
                            if (!z4) {
                                this.f970g = 300000L;
                            }
                        } else {
                            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
                            ActivityManager.getMyMemoryState(runningAppProcessInfo);
                            if (!atomicBoolean2.getAndSet(true) && runningAppProcessInfo.importance > 100) {
                                atomicBoolean.set(true);
                            }
                        }
                    }
                    z4 = atomicBoolean.get();
                    if (!z4) {
                    }
                }
                return true;
            case 7:
                d((com.google.android.gms.common.api.m) message.obj);
                return true;
            case 9:
                if (this.f978p.containsKey(message.obj)) {
                    a0 a0Var4 = (a0) this.f978p.get(message.obj);
                    com.google.android.gms.common.internal.b0.c(a0Var4.f951s.f981s);
                    if (a0Var4.f947o) {
                        a0Var4.l();
                        return true;
                    }
                }
                return true;
            case 10:
                o.g gVar = this.f980r;
                gVar.getClass();
                o.b bVar3 = new o.b(gVar);
                while (bVar3.hasNext()) {
                    a0 a0Var5 = (a0) this.f978p.remove((a) bVar3.next());
                    if (a0Var5 != null) {
                        a0Var5.p();
                    }
                }
                this.f980r.clear();
                return true;
            case 11:
                if (this.f978p.containsKey(message.obj)) {
                    a0 a0Var6 = (a0) this.f978p.get(message.obj);
                    g gVar2 = a0Var6.f951s;
                    com.google.android.gms.common.internal.b0.c(gVar2.f981s);
                    boolean z5 = a0Var6.f947o;
                    if (z5) {
                        a aVar2 = a0Var6.f941i;
                        zau zauVar2 = a0Var6.f951s.f981s;
                        if (z5) {
                            zauVar2.removeMessages(11, aVar2);
                            zauVar2.removeMessages(9, aVar2);
                            a0Var6.f947o = false;
                        }
                        a0Var6.c(gVar2.f974l.c(gVar2.f973k, t2.f.f3373a) == 18 ? new Status(21, "Connection timed out waiting for Google Play services update to complete.", null, null) : new Status(22, "API failed to connect while resuming due to an unknown error.", null, null));
                        a0Var6.h.disconnect("Timing out connection while resuming.");
                        return true;
                    }
                }
                return true;
            case 12:
                if (this.f978p.containsKey(message.obj)) {
                    ((a0) this.f978p.get(message.obj)).k(true);
                    return true;
                }
                return true;
            case 14:
                y yVar = (y) message.obj;
                a aVar3 = yVar.f1029a;
                if (this.f978p.containsKey(aVar3)) {
                    yVar.f1030b.a(Boolean.valueOf(((a0) this.f978p.get(aVar3)).k(false)));
                    return true;
                }
                yVar.f1030b.a(Boolean.FALSE);
                return true;
            case 15:
                b0 b0Var = (b0) message.obj;
                if (this.f978p.containsKey(b0Var.f956a)) {
                    a0 a0Var7 = (a0) this.f978p.get(b0Var.f956a);
                    if (a0Var7.f948p.contains(b0Var) && !a0Var7.f947o) {
                        if (a0Var7.h.isConnected()) {
                            a0Var7.e();
                            return true;
                        }
                        a0Var7.l();
                        return true;
                    }
                }
                return true;
            case 16:
                b0 b0Var2 = (b0) message.obj;
                if (this.f978p.containsKey(b0Var2.f956a)) {
                    a0 a0Var8 = (a0) this.f978p.get(b0Var2.f956a);
                    ArrayList arrayList = a0Var8.f948p;
                    g gVar3 = a0Var8.f951s;
                    LinkedList<r0> linkedList = a0Var8.f940g;
                    if (arrayList.remove(b0Var2)) {
                        gVar3.f981s.removeMessages(15, b0Var2);
                        gVar3.f981s.removeMessages(16, b0Var2);
                        t2.d dVar = b0Var2.f957b;
                        ArrayList arrayList2 = new ArrayList(linkedList.size());
                        for (r0 r0Var : linkedList) {
                            if ((r0Var instanceof f0) && (g5 = ((f0) r0Var).g(a0Var8)) != null && x2.d.d(g5, dVar)) {
                                arrayList2.add(r0Var);
                            }
                        }
                        int size = arrayList2.size();
                        for (int i10 = 0; i10 < size; i10++) {
                            r0 r0Var2 = (r0) arrayList2.get(i10);
                            linkedList.remove(r0Var2);
                            r0Var2.b(new com.google.android.gms.common.api.x(dVar));
                        }
                    }
                }
                return true;
            case 17:
                com.google.android.gms.common.internal.t tVar = this.f971i;
                if (tVar != null) {
                    if (tVar.f1121g > 0 || a()) {
                        if (this.f972j == null) {
                            this.f972j = new v2.b(this.f973k, v2.b.f3579a, com.google.android.gms.common.internal.u.f1122b, com.google.android.gms.common.api.l.f1033c);
                        }
                        v2.b bVar4 = this.f972j;
                        bVar4.getClass();
                        t tVar2 = new t();
                        tVar2.f1023d = 0;
                        t2.d[] dVarArr = {zaf.zaa};
                        tVar2.f1022c = dVarArr;
                        tVar2.f1021b = false;
                        tVar2.f1020a = new u1.f(tVar, i6);
                        bVar4.doBestEffortWrite(new k0(tVar2, dVarArr, false, 0));
                    }
                    this.f971i = null;
                    return true;
                }
                return true;
            case 18:
                h0 h0Var = (h0) message.obj;
                if (h0Var.f989c == 0) {
                    com.google.android.gms.common.internal.t tVar3 = new com.google.android.gms.common.internal.t(h0Var.f988b, Arrays.asList(h0Var.f987a));
                    if (this.f972j == null) {
                        this.f972j = new v2.b(this.f973k, v2.b.f3579a, com.google.android.gms.common.internal.u.f1122b, com.google.android.gms.common.api.l.f1033c);
                    }
                    v2.b bVar5 = this.f972j;
                    bVar5.getClass();
                    t tVar4 = new t();
                    tVar4.f1023d = 0;
                    t2.d[] dVarArr2 = {zaf.zaa};
                    tVar4.f1022c = dVarArr2;
                    tVar4.f1021b = false;
                    tVar4.f1020a = new u1.f(tVar3, i6);
                    bVar5.doBestEffortWrite(new k0(tVar4, dVarArr2, false, 0));
                    return true;
                }
                com.google.android.gms.common.internal.t tVar5 = this.f971i;
                if (tVar5 != null) {
                    List list = tVar5.h;
                    if (tVar5.f1121g != h0Var.f988b || (list != null && list.size() >= h0Var.f990d)) {
                        this.f981s.removeMessages(17);
                        com.google.android.gms.common.internal.t tVar6 = this.f971i;
                        if (tVar6 != null) {
                            if (tVar6.f1121g > 0 || a()) {
                                if (this.f972j == null) {
                                    this.f972j = new v2.b(this.f973k, v2.b.f3579a, com.google.android.gms.common.internal.u.f1122b, com.google.android.gms.common.api.l.f1033c);
                                }
                                v2.b bVar6 = this.f972j;
                                bVar6.getClass();
                                t tVar7 = new t();
                                tVar7.f1023d = 0;
                                t2.d[] dVarArr3 = {zaf.zaa};
                                tVar7.f1022c = dVarArr3;
                                tVar7.f1021b = false;
                                tVar7.f1020a = new u1.f(tVar6, i6);
                                bVar6.doBestEffortWrite(new k0(tVar7, dVarArr3, false, 0));
                            }
                            this.f971i = null;
                        }
                    } else {
                        com.google.android.gms.common.internal.t tVar8 = this.f971i;
                        com.google.android.gms.common.internal.q qVar = h0Var.f987a;
                        if (tVar8.h == null) {
                            tVar8.h = new ArrayList();
                        }
                        tVar8.h.add(qVar);
                    }
                }
                if (this.f971i == null) {
                    ArrayList arrayList3 = new ArrayList();
                    arrayList3.add(h0Var.f987a);
                    this.f971i = new com.google.android.gms.common.internal.t(h0Var.f988b, arrayList3);
                    zau zauVar3 = this.f981s;
                    zauVar3.sendMessageDelayed(zauVar3.obtainMessage(17), h0Var.f989c);
                    return true;
                }
                return true;
            case 19:
                this.h = false;
                return true;
            default:
                Log.w("GoogleApiManager", "Unknown message id: " + i5);
                return false;
        }
    }
}
