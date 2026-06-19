package com.google.android.gms.internal.ads;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* loaded from: classes.dex */
final class zziay extends zzhzz implements RandomAccess, zzibu, zzidl {
    private static final double[] zza;
    private static final zziay zzb;
    private double[] zzc;
    private int zzd;

    static {
        double[] dArr = new double[0];
        zza = dArr;
        zzb = new zziay(dArr, 0, false);
    }

    public zziay() {
        this(zza, 0, true);
    }

    public static zziay zzd() {
        return zzb;
    }

    private static int zzj(int i5) {
        return Math.max(((i5 * 3) / 2) + 1, 10);
    }

    private final void zzk(int i5) {
        if (i5 < 0 || i5 >= this.zzd) {
            throw new IndexOutOfBoundsException(zzl(i5));
        }
    }

    private final String zzl(int i5) {
        int i6 = this.zzd;
        return s.c.c(new StringBuilder(String.valueOf(i5).length() + 13 + String.valueOf(i6).length()), "Index:", i5, ", Size:", i6);
    }

    @Override // com.google.android.gms.internal.ads.zzhzz, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i5, Object obj) {
        int i6;
        double doubleValue = ((Double) obj).doubleValue();
        zzdV();
        if (i5 < 0 || i5 > (i6 = this.zzd)) {
            throw new IndexOutOfBoundsException(zzl(i5));
        }
        int i7 = i5 + 1;
        double[] dArr = this.zzc;
        int length = dArr.length;
        if (i6 < length) {
            System.arraycopy(dArr, i5, dArr, i7, i6 - i5);
        } else {
            double[] dArr2 = new double[zzj(length)];
            System.arraycopy(this.zzc, 0, dArr2, 0, i5);
            System.arraycopy(this.zzc, i5, dArr2, i7, this.zzd - i5);
            this.zzc = dArr2;
        }
        this.zzc[i5] = doubleValue;
        this.zzd++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.ads.zzhzz, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        zzdV();
        byte[] bArr = zzice.zzb;
        collection.getClass();
        if (!(collection instanceof zziay)) {
            return super.addAll(collection);
        }
        zziay zziayVar = (zziay) collection;
        int i5 = zziayVar.zzd;
        if (i5 == 0) {
            return false;
        }
        int i6 = this.zzd;
        if (com.google.android.gms.common.api.f.API_PRIORITY_OTHER - i6 < i5) {
            throw new OutOfMemoryError();
        }
        int i7 = i6 + i5;
        double[] dArr = this.zzc;
        if (i7 > dArr.length) {
            this.zzc = Arrays.copyOf(dArr, i7);
        }
        System.arraycopy(zziayVar.zzc, 0, this.zzc, this.zzd, zziayVar.zzd);
        this.zzd = i7;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // com.google.android.gms.internal.ads.zzhzz, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zziay)) {
            return super.equals(obj);
        }
        zziay zziayVar = (zziay) obj;
        if (this.zzd != zziayVar.zzd) {
            return false;
        }
        double[] dArr = zziayVar.zzc;
        for (int i5 = 0; i5 < this.zzd; i5++) {
            if (Double.doubleToLongBits(this.zzc[i5]) != Double.doubleToLongBits(dArr[i5])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i5) {
        zzk(i5);
        return Double.valueOf(this.zzc[i5]);
    }

    @Override // com.google.android.gms.internal.ads.zzhzz, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i5 = 1;
        for (int i6 = 0; i6 < this.zzd; i6++) {
            long doubleToLongBits = Double.doubleToLongBits(this.zzc[i6]);
            byte[] bArr = zzice.zzb;
            i5 = (i5 * 31) + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
        }
        return i5;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Double)) {
            return -1;
        }
        double doubleValue = ((Double) obj).doubleValue();
        int i5 = this.zzd;
        for (int i6 = 0; i6 < i5; i6++) {
            if (this.zzc[i6] == doubleValue) {
                return i6;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzhzz, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i5) {
        zzdV();
        zzk(i5);
        double[] dArr = this.zzc;
        double d5 = dArr[i5];
        if (i5 < this.zzd - 1) {
            System.arraycopy(dArr, i5 + 1, dArr, i5, (r3 - i5) - 1);
        }
        this.zzd--;
        ((AbstractList) this).modCount++;
        return Double.valueOf(d5);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i5, int i6) {
        zzdV();
        if (i6 < i5) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        double[] dArr = this.zzc;
        System.arraycopy(dArr, i6, dArr, i5, this.zzd - i6);
        this.zzd -= i6 - i5;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.ads.zzhzz, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i5, Object obj) {
        double doubleValue = ((Double) obj).doubleValue();
        zzdV();
        zzk(i5);
        double[] dArr = this.zzc;
        double d5 = dArr[i5];
        dArr[i5] = doubleValue;
        return Double.valueOf(d5);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzicd, com.google.android.gms.internal.ads.zzibt
    /* renamed from: zze */
    public final zzibu zzh(int i5) {
        if (i5 >= this.zzd) {
            return new zziay(i5 == 0 ? zza : Arrays.copyOf(this.zzc, i5), this.zzd, true);
        }
        throw new IllegalArgumentException();
    }

    public final double zzf(int i5) {
        zzk(i5);
        return this.zzc[i5];
    }

    public final void zzg(double d5) {
        zzdV();
        int i5 = this.zzd;
        int length = this.zzc.length;
        if (i5 == length) {
            double[] dArr = new double[zzj(length)];
            System.arraycopy(this.zzc, 0, dArr, 0, this.zzd);
            this.zzc = dArr;
        }
        double[] dArr2 = this.zzc;
        int i6 = this.zzd;
        this.zzd = i6 + 1;
        dArr2[i6] = d5;
    }

    public final void zzi(int i5) {
        int length = this.zzc.length;
        if (i5 <= length) {
            return;
        }
        if (length == 0) {
            this.zzc = new double[Math.max(i5, 10)];
            return;
        }
        while (length < i5) {
            length = zzj(length);
        }
        this.zzc = Arrays.copyOf(this.zzc, length);
    }

    private zziay(double[] dArr, int i5, boolean z4) {
        super(z4);
        this.zzc = dArr;
        this.zzd = i5;
    }

    @Override // com.google.android.gms.internal.ads.zzhzz, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        zzg(((Double) obj).doubleValue());
        return true;
    }
}
