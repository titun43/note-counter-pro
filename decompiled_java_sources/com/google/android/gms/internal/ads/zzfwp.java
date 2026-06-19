package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.util.Base64;
import android.view.MotionEvent;
import android.view.View;
import java.util.Map;

/* loaded from: classes.dex */
final class zzfwp implements zzfvk {
    private final Object zza;
    private final zzfwq zzb;
    private final zzfxb zzc;
    private final zzfvh zzd;
    private final boolean zze;

    public zzfwp(Object obj, zzfwq zzfwqVar, zzfxb zzfxbVar, zzfvh zzfvhVar, boolean z4) {
        this.zza = obj;
        this.zzb = zzfwqVar;
        this.zzc = zzfxbVar;
        this.zzd = zzfvhVar;
        this.zze = z4;
    }

    private static String zzi(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        zzaxw zza = zzaxx.zza();
        zza.zzd(5);
        zza.zza(zzian.zzs(bArr, 0, bArr.length));
        return Base64.encodeToString(((zzaxx) zza.zzbu()).zzaN(), 11);
    }

    private final synchronized byte[] zzj(Map map, Map map2) {
        Object obj;
        long currentTimeMillis = System.currentTimeMillis();
        try {
            obj = this.zza;
        } catch (Exception e4) {
            this.zzd.zzc(2007, System.currentTimeMillis() - currentTimeMillis, e4);
            return null;
        }
        return (byte[]) obj.getClass().getDeclaredMethod("xss", Map.class, Map.class).invoke(obj, null, map2);
    }

    @Override // com.google.android.gms.internal.ads.zzfvk
    public final synchronized String zza(Context context, String str) {
        byte[] zzj;
        try {
            Map zzb = this.zzc.zzb();
            zzb.put("f", "q");
            zzb.put("ctx", context);
            zzb.put("aid", null);
            zzj = zzj(null, zzb);
            if (this.zze) {
                zzb.clear();
            }
        } catch (Throwable th) {
            throw th;
        }
        return zzi(zzj);
    }

    @Override // com.google.android.gms.internal.ads.zzfvk
    public final synchronized String zzb(Context context, String str, View view, Activity activity) {
        byte[] zzj;
        try {
            Map zzc = this.zzc.zzc();
            zzc.put("f", "v");
            zzc.put("ctx", context);
            zzc.put("aid", null);
            zzc.put("view", view);
            zzc.put("act", activity);
            zzj = zzj(null, zzc);
            if (this.zze) {
                zzc.clear();
            }
        } catch (Throwable th) {
            throw th;
        }
        return zzi(zzj);
    }

    @Override // com.google.android.gms.internal.ads.zzfvk
    public final synchronized String zzc(Context context, String str, String str2, View view, Activity activity) {
        byte[] zzj;
        try {
            Map zzd = this.zzc.zzd();
            zzd.put("f", "c");
            zzd.put("ctx", context);
            zzd.put("cs", str2);
            zzd.put("aid", null);
            zzd.put("view", view);
            zzd.put("act", activity);
            zzj = zzj(null, zzd);
            if (this.zze) {
                zzd.clear();
            }
        } catch (Throwable th) {
            throw th;
        }
        return zzi(zzj);
    }

    @Override // com.google.android.gms.internal.ads.zzfvk
    public final synchronized void zzd(String str, MotionEvent motionEvent) {
        try {
            long currentTimeMillis = System.currentTimeMillis();
            Map zze = this.zzc.zze();
            zze.put("aid", null);
            zze.put("evt", motionEvent);
            Object obj = this.zza;
            obj.getClass().getDeclaredMethod("he", Map.class).invoke(obj, zze);
            this.zzd.zzb(3003, System.currentTimeMillis() - currentTimeMillis);
        } catch (Exception e4) {
            throw new zzfwz(2005, e4);
        }
    }

    public final zzfwq zze() {
        return this.zzb;
    }

    public final synchronized boolean zzf() {
        Object obj;
        try {
            obj = this.zza;
        } catch (Exception e4) {
            throw new zzfwz(2001, e4);
        }
        return ((Boolean) obj.getClass().getDeclaredMethod("init", null).invoke(obj, null)).booleanValue();
    }

    public final synchronized void zzg() {
        try {
            long currentTimeMillis = System.currentTimeMillis();
            Object obj = this.zza;
            obj.getClass().getDeclaredMethod("close", null).invoke(obj, null);
            this.zzd.zzb(3001, System.currentTimeMillis() - currentTimeMillis);
        } catch (Exception e4) {
            throw new zzfwz(2003, e4);
        }
    }

    public final synchronized int zzh() {
        Object obj;
        try {
            obj = this.zza;
        } catch (Exception e4) {
            throw new zzfwz(2006, e4);
        }
        return ((Integer) obj.getClass().getDeclaredMethod("lcs", null).invoke(obj, null)).intValue();
    }
}
