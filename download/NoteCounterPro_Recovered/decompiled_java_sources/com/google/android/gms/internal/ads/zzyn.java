package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.RequestConfiguration;

/* loaded from: classes.dex */
public final class zzyn {
    public static final zzyn zza = new zzyn(new zzbg[0]);
    public final int zzb;
    private final zzguf zzc;
    private int zzd;

    static {
        String str = zzfj.zza;
        Integer.toString(0, 36);
    }

    public zzyn(zzbg... zzbgVarArr) {
        this.zzc = zzguf.zzr(zzbgVarArr);
        this.zzb = zzbgVarArr.length;
        int i5 = 0;
        while (i5 < this.zzc.size()) {
            int i6 = i5 + 1;
            for (int i7 = i6; i7 < this.zzc.size(); i7++) {
                if (((zzbg) this.zzc.get(i5)).equals(this.zzc.get(i7))) {
                    zzee.zzf("TrackGroupArray", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, new IllegalArgumentException("Multiple identical TrackGroups added to one TrackGroupArray."));
                }
            }
            i5 = i6;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzyn.class == obj.getClass()) {
            zzyn zzynVar = (zzyn) obj;
            if (this.zzb == zzynVar.zzb && this.zzc.equals(zzynVar.zzc)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i5 = this.zzd;
        if (i5 != 0) {
            return i5;
        }
        int hashCode = this.zzc.hashCode();
        this.zzd = hashCode;
        return hashCode;
    }

    public final String toString() {
        return this.zzc.toString();
    }

    public final zzbg zza(int i5) {
        return (zzbg) this.zzc.get(i5);
    }

    public final int zzb(zzbg zzbgVar) {
        int indexOf = this.zzc.indexOf(zzbgVar);
        if (indexOf >= 0) {
            return indexOf;
        }
        return -1;
    }

    public final zzguf zzc() {
        return zzguf.zzq(zzgvf.zzc(this.zzc, zzym.zza));
    }
}
