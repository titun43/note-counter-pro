package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.t;
import com.google.android.gms.internal.ads.zzchr;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public abstract class BasePendingResult<R extends com.google.android.gms.common.api.t> extends com.google.android.gms.common.api.r {
    static final ThreadLocal zaa = new b3.i(1);
    public static final /* synthetic */ int zad = 0;
    private s0 resultGuardian;
    protected final e zab;
    protected final WeakReference zac;
    private com.google.android.gms.common.api.u zah;
    private com.google.android.gms.common.api.t zaj;
    private Status zak;
    private volatile boolean zal;
    private boolean zam;
    private boolean zan;
    private com.google.android.gms.common.internal.o zao;
    private volatile m0 zap;
    private final Object zae = new Object();
    private final CountDownLatch zaf = new CountDownLatch(1);
    private final ArrayList zag = new ArrayList();
    private final AtomicReference zai = new AtomicReference();
    private boolean zaq = false;

    public BasePendingResult(com.google.android.gms.common.api.p pVar) {
        this.zab = new e(pVar != null ? ((d0) pVar).f964a.getLooper() : Looper.getMainLooper());
        this.zac = new WeakReference(pVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void zal(com.google.android.gms.common.api.t tVar) {
        if (tVar instanceof zzchr) {
            try {
                ((zzchr) tVar).release();
            } catch (RuntimeException e4) {
                Log.w("BasePendingResult", "Unable to release ".concat(String.valueOf(tVar)), e4);
            }
        }
    }

    public final com.google.android.gms.common.api.t a() {
        com.google.android.gms.common.api.t tVar;
        synchronized (this.zae) {
            com.google.android.gms.common.internal.b0.i("Result has already been consumed.", !this.zal);
            com.google.android.gms.common.internal.b0.i("Result is not ready.", isReady());
            tVar = this.zaj;
            this.zaj = null;
            this.zah = null;
            this.zal = true;
        }
        if (this.zai.getAndSet(null) != null) {
            throw new ClassCastException();
        }
        com.google.android.gms.common.internal.b0.g(tVar);
        return tVar;
    }

    public final void addStatusListener(com.google.android.gms.common.api.q qVar) {
        com.google.android.gms.common.internal.b0.a("Callback cannot be null.", qVar != null);
        synchronized (this.zae) {
            if (isReady()) {
                w wVar = (w) qVar;
                ((Map) wVar.f1028b.h).remove(wVar.f1027a);
            } else {
                this.zag.add(qVar);
            }
        }
    }

    @ResultIgnorabilityUnspecified
    public final R await() {
        com.google.android.gms.common.internal.b0.f("await must not be called on the UI thread");
        com.google.android.gms.common.internal.b0.i("Result has already been consumed", !this.zal);
        com.google.android.gms.common.internal.b0.i("Cannot await if then() has been called.", this.zap == null);
        try {
            this.zaf.await();
        } catch (InterruptedException unused) {
            forceFailureUnlessReady(Status.f925l);
        }
        com.google.android.gms.common.internal.b0.i("Result is not ready.", isReady());
        return (R) a();
    }

    public final void b(com.google.android.gms.common.api.t tVar) {
        this.zaj = tVar;
        this.zak = tVar.getStatus();
        this.zaf.countDown();
        if (this.zam) {
            this.zah = null;
        } else {
            com.google.android.gms.common.api.u uVar = this.zah;
            if (uVar != null) {
                this.zab.removeMessages(2);
                this.zab.a(uVar, a());
            } else if (this.zaj instanceof zzchr) {
                this.resultGuardian = new s0(this);
            }
        }
        ArrayList arrayList = this.zag;
        int size = arrayList.size();
        for (int i5 = 0; i5 < size; i5++) {
            w wVar = (w) ((com.google.android.gms.common.api.q) arrayList.get(i5));
            ((Map) wVar.f1028b.h).remove(wVar.f1027a);
        }
        this.zag.clear();
    }

    public void cancel() {
        synchronized (this.zae) {
            try {
                if (!this.zam && !this.zal) {
                    zal(this.zaj);
                    this.zam = true;
                    b(createFailedResult(Status.f928o));
                }
            } finally {
            }
        }
    }

    public abstract com.google.android.gms.common.api.t createFailedResult(Status status);

    /* JADX WARN: Multi-variable type inference failed */
    @Deprecated
    public final void forceFailureUnlessReady(Status status) {
        synchronized (this.zae) {
            try {
                if (!isReady()) {
                    setResult(createFailedResult(status));
                    this.zan = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean isCanceled() {
        boolean z4;
        synchronized (this.zae) {
            z4 = this.zam;
        }
        return z4;
    }

    public final boolean isReady() {
        return this.zaf.getCount() == 0;
    }

    public final void setCancelToken(com.google.android.gms.common.internal.o oVar) {
        synchronized (this.zae) {
        }
    }

    public final void setResult(R r2) {
        synchronized (this.zae) {
            try {
                if (this.zan || this.zam) {
                    zal(r2);
                    return;
                }
                isReady();
                com.google.android.gms.common.internal.b0.i("Results have already been set", !isReady());
                com.google.android.gms.common.internal.b0.i("Result has already been consumed", !this.zal);
                b(r2);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void setResultCallback(com.google.android.gms.common.api.u uVar) {
        synchronized (this.zae) {
            try {
                if (uVar == null) {
                    this.zah = null;
                    return;
                }
                boolean z4 = true;
                com.google.android.gms.common.internal.b0.i("Result has already been consumed.", !this.zal);
                if (this.zap != null) {
                    z4 = false;
                }
                com.google.android.gms.common.internal.b0.i("Cannot set callbacks if then() has been called.", z4);
                if (isCanceled()) {
                    return;
                }
                if (isReady()) {
                    this.zab.a(uVar, a());
                } else {
                    this.zah = uVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final <S extends com.google.android.gms.common.api.t> com.google.android.gms.common.api.w then(com.google.android.gms.common.api.v vVar) {
        m0 m0Var;
        com.google.android.gms.common.internal.b0.i("Result has already been consumed.", !this.zal);
        synchronized (this.zae) {
            try {
                com.google.android.gms.common.internal.b0.i("Cannot call then() twice.", this.zap == null);
                com.google.android.gms.common.internal.b0.i("Cannot call then() if callbacks are set.", this.zah == null);
                com.google.android.gms.common.internal.b0.i("Cannot call then() if result was canceled.", !this.zam);
                this.zaq = true;
                this.zap = new m0(this.zac);
                m0 m0Var2 = this.zap;
                synchronized (m0Var2.f1009b) {
                    m0Var = new m0(m0Var2.f1010c);
                    m0Var2.f1008a = m0Var;
                }
                if (isReady()) {
                    this.zab.a(this.zap, a());
                } else {
                    this.zah = this.zap;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return m0Var;
    }

    public final void zak() {
        boolean z4 = true;
        if (!this.zaq && !((Boolean) zaa.get()).booleanValue()) {
            z4 = false;
        }
        this.zaq = z4;
    }

    public final boolean zam() {
        boolean isCanceled;
        synchronized (this.zae) {
            try {
                if (((com.google.android.gms.common.api.p) this.zac.get()) != null) {
                    if (!this.zaq) {
                    }
                    isCanceled = isCanceled();
                }
                cancel();
                isCanceled = isCanceled();
            } catch (Throwable th) {
                throw th;
            }
        }
        return isCanceled;
    }

    public final void zan(n0 n0Var) {
        this.zai.set(n0Var);
    }

    @ResultIgnorabilityUnspecified
    public final R await(long j2, TimeUnit timeUnit) {
        if (j2 > 0) {
            com.google.android.gms.common.internal.b0.f("await must not be called on the UI thread when time is greater than zero.");
        }
        com.google.android.gms.common.internal.b0.i("Result has already been consumed.", !this.zal);
        com.google.android.gms.common.internal.b0.i("Cannot await if then() has been called.", this.zap == null);
        try {
            if (!this.zaf.await(j2, timeUnit)) {
                forceFailureUnlessReady(Status.f927n);
            }
        } catch (InterruptedException unused) {
            forceFailureUnlessReady(Status.f925l);
        }
        com.google.android.gms.common.internal.b0.i("Result is not ready.", isReady());
        return (R) a();
    }

    public final void setResultCallback(com.google.android.gms.common.api.u uVar, long j2, TimeUnit timeUnit) {
        synchronized (this.zae) {
            try {
                if (uVar == null) {
                    this.zah = null;
                    return;
                }
                boolean z4 = true;
                com.google.android.gms.common.internal.b0.i("Result has already been consumed.", !this.zal);
                if (this.zap != null) {
                    z4 = false;
                }
                com.google.android.gms.common.internal.b0.i("Cannot set callbacks if then() has been called.", z4);
                if (isCanceled()) {
                    return;
                }
                if (isReady()) {
                    this.zab.a(uVar, a());
                } else {
                    this.zah = uVar;
                    e eVar = this.zab;
                    eVar.sendMessageDelayed(eVar.obtainMessage(2, this), timeUnit.toMillis(j2));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
