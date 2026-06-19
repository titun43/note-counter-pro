package com.google.android.gms.internal.measurement;

import androidx.emoji2.text.u;
import com.google.android.gms.ads.RequestConfiguration;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;
import s.c;

/* loaded from: classes.dex */
public abstract class zzjb implements Iterable, Serializable {
    private static final Comparator zza;
    public static final zzjb zzb = new zziy(zzkk.zzd);
    private static final zzja zzd;
    private int zzc = 0;

    static {
        int i5 = zzin.zza;
        zzd = new zzja(null);
        zza = new zzit();
    }

    public static int zzj(int i5, int i6, int i7) {
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

    public static zzjb zzl(byte[] bArr, int i5, int i6) {
        zzj(i5, i5 + i6, bArr.length);
        byte[] bArr2 = new byte[i6];
        System.arraycopy(bArr, i5, bArr2, 0, i6);
        return new zziy(bArr2);
    }

    public static zzjb zzm(String str) {
        return new zziy(str.getBytes(zzkk.zzb));
    }

    public abstract boolean equals(Object obj);

    public final int hashCode() {
        int i5 = this.zzc;
        if (i5 == 0) {
            int zzd2 = zzd();
            i5 = zze(zzd2, 0, zzd2);
            if (i5 == 0) {
                i5 = 1;
            }
            this.zzc = i5;
        }
        return i5;
    }

    @Override // java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new zzis(this);
    }

    public final String toString() {
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int zzd2 = zzd();
        String zza2 = zzd() <= 50 ? zzmj.zza(this) : zzmj.zza(zzf(0, 47)).concat("...");
        StringBuilder sb = new StringBuilder("<ByteString@");
        sb.append(hexString);
        sb.append(" size=");
        sb.append(zzd2);
        sb.append(" contents=\"");
        return c.d(sb, zza2, "\">");
    }

    public abstract byte zza(int i5);

    public abstract byte zzb(int i5);

    public abstract int zzd();

    public abstract int zze(int i5, int i6, int i7);

    public abstract zzjb zzf(int i5, int i6);

    public abstract String zzg(Charset charset);

    public abstract void zzh(zzir zzirVar);

    public abstract boolean zzi();

    public final int zzk() {
        return this.zzc;
    }

    public final String zzn(Charset charset) {
        return zzd() == 0 ? RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED : zzg(charset);
    }
}
