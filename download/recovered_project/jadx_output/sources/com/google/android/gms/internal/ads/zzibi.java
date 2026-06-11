package com.google.android.gms.internal.ads;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* loaded from: classes.dex */
final class zzibi extends zzhzz implements RandomAccess, zziby, zzidl {
    private static final float[] zza;
    private static final zzibi zzb;
    private float[] zzc;
    private int zzd;

    static {
        float[] fArr = new float[0];
        zza = fArr;
        zzb = new zzibi(fArr, 0, false);
    }

    public zzibi() {
        this(zza, 0, true);
    }

    public static zzibi zzd() {
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
        float floatValue = ((Float) obj).floatValue();
        zzdV();
        if (i5 < 0 || i5 > (i6 = this.zzd)) {
            throw new IndexOutOfBoundsException(zzl(i5));
        }
        int i7 = i5 + 1;
        float[] fArr = this.zzc;
        int length = fArr.length;
        if (i6 < length) {
            System.arraycopy(fArr, i5, fArr, i7, i6 - i5);
        } else {
            float[] fArr2 = new float[zzj(length)];
            System.arraycopy(this.zzc, 0, fArr2, 0, i5);
            System.arraycopy(this.zzc, i5, fArr2, i7, this.zzd - i5);
            this.zzc = fArr2;
        }
        this.zzc[i5] = floatValue;
        this.zzd++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.ads.zzhzz, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        zzdV();
        byte[] bArr = zzice.zzb;
        collection.getClass();
        if (!(collection instanceof zzibi)) {
            return super.addAll(collection);
        }
        zzibi zzibiVar = (zzibi) collection;
        int i5 = zzibiVar.zzd;
        if (i5 == 0) {
            return false;
        }
        int i6 = this.zzd;
        if (com.google.android.gms.common.api.f.API_PRIORITY_OTHER - i6 < i5) {
            throw new OutOfMemoryError();
        }
        int i7 = i6 + i5;
        float[] fArr = this.zzc;
        if (i7 > fArr.length) {
            this.zzc = Arrays.copyOf(fArr, i7);
        }
        System.arraycopy(zzibiVar.zzc, 0, this.zzc, this.zzd, zzibiVar.zzd);
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
        if (!(obj instanceof zzibi)) {
            return super.equals(obj);
        }
        zzibi zzibiVar = (zzibi) obj;
        if (this.zzd != zzibiVar.zzd) {
            return false;
        }
        float[] fArr = zzibiVar.zzc;
        for (int i5 = 0; i5 < this.zzd; i5++) {
            if (Float.floatToIntBits(this.zzc[i5]) != Float.floatToIntBits(fArr[i5])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i5) {
        zzk(i5);
        return Float.valueOf(this.zzc[i5]);
    }

    @Override // com.google.android.gms.internal.ads.zzhzz, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i5 = 1;
        for (int i6 = 0; i6 < this.zzd; i6++) {
            i5 = (i5 * 31) + Float.floatToIntBits(this.zzc[i6]);
        }
        return i5;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Float)) {
            return -1;
        }
        float floatValue = ((Float) obj).floatValue();
        int i5 = this.zzd;
        for (int i6 = 0; i6 < i5; i6++) {
            if (this.zzc[i6] == floatValue) {
                return i6;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzhzz, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i5) {
        zzdV();
        zzk(i5);
        float[] fArr = this.zzc;
        float f5 = fArr[i5];
        if (i5 < this.zzd - 1) {
            System.arraycopy(fArr, i5 + 1, fArr, i5, (r2 - i5) - 1);
        }
        this.zzd--;
        ((AbstractList) this).modCount++;
        return Float.valueOf(f5);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i5, int i6) {
        zzdV();
        if (i6 < i5) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        float[] fArr = this.zzc;
        System.arraycopy(fArr, i6, fArr, i5, this.zzd - i6);
        this.zzd -= i6 - i5;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.ads.zzhzz, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i5, Object obj) {
        float floatValue = ((Float) obj).floatValue();
        zzdV();
        zzk(i5);
        float[] fArr = this.zzc;
        float f5 = fArr[i5];
        fArr[i5] = floatValue;
        return Float.valueOf(f5);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzicd, com.google.android.gms.internal.ads.zzibt
    /* renamed from: zze */
    public final zziby zzh(int i5) {
        if (i5 >= this.zzd) {
            return new zzibi(i5 == 0 ? zza : Arrays.copyOf(this.zzc, i5), this.zzd, true);
        }
        throw new IllegalArgumentException();
    }

    public final float zzf(int i5) {
        zzk(i5);
        return this.zzc[i5];
    }

    public final void zzg(float f5) {
        zzdV();
        int i5 = this.zzd;
        int length = this.zzc.length;
        if (i5 == length) {
            float[] fArr = new float[zzj(length)];
            System.arraycopy(this.zzc, 0, fArr, 0, this.zzd);
            this.zzc = fArr;
        }
        float[] fArr2 = this.zzc;
        int i6 = this.zzd;
        this.zzd = i6 + 1;
        fArr2[i6] = f5;
    }

    public final void zzi(int i5) {
        int length = this.zzc.length;
        if (i5 <= length) {
            return;
        }
        if (length == 0) {
            this.zzc = new float[Math.max(i5, 10)];
            return;
        }
        while (length < i5) {
            length = zzj(length);
        }
        this.zzc = Arrays.copyOf(this.zzc, length);
    }

    private zzibi(float[] fArr, int i5, boolean z4) {
        super(z4);
        this.zzc = fArr;
        this.zzd = i5;
    }

    @Override // com.google.android.gms.internal.ads.zzhzz, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        zzg(((Float) obj).floatValue());
        return true;
    }
}
