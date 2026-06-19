package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes.dex */
final class zzccl {
    private Context zza;
    private x2.b zzb;
    private com.google.android.gms.ads.internal.util.zzg zzc;
    private zzccq zzd;

    private zzccl() {
        throw null;
    }

    public final zzccl zza(Context context) {
        context.getClass();
        this.zza = context;
        return this;
    }

    public final zzccl zzb(x2.b bVar) {
        bVar.getClass();
        this.zzb = bVar;
        return this;
    }

    public final zzccl zzc(com.google.android.gms.ads.internal.util.zzg zzgVar) {
        this.zzc = zzgVar;
        return this;
    }

    public final zzccl zzd(zzccq zzccqVar) {
        this.zzd = zzccqVar;
        return this;
    }

    public final zzccr zze() {
        zziko.zzc(this.zza, Context.class);
        zziko.zzc(this.zzb, x2.b.class);
        zziko.zzc(this.zzc, com.google.android.gms.ads.internal.util.zzg.class);
        zziko.zzc(this.zzd, zzccq.class);
        return new zzccm(this.zza, this.zzb, this.zzc, this.zzd);
    }

    public /* synthetic */ zzccl(byte[] bArr) {
    }
}
