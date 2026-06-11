package com.google.android.gms.common.api.internal;

import android.os.Looper;
import com.google.android.gms.common.api.Status;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class m0 extends com.google.android.gms.common.api.w implements com.google.android.gms.common.api.u {

    /* renamed from: a, reason: collision with root package name */
    public m0 f1008a = null;

    /* renamed from: b, reason: collision with root package name */
    public final Object f1009b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public final WeakReference f1010c;

    public m0(WeakReference weakReference) {
        com.google.android.gms.common.internal.b0.h(weakReference, "GoogleApiClient reference must not be null");
        this.f1010c = weakReference;
        com.google.android.gms.common.api.p pVar = (com.google.android.gms.common.api.p) weakReference.get();
        new l0(this, pVar != null ? ((d0) pVar).f964a.getLooper() : Looper.getMainLooper());
    }

    public final void a(Status status) {
        synchronized (this.f1009b) {
            synchronized (this.f1009b) {
            }
        }
    }
}
