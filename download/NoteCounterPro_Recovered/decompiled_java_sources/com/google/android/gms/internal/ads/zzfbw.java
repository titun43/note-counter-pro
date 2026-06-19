package com.google.android.gms.internal.ads;

import android.content.ContentResolver;
import android.content.Context;
import android.provider.Settings;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import java.io.IOException;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class zzfbw implements zzfax {
    private final Context zza;
    private final ScheduledExecutorService zzb;
    private final Executor zzc;
    private final int zzd;
    private final boolean zze;
    private final boolean zzf;
    private final zzcdm zzg;

    public zzfbw(zzcdm zzcdmVar, Context context, ScheduledExecutorService scheduledExecutorService, Executor executor, int i5, boolean z4, boolean z5) {
        this.zzg = zzcdmVar;
        this.zza = context;
        this.zzb = scheduledExecutorService;
        this.zzc = executor;
        this.zzd = i5;
        this.zze = z4;
        this.zzf = z5;
    }

    @Override // com.google.android.gms.internal.ads.zzfax
    public final j3.a zza() {
        zzgzg zzw = zzgzg.zzw(this.zzg.zza(this.zza, this.zzd));
        zzgqt zzgqtVar = new zzgqt() { // from class: com.google.android.gms.internal.ads.zzfbv
            @Override // com.google.android.gms.internal.ads.zzgqt
            public final /* synthetic */ Object apply(Object obj) {
                return zzfbw.this.zzc((AdvertisingIdClient.Info) obj);
            }
        };
        Executor executor = this.zzc;
        return (zzgzg) zzgzo.zzg((zzgzg) zzgzo.zzi((zzgzg) zzgzo.zzk(zzw, zzgqtVar, executor), ((Long) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzbC)).longValue(), TimeUnit.MILLISECONDS, this.zzb), Throwable.class, new zzgqt() { // from class: com.google.android.gms.internal.ads.zzfbu
            @Override // com.google.android.gms.internal.ads.zzgqt
            public final /* synthetic */ Object apply(Object obj) {
                return zzfbw.this.zzd((Throwable) obj);
            }
        }, executor);
    }

    @Override // com.google.android.gms.internal.ads.zzfax
    public final int zzb() {
        return 40;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x002c, code lost:
    
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(com.google.android.gms.internal.ads.zzbhe.zzdX)).booleanValue() == false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0019, code lost:
    
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(com.google.android.gms.internal.ads.zzbhe.zzdW)).booleanValue() == false) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final /* synthetic */ zzfbx zzc(AdvertisingIdClient.Info info) {
        zzgah zzgahVar = new zzgah();
        if (this.zze) {
        }
        try {
            Context context = this.zza;
            zzgal zzh = zzgal.zzh(context);
            Objects.requireNonNull(info);
            String id = info.getId();
            Objects.requireNonNull(id);
            zzgahVar = zzh.zzj(id, context.getPackageName(), ((Long) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzec)).longValue(), this.zzf);
        } catch (IOException | IllegalArgumentException e4) {
            com.google.android.gms.ads.internal.zzt.zzh().zzg(e4, "AdIdInfoSignalSource.getPaidV1");
            zzgahVar = new zzgah();
        }
        return new zzfbx(info, null, zzgahVar);
    }

    public final /* synthetic */ zzfbx zzd(Throwable th) {
        com.google.android.gms.ads.internal.client.zzbb.zza();
        ContentResolver contentResolver = this.zza.getContentResolver();
        return new zzfbx(null, contentResolver == null ? null : Settings.Secure.getString(contentResolver, "android_id"), new zzgah());
    }
}
