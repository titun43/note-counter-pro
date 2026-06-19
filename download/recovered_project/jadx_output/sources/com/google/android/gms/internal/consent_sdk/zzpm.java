package com.google.android.gms.internal.consent_sdk;

import androidx.emoji2.text.u;
import java.io.Serializable;
import java.util.Iterator;
import java.util.Locale;
import s.c;

/* loaded from: classes.dex */
public abstract class zzpm implements Iterable, Serializable {
    public static final zzpm zzb = new zzpk(zzqs.zzb);
    private int zza = 0;

    static {
        int i5 = zzpc.zza;
    }

    public static int zzi(int i5, int i6, int i7) {
        if (((i7 - 47) | 47) >= 0) {
            return 47;
        }
        throw new IndexOutOfBoundsException(u.h(i7, "End index: 47 >= "));
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzpm)) {
            return false;
        }
        zzpm zzpmVar = (zzpm) obj;
        int zzd = zzd();
        if (zzd != zzpmVar.zzd()) {
            return false;
        }
        if (zzd == 0) {
            return true;
        }
        int i5 = this.zza;
        int i6 = zzpmVar.zza;
        if (i5 == 0 || i6 == 0 || i5 == i6) {
            return zzh(zzpmVar);
        }
        return false;
    }

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
        return new zzpf(this);
    }

    public final String toString() {
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int zzd = zzd();
        String zza = zzd() <= 50 ? zzsk.zza(this) : zzsk.zza(zzf(0, 47)).concat("...");
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

    public abstract zzpm zzf(int i5, int i6);

    public abstract void zzg(zzpe zzpeVar);

    public abstract boolean zzh(zzpm zzpmVar);
}
