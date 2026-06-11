package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class zzcyq implements zzdel, zzdjy {
    private zzbzn zza;
    private final Context zzc;
    private final zzfor zzd;
    private final VersionInfoParcel zze;
    private final Executor zzf;
    private boolean zzg = false;
    private boolean zzh = false;
    private final AtomicBoolean zzb = new AtomicBoolean();

    public zzcyq(Context context, zzfor zzforVar, VersionInfoParcel versionInfoParcel, Executor executor) {
        this.zzc = context;
        this.zzd = zzforVar;
        this.zze = versionInfoParcel;
        this.zzf = executor;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0066, code lost:
    
        if (android.text.TextUtils.equals(r0, "service") != false) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x006c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzc() {
        zzbzn zzbznVar;
        int i5;
        int i6;
        zzbsz zzb;
        if (!this.zzb.getAndSet(true)) {
            if (!((Boolean) zzbje.zzo.zze()).booleanValue()) {
                i5 = 3;
                if (!((Boolean) zzbje.zzp.zze()).booleanValue()) {
                    if (((Boolean) zzbje.zzn.zze()).booleanValue()) {
                        try {
                            String optString = new JSONObject(com.google.android.gms.ads.internal.zzt.zzh().zzo().zzi().zzd()).optString("local_flag_write");
                            if (TextUtils.equals(optString, "client")) {
                            }
                        } catch (JSONException unused) {
                        }
                    }
                    i5 = 1;
                }
                i6 = i5 - 1;
                if (i6 != 1) {
                    zzb = com.google.android.gms.ads.internal.zzt.zzr().zzb(this.zzc, VersionInfoParcel.forPackage(), this.zzd);
                } else if (i6 == 2) {
                    zzb = com.google.android.gms.ads.internal.zzt.zzr().zza(this.zzc, VersionInfoParcel.forPackage(), this.zzd);
                }
                zzbst zzbstVar = zzbsw.zza;
                this.zza = new zzbzq(this.zzc, zzb.zza("google.afma.sdkConstants.getSdkConstants", zzbstVar, zzbstVar), this.zze, this.zzf);
                this.zzg = true;
            }
            i5 = 2;
            i6 = i5 - 1;
            if (i6 != 1) {
            }
            zzbst zzbstVar2 = zzbsw.zza;
            this.zza = new zzbzq(this.zzc, zzb.zza("google.afma.sdkConstants.getSdkConstants", zzbstVar2, zzbstVar2), this.zze, this.zzf);
            this.zzg = true;
        }
        if (this.zzg && (zzbznVar = this.zza) != null) {
            j3.a zzb2 = zzbznVar.zzb();
            if (!this.zzh && ((Boolean) zzbiw.zzi.zze()).booleanValue()) {
                zzb2.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcyp
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        zzcyq.this.zzf();
                    }
                }, this.zzf);
            }
            zzcel.zza(zzb2, "persistFlagsClient");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdjy
    public final void zzd(com.google.android.gms.ads.nonagon.signalgeneration.zzbj zzbjVar) {
        zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzdel
    public final void zzdO(zzbzu zzbzuVar) {
        zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzdel
    public final void zzdP(zzfjc zzfjcVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzdjy
    public final void zze(String str) {
        zzc();
    }

    public final /* synthetic */ void zzf() {
        zzbgp.zze(this.zzc);
        this.zzh = true;
    }
}
