package com.google.android.gms.internal.ads;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* loaded from: classes.dex */
final class zzidn extends zzhzz implements RandomAccess {
    private static final Object[] zza;
    private static final zzidn zzb;
    private Object[] zzc;
    private int zzd;

    static {
        Object[] objArr = new Object[0];
        zza = objArr;
        zzb = new zzidn(objArr, 0, false);
    }

    public zzidn() {
        this(zza, 0, true);
    }

    public static zzidn zzd() {
        return zzb;
    }

    private static int zzf(int i5) {
        return Math.max(((i5 * 3) / 2) + 1, 10);
    }

    private final void zzg(int i5) {
        if (i5 < 0 || i5 >= this.zzd) {
            throw new IndexOutOfBoundsException(zzi(i5));
        }
    }

    private final String zzi(int i5) {
        int i6 = this.zzd;
        return s.c.c(new StringBuilder(String.valueOf(i5).length() + 13 + String.valueOf(i6).length()), "Index:", i5, ", Size:", i6);
    }

    @Override // com.google.android.gms.internal.ads.zzhzz, java.util.AbstractList, java.util.List
    public final void add(int i5, Object obj) {
        int i6;
        zzdV();
        if (i5 < 0 || i5 > (i6 = this.zzd)) {
            throw new IndexOutOfBoundsException(zzi(i5));
        }
        int i7 = i5 + 1;
        Object[] objArr = this.zzc;
        int length = objArr.length;
        if (i6 < length) {
            System.arraycopy(objArr, i5, objArr, i7, i6 - i5);
        } else {
            Object[] objArr2 = new Object[zzf(length)];
            System.arraycopy(this.zzc, 0, objArr2, 0, i5);
            System.arraycopy(this.zzc, i5, objArr2, i7, this.zzd - i5);
            this.zzc = objArr2;
        }
        this.zzc[i5] = obj;
        this.zzd++;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i5) {
        zzg(i5);
        return this.zzc[i5];
    }

    @Override // com.google.android.gms.internal.ads.zzhzz, java.util.AbstractList, java.util.List
    public final Object remove(int i5) {
        zzdV();
        zzg(i5);
        Object[] objArr = this.zzc;
        Object obj = objArr[i5];
        if (i5 < this.zzd - 1) {
            System.arraycopy(objArr, i5 + 1, objArr, i5, (r2 - i5) - 1);
        }
        this.zzd--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // com.google.android.gms.internal.ads.zzhzz, java.util.AbstractList, java.util.List
    public final Object set(int i5, Object obj) {
        zzdV();
        zzg(i5);
        Object[] objArr = this.zzc;
        Object obj2 = objArr[i5];
        objArr[i5] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzd;
    }

    public final void zze(int i5) {
        int length = this.zzc.length;
        if (i5 <= length) {
            return;
        }
        if (length == 0) {
            this.zzc = new Object[Math.max(i5, 10)];
            return;
        }
        while (length < i5) {
            length = zzf(length);
        }
        this.zzc = Arrays.copyOf(this.zzc, length);
    }

    @Override // com.google.android.gms.internal.ads.zzicd, com.google.android.gms.internal.ads.zzibt
    public final /* bridge */ /* synthetic */ zzicd zzh(int i5) {
        if (i5 >= this.zzd) {
            return new zzidn(i5 == 0 ? zza : Arrays.copyOf(this.zzc, i5), this.zzd, true);
        }
        throw new IllegalArgumentException();
    }

    private zzidn(Object[] objArr, int i5, boolean z4) {
        super(z4);
        this.zzc = objArr;
        this.zzd = i5;
    }

    @Override // com.google.android.gms.internal.ads.zzhzz, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        zzdV();
        int i5 = this.zzd;
        int length = this.zzc.length;
        if (i5 == length) {
            this.zzc = Arrays.copyOf(this.zzc, zzf(length));
        }
        Object[] objArr = this.zzc;
        int i6 = this.zzd;
        this.zzd = i6 + 1;
        objArr[i6] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }
}
