package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Build;
import android.os.Bundle;
import android.os.Process;
import android.os.RemoteException;
import android.os.ext.SdkExtensions;
import g4.i;
import java.util.List;

/* loaded from: classes.dex */
final class zzaqt extends zzaqr {
    private int zza = 0;
    private final Context zzb;
    private final String zzc;
    private zzbcx zzd;
    private ServiceConnection zze;

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0025, code lost:
    
        if (b0.b.a("UpsideDownCake") != false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public zzaqt(Context context) {
        int extensionVersion;
        boolean isSdkSandbox;
        String clientPackageName;
        this.zzb = context.getApplicationContext();
        int i5 = b0.b.f684a;
        int i6 = Build.VERSION.SDK_INT;
        if (i6 < 34) {
            if (i6 >= 33) {
                i.d(Build.VERSION.CODENAME, "CODENAME");
            }
            clientPackageName = context.getPackageName();
            this.zzc = clientPackageName;
        }
        extensionVersion = SdkExtensions.getExtensionVersion(34);
        if (extensionVersion >= 8) {
            isSdkSandbox = Process.isSdkSandbox();
            clientPackageName = isSdkSandbox ? a.m(context.getSystemService(a.o())).getClientPackageName() : context.getPackageName();
            this.zzc = clientPackageName;
        }
        clientPackageName = context.getPackageName();
        this.zzc = clientPackageName;
    }

    @Override // com.google.android.gms.internal.ads.zzaqr
    public final boolean zza() {
        return (this.zza != 2 || this.zzd == null || this.zze == null) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.zzaqr
    public final void zzb(zzaqu zzaquVar) {
        ServiceInfo serviceInfo;
        if (zza()) {
            zzaqw.zza("InstallReferrerClient", "Service connection is valid. No need to re-initialize.");
            zzaquVar.zza(0);
            return;
        }
        int i5 = this.zza;
        if (i5 == 1) {
            zzaqw.zzb("InstallReferrerClient", "Client is already in the process of connecting to the service.");
            zzaquVar.zza(3);
            return;
        }
        if (i5 == 3) {
            zzaqw.zzb("InstallReferrerClient", "Client was already closed and can't be reused. Please create another instance.");
            zzaquVar.zza(3);
            return;
        }
        zzaqw.zza("InstallReferrerClient", "Starting install referrer service setup.");
        Intent intent = new Intent("com.google.android.finsky.BIND_GET_INSTALL_REFERRER_SERVICE");
        intent.setComponent(new ComponentName("com.android.vending", "com.google.android.finsky.externalreferrer.GetInstallReferrerService"));
        Context context = this.zzb;
        List<ResolveInfo> queryIntentServices = context.getPackageManager().queryIntentServices(intent, 0);
        if (queryIntentServices == null || queryIntentServices.isEmpty() || (serviceInfo = queryIntentServices.get(0).serviceInfo) == null) {
            this.zza = 0;
            zzaqw.zza("InstallReferrerClient", "Install Referrer service unavailable on device.");
            zzaquVar.zza(2);
            return;
        }
        String str = serviceInfo.packageName;
        String str2 = serviceInfo.name;
        if ("com.android.vending".equals(str) && str2 != null) {
            try {
                if (context.getPackageManager().getPackageInfo("com.android.vending", 128).versionCode >= 80837300) {
                    Intent intent2 = new Intent(intent);
                    zzaqs zzaqsVar = new zzaqs(this, zzaquVar, null);
                    this.zze = zzaqsVar;
                    try {
                        if (this.zzb.bindService(intent2, zzaqsVar, 1)) {
                            zzaqw.zza("InstallReferrerClient", "Service was bonded successfully.");
                            return;
                        }
                        zzaqw.zzb("InstallReferrerClient", "Connection to service is blocked.");
                        this.zza = 0;
                        zzaquVar.zza(1);
                        return;
                    } catch (SecurityException unused) {
                        zzaqw.zzb("InstallReferrerClient", "No permission to connect to service.");
                        this.zza = 0;
                        zzaquVar.zza(4);
                        return;
                    }
                }
            } catch (PackageManager.NameNotFoundException unused2) {
            }
        }
        zzaqw.zzb("InstallReferrerClient", "Play Store missing or incompatible. Version 8.3.73 or later required.");
        this.zza = 0;
        zzaquVar.zza(2);
    }

    @Override // com.google.android.gms.internal.ads.zzaqr
    public final void zzc() {
        this.zza = 3;
        if (this.zze != null) {
            zzaqw.zza("InstallReferrerClient", "Unbinding from service.");
            this.zzb.unbindService(this.zze);
            this.zze = null;
        }
        this.zzd = null;
    }

    @Override // com.google.android.gms.internal.ads.zzaqr
    public final zzaqv zzd() {
        if (!zza()) {
            throw new IllegalStateException("Service not connected. Please start a connection before using the service.");
        }
        Bundle bundle = new Bundle();
        bundle.putString("package_name", this.zzc);
        try {
            return new zzaqv(this.zzd.zze(bundle));
        } catch (RemoteException e4) {
            zzaqw.zzb("InstallReferrerClient", "RemoteException getting install referrer information");
            this.zza = 0;
            throw e4;
        }
    }

    public final /* synthetic */ void zze(int i5) {
        this.zza = i5;
    }

    public final /* synthetic */ void zzf(zzbcx zzbcxVar) {
        this.zzd = zzbcxVar;
    }
}
