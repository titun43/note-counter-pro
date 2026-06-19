package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class zzzi extends zzzs implements Comparable {
    private final int zze;
    private final int zzf;

    public zzzi(int i5, zzbg zzbgVar, int i6, zzzl zzzlVar, int i7) {
        super(i5, zzbgVar, i6);
        this.zze = zzmn.zzaa(i7, zzzlVar.zzV) ? 1 : 0;
        this.zzf = this.zzd.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzzs
    public final int zza() {
        return this.zze;
    }

    @Override // java.lang.Comparable
    /* renamed from: zzb, reason: merged with bridge method [inline-methods] */
    public final int compareTo(zzzi zzziVar) {
        return Integer.compare(this.zzf, zzziVar.zzf);
    }

    @Override // com.google.android.gms.internal.ads.zzzs
    public final /* bridge */ /* synthetic */ boolean zzc(zzzs zzzsVar) {
        return false;
    }
}
