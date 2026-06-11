package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.RemoteException;
import android.text.TextUtils;
import java.util.concurrent.atomic.AtomicBoolean;
import n.h;
import n.n;
import n.o;

/* loaded from: classes.dex */
public final class zzbid extends n {
    public static final /* synthetic */ int zza = 0;
    private final AtomicBoolean zzb = new AtomicBoolean(false);
    private Context zzc;
    private zzdxz zzd;
    private o zze;
    private h zzf;

    private final void zzf(Context context) {
        String a5;
        if (this.zzf != null || context == null || (a5 = h.a(context)) == null || a5.equals(context.getPackageName())) {
            return;
        }
        setApplicationContext(context.getApplicationContext());
        Intent intent = new Intent("android.support.customtabs.action.CustomTabsService");
        if (!TextUtils.isEmpty(a5)) {
            intent.setPackage(a5);
        }
        context.bindService(intent, this, 33);
    }

    @Override // n.n
    public final void onCustomTabsServiceConnected(ComponentName componentName, h hVar) {
        this.zzf = hVar;
        hVar.getClass();
        try {
            ((b.b) hVar.f2630a).e();
        } catch (RemoteException unused) {
        }
        this.zze = hVar.b(new zzbia(this));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.zzf = null;
        this.zze = null;
    }

    public final void zza(Context context, zzdxz zzdxzVar) {
        if (this.zzb.getAndSet(true)) {
            return;
        }
        this.zzc = context;
        this.zzd = zzdxzVar;
        zzf(context);
    }

    public final o zzb() {
        if (this.zze == null) {
            zzcei.zza.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbic
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzbid.this.zzd();
                }
            });
        }
        return this.zze;
    }

    public final void zzc(final int i5) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzfy)).booleanValue() || this.zzd == null) {
            return;
        }
        zzcei.zza.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbib
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzbid.this.zze(i5);
            }
        });
    }

    public final /* synthetic */ void zzd() {
        zzf(this.zzc);
    }

    public final /* synthetic */ void zze(int i5) {
        zzdxz zzdxzVar = this.zzd;
        if (zzdxzVar != null) {
            zzdxy zza2 = zzdxzVar.zza();
            zza2.zzc("action", "cct_nav");
            zza2.zzc("cct_navs", String.valueOf(i5));
            zza2.zzd();
        }
    }
}
