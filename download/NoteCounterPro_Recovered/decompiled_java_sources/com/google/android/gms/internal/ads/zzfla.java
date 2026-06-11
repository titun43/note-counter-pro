package com.google.android.gms.internal.ads;

import android.os.Parcelable;
import com.google.android.gms.internal.ads.zzbgj;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
final class zzfla implements zzfkz {
    private final ConcurrentHashMap zza;
    private final zzflg zzb;
    private final zzflc zzc = new zzflc();

    public zzfla(zzflg zzflgVar) {
        this.zza = new ConcurrentHashMap(zzflgVar.zzd);
        this.zzb = zzflgVar;
    }

    private final void zzf() {
        Parcelable.Creator<zzflg> creator = zzflg.CREATOR;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzhl)).booleanValue()) {
            StringBuilder sb = new StringBuilder();
            zzflg zzflgVar = this.zzb;
            sb.append(zzflgVar.zzb);
            sb.append(" PoolCollection");
            sb.append(this.zzc.zzg());
            int i5 = 0;
            for (Map.Entry entry : this.zza.entrySet()) {
                i5++;
                sb.append(i5);
                sb.append(". ");
                sb.append(entry.getValue());
                sb.append("#");
                sb.append(((zzflj) entry.getKey()).hashCode());
                sb.append("    ");
                for (int i6 = 0; i6 < ((zzfky) entry.getValue()).zzc(); i6++) {
                    sb.append("[O]");
                }
                for (int zzc = ((zzfky) entry.getValue()).zzc(); zzc < zzflgVar.zzd; zzc++) {
                    sb.append("[ ]");
                }
                sb.append("\n");
                sb.append(((zzfky) entry.getValue()).zzg());
                sb.append("\n");
            }
            while (i5 < zzflgVar.zzc) {
                i5++;
                sb.append(i5);
                sb.append(".\n");
            }
            String sb2 = sb.toString();
            int i7 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzd(sb2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfkz
    public final synchronized zzfli zza(zzflj zzfljVar) {
        zzfli zzfliVar;
        try {
            zzfky zzfkyVar = (zzfky) this.zza.get(zzfljVar);
            if (zzfkyVar != null) {
                zzfliVar = zzfkyVar.zzb();
                if (zzfliVar == null) {
                    this.zzc.zzb();
                }
                zzflw zzh = zzfkyVar.zzh();
                if (zzfliVar != null) {
                    zzbgj.zzb.zzc zzs = zzbgj.zzb.zzs();
                    zzbgj.zzb.zza.C0003zza zzs2 = zzbgj.zzb.zza.zzs();
                    zzs2.zzc(zzbgj.zzb.zzd.IN_MEMORY);
                    zzbgj.zzb.zze.zza zzq = zzbgj.zzb.zze.zzq();
                    zzq.zzc(zzh.zza);
                    zzq.zzg(zzh.zzb);
                    zzs2.zzh(zzq);
                    zzs.zzh(zzs2);
                    zzfliVar.zza.zza().zzd().zzj(zzs.zzbu());
                }
                zzf();
            } else {
                this.zzc.zza();
                zzf();
                zzfliVar = null;
            }
        } catch (Throwable th) {
            throw th;
        }
        return zzfliVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfkz
    public final synchronized boolean zzb(zzflj zzfljVar, zzfli zzfliVar) {
        boolean zza;
        try {
            ConcurrentHashMap concurrentHashMap = this.zza;
            zzfky zzfkyVar = (zzfky) concurrentHashMap.get(zzfljVar);
            ((x2.c) com.google.android.gms.ads.internal.zzt.zzk()).getClass();
            zzfliVar.zzd = System.currentTimeMillis();
            if (zzfkyVar == null) {
                zzflg zzflgVar = this.zzb;
                zzfky zzfkyVar2 = new zzfky(zzflgVar.zzd, zzflgVar.zze * zzbgj.zzq.zzf);
                if (concurrentHashMap.size() == zzflgVar.zzc) {
                    int i5 = zzflgVar.zzg;
                    int i6 = i5 - 1;
                    zzflj zzfljVar2 = null;
                    if (i5 == 0) {
                        throw null;
                    }
                    long j2 = Long.MAX_VALUE;
                    if (i6 == 0) {
                        for (Map.Entry entry : concurrentHashMap.entrySet()) {
                            if (((zzfky) entry.getValue()).zzd() < j2) {
                                j2 = ((zzfky) entry.getValue()).zzd();
                                zzfljVar2 = (zzflj) entry.getKey();
                            }
                        }
                        if (zzfljVar2 != null) {
                            concurrentHashMap.remove(zzfljVar2);
                        }
                    } else if (i6 == 1) {
                        for (Map.Entry entry2 : concurrentHashMap.entrySet()) {
                            if (((zzfky) entry2.getValue()).zze() < j2) {
                                j2 = ((zzfky) entry2.getValue()).zze();
                                zzfljVar2 = (zzflj) entry2.getKey();
                            }
                        }
                        if (zzfljVar2 != null) {
                            concurrentHashMap.remove(zzfljVar2);
                        }
                    } else if (i6 == 2) {
                        int i7 = com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
                        for (Map.Entry entry3 : concurrentHashMap.entrySet()) {
                            if (((zzfky) entry3.getValue()).zzf() < i7) {
                                i7 = ((zzfky) entry3.getValue()).zzf();
                                zzfljVar2 = (zzflj) entry3.getKey();
                            }
                        }
                        if (zzfljVar2 != null) {
                            concurrentHashMap.remove(zzfljVar2);
                        }
                    }
                    this.zzc.zzd();
                }
                concurrentHashMap.put(zzfljVar, zzfkyVar2);
                this.zzc.zzc();
                zzfkyVar = zzfkyVar2;
            }
            zza = zzfkyVar.zza(zzfliVar);
            zzflc zzflcVar = this.zzc;
            zzflcVar.zze();
            zzflb zzf = zzflcVar.zzf();
            zzflw zzh = zzfkyVar.zzh();
            zzbgj.zzb.zzc zzs = zzbgj.zzb.zzs();
            zzbgj.zzb.zza.C0003zza zzs2 = zzbgj.zzb.zza.zzs();
            zzs2.zzc(zzbgj.zzb.zzd.IN_MEMORY);
            zzbgj.zzb.zzg.zza zzs3 = zzbgj.zzb.zzg.zzs();
            zzs3.zzc(zzf.zza);
            zzs3.zzg(zzf.zzb);
            zzs3.zzk(zzh.zzb);
            zzs2.zzn(zzs3);
            zzs.zzh(zzs2);
            zzfliVar.zza.zza().zzd().zzk(zzs.zzbu());
            zzf();
        } catch (Throwable th) {
            throw th;
        }
        return zza;
    }

    @Override // com.google.android.gms.internal.ads.zzfkz
    public final synchronized boolean zzc(zzflj zzfljVar) {
        zzfky zzfkyVar = (zzfky) this.zza.get(zzfljVar);
        if (zzfkyVar == null) {
            return true;
        }
        return zzfkyVar.zzc() < this.zzb.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzfkz
    @Deprecated
    public final zzflj zzd(com.google.android.gms.ads.internal.client.zzm zzmVar, String str, com.google.android.gms.ads.internal.client.zzx zzxVar) {
        zzflg zzflgVar = this.zzb;
        return new zzflk(zzmVar, str, new zzbzx(zzflgVar.zza).zza().zzj, zzflgVar.zzf, zzxVar);
    }

    @Override // com.google.android.gms.internal.ads.zzfkz
    public final zzflg zze() {
        return this.zzb;
    }
}
