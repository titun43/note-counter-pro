package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class zzaat implements zzaan {
    private int zza;
    private int zzb;
    private int zzc = 0;
    private zzaal[] zzd = new zzaal[100];

    public zzaat(boolean z4, int i5) {
    }

    @Override // com.google.android.gms.internal.ads.zzaan
    public final synchronized zzaal zza() {
        zzaal zzaalVar;
        try {
            this.zzb++;
            int i5 = this.zzc;
            if (i5 > 0) {
                zzaal[] zzaalVarArr = this.zzd;
                int i6 = i5 - 1;
                this.zzc = i6;
                zzaalVar = zzaalVarArr[i6];
                if (zzaalVar == null) {
                    throw null;
                }
                zzaalVarArr[i6] = null;
            } else {
                zzaalVar = new zzaal(new byte[65536], 0);
                int i7 = this.zzb;
                zzaal[] zzaalVarArr2 = this.zzd;
                int length = zzaalVarArr2.length;
                if (i7 > length) {
                    this.zzd = (zzaal[]) Arrays.copyOf(zzaalVarArr2, length + length);
                    return zzaalVar;
                }
            }
            return zzaalVar;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaan
    public final synchronized void zzb(zzaal zzaalVar) {
        zzaal[] zzaalVarArr = this.zzd;
        int i5 = this.zzc;
        this.zzc = i5 + 1;
        zzaalVarArr[i5] = zzaalVar;
        this.zzb--;
        notifyAll();
    }

    @Override // com.google.android.gms.internal.ads.zzaan
    public final synchronized void zzc(zzaam zzaamVar) {
        while (zzaamVar != null) {
            try {
                zzaal[] zzaalVarArr = this.zzd;
                int i5 = this.zzc;
                this.zzc = i5 + 1;
                zzaalVarArr[i5] = zzaamVar.zzd();
                this.zzb--;
                zzaamVar = zzaamVar.zze();
            } catch (Throwable th) {
                throw th;
            }
        }
        notifyAll();
    }

    @Override // com.google.android.gms.internal.ads.zzaan
    public final synchronized void zzd() {
        int i5 = this.zza;
        String str = zzfj.zza;
        int max = Math.max(0, ((i5 + 65535) / 65536) - this.zzb);
        int i6 = this.zzc;
        if (max >= i6) {
            return;
        }
        Arrays.fill(this.zzd, max, i6, (Object) null);
        this.zzc = max;
    }

    public final synchronized void zze() {
        zzf(0);
    }

    public final synchronized void zzf(int i5) {
        int i6 = this.zza;
        this.zza = i5;
        if (i5 < i6) {
            zzd();
        }
    }

    public final synchronized int zzg() {
        return this.zzb * 65536;
    }
}
