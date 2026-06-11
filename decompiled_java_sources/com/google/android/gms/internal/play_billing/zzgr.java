package com.google.android.gms.internal.play_billing;

import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public abstract class zzgr extends zzgc {
    private static final Logger zzb = Logger.getLogger(zzgr.class.getName());
    private static final boolean zzc = zzjq.zzx();
    zzgs zza;

    private zzgr() {
        throw null;
    }

    public static int zzA(long j2) {
        return (640 - (Long.numberOfLeadingZeros(j2) * 9)) >>> 6;
    }

    @Deprecated
    public static int zzw(int i5, zzim zzimVar, zzix zzixVar) {
        int zzz = zzz(i5 << 3);
        return ((zzfv) zzimVar).zze(zzixVar) + zzz + zzz;
    }

    public static int zzx(zzim zzimVar, zzix zzixVar) {
        int zze = ((zzfv) zzimVar).zze(zzixVar);
        return zzz(zze) + zze;
    }

    public static int zzy(String str) {
        int length;
        try {
            length = zzjt.zzc(str);
        } catch (zzjs unused) {
            length = str.getBytes(zzhp.zza).length;
        }
        return zzz(length) + length;
    }

    public static int zzz(int i5) {
        return (352 - (Integer.numberOfLeadingZeros(i5) * 9)) >>> 6;
    }

    public final void zzB() {
        if (zza() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    public final void zzC(String str, zzjs zzjsVar) {
        zzb.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) zzjsVar);
        byte[] bytes = str.getBytes(zzhp.zza);
        try {
            int length = bytes.length;
            zzt(length);
            zzl(bytes, 0, length);
        } catch (IndexOutOfBoundsException e4) {
            throw new zzgp(e4);
        }
    }

    public abstract int zza();

    public abstract void zzb(byte b2);

    public abstract void zzd(int i5, boolean z4);

    public abstract void zze(int i5, zzgk zzgkVar);

    public abstract void zzf(int i5, int i6);

    public abstract void zzg(int i5);

    public abstract void zzh(int i5, long j2);

    public abstract void zzi(long j2);

    public abstract void zzj(int i5, int i6);

    public abstract void zzk(int i5);

    public abstract void zzl(byte[] bArr, int i5, int i6);

    public abstract void zzm(int i5, zzim zzimVar, zzix zzixVar);

    public abstract void zzn(int i5, zzim zzimVar);

    public abstract void zzo(int i5, zzgk zzgkVar);

    public abstract void zzp(int i5, String str);

    public abstract void zzr(int i5, int i6);

    public abstract void zzs(int i5, int i6);

    public abstract void zzt(int i5);

    public abstract void zzu(int i5, long j2);

    public abstract void zzv(long j2);

    public /* synthetic */ zzgr(zzgq zzgqVar) {
    }
}
