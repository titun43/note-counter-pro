package com.google.android.gms.ads.internal.util;

import a3.a;
import android.content.Context;
import androidx.emoji2.text.t;
import androidx.work.b;
import androidx.work.c;
import androidx.work.e;
import androidx.work.g;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.internal.offline.buffering.OfflineNotificationPoster;
import com.google.android.gms.ads.internal.offline.buffering.OfflinePingSender;
import java.util.HashMap;
import java.util.HashSet;
import l1.k;
import t2.i;

/* loaded from: classes.dex */
public class WorkManagerUtil extends zzbn {
    private static void zzb(Context context) {
        try {
            k.R(context.getApplicationContext(), new b(new i(6)));
        } catch (IllegalStateException unused) {
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzbo
    public final boolean zze(a aVar, String str, String str2) {
        return zzg(aVar, new com.google.android.gms.ads.internal.offline.buffering.zza(str, str2, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED));
    }

    @Override // com.google.android.gms.ads.internal.util.zzbo
    public final void zzf(a aVar) {
        Context context = (Context) a3.b.b(aVar);
        zzb(context);
        try {
            k Q = k.Q(context);
            Q.f2490f.i(new u1.b(Q, 0));
            e eVar = new e();
            c cVar = new c();
            cVar.f623a = 1;
            cVar.f628f = -1L;
            cVar.f629g = -1L;
            new HashSet();
            cVar.f624b = false;
            cVar.f625c = false;
            cVar.f623a = 2;
            cVar.f626d = false;
            cVar.f627e = false;
            cVar.h = eVar;
            cVar.f628f = -1L;
            cVar.f629g = -1L;
            t tVar = new t(OfflinePingSender.class);
            ((t1.i) tVar.f284i).f3348j = cVar;
            ((HashSet) tVar.f285j).add("offline_ping_sender_work");
            Q.f(tVar.e());
        } catch (IllegalStateException e4) {
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Failed to instantiate WorkManager.", e4);
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzbo
    public final boolean zzg(a aVar, com.google.android.gms.ads.internal.offline.buffering.zza zzaVar) {
        Context context = (Context) a3.b.b(aVar);
        zzb(context);
        e eVar = new e();
        c cVar = new c();
        cVar.f623a = 1;
        cVar.f628f = -1L;
        cVar.f629g = -1L;
        new HashSet();
        cVar.f624b = false;
        cVar.f625c = false;
        cVar.f623a = 2;
        cVar.f626d = false;
        cVar.f627e = false;
        cVar.h = eVar;
        cVar.f628f = -1L;
        cVar.f629g = -1L;
        HashMap hashMap = new HashMap();
        hashMap.put("uri", zzaVar.zza);
        hashMap.put("gws_query_id", zzaVar.zzb);
        hashMap.put("image_url", zzaVar.zzc);
        g gVar = new g(hashMap);
        g.c(gVar);
        t tVar = new t(OfflineNotificationPoster.class);
        t1.i iVar = (t1.i) tVar.f284i;
        iVar.f3348j = cVar;
        iVar.f3344e = gVar;
        ((HashSet) tVar.f285j).add("offline_notification_work");
        try {
            k.Q(context).f(tVar.e());
            return true;
        } catch (IllegalStateException e4) {
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Failed to instantiate WorkManager.", e4);
            return false;
        }
    }
}
