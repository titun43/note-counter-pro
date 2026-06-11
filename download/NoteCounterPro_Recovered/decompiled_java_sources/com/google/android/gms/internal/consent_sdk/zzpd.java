package com.google.android.gms.internal.consent_sdk;

import androidx.emoji2.text.u;
import com.google.android.gms.common.api.f;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* loaded from: classes.dex */
final class zzpd extends zzpb implements RandomAccess, zzqr {
    private static final boolean[] zza;
    private boolean[] zzb;
    private int zzc;

    static {
        boolean[] zArr = new boolean[0];
        zza = zArr;
        new zzpd(zArr, 0, false);
    }

    public zzpd() {
        this(zza, 0, true);
    }

    private static int zzf(int i5) {
        return Math.max(((i5 * 3) / 2) + 1, 10);
    }

    private final String zzg(int i5) {
        return u.g(i5, this.zzc, "Index:", ", Size:");
    }

    private final void zzh(int i5) {
        if (i5 < 0 || i5 >= this.zzc) {
            throw new IndexOutOfBoundsException(zzg(i5));
        }
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpb, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i5, Object obj) {
        int i6;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        zza();
        if (i5 < 0 || i5 > (i6 = this.zzc)) {
            throw new IndexOutOfBoundsException(zzg(i5));
        }
        int i7 = i5 + 1;
        boolean[] zArr = this.zzb;
        int length = zArr.length;
        if (i6 < length) {
            System.arraycopy(zArr, i5, zArr, i7, i6 - i5);
        } else {
            boolean[] zArr2 = new boolean[zzf(length)];
            System.arraycopy(this.zzb, 0, zArr2, 0, i5);
            System.arraycopy(this.zzb, i5, zArr2, i7, this.zzc - i5);
            this.zzb = zArr2;
        }
        this.zzb[i5] = booleanValue;
        this.zzc++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpb, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        zza();
        byte[] bArr = zzqs.zzb;
        collection.getClass();
        if (!(collection instanceof zzpd)) {
            return super.addAll(collection);
        }
        zzpd zzpdVar = (zzpd) collection;
        int i5 = zzpdVar.zzc;
        if (i5 == 0) {
            return false;
        }
        int i6 = this.zzc;
        if (f.API_PRIORITY_OTHER - i6 < i5) {
            throw new OutOfMemoryError();
        }
        int i7 = i6 + i5;
        boolean[] zArr = this.zzb;
        if (i7 > zArr.length) {
            this.zzb = Arrays.copyOf(zArr, i7);
        }
        System.arraycopy(zzpdVar.zzb, 0, this.zzb, this.zzc, zzpdVar.zzc);
        this.zzc = i7;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpb, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzpd)) {
            return super.equals(obj);
        }
        zzpd zzpdVar = (zzpd) obj;
        if (this.zzc != zzpdVar.zzc) {
            return false;
        }
        boolean[] zArr = zzpdVar.zzb;
        for (int i5 = 0; i5 < this.zzc; i5++) {
            if (this.zzb[i5] != zArr[i5]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i5) {
        zzh(i5);
        return Boolean.valueOf(this.zzb[i5]);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpb, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i5 = 1;
        for (int i6 = 0; i6 < this.zzc; i6++) {
            i5 = (i5 * 31) + zzqs.zza(this.zzb[i6]);
        }
        return i5;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Boolean)) {
            return -1;
        }
        boolean booleanValue = ((Boolean) obj).booleanValue();
        int i5 = this.zzc;
        for (int i6 = 0; i6 < i5; i6++) {
            if (this.zzb[i6] == booleanValue) {
                return i6;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpb, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i5) {
        zza();
        zzh(i5);
        boolean[] zArr = this.zzb;
        boolean z4 = zArr[i5];
        if (i5 < this.zzc - 1) {
            System.arraycopy(zArr, i5 + 1, zArr, i5, (r2 - i5) - 1);
        }
        this.zzc--;
        ((AbstractList) this).modCount++;
        return Boolean.valueOf(z4);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i5, int i6) {
        zza();
        if (i6 < i5) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        boolean[] zArr = this.zzb;
        System.arraycopy(zArr, i6, zArr, i5, this.zzc - i6);
        this.zzc -= i6 - i5;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpb, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i5, Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        zza();
        zzh(i5);
        boolean[] zArr = this.zzb;
        boolean z4 = zArr[i5];
        zArr[i5] = booleanValue;
        return Boolean.valueOf(z4);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzqr
    public final /* bridge */ /* synthetic */ zzqr zzd(int i5) {
        if (i5 >= this.zzc) {
            return new zzpd(i5 == 0 ? zza : Arrays.copyOf(this.zzb, i5), this.zzc, true);
        }
        throw new IllegalArgumentException();
    }

    public final boolean zze(int i5) {
        zzh(i5);
        return this.zzb[i5];
    }

    private zzpd(boolean[] zArr, int i5, boolean z4) {
        super(z4);
        this.zzb = zArr;
        this.zzc = i5;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpb, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        zza();
        int i5 = this.zzc;
        int length = this.zzb.length;
        if (i5 == length) {
            boolean[] zArr = new boolean[zzf(length)];
            System.arraycopy(this.zzb, 0, zArr, 0, this.zzc);
            this.zzb = zArr;
        }
        boolean[] zArr2 = this.zzb;
        int i6 = this.zzc;
        this.zzc = i6 + 1;
        zArr2[i6] = booleanValue;
        return true;
    }
}
