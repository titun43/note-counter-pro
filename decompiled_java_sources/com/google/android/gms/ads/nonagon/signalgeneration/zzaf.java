package com.google.android.gms.ads.nonagon.signalgeneration;

import android.net.Uri;
import android.os.RemoteException;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.internal.ads.zzbhe;
import com.google.android.gms.internal.ads.zzbyh;
import com.google.android.gms.internal.ads.zzgzl;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
final class zzaf implements zzgzl {
    final /* synthetic */ zzbyh zza;
    final /* synthetic */ boolean zzb;
    final /* synthetic */ zzau zzc;

    public zzaf(zzau zzauVar, zzbyh zzbyhVar, boolean z4) {
        this.zza = zzbyhVar;
        this.zzb = z4;
        Objects.requireNonNull(zzauVar);
        this.zzc = zzauVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgzl
    public final void zza(Throwable th) {
        try {
            zzbyh zzbyhVar = this.zza;
            String message = th.getMessage();
            StringBuilder sb = new StringBuilder(String.valueOf(message).length() + 16);
            sb.append("Internal error: ");
            sb.append(message);
            zzbyhVar.zzf(sb.toString());
        } catch (RemoteException e4) {
            int i5 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e4);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgzl
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        Uri zzZ;
        List<Uri> list = (List) obj;
        try {
            zzau zzauVar = this.zzc;
            zzauVar.zzw(list);
            this.zza.zze(list);
            if (!zzauVar.zzD() && !this.zzb) {
                return;
            }
            for (Uri uri : list) {
                if (zzauVar.zzd(uri)) {
                    zzZ = zzau.zzZ(uri, zzauVar.zzM(), "1");
                    zzauVar.zzB().zzb(zzZ.toString(), null, null, null);
                } else {
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zziu)).booleanValue()) {
                        zzauVar.zzB().zzb(uri.toString(), null, null, null);
                    }
                }
            }
        } catch (RemoteException e4) {
            int i5 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e4);
        }
    }
}
