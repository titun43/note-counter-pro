package com.google.android.gms.internal.play_billing;

import androidx.emoji2.text.u;
import java.io.Serializable;
import java.util.Iterator;
import java.util.Locale;
import s.c;

/* loaded from: classes.dex */
public abstract class zzgk implements Iterable, Serializable {
    public static final zzgk zzb = new zzgi(zzhp.zzb);
    private int zza = 0;

    static {
        int i5 = zzfy.zza;
    }

    public static int zzh(int i5, int i6, int i7) {
        int i8 = i6 - i5;
        if ((i5 | i6 | i8 | (i7 - i6)) >= 0) {
            return i8;
        }
        if (i5 < 0) {
            throw new IndexOutOfBoundsException(u.i(i5, "Beginning index: ", " < 0"));
        }
        if (i6 < i5) {
            throw new IndexOutOfBoundsException(u.g(i5, i6, "Beginning index larger than ending index: ", ", "));
        }
        throw new IndexOutOfBoundsException(u.g(i6, i7, "End index: ", " >= "));
    }

    public static zzgk zzj(byte[] bArr, int i5, int i6) {
        zzh(i5, i5 + i6, bArr.length);
        byte[] bArr2 = new byte[i6];
        System.arraycopy(bArr, i5, bArr2, 0, i6);
        return new zzgi(bArr2);
    }

    public abstract boolean equals(Object obj);

    public final int hashCode() {
        int i5 = this.zza;
        if (i5 == 0) {
            int zzd = zzd();
            i5 = zze(zzd, 0, zzd);
            if (i5 == 0) {
                i5 = 1;
            }
            this.zza = i5;
        }
        return i5;
    }

    @Override // java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new zzgd(this);
    }

    public final String toString() {
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int zzd = zzd();
        String zza = zzd() <= 50 ? zzjh.zza(this) : zzjh.zza(zzf(0, 47)).concat("...");
        StringBuilder sb = new StringBuilder("<ByteString@");
        sb.append(hexString);
        sb.append(" size=");
        sb.append(zzd);
        sb.append(" contents=\"");
        return c.d(sb, zza, "\">");
    }

    public abstract byte zza(int i5);

    public abstract byte zzb(int i5);

    public abstract int zzd();

    public abstract int zze(int i5, int i6, int i7);

    public abstract zzgk zzf(int i5, int i6);

    public abstract void zzg(zzgc zzgcVar);

    public final int zzi() {
        return this.zza;
    }
}
