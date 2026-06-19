package com.google.android.gms.ads.internal.client;

import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.google.android.gms.internal.ads.zzbqm;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
final class zzew extends zzbqm {
    final /* synthetic */ zzex zza;

    public /* synthetic */ zzew(zzex zzexVar, byte[] bArr) {
        Objects.requireNonNull(zzexVar);
        this.zza = zzexVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbqn
    public final void zzb(List list) {
        int i5;
        ArrayList arrayList;
        InitializationStatus zzB;
        zzex zzexVar = this.zza;
        synchronized (zzexVar.zzw()) {
            zzexVar.zzy(false);
            zzexVar.zzz(true);
            arrayList = new ArrayList(zzexVar.zzx());
            zzexVar.zzx().clear();
        }
        zzB = zzex.zzB(list);
        int size = arrayList.size();
        for (i5 = 0; i5 < size; i5++) {
            ((OnInitializationCompleteListener) arrayList.get(i5)).onInitializationComplete(zzB);
        }
    }
}
