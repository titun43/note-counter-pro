package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.RoundedCorner;
import android.view.WindowInsets;

/* loaded from: classes.dex */
public final class zzeti implements zzfax {
    private final zzfax zza;
    private final zzfjk zzb;
    private final Context zzc;
    private final zzcdu zzd;

    public zzeti(zzevl zzevlVar, zzfjk zzfjkVar, Context context, zzcdu zzcduVar) {
        this.zza = zzevlVar;
        this.zzb = zzfjkVar;
        this.zzc = context;
        this.zzd = zzcduVar;
    }

    private static final int zzd(WindowInsets windowInsets, int i5) {
        RoundedCorner roundedCorner;
        int radius;
        roundedCorner = windowInsets.getRoundedCorner(i5);
        if (roundedCorner == null) {
            return 0;
        }
        radius = roundedCorner.getRadius();
        return radius;
    }

    private static final int zze(int i5, float f5) {
        if (f5 == 0.0f) {
            return 0;
        }
        return (int) Math.ceil(i5 / f5);
    }

    private static final y.c zzf(y.c cVar, float f5) {
        return f5 == 0.0f ? y.c.f3728e : y.c.b((int) Math.ceil(cVar.f3729a / f5), (int) Math.ceil(cVar.f3730b / f5), (int) Math.ceil(cVar.f3731c / f5), (int) Math.ceil(cVar.f3732d / f5));
    }

    @Override // com.google.android.gms.internal.ads.zzfax
    public final j3.a zza() {
        return zzgzo.zzk(this.zza.zza(), new zzgqt() { // from class: com.google.android.gms.internal.ads.zzeth
            @Override // com.google.android.gms.internal.ads.zzgqt
            public final /* synthetic */ Object apply(Object obj) {
                return zzeti.this.zzc((zzfbg) obj);
            }
        }, zzcei.zzg);
    }

    @Override // com.google.android.gms.internal.ads.zzfax
    public final int zzb() {
        return 7;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r3v1 com.google.android.gms.internal.ads.zzetj, still in use, count: 4, list:
          (r3v1 com.google.android.gms.internal.ads.zzetj) from 0x02f0: MOVE (r21v0 com.google.android.gms.internal.ads.zzetj) = (r3v1 com.google.android.gms.internal.ads.zzetj) (LINE:753)
          (r3v1 com.google.android.gms.internal.ads.zzetj) from 0x01ad: MOVE (r21v4 com.google.android.gms.internal.ads.zzetj) = (r3v1 com.google.android.gms.internal.ads.zzetj) (LINE:430)
          (r3v1 com.google.android.gms.internal.ads.zzetj) from 0x01d6: MOVE (r21v5 com.google.android.gms.internal.ads.zzetj) = (r3v1 com.google.android.gms.internal.ads.zzetj) (LINE:471)
          (r3v1 com.google.android.gms.internal.ads.zzetj) from 0x0182: MOVE (r21v7 com.google.android.gms.internal.ads.zzetj) = (r3v1 com.google.android.gms.internal.ads.zzetj) (LINE:387)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:57)
        	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:447)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    public final com.google.android.gms.internal.ads.zzetj zzc(com.google.android.gms.internal.ads.zzfbg r27) {
        /*
            Method dump skipped, instructions count: 997
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzeti.zzc(com.google.android.gms.internal.ads.zzfbg):com.google.android.gms.internal.ads.zzetj");
    }
}
