package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class zzte extends zzcp {
    private int zzd;
    private int zze;
    private boolean zzf;
    private int zzg;
    private byte[] zzh = zzfj.zzb;
    private int zzi;
    private long zzj;

    @Override // com.google.android.gms.internal.ads.zzco
    public final long zza(long j2) {
        return Math.max(0L, j2 - zzfj.zzr(this.zze + this.zzd, this.zzb.zzb));
    }

    @Override // com.google.android.gms.internal.ads.zzco
    public final void zzd(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i5 = limit - position;
        if (i5 == 0) {
            return;
        }
        int min = Math.min(i5, this.zzg);
        this.zzj += min / this.zzb.zze;
        this.zzg -= min;
        byteBuffer.position(position + min);
        if (this.zzg <= 0) {
            int i6 = i5 - min;
            int length = (this.zzi + i6) - this.zzh.length;
            ByteBuffer zzk = zzk(length);
            int i7 = this.zzi;
            String str = zzfj.zza;
            int max = Math.max(0, Math.min(length, i7));
            zzk.put(this.zzh, 0, max);
            int max2 = Math.max(0, Math.min(length - max, i6));
            byteBuffer.limit(byteBuffer.position() + max2);
            zzk.put(byteBuffer);
            byteBuffer.limit(limit);
            int i8 = i6 - max2;
            int i9 = this.zzi - max;
            this.zzi = i9;
            byte[] bArr = this.zzh;
            System.arraycopy(bArr, max, bArr, 0, i9);
            byteBuffer.get(this.zzh, this.zzi, i8);
            this.zzi += i8;
            zzk.flip();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcp, com.google.android.gms.internal.ads.zzco
    public final ByteBuffer zzf() {
        int i5;
        if (super.zzg() && (i5 = this.zzi) > 0) {
            zzk(i5).put(this.zzh, 0, this.zzi).flip();
            this.zzi = 0;
        }
        return super.zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzcp, com.google.android.gms.internal.ads.zzco
    public final boolean zzg() {
        return super.zzg() && this.zzi == 0;
    }

    @Override // com.google.android.gms.internal.ads.zzcp
    public final zzcl zzm(zzcl zzclVar) {
        if (!zzfj.zzA(zzclVar.zzd)) {
            throw new zzcn("Unhandled input format:", zzclVar);
        }
        this.zzf = true;
        return (this.zzd == 0 && this.zze == 0) ? zzcl.zza : zzclVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcp
    public final void zzn() {
        if (this.zzf) {
            if (this.zzi > 0) {
                this.zzj += r0 / this.zzb.zze;
            }
            this.zzi = 0;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcp
    public final void zzo() {
        if (this.zzf) {
            this.zzf = false;
            int i5 = this.zze;
            int i6 = this.zzb.zze;
            this.zzh = new byte[i5 * i6];
            this.zzg = this.zzd * i6;
        }
        this.zzi = 0;
    }

    @Override // com.google.android.gms.internal.ads.zzcp
    public final void zzp() {
        this.zzh = zzfj.zzb;
    }

    public final void zzq(int i5, int i6) {
        this.zzd = i5;
        this.zze = i6;
    }

    public final void zzr() {
        this.zzj = 0L;
    }

    public final long zzs() {
        return this.zzj;
    }
}
