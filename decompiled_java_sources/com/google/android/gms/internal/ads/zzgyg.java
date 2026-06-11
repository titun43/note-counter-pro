package com.google.android.gms.internal.ads;

import androidx.fragment.app.h1;
import com.google.android.gms.ads.RequestConfiguration;
import java.util.concurrent.ExecutionException;

/* loaded from: classes.dex */
abstract class zzgyg extends zzgzf implements Runnable {
    public static final /* synthetic */ int zzd = 0;
    j3.a zza;
    Class zzb;
    Object zzc;

    public zzgyg(j3.a aVar, Class cls, Object obj) {
        aVar.getClass();
        this.zza = aVar;
        this.zzb = cls;
        this.zzc = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0083  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        Object obj;
        j3.a aVar = this.zza;
        Class cls = this.zzb;
        Object obj2 = this.zzc;
        if (((obj2 == null) || ((aVar == 0) | (cls == null))) || isCancelled()) {
            return;
        }
        this.zza = null;
        try {
            th = aVar instanceof zzhaq ? ((zzhaq) aVar).zzl() : null;
        } catch (ExecutionException e4) {
            Throwable cause = e4.getCause();
            if (cause == null) {
                String valueOf = String.valueOf(aVar.getClass());
                String valueOf2 = String.valueOf(e4.getClass());
                StringBuilder sb = new StringBuilder(valueOf2.length() + valueOf.length() + 19 + 16);
                s.c.e(sb, "Future type ", valueOf, " threw ", valueOf2);
                sb.append(" without a cause");
                cause = new NullPointerException(sb.toString());
            }
            th = cause;
        } catch (Throwable th) {
            th = th;
        }
        if (th == null) {
            obj = zzgzo.zzs(aVar);
            if (th != null) {
                zza(obj);
                return;
            }
            if (!cls.isInstance(th)) {
                zzk(aVar);
                return;
            }
            try {
                Object zzf = zzf(obj2, th);
                this.zzb = null;
                this.zzc = null;
                zze(zzf);
                return;
            } catch (Throwable th2) {
                try {
                    zzhag.zza(th2);
                    zzb(th2);
                    return;
                } finally {
                    this.zzb = null;
                    this.zzc = null;
                }
            }
        }
        obj = null;
        if (th != null) {
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgyh
    public final void zzc() {
        zzm(this.zza);
        this.zza = null;
        this.zzb = null;
        this.zzc = null;
    }

    @Override // com.google.android.gms.internal.ads.zzgyh
    public final String zzd() {
        String str;
        j3.a aVar = this.zza;
        Class cls = this.zzb;
        Object obj = this.zzc;
        String zzd2 = super.zzd();
        if (aVar != null) {
            String obj2 = aVar.toString();
            str = h1.b(new StringBuilder(obj2.length() + 16), "inputFuture=[", obj2, "], ");
        } else {
            str = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        }
        if (cls == null || obj == null) {
            if (zzd2 != null) {
                return str.concat(zzd2);
            }
            return null;
        }
        int length = str.length();
        String obj3 = cls.toString();
        int length2 = obj3.length();
        String obj4 = obj.toString();
        StringBuilder sb = new StringBuilder(obj4.length() + length + 15 + length2 + 13 + 1);
        s.c.e(sb, str, "exceptionType=[", obj3, "], fallback=[");
        return s.c.d(sb, obj4, "]");
    }

    public abstract void zze(Object obj);

    public abstract Object zzf(Object obj, Throwable th);
}
