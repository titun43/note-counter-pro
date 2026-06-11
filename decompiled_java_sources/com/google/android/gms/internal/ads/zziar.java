package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
final class zziar implements zzidp {
    private final zziaq zza;
    private int zzb;
    private int zzc;
    private int zzd = 0;

    private zziar(zziaq zziaqVar) {
        zzice.zza(zziaqVar, "input");
        this.zza = zziaqVar;
        zziaqVar.zzd = this;
    }

    private final void zzQ(int i5) {
        if ((this.zzb & 7) != i5) {
            throw new zzicf("Protocol message tag had invalid wire type.");
        }
    }

    private final void zzR(Object obj, zzidu zziduVar, zzibb zzibbVar) {
        zziaq zziaqVar = this.zza;
        int zzo = zziaqVar.zzo();
        zziaqVar.zzH();
        int zzz = zziaqVar.zzz(zzo);
        zziaqVar.zza++;
        zziduVar.zzg(obj, this, zzibbVar);
        zziaqVar.zzb(0);
        zziaqVar.zza--;
        zziaqVar.zzA(zzz);
    }

    private final Object zzS(zzidu zziduVar, zzibb zzibbVar) {
        Object zza = zziduVar.zza();
        zzR(zza, zziduVar, zzibbVar);
        zziduVar.zzk(zza);
        return zza;
    }

    private final void zzT(Object obj, zzidu zziduVar, zzibb zzibbVar) {
        int i5 = this.zzc;
        this.zzc = ((this.zzb >>> 3) << 3) | 4;
        try {
            zziduVar.zzg(obj, this, zzibbVar);
            if (this.zzb == this.zzc) {
            } else {
                throw new zzicg("Failed to parse the message.");
            }
        } finally {
            this.zzc = i5;
        }
    }

    private final Object zzU(zzies zziesVar, Class cls, zzibb zzibbVar) {
        zzies zziesVar2 = zzies.zza;
        switch (zziesVar.ordinal()) {
            case 0:
                return Double.valueOf(zze());
            case 1:
                return Float.valueOf(zzf());
            case 2:
                return Long.valueOf(zzh());
            case 3:
                return Long.valueOf(zzg());
            case 4:
                return Integer.valueOf(zzi());
            case 5:
                return Long.valueOf(zzj());
            case 6:
                return Integer.valueOf(zzk());
            case 7:
                return Boolean.valueOf(zzl());
            case 8:
                return zzn();
            case 9:
            default:
                throw new IllegalArgumentException("unsupported field type.");
            case 10:
                zzQ(2);
                return zzS(zzidm.zza().zzb(cls), zzibbVar);
            case 11:
                return zzq();
            case 12:
                return Integer.valueOf(zzr());
            case 13:
                return Integer.valueOf(zzs());
            case 14:
                return Integer.valueOf(zzt());
            case 15:
                return Long.valueOf(zzu());
            case 16:
                return Integer.valueOf(zzv());
            case 17:
                return Long.valueOf(zzw());
        }
    }

    private final void zzV(int i5) {
        if (this.zza.zzC() != i5) {
            throw new zzicg("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }

    private static final void zzW(int i5) {
        if ((i5 & 3) != 0) {
            throw new zzicg("Failed to parse the message.");
        }
    }

    private static final void zzX(int i5) {
        if ((i5 & 7) != 0) {
            throw new zzicg("Failed to parse the message.");
        }
    }

    public static zziar zza(zziaq zziaqVar) {
        Object obj = zziaqVar.zzd;
        return obj != null ? (zziar) obj : new zziar(zziaqVar);
    }

    @Override // com.google.android.gms.internal.ads.zzidp
    public final void zzA(List list) {
        int zza;
        int i5;
        if (list instanceof zzicq) {
            zzicq zzicqVar = (zzicq) list;
            int i6 = this.zzb & 7;
            if (i6 != 0) {
                if (i6 != 2) {
                    throw new zzicf("Protocol message tag had invalid wire type.");
                }
                zziaq zziaqVar = this.zza;
                int zzC = zziaqVar.zzC() + zziaqVar.zzo();
                do {
                    zzicqVar.zzd(zziaqVar.zzg());
                } while (zziaqVar.zzC() < zzC);
                zzV(zzC);
                return;
            }
            do {
                zziaq zziaqVar2 = this.zza;
                zzicqVar.zzd(zziaqVar2.zzg());
                if (zziaqVar2.zzB()) {
                    return;
                } else {
                    i5 = zziaqVar2.zza();
                }
            } while (i5 == this.zzb);
        } else {
            int i7 = this.zzb & 7;
            if (i7 != 0) {
                if (i7 != 2) {
                    throw new zzicf("Protocol message tag had invalid wire type.");
                }
                zziaq zziaqVar3 = this.zza;
                int zzC2 = zziaqVar3.zzC() + zziaqVar3.zzo();
                do {
                    list.add(Long.valueOf(zziaqVar3.zzg()));
                } while (zziaqVar3.zzC() < zzC2);
                zzV(zzC2);
                return;
            }
            do {
                zziaq zziaqVar4 = this.zza;
                list.add(Long.valueOf(zziaqVar4.zzg()));
                if (zziaqVar4.zzB()) {
                    return;
                } else {
                    zza = zziaqVar4.zza();
                }
            } while (zza == this.zzb);
            i5 = zza;
        }
        this.zzd = i5;
    }

    @Override // com.google.android.gms.internal.ads.zzidp
    public final void zzB(List list) {
        int zza;
        int i5;
        if (list instanceof zzibs) {
            zzibs zzibsVar = (zzibs) list;
            int i6 = this.zzb & 7;
            if (i6 != 0) {
                if (i6 != 2) {
                    throw new zzicf("Protocol message tag had invalid wire type.");
                }
                zziaq zziaqVar = this.zza;
                int zzC = zziaqVar.zzC() + zziaqVar.zzo();
                do {
                    zzibsVar.zzi(zziaqVar.zzh());
                } while (zziaqVar.zzC() < zzC);
                zzV(zzC);
                return;
            }
            do {
                zziaq zziaqVar2 = this.zza;
                zzibsVar.zzi(zziaqVar2.zzh());
                if (zziaqVar2.zzB()) {
                    return;
                } else {
                    i5 = zziaqVar2.zza();
                }
            } while (i5 == this.zzb);
        } else {
            int i7 = this.zzb & 7;
            if (i7 != 0) {
                if (i7 != 2) {
                    throw new zzicf("Protocol message tag had invalid wire type.");
                }
                zziaq zziaqVar3 = this.zza;
                int zzC2 = zziaqVar3.zzC() + zziaqVar3.zzo();
                do {
                    list.add(Integer.valueOf(zziaqVar3.zzh()));
                } while (zziaqVar3.zzC() < zzC2);
                zzV(zzC2);
                return;
            }
            do {
                zziaq zziaqVar4 = this.zza;
                list.add(Integer.valueOf(zziaqVar4.zzh()));
                if (zziaqVar4.zzB()) {
                    return;
                } else {
                    zza = zziaqVar4.zza();
                }
            } while (zza == this.zzb);
            i5 = zza;
        }
        this.zzd = i5;
    }

    @Override // com.google.android.gms.internal.ads.zzidp
    public final void zzC(List list) {
        int zza;
        int i5;
        if (list instanceof zzicq) {
            zzicq zzicqVar = (zzicq) list;
            int i6 = this.zzb & 7;
            if (i6 != 1) {
                if (i6 != 2) {
                    throw new zzicf("Protocol message tag had invalid wire type.");
                }
                zziaq zziaqVar = this.zza;
                int zzo = zziaqVar.zzo();
                zzX(zzo);
                int zzC = zziaqVar.zzC() + zzo;
                do {
                    zzicqVar.zzd(zziaqVar.zzi());
                } while (zziaqVar.zzC() < zzC);
                return;
            }
            do {
                zziaq zziaqVar2 = this.zza;
                zzicqVar.zzd(zziaqVar2.zzi());
                if (zziaqVar2.zzB()) {
                    return;
                } else {
                    i5 = zziaqVar2.zza();
                }
            } while (i5 == this.zzb);
        } else {
            int i7 = this.zzb & 7;
            if (i7 != 1) {
                if (i7 != 2) {
                    throw new zzicf("Protocol message tag had invalid wire type.");
                }
                zziaq zziaqVar3 = this.zza;
                int zzo2 = zziaqVar3.zzo();
                zzX(zzo2);
                int zzC2 = zziaqVar3.zzC() + zzo2;
                do {
                    list.add(Long.valueOf(zziaqVar3.zzi()));
                } while (zziaqVar3.zzC() < zzC2);
                return;
            }
            do {
                zziaq zziaqVar4 = this.zza;
                list.add(Long.valueOf(zziaqVar4.zzi()));
                if (zziaqVar4.zzB()) {
                    return;
                } else {
                    zza = zziaqVar4.zza();
                }
            } while (zza == this.zzb);
            i5 = zza;
        }
        this.zzd = i5;
    }

    @Override // com.google.android.gms.internal.ads.zzidp
    public final void zzD(List list) {
        int zza;
        int i5;
        if (list instanceof zzibs) {
            zzibs zzibsVar = (zzibs) list;
            int i6 = this.zzb & 7;
            if (i6 == 2) {
                zziaq zziaqVar = this.zza;
                int zzo = zziaqVar.zzo();
                zzW(zzo);
                int zzC = zziaqVar.zzC() + zzo;
                do {
                    zzibsVar.zzi(zziaqVar.zzj());
                } while (zziaqVar.zzC() < zzC);
                return;
            }
            if (i6 != 5) {
                throw new zzicf("Protocol message tag had invalid wire type.");
            }
            do {
                zziaq zziaqVar2 = this.zza;
                zzibsVar.zzi(zziaqVar2.zzj());
                if (zziaqVar2.zzB()) {
                    return;
                } else {
                    i5 = zziaqVar2.zza();
                }
            } while (i5 == this.zzb);
        } else {
            int i7 = this.zzb & 7;
            if (i7 == 2) {
                zziaq zziaqVar3 = this.zza;
                int zzo2 = zziaqVar3.zzo();
                zzW(zzo2);
                int zzC2 = zziaqVar3.zzC() + zzo2;
                do {
                    list.add(Integer.valueOf(zziaqVar3.zzj()));
                } while (zziaqVar3.zzC() < zzC2);
                return;
            }
            if (i7 != 5) {
                throw new zzicf("Protocol message tag had invalid wire type.");
            }
            do {
                zziaq zziaqVar4 = this.zza;
                list.add(Integer.valueOf(zziaqVar4.zzj()));
                if (zziaqVar4.zzB()) {
                    return;
                } else {
                    zza = zziaqVar4.zza();
                }
            } while (zza == this.zzb);
            i5 = zza;
        }
        this.zzd = i5;
    }

    @Override // com.google.android.gms.internal.ads.zzidp
    public final void zzE(List list) {
        int zza;
        int i5;
        if (list instanceof zziad) {
            zziad zziadVar = (zziad) list;
            int i6 = this.zzb & 7;
            if (i6 != 0) {
                if (i6 != 2) {
                    throw new zzicf("Protocol message tag had invalid wire type.");
                }
                zziaq zziaqVar = this.zza;
                int zzC = zziaqVar.zzC() + zziaqVar.zzo();
                do {
                    zziadVar.zzg(zziaqVar.zzk());
                } while (zziaqVar.zzC() < zzC);
                zzV(zzC);
                return;
            }
            do {
                zziaq zziaqVar2 = this.zza;
                zziadVar.zzg(zziaqVar2.zzk());
                if (zziaqVar2.zzB()) {
                    return;
                } else {
                    i5 = zziaqVar2.zza();
                }
            } while (i5 == this.zzb);
        } else {
            int i7 = this.zzb & 7;
            if (i7 != 0) {
                if (i7 != 2) {
                    throw new zzicf("Protocol message tag had invalid wire type.");
                }
                zziaq zziaqVar3 = this.zza;
                int zzC2 = zziaqVar3.zzC() + zziaqVar3.zzo();
                do {
                    list.add(Boolean.valueOf(zziaqVar3.zzk()));
                } while (zziaqVar3.zzC() < zzC2);
                zzV(zzC2);
                return;
            }
            do {
                zziaq zziaqVar4 = this.zza;
                list.add(Boolean.valueOf(zziaqVar4.zzk()));
                if (zziaqVar4.zzB()) {
                    return;
                } else {
                    zza = zziaqVar4.zza();
                }
            } while (zza == this.zzb);
            i5 = zza;
        }
        this.zzd = i5;
    }

    public final void zzF(List list, boolean z4) {
        int zza;
        int i5;
        if ((this.zzb & 7) != 2) {
            throw new zzicf("Protocol message tag had invalid wire type.");
        }
        if ((list instanceof zzicn) && !z4) {
            zzicn zzicnVar = (zzicn) list;
            do {
                zzq();
                zzicnVar.zzb();
                zziaq zziaqVar = this.zza;
                if (zziaqVar.zzB()) {
                    return;
                } else {
                    i5 = zziaqVar.zza();
                }
            } while (i5 == this.zzb);
        } else {
            do {
                list.add(z4 ? zzn() : zzm());
                zziaq zziaqVar2 = this.zza;
                if (zziaqVar2.zzB()) {
                    return;
                } else {
                    zza = zziaqVar2.zza();
                }
            } while (zza == this.zzb);
            i5 = zza;
        }
        this.zzd = i5;
    }

    @Override // com.google.android.gms.internal.ads.zzidp
    public final void zzG(List list, zzidu zziduVar, zzibb zzibbVar) {
        int zza;
        int i5 = this.zzb;
        if ((i5 & 7) != 2) {
            throw new zzicf("Protocol message tag had invalid wire type.");
        }
        do {
            list.add(zzS(zziduVar, zzibbVar));
            zziaq zziaqVar = this.zza;
            if (zziaqVar.zzB() || this.zzd != 0) {
                return;
            } else {
                zza = zziaqVar.zza();
            }
        } while (zza == i5);
        this.zzd = zza;
    }

    @Override // com.google.android.gms.internal.ads.zzidp
    @Deprecated
    public final void zzH(List list, zzidu zziduVar, zzibb zzibbVar) {
        int zza;
        int i5 = this.zzb;
        if ((i5 & 7) != 3) {
            throw new zzicf("Protocol message tag had invalid wire type.");
        }
        do {
            Object zza2 = zziduVar.zza();
            zzT(zza2, zziduVar, zzibbVar);
            zziduVar.zzk(zza2);
            list.add(zza2);
            zziaq zziaqVar = this.zza;
            if (zziaqVar.zzB() || this.zzd != 0) {
                return;
            } else {
                zza = zziaqVar.zza();
            }
        } while (zza == i5);
        this.zzd = zza;
    }

    @Override // com.google.android.gms.internal.ads.zzidp
    public final void zzI(List list) {
        int zza;
        if ((this.zzb & 7) != 2) {
            throw new zzicf("Protocol message tag had invalid wire type.");
        }
        do {
            list.add(zzq());
            zziaq zziaqVar = this.zza;
            if (zziaqVar.zzB()) {
                return;
            } else {
                zza = zziaqVar.zza();
            }
        } while (zza == this.zzb);
        this.zzd = zza;
    }

    @Override // com.google.android.gms.internal.ads.zzidp
    public final void zzJ(List list) {
        int zza;
        int i5;
        if (list instanceof zzibs) {
            zzibs zzibsVar = (zzibs) list;
            int i6 = this.zzb & 7;
            if (i6 != 0) {
                if (i6 != 2) {
                    throw new zzicf("Protocol message tag had invalid wire type.");
                }
                zziaq zziaqVar = this.zza;
                int zzC = zziaqVar.zzC() + zziaqVar.zzo();
                do {
                    zzibsVar.zzi(zziaqVar.zzo());
                } while (zziaqVar.zzC() < zzC);
                zzV(zzC);
                return;
            }
            do {
                zziaq zziaqVar2 = this.zza;
                zzibsVar.zzi(zziaqVar2.zzo());
                if (zziaqVar2.zzB()) {
                    return;
                } else {
                    i5 = zziaqVar2.zza();
                }
            } while (i5 == this.zzb);
        } else {
            int i7 = this.zzb & 7;
            if (i7 != 0) {
                if (i7 != 2) {
                    throw new zzicf("Protocol message tag had invalid wire type.");
                }
                zziaq zziaqVar3 = this.zza;
                int zzC2 = zziaqVar3.zzC() + zziaqVar3.zzo();
                do {
                    list.add(Integer.valueOf(zziaqVar3.zzo()));
                } while (zziaqVar3.zzC() < zzC2);
                zzV(zzC2);
                return;
            }
            do {
                zziaq zziaqVar4 = this.zza;
                list.add(Integer.valueOf(zziaqVar4.zzo()));
                if (zziaqVar4.zzB()) {
                    return;
                } else {
                    zza = zziaqVar4.zza();
                }
            } while (zza == this.zzb);
            i5 = zza;
        }
        this.zzd = i5;
    }

    @Override // com.google.android.gms.internal.ads.zzidp
    public final void zzK(List list) {
        int zza;
        int i5;
        if (list instanceof zzibs) {
            zzibs zzibsVar = (zzibs) list;
            int i6 = this.zzb & 7;
            if (i6 != 0) {
                if (i6 != 2) {
                    throw new zzicf("Protocol message tag had invalid wire type.");
                }
                zziaq zziaqVar = this.zza;
                int zzC = zziaqVar.zzC() + zziaqVar.zzo();
                do {
                    zzibsVar.zzi(zziaqVar.zzp());
                } while (zziaqVar.zzC() < zzC);
                zzV(zzC);
                return;
            }
            do {
                zziaq zziaqVar2 = this.zza;
                zzibsVar.zzi(zziaqVar2.zzp());
                if (zziaqVar2.zzB()) {
                    return;
                } else {
                    i5 = zziaqVar2.zza();
                }
            } while (i5 == this.zzb);
        } else {
            int i7 = this.zzb & 7;
            if (i7 != 0) {
                if (i7 != 2) {
                    throw new zzicf("Protocol message tag had invalid wire type.");
                }
                zziaq zziaqVar3 = this.zza;
                int zzC2 = zziaqVar3.zzC() + zziaqVar3.zzo();
                do {
                    list.add(Integer.valueOf(zziaqVar3.zzp()));
                } while (zziaqVar3.zzC() < zzC2);
                zzV(zzC2);
                return;
            }
            do {
                zziaq zziaqVar4 = this.zza;
                list.add(Integer.valueOf(zziaqVar4.zzp()));
                if (zziaqVar4.zzB()) {
                    return;
                } else {
                    zza = zziaqVar4.zza();
                }
            } while (zza == this.zzb);
            i5 = zza;
        }
        this.zzd = i5;
    }

    @Override // com.google.android.gms.internal.ads.zzidp
    public final void zzL(List list) {
        int zza;
        int i5;
        if (list instanceof zzibs) {
            zzibs zzibsVar = (zzibs) list;
            int i6 = this.zzb & 7;
            if (i6 == 2) {
                zziaq zziaqVar = this.zza;
                int zzo = zziaqVar.zzo();
                zzW(zzo);
                int zzC = zziaqVar.zzC() + zzo;
                do {
                    zzibsVar.zzi(zziaqVar.zzq());
                } while (zziaqVar.zzC() < zzC);
                return;
            }
            if (i6 != 5) {
                throw new zzicf("Protocol message tag had invalid wire type.");
            }
            do {
                zziaq zziaqVar2 = this.zza;
                zzibsVar.zzi(zziaqVar2.zzq());
                if (zziaqVar2.zzB()) {
                    return;
                } else {
                    i5 = zziaqVar2.zza();
                }
            } while (i5 == this.zzb);
        } else {
            int i7 = this.zzb & 7;
            if (i7 == 2) {
                zziaq zziaqVar3 = this.zza;
                int zzo2 = zziaqVar3.zzo();
                zzW(zzo2);
                int zzC2 = zziaqVar3.zzC() + zzo2;
                do {
                    list.add(Integer.valueOf(zziaqVar3.zzq()));
                } while (zziaqVar3.zzC() < zzC2);
                return;
            }
            if (i7 != 5) {
                throw new zzicf("Protocol message tag had invalid wire type.");
            }
            do {
                zziaq zziaqVar4 = this.zza;
                list.add(Integer.valueOf(zziaqVar4.zzq()));
                if (zziaqVar4.zzB()) {
                    return;
                } else {
                    zza = zziaqVar4.zza();
                }
            } while (zza == this.zzb);
            i5 = zza;
        }
        this.zzd = i5;
    }

    @Override // com.google.android.gms.internal.ads.zzidp
    public final void zzM(List list) {
        int zza;
        int i5;
        if (list instanceof zzicq) {
            zzicq zzicqVar = (zzicq) list;
            int i6 = this.zzb & 7;
            if (i6 != 1) {
                if (i6 != 2) {
                    throw new zzicf("Protocol message tag had invalid wire type.");
                }
                zziaq zziaqVar = this.zza;
                int zzo = zziaqVar.zzo();
                zzX(zzo);
                int zzC = zziaqVar.zzC() + zzo;
                do {
                    zzicqVar.zzd(zziaqVar.zzr());
                } while (zziaqVar.zzC() < zzC);
                return;
            }
            do {
                zziaq zziaqVar2 = this.zza;
                zzicqVar.zzd(zziaqVar2.zzr());
                if (zziaqVar2.zzB()) {
                    return;
                } else {
                    i5 = zziaqVar2.zza();
                }
            } while (i5 == this.zzb);
        } else {
            int i7 = this.zzb & 7;
            if (i7 != 1) {
                if (i7 != 2) {
                    throw new zzicf("Protocol message tag had invalid wire type.");
                }
                zziaq zziaqVar3 = this.zza;
                int zzo2 = zziaqVar3.zzo();
                zzX(zzo2);
                int zzC2 = zziaqVar3.zzC() + zzo2;
                do {
                    list.add(Long.valueOf(zziaqVar3.zzr()));
                } while (zziaqVar3.zzC() < zzC2);
                return;
            }
            do {
                zziaq zziaqVar4 = this.zza;
                list.add(Long.valueOf(zziaqVar4.zzr()));
                if (zziaqVar4.zzB()) {
                    return;
                } else {
                    zza = zziaqVar4.zza();
                }
            } while (zza == this.zzb);
            i5 = zza;
        }
        this.zzd = i5;
    }

    @Override // com.google.android.gms.internal.ads.zzidp
    public final void zzN(List list) {
        int zza;
        int i5;
        if (list instanceof zzibs) {
            zzibs zzibsVar = (zzibs) list;
            int i6 = this.zzb & 7;
            if (i6 != 0) {
                if (i6 != 2) {
                    throw new zzicf("Protocol message tag had invalid wire type.");
                }
                zziaq zziaqVar = this.zza;
                int zzC = zziaqVar.zzC() + zziaqVar.zzo();
                do {
                    zzibsVar.zzi(zziaqVar.zzs());
                } while (zziaqVar.zzC() < zzC);
                zzV(zzC);
                return;
            }
            do {
                zziaq zziaqVar2 = this.zza;
                zzibsVar.zzi(zziaqVar2.zzs());
                if (zziaqVar2.zzB()) {
                    return;
                } else {
                    i5 = zziaqVar2.zza();
                }
            } while (i5 == this.zzb);
        } else {
            int i7 = this.zzb & 7;
            if (i7 != 0) {
                if (i7 != 2) {
                    throw new zzicf("Protocol message tag had invalid wire type.");
                }
                zziaq zziaqVar3 = this.zza;
                int zzC2 = zziaqVar3.zzC() + zziaqVar3.zzo();
                do {
                    list.add(Integer.valueOf(zziaqVar3.zzs()));
                } while (zziaqVar3.zzC() < zzC2);
                zzV(zzC2);
                return;
            }
            do {
                zziaq zziaqVar4 = this.zza;
                list.add(Integer.valueOf(zziaqVar4.zzs()));
                if (zziaqVar4.zzB()) {
                    return;
                } else {
                    zza = zziaqVar4.zza();
                }
            } while (zza == this.zzb);
            i5 = zza;
        }
        this.zzd = i5;
    }

    @Override // com.google.android.gms.internal.ads.zzidp
    public final void zzO(List list) {
        int zza;
        int i5;
        if (list instanceof zzicq) {
            zzicq zzicqVar = (zzicq) list;
            int i6 = this.zzb & 7;
            if (i6 != 0) {
                if (i6 != 2) {
                    throw new zzicf("Protocol message tag had invalid wire type.");
                }
                zziaq zziaqVar = this.zza;
                int zzC = zziaqVar.zzC() + zziaqVar.zzo();
                do {
                    zzicqVar.zzd(zziaqVar.zzt());
                } while (zziaqVar.zzC() < zzC);
                zzV(zzC);
                return;
            }
            do {
                zziaq zziaqVar2 = this.zza;
                zzicqVar.zzd(zziaqVar2.zzt());
                if (zziaqVar2.zzB()) {
                    return;
                } else {
                    i5 = zziaqVar2.zza();
                }
            } while (i5 == this.zzb);
        } else {
            int i7 = this.zzb & 7;
            if (i7 != 0) {
                if (i7 != 2) {
                    throw new zzicf("Protocol message tag had invalid wire type.");
                }
                zziaq zziaqVar3 = this.zza;
                int zzC2 = zziaqVar3.zzC() + zziaqVar3.zzo();
                do {
                    list.add(Long.valueOf(zziaqVar3.zzt()));
                } while (zziaqVar3.zzC() < zzC2);
                zzV(zzC2);
                return;
            }
            do {
                zziaq zziaqVar4 = this.zza;
                list.add(Long.valueOf(zziaqVar4.zzt()));
                if (zziaqVar4.zzB()) {
                    return;
                } else {
                    zza = zziaqVar4.zza();
                }
            } while (zza == this.zzb);
            i5 = zza;
        }
        this.zzd = i5;
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x005b, code lost:
    
        r10.put(r4, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x005e, code lost:
    
        r9.zza.zzA(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0063, code lost:
    
        return;
     */
    @Override // com.google.android.gms.internal.ads.zzidp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzP(Map map, zzicu zzicuVar, zzibb zzibbVar) {
        zzQ(2);
        zziaq zziaqVar = this.zza;
        int zzz = zziaqVar.zzz(zziaqVar.zzo());
        Object obj = zzicuVar.zzd;
        Object obj2 = zzicuVar.zzb;
        Object obj3 = obj;
        while (true) {
            try {
                int zzb = zzb();
                if (zzb == Integer.MAX_VALUE || zziaqVar.zzB()) {
                    break;
                }
                if (zzb == 1) {
                    obj2 = zzU(zzicuVar.zza, null, null);
                } else if (zzb != 2) {
                    try {
                        if (!zzd()) {
                            throw new zzicg("Unable to parse map entry.");
                        }
                    } catch (zzicf e4) {
                        if (!zzd()) {
                            throw new zzicg("Unable to parse map entry.", e4);
                        }
                    }
                } else {
                    obj3 = zzU(zzicuVar.zzc, obj.getClass(), zzibbVar);
                }
            } catch (Throwable th) {
                this.zza.zzA(zzz);
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzidp
    public final int zzb() {
        int i5 = this.zzd;
        if (i5 != 0) {
            this.zzb = i5;
            this.zzd = 0;
        } else {
            i5 = this.zza.zza();
            this.zzb = i5;
        }
        return (i5 == 0 || i5 == this.zzc) ? com.google.android.gms.common.api.f.API_PRIORITY_OTHER : i5 >>> 3;
    }

    @Override // com.google.android.gms.internal.ads.zzidp
    public final int zzc() {
        return this.zzb;
    }

    public final boolean zzd() {
        int i5;
        zziaq zziaqVar = this.zza;
        if (zziaqVar.zzB() || (i5 = this.zzb) == this.zzc) {
            return false;
        }
        return zziaqVar.zzc(i5);
    }

    @Override // com.google.android.gms.internal.ads.zzidp
    public final double zze() {
        zzQ(1);
        return this.zza.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzidp
    public final float zzf() {
        zzQ(5);
        return this.zza.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzidp
    public final long zzg() {
        zzQ(0);
        return this.zza.zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzidp
    public final long zzh() {
        zzQ(0);
        return this.zza.zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzidp
    public final int zzi() {
        zzQ(0);
        return this.zza.zzh();
    }

    @Override // com.google.android.gms.internal.ads.zzidp
    public final long zzj() {
        zzQ(1);
        return this.zza.zzi();
    }

    @Override // com.google.android.gms.internal.ads.zzidp
    public final int zzk() {
        zzQ(5);
        return this.zza.zzj();
    }

    @Override // com.google.android.gms.internal.ads.zzidp
    public final boolean zzl() {
        zzQ(0);
        return this.zza.zzk();
    }

    @Override // com.google.android.gms.internal.ads.zzidp
    public final String zzm() {
        zzQ(2);
        return this.zza.zzl();
    }

    @Override // com.google.android.gms.internal.ads.zzidp
    public final String zzn() {
        zzQ(2);
        return this.zza.zzm();
    }

    @Override // com.google.android.gms.internal.ads.zzidp
    public final void zzo(Object obj, zzidu zziduVar, zzibb zzibbVar) {
        zzQ(2);
        zzR(obj, zziduVar, zzibbVar);
    }

    @Override // com.google.android.gms.internal.ads.zzidp
    public final void zzp(Object obj, zzidu zziduVar, zzibb zzibbVar) {
        zzQ(3);
        zzT(obj, zziduVar, zzibbVar);
    }

    @Override // com.google.android.gms.internal.ads.zzidp
    public final zzian zzq() {
        zzQ(2);
        return this.zza.zzn();
    }

    @Override // com.google.android.gms.internal.ads.zzidp
    public final int zzr() {
        zzQ(0);
        return this.zza.zzo();
    }

    @Override // com.google.android.gms.internal.ads.zzidp
    public final int zzs() {
        zzQ(0);
        return this.zza.zzp();
    }

    @Override // com.google.android.gms.internal.ads.zzidp
    public final int zzt() {
        zzQ(5);
        return this.zza.zzq();
    }

    @Override // com.google.android.gms.internal.ads.zzidp
    public final long zzu() {
        zzQ(1);
        return this.zza.zzr();
    }

    @Override // com.google.android.gms.internal.ads.zzidp
    public final int zzv() {
        zzQ(0);
        return this.zza.zzs();
    }

    @Override // com.google.android.gms.internal.ads.zzidp
    public final long zzw() {
        zzQ(0);
        return this.zza.zzt();
    }

    @Override // com.google.android.gms.internal.ads.zzidp
    public final void zzx(List list) {
        int zza;
        int i5;
        if (list instanceof zziay) {
            zziay zziayVar = (zziay) list;
            int i6 = this.zzb & 7;
            if (i6 != 1) {
                if (i6 != 2) {
                    throw new zzicf("Protocol message tag had invalid wire type.");
                }
                zziaq zziaqVar = this.zza;
                int zzo = zziaqVar.zzo();
                zzX(zzo);
                int zzC = zziaqVar.zzC() + zzo;
                do {
                    zziayVar.zzg(zziaqVar.zzd());
                } while (zziaqVar.zzC() < zzC);
                return;
            }
            do {
                zziaq zziaqVar2 = this.zza;
                zziayVar.zzg(zziaqVar2.zzd());
                if (zziaqVar2.zzB()) {
                    return;
                } else {
                    i5 = zziaqVar2.zza();
                }
            } while (i5 == this.zzb);
        } else {
            int i7 = this.zzb & 7;
            if (i7 != 1) {
                if (i7 != 2) {
                    throw new zzicf("Protocol message tag had invalid wire type.");
                }
                zziaq zziaqVar3 = this.zza;
                int zzo2 = zziaqVar3.zzo();
                zzX(zzo2);
                int zzC2 = zziaqVar3.zzC() + zzo2;
                do {
                    list.add(Double.valueOf(zziaqVar3.zzd()));
                } while (zziaqVar3.zzC() < zzC2);
                return;
            }
            do {
                zziaq zziaqVar4 = this.zza;
                list.add(Double.valueOf(zziaqVar4.zzd()));
                if (zziaqVar4.zzB()) {
                    return;
                } else {
                    zza = zziaqVar4.zza();
                }
            } while (zza == this.zzb);
            i5 = zza;
        }
        this.zzd = i5;
    }

    @Override // com.google.android.gms.internal.ads.zzidp
    public final void zzy(List list) {
        int zza;
        int i5;
        if (list instanceof zzibi) {
            zzibi zzibiVar = (zzibi) list;
            int i6 = this.zzb & 7;
            if (i6 == 2) {
                zziaq zziaqVar = this.zza;
                int zzo = zziaqVar.zzo();
                zzW(zzo);
                int zzC = zziaqVar.zzC() + zzo;
                do {
                    zzibiVar.zzg(zziaqVar.zze());
                } while (zziaqVar.zzC() < zzC);
                return;
            }
            if (i6 != 5) {
                throw new zzicf("Protocol message tag had invalid wire type.");
            }
            do {
                zziaq zziaqVar2 = this.zza;
                zzibiVar.zzg(zziaqVar2.zze());
                if (zziaqVar2.zzB()) {
                    return;
                } else {
                    i5 = zziaqVar2.zza();
                }
            } while (i5 == this.zzb);
        } else {
            int i7 = this.zzb & 7;
            if (i7 == 2) {
                zziaq zziaqVar3 = this.zza;
                int zzo2 = zziaqVar3.zzo();
                zzW(zzo2);
                int zzC2 = zziaqVar3.zzC() + zzo2;
                do {
                    list.add(Float.valueOf(zziaqVar3.zze()));
                } while (zziaqVar3.zzC() < zzC2);
                return;
            }
            if (i7 != 5) {
                throw new zzicf("Protocol message tag had invalid wire type.");
            }
            do {
                zziaq zziaqVar4 = this.zza;
                list.add(Float.valueOf(zziaqVar4.zze()));
                if (zziaqVar4.zzB()) {
                    return;
                } else {
                    zza = zziaqVar4.zza();
                }
            } while (zza == this.zzb);
            i5 = zza;
        }
        this.zzd = i5;
    }

    @Override // com.google.android.gms.internal.ads.zzidp
    public final void zzz(List list) {
        int zza;
        int i5;
        if (list instanceof zzicq) {
            zzicq zzicqVar = (zzicq) list;
            int i6 = this.zzb & 7;
            if (i6 != 0) {
                if (i6 != 2) {
                    throw new zzicf("Protocol message tag had invalid wire type.");
                }
                zziaq zziaqVar = this.zza;
                int zzC = zziaqVar.zzC() + zziaqVar.zzo();
                do {
                    zzicqVar.zzd(zziaqVar.zzf());
                } while (zziaqVar.zzC() < zzC);
                zzV(zzC);
                return;
            }
            do {
                zziaq zziaqVar2 = this.zza;
                zzicqVar.zzd(zziaqVar2.zzf());
                if (zziaqVar2.zzB()) {
                    return;
                } else {
                    i5 = zziaqVar2.zza();
                }
            } while (i5 == this.zzb);
        } else {
            int i7 = this.zzb & 7;
            if (i7 != 0) {
                if (i7 != 2) {
                    throw new zzicf("Protocol message tag had invalid wire type.");
                }
                zziaq zziaqVar3 = this.zza;
                int zzC2 = zziaqVar3.zzC() + zziaqVar3.zzo();
                do {
                    list.add(Long.valueOf(zziaqVar3.zzf()));
                } while (zziaqVar3.zzC() < zzC2);
                zzV(zzC2);
                return;
            }
            do {
                zziaq zziaqVar4 = this.zza;
                list.add(Long.valueOf(zziaqVar4.zzf()));
                if (zziaqVar4.zzB()) {
                    return;
                } else {
                    zza = zziaqVar4.zza();
                }
            } while (zza == this.zzb);
            i5 = zza;
        }
        this.zzd = i5;
    }
}
