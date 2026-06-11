package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
public final class zzbbn extends zzbby {
    public zzbbn(zzbak zzbakVar, String str, String str2, zzawg zzawgVar, int i5, int i6) {
        super(zzbakVar, "EHHl2bnow3CY535hCiXXbLjuydxFlVXitu9AIkBq9ZFdEOrgtrbiSayxFpjmKRmo", "ioEU79oGVeaIBBGOjKcBP85gZ/aumGq7/t+0LJZeQ5M=", zzawgVar, i5, 73);
    }

    @Override // com.google.android.gms.internal.ads.zzbby
    public final void zza() {
        try {
            boolean booleanValue = ((Boolean) this.zze.invoke(null, this.zza.zzb())).booleanValue();
            zzawg zzawgVar = this.zzd;
            int i5 = 1;
            if (true == booleanValue) {
                i5 = 2;
            }
            zzawgVar.zzah(i5);
        } catch (InvocationTargetException unused) {
            this.zzd.zzah(3);
        }
    }
}
