package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
abstract class zzgyz extends zzgyq {
    private List zza;

    public zzgyz(zzgub zzgubVar, boolean z4) {
        super(zzgubVar, z4, true);
        List zzb = zzgubVar.isEmpty() ? Collections.EMPTY_LIST : zzgvf.zzb(zzgubVar.size());
        for (int i5 = 0; i5 < zzgubVar.size(); i5++) {
            zzb.add(null);
        }
        this.zza = zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzgyq
    public final void zzA(int i5) {
        super.zzA(i5);
        this.zza = null;
    }

    public abstract Object zzD(List list);

    @Override // com.google.android.gms.internal.ads.zzgyq
    public final void zzw(int i5, Object obj) {
        List list = this.zza;
        if (list != null) {
            list.set(i5, new zzgyy(obj));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgyq
    public final void zzx() {
        List list = this.zza;
        if (list != null) {
            zza(zzD(list));
        }
    }
}
