package com.google.android.gms.internal.ads;

import android.net.Uri;
import androidx.fragment.app.h1;
import com.google.android.gms.ads.RequestConfiguration;
import java.util.HashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class zzfqb {
    private final com.google.android.gms.ads.internal.util.client.zzx zza;
    private final com.google.android.gms.ads.internal.util.client.zzu zzb;
    private final zzgzz zzc;
    private final zzfqc zzd;
    private final zzclx zze;

    public zzfqb(com.google.android.gms.ads.internal.util.client.zzx zzxVar, com.google.android.gms.ads.internal.util.client.zzu zzuVar, zzgzz zzgzzVar, zzfqc zzfqcVar, zzclx zzclxVar) {
        this.zza = zzxVar;
        this.zzb = zzuVar;
        this.zzc = zzgzzVar;
        this.zzd = zzfqcVar;
        this.zze = zzclxVar;
    }

    private final j3.a zze(final String str, final long j2, final int i5) {
        final String str2;
        com.google.android.gms.ads.internal.util.client.zzx zzxVar = this.zza;
        if (i5 > zzxVar.zza()) {
            zzfqc zzfqcVar = this.zzd;
            if (zzfqcVar == null || !zzxVar.zzd()) {
                return zzgzo.zza(com.google.android.gms.ads.internal.util.client.zzt.RETRIABLE_FAILURE);
            }
            zzfqcVar.zza(str, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, 2);
            return zzgzo.zza(com.google.android.gms.ads.internal.util.client.zzt.BUFFERED);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzjS)).booleanValue()) {
            Uri parse = Uri.parse(str);
            String encodedQuery = parse.getEncodedQuery();
            Uri.Builder clearQuery = parse.buildUpon().clearQuery();
            clearQuery.appendQueryParameter("pa", Integer.toString(i5));
            String valueOf = String.valueOf(clearQuery.build());
            str2 = h1.b(new StringBuilder(valueOf.length() + 1 + String.valueOf(encodedQuery).length()), valueOf, "&", encodedQuery);
        } else {
            str2 = str;
        }
        zzgyw zzgywVar = new zzgyw() { // from class: com.google.android.gms.internal.ads.zzfqa
            @Override // com.google.android.gms.internal.ads.zzgyw
            public final /* synthetic */ j3.a zza(Object obj) {
                return zzfqb.this.zzb(i5, j2, str, (com.google.android.gms.ads.internal.util.client.zzt) obj);
            }
        };
        if (j2 == 0) {
            zzgzz zzgzzVar = this.zzc;
            return zzgzo.zzj(zzgzzVar.submit(new Callable() { // from class: com.google.android.gms.internal.ads.zzfpz
                @Override // java.util.concurrent.Callable
                public final /* synthetic */ Object call() {
                    return zzfqb.this.zzd(str2);
                }
            }), zzgywVar, zzgzzVar);
        }
        zzgzz zzgzzVar2 = this.zzc;
        return zzgzo.zzj(zzgzzVar2.schedule(new Callable() { // from class: com.google.android.gms.internal.ads.zzfpy
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return zzfqb.this.zzc(str2);
            }
        }, j2, TimeUnit.MILLISECONDS), zzgywVar, zzgzzVar2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzf, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final com.google.android.gms.ads.internal.util.client.zzt zzd(String str) {
        zzclx zzclxVar;
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzkk)).booleanValue() || (zzclxVar = this.zze) == null || (!com.google.android.gms.ads.internal.zzt.zzc().zzi(str) && !com.google.android.gms.ads.internal.zzt.zzc().zzj(str))) {
            return this.zzb.zzc(str, null);
        }
        String zzb = zzclxVar.zzb();
        HashMap hashMap = new HashMap();
        if (zzb != null) {
            hashMap.put((String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzkl), zzb);
        }
        return this.zzb.zzc(str, hashMap);
    }

    public final j3.a zza(String str) {
        if (str != null) {
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzg)).booleanValue() || !str.isEmpty()) {
                try {
                    return zze(str, 0L, 1);
                } catch (NullPointerException | RejectedExecutionException unused) {
                    return zzgzo.zza(com.google.android.gms.ads.internal.util.client.zzt.PERMANENT_FAILURE);
                }
            }
        }
        return zzgzo.zza(com.google.android.gms.ads.internal.util.client.zzt.PERMANENT_FAILURE);
    }

    public final /* synthetic */ j3.a zzb(int i5, long j2, String str, com.google.android.gms.ads.internal.util.client.zzt zztVar) {
        if (zztVar != com.google.android.gms.ads.internal.util.client.zzt.RETRIABLE_FAILURE) {
            return zzgzo.zza(zztVar);
        }
        com.google.android.gms.ads.internal.util.client.zzx zzxVar = this.zza;
        long zzb = zzxVar.zzb();
        if (i5 != 1) {
            zzb = (long) (zzxVar.zzc() * j2);
        }
        return zze(str, zzb, i5 + 1);
    }
}
