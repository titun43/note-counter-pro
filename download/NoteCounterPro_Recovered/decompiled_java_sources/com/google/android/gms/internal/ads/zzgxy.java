package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;
import java.util.Spliterator;
import java.util.Spliterators;

/* loaded from: classes.dex */
final class zzgxy extends AbstractList implements RandomAccess, Serializable {
    final int[] zza;
    final int zzb;
    final int zzc;

    public zzgxy(int[] iArr, int i5, int i6) {
        this.zza = iArr;
        this.zzb = i5;
        this.zzc = i6;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return (obj instanceof Integer) && zzgxz.zzi(this.zza, ((Integer) obj).intValue(), this.zzb, this.zzc) != -1;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzgxy)) {
            return super.equals(obj);
        }
        zzgxy zzgxyVar = (zzgxy) obj;
        int i5 = this.zzc;
        int i6 = this.zzb;
        int i7 = zzgxyVar.zzc;
        int i8 = zzgxyVar.zzb;
        int i9 = i5 - i6;
        if (i7 - i8 != i9) {
            return false;
        }
        for (int i10 = 0; i10 < i9; i10++) {
            if (this.zza[i6 + i10] != zzgxyVar.zza[i8 + i10]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i5) {
        int i6 = this.zzc;
        int i7 = this.zzb;
        zzgrc.zzm(i5, i6 - i7, "index");
        return Integer.valueOf(this.zza[i7 + i5]);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i5 = 1;
        for (int i6 = this.zzb; i6 < this.zzc; i6++) {
            i5 = (i5 * 31) + Integer.hashCode(this.zza[i6]);
        }
        return i5;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int[] iArr = this.zza;
        int intValue = ((Integer) obj).intValue();
        int i5 = this.zzb;
        int zzi = zzgxz.zzi(iArr, intValue, i5, this.zzc);
        if (zzi >= 0) {
            return zzi - i5;
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return false;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        if (obj instanceof Integer) {
            int[] iArr = this.zza;
            int intValue = ((Integer) obj).intValue();
            int i5 = this.zzb;
            int i6 = this.zzc - 1;
            while (true) {
                if (i6 < i5) {
                    i6 = -1;
                    break;
                }
                if (iArr[i6] == intValue) {
                    break;
                }
                i6--;
            }
            if (i6 >= 0) {
                return i6 - i5;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i5, Object obj) {
        int i6 = this.zzc;
        int i7 = this.zzb;
        Integer num = (Integer) obj;
        zzgrc.zzm(i5, i6 - i7, "index");
        int[] iArr = this.zza;
        int i8 = i7 + i5;
        int i9 = iArr[i8];
        num.getClass();
        iArr[i8] = num.intValue();
        return Integer.valueOf(i9);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc - this.zzb;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.List
    public final /* bridge */ /* synthetic */ Spliterator spliterator() {
        return Spliterators.spliterator(this.zza, this.zzb, this.zzc, 0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i5, int i6) {
        int i7 = this.zzc;
        int i8 = this.zzb;
        zzgrc.zzo(i5, i6, i7 - i8);
        return i5 == i6 ? Collections.EMPTY_LIST : new zzgxy(this.zza, i5 + i8, i8 + i6);
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        int i5 = this.zzc;
        int i6 = this.zzb;
        StringBuilder sb = new StringBuilder((i5 - i6) * 5);
        sb.append('[');
        int[] iArr = this.zza;
        sb.append(iArr[i6]);
        while (true) {
            i6++;
            if (i6 >= i5) {
                sb.append(']');
                return sb.toString();
            }
            sb.append(", ");
            sb.append(iArr[i6]);
        }
    }
}
