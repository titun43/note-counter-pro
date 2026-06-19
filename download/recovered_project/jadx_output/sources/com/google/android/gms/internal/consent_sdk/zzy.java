package com.google.android.gms.internal.consent_sdk;

import i3.g;
import java.util.HashSet;

/* loaded from: classes.dex */
final class zzy {
    private final zzz zza;
    private final zzcn zzb;
    private final zzcr zzc;
    private int zzd = 0;
    private g zze = g.f1860g;

    public zzy(zzz zzzVar, zzcn zzcnVar, zzcr zzcrVar) {
        this.zza = zzzVar;
        this.zzb = zzcnVar;
        this.zzc = zzcrVar;
    }

    public final zzab zza() {
        zzaq zzaqVar;
        zzaq zzaqVar2;
        String str;
        zze zzeVar;
        zzao zzaoVar;
        zzcn zzcnVar = this.zzb;
        int i5 = zzcnVar.zzg;
        boolean z4 = i5 == 8;
        zzz zzzVar = this.zza;
        zzaqVar = zzzVar.zzc;
        zzaqVar.zzh(z4);
        int i6 = i5 - 1;
        if (i5 == 0) {
            throw null;
        }
        switch (i6) {
            case 1:
            case 2:
            case 3:
                this.zzd = 3;
                break;
            case 4:
                this.zzd = 2;
                break;
            case 5:
                this.zzd = 1;
                break;
            case 6:
                throw new zzg(1, "Invalid response from server: ".concat(String.valueOf(zzcnVar.zzc)));
            case 7:
                throw new zzg(3, "Publisher misconfiguration: ".concat(String.valueOf(zzcnVar.zzc)));
            default:
                throw new zzg(1, "Invalid response from server.");
        }
        int i7 = zzcnVar.zzh;
        int i8 = i7 - 1;
        if (i7 == 0) {
            throw null;
        }
        if (i8 == 1) {
            this.zze = g.f1861i;
        } else {
            if (i8 != 2) {
                throw new zzg(1, "Invalid response from server.");
            }
            this.zze = g.h;
        }
        String str2 = zzcnVar.zza;
        zzbs zzbsVar = str2 == null ? null : new zzbs(zzcnVar.zzb, str2);
        this.zzc.zzk(zzcnVar.zzf);
        zzaqVar2 = zzzVar.zzc;
        zzaqVar2.zzj(new HashSet(zzcnVar.zzd));
        for (zzcm zzcmVar : zzcnVar.zze) {
            int i9 = zzcmVar.zzb;
            int i10 = i9 - 1;
            if (i9 == 0) {
                throw null;
            }
            if (i10 == 0) {
                str = null;
            } else if (i10 == 1) {
                str = "write";
            } else {
                if (i10 != 2) {
                    throw new RuntimeException(null, null);
                }
                str = "clear";
            }
            if (str != null) {
                zzeVar = zzzVar.zza;
                String str3 = zzcmVar.zza;
                zzaoVar = zzzVar.zzb;
                zzeVar.zzb(str, str3, zzaoVar);
            }
        }
        return new zzab(this.zzd, this.zze, zzbsVar, null);
    }
}
