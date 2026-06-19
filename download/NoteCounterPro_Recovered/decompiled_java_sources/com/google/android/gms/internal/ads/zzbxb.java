package com.google.android.gms.internal.ads;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.RemoteException;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.nativead.NativeAd;
import java.util.Map;

/* loaded from: classes.dex */
public final class zzbxb extends NativeAd.Image {
    private final zzbks zzb;
    private final Drawable zzc;
    private final Uri zzd;
    private final double zze;
    private final int zzf;
    private final int zzg;

    /* JADX WARN: Can't wrap try/catch for region: R(21:0|1|(2:2|3)|(17:5|6|7|8|9|10|11|12|13|14|15|16|17|18|(2:23|24)|20|21)|40|6|7|8|9|10|11|12|13|14|15|16|17|18|(0)|20|21) */
    /* JADX WARN: Can't wrap try/catch for region: R(22:0|1|2|3|(17:5|6|7|8|9|10|11|12|13|14|15|16|17|18|(2:23|24)|20|21)|40|6|7|8|9|10|11|12|13|14|15|16|17|18|(0)|20|21) */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0052, code lost:
    
        r2 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0053, code lost:
    
        com.google.android.gms.ads.internal.util.client.zzo.zzg(com.google.android.gms.ads.RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0044, code lost:
    
        r2 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0045, code lost:
    
        com.google.android.gms.ads.internal.util.client.zzo.zzg(com.google.android.gms.ads.RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, r2);
        r2 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0034, code lost:
    
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0035, code lost:
    
        com.google.android.gms.ads.internal.util.client.zzo.zzg(com.google.android.gms.ads.RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, r5);
        r2 = 1.0d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0026, code lost:
    
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0027, code lost:
    
        com.google.android.gms.ads.internal.util.client.zzo.zzg(com.google.android.gms.ads.RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, r5);
        r5 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public zzbxb(zzbks zzbksVar) {
        Drawable drawable;
        a3.a zzb;
        this.zzb = zzbksVar;
        Map map = null;
        try {
            zzb = zzbksVar.zzb();
        } catch (RemoteException e4) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e4);
        }
        if (zzb != null) {
            drawable = (Drawable) a3.b.b(zzb);
            this.zzc = drawable;
            Uri uri = this.zzb.zzc();
            this.zzd = uri;
            double d5 = this.zzb.zzd();
            this.zze = d5;
            int i5 = -1;
            int i6 = this.zzb.zze();
            this.zzf = i6;
            i5 = this.zzb.zzf();
            this.zzg = i5;
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzeO)).booleanValue()) {
                try {
                    map = this.zzb.zzg();
                } catch (RemoteException unused) {
                }
            }
            this.zza = map;
        }
        drawable = null;
        this.zzc = drawable;
        Uri uri2 = this.zzb.zzc();
        this.zzd = uri2;
        double d52 = this.zzb.zzd();
        this.zze = d52;
        int i52 = -1;
        int i62 = this.zzb.zze();
        this.zzf = i62;
        i52 = this.zzb.zzf();
        this.zzg = i52;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzeO)).booleanValue()) {
        }
        this.zza = map;
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd.Image
    public final Drawable getDrawable() {
        return this.zzc;
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd.Image
    public final double getScale() {
        return this.zze;
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd.Image
    public final Uri getUri() {
        return this.zzd;
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd.Image
    public final int zza() {
        return this.zzf;
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd.Image
    public final int zzb() {
        return this.zzg;
    }
}
