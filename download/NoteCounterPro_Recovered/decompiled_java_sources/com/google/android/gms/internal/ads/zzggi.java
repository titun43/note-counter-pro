package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import com.google.android.gms.ads.RequestConfiguration;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes.dex */
final class zzggi extends zzghb {
    private final Map zza;
    private final Context zzb;
    private final zzgcc zzc;
    private final long zzd;
    private final long zze;

    public zzggi(zzawg zzawgVar, zzgfx zzgfxVar, Map map, Context context, zzgcc zzgccVar, zzgbf zzgbfVar, zzgoe zzgoeVar) {
        super("Qx6fKcghp39v3hBS7aGRudr3CfsW9ttl9o6D5CM1a5VL5o9yAVkUDqNE55A7wfv7", "6qdYmVukMTFpVys4cpUndL5YDKVPIertd1vgaMgush0=", zzawgVar, zzgfxVar, zzgoeVar.zza(113));
        this.zzb = context;
        this.zza = map;
        this.zzc = zzgccVar;
        this.zzd = zzgbfVar.zzj();
        this.zze = zzgbfVar.zzk();
    }

    @Override // com.google.android.gms.internal.ads.zzghb
    public final void zza(Method method, zzawg zzawgVar) {
        zzaxg zzaxgVar;
        Object[] objArr = (Object[]) method.invoke(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, this.zzb, Integer.valueOf(this.zzc.ordinal()));
        objArr.getClass();
        String str = "E";
        int i5 = 1;
        try {
            j3.a aVar = (j3.a) this.zza.get("gs");
            if (aVar != null && ((Build.VERSION.SDK_INT < 31 || aVar.isDone()) && (zzaxgVar = (zzaxg) aVar.get(this.zzd, TimeUnit.MILLISECONDS)) != null && zzaxgVar.zzb().length() > 1)) {
                str = zzaxgVar.zzb();
            }
        } catch (ClassCastException | InterruptedException | ExecutionException | TimeoutException unused) {
        }
        if (str.equals("E")) {
            try {
                j3.a aVar2 = (j3.a) this.zza.get("ai");
                if (aVar2 != null) {
                    String str2 = (String) aVar2.get(this.zze, TimeUnit.MILLISECONDS);
                    if (!zzgrt.zzc(str2)) {
                        str = str2;
                    }
                }
            } catch (ClassCastException | InterruptedException | ExecutionException | TimeoutException unused2) {
            }
        }
        Boolean bool = (Boolean) objArr[5];
        synchronized (zzawgVar) {
            try {
                zzawgVar.zzu(((Long) objArr[0]).longValue());
                zzawgVar.zzt((String) objArr[1]);
                zzawgVar.zzD((String) objArr[2]);
                zzawgVar.zzE((String) objArr[3]);
                zzgxa zzi = zzgxa.zzn().zzi();
                byte[] bArr = (byte[]) objArr[4];
                zzawgVar.zzp(zzi.zzj(bArr, 0, bArr.length));
                zzawgVar.zzo(str);
                if (bool != null) {
                    if (true == bool.booleanValue()) {
                        i5 = 2;
                    }
                    zzawgVar.zzai(i5);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
