package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.RemoteException;
import android.text.TextUtils;
import java.util.List;
import n.h;
import n.n;
import n.o;

/* loaded from: classes.dex */
public final class zzbif {
    private o zza;
    private h zzb;
    private n zzc;
    private zzbie zzd;

    public static boolean zza(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (packageManager != null) {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.example.com"));
            ResolveInfo resolveActivity = packageManager.resolveActivity(intent, 0);
            List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(intent, 65536);
            if (queryIntentActivities != null && resolveActivity != null) {
                for (int i5 = 0; i5 < queryIntentActivities.size(); i5++) {
                    if (resolveActivity.activityInfo.name.equals(queryIntentActivities.get(i5).activityInfo.name)) {
                        return resolveActivity.activityInfo.packageName.equals(zzikw.zza(context));
                    }
                }
            }
        }
        return false;
    }

    public final void zzb(Activity activity) {
        n nVar = this.zzc;
        if (nVar == null) {
            return;
        }
        activity.unbindService(nVar);
        this.zzb = null;
        this.zza = null;
        this.zzc = null;
    }

    public final o zzc() {
        h hVar = this.zzb;
        if (hVar == null) {
            this.zza = null;
        } else if (this.zza == null) {
            this.zza = hVar.b(null);
        }
        return this.zza;
    }

    public final void zzd(zzbie zzbieVar) {
        this.zzd = zzbieVar;
    }

    public final void zze(Activity activity) {
        String zza;
        if (this.zzb == null && (zza = zzikw.zza(activity)) != null) {
            zzikx zzikxVar = new zzikx(this);
            this.zzc = zzikxVar;
            zzikxVar.setApplicationContext(activity.getApplicationContext());
            Intent intent = new Intent("android.support.customtabs.action.CustomTabsService");
            if (!TextUtils.isEmpty(zza)) {
                intent.setPackage(zza);
            }
            activity.bindService(intent, zzikxVar, 33);
        }
    }

    public final void zzf(h hVar) {
        this.zzb = hVar;
        hVar.getClass();
        try {
            ((b.b) hVar.f2630a).e();
        } catch (RemoteException unused) {
        }
        zzbie zzbieVar = this.zzd;
        if (zzbieVar != null) {
            zzbieVar.zza();
        }
    }

    public final void zzg() {
        this.zzb = null;
        this.zza = null;
    }
}
