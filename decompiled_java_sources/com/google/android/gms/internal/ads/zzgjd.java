package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import androidx.emoji2.text.u;
import java.io.File;
import java.util.HashSet;

/* loaded from: classes.dex */
public final class zzgjd {
    final File zza;
    private final File zzb;
    private final SharedPreferences zzc;
    private final zzika zzd;
    private final zzgoe zze;

    public zzgjd(Context context, SharedPreferences sharedPreferences, zzika zzikaVar, zzgoe zzgoeVar) {
        this.zzc = sharedPreferences;
        File dir = context.getDir("pccache2", 0);
        zzfws.zzd(dir, false);
        this.zzb = dir;
        File dir2 = context.getDir("tmppccache2", 0);
        zzfws.zzd(dir2, true);
        this.zza = dir2;
        this.zzd = zzikaVar;
        this.zze = zzgoeVar;
    }

    private final File zzd() {
        File file = new File(this.zzb, Integer.toString(((zzbch) this.zzd.zzb()).zza()));
        if (!file.exists()) {
            file.mkdir();
        }
        return file;
    }

    private final String zze() {
        int zza = ((zzbch) this.zzd.zzb()).zza();
        return u.l(new StringBuilder(String.valueOf(zza).length() + 6), "FBAMTD", zza);
    }

    private final String zzf() {
        int zza = ((zzbch) this.zzd.zzb()).zza();
        return u.l(new StringBuilder(String.valueOf(zza).length() + 6), "LATMTD", zza);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x012b A[LOOP:0: B:24:0x012b->B:30:0x0148, LOOP_START, PHI: r2
      0x012b: PHI (r2v1 int) = (r2v0 int), (r2v2 int) binds: [B:23:0x0129, B:30:0x0148] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean zza(zzgdu zzgduVar, byte[] bArr, byte[] bArr2) {
        boolean z4;
        zzgdu zzc;
        zzgdu zzc2;
        File[] listFiles;
        String zza = zzgduVar.zza().zza();
        if (!TextUtils.isEmpty(zza) && bArr2.length != 0) {
            File file = this.zza;
            zzfws.zze(file);
            file.mkdirs();
            File zzc3 = zzfws.zzc(zza, file);
            zzc3.getClass();
            zzc3.mkdirs();
            File zza2 = zzfws.zza(zza, "pcam.jar", file);
            zza2.getClass();
            if (bArr == null || bArr.length <= 0 || zzfws.zzb(zza2, bArr)) {
                File zza3 = zzfws.zza(zza, "pcbc", file);
                zza3.getClass();
                if (zzfws.zzb(zza3, bArr2)) {
                    String zza4 = zzgduVar.zza().zza();
                    if (!TextUtils.isEmpty(zza4)) {
                        File zza5 = zzfws.zza(zza4, "pcam.jar", file);
                        zza5.getClass();
                        File zza6 = zzfws.zza(zza4, "pcbc", file);
                        zza6.getClass();
                        File zza7 = zzfws.zza(zza4, "pcam.jar", zzd());
                        zza7.getClass();
                        File zza8 = zzfws.zza(zza4, "pcbc", zzd());
                        zza8.getClass();
                        if (zza5.exists() && !zza5.renameTo(zza7)) {
                            this.zze.zzb(15318);
                        } else if (zza6.exists() && zza6.renameTo(zza8)) {
                            zzgdu zzc4 = zzc(1);
                            SharedPreferences.Editor edit = this.zzc.edit();
                            if (zzc4 != null && !zzgduVar.zza().zza().equals(zzc4.zza().zza())) {
                                edit.putString(zze(), x2.d.b(zzc4.zzaN()));
                            }
                            edit.putString(zzf(), x2.d.b(zzgduVar.zzaN()));
                            if (edit.commit()) {
                                z4 = true;
                                HashSet hashSet = new HashSet();
                                zzc = zzc(1);
                                if (zzc != null) {
                                    hashSet.add(zzc.zza().zza());
                                }
                                zzc2 = zzc(2);
                                if (zzc2 != null) {
                                    hashSet.add(zzc2.zza().zza());
                                }
                                listFiles = zzd().listFiles();
                                if (listFiles != null) {
                                    for (File file2 : listFiles) {
                                        String name = file2.getName();
                                        if (!hashSet.contains(name)) {
                                            File zzc5 = zzfws.zzc(name, zzd());
                                            zzc5.getClass();
                                            zzfws.zze(zzc5);
                                        }
                                    }
                                }
                                return z4;
                            }
                            this.zze.zzb(15320);
                        } else {
                            this.zze.zzb(15319);
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
                    listFiles = zzd().listFiles();
                    if (listFiles != null) {
                    }
                    return z4;
                }
            }
        }
        this.zze.zzb(15316);
        return false;
    }

    public final zzfwq zzb(int i5) {
        zzgdu zzc = zzc(1);
        if (zzc == null) {
            this.zze.zzb(15315);
            return null;
        }
        String zza = zzc.zza().zza();
        File zza2 = zzfws.zza(zza, "pcam.jar", zzd());
        zza2.getClass();
        if (!zza2.exists()) {
            zza2 = zzfws.zza(zza, "pcam", zzd());
            zza2.getClass();
        }
        File zza3 = zzfws.zza(zza, "pcopt", zzd());
        zza3.getClass();
        File zza4 = zzfws.zza(zza, "pcbc", zzd());
        zza4.getClass();
        return new zzfwq(zzc.zza(), zza2, zza4, zza3);
    }

    public final zzgdu zzc(int i5) {
        zzgdu zzd;
        String zza;
        File zza2;
        String string = i5 == 1 ? this.zzc.getString(zzf(), null) : this.zzc.getString(zze(), null);
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        try {
            byte[] j2 = x2.d.j(string);
            zzd = zzgdu.zzd(zzian.zzs(j2, 0, j2.length));
            zza = zzd.zza().zza();
            zza2 = zzfws.zza(zza, "pcam.jar", zzd());
        } catch (zzicg unused) {
            this.zze.zzb(15317);
        }
        if (zza2 == null) {
            throw null;
        }
        if (!zza2.exists() && (zza2 = zzfws.zza(zza, "pcam", zzd())) == null) {
            throw null;
        }
        File zza3 = zzfws.zza(zza, "pcbc", zzd());
        if (zza3 == null) {
            throw null;
        }
        if (zza2.exists() && zza3.exists()) {
            return zzd;
        }
        return null;
    }
}
