package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzdzm {
    private final zzbph zza;

    public zzdzm(zzbph zzbphVar) {
        this.zza = zzbphVar;
    }

    private final void zzs(zzdzl zzdzlVar) {
        String zza = zzdzlVar.zza();
        String concat = "Dispatching AFMA event on publisher webview: ".concat(zza);
        int i5 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzh(concat);
        this.zza.zzb(zza);
    }

    public final void zza() {
        zzs(new zzdzl("initialize", null));
    }

    public final void zzb(long j2) {
        zzdzl zzdzlVar = new zzdzl("creation", null);
        zzdzlVar.zzb(Long.valueOf(j2));
        zzdzlVar.zzc("nativeObjectCreated");
        zzs(zzdzlVar);
    }

    public final void zzc(long j2) {
        zzdzl zzdzlVar = new zzdzl("creation", null);
        zzdzlVar.zzb(Long.valueOf(j2));
        zzdzlVar.zzc("nativeObjectNotCreated");
        zzs(zzdzlVar);
    }

    public final void zzd(long j2) {
        zzdzl zzdzlVar = new zzdzl("interstitial", null);
        zzdzlVar.zzb(Long.valueOf(j2));
        zzdzlVar.zzc("onNativeAdObjectNotAvailable");
        zzs(zzdzlVar);
    }

    public final void zze(long j2) {
        zzdzl zzdzlVar = new zzdzl("interstitial", null);
        zzdzlVar.zzb(Long.valueOf(j2));
        zzdzlVar.zzc("onAdLoaded");
        zzs(zzdzlVar);
    }

    public final void zzf(long j2, int i5) {
        zzdzl zzdzlVar = new zzdzl("interstitial", null);
        zzdzlVar.zzb(Long.valueOf(j2));
        zzdzlVar.zzc("onAdFailedToLoad");
        zzdzlVar.zzd(Integer.valueOf(i5));
        zzs(zzdzlVar);
    }

    public final void zzg(long j2) {
        zzdzl zzdzlVar = new zzdzl("interstitial", null);
        zzdzlVar.zzb(Long.valueOf(j2));
        zzdzlVar.zzc("onAdOpened");
        zzs(zzdzlVar);
    }

    public final void zzh(long j2) {
        zzdzl zzdzlVar = new zzdzl("interstitial", null);
        zzdzlVar.zzb(Long.valueOf(j2));
        zzdzlVar.zzc("onAdClicked");
        this.zza.zzb(zzdzlVar.zza());
    }

    public final void zzi(long j2) {
        zzdzl zzdzlVar = new zzdzl("interstitial", null);
        zzdzlVar.zzb(Long.valueOf(j2));
        zzdzlVar.zzc("onAdClosed");
        zzs(zzdzlVar);
    }

    public final void zzj(long j2) {
        zzdzl zzdzlVar = new zzdzl("rewarded", null);
        zzdzlVar.zzb(Long.valueOf(j2));
        zzdzlVar.zzc("onNativeAdObjectNotAvailable");
        zzs(zzdzlVar);
    }

    public final void zzk(long j2) {
        zzdzl zzdzlVar = new zzdzl("rewarded", null);
        zzdzlVar.zzb(Long.valueOf(j2));
        zzdzlVar.zzc("onRewardedAdLoaded");
        zzs(zzdzlVar);
    }

    public final void zzl(long j2, int i5) {
        zzdzl zzdzlVar = new zzdzl("rewarded", null);
        zzdzlVar.zzb(Long.valueOf(j2));
        zzdzlVar.zzc("onRewardedAdFailedToLoad");
        zzdzlVar.zzd(Integer.valueOf(i5));
        zzs(zzdzlVar);
    }

    public final void zzm(long j2) {
        zzdzl zzdzlVar = new zzdzl("rewarded", null);
        zzdzlVar.zzb(Long.valueOf(j2));
        zzdzlVar.zzc("onRewardedAdOpened");
        zzs(zzdzlVar);
    }

    public final void zzn(long j2, int i5) {
        zzdzl zzdzlVar = new zzdzl("rewarded", null);
        zzdzlVar.zzb(Long.valueOf(j2));
        zzdzlVar.zzc("onRewardedAdFailedToShow");
        zzdzlVar.zzd(Integer.valueOf(i5));
        zzs(zzdzlVar);
    }

    public final void zzo(long j2) {
        zzdzl zzdzlVar = new zzdzl("rewarded", null);
        zzdzlVar.zzb(Long.valueOf(j2));
        zzdzlVar.zzc("onRewardedAdClosed");
        zzs(zzdzlVar);
    }

    public final void zzp(long j2, zzcaw zzcawVar) {
        zzdzl zzdzlVar = new zzdzl("rewarded", null);
        zzdzlVar.zzb(Long.valueOf(j2));
        zzdzlVar.zzc("onUserEarnedReward");
        zzdzlVar.zze(zzcawVar.zze());
        zzdzlVar.zzf(Integer.valueOf(zzcawVar.zzf()));
        zzs(zzdzlVar);
    }

    public final void zzq(long j2) {
        zzdzl zzdzlVar = new zzdzl("rewarded", null);
        zzdzlVar.zzb(Long.valueOf(j2));
        zzdzlVar.zzc("onAdImpression");
        zzs(zzdzlVar);
    }

    public final void zzr(long j2) {
        zzdzl zzdzlVar = new zzdzl("rewarded", null);
        zzdzlVar.zzb(Long.valueOf(j2));
        zzdzlVar.zzc("onAdClicked");
        zzs(zzdzlVar);
    }
}
