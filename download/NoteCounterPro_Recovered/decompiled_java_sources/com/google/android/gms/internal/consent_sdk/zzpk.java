package com.google.android.gms.internal.consent_sdk;

import androidx.emoji2.text.u;

/* loaded from: classes.dex */
class zzpk extends zzpj {
    protected final byte[] zza;

    public zzpk(byte[] bArr) {
        super(null);
        bArr.getClass();
        this.zza = bArr;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpm
    public byte zza(int i5) {
        return this.zza[i5];
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpm
    public byte zzb(int i5) {
        return this.zza[i5];
    }

    public int zzc() {
        return 0;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpm
    public int zzd() {
        return this.zza.length;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpm
    public final int zze(int i5, int i6, int i7) {
        return zzqs.zzb(i5, this.zza, 0, i7);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpm
    public final zzpm zzf(int i5, int i6) {
        zzpm.zzi(0, 47, zzd());
        return new zzph(this.zza, 0, 47);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpm
    public final void zzg(zzpe zzpeVar) {
        zzpeVar.zza(this.zza, 0, zzd());
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpm
    public final boolean zzh(zzpm zzpmVar) {
        if (!(zzpmVar instanceof zzpk)) {
            return zzpmVar.zzh(this);
        }
        int zzd = zzd();
        if (zzd > zzpmVar.zzd()) {
            throw new IllegalArgumentException("Length too large: " + zzd + zzd());
        }
        if (zzd > zzpmVar.zzd()) {
            throw new IllegalArgumentException(u.g(zzd, zzpmVar.zzd(), "Ran off end of other: 0, ", ", "));
        }
        zzpk zzpkVar = (zzpk) zzpmVar;
        byte[] bArr = this.zza;
        byte[] bArr2 = zzpkVar.zza;
        zzpkVar.zzc();
        int i5 = 0;
        int i6 = 0;
        while (i5 < zzd) {
            if (bArr[i5] != bArr2[i6]) {
                return false;
            }
            i5++;
            i6++;
        }
        return true;
    }
}
