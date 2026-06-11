package com.google.android.gms.internal.ads;

import android.net.Uri;
import androidx.emoji2.text.u;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class zzhf {
    public static final /* synthetic */ int zzh = 0;
    public final Uri zza;
    public final int zzb;
    public final byte[] zzc;
    public final Map zzd;
    public final long zze;
    public final long zzf;
    public final int zzg;

    static {
        zzal.zzb("media3.datasource");
    }

    public /* synthetic */ zzhf(Uri uri, long j2, int i5, byte[] bArr, Map map, long j5, long j6, String str, int i6, Object obj, byte[] bArr2) {
        this(uri, 0L, 1, null, map, j5, j6, null, i6, null);
    }

    public final String toString() {
        String obj = this.zza.toString();
        int length = obj.length();
        long j2 = this.zze;
        int length2 = String.valueOf(j2).length();
        long j5 = this.zzf;
        int length3 = String.valueOf(j5).length();
        int i5 = this.zzg;
        StringBuilder sb = new StringBuilder(length + 15 + length2 + 2 + length3 + 8 + String.valueOf(i5).length() + 1);
        sb.append("DataSpec[GET ");
        sb.append(obj);
        sb.append(", ");
        sb.append(j2);
        u.t(sb, ", ", j5, ", null, ");
        sb.append(i5);
        sb.append("]");
        return sb.toString();
    }

    public final boolean zza(int i5) {
        return (this.zzg & i5) == i5;
    }

    public final zzhe zzb() {
        return new zzhe(this, null);
    }

    private zzhf(Uri uri, long j2, int i5, byte[] bArr, Map map, long j5, long j6, String str, int i6, Object obj) {
        boolean z4 = false;
        boolean z5 = j5 >= 0;
        zzgrc.zza(z5);
        zzgrc.zza(z5);
        if (j6 <= 0) {
            j6 = j6 == -1 ? -1L : j6;
            zzgrc.zza(z4);
            uri.getClass();
            this.zza = uri;
            this.zzb = 1;
            this.zzc = null;
            this.zzd = Collections.unmodifiableMap(new HashMap(map));
            this.zze = j5;
            this.zzf = j6;
            this.zzg = i6;
        }
        z4 = true;
        zzgrc.zza(z4);
        uri.getClass();
        this.zza = uri;
        this.zzb = 1;
        this.zzc = null;
        this.zzd = Collections.unmodifiableMap(new HashMap(map));
        this.zze = j5;
        this.zzf = j6;
        this.zzg = i6;
    }

    @Deprecated
    public zzhf(Uri uri, long j2, long j5, String str) {
        this(uri, 0L, 1, null, Collections.EMPTY_MAP, j2, j5, null, 0, null);
    }
}
