package com.google.android.gms.internal.ads;

import androidx.emoji2.text.u;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class zzalg implements zzagc {
    public final int zza;
    public final zzgxx zzb;

    public zzalg(int i5, int[] iArr) {
        this.zza = i5;
        this.zzb = iArr != null ? zzgxx.zzb(iArr) : zzgxx.zza();
    }

    public final String toString() {
        zzgxx zzgxxVar = this.zzb;
        ArrayList arrayList = new ArrayList(zzgxxVar.zzc());
        for (int i5 = 0; i5 < zzgxxVar.zzc(); i5++) {
            arrayList.add(zzfj.zzx(zzgxxVar.zzd(i5)));
        }
        String zzx = zzfj.zzx(this.zza);
        String obj = arrayList.toString();
        StringBuilder sb = new StringBuilder(u.e(obj, zzx.length() + 37, 1));
        sb.append("UnsupportedBrands{major=");
        sb.append(zzx);
        sb.append(", compatible=");
        sb.append(obj);
        sb.append("}");
        return sb.toString();
    }
}
