package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: classes.dex */
public final class zzhsg extends zzhuu {
    private final zzhse zza;
    private final zzhsc zzb;
    private final zzhsd zzc;
    private final zzhsf zzd;

    public /* synthetic */ zzhsg(zzhse zzhseVar, zzhsc zzhscVar, zzhsd zzhsdVar, zzhsf zzhsfVar, byte[] bArr) {
        this.zza = zzhseVar;
        this.zzb = zzhscVar;
        this.zzc = zzhsdVar;
        this.zzd = zzhsfVar;
    }

    public static zzhsb zzb() {
        return new zzhsb(null);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzhsg)) {
            return false;
        }
        zzhsg zzhsgVar = (zzhsg) obj;
        return zzhsgVar.zza == this.zza && zzhsgVar.zzb == this.zzb && zzhsgVar.zzc == this.zzc && zzhsgVar.zzd == this.zzd;
    }

    public final int hashCode() {
        return Objects.hash(zzhsg.class, this.zza, this.zzb, this.zzc, this.zzd);
    }

    public final String toString() {
        String zzhsfVar = this.zzd.toString();
        int length = zzhsfVar.length();
        String zzhsdVar = this.zzc.toString();
        int length2 = zzhsdVar.length();
        String zzhseVar = this.zza.toString();
        int length3 = zzhseVar.length();
        String zzhscVar = this.zzb.toString();
        StringBuilder sb = new StringBuilder(length + 39 + length2 + 12 + length3 + 9 + zzhscVar.length() + 1);
        s.c.e(sb, "ECDSA Parameters (variant: ", zzhsfVar, ", hashType: ", zzhsdVar);
        s.c.e(sb, ", encoding: ", zzhseVar, ", curve: ", zzhscVar);
        sb.append(")");
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzhbp
    public final boolean zza() {
        return this.zzd != zzhsf.zzd;
    }

    public final zzhse zzc() {
        return this.zza;
    }

    public final zzhsc zzd() {
        return this.zzb;
    }

    public final zzhsd zze() {
        return this.zzc;
    }

    public final zzhsf zzf() {
        return this.zzd;
    }
}
