package com.google.android.gms.internal.measurement;

import androidx.emoji2.text.u;
import java.nio.charset.Charset;

/* loaded from: classes.dex */
class zziy extends zzix {
    protected final byte[] zza;

    public zziy(byte[] bArr) {
        bArr.getClass();
        this.zza = bArr;
    }

    @Override // com.google.android.gms.internal.measurement.zzjb
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzjb) || zzd() != ((zzjb) obj).zzd()) {
            return false;
        }
        if (zzd() == 0) {
            return true;
        }
        if (!(obj instanceof zziy)) {
            return obj.equals(this);
        }
        zziy zziyVar = (zziy) obj;
        int zzk = zzk();
        int zzk2 = zziyVar.zzk();
        if (zzk != 0 && zzk2 != 0 && zzk != zzk2) {
            return false;
        }
        int zzd = zzd();
        if (zzd > zziyVar.zzd()) {
            throw new IllegalArgumentException("Length too large: " + zzd + zzd());
        }
        if (zzd > zziyVar.zzd()) {
            throw new IllegalArgumentException(u.g(zzd, zziyVar.zzd(), "Ran off end of other: 0, ", ", "));
        }
        byte[] bArr = this.zza;
        byte[] bArr2 = zziyVar.zza;
        zziyVar.zzc();
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

    @Override // com.google.android.gms.internal.measurement.zzjb
    public byte zza(int i5) {
        return this.zza[i5];
    }

    @Override // com.google.android.gms.internal.measurement.zzjb
    public byte zzb(int i5) {
        return this.zza[i5];
    }

    public int zzc() {
        return 0;
    }

    @Override // com.google.android.gms.internal.measurement.zzjb
    public int zzd() {
        return this.zza.length;
    }

    @Override // com.google.android.gms.internal.measurement.zzjb
    public final int zze(int i5, int i6, int i7) {
        return zzkk.zzd(i5, this.zza, 0, i7);
    }

    @Override // com.google.android.gms.internal.measurement.zzjb
    public final zzjb zzf(int i5, int i6) {
        int zzj = zzjb.zzj(0, i6, zzd());
        return zzj == 0 ? zzjb.zzb : new zziv(this.zza, 0, zzj);
    }

    @Override // com.google.android.gms.internal.measurement.zzjb
    public final String zzg(Charset charset) {
        return new String(this.zza, 0, zzd(), charset);
    }

    @Override // com.google.android.gms.internal.measurement.zzjb
    public final void zzh(zzir zzirVar) {
        ((zzjg) zzirVar).zzc(this.zza, 0, zzd());
    }

    @Override // com.google.android.gms.internal.measurement.zzjb
    public final boolean zzi() {
        return zzna.zzf(this.zza, 0, zzd());
    }
}
