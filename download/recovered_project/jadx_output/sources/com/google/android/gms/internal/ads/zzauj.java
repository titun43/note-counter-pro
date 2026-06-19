package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* loaded from: classes.dex */
final class zzauj implements Comparator {
    @Override // java.util.Comparator
    public final /* synthetic */ int compare(Object obj, Object obj2) {
        int length;
        zzauk zzaukVar = (zzauk) obj;
        zzauk zzaukVar2 = (zzauk) obj2;
        int i5 = 0;
        int i6 = 0;
        while (true) {
            length = zzaukVar.zza.length;
            if (i5 >= length || i6 >= zzaukVar2.zza.length) {
                break;
            }
            int compare = Integer.compare(zzauk.zzg(zzaukVar.zzb(i5)), zzauk.zzg(zzaukVar2.zzb(i6)));
            if (compare != 0) {
                return compare;
            }
            i5++;
            i6++;
        }
        return Integer.compare(length, zzaukVar2.zza.length);
    }
}
