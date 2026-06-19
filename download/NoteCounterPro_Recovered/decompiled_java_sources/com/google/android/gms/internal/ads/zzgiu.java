package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes.dex */
public final class zzgiu implements zzfxb {
    private final Context zza;
    private final zzgmz zzb;
    private final String zzc;
    private final long zzd;
    private final long zze;

    public zzgiu(Context context, zzgbf zzgbfVar, zzgmz zzgmzVar) {
        this.zza = context;
        this.zzc = zzgbfVar.zzb();
        this.zzd = zzgbfVar.zzj();
        this.zze = zzgbfVar.zzk();
        this.zzb = zzgmzVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x004c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zza(Map map) {
        String str;
        j3.a aVar;
        zzaxg zzaxgVar;
        map.put("v", this.zzc);
        map.put("t", new Throwable());
        try {
            aVar = (j3.a) map.get("gs");
        } catch (ClassCastException | InterruptedException | ExecutionException | TimeoutException unused) {
        }
        if (aVar != null && ((Build.VERSION.SDK_INT < 31 || aVar.isDone()) && (zzaxgVar = (zzaxg) aVar.get(this.zzd, TimeUnit.MILLISECONDS)) != null && zzaxgVar.zzb().length() > 1)) {
            str = zzaxgVar.zzb();
            if (str.equals("E")) {
                try {
                    j3.a aVar2 = (j3.a) map.get("ai");
                    if (aVar2 != null) {
                        String str2 = (String) aVar2.get(this.zze, TimeUnit.MILLISECONDS);
                        if (!zzgrt.zzc(str2)) {
                            str = str2;
                        }
                    }
                } catch (ClassCastException | InterruptedException | ExecutionException | TimeoutException unused2) {
                }
            }
            map.put("int", str);
        }
        str = "E";
        if (str.equals("E")) {
        }
        map.put("int", str);
    }

    @Override // com.google.android.gms.internal.ads.zzfxb
    public final Map zzb() {
        Map zzb = this.zzb.zzb();
        zza(zzb);
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzfxb
    public final Map zzc() {
        Map zzc = this.zzb.zzc(this.zza, null);
        zza(zzc);
        return zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzfxb
    public final Map zzd() {
        Map zzd = this.zzb.zzd();
        zza(zzd);
        return zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzfxb
    public final Map zze() {
        HashMap hashMap = new HashMap();
        hashMap.put("t", new Throwable());
        return hashMap;
    }
}
