package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import com.google.android.gms.ads.RequestConfiguration;
import java.io.ByteArrayInputStream;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.ArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class zzbay extends zzbby {
    private static final zzbbz zzh = new zzbbz();
    private final zzavz zzi;
    private final Context zzj;
    private final zzaye zzk;

    public zzbay(zzbak zzbakVar, String str, String str2, zzawg zzawgVar, int i5, int i6, Context context, zzavs zzavsVar, zzavz zzavzVar, zzaye zzayeVar) {
        super(zzbakVar, "ZQJAB1msowxCz8mqmvl8OKnBprztAFjM8nst6XEIBWdYMrqlQRx5Smd7STWtlGuv", "xxbBAKX4fynezd8sgu9AN42lCipqUqelmvdX3g0EV6w=", zzawgVar, i5, 27);
        this.zzj = context;
        this.zzi = zzavzVar;
        this.zzk = zzayeVar;
    }

    private final zzayb zzc() {
        int zzb;
        String str;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzdt)).booleanValue()) {
            zzb = ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzdz)).intValue();
        } else {
            zzb = this.zzi.zzb();
        }
        zzayb zzaybVar = new zzayb((String) this.zze.invoke(null, this.zzj, Boolean.FALSE, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED));
        zzaye zzayeVar = this.zzk;
        if (zzayeVar != null && zzayeVar.zza() != null) {
            try {
                str = (String) zzayeVar.zza().get(zzb, TimeUnit.MILLISECONDS);
            } catch (InterruptedException | ExecutionException | TimeoutException unused) {
            }
            zzaybVar.zza = str;
            return zzaybVar;
        }
        str = "E";
        zzaybVar.zza = str;
        return zzaybVar;
    }

    private final String zzd() {
        try {
            zzbak zzbakVar = this.zza;
            if (zzbakVar.zzm() != null) {
                zzbakVar.zzm().get();
            }
            zzaxg zzl = zzbakVar.zzl();
            if (zzl == null || !zzl.zza()) {
                return null;
            }
            return zzl.zzb();
        } catch (InterruptedException | ExecutionException unused) {
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbby
    public final void zza() {
        int i5;
        zzayb zzaybVar;
        zzayb zzaybVar2;
        zzbbz zzbbzVar = zzh;
        Context context = this.zzj;
        AtomicReference zza = zzbbzVar.zza(context.getPackageName());
        synchronized (zza) {
            try {
                zzayb zzaybVar3 = (zzayb) zza.get();
                if (zzaybVar3 != null) {
                    if (!zzban.zzc(zzaybVar3.zza)) {
                        if (!zzaybVar3.zza.equals("E")) {
                            if (zzaybVar3.zza.equals("0000000000000000000000000000000000000000000000000000000000000000")) {
                            }
                            zzaybVar2 = (zzayb) zza.get();
                        }
                    }
                }
                if (zzban.zzc(null)) {
                    zzban.zzc(null);
                    i5 = 3;
                } else {
                    i5 = 5;
                }
                if (this.zzk != null) {
                    zzaybVar = zzc();
                } else {
                    boolean z4 = false;
                    if (i5 == 3 && !this.zzi.zza()) {
                        z4 = true;
                    }
                    Boolean valueOf = Boolean.valueOf(z4);
                    Boolean bool = (Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzdh);
                    String zzb = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzdg)).booleanValue() ? zzb() : null;
                    if (bool.booleanValue() && this.zza.zzi() && zzban.zzc(zzb)) {
                        zzb = zzd();
                    }
                    zzayb zzaybVar4 = new zzayb((String) this.zze.invoke(null, context, valueOf, zzb));
                    String str = zzaybVar4.zza;
                    if (zzban.zzc(str) || str.equals("E")) {
                        int i6 = i5 - 1;
                        if (i6 == 3) {
                            String zzd = zzd();
                            if (!zzban.zzc(zzd)) {
                                zzaybVar4.zza = zzd;
                            }
                        } else if (i6 == 4) {
                            throw null;
                        }
                    }
                    zzaybVar = zzaybVar4;
                }
                zza.set(zzaybVar);
                zzaybVar2 = (zzayb) zza.get();
            } finally {
            }
        }
        zzawg zzawgVar = this.zzd;
        synchronized (zzawgVar) {
            if (zzaybVar2 != null) {
                try {
                    zzawgVar.zzo(zzaybVar2.zza);
                    zzawgVar.zzu(zzaybVar2.zzb);
                    zzawgVar.zzt(zzaybVar2.zzc);
                    zzawgVar.zzD(zzaybVar2.zzd);
                    zzawgVar.zzE(zzaybVar2.zze);
                } finally {
                }
            }
        }
    }

    public final String zzb() {
        try {
            CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
            byte[] zzb = zzban.zzb((String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzdi));
            ArrayList arrayList = new ArrayList();
            arrayList.add(certificateFactory.generateCertificate(new ByteArrayInputStream(zzb)));
            if (!Build.TYPE.equals("user")) {
                arrayList.add(certificateFactory.generateCertificate(new ByteArrayInputStream(zzban.zzb((String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzdj)))));
            }
            Context context = this.zzj;
            return zzbcb.zza(context, context.getPackageName(), arrayList, this.zza.zzd());
        } catch (PackageManager.NameNotFoundException | InterruptedException | NoClassDefFoundError | CertificateEncodingException | CertificateException | ExecutionException unused) {
            return null;
        }
    }
}
