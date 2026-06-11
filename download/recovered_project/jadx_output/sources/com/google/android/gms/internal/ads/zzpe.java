package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: classes.dex */
final class zzpe {
    final /* synthetic */ zzpf zza;
    private final String zzb;
    private int zzc;
    private long zzd;
    private zzwk zze;
    private boolean zzf;
    private boolean zzg;

    public zzpe(zzpf zzpfVar, String str, int i5, zzwk zzwkVar) {
        Objects.requireNonNull(zzpfVar);
        this.zza = zzpfVar;
        this.zzb = str;
        this.zzc = i5;
        this.zzd = zzwkVar == null ? -1L : zzwkVar.zzd;
        if (zzwkVar == null || !zzwkVar.zzb()) {
            return;
        }
        this.zze = zzwkVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000e, code lost:
    
        if (r0 < r9.zza()) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean zza(zzbf zzbfVar, zzbf zzbfVar2) {
        int i5 = this.zzc;
        if (i5 < zzbfVar.zza()) {
            zzpf zzpfVar = this.zza;
            zzbfVar.zzb(i5, zzpfVar.zzj(), 0L);
            for (int i6 = zzpfVar.zzj().zzn; i6 <= zzpfVar.zzj().zzo; i6++) {
                int zze = zzbfVar2.zze(zzbfVar.zzf(i6));
                if (zze != -1) {
                    i5 = zzbfVar2.zzd(zze, zzpfVar.zzk(), false).zzc;
                    break;
                }
            }
            i5 = -1;
        }
        this.zzc = i5;
        if (i5 == -1) {
            return false;
        }
        zzwk zzwkVar = this.zze;
        return zzwkVar == null || zzbfVar2.zze(zzwkVar.zza) != -1;
    }

    public final boolean zzb(int i5, zzwk zzwkVar) {
        if (zzwkVar != null) {
            long j2 = zzwkVar.zzd;
            if (j2 != -1) {
                zzwk zzwkVar2 = this.zze;
                return zzwkVar2 == null ? !zzwkVar.zzb() && j2 == this.zzd : j2 == zzwkVar2.zzd && zzwkVar.zzb == zzwkVar2.zzb && zzwkVar.zzc == zzwkVar2.zzc;
            }
        }
        return i5 == this.zzc;
    }

    public final void zzc(int i5, zzwk zzwkVar) {
        if (this.zzd == -1 && i5 == this.zzc && zzwkVar != null) {
            zzpf zzpfVar = this.zza;
            long j2 = zzwkVar.zzd;
            if (j2 >= zzpfVar.zzi()) {
                this.zzd = j2;
            }
        }
    }

    public final boolean zzd(zzmy zzmyVar) {
        zzwk zzwkVar = zzmyVar.zzd;
        if (zzwkVar == null) {
            return this.zzc != zzmyVar.zzc;
        }
        long j2 = this.zzd;
        if (j2 == -1) {
            return false;
        }
        long j5 = zzwkVar.zzd;
        if (j5 > j2) {
            return true;
        }
        if (this.zze == null) {
            return false;
        }
        zzbf zzbfVar = zzmyVar.zzb;
        int zze = zzbfVar.zze(zzwkVar.zza);
        int zze2 = zzbfVar.zze(this.zze.zza);
        zzwk zzwkVar2 = this.zze;
        if (j5 < zzwkVar2.zzd || zze < zze2) {
            return false;
        }
        if (zze > zze2) {
            return true;
        }
        if (!zzwkVar.zzb()) {
            int i5 = zzwkVar.zze;
            return i5 == -1 || i5 > zzwkVar2.zzb;
        }
        int i6 = zzwkVar.zzb;
        int i7 = zzwkVar.zzc;
        int i8 = zzwkVar2.zzb;
        if (i6 <= i8) {
            return i6 == i8 && i7 > zzwkVar2.zzc;
        }
        return true;
    }

    public final /* synthetic */ String zze() {
        return this.zzb;
    }

    public final /* synthetic */ int zzf() {
        return this.zzc;
    }

    public final /* synthetic */ long zzg() {
        return this.zzd;
    }

    public final /* synthetic */ zzwk zzh() {
        return this.zze;
    }

    public final /* synthetic */ boolean zzi() {
        return this.zzf;
    }

    public final /* synthetic */ void zzj(boolean z4) {
        this.zzf = true;
    }

    public final /* synthetic */ boolean zzk() {
        return this.zzg;
    }

    public final /* synthetic */ void zzl(boolean z4) {
        this.zzg = true;
    }
}
