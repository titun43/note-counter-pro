package com.google.android.gms.internal.consent_sdk;

import android.R;
import android.app.Activity;
import android.app.Application;
import android.app.Dialog;
import android.graphics.drawable.ColorDrawable;
import android.view.Window;
import com.google.android.gms.ads.RequestConfiguration;
import i3.c;
import i3.d;
import i3.k;
import i3.l;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import y4.b;

/* loaded from: classes.dex */
public final class zzbe implements d {
    private final Application zzc;
    private final zzbz zzd;
    private final zzaq zze;
    private final zzbs zzf;
    private final zztm zzg;
    private final zzcr zzh;
    private Dialog zzi;
    private zzbx zzj;
    private final AtomicBoolean zzk = new AtomicBoolean();
    private final AtomicReference zzl = new AtomicReference();
    private final AtomicReference zzm = new AtomicReference();
    private final AtomicReference zzn = new AtomicReference();
    boolean zza = false;
    boolean zzb = false;

    public zzbe(Application application, zzad zzadVar, zzbz zzbzVar, zzaq zzaqVar, zzbs zzbsVar, zztm zztmVar, zzcr zzcrVar) {
        this.zzc = application;
        this.zzd = zzbzVar;
        this.zze = zzaqVar;
        this.zzf = zzbsVar;
        this.zzg = zztmVar;
        this.zzh = zzcrVar;
    }

    private final void zzk() {
        Dialog dialog = this.zzi;
        if (dialog != null) {
            dialog.dismiss();
            this.zzi = null;
        }
        this.zzd.zza(null);
        zzbb zzbbVar = (zzbb) this.zzn.getAndSet(null);
        if (zzbbVar != null) {
            zzbbVar.zzb();
        }
    }

    private final void zzl(zzg zzgVar) {
        if (this.zza) {
            return;
        }
        String message = zzgVar == null ? null : zzgVar.getMessage();
        if (this.zzb) {
            this.zzh.zzb(message);
        } else {
            this.zzh.zze(message);
        }
    }

    @Override // i3.d
    public final void show(Activity activity, c cVar) {
        zzcz.zza();
        this.zzh.zzf();
        if (!this.zzk.compareAndSet(false, true)) {
            zzg zzgVar = new zzg(3, true != this.zza ? "ConsentForm#show can only be invoked once." : "Privacy options form is being loading. Please try again later.");
            zzl(zzgVar);
            cVar.a(zzgVar.zza());
            return;
        }
        this.zzj.zzc();
        zzbb zzbbVar = new zzbb(this, activity);
        this.zzc.registerActivityLifecycleCallbacks(zzbbVar);
        this.zzn.set(zzbbVar);
        this.zzd.zza(activity);
        Dialog dialog = new Dialog(activity, R.style.Theme.Translucent.NoTitleBar);
        dialog.setContentView(this.zzj);
        dialog.setCancelable(false);
        Window window = dialog.getWindow();
        if (window == null) {
            zzg zzgVar2 = new zzg(3, "Activity with null windows is passed in.");
            zzl(zzgVar2);
            cVar.a(zzgVar2.zza());
            return;
        }
        window.setLayout(-1, -1);
        window.setBackgroundDrawable(new ColorDrawable(0));
        window.setFlags(16777216, 16777216);
        b.O(window);
        this.zzm.set(cVar);
        dialog.show();
        this.zzi = dialog;
        this.zzj.zzd("UMP_messagePresented", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
        zzl(null);
    }

    public final zzbx zzc() {
        return this.zzj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void zzf(l lVar, k kVar) {
        this.zzj = ((zzby) this.zzg).zzb();
        if (!this.zza) {
            this.zzh.zzi();
        }
        zzbx zzbxVar = this.zzj;
        zzbxVar.setBackgroundColor(0);
        zzbxVar.getSettings().setJavaScriptEnabled(true);
        zzbxVar.getSettings().setAllowFileAccess(false);
        zzbxVar.getSettings().setAllowContentAccess(false);
        Object[] objArr = 0;
        zzbxVar.setWebViewClient(new zzbv(zzbxVar, null));
        if (!this.zza) {
            this.zzh.zzj();
        }
        this.zzl.set(new zzbc(lVar, kVar, objArr == true ? 1 : 0));
        zzbx zzbxVar2 = this.zzj;
        zzbs zzbsVar = this.zzf;
        zzbxVar2.loadDataWithBaseURL(zzbsVar.zza(), zzbsVar.zzb(), "text/html", "UTF-8", null);
        zzcz.zza.postDelayed(new Runnable() { // from class: com.google.android.gms.internal.consent_sdk.zzba
            @Override // java.lang.Runnable
            public final void run() {
                zzbe.this.zzj(new zzg(4, "Web view timed out."));
            }
        }, 10000L);
    }

    public final void zzg(int i5) {
        zzk();
        c cVar = (c) this.zzm.getAndSet(null);
        if (cVar == null) {
            return;
        }
        this.zze.zzg(i5);
        cVar.a(null);
    }

    public final void zzh(zzg zzgVar) {
        zzk();
        c cVar = (c) this.zzm.getAndSet(null);
        if (cVar == null) {
            return;
        }
        zzl(zzgVar);
        cVar.a(zzgVar.zza());
    }

    public final void zzi() {
        zzbc zzbcVar = (zzbc) this.zzl.getAndSet(null);
        if (zzbcVar == null) {
            return;
        }
        if (!this.zza && !this.zzb) {
            this.zzh.zzd(null);
        }
        zzbcVar.onConsentFormLoadSuccess(this);
    }

    public final void zzj(zzg zzgVar) {
        zzbc zzbcVar = (zzbc) this.zzl.getAndSet(null);
        if (zzbcVar == null) {
            return;
        }
        if (!this.zza) {
            String message = zzgVar.getMessage();
            if (this.zzb) {
                this.zzh.zzb(message);
            } else {
                this.zzh.zzd(message);
            }
        }
        zzbcVar.onConsentFormLoadFailure(zzgVar.zza());
    }
}
