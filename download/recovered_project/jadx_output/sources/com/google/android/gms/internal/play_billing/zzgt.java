package com.google.android.gms.internal.play_billing;

import androidx.emoji2.text.u;
import com.google.android.gms.common.api.f;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* loaded from: classes.dex */
final class zzgt extends zzfx implements RandomAccess, zzho, zzit {
    private static final double[] zza;
    private double[] zzb;
    private int zzc;

    static {
        double[] dArr = new double[0];
        zza = dArr;
        new zzgt(dArr, 0, false);
    }

    public zzgt() {
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
        double doubleValue = ((Double) obj).doubleValue();
        zza();
        if (i5 < 0 || i5 > (i6 = this.zzc)) {
            throw new IndexOutOfBoundsException(zzi(i5));
        }
        int i7 = i5 + 1;
        double[] dArr = this.zzb;
        int length = dArr.length;
        if (i6 < length) {
            System.arraycopy(dArr, i5, dArr, i7, i6 - i5);
        } else {
            double[] dArr2 = new double[zzh(length)];
            System.arraycopy(this.zzb, 0, dArr2, 0, i5);
            System.arraycopy(this.zzb, i5, dArr2, i7, this.zzc - i5);
            this.zzb = dArr2;
        }
        this.zzb[i5] = doubleValue;
        this.zzc++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.play_billing.zzfx, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        zza();
        byte[] bArr = zzhp.zzb;
        collection.getClass();
        if (!(collection instanceof zzgt)) {
            return super.addAll(collection);
        }
        zzgt zzgtVar = (zzgt) collection;
        int i5 = zzgtVar.zzc;
        if (i5 == 0) {
            return false;
        }
        int i6 = this.zzc;
        if (f.API_PRIORITY_OTHER - i6 < i5) {
            throw new OutOfMemoryError();
        }
        int i7 = i6 + i5;
        double[] dArr = this.zzb;
        if (i7 > dArr.length) {
            this.zzb = Arrays.copyOf(dArr, i7);
        }
        System.arraycopy(zzgtVar.zzb, 0, this.zzb, this.zzc, zzgtVar.zzc);
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
        if (!(obj instanceof zzgt)) {
            return super.equals(obj);
        }
        zzgt zzgtVar = (zzgt) obj;
        if (this.zzc != zzgtVar.zzc) {
            return false;
        }
        double[] dArr = zzgtVar.zzb;
        for (int i5 = 0; i5 < this.zzc; i5++) {
            if (Double.doubleToLongBits(this.zzb[i5]) != Double.doubleToLongBits(dArr[i5])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i5) {
        zzj(i5);
        return Double.valueOf(this.zzb[i5]);
    }

    @Override // com.google.android.gms.internal.play_billing.zzfx, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i5 = 1;
        for (int i6 = 0; i6 < this.zzc; i6++) {
            long doubleToLongBits = Double.doubleToLongBits(this.zzb[i6]);
            byte[] bArr = zzhp.zzb;
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
        int i5 = this.zzc;
        for (int i6 = 0; i6 < i5; i6++) {
            if (this.zzb[i6] == doubleValue) {
                return i6;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.play_billing.zzfx, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i5) {
        zza();
        zzj(i5);
        double[] dArr = this.zzb;
        double d5 = dArr[i5];
        if (i5 < this.zzc - 1) {
            System.arraycopy(dArr, i5 + 1, dArr, i5, (r3 - i5) - 1);
        }
        this.zzc--;
        ((AbstractList) this).modCount++;
        return Double.valueOf(d5);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i5, int i6) {
        zza();
        if (i6 < i5) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        double[] dArr = this.zzb;
        System.arraycopy(dArr, i6, dArr, i5, this.zzc - i6);
        this.zzc -= i6 - i5;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.play_billing.zzfx, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i5, Object obj) {
        double doubleValue = ((Double) obj).doubleValue();
        zza();
        zzj(i5);
        double[] dArr = this.zzb;
        double d5 = dArr[i5];
        dArr[i5] = doubleValue;
        return Double.valueOf(d5);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.play_billing.zzho
    public final /* bridge */ /* synthetic */ zzho zzd(int i5) {
        if (i5 >= this.zzc) {
            return new zzgt(i5 == 0 ? zza : Arrays.copyOf(this.zzb, i5), this.zzc, true);
        }
        throw new IllegalArgumentException();
    }

    public final double zze(int i5) {
        zzj(i5);
        return this.zzb[i5];
    }

    public final void zzf(double d5) {
        zza();
        int i5 = this.zzc;
        int length = this.zzb.length;
        if (i5 == length) {
            double[] dArr = new double[zzh(length)];
            System.arraycopy(this.zzb, 0, dArr, 0, this.zzc);
            this.zzb = dArr;
        }
        double[] dArr2 = this.zzb;
        int i6 = this.zzc;
        this.zzc = i6 + 1;
        dArr2[i6] = d5;
    }

    public final void zzg(int i5) {
        int length = this.zzb.length;
        if (i5 <= length) {
            return;
        }
        if (length == 0) {
            this.zzb = new double[Math.max(i5, 10)];
            return;
        }
        while (length < i5) {
            length = zzh(length);
        }
        this.zzb = Arrays.copyOf(this.zzb, length);
    }

    private zzgt(double[] dArr, int i5, boolean z4) {
        super(z4);
        this.zzb = dArr;
        this.zzc = i5;
    }

    @Override // com.google.android.gms.internal.play_billing.zzfx, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        zzf(((Double) obj).doubleValue());
        return true;
    }
}
