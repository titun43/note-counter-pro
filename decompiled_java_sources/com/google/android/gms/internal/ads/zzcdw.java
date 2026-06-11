package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.google.android.gms.ads.AdActivity;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

/* loaded from: classes.dex */
public final class zzcdw {
    final String zzf;
    private final com.google.android.gms.ads.internal.util.zzg zzl;
    long zza = -1;
    long zzb = -1;
    int zzc = -1;
    int zzd = -1;
    long zze = 0;
    private final Object zzj = new Object();
    private final Object zzk = new Object();
    int zzg = 0;
    int zzh = 0;
    int zzi = 0;
    private int zzm = 0;
    private final Map zzn = new HashMap();
    private final Map zzo = new HashMap();

    public zzcdw(String str, com.google.android.gms.ads.internal.util.zzg zzgVar) {
        this.zzf = str;
        this.zzl = zzgVar;
    }

    private final void zzj() {
        if (((Boolean) zzbjl.zza.zze()).booleanValue()) {
            synchronized (this.zzj) {
                this.zzc--;
                this.zzd--;
            }
        }
    }

    public final void zza() {
        synchronized (this.zzj) {
            this.zzg++;
        }
    }

    public final void zzb() {
        synchronized (this.zzj) {
            this.zzh++;
        }
    }

    public final void zzc() {
        synchronized (this.zzj) {
            this.zzi++;
        }
    }

    public final int zzd() {
        int i5;
        synchronized (this.zzj) {
            i5 = this.zzi;
        }
        return i5;
    }

    public final void zze(com.google.android.gms.ads.internal.client.zzm zzmVar, long j2) {
        Bundle bundle;
        synchronized (this.zzj) {
            try {
                com.google.android.gms.ads.internal.util.zzg zzgVar = this.zzl;
                long zzm = zzgVar.zzm();
                ((x2.c) com.google.android.gms.ads.internal.zzt.zzk()).getClass();
                long currentTimeMillis = System.currentTimeMillis();
                if (this.zzb == -1) {
                    if (currentTimeMillis - zzm > ((Long) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzbB)).longValue()) {
                        this.zzd = -1;
                    } else {
                        this.zzd = zzgVar.zzo();
                    }
                    this.zzb = j2;
                    this.zza = j2;
                } else {
                    this.zza = j2;
                }
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzew)).booleanValue() || (bundle = zzmVar.zzc) == null || bundle.getInt("gw", 2) != 1) {
                    this.zzc++;
                    int i5 = this.zzd + 1;
                    this.zzd = i5;
                    if (i5 == 0) {
                        this.zze = 0L;
                        zzgVar.zzp(currentTimeMillis);
                    } else {
                        this.zze = currentTimeMillis - zzgVar.zzq();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zzf() {
        zzj();
    }

    public final void zzg() {
        zzj();
    }

    public final Bundle zzh(Context context, String str) {
        Bundle bundle;
        synchronized (this.zzj) {
            try {
                bundle = new Bundle();
                if (!this.zzl.zzx()) {
                    bundle.putString("session_id", this.zzf);
                }
                bundle.putLong("basets", this.zzb);
                bundle.putLong("currts", this.zza);
                bundle.putString("seq_num", str);
                bundle.putInt("preqs", this.zzc);
                bundle.putInt("preqs_in_session", this.zzd);
                bundle.putLong("time_in_session", this.zze);
                bundle.putInt("pclick", this.zzg);
                bundle.putInt("pimp", this.zzh);
                Context zza = zzcae.zza(context);
                int identifier = zza.getResources().getIdentifier("Theme.Translucent", "style", "android");
                boolean z4 = false;
                if (identifier == 0) {
                    int i5 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzh("Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.");
                } else {
                    try {
                        if (identifier == zza.getPackageManager().getActivityInfo(new ComponentName(zza.getPackageName(), AdActivity.CLASS_NAME), 0).theme) {
                            z4 = true;
                        } else {
                            int i6 = com.google.android.gms.ads.internal.util.zze.zza;
                            com.google.android.gms.ads.internal.util.client.zzo.zzh("Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.");
                        }
                    } catch (PackageManager.NameNotFoundException unused) {
                        int i7 = com.google.android.gms.ads.internal.util.zze.zza;
                        com.google.android.gms.ads.internal.util.client.zzo.zzi("Fail to fetch AdActivity theme");
                        com.google.android.gms.ads.internal.util.client.zzo.zzh("Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.");
                    }
                }
                bundle.putBoolean("support_transparent_background", z4);
                bundle.putInt("consent_form_action_identifier", zzd());
            } catch (Throwable th) {
                throw th;
            }
        }
        return bundle;
    }

    public final zzcdv zzi(Set set, String str) {
        synchronized (this.zzk) {
            try {
                int i5 = this.zzm;
                this.zzm = i5 + 1;
                if (set.isEmpty()) {
                    return new zzcdv(i5, -1, -1);
                }
                TreeSet treeSet = new TreeSet(set);
                StringBuilder sb = new StringBuilder();
                Iterator it = treeSet.iterator();
                if (it.hasNext()) {
                    Object next = it.next();
                    while (true) {
                        sb.append((CharSequence) next);
                        if (!it.hasNext()) {
                            break;
                        }
                        sb.append((CharSequence) ",");
                        next = it.next();
                    }
                }
                String sb2 = sb.toString();
                Map map = this.zzn;
                Integer num = (Integer) map.get(sb2);
                int i6 = 0;
                int intValue = num == null ? 0 : num.intValue();
                map.put(sb2, Integer.valueOf(intValue + 1));
                if (str == null) {
                    return new zzcdv(i5, intValue, -1);
                }
                StringBuilder sb3 = new StringBuilder(str.length() + 1 + String.valueOf(sb2).length());
                sb3.append(str);
                sb3.append("|");
                sb3.append(sb2);
                String sb4 = sb3.toString();
                Map map2 = this.zzo;
                Integer num2 = (Integer) map2.get(sb4);
                if (num2 != null) {
                    i6 = num2.intValue();
                }
                map2.put(sb4, Integer.valueOf(i6 + 1));
                return new zzcdv(i5, intValue, i6);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
