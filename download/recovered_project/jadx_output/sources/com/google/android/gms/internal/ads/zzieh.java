package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class zzieh extends zzief {
    @Override // com.google.android.gms.internal.ads.zzief
    public final /* bridge */ /* synthetic */ void zza(Object obj, int i5, long j2) {
        ((zzieg) obj).zzk(i5 << 3, Long.valueOf(j2));
    }

    @Override // com.google.android.gms.internal.ads.zzief
    public final /* bridge */ /* synthetic */ void zzb(Object obj, int i5, int i6) {
        ((zzieg) obj).zzk((i5 << 3) | 5, Integer.valueOf(i6));
    }

    @Override // com.google.android.gms.internal.ads.zzief
    public final /* bridge */ /* synthetic */ void zzc(Object obj, int i5, long j2) {
        ((zzieg) obj).zzk((i5 << 3) | 1, Long.valueOf(j2));
    }

    @Override // com.google.android.gms.internal.ads.zzief
    public final /* bridge */ /* synthetic */ void zzd(Object obj, int i5, zzian zzianVar) {
        ((zzieg) obj).zzk((i5 << 3) | 2, zzianVar);
    }

    @Override // com.google.android.gms.internal.ads.zzief
    public final /* bridge */ /* synthetic */ void zze(Object obj, int i5, Object obj2) {
        ((zzieg) obj).zzk((i5 << 3) | 3, (zzieg) obj2);
    }

    @Override // com.google.android.gms.internal.ads.zzief
    public final /* synthetic */ Object zzf() {
        return zzieg.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzief
    public final /* synthetic */ Object zzg(Object obj) {
        zzieg zziegVar = (zzieg) obj;
        zziegVar.zzd();
        return zziegVar;
    }

    @Override // com.google.android.gms.internal.ads.zzief
    public final /* bridge */ /* synthetic */ Object zzh(Object obj) {
        zzibr zzibrVar = (zzibr) obj;
        zzieg zziegVar = zzibrVar.zzt;
        if (zziegVar != zzieg.zza()) {
            return zziegVar;
        }
        zzieg zzb = zzieg.zzb();
        zzibrVar.zzt = zzb;
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzief
    public final /* synthetic */ void zzi(Object obj, Object obj2) {
        ((zzibr) obj).zzt = (zzieg) obj2;
    }

    @Override // com.google.android.gms.internal.ads.zzief
    public final void zzj(Object obj) {
        ((zzibr) obj).zzt.zzd();
    }
}
