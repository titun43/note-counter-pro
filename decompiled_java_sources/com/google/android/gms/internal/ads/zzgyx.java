package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
final class zzgyx extends zzgyz {
    public zzgyx(zzgub zzgubVar, boolean z4) {
        super(zzgubVar, z4);
        zze();
    }

    @Override // com.google.android.gms.internal.ads.zzgyz
    public final /* bridge */ /* synthetic */ Object zzD(List list) {
        ArrayList zzb = zzgvf.zzb(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzgyy zzgyyVar = (zzgyy) it.next();
            zzb.add(zzgyyVar != null ? zzgyyVar.zza : null);
        }
        return Collections.unmodifiableList(zzb);
    }
}
