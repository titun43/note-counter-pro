package com.google.android.gms.internal.ads;

import androidx.emoji2.text.u;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Arrays;

/* loaded from: classes.dex */
final class zzial extends zziak {
    private final byte[] zzb;

    public zzial(byte[] bArr) {
        super(null);
        bArr.getClass();
        this.zzb = bArr;
    }

    @Override // com.google.android.gms.internal.ads.zzian
    public final byte zza(int i5) {
        return this.zzb[i5];
    }

    @Override // com.google.android.gms.internal.ads.zzian
    public final byte zzb(int i5) {
        return this.zzb[i5];
    }

    @Override // com.google.android.gms.internal.ads.zzian
    public final int zzc() {
        return this.zzb.length;
    }

    @Override // com.google.android.gms.internal.ads.zzian
    public final zzian zzd(int i5, int i6) {
        byte[] bArr = this.zzb;
        int zzC = zzian.zzC(i5, i6, bArr.length);
        return zzC == 0 ? zzian.zza : new zziah(bArr, i5, zzC);
    }

    @Override // com.google.android.gms.internal.ads.zzian
    public final void zze(byte[] bArr, int i5, int i6, int i7) {
        System.arraycopy(this.zzb, i5, bArr, i6, i7);
    }

    @Override // com.google.android.gms.internal.ads.zzian
    public final ByteBuffer zzf() {
        return ByteBuffer.wrap(this.zzb).asReadOnlyBuffer();
    }

    @Override // com.google.android.gms.internal.ads.zzian
    public final void zzg(zziae zziaeVar) {
        byte[] bArr = this.zzb;
        zziaeVar.zza(bArr, 0, bArr.length);
    }

    @Override // com.google.android.gms.internal.ads.zzian
    public final String zzh(Charset charset) {
        return new String(this.zzb, charset);
    }

    @Override // com.google.android.gms.internal.ads.zzian
    public final boolean zzi() {
        return zzier.zza(this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzian
    public final boolean zzj(zzian zzianVar) {
        return zzianVar instanceof zzial ? Arrays.equals(this.zzb, ((zzial) zzianVar).zzb) : zzianVar instanceof zziah ? zzk(zzianVar, 0, this.zzb.length) : zzianVar.zzj(this);
    }

    @Override // com.google.android.gms.internal.ads.zziak
    public final boolean zzk(zzian zzianVar, int i5, int i6) {
        if (i6 > zzianVar.zzc()) {
            byte[] bArr = this.zzb;
            int length = String.valueOf(i6).length();
            int length2 = bArr.length;
            StringBuilder sb = new StringBuilder(length + 18 + String.valueOf(length2).length());
            sb.append("Length too large: ");
            sb.append(i6);
            sb.append(length2);
            throw new IllegalArgumentException(sb.toString());
        }
        int i7 = i5 + i6;
        if (i7 <= zzianVar.zzc()) {
            if (zzianVar instanceof zzial) {
                return zzian.zzD(this.zzb, 0, ((zzial) zzianVar).zzb, i5, i6);
            }
            if (!(zzianVar instanceof zziah)) {
                return zzianVar.zzd(i5, i7).equals(zzd(0, i6));
            }
            zziah zziahVar = (zziah) zzianVar;
            return zzian.zzD(this.zzb, 0, zziahVar.zzn(), zziahVar.zzo() + i5, i6);
        }
        int zzc = zzianVar.zzc();
        int length3 = String.valueOf(i5).length();
        StringBuilder sb2 = new StringBuilder(length3 + 24 + String.valueOf(i6).length() + 2 + String.valueOf(zzc).length());
        u.s(sb2, "Ran off end of other: ", i5, ", ", i6);
        throw new IllegalArgumentException(u.l(sb2, ", ", zzc));
    }

    @Override // com.google.android.gms.internal.ads.zzian
    public final int zzl(int i5, int i6, int i7) {
        return zzice.zzc(i5, this.zzb, i6, i7);
    }

    @Override // com.google.android.gms.internal.ads.zzian
    public final zziaq zzm() {
        byte[] bArr = this.zzb;
        return zziaq.zzG(bArr, 0, bArr.length, true);
    }

    public final /* synthetic */ byte[] zzn() {
        return this.zzb;
    }
}
