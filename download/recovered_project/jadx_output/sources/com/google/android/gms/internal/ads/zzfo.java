package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Looper;
import java.util.Objects;

/* loaded from: classes.dex */
public final class zzfo {
    private final zzfn zza;
    private final zzdx zzb;
    private final zzdx zzc;
    private boolean zzd;
    private boolean zze;

    public zzfo(Context context, Looper looper, zzdn zzdnVar) {
        this.zza = new zzfn(context.getApplicationContext());
        this.zzb = zzdnVar.zzd(looper, null);
        this.zzc = zzdnVar.zzd(Looper.getMainLooper(), null);
    }

    private final void zzf(final boolean z4, final boolean z5) {
        if (zzg(z4, z5)) {
            this.zzb.zzn(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfl
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzfo.this.zzd(z4, z5);
                }
            });
            return;
        }
        final zzfn zzfnVar = this.zza;
        Objects.requireNonNull(zzfnVar);
        final Runnable runnable = new Runnable() { // from class: com.google.android.gms.internal.ads.zzfk
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzfn.this.zza();
            }
        };
        this.zzc.zzo(runnable, 1000L);
        this.zzb.zzn(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfm
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzfo.this.zzc(runnable, z4, z5);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean zzg(boolean z4, boolean z5) {
        return z4 && z5;
    }

    public final void zza(boolean z4) {
        if (this.zzd == z4) {
            return;
        }
        this.zzd = z4;
        zzf(z4, this.zze);
    }

    public final void zzb(boolean z4) {
        if (this.zze == z4) {
            return;
        }
        this.zze = z4;
        if (this.zzd) {
            zzf(true, z4);
        }
    }

    public final /* synthetic */ void zzc(Runnable runnable, boolean z4, boolean z5) {
        this.zzc.zzl(runnable);
        this.zza.zzb(z4, z5);
    }

    public final /* synthetic */ void zzd(boolean z4, boolean z5) {
        this.zza.zzb(z4, z5);
    }
}
