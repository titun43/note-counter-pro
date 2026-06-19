package com.google.android.gms.internal.ads;

import androidx.emoji2.text.u;
import androidx.fragment.app.h1;

/* loaded from: classes.dex */
final class zzfxk extends zzfxq {
    private final String zzb;
    private final int zzc;
    private final int zzd;

    public /* synthetic */ zzfxk(String str, boolean z4, int i5, zzfxi zzfxiVar, int i6, byte[] bArr) {
        this.zzb = str;
        this.zzc = i5;
        this.zzd = i6;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzfxq) {
            zzfxq zzfxqVar = (zzfxq) obj;
            if (this.zzb.equals(zzfxqVar.zza())) {
                zzfxqVar.zzb();
                int i5 = this.zzc;
                int zzd = zzfxqVar.zzd();
                if (i5 == 0) {
                    throw null;
                }
                if (i5 == zzd) {
                    zzfxqVar.zzc();
                    int i6 = this.zzd;
                    int zze = zzfxqVar.zze();
                    if (i6 == 0) {
                        throw null;
                    }
                    if (zze == 1) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.zzb.hashCode() ^ 1000003;
        int i5 = this.zzc;
        if (i5 == 0) {
            throw null;
        }
        int i6 = (((hashCode * 1000003) ^ 1237) * 1000003) ^ i5;
        if (this.zzd != 0) {
            return (i6 * (-721379959)) ^ 1;
        }
        throw null;
    }

    public final String toString() {
        int i5 = this.zzc;
        String str = i5 != 1 ? i5 != 2 ? i5 != 3 ? i5 != 4 ? "null" : "NO_CHECKS" : "SKIP_SECURITY_CHECK" : "SKIP_COMPLIANCE_CHECK" : "ALL_CHECKS";
        String str2 = this.zzd == 1 ? "READ_AND_WRITE" : "null";
        String str3 = this.zzb;
        StringBuilder sb = new StringBuilder(str2.length() + u.e(str, String.valueOf(str3).length() + 73, 52) + 1);
        s.c.e(sb, "FileComplianceOptions{fileOwner=", str3, ", hasDifferentDmaOwner=false, fileChecks=", str);
        return h1.b(sb, ", multipleProductIdGroupsResolver=null, filePurpose=", str2, "}");
    }

    @Override // com.google.android.gms.internal.ads.zzfxq
    public final String zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzfxq
    public final boolean zzb() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzfxq
    public final zzfxi zzc() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzfxq
    public final int zzd() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzfxq
    public final int zze() {
        return this.zzd;
    }
}
