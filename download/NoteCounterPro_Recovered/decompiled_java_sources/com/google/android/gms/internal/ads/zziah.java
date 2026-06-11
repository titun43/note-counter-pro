package com.google.android.gms.internal.ads;

import androidx.emoji2.text.u;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* loaded from: classes.dex */
final class zziah extends zziak {
    private final byte[] zzb;
    private final int zzc;
    private final int zzd;

    public zziah(byte[] bArr, int i5, int i6) {
        super(null);
        zzian.zzC(i5, i5 + i6, bArr.length);
        this.zzb = bArr;
        this.zzc = i5;
        this.zzd = i6;
    }

    @Override // com.google.android.gms.internal.ads.zzian
    public final byte zza(int i5) {
        zzian.zzB(i5, this.zzd);
        return this.zzb[this.zzc + i5];
    }

    @Override // com.google.android.gms.internal.ads.zzian
    public final byte zzb(int i5) {
        return this.zzb[this.zzc + i5];
    }

    @Override // com.google.android.gms.internal.ads.zzian
    public final int zzc() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzian
    public final zzian zzd(int i5, int i6) {
        int zzC = zzian.zzC(i5, i6, this.zzd);
        return zzC == 0 ? zzian.zza : new zziah(this.zzb, this.zzc + i5, zzC);
    }

    @Override // com.google.android.gms.internal.ads.zzian
    public final void zze(byte[] bArr, int i5, int i6, int i7) {
        System.arraycopy(this.zzb, this.zzc + i5, bArr, i6, i7);
    }

    @Override // com.google.android.gms.internal.ads.zzian
    public final ByteBuffer zzf() {
        return ByteBuffer.wrap(this.zzb, this.zzc, this.zzd).asReadOnlyBuffer();
    }

    @Override // com.google.android.gms.internal.ads.zzian
    public final void zzg(zziae zziaeVar) {
        zziaeVar.zza(this.zzb, this.zzc, this.zzd);
    }

    @Override // com.google.android.gms.internal.ads.zzian
    public final String zzh(Charset charset) {
        return new String(this.zzb, this.zzc, this.zzd, charset);
    }

    @Override // com.google.android.gms.internal.ads.zzian
    public final boolean zzi() {
        byte[] bArr = this.zzb;
        int i5 = this.zzc;
        return zzier.zzb(bArr, i5, this.zzd + i5);
    }

    @Override // com.google.android.gms.internal.ads.zzian
    public final boolean zzj(zzian zzianVar) {
        return ((zzianVar instanceof zzial) || (zzianVar instanceof zziah)) ? zzk(zzianVar, 0, this.zzd) : zzianVar.zzj(this);
    }

    @Override // com.google.android.gms.internal.ads.zziak
    public final boolean zzk(zzian zzianVar, int i5, int i6) {
        if (i6 > zzianVar.zzc()) {
            int i7 = this.zzd;
            StringBuilder sb = new StringBuilder(String.valueOf(i6).length() + 18 + String.valueOf(i7).length());
            sb.append("Length too large: ");
            sb.append(i6);
            sb.append(i7);
            throw new IllegalArgumentException(sb.toString());
        }
        int i8 = i5 + i6;
        if (i8 > zzianVar.zzc()) {
            int zzc = zzianVar.zzc();
            int length = String.valueOf(i5).length();
            StringBuilder sb2 = new StringBuilder(length + 24 + String.valueOf(i6).length() + 2 + String.valueOf(zzc).length());
            u.s(sb2, "Ran off end of other: ", i5, ", ", i6);
            throw new IllegalArgumentException(u.l(sb2, ", ", zzc));
        }
        if (zzianVar instanceof zzial) {
            return zzian.zzD(this.zzb, this.zzc, ((zzial) zzianVar).zzn(), i5, i6);
        }
        if (zzianVar instanceof zziah) {
            zziah zziahVar = (zziah) zzianVar;
            return zzian.zzD(this.zzb, this.zzc, zziahVar.zzb, zziahVar.zzc + i5, i6);
        }
        zzian zzd = zzianVar.zzd(i5, i8);
        int i9 = this.zzc;
        return zzd.equals(zzd(i9, i6 + i9));
    }

    @Override // com.google.android.gms.internal.ads.zzian
    public final int zzl(int i5, int i6, int i7) {
        return zzice.zzc(i5, this.zzb, this.zzc + i6, i7);
    }

    @Override // com.google.android.gms.internal.ads.zzian
    public final zziaq zzm() {
        return zziaq.zzG(this.zzb, this.zzc, this.zzd, true);
    }

    public final /* synthetic */ byte[] zzn() {
        return this.zzb;
    }

    public final /* synthetic */ int zzo() {
        return this.zzc;
    }
}
