package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.ExecutorService;

/* loaded from: classes.dex */
public final class zzgks implements zzgkg {
    private final Context zza;
    private final ExecutorService zzb;
    private final zzgce zzc;
    private final String zzd;
    private final String zze;
    private final zzgoe zzf;
    private final zzgku zzg;

    public zzgks(Context context, ExecutorService executorService, zzgbf zzgbfVar, zzgce zzgceVar, zzgoe zzgoeVar, zzgku zzgkuVar) {
        this.zza = context;
        this.zzb = executorService;
        this.zzc = zzgceVar;
        this.zzf = zzgoeVar;
        this.zzg = zzgkuVar;
        this.zzd = zzgbfVar.zzb();
        this.zze = zzgbfVar.zzi().zzc();
    }

    private static zzgds zze(int i5) {
        zzgdr zzd = zzgds.zzd();
        zzd.zze(i5);
        return (zzgds) zzd.zzbu();
    }

    @Override // com.google.android.gms.internal.ads.zzgkg
    public final j3.a zza() {
        int i5;
        zzbcc zza = zzbcd.zza();
        byte[] zza2 = zzatu.zza();
        zzian zzianVar = zzian.zza;
        zza.zza(zzian.zzs(zza2, 0, zza2.length));
        zza.zzb(Build.VERSION.SDK_INT);
        zza.zzc(Build.MODEL);
        Context context = this.zza;
        zza.zzd(context.getPackageName());
        try {
            i5 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException unused) {
            i5 = -1;
        }
        zzgce zzgceVar = this.zzc;
        zzgoe zzgoeVar = this.zzf;
        zza.zze(i5);
        zza.zzf(this.zzd);
        zzgzg zzgzgVar = (zzgzg) zzgzo.zzg((zzgzg) zzgzo.zzg((zzgzg) zzgzo.zzk(zzgzg.zzw(zzgceVar.zza(Uri.parse(this.zze).buildUpon().appendQueryParameter("aspq", zzgca.zza(((zzbcd) zza.zzbu()).zzaN(), true)).build().toString())), new zzgqt() { // from class: com.google.android.gms.internal.ads.zzgkr
            @Override // com.google.android.gms.internal.ads.zzgqt
            public final /* synthetic */ Object apply(Object obj) {
                return zzgks.this.zzb((zzgcd) obj);
            }
        }, this.zzb), UnknownHostException.class, new zzgqt() { // from class: com.google.android.gms.internal.ads.zzgkp
            @Override // com.google.android.gms.internal.ads.zzgqt
            public final /* synthetic */ Object apply(Object obj) {
                return zzgks.this.zzc((UnknownHostException) obj);
            }
        }, zzhaf.zza()), SocketException.class, new zzgqt() { // from class: com.google.android.gms.internal.ads.zzgkq
            @Override // com.google.android.gms.internal.ads.zzgqt
            public final /* synthetic */ Object apply(Object obj) {
                return zzgks.this.zzd((SocketException) obj);
            }
        }, zzhaf.zza());
        zzgoeVar.zze(20002, zzgzgVar);
        return zzgzgVar;
    }

    public final /* synthetic */ zzgds zzb(zzgcd zzgcdVar) {
        if (zzgcdVar.zza() != 200) {
            this.zzf.zzc(20003, new String(zzatu.zza(), StandardCharsets.UTF_8));
            return zze(7);
        }
        try {
            String zzb = zzgcdVar.zzb();
            if (TextUtils.isEmpty(zzb)) {
                this.zzf.zzb(20004);
                return zze(8);
            }
            zzbcf zzb2 = zzbcf.zzb(zzgca.zzb(zzb, true), zzibb.zzb());
            if (zzb2.zza().zzc() && zzb2.zza().zza()) {
                if (!this.zzg.zza(zzb2)) {
                    this.zzf.zzb(20006);
                    return zze(12);
                }
                zzgdr zzd = zzgds.zzd();
                zzgdt zze = zzgdu.zze();
                zze.zzb(zzb2.zza().zzb());
                zzd.zzb(zze);
                zzd.zzc(zzb2.zza().zzd());
                zzd.zze(2);
                return (zzgds) zzd.zzbu();
            }
            this.zzf.zzb(20004);
            return zze(8);
        } catch (Throwable th) {
            this.zzf.zzd(20005, th);
            return zze(6);
        }
    }

    public final /* synthetic */ zzgds zzc(UnknownHostException unknownHostException) {
        this.zzf.zzb(20007);
        return zze(13);
    }

    public final /* synthetic */ zzgds zzd(SocketException socketException) {
        this.zzf.zzb(20008);
        return zze(13);
    }
}
