package com.google.android.gms.internal.ads;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* loaded from: classes.dex */
final class zziad extends zzhzz implements RandomAccess, zzibt, zzidl {
    private static final boolean[] zza;
    private static final zziad zzb;
    private boolean[] zzc;
    private int zzd;

    static {
        boolean[] zArr = new boolean[0];
        zza = zArr;
        zzb = new zziad(zArr, 0, false);
    }

    public zziad() {
        this(zza, 0, true);
    }

    public static zziad zzd() {
        return zzb;
    }

    private static int zzi(int i5) {
        return Math.max(((i5 * 3) / 2) + 1, 10);
    }

    private final void zzj(int i5) {
        if (i5 < 0 || i5 >= this.zzd) {
            throw new IndexOutOfBoundsException(zzk(i5));
        }
    }

    private final String zzk(int i5) {
        int i6 = this.zzd;
        return s.c.c(new StringBuilder(String.valueOf(i5).length() + 13 + String.valueOf(i6).length()), "Index:", i5, ", Size:", i6);
    }

    @Override // com.google.android.gms.internal.ads.zzhzz, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i5, Object obj) {
        int i6;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        zzdV();
        if (i5 < 0 || i5 > (i6 = this.zzd)) {
            throw new IndexOutOfBoundsException(zzk(i5));
        }
        int i7 = i5 + 1;
        boolean[] zArr = this.zzc;
        int length = zArr.length;
        if (i6 < length) {
            System.arraycopy(zArr, i5, zArr, i7, i6 - i5);
        } else {
            boolean[] zArr2 = new boolean[zzi(length)];
            System.arraycopy(this.zzc, 0, zArr2, 0, i5);
            System.arraycopy(this.zzc, i5, zArr2, i7, this.zzd - i5);
            this.zzc = zArr2;
        }
        this.zzc[i5] = booleanValue;
        this.zzd++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.ads.zzhzz, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        zzdV();
        byte[] bArr = zzice.zzb;
        collection.getClass();
        if (!(collection instanceof zziad)) {
            return super.addAll(collection);
        }
        zziad zziadVar = (zziad) collection;
        int i5 = zziadVar.zzd;
        if (i5 == 0) {
            return false;
        }
        int i6 = this.zzd;
        if (com.google.android.gms.common.api.f.API_PRIORITY_OTHER - i6 < i5) {
            throw new OutOfMemoryError();
        }
        int i7 = i6 + i5;
        boolean[] zArr = this.zzc;
        if (i7 > zArr.length) {
            this.zzc = Arrays.copyOf(zArr, i7);
        }
        System.arraycopy(zziadVar.zzc, 0, this.zzc, this.zzd, zziadVar.zzd);
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
        if (!(obj instanceof zziad)) {
            return super.equals(obj);
        }
        zziad zziadVar = (zziad) obj;
        if (this.zzd != zziadVar.zzd) {
            return false;
        }
        boolean[] zArr = zziadVar.zzc;
        for (int i5 = 0; i5 < this.zzd; i5++) {
            if (this.zzc[i5] != zArr[i5]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i5) {
        zzj(i5);
        return Boolean.valueOf(this.zzc[i5]);
    }

    @Override // com.google.android.gms.internal.ads.zzhzz, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i5 = 1;
        for (int i6 = 0; i6 < this.zzd; i6++) {
            i5 = (i5 * 31) + zzice.zzb(this.zzc[i6]);
        }
        return i5;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Boolean)) {
            return -1;
        }
        boolean booleanValue = ((Boolean) obj).booleanValue();
        int i5 = this.zzd;
        for (int i6 = 0; i6 < i5; i6++) {
            if (this.zzc[i6] == booleanValue) {
                return i6;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzhzz, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i5) {
        zzdV();
        zzj(i5);
        boolean[] zArr = this.zzc;
        boolean z4 = zArr[i5];
        if (i5 < this.zzd - 1) {
            System.arraycopy(zArr, i5 + 1, zArr, i5, (r2 - i5) - 1);
        }
        this.zzd--;
        ((AbstractList) this).modCount++;
        return Boolean.valueOf(z4);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i5, int i6) {
        zzdV();
        if (i6 < i5) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        boolean[] zArr = this.zzc;
        System.arraycopy(zArr, i6, zArr, i5, this.zzd - i6);
        this.zzd -= i6 - i5;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.ads.zzhzz, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i5, Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        zzdV();
        zzj(i5);
        boolean[] zArr = this.zzc;
        boolean z4 = zArr[i5];
        zArr[i5] = booleanValue;
        return Boolean.valueOf(z4);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzicd, com.google.android.gms.internal.ads.zzibt
    /* renamed from: zze */
    public final zzibt zzh(int i5) {
        if (i5 >= this.zzd) {
            return new zziad(i5 == 0 ? zza : Arrays.copyOf(this.zzc, i5), this.zzd, true);
        }
        throw new IllegalArgumentException();
    }

    public final boolean zzf(int i5) {
        zzj(i5);
        return this.zzc[i5];
    }

    public final void zzg(boolean z4) {
        zzdV();
        int i5 = this.zzd;
        int length = this.zzc.length;
        if (i5 == length) {
            boolean[] zArr = new boolean[zzi(length)];
            System.arraycopy(this.zzc, 0, zArr, 0, this.zzd);
            this.zzc = zArr;
        }
        boolean[] zArr2 = this.zzc;
        int i6 = this.zzd;
        this.zzd = i6 + 1;
        zArr2[i6] = z4;
    }

    private zziad(boolean[] zArr, int i5, boolean z4) {
        super(z4);
        this.zzc = zArr;
        this.zzd = i5;
    }

    @Override // com.google.android.gms.internal.ads.zzhzz, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        zzg(((Boolean) obj).booleanValue());
        return true;
    }
}
