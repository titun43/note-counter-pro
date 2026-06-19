package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.view.View;
import com.google.android.gms.ads.formats.NativeAd;
import com.google.android.gms.ads.mediation.UnifiedNativeAdMapper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes.dex */
public final class zzbva extends zzbuh {
    private final UnifiedNativeAdMapper zza;

    public zzbva(UnifiedNativeAdMapper unifiedNativeAdMapper) {
        this.zza = unifiedNativeAdMapper;
    }

    @Override // com.google.android.gms.internal.ads.zzbui
    public final float zzA() {
        return this.zza.getDuration();
    }

    @Override // com.google.android.gms.internal.ads.zzbui
    public final float zzB() {
        return this.zza.getCurrentTime();
    }

    @Override // com.google.android.gms.internal.ads.zzbui
    public final void zzC() {
        this.zza.destroy();
    }

    @Override // com.google.android.gms.internal.ads.zzbui
    public final String zze() {
        return this.zza.getHeadline();
    }

    @Override // com.google.android.gms.internal.ads.zzbui
    public final List zzf() {
        List<NativeAd.Image> images = this.zza.getImages();
        ArrayList arrayList = new ArrayList();
        if (images != null) {
            for (NativeAd.Image image : images) {
                arrayList.add(new zzbkd(image.getDrawable(), image.getUri(), image.getScale(), image.zza(), image.zzb(), null));
            }
        }
        return arrayList;
    }

    @Override // com.google.android.gms.internal.ads.zzbui
    public final String zzg() {
        return this.zza.getBody();
    }

    @Override // com.google.android.gms.internal.ads.zzbui
    public final zzbks zzh() {
        NativeAd.Image icon = this.zza.getIcon();
        if (icon != null) {
            return new zzbkd(icon.getDrawable(), icon.getUri(), icon.getScale(), icon.zza(), icon.zzb(), null);
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbui
    public final String zzi() {
        return this.zza.getCallToAction();
    }

    @Override // com.google.android.gms.internal.ads.zzbui
    public final String zzj() {
        return this.zza.getAdvertiser();
    }

    @Override // com.google.android.gms.internal.ads.zzbui
    public final double zzk() {
        UnifiedNativeAdMapper unifiedNativeAdMapper = this.zza;
        if (unifiedNativeAdMapper.getStarRating() != null) {
            return unifiedNativeAdMapper.getStarRating().doubleValue();
        }
        return -1.0d;
    }

    @Override // com.google.android.gms.internal.ads.zzbui
    public final String zzl() {
        return this.zza.getStore();
    }

    @Override // com.google.android.gms.internal.ads.zzbui
    public final String zzm() {
        return this.zza.getPrice();
    }

    @Override // com.google.android.gms.internal.ads.zzbui
    public final com.google.android.gms.ads.internal.client.zzed zzn() {
        UnifiedNativeAdMapper unifiedNativeAdMapper = this.zza;
        if (unifiedNativeAdMapper.zzc() != null) {
            return unifiedNativeAdMapper.zzc().zzb();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbui
    public final zzbkl zzo() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbui
    public final a3.a zzp() {
        View adChoicesContent = this.zza.getAdChoicesContent();
        if (adChoicesContent == null) {
            return null;
        }
        return new a3.b(adChoicesContent);
    }

    @Override // com.google.android.gms.internal.ads.zzbui
    public final a3.a zzq() {
        View zzd = this.zza.zzd();
        if (zzd == null) {
            return null;
        }
        return new a3.b(zzd);
    }

    @Override // com.google.android.gms.internal.ads.zzbui
    public final a3.a zzr() {
        Object zze = this.zza.zze();
        if (zze == null) {
            return null;
        }
        return new a3.b(zze);
    }

    @Override // com.google.android.gms.internal.ads.zzbui
    public final Bundle zzs() {
        return this.zza.getExtras();
    }

    @Override // com.google.android.gms.internal.ads.zzbui
    public final boolean zzt() {
        return this.zza.getOverrideImpressionRecording();
    }

    @Override // com.google.android.gms.internal.ads.zzbui
    public final boolean zzu() {
        return this.zza.getOverrideClickHandling();
    }

    @Override // com.google.android.gms.internal.ads.zzbui
    public final void zzv() {
        this.zza.recordImpression();
    }

    @Override // com.google.android.gms.internal.ads.zzbui
    public final void zzw(a3.a aVar) {
        this.zza.handleClick((View) a3.b.b(aVar));
    }

    @Override // com.google.android.gms.internal.ads.zzbui
    public final void zzx(a3.a aVar, a3.a aVar2, a3.a aVar3) {
        HashMap hashMap = (HashMap) a3.b.b(aVar2);
        HashMap hashMap2 = (HashMap) a3.b.b(aVar3);
        this.zza.trackViews((View) a3.b.b(aVar), hashMap, hashMap2);
    }

    @Override // com.google.android.gms.internal.ads.zzbui
    public final void zzy(a3.a aVar) {
        this.zza.untrackView((View) a3.b.b(aVar));
    }

    @Override // com.google.android.gms.internal.ads.zzbui
    public final float zzz() {
        return this.zza.getMediaContentAspectRatio();
    }
}
