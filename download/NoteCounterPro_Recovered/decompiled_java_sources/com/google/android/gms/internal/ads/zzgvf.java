package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public final class zzgvf {
    public static ArrayList zza(Iterator it) {
        ArrayList arrayList = new ArrayList();
        it.getClass();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }

    public static ArrayList zzb(int i5) {
        zzgtb.zzb(i5, "initialArraySize");
        return new ArrayList(i5);
    }

    public static List zzc(List list, zzgqt zzgqtVar) {
        return list instanceof RandomAccess ? new zzgvc(list, zzgqtVar) : new zzgve(list, zzgqtVar);
    }
}
