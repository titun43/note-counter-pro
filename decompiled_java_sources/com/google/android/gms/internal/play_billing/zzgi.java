package com.google.android.gms.internal.play_billing;

import androidx.emoji2.text.u;

/* loaded from: classes.dex */
class zzgi extends zzgh {
    protected final byte[] zza;

    public zzgi(byte[] bArr) {
        super(null);
        bArr.getClass();
        this.zza = bArr;
    }

    @Override // com.google.android.gms.internal.play_billing.zzgk
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzgk) || zzd() != ((zzgk) obj).zzd()) {
            return false;
        }
        if (zzd() == 0) {
            return true;
        }
        if (!(obj instanceof zzgi)) {
            return obj.equals(this);
        }
        zzgi zzgiVar = (zzgi) obj;
        int zzi = zzi();
        int zzi2 = zzgiVar.zzi();
        if (zzi != 0 && zzi2 != 0 && zzi != zzi2) {
            return false;
        }
        int zzd = zzd();
        if (zzd > zzgiVar.zzd()) {
            throw new IllegalArgumentException("Length too large: " + zzd + zzd());
        }
        if (zzd > zzgiVar.zzd()) {
            throw new IllegalArgumentException(u.g(zzd, zzgiVar.zzd(), "Ran off end of other: 0, ", ", "));
        }
        byte[] bArr = this.zza;
        byte[] bArr2 = zzgiVar.zza;
        zzgiVar.zzc();
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

    @Override // com.google.android.gms.internal.play_billing.zzgk
    public byte zza(int i5) {
        return this.zza[i5];
    }

    @Override // com.google.android.gms.internal.play_billing.zzgk
    public byte zzb(int i5) {
        return this.zza[i5];
    }

    public int zzc() {
        return 0;
    }

    @Override // com.google.android.gms.internal.play_billing.zzgk
    public int zzd() {
        return this.zza.length;
    }

    @Override // com.google.android.gms.internal.play_billing.zzgk
    public final int zze(int i5, int i6, int i7) {
        return zzhp.zzb(i5, this.zza, 0, i7);
    }

    @Override // com.google.android.gms.internal.play_billing.zzgk
    public final zzgk zzf(int i5, int i6) {
        int zzh = zzgk.zzh(0, i6, zzd());
        return zzh == 0 ? zzgk.zzb : new zzgf(this.zza, 0, zzh);
    }

    @Override // com.google.android.gms.internal.play_billing.zzgk
    public final void zzg(zzgc zzgcVar) {
        ((zzgo) zzgcVar).zzc(this.zza, 0, zzd());
    }
}
