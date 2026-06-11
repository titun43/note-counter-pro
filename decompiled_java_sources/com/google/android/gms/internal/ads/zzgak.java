package com.google.android.gms.internal.ads;

import android.content.Context;
import androidx.fragment.app.h1;
import java.nio.charset.StandardCharsets;
import java.util.UUID;

/* loaded from: classes.dex */
class zzgak {
    static final String zza = new UUID(0, 0).toString();
    final zzgaj zzb;
    final zzgai zzc;
    private final String zzd;
    private final String zze;
    private final String zzf;
    private final String zzg;
    private final String zzh;

    public zzgak(Context context, String str, String str2, String str3) {
        this.zzb = zzgaj.zza(context);
        this.zzc = zzgai.zza(context);
        this.zzd = str;
        this.zze = str.concat("_3p");
        this.zzf = str2;
        this.zzg = str2.concat("_3p");
        this.zzh = str3;
    }

    private final String zzh(String str, String str2, String str3) {
        if (str2 != null && str3 != null) {
            return UUID.nameUUIDFromBytes(h1.b(new StringBuilder(str2.length() + str.length() + str3.length()), str, str2, str3).getBytes(StandardCharsets.UTF_8)).toString();
        }
        String str4 = this.zzh;
        String str5 = str2 == null ? "null" : "not null";
        int length = str5.length();
        String str6 = str3 == null ? "null" : "not null";
        StringBuilder sb = new StringBuilder(str6.length() + length + 120);
        s.c.e(sb, str4, ": Invalid argument to generate PAIDv1 on 3p traffic, Ad ID is not null, package name is ", str5, ", hashKey is ");
        sb.append(str6);
        throw new IllegalArgumentException(sb.toString());
    }

    public final zzgah zza(String str, String str2, long j2, boolean z4) {
        if (str != null) {
            try {
                UUID.fromString(str);
                if (!str.equals(zza)) {
                    String zze = zze(true);
                    String zzc = this.zzb.zzc("paid_3p_hash_key", null);
                    if (zze != null && zzc != null && !zze.equals(zzh(str, str2, zzc))) {
                        return zzb(str, str2);
                    }
                }
            } catch (IllegalArgumentException unused) {
            }
            return new zzgah();
        }
        boolean z5 = str != null;
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis < 0) {
            throw new IllegalStateException(this.zzh.concat(": Invalid negative current timestamp. Updating PAID failed"));
        }
        long zzd = zzd(z5);
        if (zzd != -1) {
            if (currentTimeMillis < zzd) {
                this.zzb.zzb(z5 ? this.zzg : this.zzf, Long.valueOf(currentTimeMillis));
            } else if (currentTimeMillis >= zzd + j2) {
                return zzb(str, str2);
            }
        }
        String zze2 = zze(z5);
        return (zze2 != null || z4) ? new zzgah(zze2, zzd(z5)) : zzb(str, str2);
    }

    public final zzgah zzb(String str, String str2) {
        if (str == null) {
            return zzf(UUID.randomUUID().toString(), false);
        }
        String uuid = UUID.randomUUID().toString();
        this.zzb.zzb("paid_3p_hash_key", uuid);
        return zzf(zzh(str, str2, uuid), true);
    }

    public final void zzc(boolean z4) {
        String str = z4 ? this.zzg : this.zzf;
        zzgaj zzgajVar = this.zzb;
        zzgajVar.zzf(str);
        zzgajVar.zzf(z4 ? this.zze : this.zzd);
    }

    public final long zzd(boolean z4) {
        return this.zzb.zzd(z4 ? this.zzg : this.zzf, -1L);
    }

    public final String zze(boolean z4) {
        return this.zzb.zzc(z4 ? this.zze : this.zzd, null);
    }

    public final zzgah zzf(String str, boolean z4) {
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis < 0) {
            throw new IllegalStateException(this.zzh.concat(": Invalid negative current timestamp. Updating PAID failed"));
        }
        zzgaj zzgajVar = this.zzb;
        zzgajVar.zzb(z4 ? this.zzg : this.zzf, Long.valueOf(currentTimeMillis));
        zzgajVar.zzb(z4 ? this.zze : this.zzd, str);
        return new zzgah(str, currentTimeMillis);
    }

    public final boolean zzg(boolean z4) {
        return this.zzb.zzg(this.zzd);
    }
}
