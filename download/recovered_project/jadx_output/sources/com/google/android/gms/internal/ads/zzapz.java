package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.AdRequest;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class zzapz {
    public final int zza;
    public final String zzb;
    public final int zzc;
    public final List zzd;
    public final byte[] zze;

    public zzapz(int i5, String str, int i6, List list, byte[] bArr) {
        this.zza = i5;
        this.zzb = str;
        this.zzc = i6;
        this.zzd = list == null ? Collections.EMPTY_LIST : Collections.unmodifiableList(list);
        this.zze = bArr;
    }

    public final int zza() {
        int i5 = this.zzc;
        if (i5 == 2) {
            return 2048;
        }
        if (i5 != 3) {
            return 0;
        }
        return AdRequest.MAX_CONTENT_URL_LENGTH;
    }
}
