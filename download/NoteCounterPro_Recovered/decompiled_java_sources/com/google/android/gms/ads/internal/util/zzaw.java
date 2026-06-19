package com.google.android.gms.ads.internal.util;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import java.util.Objects;

/* loaded from: classes.dex */
final class zzaw implements Runnable {
    final /* synthetic */ Context zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ boolean zzc;
    final /* synthetic */ boolean zzd;

    public zzaw(zzax zzaxVar, Context context, String str, boolean z4, boolean z5) {
        this.zza = context;
        this.zzb = str;
        this.zzc = z4;
        this.zzd = z5;
        Objects.requireNonNull(zzaxVar);
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.android.gms.ads.internal.zzt.zzc();
        Context context = this.zza;
        AlertDialog.Builder zzP = zzs.zzP(context);
        zzP.setMessage(this.zzb);
        if (this.zzc) {
            zzP.setTitle("Error");
        } else {
            zzP.setTitle("Info");
        }
        if (this.zzd) {
            zzP.setNeutralButton("Dismiss", (DialogInterface.OnClickListener) null);
        } else {
            zzP.setPositiveButton("Learn More", new zzav(this, context));
            zzP.setNegativeButton("Dismiss", (DialogInterface.OnClickListener) null);
        }
        zzP.create().show();
    }
}
