package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* loaded from: classes.dex */
public final class zziks implements zzikg {
    private final List zza;
    private final List zzb;

    static {
        zzikh.zza(Collections.EMPTY_SET);
    }

    public /* synthetic */ zziks(List list, List list2, zzikq zzikqVar) {
        this.zza = list;
        this.zzb = list2;
    }

    public static zzikr zza(int i5, int i6) {
        return new zzikr(i5, i6, null);
    }

    @Override // com.google.android.gms.internal.ads.zzikv, com.google.android.gms.internal.ads.zziku
    /* renamed from: zzc, reason: merged with bridge method [inline-methods] */
    public final Set zzb() {
        List list = this.zza;
        int size = list.size();
        List list2 = this.zzb;
        ArrayList arrayList = new ArrayList(list2.size());
        int size2 = list2.size();
        for (int i5 = 0; i5 < size2; i5++) {
            Collection collection = (Collection) ((zzikp) list2.get(i5)).zzb();
            size += collection.size();
            arrayList.add(collection);
        }
        HashSet zzb = zzikd.zzb(size);
        int size3 = list.size();
        for (int i6 = 0; i6 < size3; i6++) {
            Object zzb2 = ((zzikp) list.get(i6)).zzb();
            zzb2.getClass();
            zzb.add(zzb2);
        }
        int size4 = arrayList.size();
        for (int i7 = 0; i7 < size4; i7++) {
            for (Object obj : (Collection) arrayList.get(i7)) {
                obj.getClass();
                zzb.add(obj);
            }
        }
        return Collections.unmodifiableSet(zzb);
    }
}
