package com.google.android.gms.internal.ads;

import androidx.emoji2.text.u;
import com.google.android.gms.ads.RequestConfiguration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;

/* loaded from: classes.dex */
final class zzwy implements zzwi, zzwh {
    private final zzwi[] zza;
    private final boolean[] zzb;
    private zzwh zzf;
    private zzyn zzg;
    private final ArrayList zzd = new ArrayList();
    private final HashMap zze = new HashMap();
    private zzye zzi = new zzvu(zzguf.zzi(), zzguf.zzi());
    private final IdentityHashMap zzc = new IdentityHashMap();
    private zzwi[] zzh = new zzwi[0];

    public zzwy(zzvv zzvvVar, long[] jArr, zzwi... zzwiVarArr) {
        this.zza = zzwiVarArr;
        this.zzb = new boolean[zzwiVarArr.length];
        for (int i5 = 0; i5 < zzwiVarArr.length; i5++) {
            long j2 = jArr[i5];
            if (j2 != 0) {
                this.zzb[i5] = true;
                this.zza[i5] = new zzyk(zzwiVarArr[i5], j2);
            }
        }
    }

    public final zzwi zza(int i5) {
        return this.zzb[i5] ? ((zzyk) this.zza[i5]).zza() : this.zza[i5];
    }

    @Override // com.google.android.gms.internal.ads.zzwi
    public final void zzb(zzwh zzwhVar, long j2) {
        this.zzf = zzwhVar;
        ArrayList arrayList = this.zzd;
        zzwi[] zzwiVarArr = this.zza;
        Collections.addAll(arrayList, zzwiVarArr);
        for (zzwi zzwiVar : zzwiVarArr) {
            zzwiVar.zzb(this, j2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzwi
    public final void zzc() {
        int i5 = 0;
        while (true) {
            zzwi[] zzwiVarArr = this.zza;
            if (i5 >= zzwiVarArr.length) {
                return;
            }
            zzwiVarArr[i5].zzc();
            i5++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzwi
    public final zzyn zzd() {
        zzyn zzynVar = this.zzg;
        zzynVar.getClass();
        return zzynVar;
    }

    @Override // com.google.android.gms.internal.ads.zzwi
    public final long zze(zzaac[] zzaacVarArr, boolean[] zArr, zzyc[] zzycVarArr, boolean[] zArr2, long j2) {
        int length;
        int[] iArr;
        int length2 = zzaacVarArr.length;
        int[] iArr2 = new int[length2];
        int[] iArr3 = new int[length2];
        int i5 = 0;
        int i6 = 0;
        while (true) {
            length = zzaacVarArr.length;
            if (i6 >= length) {
                break;
            }
            zzyc zzycVar = zzycVarArr[i6];
            Integer num = zzycVar == null ? null : (Integer) this.zzc.get(zzycVar);
            iArr2[i6] = num == null ? -1 : num.intValue();
            zzaac zzaacVar = zzaacVarArr[i6];
            if (zzaacVar != null) {
                String str = zzaacVar.zza().zzb;
                iArr3[i6] = Integer.parseInt(str.substring(0, str.indexOf(":")));
            } else {
                iArr3[i6] = -1;
            }
            i6++;
        }
        IdentityHashMap identityHashMap = this.zzc;
        identityHashMap.clear();
        zzwi[] zzwiVarArr = this.zza;
        zzyc[] zzycVarArr2 = new zzyc[length];
        zzyc[] zzycVarArr3 = new zzyc[length];
        zzaac[] zzaacVarArr2 = new zzaac[length];
        ArrayList arrayList = new ArrayList(zzwiVarArr.length);
        long j5 = j2;
        int i7 = 0;
        while (i7 < zzwiVarArr.length) {
            int i8 = i5;
            while (i8 < zzaacVarArr.length) {
                zzycVarArr3[i8] = iArr2[i8] == i7 ? zzycVarArr[i8] : null;
                if (iArr3[i8] == i7) {
                    zzaac zzaacVar2 = zzaacVarArr[i8];
                    zzaacVar2.getClass();
                    iArr = iArr3;
                    zzbg zzbgVar = (zzbg) this.zze.get(zzaacVar2.zza());
                    zzbgVar.getClass();
                    zzaacVarArr2[i8] = new zzwx(zzaacVar2, zzbgVar);
                } else {
                    iArr = iArr3;
                    zzaacVarArr2[i8] = null;
                }
                i8++;
                iArr3 = iArr;
            }
            int[] iArr4 = iArr3;
            ArrayList arrayList2 = arrayList;
            int i9 = i7;
            long zze = zzwiVarArr[i7].zze(zzaacVarArr2, zArr, zzycVarArr3, zArr2, j5);
            if (i9 == 0) {
                j5 = zze;
            } else if (zze != j5) {
                throw new IllegalStateException("Children enabled at different positions.");
            }
            boolean z4 = false;
            for (int i10 = 0; i10 < zzaacVarArr.length; i10++) {
                if (iArr4[i10] == i9) {
                    zzyc zzycVar2 = zzycVarArr3[i10];
                    zzycVar2.getClass();
                    zzycVarArr2[i10] = zzycVar2;
                    identityHashMap.put(zzycVar2, Integer.valueOf(i9));
                    z4 = true;
                } else if (iArr2[i10] == i9) {
                    zzgrc.zzi(zzycVarArr3[i10] == null);
                }
            }
            if (z4) {
                arrayList2.add(zzwiVarArr[i9]);
            }
            i7 = i9 + 1;
            arrayList = arrayList2;
            iArr3 = iArr4;
            i5 = 0;
        }
        int i11 = i5;
        ArrayList arrayList3 = arrayList;
        System.arraycopy(zzycVarArr2, i11, zzycVarArr, i11, length);
        this.zzh = (zzwi[]) arrayList3.toArray(new zzwi[i11]);
        this.zzi = new zzvu(arrayList3, zzgvf.zzc(arrayList3, zzww.zza));
        return j5;
    }

    @Override // com.google.android.gms.internal.ads.zzwi
    public final void zzf(long j2, boolean z4) {
        for (zzwi zzwiVar : this.zzh) {
            zzwiVar.zzf(j2, false);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzwi, com.google.android.gms.internal.ads.zzye
    public final void zzg(long j2) {
        this.zzi.zzg(j2);
    }

    @Override // com.google.android.gms.internal.ads.zzwi
    public final long zzh() {
        long j2 = -9223372036854775807L;
        for (zzwi zzwiVar : this.zzh) {
            long zzh = zzwiVar.zzh();
            if (zzh != -9223372036854775807L) {
                if (j2 == -9223372036854775807L) {
                    for (zzwi zzwiVar2 : this.zzh) {
                        if (zzwiVar2 == zzwiVar) {
                            break;
                        }
                        if (zzwiVar2.zzj(zzh) != zzh) {
                            throw new IllegalStateException("Unexpected child seekToUs result.");
                        }
                    }
                    j2 = zzh;
                } else if (zzh != j2) {
                    throw new IllegalStateException("Conflicting discontinuities.");
                }
            } else if (j2 != -9223372036854775807L && zzwiVar.zzj(j2) != j2) {
                throw new IllegalStateException("Unexpected child seekToUs result.");
            }
        }
        return j2;
    }

    @Override // com.google.android.gms.internal.ads.zzwi, com.google.android.gms.internal.ads.zzye
    public final long zzi() {
        return this.zzi.zzi();
    }

    @Override // com.google.android.gms.internal.ads.zzwi
    public final long zzj(long j2) {
        long zzj = this.zzh[0].zzj(j2);
        int i5 = 1;
        while (true) {
            zzwi[] zzwiVarArr = this.zzh;
            if (i5 >= zzwiVarArr.length) {
                return zzj;
            }
            if (zzwiVarArr[i5].zzj(zzj) != zzj) {
                throw new IllegalStateException("Unexpected child seekToUs result.");
            }
            i5++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzwi
    public final long zzk(long j2, zzmt zzmtVar) {
        zzwi[] zzwiVarArr = this.zzh;
        return (zzwiVarArr.length > 0 ? zzwiVarArr[0] : this.zza[0]).zzk(j2, zzmtVar);
    }

    @Override // com.google.android.gms.internal.ads.zzwi, com.google.android.gms.internal.ads.zzye
    public final long zzl() {
        return this.zzi.zzl();
    }

    @Override // com.google.android.gms.internal.ads.zzwi, com.google.android.gms.internal.ads.zzye
    public final boolean zzm(zzll zzllVar) {
        ArrayList arrayList = this.zzd;
        if (arrayList.isEmpty()) {
            return this.zzi.zzm(zzllVar);
        }
        int size = arrayList.size();
        for (int i5 = 0; i5 < size; i5++) {
            ((zzwi) arrayList.get(i5)).zzm(zzllVar);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzwi, com.google.android.gms.internal.ads.zzye
    public final boolean zzn() {
        return this.zzi.zzn();
    }

    @Override // com.google.android.gms.internal.ads.zzwh
    public final void zzp(zzwi zzwiVar) {
        ArrayList arrayList = this.zzd;
        arrayList.remove(zzwiVar);
        if (arrayList.isEmpty()) {
            zzwi[] zzwiVarArr = this.zza;
            int i5 = 0;
            for (zzwi zzwiVar2 : zzwiVarArr) {
                i5 += zzwiVar2.zzd().zzb;
            }
            zzbg[] zzbgVarArr = new zzbg[i5];
            int i6 = 0;
            for (int i7 = 0; i7 < zzwiVarArr.length; i7++) {
                zzyn zzd = zzwiVarArr[i7].zzd();
                int i8 = zzd.zzb;
                int i9 = 0;
                while (i9 < i8) {
                    zzbg zza = zzd.zza(i9);
                    int i10 = zza.zza;
                    zzv[] zzvVarArr = new zzv[i10];
                    int i11 = 0;
                    while (i11 < i10) {
                        zzv zza2 = zza.zza(i11);
                        zzt zza3 = zza2.zza();
                        String str = zza2.zza;
                        if (str == null) {
                            str = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
                        }
                        zzwi[] zzwiVarArr2 = zzwiVarArr;
                        StringBuilder sb = new StringBuilder(str.length() + u.b(i7, 1));
                        sb.append(i7);
                        sb.append(":");
                        sb.append(str);
                        zza3.zza(sb.toString());
                        zzvVarArr[i11] = zza3.zzM();
                        i11++;
                        zzwiVarArr = zzwiVarArr2;
                    }
                    zzwi[] zzwiVarArr3 = zzwiVarArr;
                    String str2 = zza.zzb;
                    StringBuilder sb2 = new StringBuilder(u.b(i7, 1) + String.valueOf(str2).length());
                    sb2.append(i7);
                    sb2.append(":");
                    sb2.append(str2);
                    zzbg zzbgVar = new zzbg(sb2.toString(), zzvVarArr);
                    this.zze.put(zzbgVar, zza);
                    zzbgVarArr[i6] = zzbgVar;
                    i9++;
                    i6++;
                    zzwiVarArr = zzwiVarArr3;
                }
            }
            this.zzg = new zzyn(zzbgVarArr);
            zzwh zzwhVar = this.zzf;
            zzwhVar.getClass();
            zzwhVar.zzp(this);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzyd
    public final /* bridge */ /* synthetic */ void zzs(zzye zzyeVar) {
        zzwh zzwhVar = this.zzf;
        zzwhVar.getClass();
        zzwhVar.zzs(this);
    }
}
