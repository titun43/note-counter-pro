package com.google.android.gms.internal.play_billing;

import androidx.emoji2.text.u;
import com.google.android.gms.common.api.f;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* loaded from: classes.dex */
final class zzib extends zzfx implements RandomAccess, zzho, zzit {
    private static final long[] zza;
    private long[] zzb;
    private int zzc;

    static {
        long[] jArr = new long[0];
        zza = jArr;
        new zzib(jArr, 0, false);
    }

    public zzib() {
        this(zza, 0, true);
    }

    private static int zzh(int i5) {
        return Math.max(((i5 * 3) / 2) + 1, 10);
    }

    private final String zzi(int i5) {
        return u.g(i5, this.zzc, "Index:", ", Size:");
    }

    private final void zzj(int i5) {
        if (i5 < 0 || i5 >= this.zzc) {
            throw new IndexOutOfBoundsException(zzi(i5));
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzfx, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i5, Object obj) {
        int i6;
        long longValue = ((Long) obj).longValue();
        zza();
        if (i5 < 0 || i5 > (i6 = this.zzc)) {
            throw new IndexOutOfBoundsException(zzi(i5));
        }
        int i7 = i5 + 1;
        long[] jArr = this.zzb;
        int length = jArr.length;
        if (i6 < length) {
            System.arraycopy(jArr, i5, jArr, i7, i6 - i5);
        } else {
            long[] jArr2 = new long[zzh(length)];
            System.arraycopy(this.zzb, 0, jArr2, 0, i5);
            System.arraycopy(this.zzb, i5, jArr2, i7, this.zzc - i5);
            this.zzb = jArr2;
        }
        this.zzb[i5] = longValue;
        this.zzc++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.play_billing.zzfx, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        zza();
        byte[] bArr = zzhp.zzb;
        collection.getClass();
        if (!(collection instanceof zzib)) {
            return super.addAll(collection);
        }
        zzib zzibVar = (zzib) collection;
        int i5 = zzibVar.zzc;
        if (i5 == 0) {
            return false;
        }
        int i6 = this.zzc;
        if (f.API_PRIORITY_OTHER - i6 < i5) {
            throw new OutOfMemoryError();
        }
        int i7 = i6 + i5;
        long[] jArr = this.zzb;
        if (i7 > jArr.length) {
            this.zzb = Arrays.copyOf(jArr, i7);
        }
        System.arraycopy(zzibVar.zzb, 0, this.zzb, this.zzc, zzibVar.zzc);
        this.zzc = i7;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // com.google.android.gms.internal.play_billing.zzfx, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzib)) {
            return super.equals(obj);
        }
        zzib zzibVar = (zzib) obj;
        if (this.zzc != zzibVar.zzc) {
            return false;
        }
        long[] jArr = zzibVar.zzb;
        for (int i5 = 0; i5 < this.zzc; i5++) {
            if (this.zzb[i5] != jArr[i5]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i5) {
        zzj(i5);
        return Long.valueOf(this.zzb[i5]);
    }

    @Override // com.google.android.gms.internal.play_billing.zzfx, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i5 = 1;
        for (int i6 = 0; i6 < this.zzc; i6++) {
            long j2 = this.zzb[i6];
            byte[] bArr = zzhp.zzb;
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
        int i5 = this.zzc;
        for (int i6 = 0; i6 < i5; i6++) {
            if (this.zzb[i6] == longValue) {
                return i6;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.play_billing.zzfx, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i5) {
        zza();
        zzj(i5);
        long[] jArr = this.zzb;
        long j2 = jArr[i5];
        if (i5 < this.zzc - 1) {
            System.arraycopy(jArr, i5 + 1, jArr, i5, (r3 - i5) - 1);
        }
        this.zzc--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j2);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i5, int i6) {
        zza();
        if (i6 < i5) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        long[] jArr = this.zzb;
        System.arraycopy(jArr, i6, jArr, i5, this.zzc - i6);
        this.zzc -= i6 - i5;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.play_billing.zzfx, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i5, Object obj) {
        long longValue = ((Long) obj).longValue();
        zza();
        zzj(i5);
        long[] jArr = this.zzb;
        long j2 = jArr[i5];
        jArr[i5] = longValue;
        return Long.valueOf(j2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.play_billing.zzho
    public final /* bridge */ /* synthetic */ zzho zzd(int i5) {
        if (i5 >= this.zzc) {
            return new zzib(i5 == 0 ? zza : Arrays.copyOf(this.zzb, i5), this.zzc, true);
        }
        throw new IllegalArgumentException();
    }

    public final long zze(int i5) {
        zzj(i5);
        return this.zzb[i5];
    }

    public final void zzf(long j2) {
        zza();
        int i5 = this.zzc;
        int length = this.zzb.length;
        if (i5 == length) {
            long[] jArr = new long[zzh(length)];
            System.arraycopy(this.zzb, 0, jArr, 0, this.zzc);
            this.zzb = jArr;
        }
        long[] jArr2 = this.zzb;
        int i6 = this.zzc;
        this.zzc = i6 + 1;
        jArr2[i6] = j2;
    }

    public final void zzg(int i5) {
        int length = this.zzb.length;
        if (i5 <= length) {
            return;
        }
        if (length == 0) {
            this.zzb = new long[Math.max(i5, 10)];
            return;
        }
        while (length < i5) {
            length = zzh(length);
        }
        this.zzb = Arrays.copyOf(this.zzb, length);
    }

    private zzib(long[] jArr, int i5, boolean z4) {
        super(z4);
        this.zzb = jArr;
        this.zzc = i5;
    }

    @Override // com.google.android.gms.internal.play_billing.zzfx, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        zzf(((Long) obj).longValue());
        return true;
    }
}
