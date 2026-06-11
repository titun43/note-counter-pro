package com.google.android.gms.internal.ads;

import android.content.Context;
import h3.h;
import h3.j;
import h3.n;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Map;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public class zzfvh {
    public static final /* synthetic */ int zza = 0;
    private static volatile int zzf = 1;
    private final Context zzb;
    private final Executor zzc;
    private final h3.g zzd;
    private final boolean zze;

    public zzfvh(Context context, Executor executor, h3.g gVar, boolean z4) {
        this.zzb = context;
        this.zzc = executor;
        this.zzd = gVar;
        this.zze = z4;
    }

    public static zzfvh zza(final Context context, Executor executor, boolean z4) {
        final h hVar = new h();
        if (z4) {
            executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfvd
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    hVar.a(zzfxd.zzb(context, "GLAS", null));
                }
            });
        } else {
            executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfvf
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    h.this.a(zzfxd.zzc());
                }
            });
        }
        return new zzfvh(context, executor, hVar.f1713a, z4);
    }

    public static void zzg(int i5) {
        zzf = i5;
    }

    private final h3.g zzh(final int i5, long j2, Exception exc, String str, Map map, String str2) {
        int i6 = 0;
        if (!this.zze) {
            h3.g gVar = this.zzd;
            Executor executor = this.zzc;
            zzfvg zzfvgVar = zzfvg.zza;
            n nVar = (n) gVar;
            nVar.getClass();
            n nVar2 = new n();
            nVar.f1728b.a(new j(executor, zzfvgVar, nVar2, i6));
            nVar.h();
            return nVar2;
        }
        Context context = this.zzb;
        final zzavm zza2 = zzavq.zza();
        zza2.zza(context.getPackageName());
        zza2.zzb(j2);
        zza2.zzg(zzf);
        if (exc != null) {
            int i7 = zzgrz.zza;
            StringWriter stringWriter = new StringWriter();
            exc.printStackTrace(new PrintWriter(stringWriter));
            zza2.zzc(stringWriter.toString());
            zza2.zzd(exc.getClass().getName());
        }
        if (str2 != null) {
            zza2.zze(str2);
        }
        if (str != null) {
            zza2.zzf(str);
        }
        h3.g gVar2 = this.zzd;
        Executor executor2 = this.zzc;
        h3.b bVar = new h3.b() { // from class: com.google.android.gms.internal.ads.zzfve
            @Override // h3.b
            public final /* synthetic */ Object then(h3.g gVar3) {
                if (!gVar3.c()) {
                    return Boolean.FALSE;
                }
                int i8 = i5;
                zzfxc zza3 = ((zzfxd) gVar3.b()).zza(((zzavq) zzavm.this.zzbu()).zzaN());
                zza3.zzc(i8);
                zza3.zza();
                return Boolean.TRUE;
            }
        };
        n nVar3 = (n) gVar2;
        nVar3.getClass();
        n nVar4 = new n();
        nVar3.f1728b.a(new j(executor2, bVar, nVar4, i6));
        nVar3.h();
        return nVar4;
    }

    public h3.g zzb(int i5, long j2) {
        return zzh(i5, j2, null, null, null, null);
    }

    public h3.g zzc(int i5, long j2, Exception exc) {
        return zzh(i5, j2, exc, null, null, null);
    }

    public final h3.g zzd(int i5, long j2, String str, Map map) {
        return zzh(i5, j2, null, str, null, null);
    }

    public h3.g zze(int i5, String str) {
        return zzh(i5, 0L, null, null, null, str);
    }

    public final h3.g zzf(int i5, long j2, String str) {
        return zzh(i5, j2, null, null, null, str);
    }
}
