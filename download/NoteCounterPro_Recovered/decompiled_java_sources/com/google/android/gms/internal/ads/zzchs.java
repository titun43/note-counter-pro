package com.google.android.gms.internal.ads;

import androidx.emoji2.text.u;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class zzchs implements zzboh {
    private static final Integer zzb(Map map, String str) {
        if (!map.containsKey(str)) {
            return null;
        }
        try {
            return Integer.valueOf(Integer.parseInt((String) map.get(str)));
        } catch (NumberFormatException unused) {
            String str2 = (String) map.get(str);
            String n5 = u.n(new StringBuilder(str.length() + 39 + String.valueOf(str2).length()), "Precache invalid numeric parameter '", str, "': ", str2);
            int i5 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi(n5);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00cf  */
    @Override // com.google.android.gms.internal.ads.zzboh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzchr zzchrVar;
        int i5;
        zzcge zzcgeVar = (zzcge) obj;
        if (com.google.android.gms.ads.internal.util.client.zzo.zzm(3)) {
            JSONObject jSONObject = new JSONObject(map);
            jSONObject.remove("google.afma.Notify_dt");
            com.google.android.gms.ads.internal.util.client.zzo.zzd("Precache GMSG: ".concat(jSONObject.toString()));
        }
        zzchk zzB = com.google.android.gms.ads.internal.zzt.zzB();
        if (map.containsKey("abort")) {
            if (zzB.zza(zzcgeVar)) {
                return;
            }
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Precache abort but no precache task running.");
            return;
        }
        String str = (String) map.get("src");
        Integer zzb = zzb(map, "periodicReportIntervalMs");
        Integer zzb2 = zzb(map, "exoPlayerRenderingIntervalMs");
        Integer zzb3 = zzb(map, "exoPlayerIdleIntervalMs");
        zzcgd zzcgdVar = new zzcgd((String) map.get("flags"));
        boolean z4 = zzcgdVar.zzk;
        if (str != null) {
            String[] strArr = {str};
            String str2 = (String) map.get("demuxed");
            zzchj zzchjVar = null;
            if (str2 != null) {
                try {
                    JSONArray jSONArray = new JSONArray(str2);
                    String[] strArr2 = new String[jSONArray.length()];
                    i5 = 0;
                    for (int i6 = 0; i6 < jSONArray.length(); i6++) {
                        try {
                            strArr2[i6] = jSONArray.getString(i6);
                        } catch (JSONException unused) {
                            com.google.android.gms.ads.internal.util.client.zzo.zzi("Malformed demuxed URL list for precache: ".concat(str2));
                            strArr = null;
                            if (strArr == null) {
                            }
                            if (!z4) {
                            }
                            if (zzchjVar == null) {
                            }
                        }
                    }
                    strArr = strArr2;
                } catch (JSONException unused2) {
                    i5 = 0;
                }
            } else {
                i5 = 0;
            }
            if (strArr == null) {
                strArr = new String[1];
                strArr[i5] = str;
            }
            if (!z4) {
                Iterator it = zzB.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    zzchj zzchjVar2 = (zzchj) it.next();
                    if (zzchjVar2.zza == zzcgeVar && str.equals(zzchjVar2.zzd())) {
                        zzchjVar = zzchjVar2;
                        break;
                    }
                }
            } else {
                zzchjVar = zzB.zzb(zzcgeVar);
            }
            if (zzchjVar == null) {
                com.google.android.gms.ads.internal.util.client.zzo.zzi("Precache task is already running.");
                return;
            }
            if (zzcgeVar.zzk() == null) {
                com.google.android.gms.ads.internal.util.client.zzo.zzi("Precache requires a dependency provider.");
                return;
            }
            Integer zzb4 = zzb(map, "player");
            if (zzb4 == null) {
                zzb4 = Integer.valueOf(i5);
            }
            if (zzb != null) {
                zzcgeVar.zzo(zzb.intValue());
            }
            if (zzb2 != null) {
                zzcgeVar.zzA(zzb2.intValue());
            }
            if (zzb3 != null) {
                zzcgeVar.zzB(zzb3.intValue());
            }
            int intValue = zzb4.intValue();
            zzchb zzchbVar = zzcgeVar.zzk().zzb;
            if (intValue > 0) {
                int i7 = zzcgdVar.zzg;
                int zzQ = zzcfv.zzQ();
                if (zzQ < i7) {
                    zzchrVar = new zzcia(zzcgeVar, zzcgdVar);
                } else {
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzr)).booleanValue()) {
                        zzQ = zzchx.zzr();
                    }
                    zzchrVar = zzQ < zzcgdVar.zzb ? new zzchx(zzcgeVar, zzcgdVar) : new zzchv(zzcgeVar);
                }
            } else {
                zzchrVar = new zzchu(zzcgeVar);
            }
            new zzchj(zzcgeVar, zzchrVar, str, strArr).zzb();
        } else {
            zzchj zzb5 = zzB.zzb(zzcgeVar);
            if (zzb5 == null) {
                com.google.android.gms.ads.internal.util.client.zzo.zzi("Precache must specify a source.");
                return;
            }
            zzchrVar = zzb5.zzb;
        }
        Integer zzb6 = zzb(map, "minBufferMs");
        if (zzb6 != null) {
            zzchrVar.zzi(zzb6.intValue());
        }
        Integer zzb7 = zzb(map, "maxBufferMs");
        if (zzb7 != null) {
            zzchrVar.zzh(zzb7.intValue());
        }
        Integer zzb8 = zzb(map, "bufferForPlaybackMs");
        if (zzb8 != null) {
            zzchrVar.zzj(zzb8.intValue());
        }
        Integer zzb9 = zzb(map, "bufferForPlaybackAfterRebufferMs");
        if (zzb9 != null) {
            zzchrVar.zzk(zzb9.intValue());
        }
    }
}
