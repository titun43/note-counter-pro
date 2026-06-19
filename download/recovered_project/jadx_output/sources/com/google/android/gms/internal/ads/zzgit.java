package com.google.android.gms.internal.ads;

import android.content.Context;
import h3.n;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class zzgit extends zzfvh {
    private final zzgdh zzb;

    public zzgit(Context context, Executor executor, zzgdh zzgdhVar) {
        super(context, executor, new n(), false);
        this.zzb = zzgdhVar;
    }

    private static h3.g zzh() {
        n nVar = new n();
        nVar.e(Boolean.TRUE);
        return nVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfvh
    public final h3.g zzb(int i5, long j2) {
        this.zzb.zzb(i5, j2, null, null);
        return zzh();
    }

    @Override // com.google.android.gms.internal.ads.zzfvh
    public final h3.g zzc(int i5, long j2, Exception exc) {
        this.zzb.zzb(i5, j2, exc, null);
        return zzh();
    }

    @Override // com.google.android.gms.internal.ads.zzfvh
    public final h3.g zze(int i5, String str) {
        this.zzb.zzb(i5, -1L, null, str);
        return zzh();
    }
}
