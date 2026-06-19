package com.google.android.gms.ads.nonagon.signalgeneration;

import android.util.Pair;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.query.QueryInfo;
import com.google.android.gms.ads.query.QueryInfoGenerationCallback;
import com.google.android.gms.internal.ads.zzbjj;
import com.google.android.gms.internal.ads.zzdye;
import x2.c;

/* loaded from: classes.dex */
public final class zzp extends QueryInfoGenerationCallback {
    private final zzo zza;
    private final zzdye zzb;
    private final boolean zzc;
    private final int zzd;
    private final long zze;
    private final Boolean zzf;

    public zzp(zzo zzoVar, boolean z4, int i5, Boolean bool, zzdye zzdyeVar) {
        this.zza = zzoVar;
        this.zzc = z4;
        this.zzd = i5;
        this.zzf = bool;
        this.zzb = zzdyeVar;
        ((c) com.google.android.gms.ads.internal.zzt.zzk()).getClass();
        this.zze = System.currentTimeMillis();
    }

    private static long zza() {
        ((c) com.google.android.gms.ads.internal.zzt.zzk()).getClass();
        return ((Long) zzbjj.zzh.zze()).longValue() + System.currentTimeMillis();
    }

    private final long zzb() {
        ((c) com.google.android.gms.ads.internal.zzt.zzk()).getClass();
        return System.currentTimeMillis() - this.zze;
    }

    @Override // com.google.android.gms.ads.query.QueryInfoGenerationCallback
    public final void onFailure(String str) {
        Pair pair = new Pair("sgf_reason", str);
        Pair pair2 = new Pair("se", "query_g");
        Pair pair3 = new Pair("ad_format", AdFormat.BANNER.name());
        Pair pair4 = new Pair("rtype", Integer.toString(6));
        Pair pair5 = new Pair("scar", "true");
        Pair pair6 = new Pair("lat_ms", Long.toString(zzb()));
        int i5 = this.zzd;
        Pair pair7 = new Pair("sgpc_rn", Integer.toString(i5));
        Pair pair8 = new Pair("sgpc_lsu", String.valueOf(this.zzf));
        boolean z4 = this.zzc;
        zzaa.zze(this.zzb, null, "sgpcf", pair, pair2, pair3, pair4, pair5, pair6, pair7, pair8, new Pair("tpc", true != z4 ? "0" : "1"));
        this.zza.zzc(z4, new zzq(null, str, zza(), i5));
    }

    @Override // com.google.android.gms.ads.query.QueryInfoGenerationCallback
    public final void onSuccess(QueryInfo queryInfo) {
        Pair pair = new Pair("se", "query_g");
        Pair pair2 = new Pair("ad_format", AdFormat.BANNER.name());
        Pair pair3 = new Pair("rtype", Integer.toString(6));
        Pair pair4 = new Pair("scar", "true");
        Pair pair5 = new Pair("lat_ms", Long.toString(zzb()));
        int i5 = this.zzd;
        Pair pair6 = new Pair("sgpc_rn", Integer.toString(i5));
        Pair pair7 = new Pair("sgpc_lsu", String.valueOf(this.zzf));
        boolean z4 = this.zzc;
        zzaa.zze(this.zzb, null, "sgpcs", pair, pair2, pair3, pair4, pair5, pair6, pair7, new Pair("tpc", true != z4 ? "0" : "1"));
        this.zza.zzc(z4, new zzq(queryInfo, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, zza(), i5));
    }
}
