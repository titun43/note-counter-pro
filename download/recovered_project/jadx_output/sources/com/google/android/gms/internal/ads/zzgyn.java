package com.google.android.gms.internal.ads;

import androidx.emoji2.text.u;
import androidx.fragment.app.h1;
import com.google.android.gms.ads.RequestConfiguration;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

/* loaded from: classes.dex */
abstract class zzgyn extends zzgzf implements Runnable {
    public static final /* synthetic */ int zzc = 0;
    j3.a zza;
    Object zzb;

    public zzgyn(j3.a aVar, Object obj) {
        aVar.getClass();
        this.zza = aVar;
        this.zzb = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        j3.a aVar = this.zza;
        Object obj = this.zzb;
        if ((isCancelled() | (aVar == null)) || (obj == null)) {
            return;
        }
        this.zza = null;
        if (aVar.isCancelled()) {
            zzk(aVar);
            return;
        }
        try {
            try {
                Object zzf = zzf(obj, zzgzo.zzs(aVar));
                this.zzb = null;
                zze(zzf);
            } catch (Throwable th) {
                try {
                    zzhag.zza(th);
                    zzb(th);
                } finally {
                    this.zzb = null;
                }
            }
        } catch (Error e4) {
            zzb(e4);
        } catch (CancellationException unused) {
            cancel(false);
        } catch (ExecutionException e5) {
            zzb(e5.getCause());
        } catch (Exception e6) {
            zzb(e6);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgyh
    public final void zzc() {
        zzm(this.zza);
        this.zza = null;
        this.zzb = null;
    }

    @Override // com.google.android.gms.internal.ads.zzgyh
    public final String zzd() {
        String str;
        j3.a aVar = this.zza;
        Object obj = this.zzb;
        String zzd = super.zzd();
        if (aVar != null) {
            String obj2 = aVar.toString();
            str = h1.b(new StringBuilder(obj2.length() + 16), "inputFuture=[", obj2, "], ");
        } else {
            str = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        }
        if (obj == null) {
            if (zzd != null) {
                return str.concat(zzd);
            }
            return null;
        }
        int length = str.length();
        String obj3 = obj.toString();
        return u.n(new StringBuilder(obj3.length() + length + 10 + 1), str, "function=[", obj3, "]");
    }

    public abstract void zze(Object obj);

    public abstract Object zzf(Object obj, Object obj2);
}
