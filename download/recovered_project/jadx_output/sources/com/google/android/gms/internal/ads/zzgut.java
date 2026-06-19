package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public final class zzgut {
    public static boolean zza(Iterable iterable, zzgrd zzgrdVar) {
        if ((iterable instanceof RandomAccess) && (iterable instanceof List)) {
            zzgrdVar.getClass();
            return zzc((List) iterable, zzgrdVar);
        }
        Iterator it = iterable.iterator();
        zzgrdVar.getClass();
        boolean z4 = false;
        while (it.hasNext()) {
            if (zzgrdVar.zza(it.next())) {
                it.remove();
                z4 = true;
            }
        }
        return z4;
    }

    public static Object zzb(Iterable iterable, Object obj) {
        zzgwt it = ((zzgwk) iterable).iterator();
        return it.hasNext() ? it.next() : obj;
    }

    private static boolean zzc(List list, zzgrd zzgrdVar) {
        int i5 = 0;
        int i6 = 0;
        while (i5 < list.size()) {
            Object obj = list.get(i5);
            if (!zzgrdVar.zza(obj)) {
                if (i5 > i6) {
                    try {
                        list.set(i6, obj);
                    } catch (IllegalArgumentException unused) {
                        zzd(list, zzgrdVar, i6, i5);
                        return true;
                    } catch (UnsupportedOperationException unused2) {
                        zzd(list, zzgrdVar, i6, i5);
                        return true;
                    }
                }
                i6++;
            }
            i5++;
        }
        list.subList(i6, list.size()).clear();
        return i5 != i6;
    }

    private static void zzd(List list, zzgrd zzgrdVar, int i5, int i6) {
        int size = list.size();
        while (true) {
            size--;
            if (size <= i6) {
                break;
            } else if (zzgrdVar.zza(list.get(size))) {
                list.remove(size);
            }
        }
        while (true) {
            i6--;
            if (i6 < i5) {
                return;
            } else {
                list.remove(i6);
            }
        }
    }
}
