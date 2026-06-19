package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: classes.dex */
final class zzbfk implements com.google.android.gms.common.internal.c {
    final /* synthetic */ zzbfl zza;

    public zzbfk(zzbfl zzbflVar) {
        Objects.requireNonNull(zzbflVar);
        this.zza = zzbflVar;
    }

    @Override // com.google.android.gms.common.internal.c
    public final void onConnectionFailed(t2.b bVar) {
        zzbfl zzbflVar = this.zza;
        synchronized (zzbflVar.zzh()) {
            try {
                zzbflVar.zzk(null);
                if (zzbflVar.zzi() != null) {
                    zzbflVar.zzj(null);
                }
                zzbflVar.zzh().notifyAll();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
