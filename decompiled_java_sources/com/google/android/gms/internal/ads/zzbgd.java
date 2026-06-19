package com.google.android.gms.internal.ads;

import android.os.Environment;
import android.os.SystemClock;
import android.util.Base64;
import com.google.android.gms.internal.ads.zzbgj;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/* loaded from: classes.dex */
public final class zzbgd {
    private final zzbgi zza;
    private final zzbgj.zzt.zza zzb;
    private final boolean zzc;

    private zzbgd() {
        this.zzb = zzbgj.zzt.zzx();
        this.zzc = false;
        this.zza = new zzbgi();
    }

    public static zzbgd zza() {
        return new zzbgd();
    }

    private final synchronized void zzd(int i5) {
        zzbgj.zzt.zza zzaVar = this.zzb;
        zzaVar.zzE();
        zzaVar.zzD(com.google.android.gms.ads.internal.util.zzs.zzk());
        zzbgh zzbghVar = new zzbgh(this.zza, zzaVar.zzbu().zzaN(), null);
        int i6 = i5 - 1;
        zzbghVar.zzb(i6);
        zzbghVar.zza();
        com.google.android.gms.ads.internal.util.zze.zza("Logging Event with event code : ".concat(String.valueOf(Integer.toString(i6, 10))));
    }

    private final synchronized void zze(int i5) {
        File externalStorageDirectory = Environment.getExternalStorageDirectory();
        if (externalStorageDirectory == null) {
            return;
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(new File(zzfxl.zza().zza(externalStorageDirectory, "clearcut_events.txt")), true);
            try {
                try {
                    fileOutputStream.write(zzf(i5).getBytes());
                } catch (IOException unused) {
                    com.google.android.gms.ads.internal.util.zze.zza("Could not write Clearcut to file.");
                    try {
                        fileOutputStream.close();
                    } catch (IOException unused2) {
                        com.google.android.gms.ads.internal.util.zze.zza("Could not close Clearcut output stream.");
                    }
                }
            } finally {
                try {
                    fileOutputStream.close();
                } catch (IOException unused3) {
                    com.google.android.gms.ads.internal.util.zze.zza("Could not close Clearcut output stream.");
                }
            }
        } catch (FileNotFoundException unused4) {
            com.google.android.gms.ads.internal.util.zze.zza("Could not find file for Clearcut");
        }
    }

    private final synchronized String zzf(int i5) {
        StringBuilder sb;
        zzbgj.zzt.zza zzaVar = this.zzb;
        String zzf = zzaVar.zzf();
        ((x2.c) com.google.android.gms.ads.internal.zzt.zzk()).getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        String encodeToString = Base64.encodeToString(zzaVar.zzbu().zzaN(), 3);
        sb = new StringBuilder("id=");
        sb.append(zzf);
        sb.append(",timestamp=");
        sb.append(elapsedRealtime);
        sb.append(",event=");
        sb.append(i5 - 1);
        sb.append(",data=");
        sb.append(encodeToString);
        sb.append("\n");
        return sb.toString();
    }

    public final synchronized void zzb(zzbgc zzbgcVar) {
        if (this.zzc) {
            try {
                zzbgcVar.zza(this.zzb);
            } catch (NullPointerException e4) {
                com.google.android.gms.ads.internal.zzt.zzh().zzg(e4, "AdMobClearcutLogger.modify");
            }
        }
    }

    public final synchronized void zzc(int i5) {
        if (this.zzc) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzge)).booleanValue()) {
                zze(i5);
            } else {
                zzd(i5);
            }
        }
    }

    public zzbgd(zzbgi zzbgiVar) {
        this.zzb = zzbgj.zzt.zzx();
        this.zza = zzbgiVar;
        this.zzc = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzgd)).booleanValue();
    }
}
