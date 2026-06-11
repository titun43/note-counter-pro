package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Handler;

/* loaded from: classes.dex */
public final class zzaca {
    private final Context zza;
    private boolean zzb;
    private zzuw zzc = zzuw.zzb;
    private final zzui zzd;
    private Handler zze;
    private zzadm zzf;

    public zzaca(Context context) {
        this.zza = context;
        this.zzd = new zzuc(context, null, null);
    }

    public final zzaca zza(zzuw zzuwVar) {
        this.zzc = zzuwVar;
        return this;
    }

    public final zzaca zzb(Handler handler) {
        this.zze = handler;
        return this;
    }

    public final zzaca zzc(zzadm zzadmVar) {
        this.zzf = zzadmVar;
        return this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0017, code lost:
    
        if (r3.zzf != null) goto L7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final zzacc zzd() {
        boolean z4;
        zzgrc.zzi(!this.zzb);
        Handler handler = this.zze;
        if (handler != null || this.zzf != null) {
            z4 = false;
            if (handler != null) {
            }
            zzgrc.zzi(z4);
            this.zzb = true;
            return new zzacc(this);
        }
        z4 = true;
        zzgrc.zzi(z4);
        this.zzb = true;
        return new zzacc(this);
    }

    public final /* synthetic */ Context zze() {
        return this.zza;
    }

    public final /* synthetic */ zzuw zzf() {
        return this.zzc;
    }

    public final /* synthetic */ zzui zzg() {
        return this.zzd;
    }

    public final /* synthetic */ Handler zzh() {
        return this.zze;
    }

    public final /* synthetic */ zzadm zzi() {
        return this.zzf;
    }
}
