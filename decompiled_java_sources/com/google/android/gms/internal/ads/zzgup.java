package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;
import java.util.Set;
import java.util.SortedSet;

/* loaded from: classes.dex */
public abstract class zzgup<E> extends zzgub<E> implements Set<E> {
    private transient zzguf zza;

    public static zzgup zzh() {
        return zzgwg.zza;
    }

    public static zzgup zzi(Object obj) {
        return new zzgwq(obj);
    }

    public static zzgup zzj(Object obj, Object obj2) {
        return zzv(2, obj, obj2);
    }

    public static zzgup zzk(Object obj, Object obj2, Object obj3) {
        return zzv(3, obj, obj2, obj3);
    }

    public static zzgup zzl(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return zzv(5, obj, obj2, obj3, obj4, obj5);
    }

    @SafeVarargs
    public static zzgup zzm(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object... objArr) {
        int length = objArr.length;
        int i5 = length + 6;
        Object[] objArr2 = new Object[i5];
        objArr2[0] = obj;
        objArr2[1] = obj2;
        objArr2[2] = obj3;
        objArr2[3] = obj4;
        objArr2[4] = obj5;
        objArr2[5] = obj6;
        System.arraycopy(objArr, 0, objArr2, 6, length);
        return zzv(i5, objArr2);
    }

    public static int zzn(int i5) {
        int max = Math.max(i5, 2);
        if (max >= 751619276) {
            zzgrc.zzb(max < 1073741824, "collection too large");
            return 1073741824;
        }
        int highestOneBit = Integer.highestOneBit(max - 1);
        do {
            highestOneBit += highestOneBit;
        } while (highestOneBit * 0.7d < max);
        return highestOneBit;
    }

    public static zzgup zzo(Collection collection) {
        if ((collection instanceof zzgup) && !(collection instanceof SortedSet)) {
            zzgup zzgupVar = (zzgup) collection;
            if (!zzgupVar.zzf()) {
                return zzgupVar;
            }
        }
        Object[] array = collection.toArray();
        return zzv(array.length, array);
    }

    public static zzgup zzp(Object[] objArr) {
        int length = objArr.length;
        return length != 0 ? length != 1 ? zzv(length, (Object[]) objArr.clone()) : new zzgwq(objArr[0]) : zzgwg.zza;
    }

    public static zzguo zzs(int i5) {
        zzgtb.zzb(i5, "expectedSize");
        return new zzguo(i5, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zzgup zzv(int i5, Object... objArr) {
        if (i5 == 0) {
            return zzgwg.zza;
        }
        if (i5 == 1) {
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            return new zzgwq(obj);
        }
        int zzn = zzn(i5);
        Object[] objArr2 = new Object[zzn];
        int i6 = zzn - 1;
        int i7 = 0;
        int i8 = 0;
        for (int i9 = 0; i9 < i5; i9++) {
            Object obj2 = objArr[i9];
            zzgvy.zzb(obj2, i9);
            int hashCode = obj2.hashCode();
            int zza = zzgty.zza(hashCode);
            while (true) {
                int i10 = zza & i6;
                Object obj3 = objArr2[i10];
                if (obj3 == null) {
                    objArr[i8] = obj2;
                    objArr2[i10] = obj2;
                    i7 += hashCode;
                    i8++;
                    break;
                }
                if (!obj3.equals(obj2)) {
                    zza++;
                }
            }
        }
        Arrays.fill(objArr, i8, i5, (Object) null);
        if (i8 == 1) {
            Object obj4 = objArr[0];
            Objects.requireNonNull(obj4);
            return new zzgwq(obj4);
        }
        if (zzn(i8) < zzn / 2) {
            return zzv(i8, objArr);
        }
        if (zzw(i8, objArr.length)) {
            objArr = Arrays.copyOf(objArr, i8);
        }
        return new zzgwg(objArr, i7, objArr2, i6, i8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean zzw(int i5, int i6) {
        return i5 < (i6 >> 1) + (i6 >> 2);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof zzgup) && zzq() && ((zzgup) obj).zzq() && hashCode() != obj.hashCode()) {
            return false;
        }
        return zzgwp.zzd(this, obj);
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return zzgwp.zzc(this);
    }

    @Override // com.google.android.gms.internal.ads.zzgub, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public abstract zzgwt iterator();

    @Override // com.google.android.gms.internal.ads.zzgub
    public zzguf zze() {
        zzguf zzgufVar = this.zza;
        if (zzgufVar != null) {
            return zzgufVar;
        }
        zzguf zzr = zzr();
        this.zza = zzr;
        return zzr;
    }

    public boolean zzq() {
        return false;
    }

    public zzguf zzr() {
        Object[] array = toArray();
        int i5 = zzguf.zzd;
        return zzguf.zzt(array, array.length);
    }
}
