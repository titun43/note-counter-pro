package com.google.android.gms.internal.ads;

import androidx.fragment.app.h1;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.RunnableFuture;

/* loaded from: classes.dex */
final class zzhan extends zzgzf implements RunnableFuture {
    private volatile zzgzv zza;

    public zzhan(zzgyv zzgyvVar) {
        this.zza = new zzhal(this, zzgyvVar);
    }

    public static zzhan zze(Runnable runnable, Object obj) {
        return new zzhan(Executors.callable(runnable, obj));
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public final void run() {
        zzgzv zzgzvVar = this.zza;
        if (zzgzvVar != null) {
            zzgzvVar.run();
        }
        this.zza = null;
    }

    @Override // com.google.android.gms.internal.ads.zzgyh
    public final void zzc() {
        zzgzv zzgzvVar;
        if (zzj() && (zzgzvVar = this.zza) != null) {
            zzgzvVar.zzh();
        }
        this.zza = null;
    }

    @Override // com.google.android.gms.internal.ads.zzgyh
    public final String zzd() {
        zzgzv zzgzvVar = this.zza;
        if (zzgzvVar == null) {
            return super.zzd();
        }
        String zzgzvVar2 = zzgzvVar.toString();
        return h1.b(new StringBuilder(zzgzvVar2.length() + 7), "task=[", zzgzvVar2, "]");
    }

    public zzhan(Callable callable) {
        this.zza = new zzham(this, callable);
    }
}
