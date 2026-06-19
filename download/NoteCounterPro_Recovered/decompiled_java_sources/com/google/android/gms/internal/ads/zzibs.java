package com.google.android.gms.internal.ads;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* loaded from: classes.dex */
final class zzibs extends zzhzz implements RandomAccess, zzibz, zzidl {
    private static final int[] zza;
    private static final zzibs zzb;
    private int[] zzc;
    private int zzd;

    static {
        int[] iArr = new int[0];
        zza = iArr;
        zzb = new zzibs(iArr, 0, false);
    }

    public zzibs() {
        this(zza, 0, true);
    }

    public static zzibs zzd() {
        return zzb;
    }

    private static int zzk(int i5) {
        return Math.max(((i5 * 3) / 2) + 1, 10);
    }

    private final void zzl(int i5) {
        if (i5 < 0 || i5 >= this.zzd) {
            throw new IndexOutOfBoundsException(zzm(i5));
        }
    }

    private final String zzm(int i5) {
        int i6 = this.zzd;
        return s.c.c(new StringBuilder(String.valueOf(i5).length() + 13 + String.valueOf(i6).length()), "Index:", i5, ", Size:", i6);
    }

    @Override // com.google.android.gms.internal.ads.zzhzz, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i5, Object obj) {
        int i6;
        int intValue = ((Integer) obj).intValue();
        zzdV();
        if (i5 < 0 || i5 > (i6 = this.zzd)) {
            throw new IndexOutOfBoundsException(zzm(i5));
        }
        int i7 = i5 + 1;
        int[] iArr = this.zzc;
        int length = iArr.length;
        if (i6 < length) {
            System.arraycopy(iArr, i5, iArr, i7, i6 - i5);
        } else {
            int[] iArr2 = new int[zzk(length)];
            System.arraycopy(this.zzc, 0, iArr2, 0, i5);
            System.arraycopy(this.zzc, i5, iArr2, i7, this.zzd - i5);
            this.zzc = iArr2;
        }
        this.zzc[i5] = intValue;
        this.zzd++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.ads.zzhzz, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        zzdV();
        byte[] bArr = zzice.zzb;
        collection.getClass();
        if (!(collection instanceof zzibs)) {
            return super.addAll(collection);
        }
        zzibs zzibsVar = (zzibs) collection;
        int i5 = zzibsVar.zzd;
        if (i5 == 0) {
            return false;
        }
        int i6 = this.zzd;
        if (com.google.android.gms.common.api.f.API_PRIORITY_OTHER - i6 < i5) {
            throw new OutOfMemoryError();
        }
        int i7 = i6 + i5;
        int[] iArr = this.zzc;
        if (i7 > iArr.length) {
            this.zzc = Arrays.copyOf(iArr, i7);
        }
        System.arraycopy(zzibsVar.zzc, 0, this.zzc, this.zzd, zzibsVar.zzd);
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
        if (!(obj instanceof zzibs)) {
            return super.equals(obj);
        }
        zzibs zzibsVar = (zzibs) obj;
        if (this.zzd != zzibsVar.zzd) {
            return false;
        }
        int[] iArr = zzibsVar.zzc;
        for (int i5 = 0; i5 < this.zzd; i5++) {
            if (this.zzc[i5] != iArr[i5]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i5) {
        zzl(i5);
        return Integer.valueOf(this.zzc[i5]);
    }

    @Override // com.google.android.gms.internal.ads.zzhzz, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i5 = 1;
        for (int i6 = 0; i6 < this.zzd; i6++) {
            i5 = (i5 * 31) + this.zzc[i6];
        }
        return i5;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int intValue = ((Integer) obj).intValue();
        int i5 = this.zzd;
        for (int i6 = 0; i6 < i5; i6++) {
            if (this.zzc[i6] == intValue) {
                return i6;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzhzz, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i5) {
        zzdV();
        zzl(i5);
        int[] iArr = this.zzc;
        int i6 = iArr[i5];
        if (i5 < this.zzd - 1) {
            System.arraycopy(iArr, i5 + 1, iArr, i5, (r2 - i5) - 1);
        }
        this.zzd--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i6);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i5, int i6) {
        zzdV();
        if (i6 < i5) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        int[] iArr = this.zzc;
        System.arraycopy(iArr, i6, iArr, i5, this.zzd - i6);
        this.zzd -= i6 - i5;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.ads.zzhzz, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i5, Object obj) {
        return Integer.valueOf(zzg(i5, ((Integer) obj).intValue()));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzicd, com.google.android.gms.internal.ads.zzibt
    /* renamed from: zze */
    public final zzibz zzh(int i5) {
        if (i5 >= this.zzd) {
            return new zzibs(i5 == 0 ? zza : Arrays.copyOf(this.zzc, i5), this.zzd, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.android.gms.internal.ads.zzibz
    public final int zzf(int i5) {
        zzl(i5);
        return this.zzc[i5];
    }

    @Override // com.google.android.gms.internal.ads.zzibz
    public final int zzg(int i5, int i6) {
        zzdV();
        zzl(i5);
        int[] iArr = this.zzc;
        int i7 = iArr[i5];
        iArr[i5] = i6;
        return i7;
    }

    @Override // com.google.android.gms.internal.ads.zzibz
    public final void zzi(int i5) {
        zzdV();
        int i6 = this.zzd;
        int length = this.zzc.length;
        if (i6 == length) {
            int[] iArr = new int[zzk(length)];
            System.arraycopy(this.zzc, 0, iArr, 0, this.zzd);
            this.zzc = iArr;
        }
        int[] iArr2 = this.zzc;
        int i7 = this.zzd;
        this.zzd = i7 + 1;
        iArr2[i7] = i5;
    }

    public final void zzj(int i5) {
        int length = this.zzc.length;
        if (i5 <= length) {
            return;
        }
        if (length == 0) {
            this.zzc = new int[Math.max(i5, 10)];
            return;
        }
        while (length < i5) {
            length = zzk(length);
        }
        this.zzc = Arrays.copyOf(this.zzc, length);
    }

    private zzibs(int[] iArr, int i5, boolean z4) {
        super(z4);
        this.zzc = iArr;
        this.zzd = i5;
    }

    @Override // com.google.android.gms.internal.ads.zzhzz, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        zzi(((Integer) obj).intValue());
        return true;
    }
}
