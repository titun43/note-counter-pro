package y1;

import com.google.android.gms.internal.play_billing.zzbf;
import com.google.android.gms.internal.play_billing.zze;
import com.google.android.gms.internal.play_billing.zzjx;
import com.google.android.gms.internal.play_billing.zzjz;
import com.google.android.gms.internal.play_billing.zzkb;
import com.google.android.gms.internal.play_billing.zzkd;
import com.google.android.gms.internal.play_billing.zzke;
import com.google.android.gms.internal.play_billing.zzki;

/* loaded from: classes.dex */
public abstract /* synthetic */ class z {
    static {
        int i5 = a0.f3787f;
    }

    public static String a(Exception exc) {
        if (exc == null) {
            return null;
        }
        try {
            String str = exc.getClass().getSimpleName() + ":" + zzbf.zzb(exc.getMessage());
            int i5 = zze.zza;
            return str.length() > 40 ? str.substring(0, 40) : str;
        } catch (Throwable th) {
            zze.zzm("BillingLogger", "Unable to get truncated exception info", th);
            return null;
        }
    }

    public static zzjz b(int i5, int i6, e eVar) {
        try {
            zzjx zzc = zzjz.zzc();
            zzke zzc2 = zzki.zzc();
            zzc2.zzn(eVar.f3832a);
            zzc2.zzm(eVar.f3833b);
            zzc2.zzo(i5);
            zzc.zza(zzc2);
            zzc.zzn(i6);
            return (zzjz) zzc.zzf();
        } catch (Exception e4) {
            zze.zzm("BillingLogger", "Unable to create logging payload", e4);
            return null;
        }
    }

    public static zzjz c(int i5, int i6, e eVar, String str) {
        try {
            zzke zzc = zzki.zzc();
            zzc.zzn(eVar.f3832a);
            zzc.zzm(eVar.f3833b);
            zzc.zzo(i5);
            if (str != null) {
                zzc.zza(str);
            }
            zzjx zzc2 = zzjz.zzc();
            zzc2.zza(zzc);
            zzc2.zzn(i6);
            return (zzjz) zzc2.zzf();
        } catch (Throwable th) {
            zze.zzm("BillingLogger", "Unable to create logging payload", th);
            return null;
        }
    }

    public static zzkd d(int i5) {
        try {
            zzkb zzc = zzkd.zzc();
            zzc.zzn(i5);
            return (zzkd) zzc.zzf();
        } catch (Exception e4) {
            zze.zzm("BillingLogger", "Unable to create logging payload", e4);
            return null;
        }
    }
}
