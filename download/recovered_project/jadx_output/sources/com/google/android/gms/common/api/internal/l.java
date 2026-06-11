package com.google.android.gms.common.api.internal;

import android.os.Looper;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final f2.q f1004a;

    /* renamed from: b, reason: collision with root package name */
    public volatile Object f1005b;

    /* renamed from: c, reason: collision with root package name */
    public volatile j f1006c;

    public l(Looper looper, Object obj, String str) {
        this.f1004a = new f2.q(looper);
        com.google.android.gms.common.internal.b0.h(obj, "Listener must not be null");
        this.f1005b = obj;
        com.google.android.gms.common.internal.b0.e(str);
        this.f1006c = new j(obj, str);
    }

    public final void a(k kVar) {
        this.f1004a.execute(new c0.a(3, this, kVar));
    }
}
