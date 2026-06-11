package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: classes.dex */
final class zzgis {
    private final zzgmu zza;
    private final zzgkg zzb;
    private final zzgkx zzc;
    private final zzgoe zzd;
    private final zzgcl zze;
    private final boolean zzf;
    private final long zzg;
    private final long zzh;

    public zzgis(zzgmu zzgmuVar, zzgkg zzgkgVar, zzgkx zzgkxVar, zzgoe zzgoeVar, zzgcl zzgclVar, boolean z4, long j2, long j5) {
        this.zza = zzgmuVar;
        this.zzb = zzgkgVar;
        this.zzc = zzgkxVar;
        this.zzd = zzgoeVar;
        this.zze = zzgclVar;
        this.zzf = z4;
        this.zzg = j2;
        this.zzh = j5;
    }

    private final j3.a zzh(final int i5) {
        zzgzg zzgzgVar = (zzgzg) zzgzo.zzg((zzgzg) zzgzo.zzg((zzgzg) zzgzo.zzg((zzgzg) zzgzo.zzk((zzgzg) zzgzo.zzj((zzgzg) zzgzo.zzk(zzgzg.zzw(this.zzb.zza()), new zzgqt() { // from class: com.google.android.gms.internal.ads.zzgij
            @Override // com.google.android.gms.internal.ads.zzgqt
            public final /* synthetic */ Object apply(Object obj) {
                zzgds zzgdsVar = (zzgds) obj;
                zzgis.this.zzd(zzgdsVar);
                return zzgdsVar;
            }
        }, zzhaf.zza()), new zzgyw() { // from class: com.google.android.gms.internal.ads.zzgik
            @Override // com.google.android.gms.internal.ads.zzgyw
            public final /* synthetic */ j3.a zza(Object obj) {
                return zzgis.this.zze((zzgds) obj);
            }
        }, zzhaf.zza()), zzgil.zza, zzhaf.zza()), zzgie.class, zzgim.zza, zzhaf.zza()), zzgif.class, zzgin.zza, zzhaf.zza()), zzgid.class, new zzgqt() { // from class: com.google.android.gms.internal.ads.zzgio
            @Override // com.google.android.gms.internal.ads.zzgqt
            public final /* synthetic */ Object apply(Object obj) {
                return zzgis.this.zzf(i5, (zzgid) obj);
            }
        }, zzhaf.zza());
        this.zzd.zze(1002, zzgzgVar);
        return zzgzgVar;
    }

    public final void zza(long j2) {
        if (j2 > 0) {
            this.zze.zza(new Runnable() { // from class: com.google.android.gms.internal.ads.zzgiq
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzgis.this.zzb();
                }
            }, j2);
        } else {
            zzb();
        }
    }

    public final j3.a zzb() {
        zzgzg zzgzgVar = (zzgzg) zzgzo.zzg(zzgzg.zzw(this.zzc.zzb()), Throwable.class, zzgih.zza, zzhaf.zza());
        final zzgmu zzgmuVar = this.zza;
        Objects.requireNonNull(zzgmuVar);
        return (zzgzg) zzgzo.zzj((zzgzg) zzgzo.zzk(zzgzgVar, new zzgqt() { // from class: com.google.android.gms.internal.ads.zzgig
            @Override // com.google.android.gms.internal.ads.zzgqt
            public final /* synthetic */ Object apply(Object obj) {
                return new Boolean(zzgmu.this.zza((zzgdu) obj));
            }
        }, zzhaf.zza()), new zzgyw() { // from class: com.google.android.gms.internal.ads.zzgii
            @Override // com.google.android.gms.internal.ads.zzgyw
            public final /* synthetic */ j3.a zza(Object obj) {
                return zzgis.this.zzc((Boolean) obj);
            }
        }, zzhaf.zza());
    }

    public final /* synthetic */ j3.a zzc(Boolean bool) {
        if (bool.booleanValue()) {
            return zzh(0);
        }
        this.zzd.zzb(1003);
        return zzgzo.zza(zzgir.RESULT_NOOP_LOCAL_PROGRAM_STILL_VALID);
    }

    public final /* synthetic */ zzgds zzd(zzgds zzgdsVar) {
        int zzj = zzgdsVar.zzj() - 1;
        if (zzj == 1 || zzj == 2) {
            return zzgdsVar;
        }
        if (zzj == 3) {
            zzgoe zzgoeVar = this.zzd;
            int zzj2 = zzgdsVar.zzj() - 1;
            StringBuilder sb = new StringBuilder(String.valueOf(zzj2).length());
            sb.append(zzj2);
            zzgoeVar.zzc(1004, sb.toString());
            throw new zzgif(zzgdsVar.zzj() - 1);
        }
        if (zzj != 12) {
            zzgoe zzgoeVar2 = this.zzd;
            int zzj3 = zzgdsVar.zzj() - 1;
            StringBuilder sb2 = new StringBuilder(String.valueOf(zzj3).length());
            sb2.append(zzj3);
            zzgoeVar2.zzc(1005, sb2.toString());
            throw new zzgie(zzgdsVar.zzj() - 1);
        }
        zzgoe zzgoeVar3 = this.zzd;
        int zzj4 = zzgdsVar.zzj() - 1;
        StringBuilder sb3 = new StringBuilder(String.valueOf(zzj4).length());
        sb3.append(zzj4);
        zzgoeVar3.zzc(1005, sb3.toString());
        throw new zzgid(zzgdsVar.zzj() - 1);
    }

    public final /* synthetic */ j3.a zze(zzgds zzgdsVar) {
        if (zzgdsVar.zzj() == 2) {
            return this.zzc.zzd(zzgdsVar.zza(), zzgdsVar.zzb().zzy());
        }
        if (zzgdsVar.zzj() == 3) {
            return this.zzc.zzc(zzgdsVar.zza(), zzgdsVar.zzc().zzy(), zzgdsVar.zzb().zzy());
        }
        throw new AssertionError("Unreachable");
    }

    public final /* synthetic */ zzgir zzf(final int i5, zzgid zzgidVar) {
        if (this.zzf && i5 < this.zzg) {
            this.zze.zza(new Runnable() { // from class: com.google.android.gms.internal.ads.zzgip
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzgis.this.zzg(i5);
                }
            }, this.zzh * ((long) Math.pow(2.0d, i5)));
        }
        return zzgir.RESULT_FAILURE_FETCHER_HTTP_RUNTIME_EXCEPTION;
    }

    public final /* synthetic */ void zzg(int i5) {
        zzh(i5 + 1);
    }
}
