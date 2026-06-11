package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes.dex */
final class zzidz implements Iterator {
    final /* synthetic */ zzieb zza;
    private int zzb;
    private boolean zzc;
    private Iterator zzd;

    public /* synthetic */ zzidz(zzieb zziebVar, byte[] bArr) {
        Objects.requireNonNull(zziebVar);
        this.zza = zziebVar;
        this.zzb = -1;
    }

    private final Iterator zza() {
        if (this.zzd == null) {
            this.zzd = this.zza.zzk().entrySet().iterator();
        }
        return this.zzd;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i5 = this.zzb + 1;
        zzieb zziebVar = this.zza;
        if (i5 >= zziebVar.zzj()) {
            return !zziebVar.zzk().isEmpty() && zza().hasNext();
        }
        return true;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        this.zzc = true;
        int i5 = this.zzb + 1;
        this.zzb = i5;
        zzieb zziebVar = this.zza;
        return i5 < zziebVar.zzj() ? (zzidy) zziebVar.zzi()[i5] : (Map.Entry) zza().next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.zzc) {
            throw new IllegalStateException("remove() was called before next()");
        }
        this.zzc = false;
        zzieb zziebVar = this.zza;
        zziebVar.zzh();
        int i5 = this.zzb;
        if (i5 >= zziebVar.zzj()) {
            zza().remove();
        } else {
            this.zzb = i5 - 1;
            zziebVar.zzg(i5);
        }
    }
}
