package com.google.android.gms.internal.ads;

import androidx.emoji2.text.u;
import java.util.Objects;

/* loaded from: classes.dex */
public final class zzhmk extends zzhmn {
    private final int zza;
    private final int zzb;
    private final zzhmj zzc;
    private final zzhmi zzd;

    public /* synthetic */ zzhmk(int i5, int i6, zzhmj zzhmjVar, zzhmi zzhmiVar, byte[] bArr) {
        this.zza = i5;
        this.zzb = i6;
        this.zzc = zzhmjVar;
        this.zzd = zzhmiVar;
    }

    public static zzhmh zzb() {
        return new zzhmh(null);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzhmk)) {
            return false;
        }
        zzhmk zzhmkVar = (zzhmk) obj;
        return zzhmkVar.zza == this.zza && zzhmkVar.zze() == zze() && zzhmkVar.zzc == this.zzc && zzhmkVar.zzd == this.zzd;
    }

    public final int hashCode() {
        return Objects.hash(zzhmk.class, Integer.valueOf(this.zza), Integer.valueOf(this.zzb), this.zzc, this.zzd);
    }

    public final String toString() {
        zzhmi zzhmiVar = this.zzd;
        String valueOf = String.valueOf(this.zzc);
        String valueOf2 = String.valueOf(zzhmiVar);
        int length = valueOf.length();
        int length2 = valueOf2.length();
        int i5 = this.zzb;
        int length3 = String.valueOf(i5).length();
        int i6 = this.zza;
        StringBuilder sb = new StringBuilder(length + 38 + length2 + 2 + length3 + 16 + String.valueOf(i6).length() + 10);
        s.c.e(sb, "HMAC Parameters (variant: ", valueOf, ", hashType: ", valueOf2);
        u.s(sb, ", ", i5, "-byte tags, and ", i6);
        sb.append("-byte key)");
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzhbp
    public final boolean zza() {
        return this.zzc != zzhmj.zzd;
    }

    public final int zzc() {
        return this.zza;
    }

    public final int zzd() {
        return this.zzb;
    }

    public final int zze() {
        zzhmj zzhmjVar = this.zzc;
        if (zzhmjVar == zzhmj.zzd) {
            return this.zzb;
        }
        if (zzhmjVar == zzhmj.zza || zzhmjVar == zzhmj.zzb || zzhmjVar == zzhmj.zzc) {
            return this.zzb + 5;
        }
        throw new IllegalStateException("Unknown variant");
    }

    public final zzhmj zzf() {
        return this.zzc;
    }

    public final zzhmi zzg() {
        return this.zzd;
    }
}
