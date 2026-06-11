package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class zzhkv {
    private final Map zza;
    private final Map zzb;

    private zzhkv() {
        this.zza = new HashMap();
        this.zzb = new HashMap();
    }

    public final zzhkv zza(zzhku zzhkuVar) {
        if (zzhkuVar == null) {
            throw new NullPointerException("primitive constructor must be non-null");
        }
        zzhkw zzhkwVar = new zzhkw(zzhkuVar.zzb(), zzhkuVar.zzc(), null);
        Map map = this.zza;
        if (!map.containsKey(zzhkwVar)) {
            map.put(zzhkwVar, zzhkuVar);
            return this;
        }
        zzhku zzhkuVar2 = (zzhku) map.get(zzhkwVar);
        if (zzhkuVar2.equals(zzhkuVar) && zzhkuVar.equals(zzhkuVar2)) {
            return this;
        }
        throw new GeneralSecurityException("Attempt to register non-equal PrimitiveConstructor object for already existing object of type: ".concat(zzhkwVar.toString()));
    }

    public final zzhkv zzb(zzhla zzhlaVar) {
        Map map = this.zzb;
        Class zza = zzhlaVar.zza();
        if (!map.containsKey(zza)) {
            map.put(zza, zzhlaVar);
            return this;
        }
        zzhla zzhlaVar2 = (zzhla) map.get(zza);
        if (zzhlaVar2.equals(zzhlaVar) && zzhlaVar.equals(zzhlaVar2)) {
            return this;
        }
        throw new GeneralSecurityException("Attempt to register non-equal PrimitiveWrapper object or input class object for already existing object of type".concat(zza.toString()));
    }

    public final zzhky zzc() {
        return new zzhky(this, null);
    }

    public final /* synthetic */ Map zzd() {
        return this.zza;
    }

    public final /* synthetic */ Map zze() {
        return this.zzb;
    }

    public /* synthetic */ zzhkv(zzhky zzhkyVar, byte[] bArr) {
        this.zza = new HashMap(zzhkyVar.zzd());
        this.zzb = new HashMap(zzhkyVar.zze());
    }

    public /* synthetic */ zzhkv(byte[] bArr) {
        this.zza = new HashMap();
        this.zzb = new HashMap();
    }
}
