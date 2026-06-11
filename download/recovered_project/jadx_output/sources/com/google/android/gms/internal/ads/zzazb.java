package com.google.android.gms.internal.ads;

import android.os.ConditionVariable;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/* loaded from: classes.dex */
public final class zzazb {
    protected volatile Boolean zzb;
    private final zzbak zzc;
    private static final ConditionVariable zzd = new ConditionVariable();
    protected static volatile zzfxd zza = null;
    private static volatile Random zze = null;

    public zzazb(zzbak zzbakVar) {
        this.zzc = zzbakVar;
        zzbakVar.zzd().execute(new zzaza(this));
    }

    public static final int zzd() {
        try {
            return ThreadLocalRandom.current().nextInt();
        } catch (RuntimeException unused) {
            if (zze == null) {
                synchronized (zzazb.class) {
                    try {
                        if (zze == null) {
                            zze = new Random();
                        }
                    } finally {
                    }
                }
            }
            return zze.nextInt();
        }
    }

    public final void zza(int i5, int i6, long j2, String str, Exception exc) {
        try {
            zzd.block();
            if (!this.zzb.booleanValue() || zza == null) {
                return;
            }
            zzavm zza2 = zzavq.zza();
            zza2.zza(this.zzc.zza.getPackageName());
            zza2.zzb(j2);
            if (str != null) {
                zza2.zze(str);
            }
            if (exc != null) {
                StringWriter stringWriter = new StringWriter();
                exc.printStackTrace(new PrintWriter(stringWriter));
                zza2.zzc(stringWriter.toString());
                zza2.zzd(exc.getClass().getName());
            }
            zzfxc zza3 = zza.zza(((zzavq) zza2.zzbu()).zzaN());
            zza3.zzc(i5);
            if (i6 != -1) {
                zza3.zzb(i6);
            }
            zza3.zza();
        } catch (Exception unused) {
        }
    }

    public final /* synthetic */ zzbak zzb() {
        return this.zzc;
    }
}
