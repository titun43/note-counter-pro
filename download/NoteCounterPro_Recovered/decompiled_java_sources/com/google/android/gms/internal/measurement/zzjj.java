package com.google.android.gms.internal.measurement;

import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public abstract class zzjj extends zzir {
    private static final Logger zzb = Logger.getLogger(zzjj.class.getName());
    private static final boolean zzc = zzmv.zzx();
    zzjk zza;

    private zzjj() {
    }

    public static int zzA(int i5) {
        if ((i5 & (-128)) == 0) {
            return 1;
        }
        if ((i5 & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i5) == 0) {
            return 3;
        }
        return (i5 & (-268435456)) == 0 ? 4 : 5;
    }

    public static int zzB(long j2) {
        int i5;
        if (((-128) & j2) == 0) {
            return 1;
        }
        if (j2 < 0) {
            return 10;
        }
        if (((-34359738368L) & j2) != 0) {
            j2 >>>= 28;
            i5 = 6;
        } else {
            i5 = 2;
        }
        if (((-2097152) & j2) != 0) {
            i5 += 2;
            j2 >>>= 14;
        }
        return (j2 & (-16384)) != 0 ? i5 + 1 : i5;
    }

    public static zzjj zzC(byte[] bArr) {
        return new zzjg(bArr, 0, bArr.length);
    }

    public static int zzt(zzjb zzjbVar) {
        int zzd = zzjbVar.zzd();
        return zzA(zzd) + zzd;
    }

    @Deprecated
    public static int zzu(int i5, zzlj zzljVar, zzlu zzluVar) {
        int zzA = zzA(i5 << 3);
        int i6 = zzA + zzA;
        zzil zzilVar = (zzil) zzljVar;
        int zzbu = zzilVar.zzbu();
        if (zzbu == -1) {
            zzbu = zzluVar.zza(zzilVar);
            zzilVar.zzbx(zzbu);
        }
        return i6 + zzbu;
    }

    public static int zzv(int i5) {
        if (i5 >= 0) {
            return zzA(i5);
        }
        return 10;
    }

    public static int zzw(zzkp zzkpVar) {
        int zza = zzkpVar.zza();
        return zzA(zza) + zza;
    }

    public static int zzx(zzlj zzljVar, zzlu zzluVar) {
        zzil zzilVar = (zzil) zzljVar;
        int zzbu = zzilVar.zzbu();
        if (zzbu == -1) {
            zzbu = zzluVar.zza(zzilVar);
            zzilVar.zzbx(zzbu);
        }
        return zzA(zzbu) + zzbu;
    }

    public static int zzy(String str) {
        int length;
        try {
            length = zzna.zzc(str);
        } catch (zzmz unused) {
            length = str.getBytes(zzkk.zzb).length;
        }
        return zzA(length) + length;
    }

    public static int zzz(int i5) {
        return zzA(i5 << 3);
    }

    public final void zzD() {
        if (zza() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    public final void zzE(String str, zzmz zzmzVar) {
        zzb.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) zzmzVar);
        byte[] bytes = str.getBytes(zzkk.zzb);
        try {
            int length = bytes.length;
            zzq(length);
            zzl(bytes, 0, length);
        } catch (IndexOutOfBoundsException e4) {
            throw new zzjh(e4);
        }
    }

    public abstract int zza();

    public abstract void zzb(byte b2);

    public abstract void zzd(int i5, boolean z4);

    public abstract void zze(int i5, zzjb zzjbVar);

    public abstract void zzf(int i5, int i6);

    public abstract void zzg(int i5);

    public abstract void zzh(int i5, long j2);

    public abstract void zzi(long j2);

    public abstract void zzj(int i5, int i6);

    public abstract void zzk(int i5);

    public abstract void zzl(byte[] bArr, int i5, int i6);

    public abstract void zzm(int i5, String str);

    public abstract void zzo(int i5, int i6);

    public abstract void zzp(int i5, int i6);

    public abstract void zzq(int i5);

    public abstract void zzr(int i5, long j2);

    public abstract void zzs(long j2);

    public /* synthetic */ zzjj(zzji zzjiVar) {
    }
}
