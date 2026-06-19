package com.google.android.gms.internal.ads;

import androidx.fragment.app.h1;
import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class zzhlk {
    private final Map zza;
    private final Map zzb;
    private final Map zzc;
    private final Map zzd;

    public /* synthetic */ zzhlk(zzhlh zzhlhVar, byte[] bArr) {
        this.zza = new HashMap(zzhlhVar.zze());
        this.zzb = new HashMap(zzhlhVar.zzf());
        this.zzc = new HashMap(zzhlhVar.zzg());
        this.zzd = new HashMap(zzhlhVar.zzh());
    }

    public final boolean zza(zzhlg zzhlgVar) {
        return this.zzb.containsKey(new zzhli(zzhlgVar.getClass(), zzhlgVar.zzf(), null));
    }

    public final zzhaz zzb(zzhlg zzhlgVar, zzhbt zzhbtVar) {
        zzhli zzhliVar = new zzhli(zzhlgVar.getClass(), zzhlgVar.zzf(), null);
        Map map = this.zzb;
        if (map.containsKey(zzhliVar)) {
            return ((zzhjf) map.get(zzhliVar)).zza(zzhlgVar, zzhbtVar);
        }
        String zzhliVar2 = zzhliVar.toString();
        throw new GeneralSecurityException(h1.b(new StringBuilder(zzhliVar2.length() + 47), "No Key Parser for requested key type ", zzhliVar2, " available"));
    }

    public final zzhlg zzc(zzhaz zzhazVar, Class cls, zzhbt zzhbtVar) {
        zzhlj zzhljVar = new zzhlj(zzhazVar.getClass(), cls, null);
        Map map = this.zza;
        if (map.containsKey(zzhljVar)) {
            return ((zzhji) map.get(zzhljVar)).zza(zzhazVar, zzhbtVar);
        }
        String zzhljVar2 = zzhljVar.toString();
        throw new GeneralSecurityException(h1.b(new StringBuilder(zzhljVar2.length() + 32), "No Key serializer for ", zzhljVar2, " available"));
    }

    public final boolean zzd(zzhlg zzhlgVar) {
        return this.zzd.containsKey(new zzhli(zzhlgVar.getClass(), zzhlgVar.zzf(), null));
    }

    public final zzhbp zze(zzhlg zzhlgVar) {
        zzhli zzhliVar = new zzhli(zzhlgVar.getClass(), zzhlgVar.zzf(), null);
        Map map = this.zzd;
        if (map.containsKey(zzhliVar)) {
            return ((zzhkk) map.get(zzhliVar)).zza(zzhlgVar);
        }
        String zzhliVar2 = zzhliVar.toString();
        throw new GeneralSecurityException(h1.b(new StringBuilder(zzhliVar2.length() + 54), "No Parameters Parser for requested key type ", zzhliVar2, " available"));
    }

    public final zzhlg zzf(zzhbp zzhbpVar, Class cls) {
        zzhlj zzhljVar = new zzhlj(zzhbpVar.getClass(), cls, null);
        Map map = this.zzc;
        if (map.containsKey(zzhljVar)) {
            return ((zzhkn) map.get(zzhljVar)).zza(zzhbpVar);
        }
        String zzhljVar2 = zzhljVar.toString();
        throw new GeneralSecurityException(h1.b(new StringBuilder(zzhljVar2.length() + 39), "No Key Format serializer for ", zzhljVar2, " available"));
    }

    public final /* synthetic */ Map zzg() {
        return this.zza;
    }

    public final /* synthetic */ Map zzh() {
        return this.zzb;
    }

    public final /* synthetic */ Map zzi() {
        return this.zzc;
    }

    public final /* synthetic */ Map zzj() {
        return this.zzd;
    }
}
