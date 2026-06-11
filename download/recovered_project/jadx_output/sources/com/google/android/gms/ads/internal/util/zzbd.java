package com.google.android.gms.ads.internal.util;

import androidx.emoji2.text.p;
import com.google.android.gms.common.internal.b0;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class zzbd {
    public final String zza;
    public final double zzb;
    public final double zzc;
    public final double zzd;
    public final int zze;

    public zzbd(String str, double d5, double d6, double d7, int i5) {
        this.zza = str;
        this.zzc = d5;
        this.zzb = d6;
        this.zzd = d7;
        this.zze = i5;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzbd)) {
            return false;
        }
        zzbd zzbdVar = (zzbd) obj;
        return b0.j(this.zza, zzbdVar.zza) && this.zzb == zzbdVar.zzb && this.zzc == zzbdVar.zzc && this.zze == zzbdVar.zze && Double.compare(this.zzd, zzbdVar.zzd) == 0;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.zza, Double.valueOf(this.zzb), Double.valueOf(this.zzc), Double.valueOf(this.zzd), Integer.valueOf(this.zze)});
    }

    public final String toString() {
        p pVar = new p(this);
        pVar.h(this.zza, "name");
        pVar.h(Double.valueOf(this.zzc), "minBound");
        pVar.h(Double.valueOf(this.zzb), "maxBound");
        pVar.h(Double.valueOf(this.zzd), "percent");
        pVar.h(Integer.valueOf(this.zze), "count");
        return pVar.toString();
    }
}
