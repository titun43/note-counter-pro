package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Build;

/* loaded from: classes.dex */
public final class c0 implements com.google.android.gms.common.internal.d {

    /* renamed from: a, reason: collision with root package name */
    public boolean f958a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f959b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f960c;

    /* renamed from: d, reason: collision with root package name */
    public Object f961d;

    /* renamed from: e, reason: collision with root package name */
    public Object f962e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f963f;

    public c0(g gVar, com.google.android.gms.common.api.g gVar2, a aVar) {
        this.f963f = gVar;
        this.f961d = null;
        this.f962e = null;
        this.f958a = false;
        this.f959b = gVar2;
        this.f960c = aVar;
    }

    @Override // com.google.android.gms.common.internal.d
    public void a(t2.b bVar) {
        ((g) this.f963f).f981s.post(new c0.a(this, bVar, 2, false));
    }

    public void b(t2.b bVar) {
        a0 a0Var = (a0) ((g) this.f963f).f978p.get((a) this.f960c);
        if (a0Var != null) {
            a0Var.o(bVar);
        }
    }

    public void c(boolean z4) {
        IntentFilter intentFilter = new IntentFilter("com.android.vending.billing.PURCHASES_UPDATED");
        IntentFilter intentFilter2 = new IntentFilter("com.android.vending.billing.LOCAL_BROADCAST_PURCHASES_UPDATED");
        intentFilter2.addAction("com.android.vending.billing.ALTERNATIVE_BILLING");
        this.f958a = z4;
        ((y1.c0) this.f963f).a((Context) this.f959b, intentFilter2);
        if (!this.f958a) {
            ((y1.c0) this.f962e).a((Context) this.f959b, intentFilter);
            return;
        }
        y1.c0 c0Var = (y1.c0) this.f962e;
        Context context = (Context) this.f959b;
        synchronized (c0Var) {
            try {
                if (c0Var.f3827a) {
                    return;
                }
                if (Build.VERSION.SDK_INT >= 33) {
                    context.registerReceiver(c0Var, intentFilter, "com.google.android.finsky.permission.PLAY_BILLING_LIBRARY_BROADCAST", null, true != c0Var.f3828b ? 4 : 2);
                } else {
                    context.registerReceiver(c0Var, intentFilter, "com.google.android.finsky.permission.PLAY_BILLING_LIBRARY_BROADCAST", null);
                }
                c0Var.f3827a = true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public c0(Context context, y1.i iVar, androidx.emoji2.text.p pVar) {
        this.f959b = context;
        this.f960c = iVar;
        this.f961d = pVar;
        this.f962e = new y1.c0(this, true);
        this.f963f = new y1.c0(this, false);
    }
}
