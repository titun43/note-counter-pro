package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import androidx.fragment.app.h1;
import java.util.concurrent.Executor;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class zzctc implements zzbde {
    private zzcjl zza;
    private final Executor zzb;
    private final zzcso zzc;
    private final x2.b zzd;
    private boolean zze = false;
    private boolean zzf = false;
    private final zzcsr zzg = new zzcsr();

    public zzctc(Executor executor, zzcso zzcsoVar, x2.b bVar) {
        this.zzb = executor;
        this.zzc = zzcsoVar;
        this.zzd = bVar;
    }

    private final void zzg() {
        try {
            final JSONObject zzb = this.zzc.zzb(this.zzg);
            if (this.zza != null) {
                this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzctb
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        zzctc.this.zzf(zzb);
                    }
                });
            }
        } catch (JSONException e4) {
            com.google.android.gms.ads.internal.util.zze.zzb("Failed to call video active view js", e4);
        }
    }

    public final void zza(zzcjl zzcjlVar) {
        this.zza = zzcjlVar;
    }

    public final void zzb() {
        this.zze = false;
    }

    public final void zzd() {
        this.zze = true;
        zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzbde
    public final void zzdj(zzbdd zzbddVar) {
        boolean z4 = this.zzf ? false : zzbddVar.zzj;
        zzcsr zzcsrVar = this.zzg;
        zzcsrVar.zza = z4;
        ((x2.c) this.zzd).getClass();
        zzcsrVar.zzd = SystemClock.elapsedRealtime();
        zzcsrVar.zzf = zzbddVar;
        if (this.zze) {
            zzg();
        }
    }

    public final void zze(boolean z4) {
        this.zzf = z4;
    }

    public final /* synthetic */ void zzf(JSONObject jSONObject) {
        String obj = jSONObject.toString();
        String b2 = h1.b(new StringBuilder(obj.length() + 31), "Calling AFMA_updateActiveView(", obj, ")");
        int i5 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzd(b2);
        this.zza.zzb("AFMA_updateActiveView", jSONObject);
    }
}
