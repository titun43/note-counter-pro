package com.google.android.gms.internal.ads;

import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes.dex */
public final class zzcu implements zzco {
    private int zzb;
    private float zzc = 1.0f;
    private float zzd = 1.0f;
    private zzcl zze;
    private zzcl zzf;
    private zzcl zzg;
    private zzcl zzh;
    private boolean zzi;
    private zzct zzj;
    private ByteBuffer zzk;
    private ByteBuffer zzl;
    private long zzm;
    private long zzn;
    private boolean zzo;

    public zzcu() {
        zzcl zzclVar = zzcl.zza;
        this.zze = zzclVar;
        this.zzf = zzclVar;
        this.zzg = zzclVar;
        this.zzh = zzclVar;
        ByteBuffer byteBuffer = zzco.zza;
        this.zzk = byteBuffer;
        this.zzl = byteBuffer;
        this.zzb = -1;
    }

    @Override // com.google.android.gms.internal.ads.zzco
    public final long zza(long j2) {
        if (this.zzn < 1024) {
            return (long) (j2 / this.zzc);
        }
        long j5 = this.zzm;
        this.zzj.getClass();
        long zza = j5 - r2.zza();
        int i5 = this.zzh.zzb;
        int i6 = this.zzg.zzb;
        return i5 == i6 ? zzfj.zzt(j2, this.zzn, zza, RoundingMode.DOWN) : zzfj.zzt(j2, this.zzn * i6, zza * i5, RoundingMode.DOWN);
    }

    @Override // com.google.android.gms.internal.ads.zzco
    public final zzcl zzb(zzcl zzclVar) {
        int i5 = zzclVar.zzd;
        if (i5 != 2 && i5 != 4) {
            throw new zzcn("Unhandled input format:", zzclVar);
        }
        int i6 = this.zzb;
        if (i6 == -1) {
            i6 = zzclVar.zzb;
        }
        this.zze = zzclVar;
        zzcl zzclVar2 = new zzcl(i6, zzclVar.zzc, i5);
        this.zzf = zzclVar2;
        this.zzi = true;
        return zzclVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzco
    public final boolean zzc() {
        if (this.zzf.zzb != -1) {
            return Math.abs(this.zzc + (-1.0f)) >= 1.0E-4f || Math.abs(this.zzd + (-1.0f)) >= 1.0E-4f || this.zzf.zzb != this.zze.zzb;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzco
    public final void zzd(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            zzct zzctVar = this.zzj;
            zzctVar.getClass();
            this.zzm += byteBuffer.remaining();
            zzctVar.zzb(byteBuffer);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzco
    public final void zze() {
        zzct zzctVar = this.zzj;
        if (zzctVar != null) {
            zzctVar.zzd();
        }
        this.zzo = true;
    }

    @Override // com.google.android.gms.internal.ads.zzco
    public final ByteBuffer zzf() {
        int zzf;
        zzct zzctVar = this.zzj;
        if (zzctVar != null && (zzf = zzctVar.zzf()) > 0) {
            if (this.zzk.capacity() < zzf) {
                this.zzk = ByteBuffer.allocateDirect(zzf).order(ByteOrder.nativeOrder());
            } else {
                this.zzk.clear();
            }
            zzctVar.zzc(this.zzk);
            this.zzk.flip();
            this.zzn += zzf;
            this.zzl = this.zzk;
        }
        ByteBuffer byteBuffer = this.zzl;
        this.zzl = zzco.zza;
        return byteBuffer;
    }

    @Override // com.google.android.gms.internal.ads.zzco
    public final boolean zzg() {
        if (!this.zzo) {
            return false;
        }
        zzct zzctVar = this.zzj;
        return zzctVar == null || zzctVar.zzf() == 0;
    }

    @Override // com.google.android.gms.internal.ads.zzco
    public final void zzi(zzcm zzcmVar) {
        if (zzc()) {
            zzcl zzclVar = this.zze;
            this.zzg = zzclVar;
            zzcl zzclVar2 = this.zzf;
            this.zzh = zzclVar2;
            if (this.zzi) {
                this.zzj = new zzct(zzclVar.zzb, zzclVar.zzc, this.zzc, this.zzd, zzclVar2.zzb, zzclVar.zzd == 4);
            } else {
                zzct zzctVar = this.zzj;
                if (zzctVar != null) {
                    zzctVar.zze();
                }
            }
        }
        this.zzl = zzco.zza;
        this.zzm = 0L;
        this.zzn = 0L;
        this.zzo = false;
    }

    @Override // com.google.android.gms.internal.ads.zzco
    public final void zzj() {
        this.zzc = 1.0f;
        this.zzd = 1.0f;
        zzcl zzclVar = zzcl.zza;
        this.zze = zzclVar;
        this.zzf = zzclVar;
        this.zzg = zzclVar;
        this.zzh = zzclVar;
        ByteBuffer byteBuffer = zzco.zza;
        this.zzk = byteBuffer;
        this.zzl = byteBuffer;
        this.zzb = -1;
        this.zzi = false;
        this.zzj = null;
        this.zzm = 0L;
        this.zzn = 0L;
        this.zzo = false;
    }

    public final void zzk(float f5) {
        zzgrc.zza(f5 > 0.0f);
        if (this.zzc != f5) {
            this.zzc = f5;
            this.zzi = true;
        }
    }

    public final void zzl(float f5) {
        zzgrc.zza(f5 > 0.0f);
        if (this.zzd != f5) {
            this.zzd = f5;
            this.zzi = true;
        }
    }

    public final long zzm(long j2) {
        if (this.zzn < 1024) {
            return (long) (this.zzc * j2);
        }
        long j5 = this.zzm;
        this.zzj.getClass();
        long zza = j5 - r2.zza();
        int i5 = this.zzh.zzb;
        int i6 = this.zzg.zzb;
        return i5 == i6 ? zzfj.zzt(j2, zza, this.zzn, RoundingMode.DOWN) : zzfj.zzt(j2, zza * i5, this.zzn * i6, RoundingMode.DOWN);
    }
}
