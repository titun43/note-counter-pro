package com.google.android.gms.internal.ads;

import java.io.InputStream;

/* loaded from: classes.dex */
public abstract class zziaq {
    public static final /* synthetic */ int zze = 0;
    private static volatile int zzf = 100;
    int zza;
    int zzb;
    final int zzc = zzf;
    Object zzd;

    private zziaq() {
    }

    public static zziaq zzF(InputStream inputStream, int i5) {
        if (inputStream != null) {
            return new zziap(inputStream, 4096, null);
        }
        byte[] bArr = zzice.zzb;
        int length = bArr.length;
        return zzG(bArr, 0, 0, false);
    }

    public static zziaq zzG(byte[] bArr, int i5, int i6, boolean z4) {
        zziao zziaoVar = new zziao(bArr, i5, i6, z4, null);
        try {
            zziaoVar.zzz(i6);
            return zziaoVar;
        } catch (zzicg e4) {
            throw new IllegalArgumentException(e4);
        }
    }

    public static int zzK(int i5) {
        return (i5 >>> 1) ^ (-(i5 & 1));
    }

    public static long zzL(long j2) {
        return (j2 >>> 1) ^ (-(1 & j2));
    }

    public static int zzM(int i5, InputStream inputStream) {
        if ((i5 & 128) == 0) {
            return i5;
        }
        int i6 = i5 & 127;
        int i7 = 7;
        while (i7 < 32) {
            int read = inputStream.read();
            if (read == -1) {
                throw new zzicg("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            i6 |= (read & 127) << i7;
            if ((read & 128) == 0) {
                return i6;
            }
            i7 += 7;
        }
        while (i7 < 64) {
            int read2 = inputStream.read();
            if (read2 == -1) {
                throw new zzicg("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            if ((read2 & 128) == 0) {
                return i6;
            }
            i7 += 7;
        }
        throw new zzicg("CodedInputStream encountered a malformed varint.");
    }

    public abstract void zzA(int i5);

    public abstract boolean zzB();

    public abstract int zzC();

    public final void zzH() {
        if (this.zza + this.zzb >= this.zzc) {
            throw new zzicg("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
    }

    public final void zzI() {
        if (this.zzb == 0) {
            zzb(0);
        }
    }

    public final void zzJ() {
        int zza;
        do {
            zza = zza();
            if (zza == 0) {
                return;
            }
            zzH();
            this.zzb++;
            this.zzb--;
        } while (zzc(zza));
    }

    public abstract int zza();

    public abstract void zzb(int i5);

    public abstract boolean zzc(int i5);

    public abstract double zzd();

    public abstract float zze();

    public abstract long zzf();

    public abstract long zzg();

    public abstract int zzh();

    public abstract long zzi();

    public abstract int zzj();

    public abstract boolean zzk();

    public abstract String zzl();

    public abstract String zzm();

    public abstract zzian zzn();

    public abstract int zzo();

    public abstract int zzp();

    public abstract int zzq();

    public abstract long zzr();

    public abstract int zzs();

    public abstract long zzt();

    public abstract int zzz(int i5);

    public /* synthetic */ zziaq(byte[] bArr) {
    }
}
