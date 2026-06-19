package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Objects;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public abstract class zzguf extends zzgub implements List, RandomAccess {
    private static final zzgwu zza = new zzgud(zzgwa.zza, 0);
    public static final /* synthetic */ int zzd = 0;

    public static zzguf zzi() {
        return zzgwa.zza;
    }

    public static zzguf zzj(Object obj) {
        Object[] objArr = {obj};
        zzgvy.zza(objArr, 1);
        return zzt(objArr, 1);
    }

    public static zzguf zzk(Object obj, Object obj2) {
        Object[] objArr = {obj, obj2};
        zzgvy.zza(objArr, 2);
        return zzt(objArr, 2);
    }

    public static zzguf zzl(Object obj, Object obj2, Object obj3) {
        Object[] objArr = {obj, obj2, obj3};
        zzgvy.zza(objArr, 3);
        return zzt(objArr, 3);
    }

    public static zzguf zzm(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        Object[] objArr = {obj, obj2, obj3, obj4, obj5};
        zzgvy.zza(objArr, 5);
        return zzt(objArr, 5);
    }

    public static zzguf zzn(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        Object[] objArr = {obj, obj2, obj3, obj4, obj5, obj6};
        zzgvy.zza(objArr, 6);
        return zzt(objArr, 6);
    }

    @SafeVarargs
    public static zzguf zzo(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object... objArr) {
        int length = objArr.length;
        int i5 = length + 12;
        Object[] objArr2 = new Object[i5];
        objArr2[0] = obj;
        objArr2[1] = obj2;
        objArr2[2] = obj3;
        objArr2[3] = obj4;
        objArr2[4] = obj5;
        objArr2[5] = obj6;
        objArr2[6] = obj7;
        objArr2[7] = obj8;
        objArr2[8] = obj9;
        objArr2[9] = obj10;
        objArr2[10] = obj11;
        objArr2[11] = obj12;
        System.arraycopy(objArr, 0, objArr2, 12, length);
        zzgvy.zza(objArr2, i5);
        return zzt(objArr2, i5);
    }

    public static zzguf zzp(Iterable iterable) {
        iterable.getClass();
        return zzq((Collection) iterable);
    }

    public static zzguf zzq(Collection collection) {
        if (!(collection instanceof zzgub)) {
            Object[] array = collection.toArray();
            int length = array.length;
            zzgvy.zza(array, length);
            return zzt(array, length);
        }
        zzguf zze = ((zzgub) collection).zze();
        if (!zze.zzf()) {
            return zze;
        }
        Object[] array2 = zze.toArray();
        return zzt(array2, array2.length);
    }

    public static zzguf zzr(Object[] objArr) {
        if (objArr.length == 0) {
            return zzgwa.zza;
        }
        Object[] objArr2 = (Object[]) objArr.clone();
        int length = objArr2.length;
        zzgvy.zza(objArr2, length);
        return zzt(objArr2, length);
    }

    public static zzguf zzs(Comparator comparator, Iterable iterable) {
        Object[] array = (iterable instanceof Collection ? (Collection) iterable : zzgvf.zza(((zzguf) iterable).listIterator(0))).toArray();
        int length = array.length;
        zzgvy.zza(array, length);
        Arrays.sort(array, comparator);
        return zzt(array, length);
    }

    public static zzguf zzt(Object[] objArr, int i5) {
        return i5 == 0 ? zzgwa.zza : new zzgwa(objArr, i5);
    }

    public static zzguc zzv(int i5) {
        zzgtb.zzb(i5, "expectedSize");
        return new zzguc(i5);
    }

    @Override // java.util.List
    @Deprecated
    public final void add(int i5, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @Deprecated
    public final boolean addAll(int i5, Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.ads.zzgub, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        List list = (List) obj;
        int size = size();
        if (size != list.size()) {
            return false;
        }
        if (list instanceof RandomAccess) {
            for (int i5 = 0; i5 < size; i5++) {
                if (!Objects.equals(get(i5), list.get(i5))) {
                    return false;
                }
            }
            return true;
        }
        Iterator it = iterator();
        Iterator it2 = list.iterator();
        while (it.hasNext()) {
            if (!it2.hasNext() || !Objects.equals(it.next(), it2.next())) {
                return false;
            }
        }
        return !it2.hasNext();
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        int size = size();
        int i5 = 1;
        for (int i6 = 0; i6 < size; i6++) {
            i5 = (i5 * 31) + get(i6).hashCode();
        }
        return i5;
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        int size = size();
        for (int i5 = 0; i5 < size; i5++) {
            if (obj.equals(get(i5))) {
                return i5;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzgub, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        for (int size = size() - 1; size >= 0; size--) {
            if (obj.equals(get(size))) {
                return size;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final /* synthetic */ ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    @Deprecated
    public final Object remove(int i5) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @Deprecated
    public final Object set(int i5, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.ads.zzgub
    /* renamed from: zza */
    public final zzgwt iterator() {
        return listIterator(0);
    }

    @Override // com.google.android.gms.internal.ads.zzgub
    @Deprecated
    public final zzguf zze() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzgub
    public int zzg(Object[] objArr, int i5) {
        int size = size();
        for (int i6 = 0; i6 < size; i6++) {
            objArr[i5 + i6] = get(i6);
        }
        return i5 + size;
    }

    @Override // java.util.List
    /* renamed from: zzh, reason: merged with bridge method [inline-methods] */
    public zzguf subList(int i5, int i6) {
        zzgrc.zzo(i5, i6, size());
        int i7 = i6 - i5;
        return i7 == size() ? this : i7 == 0 ? zzgwa.zza : new zzgue(this, i5, i7);
    }

    @Override // java.util.List
    /* renamed from: zzu, reason: merged with bridge method [inline-methods] */
    public final zzgwu listIterator(int i5) {
        zzgrc.zzn(i5, size(), "index");
        return isEmpty() ? zza : new zzgud(this, i5);
    }
}
