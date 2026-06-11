package com.google.android.gms.internal.measurement;

import androidx.emoji2.text.u;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* loaded from: classes.dex */
final class zzls extends zzim implements RandomAccess {
    private static final zzls zza;
    private Object[] zzb;
    private int zzc;

    static {
        zzls zzlsVar = new zzls(new Object[0], 0);
        zza = zzlsVar;
        zzlsVar.zzb();
    }

    public zzls() {
        this(new Object[10], 0);
    }

    public static zzls zze() {
        return zza;
    }

    private final String zzf(int i5) {
        return u.g(i5, this.zzc, "Index:", ", Size:");
    }

    private final void zzg(int i5) {
        if (i5 < 0 || i5 >= this.zzc) {
            throw new IndexOutOfBoundsException(zzf(i5));
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzim, java.util.AbstractList, java.util.List
    public final void add(int i5, Object obj) {
        int i6;
        zzbS();
        if (i5 < 0 || i5 > (i6 = this.zzc)) {
            throw new IndexOutOfBoundsException(zzf(i5));
        }
        Object[] objArr = this.zzb;
        if (i6 < objArr.length) {
            System.arraycopy(objArr, i5, objArr, i5 + 1, i6 - i5);
        } else {
            Object[] objArr2 = new Object[((i6 * 3) / 2) + 1];
            System.arraycopy(objArr, 0, objArr2, 0, i5);
            System.arraycopy(this.zzb, i5, objArr2, i5 + 1, this.zzc - i5);
            this.zzb = objArr2;
        }
        this.zzb[i5] = obj;
        this.zzc++;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i5) {
        zzg(i5);
        return this.zzb[i5];
    }

    @Override // com.google.android.gms.internal.measurement.zzim, java.util.AbstractList, java.util.List
    public final Object remove(int i5) {
        zzbS();
        zzg(i5);
        Object[] objArr = this.zzb;
        Object obj = objArr[i5];
        if (i5 < this.zzc - 1) {
            System.arraycopy(objArr, i5 + 1, objArr, i5, (r2 - i5) - 1);
        }
        this.zzc--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // com.google.android.gms.internal.measurement.zzim, java.util.AbstractList, java.util.List
    public final Object set(int i5, Object obj) {
        zzbS();
        zzg(i5);
        Object[] objArr = this.zzb;
        Object obj2 = objArr[i5];
        objArr[i5] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.measurement.zzkj
    public final /* bridge */ /* synthetic */ zzkj zzd(int i5) {
        if (i5 >= this.zzc) {
            return new zzls(Arrays.copyOf(this.zzb, i5), this.zzc);
        }
        throw new IllegalArgumentException();
    }

    private zzls(Object[] objArr, int i5) {
        this.zzb = objArr;
        this.zzc = i5;
    }

    @Override // com.google.android.gms.internal.measurement.zzim, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        zzbS();
        int i5 = this.zzc;
        Object[] objArr = this.zzb;
        if (i5 == objArr.length) {
            this.zzb = Arrays.copyOf(objArr, ((i5 * 3) / 2) + 1);
        }
        Object[] objArr2 = this.zzb;
        int i6 = this.zzc;
        this.zzc = i6 + 1;
        objArr2[i6] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }
}
