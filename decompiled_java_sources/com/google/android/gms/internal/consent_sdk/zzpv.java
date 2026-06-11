package com.google.android.gms.internal.consent_sdk;

import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public abstract class zzpv extends zzpe {
    private static final Logger zza = Logger.getLogger(zzpv.class.getName());
    private static final boolean zzb = zzsw.zzx();
    public static final /* synthetic */ int zzf = 0;
    Object zze;

    private zzpv() {
        throw null;
    }

    public static int zzA(zzrq zzrqVar) {
        int zzn = zzrqVar.zzn();
        return zzC(zzn) + zzn;
    }

    public static int zzB(String str) {
        int length;
        try {
            length = zzsy.zzb(str);
        } catch (zzsx unused) {
            length = str.getBytes(zzqs.zza).length;
        }
        return zzC(length) + length;
    }

    public static int zzC(int i5) {
        return (352 - (Integer.numberOfLeadingZeros(i5) * 9)) >>> 6;
    }

    public static int zzD(long j2) {
        return (640 - (Long.numberOfLeadingZeros(j2) * 9)) >>> 6;
    }

    public final void zzE(String str, zzsx zzsxVar) {
        zza.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) zzsxVar);
        byte[] bytes = str.getBytes(zzqs.zza);
        try {
            int length = bytes.length;
            zzw(length);
            zza(bytes, 0, length);
        } catch (IndexOutOfBoundsException e4) {
            throw new zzps(e4);
        }
    }

    public abstract void zzI();

    public abstract void zzJ(byte b2);

    public abstract void zzK(int i5, boolean z4);

    public abstract void zzL(byte[] bArr, int i5, int i6);

    @Override // com.google.android.gms.internal.consent_sdk.zzpe
    public abstract void zza(byte[] bArr, int i5, int i6);

    public abstract int zzb();

    public abstract void zzh(int i5, zzpm zzpmVar);

    public abstract void zzi(zzpm zzpmVar);

    public abstract void zzj(int i5, int i6);

    public abstract void zzk(int i5);

    public abstract void zzl(int i5, long j2);

    public abstract void zzm(long j2);

    public abstract void zzn(int i5, int i6);

    public abstract void zzo(int i5);

    public abstract void zzp(zzrq zzrqVar);

    public abstract void zzq(int i5, zzrq zzrqVar);

    public abstract void zzr(int i5, zzpm zzpmVar);

    public abstract void zzs(int i5, String str);

    public abstract void zzt(String str);

    public abstract void zzu(int i5, int i6);

    public abstract void zzv(int i5, int i6);

    public abstract void zzw(int i5);

    public abstract void zzx(int i5, long j2);

    public abstract void zzy(long j2);

    public /* synthetic */ zzpv(zzpu zzpuVar) {
    }
}
