package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import dalvik.system.DexClassLoader;
import java.io.File;
import java.security.GeneralSecurityException;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class zzfxa {
    private static final HashMap zza = new HashMap();
    private final Context zzb;
    private final zzfxb zzc;
    private final zzfvh zzd;
    private final zzfvc zze;
    private final boolean zzf;
    private zzfwp zzg;
    private final Object zzh = new Object();

    public zzfxa(Context context, zzfxb zzfxbVar, zzfvh zzfvhVar, zzfvc zzfvcVar, boolean z4) {
        this.zzb = context;
        this.zzc = zzfxbVar;
        this.zzd = zzfvhVar;
        this.zze = zzfvcVar;
        this.zzf = z4;
    }

    private final synchronized Class zzd(zzfwq zzfwqVar) {
        try {
            if (zzfwqVar.zza() == null) {
                throw new zzfwz(4010, "mc");
            }
            String zza2 = zzfwqVar.zza().zza();
            HashMap hashMap = zza;
            Class cls = (Class) hashMap.get(zza2);
            if (cls != null) {
                return cls;
            }
            try {
                if (!this.zze.zza(zzfwqVar.zzb())) {
                    throw new zzfwz(2026, "VM did not pass signature verification");
                }
                try {
                    File zzc = zzfwqVar.zzc();
                    if (!zzc.exists()) {
                        zzc.mkdirs();
                    }
                    Class<?> loadClass = new DexClassLoader(zzfwqVar.zzb().getAbsolutePath(), zzc.getAbsolutePath(), null, this.zzb.getClassLoader()).loadClass("com.google.ccc.abuse.droidguard.DroidGuard");
                    hashMap.put(zza2, loadClass);
                    return loadClass;
                } catch (ClassNotFoundException e4) {
                    e = e4;
                    throw new zzfwz(2008, e);
                } catch (IllegalArgumentException e5) {
                    e = e5;
                    throw new zzfwz(2008, e);
                } catch (SecurityException e6) {
                    e = e6;
                    throw new zzfwz(2008, e);
                }
            } catch (GeneralSecurityException e7) {
                throw new zzfwz(2026, e7);
            }
        } finally {
        }
    }

    public final boolean zza(zzfwq zzfwqVar) {
        long currentTimeMillis = System.currentTimeMillis();
        try {
            try {
                zzfwp zzfwpVar = new zzfwp(zzd(zzfwqVar).getDeclaredConstructor(Context.class, String.class, byte[].class, Object.class, Bundle.class, Integer.TYPE).newInstance(this.zzb, "msa-r", zzfwqVar.zzd(), null, new Bundle(), 2), zzfwqVar, this.zzc, this.zzd, this.zzf);
                if (!zzfwpVar.zzf()) {
                    throw new zzfwz(4000, "init failed");
                }
                int zzh = zzfwpVar.zzh();
                if (zzh != 0) {
                    StringBuilder sb = new StringBuilder(String.valueOf(zzh).length() + 4);
                    sb.append("ci: ");
                    sb.append(zzh);
                    throw new zzfwz(4001, sb.toString());
                }
                synchronized (this.zzh) {
                    zzfwp zzfwpVar2 = this.zzg;
                    if (zzfwpVar2 != null) {
                        try {
                            zzfwpVar2.zzg();
                        } catch (zzfwz e4) {
                            this.zzd.zzc(e4.zza(), -1L, e4);
                        }
                    }
                    this.zzg = zzfwpVar;
                }
                this.zzd.zzb(3000, System.currentTimeMillis() - currentTimeMillis);
                return true;
            } catch (Exception e5) {
                throw new zzfwz(2004, e5);
            }
        } catch (zzfwz e6) {
            this.zzd.zzc(e6.zza(), System.currentTimeMillis() - currentTimeMillis, e6);
            return false;
        } catch (Exception e7) {
            this.zzd.zzc(4010, System.currentTimeMillis() - currentTimeMillis, e7);
            return false;
        }
    }

    public final zzfvk zzb() {
        zzfwp zzfwpVar;
        synchronized (this.zzh) {
            zzfwpVar = this.zzg;
        }
        return zzfwpVar;
    }

    public final zzfwq zzc() {
        synchronized (this.zzh) {
            try {
                zzfwp zzfwpVar = this.zzg;
                if (zzfwpVar == null) {
                    return null;
                }
                return zzfwpVar.zze();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
