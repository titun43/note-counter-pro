package com.google.android.gms.common.internal;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.internal.common.zzg;

/* loaded from: classes.dex */
public final class e0 extends zzg {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f f1044a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(f fVar, Looper looper) {
        super(looper);
        this.f1044a = fVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        Boolean bool;
        z zVar;
        f fVar = this.f1044a;
        if (fVar.zzd.get() != message.arg1) {
            int i5 = message.what;
            if ((i5 == 2 || i5 == 1 || i5 == 7) && (zVar = (z) message.obj) != null) {
                synchronized (zVar) {
                    zVar.f1134a = null;
                }
                f fVar2 = zVar.f1136c;
                synchronized (fVar2.zzj()) {
                    fVar2.zzj().remove(zVar);
                }
                return;
            }
            return;
        }
        int i6 = message.what;
        if ((i6 == 1 || i6 == 7 || ((i6 == 4 && !fVar.enableLocalFallback()) || message.what == 5)) && !fVar.isConnecting()) {
            z zVar2 = (z) message.obj;
            if (zVar2 != null) {
                synchronized (zVar2) {
                    zVar2.f1134a = null;
                }
                f fVar3 = zVar2.f1136c;
                synchronized (fVar3.zzj()) {
                    fVar3.zzj().remove(zVar2);
                }
                return;
            }
            return;
        }
        int i7 = message.what;
        if (i7 == 4) {
            fVar.zzn(new t2.b(message.arg2, null, null));
            if (fVar.zzg() && !fVar.zzo()) {
                fVar.zzd(3, null);
                return;
            }
            t2.b zzm = fVar.zzm() != null ? fVar.zzm() : new t2.b(8, null, null);
            fVar.zzc.a(zzm);
            fVar.onConnectionFailed(zzm);
            return;
        }
        if (i7 == 5) {
            t2.b zzm2 = fVar.zzm() != null ? fVar.zzm() : new t2.b(8, null, null);
            fVar.zzc.a(zzm2);
            fVar.onConnectionFailed(zzm2);
            return;
        }
        if (i7 == 3) {
            Object obj = message.obj;
            t2.b bVar = new t2.b(message.arg2, obj instanceof PendingIntent ? (PendingIntent) obj : null, null);
            fVar.zzc.a(bVar);
            fVar.onConnectionFailed(bVar);
            return;
        }
        if (i7 == 6) {
            fVar.zzd(5, null);
            if (fVar.zzk() != null) {
                fVar.zzk().onConnectionSuspended(message.arg2);
            }
            fVar.onConnectionSuspended(message.arg2);
            fVar.zze(5, 1, null);
            return;
        }
        if (i7 == 2 && !fVar.isConnected()) {
            z zVar3 = (z) message.obj;
            if (zVar3 != null) {
                synchronized (zVar3) {
                    zVar3.f1134a = null;
                }
                f fVar4 = zVar3.f1136c;
                synchronized (fVar4.zzj()) {
                    fVar4.zzj().remove(zVar3);
                }
                return;
            }
            return;
        }
        int i8 = message.what;
        if (i8 != 2 && i8 != 1 && i8 != 7) {
            Log.wtf("GmsClient", androidx.emoji2.text.u.l(new StringBuilder(String.valueOf(i8).length() + 34), "Don't know how to handle message: ", i8), new Exception());
            return;
        }
        z zVar4 = (z) message.obj;
        synchronized (zVar4) {
            try {
                bool = zVar4.f1134a;
                if (zVar4.f1135b) {
                    String obj2 = zVar4.toString();
                    StringBuilder sb = new StringBuilder(obj2.length() + 47);
                    sb.append("Callback proxy ");
                    sb.append(obj2);
                    sb.append(" being reused. This is not safe.");
                    Log.w("GmsClient", sb.toString());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (bool != null) {
            f fVar5 = zVar4.f1139f;
            int i9 = zVar4.f1137d;
            if (i9 != 0) {
                fVar5.zzd(1, null);
                Bundle bundle = zVar4.f1138e;
                zVar4.b(new t2.b(i9, bundle != null ? (PendingIntent) bundle.getParcelable(f.KEY_PENDING_INTENT) : null, null));
            } else if (!zVar4.a()) {
                fVar5.zzd(1, null);
                zVar4.b(new t2.b(8, null, null));
            }
        }
        synchronized (zVar4) {
            zVar4.f1135b = true;
        }
        synchronized (zVar4) {
            zVar4.f1134a = null;
        }
        f fVar6 = zVar4.f1136c;
        synchronized (fVar6.zzj()) {
            fVar6.zzj().remove(zVar4);
        }
    }
}
