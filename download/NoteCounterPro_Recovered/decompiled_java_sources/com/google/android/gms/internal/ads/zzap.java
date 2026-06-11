package com.google.android.gms.internal.ads;

import androidx.fragment.app.h1;
import com.google.android.gms.ads.RequestConfiguration;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public final class zzap {
    private final zzao[] zza;

    public zzap(long j2, zzao... zzaoVarArr) {
        this.zza = zzaoVarArr;
    }

    private static final zzao zzh(zzao zzaoVar, Class cls, zzgrd zzgrdVar) {
        if (!cls.isAssignableFrom(zzaoVar.getClass())) {
            return null;
        }
        zzao zzaoVar2 = (zzao) cls.cast(zzaoVar);
        if (zzgrdVar.zza(zzaoVar2)) {
            return zzaoVar2;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && zzap.class == obj.getClass() && Arrays.equals(this.zza, ((zzap) obj).zza);
    }

    public final int hashCode() {
        return Long.hashCode(-9223372036854775807L) + (Arrays.hashCode(this.zza) * 31);
    }

    public final String toString() {
        String arrays = Arrays.toString(this.zza);
        return h1.b(new StringBuilder(String.valueOf(arrays).length() + 8), "entries=", arrays, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
    }

    public final int zza() {
        return this.zza.length;
    }

    public final zzao zzb(int i5) {
        return this.zza[i5];
    }

    public final zzao zzc(Class cls, zzgrd zzgrdVar) {
        for (zzao zzaoVar : this.zza) {
            zzao zzh = zzh(zzaoVar, cls, zzgrdVar);
            if (zzh != null) {
                return zzh;
            }
        }
        return null;
    }

    public final zzguf zzd(Class cls) {
        int i5 = zzguf.zzd;
        zzguc zzgucVar = new zzguc();
        for (zzao zzaoVar : this.zza) {
            if (cls.isAssignableFrom(zzaoVar.getClass())) {
                zzgucVar.zzf((zzao) cls.cast(zzaoVar));
            }
        }
        return zzgucVar.zzi();
    }

    public final zzguf zze(Class cls, zzgrd zzgrdVar) {
        int i5 = zzguf.zzd;
        zzguc zzgucVar = new zzguc();
        for (zzao zzaoVar : this.zza) {
            zzao zzh = zzh(zzaoVar, cls, zzgrdVar);
            if (zzh != null) {
                zzgucVar.zzf(zzh);
            }
        }
        return zzgucVar.zzi();
    }

    public final zzap zzf(zzap zzapVar) {
        return zzapVar == null ? this : zzg(zzapVar.zza);
    }

    public final zzap zzg(zzao... zzaoVarArr) {
        int length = zzaoVarArr.length;
        if (length == 0) {
            return this;
        }
        zzao[] zzaoVarArr2 = this.zza;
        String str = zzfj.zza;
        int length2 = zzaoVarArr2.length;
        Object[] copyOf = Arrays.copyOf(zzaoVarArr2, length2 + length);
        System.arraycopy(zzaoVarArr, 0, copyOf, length2, length);
        return new zzap(-9223372036854775807L, (zzao[]) copyOf);
    }

    public zzap(List list) {
        this.zza = (zzao[]) list.toArray(new zzao[0]);
    }
}
