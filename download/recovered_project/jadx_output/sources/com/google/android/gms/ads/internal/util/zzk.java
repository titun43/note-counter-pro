package com.google.android.gms.ads.internal.util;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.emoji2.text.p;
import com.google.android.gms.internal.ads.zzbie;
import com.google.android.gms.internal.ads.zzbif;
import com.google.android.gms.internal.ads.zzikw;
import java.util.Objects;
import n.l;
import v.a;

/* loaded from: classes.dex */
final class zzk implements zzbie {
    final /* synthetic */ zzbif zza;
    final /* synthetic */ Bundle zzb;
    final /* synthetic */ Context zzc;
    final /* synthetic */ Uri zzd;

    public zzk(zzs zzsVar, zzbif zzbifVar, Bundle bundle, Context context, Uri uri) {
        this.zza = zzbifVar;
        this.zzb = bundle;
        this.zzc = context;
        this.zzd = uri;
        Objects.requireNonNull(zzsVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbie
    public final void zza() {
        zzbif zzbifVar = this.zza;
        l lVar = new l(zzbifVar.zzc());
        zzs.zzak(lVar, this.zzb);
        p a5 = lVar.a();
        Intent intent = (Intent) a5.h;
        Context context = this.zzc;
        intent.setPackage(zzikw.zza(context));
        intent.setData(this.zzd);
        a.startActivity(context, intent, (Bundle) a5.f274i);
        zzbifVar.zzb((Activity) context);
    }
}
