package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.base.zau;

/* loaded from: classes.dex */
public final class l0 extends zau {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ m0 f1007a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(m0 m0Var, Looper looper) {
        super(looper);
        this.f1007a = m0Var;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i5 = message.what;
        if (i5 != 0) {
            if (i5 == 1) {
                RuntimeException runtimeException = (RuntimeException) message.obj;
                Log.e("TransformedResultImpl", "Runtime exception on the transformation worker thread: ".concat(String.valueOf(runtimeException.getMessage())));
                throw runtimeException;
            }
            Log.e("TransformedResultImpl", "TransformationResultHandler received unknown message type: " + i5);
            return;
        }
        com.google.android.gms.common.api.r rVar = (com.google.android.gms.common.api.r) message.obj;
        synchronized (this.f1007a.f1009b) {
            try {
                m0 m0Var = this.f1007a.f1008a;
                com.google.android.gms.common.internal.b0.g(m0Var);
                if (rVar == null) {
                    m0Var.a(new Status(13, "Transform returned null", null, null));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
