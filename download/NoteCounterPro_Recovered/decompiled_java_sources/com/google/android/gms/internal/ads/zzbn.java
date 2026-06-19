package com.google.android.gms.internal.ads;

import java.util.List;

/* loaded from: classes.dex */
public final class zzbn {
    public static final zzbn zza = new zzbn(zzguf.zzi());
    private final zzguf zzb;

    static {
        String str = zzfj.zza;
        Integer.toString(0, 36);
    }

    public zzbn(List list) {
        this.zzb = zzguf.zzq(list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || zzbn.class != obj.getClass()) {
            return false;
        }
        return this.zzb.equals(((zzbn) obj).zzb);
    }

    public final int hashCode() {
        return this.zzb.hashCode();
    }

    public final zzguf zza() {
        return this.zzb;
    }

    public final boolean zzb(int i5) {
        int i6 = 0;
        while (true) {
            zzguf zzgufVar = this.zzb;
            if (i6 >= zzgufVar.size()) {
                return false;
            }
            zzbm zzbmVar = (zzbm) zzgufVar.get(i6);
            if (zzbmVar.zzb() && zzbmVar.zzd() == i5) {
                return true;
            }
            i6++;
        }
    }
}
