package com.google.android.gms.internal.ads;

import androidx.emoji2.text.u;
import com.google.android.gms.ads.RequestConfiguration;

/* loaded from: classes.dex */
public final class zzafw {
    public final zzafz zza;
    public final zzafz zzb;

    public zzafw(zzafz zzafzVar, zzafz zzafzVar2) {
        this.zza = zzafzVar;
        this.zzb = zzafzVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzafw.class == obj.getClass()) {
            zzafw zzafwVar = (zzafw) obj;
            if (this.zza.equals(zzafwVar.zza) && this.zzb.equals(zzafwVar.zzb)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.zzb.hashCode() + (this.zza.hashCode() * 31);
    }

    public final String toString() {
        zzafz zzafzVar = this.zza;
        zzafz zzafzVar2 = this.zzb;
        String zzafzVar3 = zzafzVar.toString();
        String concat = zzafzVar.equals(zzafzVar2) ? RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED : ", ".concat(zzafzVar2.toString());
        return u.n(new StringBuilder(u.e(concat, zzafzVar3.length() + 1, 1)), "[", zzafzVar3, concat, "]");
    }
}
