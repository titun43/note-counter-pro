package com.google.android.gms.common.api.internal;

import android.os.Message;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.ads.zzchr;
import com.google.android.gms.internal.base.zau;

/* loaded from: classes.dex */
public final class e extends zau {
    public final void a(com.google.android.gms.common.api.u uVar, com.google.android.gms.common.api.t tVar) {
        int i5 = BasePendingResult.zad;
        com.google.android.gms.common.internal.b0.g(uVar);
        sendMessage(obtainMessage(1, new Pair(uVar, tVar)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i5 = message.what;
        boolean z4 = true;
        if (i5 != 1) {
            if (i5 != 2) {
                Log.wtf("BasePendingResult", androidx.emoji2.text.u.h(i5, "Don't know how to handle message: "), new Exception());
                return;
            } else {
                ((BasePendingResult) message.obj).forceFailureUnlessReady(Status.f927n);
                return;
            }
        }
        Pair pair = (Pair) message.obj;
        com.google.android.gms.common.api.u uVar = (com.google.android.gms.common.api.u) pair.first;
        com.google.android.gms.common.api.t tVar = (com.google.android.gms.common.api.t) pair.second;
        try {
            m0 m0Var = (m0) uVar;
            synchronized (m0Var.f1009b) {
                if (tVar.getStatus().f929g > 0) {
                    z4 = false;
                }
                if (z4) {
                } else {
                    m0Var.a(tVar.getStatus());
                    if (tVar instanceof zzchr) {
                        try {
                            ((zzchr) tVar).release();
                        } catch (RuntimeException e4) {
                            Log.w("TransformedResultImpl", "Unable to release ".concat(String.valueOf(tVar)), e4);
                        }
                    }
                }
            }
        } catch (RuntimeException e5) {
            BasePendingResult.zal(tVar);
            throw e5;
        }
    }
}
