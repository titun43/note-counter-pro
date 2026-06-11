package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class zzaok implements zzaqa {
    private final List zza;

    public zzaok(int i5, List list) {
        this.zza = list;
    }

    private final zzapq zzc(zzapz zzapzVar) {
        return new zzapq(zze(zzapzVar), "video/mp2t");
    }

    private final zzaqf zzd(zzapz zzapzVar) {
        return new zzaqf(zze(zzapzVar), "video/mp2t");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v4 */
    private final List zze(zzapz zzapzVar) {
        String str;
        int i5;
        List list;
        zzer zzerVar = new zzer(zzapzVar.zze);
        ArrayList arrayList = this.zza;
        while (zzerVar.zzd() > 0) {
            int zzs = zzerVar.zzs();
            int zzg = zzerVar.zzg() + zzerVar.zzs();
            if (zzs == 134) {
                arrayList = new ArrayList();
                int zzs2 = zzerVar.zzs() & 31;
                for (int i6 = 0; i6 < zzs2; i6++) {
                    String zzK = zzerVar.zzK(3, StandardCharsets.UTF_8);
                    int zzs3 = zzerVar.zzs();
                    boolean z4 = (zzs3 & 128) != 0;
                    if (z4) {
                        i5 = zzs3 & 63;
                        str = "application/cea-708";
                    } else {
                        str = "application/cea-608";
                        i5 = 1;
                    }
                    byte zzs4 = (byte) zzerVar.zzs();
                    zzerVar.zzk(1);
                    if (z4) {
                        int i7 = zzs4 & 64;
                        int i8 = zzdo.zza;
                        list = Collections.singletonList(i7 != 0 ? new byte[]{1} : new byte[]{0});
                    } else {
                        list = null;
                    }
                    zzt zztVar = new zzt();
                    zztVar.zzm(str);
                    zztVar.zze(zzK);
                    zztVar.zzJ(i5);
                    zztVar.zzp(list);
                    arrayList.add(zztVar.zzM());
                }
            }
            zzerVar.zzh(zzg);
            arrayList = arrayList;
        }
        return arrayList;
    }

    @Override // com.google.android.gms.internal.ads.zzaqa
    public final SparseArray zza() {
        return new SparseArray();
    }

    @Override // com.google.android.gms.internal.ads.zzaqa
    public final zzaqc zzb(int i5, zzapz zzapzVar) {
        if (i5 != 2) {
            if (i5 == 3 || i5 == 4) {
                return new zzapg(new zzaoz(zzapzVar.zzb, zzapzVar.zza(), "video/mp2t"));
            }
            if (i5 == 21) {
                return new zzapg(new zzaox("video/mp2t"));
            }
            if (i5 == 27) {
                return new zzapg(new zzaou(zzc(zzapzVar), false, false, "video/mp2t"));
            }
            if (i5 == 36) {
                return new zzapg(new zzaow(zzc(zzapzVar), "video/mp2t"));
            }
            if (i5 == 45) {
                return new zzapg(new zzapa("video/mp2t"));
            }
            if (i5 == 89) {
                return new zzapg(new zzaom(zzapzVar.zzd, "video/mp2t"));
            }
            if (i5 == 172) {
                return new zzapg(new zzaog(zzapzVar.zzb, zzapzVar.zza(), "video/mp2t"));
            }
            if (i5 == 257) {
                return new zzapo(new zzapf("application/vnd.dvb.ait", "video/mp2t"));
            }
            if (i5 != 128) {
                if (i5 != 129) {
                    if (i5 != 138) {
                        if (i5 == 139) {
                            return new zzapg(new zzaol(zzapzVar.zzb, zzapzVar.zza(), 5408, "video/mp2t"));
                        }
                        switch (i5) {
                            case 15:
                                return new zzapg(new zzaoj(false, zzapzVar.zzb, zzapzVar.zza(), "video/mp2t"));
                            case 16:
                                return new zzapg(new zzaos(zzd(zzapzVar), "video/mp2t"));
                            case 17:
                                return new zzapg(new zzaoy(zzapzVar.zzb, zzapzVar.zza(), "video/mp2t"));
                            default:
                                switch (i5) {
                                    case 134:
                                        return new zzapo(new zzapf("application/x-scte35", "video/mp2t"));
                                    case 135:
                                        break;
                                    case 136:
                                        break;
                                    default:
                                        return null;
                                }
                        }
                    }
                    return new zzapg(new zzaol(zzapzVar.zzb, zzapzVar.zza(), 4096, "video/mp2t"));
                }
                return new zzapg(new zzaod(zzapzVar.zzb, zzapzVar.zza(), "video/mp2t"));
            }
        }
        return new zzapg(new zzaop(zzd(zzapzVar), "video/mp2t"));
    }

    public zzaok() {
        this(0);
    }

    public zzaok(int i5) {
        this.zza = zzguf.zzi();
    }
}
