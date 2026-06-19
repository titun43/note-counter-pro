package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public abstract class zziaw extends zziae {
    private static final boolean zza = zziem.zza();
    public static final /* synthetic */ int zzf = 0;
    Object zze;

    private zziaw() {
        throw null;
    }

    public static int zzA(int i5) {
        return (352 - (Integer.numberOfLeadingZeros(i5) * 9)) >>> 6;
    }

    public static int zzB(long j2) {
        return (640 - (Long.numberOfLeadingZeros(j2) * 9)) >>> 6;
    }

    public static int zzC(zzidc zzidcVar) {
        int zzbr = zzidcVar.zzbr();
        return zzA(zzbr) + zzbr;
    }

    public static int zzz(int i5) {
        if (i5 > 4096) {
            return 4096;
        }
        return i5;
    }

    public final void zzD() {
        if (zzb() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    public abstract void zzH(int i5, int i6);

    public abstract void zzI(int i5, int i6);

    public abstract void zzJ(int i5, int i6);

    public abstract void zzK(int i5, int i6);

    public abstract void zzL(int i5, long j2);

    public abstract int zzb();

    public abstract void zzh(int i5, long j2);

    public abstract void zzi(int i5, boolean z4);

    public abstract void zzj(int i5, String str);

    public abstract void zzk(int i5, zzian zzianVar);

    public abstract void zzl(zzian zzianVar);

    public abstract void zzm(byte[] bArr, int i5, int i6);

    public abstract void zzn(int i5, zzidc zzidcVar);

    public abstract void zzo(int i5, zzian zzianVar);

    public abstract void zzp(zzidc zzidcVar);

    public abstract void zzq(byte b2);

    public abstract void zzr(int i5);

    public abstract void zzs(int i5);

    public abstract void zzt(int i5);

    public abstract void zzu(long j2);

    public abstract void zzv(long j2);

    public abstract void zzx(String str);

    public abstract void zzy();

    public /* synthetic */ zziaw(byte[] bArr) {
    }
}
