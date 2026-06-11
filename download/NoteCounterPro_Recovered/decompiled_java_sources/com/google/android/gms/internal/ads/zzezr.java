package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.io.IOException;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class zzezr implements zzfax {
    private final Context zza;
    private final zzgzy zzb;
    private final zzfjk zzc;
    private final VersionInfoParcel zzd;

    public zzezr(Context context, zzgzy zzgzyVar, zzfjk zzfjkVar, VersionInfoParcel versionInfoParcel) {
        this.zza = context;
        this.zzb = zzgzyVar;
        this.zzc = zzfjkVar;
        this.zzd = versionInfoParcel;
    }

    @Override // com.google.android.gms.internal.ads.zzfax
    public final j3.a zza() {
        return this.zzb.submit(new Callable() { // from class: com.google.android.gms.internal.ads.zzezq
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return zzezr.this.zzc();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzfax
    public final int zzb() {
        return 53;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0042, code lost:
    
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(com.google.android.gms.internal.ads.zzbhe.zzdR)).booleanValue() == false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0058, code lost:
    
        r1 = com.google.android.gms.internal.ads.zzgal.zzh(r0).zzi(((java.lang.Long) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(com.google.android.gms.internal.ads.zzbhe.zzec)).longValue(), com.google.android.gms.ads.internal.zzt.zzh().zzo().zzx());
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00bd, code lost:
    
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(com.google.android.gms.internal.ads.zzbhe.zzdS)).booleanValue() == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00d3, code lost:
    
        r4 = com.google.android.gms.internal.ads.zzgam.zzh(r0);
        r0 = com.google.android.gms.internal.ads.zzgai.zza(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00ef, code lost:
    
        if (r9.zzd.clientJarVersion < ((java.lang.Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(com.google.android.gms.internal.ads.zzbhe.zzdY)).intValue()) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00f1, code lost:
    
        r2 = r4.zzi(((java.lang.Long) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(com.google.android.gms.internal.ads.zzbhe.zzed)).longValue(), com.google.android.gms.ads.internal.zzt.zzh().zzo().zzx());
        r3 = r0.zzc();
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0115, code lost:
    
        r6 = r0.zze();
        r4 = r2;
        r5 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00d1, code lost:
    
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(com.google.android.gms.internal.ads.zzbhe.zzdU)).booleanValue() != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0056, code lost:
    
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(com.google.android.gms.internal.ads.zzbhe.zzdT)).booleanValue() != false) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final /* synthetic */ zzezs zzc() {
        try {
            Context context = this.zza;
            boolean zza = this.zzc.zza();
            zzgah zzgahVar = new zzgah();
            zzgah zzgahVar2 = new zzgah();
            boolean z4 = true;
            if (zza) {
                if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzdV)).booleanValue()) {
                    return new zzezs(true);
                }
            }
            if (!zza) {
            }
            if (zza) {
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzdZ)).booleanValue()) {
                if (this.zzd.clientJarVersion < ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzdY)).intValue()) {
                    zzgam.zzh(context).zzj();
                }
            }
            if (!zza) {
            }
            if (zza) {
            }
            zzgah zzgahVar3 = zzgahVar2;
            boolean z5 = true;
            boolean z6 = true;
            return new zzezs(zzgahVar, zzgahVar3, z5, z6, zza);
        } catch (IOException e4) {
            com.google.android.gms.ads.internal.zzt.zzh().zzg(e4, "PerAppIdSignal");
            return new zzezs(this.zzc.zza());
        }
    }
}
