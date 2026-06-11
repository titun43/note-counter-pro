package androidx.fragment.app;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.view.Menu;
import android.view.MotionEvent;
import android.view.Window;
import android.view.animation.AnimationUtils;
import android.view.inputmethod.InputMethodManager;
import androidx.appcompat.widget.SearchView$SearchAutoComplete;
import androidx.appcompat.widget.Toolbar;
import androidx.work.ListenableWorker;
import androidx.work.impl.WorkDatabase_Impl;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import k.t1;
import org.apache.cordova.NativeToJsMessageQueue$OnlineEventsBridgeMode;
import org.apache.cordova.engine.SystemWebView;
import org.apache.cordova.engine.SystemWebViewEngine;

/* loaded from: classes.dex */
public final class o implements Runnable {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f413g;
    public final Object h;

    public o(com.google.android.gms.common.api.internal.x xVar, c0.j jVar) {
        this.f413g = 8;
        this.h = jVar;
    }

    public HashSet a() {
        HashSet hashSet = new HashSet();
        Cursor g5 = ((z0.e) this.h).f3904c.g(new androidx.emoji2.text.r("SELECT * FROM room_table_modification_log WHERE invalidated = 1;", 1));
        while (g5.moveToNext()) {
            try {
                hashSet.add(Integer.valueOf(g5.getInt(0)));
            } catch (Throwable th) {
                g5.close();
                throw th;
            }
        }
        g5.close();
        if (!hashSet.isEmpty()) {
            ((z0.e) this.h).f3907f.l();
        }
        return hashSet;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0327  */
    /* JADX WARN: Removed duplicated region for block: B:167:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:39:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r4v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v17, types: [java.util.Set] */
    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Type inference failed for: r4v23 */
    /* JADX WARN: Type inference failed for: r4v24 */
    /* JADX WARN: Type inference failed for: r4v25 */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        Object obj;
        ?? r42 = 0;
        r42 = 0;
        switch (this.f413g) {
            case 0:
                s sVar = (s) this.h;
                sVar.f422b0.onDismiss(sVar.f430j0);
                return;
            case 1:
                z zVar = (z) this.h;
                if (zVar.O != null) {
                    zVar.b().getClass();
                    return;
                }
                return;
            case 2:
                ((u0) this.h).A(true);
                return;
            case 3:
                synchronized (((androidx.lifecycle.a0) this.h).f517a) {
                    obj = ((androidx.lifecycle.a0) this.h).f522f;
                    ((androidx.lifecycle.a0) this.h).f522f = androidx.lifecycle.a0.f516k;
                }
                ((androidx.lifecycle.a0) this.h).e(obj);
                return;
            case 4:
                Object obj2 = ((u1.f) this.h).h;
                return;
            case 5:
                ((com.google.android.gms.common.api.internal.a0) this.h).f();
                return;
            case 6:
                com.google.android.gms.common.api.g gVar = ((com.google.android.gms.common.api.internal.a0) ((k1.j) this.h).h).h;
                gVar.disconnect(gVar.getClass().getName().concat(" disconnecting because it was signed out."));
                return;
            case 7:
                ((com.google.android.gms.common.api.internal.j0) this.h).f1002m.b(new t2.b(4, null, null));
                return;
            case 8:
                throw null;
            case 9:
                try {
                    ((Runnable) this.h).run();
                    return;
                } catch (Exception e4) {
                    b3.g.p("Executor", "Background execution failure.", e4);
                    return;
                }
            case 10:
                g.n0 n0Var = (g.n0) this.h;
                Window.Callback callback = n0Var.f1594b;
                Menu p5 = n0Var.p();
                j.n nVar = p5 instanceof j.n ? (j.n) p5 : null;
                if (nVar != null) {
                    nVar.w();
                }
                try {
                    p5.clear();
                    if (callback.onCreatePanelMenu(0, p5)) {
                        if (!callback.onPreparePanel(0, null, p5)) {
                        }
                        if (nVar == null) {
                            nVar.v();
                            return;
                        }
                        return;
                    }
                    p5.clear();
                    if (nVar == null) {
                    }
                } catch (Throwable th) {
                    if (nVar != null) {
                        nVar.v();
                    }
                    throw th;
                }
            case 11:
                synchronized (((h3.k) this.h).f1722c) {
                    ((h3.n) ((h3.k) this.h).f1723d.f1718c).f();
                }
                return;
            case 12:
                i0.d dVar = (i0.d) this.h;
                t1 t1Var = dVar.f1801i;
                i0.a aVar = dVar.f1800g;
                if (dVar.f1813u) {
                    if (dVar.f1811s) {
                        dVar.f1811s = false;
                        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                        aVar.f1795e = currentAnimationTimeMillis;
                        aVar.f1797g = -1L;
                        aVar.f1796f = currentAnimationTimeMillis;
                        aVar.h = 0.5f;
                    }
                    if ((aVar.f1797g > 0 && AnimationUtils.currentAnimationTimeMillis() > aVar.f1797g + aVar.f1798i) || !dVar.e()) {
                        dVar.f1813u = false;
                        return;
                    }
                    if (dVar.f1812t) {
                        dVar.f1812t = false;
                        long uptimeMillis = SystemClock.uptimeMillis();
                        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                        t1Var.onTouchEvent(obtain);
                        obtain.recycle();
                    }
                    if (aVar.f1796f == 0) {
                        throw new RuntimeException("Cannot compute scroll delta before calling start()");
                    }
                    long currentAnimationTimeMillis2 = AnimationUtils.currentAnimationTimeMillis();
                    float a5 = aVar.a(currentAnimationTimeMillis2);
                    long j2 = currentAnimationTimeMillis2 - aVar.f1796f;
                    aVar.f1796f = currentAnimationTimeMillis2;
                    dVar.w.scrollListBy((int) (j2 * ((a5 * 4.0f) + ((-4.0f) * a5 * a5)) * aVar.f1794d));
                    WeakHashMap weakHashMap = f0.r0.f1407a;
                    t1Var.postOnAnimation(this);
                    return;
                }
                return;
            case 13:
                t1 t1Var2 = (t1) this.h;
                t1Var2.f2237r = null;
                t1Var2.drawableStateChanged();
                return;
            case 14:
                SearchView$SearchAutoComplete searchView$SearchAutoComplete = (SearchView$SearchAutoComplete) this.h;
                if (searchView$SearchAutoComplete.f158l) {
                    ((InputMethodManager) searchView$SearchAutoComplete.getContext().getSystemService("input_method")).showSoftInput(searchView$SearchAutoComplete, 0);
                    searchView$SearchAutoComplete.f158l = false;
                    return;
                }
                return;
            case 15:
                ((Toolbar) this.h).u();
                return;
            case 16:
                NativeToJsMessageQueue$OnlineEventsBridgeMode nativeToJsMessageQueue$OnlineEventsBridgeMode = (NativeToJsMessageQueue$OnlineEventsBridgeMode) this.h;
                nativeToJsMessageQueue$OnlineEventsBridgeMode.f2885b = false;
                nativeToJsMessageQueue$OnlineEventsBridgeMode.f2886c = true;
                SystemWebView systemWebView = ((SystemWebViewEngine) ((k1.j) nativeToJsMessageQueue$OnlineEventsBridgeMode.f2884a).h).f2902a;
                if (systemWebView != null) {
                    systemWebView.setNetworkAvailable(true);
                    return;
                }
                return;
            case 17:
                ConstraintTrackingWorker constraintTrackingWorker = (ConstraintTrackingWorker) this.h;
                String b2 = constraintTrackingWorker.getInputData().b("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME");
                if (TextUtils.isEmpty(b2)) {
                    androidx.work.n.e().d(ConstraintTrackingWorker.f663l, "No worker to delegate to.", new Throwable[0]);
                    constraintTrackingWorker.f666j.h(new androidx.work.j());
                    return;
                }
                ListenableWorker a6 = constraintTrackingWorker.getWorkerFactory().a(constraintTrackingWorker.getApplicationContext(), b2, constraintTrackingWorker.f664g);
                constraintTrackingWorker.f667k = a6;
                if (a6 == null) {
                    androidx.work.n.e().b(ConstraintTrackingWorker.f663l, "No worker to delegate to.", new Throwable[0]);
                    constraintTrackingWorker.f666j.h(new androidx.work.j());
                    return;
                }
                t1.i h = l1.k.Q(constraintTrackingWorker.getApplicationContext()).f2489e.n().h(constraintTrackingWorker.getId().toString());
                if (h == null) {
                    constraintTrackingWorker.f666j.h(new androidx.work.j());
                    return;
                }
                p1.c cVar = new p1.c(constraintTrackingWorker.getApplicationContext(), constraintTrackingWorker.getTaskExecutor(), constraintTrackingWorker);
                cVar.b(Collections.singletonList(h));
                if (!cVar.a(constraintTrackingWorker.getId().toString())) {
                    androidx.work.n.e().b(ConstraintTrackingWorker.f663l, s.c.b("Constraints not met for delegate ", b2, ". Requesting retry."), new Throwable[0]);
                    constraintTrackingWorker.f666j.h(new androidx.work.k());
                    return;
                }
                androidx.work.n.e().b(ConstraintTrackingWorker.f663l, s.c.a("Constraints met for delegate ", b2), new Throwable[0]);
                try {
                    j3.a startWork = constraintTrackingWorker.f667k.startWork();
                    startWork.addListener(new c0.a(constraintTrackingWorker, startWork, 22, r42), constraintTrackingWorker.getBackgroundExecutor());
                    return;
                } catch (Throwable th2) {
                    androidx.work.n e5 = androidx.work.n.e();
                    String str = ConstraintTrackingWorker.f663l;
                    e5.b(str, s.c.b("Delegated worker ", b2, " threw exception in startWork."), th2);
                    synchronized (constraintTrackingWorker.h) {
                        try {
                            if (constraintTrackingWorker.f665i) {
                                androidx.work.n.e().b(str, "Constraints were unmet, Retrying.", new Throwable[0]);
                                constraintTrackingWorker.f666j.h(new androidx.work.k());
                            } else {
                                constraintTrackingWorker.f666j.h(new androidx.work.j());
                            }
                            return;
                        } finally {
                        }
                    }
                }
            case 18:
                y1.p pVar = (y1.p) this.h;
                y1.b bVar = pVar.f3863b;
                bVar.m(0);
                y1.e eVar = y1.b0.f3819j;
                bVar.t(24, 6, eVar);
                pVar.a(eVar);
                return;
            default:
                ReentrantReadWriteLock.ReadLock readLock = ((z0.e) this.h).f3904c.h.readLock();
                try {
                    try {
                        readLock.lock();
                    } finally {
                        readLock.unlock();
                    }
                } catch (SQLiteException | IllegalStateException e6) {
                    e = e6;
                    r42 = 0;
                }
                if (((z0.e) this.h).a() && ((z0.e) this.h).f3905d.compareAndSet(true, false) && !((SQLiteDatabase) ((z0.e) this.h).f3904c.f3924c.c().h).inTransaction()) {
                    WorkDatabase_Impl workDatabase_Impl = ((z0.e) this.h).f3904c;
                    if (workDatabase_Impl.f3927f) {
                        try {
                            e1.b c5 = workDatabase_Impl.f3924c.c();
                            c5.a();
                            try {
                                HashSet a7 = a();
                                try {
                                    c5.k();
                                    c5.g();
                                    r42 = a7;
                                } catch (Throwable th3) {
                                    th = th3;
                                    c5.g();
                                    throw th;
                                }
                            } catch (Throwable th4) {
                                th = th4;
                            }
                        } catch (SQLiteException e7) {
                            e = e7;
                            Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e);
                            readLock.unlock();
                            if (r42 == 0) {
                                return;
                            } else {
                                return;
                            }
                        } catch (IllegalStateException e8) {
                            e = e8;
                            Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e);
                            readLock.unlock();
                            if (r42 == 0) {
                            }
                        }
                    } else {
                        r42 = a();
                    }
                    readLock.unlock();
                    if (r42 == 0 || r42.isEmpty()) {
                        return;
                    }
                    synchronized (((z0.e) this.h).h) {
                        try {
                            m.b bVar2 = (m.b) ((z0.e) this.h).h.iterator();
                            if (bVar2.hasNext()) {
                                ((z0.d) ((Map.Entry) bVar2.next()).getValue()).getClass();
                                throw null;
                            }
                        } finally {
                        }
                    }
                    return;
                }
                return;
        }
    }

    public /* synthetic */ o(Object obj, int i5) {
        this.f413g = i5;
        this.h = obj;
    }

    public o(u1.f fVar, int i5) {
        this.f413g = 4;
        this.h = fVar;
    }
}
