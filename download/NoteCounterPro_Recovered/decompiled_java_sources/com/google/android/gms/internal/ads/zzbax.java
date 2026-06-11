package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class zzbax extends zzbby {
    private static final zzbbz zzh = new zzbbz();
    private final Context zzi;

    public zzbax(zzbak zzbakVar, String str, String str2, zzawg zzawgVar, int i5, int i6, Context context) {
        super(zzbakVar, "BJ0iIx7YCr6PyW+pyNNozQaB62BBi5nixFl6WJUaFdU4X2GlfptGfOLgFJ7ri6Ag", "ovMA5nrmsfMPPc1p4911nPRjAFxE4I+3QWZwZMrn+uQ=", zzawgVar, i5, 29);
        this.zzi = context;
    }

    @Override // com.google.android.gms.internal.ads.zzbby
    public final void zza() {
        this.zzd.zzp("E");
        Context context = this.zzi;
        AtomicReference zza = zzh.zza(context.getPackageName());
        if (zza.get() == null) {
            synchronized (zza) {
                try {
                    if (zza.get() == null) {
                        zza.set((String) this.zze.invoke(null, context));
                    }
                } finally {
                }
            }
        }
        String str = (String) zza.get();
        zzawg zzawgVar = this.zzd;
        synchronized (zzawgVar) {
            zzawgVar.zzp(zzaya.zza(str.getBytes(), true));
        }
    }
}
