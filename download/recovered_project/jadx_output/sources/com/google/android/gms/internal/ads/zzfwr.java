package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import androidx.emoji2.text.u;
import java.io.File;
import java.util.HashSet;

/* loaded from: classes.dex */
public final class zzfwr {
    final File zza;
    private final File zzb;
    private final SharedPreferences zzc;
    private final zzbch zzd;

    public zzfwr(Context context, zzbch zzbchVar) {
        this.zzc = context.getSharedPreferences("pcvmspf", 0);
        File dir = context.getDir("pccache", 0);
        zzfws.zzd(dir, false);
        this.zzb = dir;
        File dir2 = context.getDir("tmppccache", 0);
        zzfws.zzd(dir2, true);
        this.zza = dir2;
        this.zzd = zzbchVar;
    }

    private final File zzd() {
        File file = new File(this.zzb, Integer.toString(this.zzd.zza()));
        if (!file.exists()) {
            file.mkdir();
        }
        return file;
    }

    private final String zze() {
        int zza = this.zzd.zza();
        return u.l(new StringBuilder(String.valueOf(zza).length() + 6), "FBAMTD", zza);
    }

    private final String zzf() {
        int zza = this.zzd.zza();
        return u.l(new StringBuilder(String.valueOf(zza).length() + 6), "LATMTD", zza);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x015c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean zza(zzbcj zzbcjVar, zzfwx zzfwxVar) {
        boolean z4;
        zzbcp zzc;
        zzbcp zzc2;
        String zza = zzbcjVar.zza().zza();
        byte[] zzy = zzbcjVar.zzb().zzy();
        byte[] zzy2 = zzbcjVar.zzc().zzy();
        if (!TextUtils.isEmpty(zza) && zzy2 != null && zzy2.length != 0) {
            File file = this.zza;
            zzfws.zze(file);
            file.mkdirs();
            zzfws.zzc(zza, file).mkdirs();
            File zza2 = zzfws.zza(zza, "pcam.jar", file);
            if ((zzy == null || zzy.length <= 0 || zzfws.zzb(zza2, zzy)) && zzfws.zzb(zzfws.zza(zza, "pcbc", file), zzy2)) {
                File zza3 = zzfws.zza(zzbcjVar.zza().zza(), "pcam.jar", file);
                if (zza3.exists() && zzfwxVar != null && !zzfwxVar.zza(zza3)) {
                    return false;
                }
                String zza4 = zzbcjVar.zza().zza();
                if (!TextUtils.isEmpty(zza4)) {
                    File zza5 = zzfws.zza(zza4, "pcam.jar", file);
                    File zza6 = zzfws.zza(zza4, "pcbc", file);
                    File zza7 = zzfws.zza(zza4, "pcam.jar", zzd());
                    File zza8 = zzfws.zza(zza4, "pcbc", zzd());
                    if ((!zza5.exists() || zza5.renameTo(zza7)) && zza6.exists() && zza6.renameTo(zza8)) {
                        zzbco zzi = zzbcp.zzi();
                        zzi.zza(zzbcjVar.zza().zza());
                        zzi.zzb(zzbcjVar.zza().zzb());
                        zzi.zzd(zzbcjVar.zza().zzd());
                        zzi.zze(zzbcjVar.zza().zze());
                        zzi.zzc(zzbcjVar.zza().zzc());
                        zzbcp zzbcpVar = (zzbcp) zzi.zzbu();
                        zzbcp zzc3 = zzc(1);
                        SharedPreferences.Editor edit = this.zzc.edit();
                        if (zzc3 != null && !zzbcpVar.zza().equals(zzc3.zza())) {
                            edit.putString(zze(), x2.d.b(zzc3.zzaN()));
                        }
                        edit.putString(zzf(), x2.d.b(zzbcpVar.zzaN()));
                        if (edit.commit()) {
                            z4 = true;
                            HashSet hashSet = new HashSet();
                            zzc = zzc(1);
                            if (zzc != null) {
                                hashSet.add(zzc.zza());
                            }
                            zzc2 = zzc(2);
                            if (zzc2 != null) {
                                hashSet.add(zzc2.zza());
                            }
                            for (File file2 : zzd().listFiles()) {
                                String name = file2.getName();
                                if (!hashSet.contains(name)) {
                                    zzfws.zze(zzfws.zzc(name, zzd()));
                                }
                            }
                            return z4;
                        }
                    }
                }
                z4 = false;
                HashSet hashSet2 = new HashSet();
                zzc = zzc(1);
                if (zzc != null) {
                }
                zzc2 = zzc(2);
                if (zzc2 != null) {
                }
                while (r4 < r1) {
                }
                return z4;
            }
        }
        return false;
    }

    public final zzfwq zzb(int i5) {
        zzbcp zzc = zzc(1);
        if (zzc == null) {
            return null;
        }
        String zza = zzc.zza();
        File zza2 = zzfws.zza(zza, "pcam.jar", zzd());
        if (!zza2.exists()) {
            zza2 = zzfws.zza(zza, "pcam", zzd());
        }
        return new zzfwq(zzc, zza2, zzfws.zza(zza, "pcbc", zzd()), zzfws.zza(zza, "pcopt", zzd()));
    }

    public final zzbcp zzc(int i5) {
        String string = i5 == 1 ? this.zzc.getString(zzf(), null) : this.zzc.getString(zze(), null);
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        try {
            byte[] j2 = x2.d.j(string);
            zzbcp zzg = zzbcp.zzg(zzian.zzs(j2, 0, j2.length));
            String zza = zzg.zza();
            File zza2 = zzfws.zza(zza, "pcam.jar", zzd());
            if (!zza2.exists()) {
                zza2 = zzfws.zza(zza, "pcam", zzd());
            }
            File zza3 = zzfws.zza(zza, "pcbc", zzd());
            if (zza2.exists()) {
                if (zza3.exists()) {
                    return zzg;
                }
            }
        } catch (zzicg unused) {
        }
        return null;
    }
}
