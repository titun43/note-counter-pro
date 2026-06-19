package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public interface zzml extends zzmg {
    String zzS();

    default long zzT(long j2, long j5) {
        if (zze() == 1) {
            return (zzY() || zzZ()) ? 1000000L : 10000L;
        }
        return 10000L;
    }

    default boolean zzU(long j2) {
        return false;
    }

    default void zzV(float f5, float f6) {
    }

    default void zzW() {
    }

    void zzX(long j2, long j5);

    boolean zzY();

    boolean zzZ();

    int zza();

    zzmn zzb();

    void zzc(int i5, zzpq zzpqVar, zzdn zzdnVar);

    void zzcT();

    void zzcU(zzv[] zzvVarArr, zzyc zzycVar, long j2, long j5, zzwk zzwkVar);

    zzyc zzcV();

    boolean zzcW();

    zzlm zzd();

    int zze();

    void zzf(zzmo zzmoVar, zzv[] zzvVarArr, zzyc zzycVar, long j2, boolean z4, boolean z5, long j5, long j6, zzwk zzwkVar);

    long zzk();

    void zzl();

    boolean zzm();

    void zzn();

    void zzo(zzbf zzbfVar);

    void zzp(long j2, boolean z4);

    void zzq();

    void zzr();

    void zzs();

    default void zzt() {
    }
}
