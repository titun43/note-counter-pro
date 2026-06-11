package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: classes.dex */
final class zzwd extends zzvy {
    public static final Object zzc = new Object();
    private final Object zzd;
    private final Object zze;

    private zzwd(zzbf zzbfVar, Object obj, Object obj2) {
        super(zzbfVar);
        this.zzd = obj;
        this.zze = obj2;
    }

    public static zzwd zzp(zzak zzakVar) {
        return new zzwd(new zzwe(zzakVar), zzbe.zza, zzc);
    }

    public static zzwd zzq(zzbf zzbfVar, Object obj, Object obj2) {
        return new zzwd(zzbfVar, obj, obj2);
    }

    @Override // com.google.android.gms.internal.ads.zzvy, com.google.android.gms.internal.ads.zzbf
    public final zzbe zzb(int i5, zzbe zzbeVar, long j2) {
        this.zzb.zzb(i5, zzbeVar, j2);
        if (Objects.equals(zzbeVar.zzb, this.zzd)) {
            zzbeVar.zzb = zzbe.zza;
        }
        return zzbeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzvy, com.google.android.gms.internal.ads.zzbf
    public final zzbd zzd(int i5, zzbd zzbdVar, boolean z4) {
        this.zzb.zzd(i5, zzbdVar, z4);
        if (Objects.equals(zzbdVar.zzb, this.zze) && z4) {
            zzbdVar.zzb = zzc;
        }
        return zzbdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzvy, com.google.android.gms.internal.ads.zzbf
    public final int zze(Object obj) {
        Object obj2;
        if (zzc.equals(obj) && (obj2 = this.zze) != null) {
            obj = obj2;
        }
        return this.zzb.zze(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzvy, com.google.android.gms.internal.ads.zzbf
    public final Object zzf(int i5) {
        Object zzf = this.zzb.zzf(i5);
        return Objects.equals(zzf, this.zze) ? zzc : zzf;
    }

    public final zzwd zzr(zzbf zzbfVar) {
        return new zzwd(zzbfVar, this.zzd, this.zze);
    }

    public final /* synthetic */ Object zzs() {
        return this.zze;
    }
}
