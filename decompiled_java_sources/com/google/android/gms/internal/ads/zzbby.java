package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public abstract class zzbby implements Callable {
    protected final zzbak zza;
    protected final String zzb;
    protected final String zzc;
    protected final zzawg zzd;
    protected Method zze;
    protected final int zzf;
    protected final int zzg;

    public zzbby(zzbak zzbakVar, String str, String str2, zzawg zzawgVar, int i5, int i6) {
        this.zza = zzbakVar;
        this.zzb = str;
        this.zzc = str2;
        this.zzd = zzawgVar;
        this.zzf = i5;
        this.zzg = i6;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        int i5;
        try {
            long nanoTime = System.nanoTime();
            zzbak zzbakVar = this.zza;
            Method zzo = zzbakVar.zzo(this.zzb, this.zzc);
            this.zze = zzo;
            if (zzo == null) {
                return null;
            }
            zza();
            zzazb zzh = zzbakVar.zzh();
            if (zzh == null || (i5 = this.zzf) == Integer.MIN_VALUE) {
                return null;
            }
            zzh.zza(this.zzg, i5, (System.nanoTime() - nanoTime) / 1000, null, null);
            return null;
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    public abstract void zza();
}
