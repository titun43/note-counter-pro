package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public final class zzhes {
    private zzheu zza;
    private String zzb;
    private zzhet zzc;
    private zzhch zzd;

    private zzhes() {
        throw null;
    }

    public final zzhes zza(zzheu zzheuVar) {
        this.zza = zzheuVar;
        return this;
    }

    public final zzhes zzb(String str) {
        this.zzb = str;
        return this;
    }

    public final zzhes zzc(zzhet zzhetVar) {
        this.zzc = zzhetVar;
        return this;
    }

    public final zzhes zzd(zzhch zzhchVar) {
        this.zzd = zzhchVar;
        return this;
    }

    public final zzhev zze() {
        if (this.zza == null) {
            this.zza = zzheu.zzb;
        }
        if (this.zzb == null) {
            throw new GeneralSecurityException("kekUri must be set");
        }
        zzhet zzhetVar = this.zzc;
        if (zzhetVar == null) {
            throw new GeneralSecurityException("dekParsingStrategy must be set");
        }
        zzhch zzhchVar = this.zzd;
        if (zzhchVar == null) {
            throw new GeneralSecurityException("dekParametersForNewKeys must be set");
        }
        if (zzhchVar.zza()) {
            throw new GeneralSecurityException("dekParametersForNewKeys must not have ID Requirements");
        }
        if ((zzhetVar.equals(zzhet.zza) && (zzhchVar instanceof zzhdm)) || ((zzhetVar.equals(zzhet.zzc) && (zzhchVar instanceof zzheb)) || ((zzhetVar.equals(zzhet.zzb) && (zzhchVar instanceof zzhfx)) || ((zzhetVar.equals(zzhet.zzd) && (zzhchVar instanceof zzhcv)) || ((zzhetVar.equals(zzhet.zze) && (zzhchVar instanceof zzhdd)) || (zzhetVar.equals(zzhet.zzf) && (zzhchVar instanceof zzhdv))))))) {
            return new zzhev(this.zza, this.zzb, this.zzc, this.zzd, null);
        }
        String zzhetVar2 = this.zzc.toString();
        String valueOf = String.valueOf(this.zzd);
        StringBuilder sb = new StringBuilder(valueOf.length() + zzhetVar2.length() + 67 + 1);
        s.c.e(sb, "Cannot use parsing strategy ", zzhetVar2, " when new keys are picked according to ", valueOf);
        sb.append(".");
        throw new GeneralSecurityException(sb.toString());
    }

    public /* synthetic */ zzhes(byte[] bArr) {
    }
}
