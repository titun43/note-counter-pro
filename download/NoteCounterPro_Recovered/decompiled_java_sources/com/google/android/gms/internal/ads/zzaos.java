package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collections;

/* loaded from: classes.dex */
public final class zzaos implements zzaon {
    private static final float[] zza = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 1.0f};
    private final zzaqf zzb;
    private zzaor zzg;
    private long zzh;
    private String zzi;
    private zzagh zzj;
    private boolean zzk;
    private final boolean[] zzd = new boolean[4];
    private final zzaoq zze = new zzaoq(128);
    private long zzl = -9223372036854775807L;
    private final zzape zzf = new zzape(178, 128);
    private final zzer zzc = new zzer();

    public zzaos(zzaqf zzaqfVar, String str) {
        this.zzb = zzaqfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaon
    public final void zza() {
        zzgm.zzj(this.zzd);
        this.zze.zza();
        zzaor zzaorVar = this.zzg;
        if (zzaorVar != null) {
            zzaorVar.zza();
        }
        this.zzf.zza();
        this.zzh = 0L;
        this.zzl = -9223372036854775807L;
    }

    @Override // com.google.android.gms.internal.ads.zzaon
    public final void zzb(zzaex zzaexVar, zzaqb zzaqbVar) {
        zzaqbVar.zza();
        this.zzi = zzaqbVar.zzc();
        zzagh zzu = zzaexVar.zzu(zzaqbVar.zzb(), 2);
        this.zzj = zzu;
        this.zzg = new zzaor(zzu);
        this.zzb.zza(zzaexVar, zzaqbVar);
    }

    @Override // com.google.android.gms.internal.ads.zzaon
    public final void zzc(long j2, int i5) {
        this.zzl = j2;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01c7 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0195  */
    @Override // com.google.android.gms.internal.ads.zzaon
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzd(zzer zzerVar) {
        int i5;
        zzape zzapeVar;
        int i6;
        int i7;
        this.zzg.getClass();
        this.zzj.getClass();
        int zzg = zzerVar.zzg();
        int zze = zzerVar.zze();
        byte[] zzi = zzerVar.zzi();
        this.zzh += zzerVar.zzd();
        this.zzj.zzc(zzerVar, zzerVar.zzd());
        while (true) {
            int zzi2 = zzgm.zzi(zzi, zzg, zze, this.zzd);
            if (zzi2 == zze) {
                break;
            }
            int i8 = zzi2 + 3;
            int i9 = zzerVar.zzi()[i8] & 255;
            int i10 = zzi2 - zzg;
            if (!this.zzk) {
                if (i10 > 0) {
                    this.zze.zzc(zzi, zzg, zzi2);
                }
                int i11 = i10 < 0 ? -i10 : 0;
                zzaoq zzaoqVar = this.zze;
                if (zzaoqVar.zzb(i9, i11)) {
                    zzagh zzaghVar = this.zzj;
                    int i12 = zzaoqVar.zzb;
                    String str = this.zzi;
                    str.getClass();
                    byte[] copyOf = Arrays.copyOf(zzaoqVar.zzc, zzaoqVar.zza);
                    zzeq zzeqVar = new zzeq(copyOf, copyOf.length);
                    zzeqVar.zzo(i12);
                    zzeqVar.zzo(4);
                    zzeqVar.zzg();
                    zzeqVar.zzh(8);
                    if (zzeqVar.zzi()) {
                        zzeqVar.zzh(4);
                        zzeqVar.zzh(3);
                    }
                    int zzj = zzeqVar.zzj(4);
                    float f5 = 1.0f;
                    i5 = zze;
                    if (zzj == 15) {
                        int zzj2 = zzeqVar.zzj(8);
                        int zzj3 = zzeqVar.zzj(8);
                        if (zzj3 == 0) {
                            zzee.zzc("H263Reader", "Invalid aspect ratio");
                        } else {
                            f5 = zzj2 / zzj3;
                        }
                    } else if (zzj < 7) {
                        f5 = zza[zzj];
                    } else {
                        zzee.zzc("H263Reader", "Invalid aspect ratio");
                    }
                    float f6 = f5;
                    if (zzeqVar.zzi()) {
                        zzeqVar.zzh(2);
                        zzeqVar.zzh(1);
                        if (zzeqVar.zzi()) {
                            zzeqVar.zzh(15);
                            zzeqVar.zzg();
                            zzeqVar.zzh(15);
                            zzeqVar.zzg();
                            zzeqVar.zzh(15);
                            zzeqVar.zzg();
                            zzeqVar.zzh(3);
                            zzeqVar.zzh(11);
                            zzeqVar.zzg();
                            zzeqVar.zzh(15);
                            zzeqVar.zzg();
                            i7 = 2;
                            if (zzeqVar.zzj(i7) != 0) {
                                zzee.zzc("H263Reader", "Unhandled video object layer shape");
                            }
                            zzeqVar.zzg();
                            int zzj4 = zzeqVar.zzj(16);
                            zzeqVar.zzg();
                            if (zzeqVar.zzi()) {
                                if (zzj4 == 0) {
                                    zzee.zzc("H263Reader", "Invalid vop_increment_time_resolution");
                                } else {
                                    int i13 = zzj4 - 1;
                                    int i14 = 0;
                                    while (i13 > 0) {
                                        i13 >>= 1;
                                        i14++;
                                    }
                                    zzeqVar.zzh(i14);
                                }
                            }
                            zzeqVar.zzg();
                            int zzj5 = zzeqVar.zzj(13);
                            zzeqVar.zzg();
                            int zzj6 = zzeqVar.zzj(13);
                            zzeqVar.zzg();
                            zzeqVar.zzg();
                            zzt zztVar = new zzt();
                            zztVar.zza(str);
                            zztVar.zzl("video/mp2t");
                            zztVar.zzm("video/mp4v-es");
                            zztVar.zzt(zzj5);
                            zztVar.zzu(zzj6);
                            zztVar.zzz(f6);
                            zztVar.zzp(Collections.singletonList(copyOf));
                            zzaghVar.zzz(zztVar.zzM());
                            this.zzk = true;
                            this.zzg.zzc(zzi, zzg, zzi2);
                            zzapeVar = this.zzf;
                            if (i10 > 0) {
                                zzapeVar.zzd(zzi, zzg, zzi2);
                                i6 = 0;
                            } else {
                                i6 = -i10;
                            }
                            if (zzapeVar.zze(i6)) {
                                int zza2 = zzgm.zza(zzapeVar.zza, zzapeVar.zzb);
                                zzer zzerVar2 = this.zzc;
                                String str2 = zzfj.zza;
                                zzerVar2.zzb(zzapeVar.zza, zza2);
                                this.zzb.zzb(this.zzl, zzerVar2);
                            }
                            if (i9 == 178) {
                                if (zzerVar.zzi()[zzi2 + 2] == 1) {
                                    zzapeVar.zzc(178);
                                }
                                i9 = 178;
                            }
                            int i15 = i5 - zzi2;
                            this.zzg.zzd(this.zzh - i15, i15, this.zzk);
                            this.zzg.zzb(i9, this.zzl);
                            zzg = i8;
                            zze = i5;
                        }
                    }
                    i7 = 2;
                    if (zzeqVar.zzj(i7) != 0) {
                    }
                    zzeqVar.zzg();
                    int zzj42 = zzeqVar.zzj(16);
                    zzeqVar.zzg();
                    if (zzeqVar.zzi()) {
                    }
                    zzeqVar.zzg();
                    int zzj52 = zzeqVar.zzj(13);
                    zzeqVar.zzg();
                    int zzj62 = zzeqVar.zzj(13);
                    zzeqVar.zzg();
                    zzeqVar.zzg();
                    zzt zztVar2 = new zzt();
                    zztVar2.zza(str);
                    zztVar2.zzl("video/mp2t");
                    zztVar2.zzm("video/mp4v-es");
                    zztVar2.zzt(zzj52);
                    zztVar2.zzu(zzj62);
                    zztVar2.zzz(f6);
                    zztVar2.zzp(Collections.singletonList(copyOf));
                    zzaghVar.zzz(zztVar2.zzM());
                    this.zzk = true;
                    this.zzg.zzc(zzi, zzg, zzi2);
                    zzapeVar = this.zzf;
                    if (i10 > 0) {
                    }
                    if (zzapeVar.zze(i6)) {
                    }
                    if (i9 == 178) {
                    }
                    int i152 = i5 - zzi2;
                    this.zzg.zzd(this.zzh - i152, i152, this.zzk);
                    this.zzg.zzb(i9, this.zzl);
                    zzg = i8;
                    zze = i5;
                }
            }
            i5 = zze;
            this.zzg.zzc(zzi, zzg, zzi2);
            zzapeVar = this.zzf;
            if (i10 > 0) {
            }
            if (zzapeVar.zze(i6)) {
            }
            if (i9 == 178) {
            }
            int i1522 = i5 - zzi2;
            this.zzg.zzd(this.zzh - i1522, i1522, this.zzk);
            this.zzg.zzb(i9, this.zzl);
            zzg = i8;
            zze = i5;
        }
        if (!this.zzk) {
            this.zze.zzc(zzi, zzg, zze);
        }
        this.zzg.zzc(zzi, zzg, zze);
        this.zzf.zzd(zzi, zzg, zze);
    }

    @Override // com.google.android.gms.internal.ads.zzaon
    public final void zze(boolean z4) {
        zzaor zzaorVar = this.zzg;
        zzaorVar.getClass();
        if (z4) {
            zzaorVar.zzd(this.zzh, 0, this.zzk);
            this.zzg.zza();
        }
    }
}
