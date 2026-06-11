package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class zzagu implements zzagq {
    public final int zza;
    public final int zzb;
    public final int zzc;

    private zzagu(int i5, int i6, int i7, int i8) {
        this.zza = i5;
        this.zzb = i6;
        this.zzc = i7;
    }

    public static zzagu zzb(zzer zzerVar) {
        int zzC = zzerVar.zzC();
        zzerVar.zzk(8);
        int zzC2 = zzerVar.zzC();
        int zzC3 = zzerVar.zzC();
        zzerVar.zzk(4);
        int zzC4 = zzerVar.zzC();
        zzerVar.zzk(12);
        return new zzagu(zzC, zzC2, zzC3, zzC4);
    }

    @Override // com.google.android.gms.internal.ads.zzagq
    public final int zza() {
        return 1751742049;
    }
}
