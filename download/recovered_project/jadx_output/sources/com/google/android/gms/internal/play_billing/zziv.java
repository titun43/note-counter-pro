package com.google.android.gms.internal.play_billing;

import androidx.emoji2.text.u;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* loaded from: classes.dex */
final class zziv extends zzfx implements RandomAccess {
    private static final Object[] zza;
    private static final zziv zzb;
    private Object[] zzc;
    private int zzd;

    static {
        Object[] objArr = new Object[0];
        zza = objArr;
        zzb = new zziv(objArr, 0, false);
    }

    public zziv() {
        this(zza, 0, true);
    }

    public static zziv zze() {
        return zzb;
    }

    private static int zzg(int i5) {
        return Math.max(((i5 * 3) / 2) + 1, 10);
    }

    private final String zzh(int i5) {
        return u.g(i5, this.zzd, "Index:", ", Size:");
    }

    private final void zzi(int i5) {
        if (i5 < 0 || i5 >= this.zzd) {
            throw new IndexOutOfBoundsException(zzh(i5));
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzfx, java.util.AbstractList, java.util.List
    public final void add(int i5, Object obj) {
        int i6;
        zza();
        if (i5 < 0 || i5 > (i6 = this.zzd)) {
            throw new IndexOutOfBoundsException(zzh(i5));
        }
        int i7 = i5 + 1;
        Object[] objArr = this.zzc;
        int length = objArr.length;
        if (i6 < length) {
            System.arraycopy(objArr, i5, objArr, i7, i6 - i5);
        } else {
            Object[] objArr2 = new Object[zzg(length)];
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
        zzi(i5);
        return this.zzc[i5];
    }

    @Override // com.google.android.gms.internal.play_billing.zzfx, java.util.AbstractList, java.util.List
    public final Object remove(int i5) {
        zza();
        zzi(i5);
        Object[] objArr = this.zzc;
        Object obj = objArr[i5];
        if (i5 < this.zzd - 1) {
            System.arraycopy(objArr, i5 + 1, objArr, i5, (r2 - i5) - 1);
        }
        this.zzd--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // com.google.android.gms.internal.play_billing.zzfx, java.util.AbstractList, java.util.List
    public final Object set(int i5, Object obj) {
        zza();
        zzi(i5);
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

    @Override // com.google.android.gms.internal.play_billing.zzho
    public final /* bridge */ /* synthetic */ zzho zzd(int i5) {
        if (i5 >= this.zzd) {
            return new zziv(i5 == 0 ? zza : Arrays.copyOf(this.zzc, i5), this.zzd, true);
        }
        throw new IllegalArgumentException();
    }

    public final void zzf(int i5) {
        int length = this.zzc.length;
        if (i5 <= length) {
            return;
        }
        if (length == 0) {
            this.zzc = new Object[Math.max(i5, 10)];
            return;
        }
        while (length < i5) {
            length = zzg(length);
        }
        this.zzc = Arrays.copyOf(this.zzc, length);
    }

    private zziv(Object[] objArr, int i5, boolean z4) {
        super(z4);
        this.zzc = objArr;
        this.zzd = i5;
    }

    @Override // com.google.android.gms.internal.play_billing.zzfx, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        zza();
        int i5 = this.zzd;
        int length = this.zzc.length;
        if (i5 == length) {
            this.zzc = Arrays.copyOf(this.zzc, zzg(length));
        }
        Object[] objArr = this.zzc;
        int i6 = this.zzd;
        this.zzd = i6 + 1;
        objArr[i6] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }
}
