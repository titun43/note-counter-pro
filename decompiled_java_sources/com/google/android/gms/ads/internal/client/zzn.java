package com.google.android.gms.ads.internal.client;

import android.os.Bundle;
import com.google.android.gms.ads.RequestConfiguration;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class zzn {
    private Bundle zza = new Bundle();
    private List zzb = new ArrayList();
    private boolean zzc = false;
    private int zzd = -1;
    private final Bundle zze = new Bundle();
    private final Bundle zzf = new Bundle();
    private final List zzg = new ArrayList();
    private int zzh = -1;
    private String zzi = null;
    private final List zzj = new ArrayList();
    private int zzk = 60000;
    private final int zzl = RequestConfiguration.PublisherPrivacyPersonalizationState.DEFAULT.getValue();
    private long zzm = 0;

    public final zzm zza() {
        Bundle bundle = this.zza;
        Bundle bundle2 = this.zze;
        List list = this.zzb;
        boolean z4 = this.zzc;
        int i5 = this.zzd;
        int i6 = this.zzh;
        String str = this.zzi;
        List list2 = this.zzj;
        int i7 = this.zzl;
        return new zzm(8, -1L, bundle, -1, list, z4, i5, false, null, null, null, null, bundle2, this.zzf, this.zzg, null, null, false, null, i6, str, list2, this.zzk, null, i7, this.zzm, 0L);
    }

    public final zzn zzb(Bundle bundle) {
        this.zza = bundle;
        return this;
    }

    public final zzn zzc(List list) {
        this.zzb = list;
        return this;
    }

    public final zzn zzd(boolean z4) {
        this.zzc = z4;
        return this;
    }

    public final zzn zze(int i5) {
        this.zzd = i5;
        return this;
    }

    public final zzn zzf(int i5) {
        this.zzh = i5;
        return this;
    }

    public final zzn zzg(String str) {
        this.zzi = str;
        return this;
    }

    public final zzn zzh(int i5) {
        this.zzk = i5;
        return this;
    }

    public final zzn zzi(long j2) {
        this.zzm = j2;
        return this;
    }
}
