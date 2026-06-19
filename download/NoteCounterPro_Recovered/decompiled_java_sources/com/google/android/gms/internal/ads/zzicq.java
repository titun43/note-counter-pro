package com.google.android.gms.internal.ads;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* loaded from: classes.dex */
final class zzicq extends zzhzz implements RandomAccess, zzicc, zzidl {
    private static final long[] zza;
    private static final zzicq zzb;
    private long[] zzc;
    private int zzd;

    static {
        long[] jArr = new long[0];
        zza = jArr;
        zzb = new zzicq(jArr, 0, false);
    }

    public zzicq() {
        this(zza, 0, true);
    }

    public static zzicq zzg() {
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
        long longValue = ((Long) obj).longValue();
        zzdV();
        if (i5 < 0 || i5 > (i6 = this.zzd)) {
            throw new IndexOutOfBoundsException(zzl(i5));
        }
        int i7 = i5 + 1;
        long[] jArr = this.zzc;
        int length = jArr.length;
        if (i6 < length) {
            System.arraycopy(jArr, i5, jArr, i7, i6 - i5);
        } else {
            long[] jArr2 = new long[zzj(length)];
            System.arraycopy(this.zzc, 0, jArr2, 0, i5);
            System.arraycopy(this.zzc, i5, jArr2, i7, this.zzd - i5);
            this.zzc = jArr2;
        }
        this.zzc[i5] = longValue;
        this.zzd++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.ads.zzhzz, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        zzdV();
        byte[] bArr = zzice.zzb;
        collection.getClass();
        if (!(collection instanceof zzicq)) {
            return super.addAll(collection);
        }
        zzicq zzicqVar = (zzicq) collection;
        int i5 = zzicqVar.zzd;
        if (i5 == 0) {
            return false;
        }
        int i6 = this.zzd;
        if (com.google.android.gms.common.api.f.API_PRIORITY_OTHER - i6 < i5) {
            throw new OutOfMemoryError();
        }
        int i7 = i6 + i5;
        long[] jArr = this.zzc;
        if (i7 > jArr.length) {
            this.zzc = Arrays.copyOf(jArr, i7);
        }
        System.arraycopy(zzicqVar.zzc, 0, this.zzc, this.zzd, zzicqVar.zzd);
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
        if (!(obj instanceof zzicq)) {
            return super.equals(obj);
        }
        zzicq zzicqVar = (zzicq) obj;
        if (this.zzd != zzicqVar.zzd) {
            return false;
        }
        long[] jArr = zzicqVar.zzc;
        for (int i5 = 0; i5 < this.zzd; i5++) {
            if (this.zzc[i5] != jArr[i5]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i5) {
        zzk(i5);
        return Long.valueOf(this.zzc[i5]);
    }

    @Override // com.google.android.gms.internal.ads.zzhzz, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i5 = 1;
        for (int i6 = 0; i6 < this.zzd; i6++) {
            long j2 = this.zzc[i6];
            byte[] bArr = zzice.zzb;
            i5 = (i5 * 31) + ((int) (j2 ^ (j2 >>> 32)));
        }
        return i5;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long longValue = ((Long) obj).longValue();
        int i5 = this.zzd;
        for (int i6 = 0; i6 < i5; i6++) {
            if (this.zzc[i6] == longValue) {
                return i6;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzhzz, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i5) {
        zzdV();
        zzk(i5);
        long[] jArr = this.zzc;
        long j2 = jArr[i5];
        if (i5 < this.zzd - 1) {
            System.arraycopy(jArr, i5 + 1, jArr, i5, (r3 - i5) - 1);
        }
        this.zzd--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j2);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i5, int i6) {
        zzdV();
        if (i6 < i5) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        long[] jArr = this.zzc;
        System.arraycopy(jArr, i6, jArr, i5, this.zzd - i6);
        this.zzd -= i6 - i5;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.ads.zzhzz, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i5, Object obj) {
        return Long.valueOf(zze(i5, ((Long) obj).longValue()));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzicc
    public final long zzc(int i5) {
        zzk(i5);
        return this.zzc[i5];
    }

    @Override // com.google.android.gms.internal.ads.zzicc
    public final void zzd(long j2) {
        zzdV();
        int i5 = this.zzd;
        int length = this.zzc.length;
        if (i5 == length) {
            long[] jArr = new long[zzj(length)];
            System.arraycopy(this.zzc, 0, jArr, 0, this.zzd);
            this.zzc = jArr;
        }
        long[] jArr2 = this.zzc;
        int i6 = this.zzd;
        this.zzd = i6 + 1;
        jArr2[i6] = j2;
    }

    @Override // com.google.android.gms.internal.ads.zzicc
    public final long zze(int i5, long j2) {
        zzdV();
        zzk(i5);
        long[] jArr = this.zzc;
        long j5 = jArr[i5];
        jArr[i5] = j2;
        return j5;
    }

    @Override // com.google.android.gms.internal.ads.zzicd, com.google.android.gms.internal.ads.zzibt
    /* renamed from: zzf */
    public final zzicc zzh(int i5) {
        if (i5 >= this.zzd) {
            return new zzicq(i5 == 0 ? zza : Arrays.copyOf(this.zzc, i5), this.zzd, true);
        }
        throw new IllegalArgumentException();
    }

    public final void zzi(int i5) {
        int length = this.zzc.length;
        if (i5 <= length) {
            return;
        }
        if (length == 0) {
            this.zzc = new long[Math.max(i5, 10)];
            return;
        }
        while (length < i5) {
            length = zzj(length);
        }
        this.zzc = Arrays.copyOf(this.zzc, length);
    }

    private zzicq(long[] jArr, int i5, boolean z4) {
        super(z4);
        this.zzc = jArr;
        this.zzd = i5;
    }

    @Override // com.google.android.gms.internal.ads.zzhzz, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        zzd(((Long) obj).longValue());
        return true;
    }
}
