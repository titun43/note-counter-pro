package com.google.android.gms.internal.ads;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
final class zzala {
    private static final zzgrr zza = zzgrr.zza(zzgqq.zzc(':'));
    private static final zzgrr zzb = zzgrr.zza(zzgqq.zzc('*'));
    private final List zzc = new ArrayList();
    private int zzd = 0;
    private int zze;

    public final void zza() {
        this.zzc.clear();
        this.zzd = 0;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00b7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int zzb(zzaev zzaevVar, zzafv zzafvVar, List list) {
        char c5;
        int i5 = this.zzd;
        if (i5 == 0) {
            long zzo = zzaevVar.zzo();
            zzafvVar.zza = (zzo == -1 || zzo < 8) ? 0L : zzo - 8;
            this.zzd = 1;
            return 1;
        }
        int i6 = 8;
        if (i5 != 1) {
            short s5 = 2820;
            short s6 = 2819;
            short s7 = 2817;
            short s8 = 2816;
            short s9 = 2192;
            if (i5 != 2) {
                long zzn = zzaevVar.zzn();
                int zzo2 = (int) ((zzaevVar.zzo() - zzaevVar.zzn()) - this.zze);
                zzer zzerVar = new zzer(zzo2);
                zzaevVar.zzc(zzerVar.zzi(), 0, zzo2);
                int i7 = 0;
                while (true) {
                    List list2 = this.zzc;
                    if (i7 < list2.size()) {
                        zzakz zzakzVar = (zzakz) list2.get(i7);
                        zzerVar.zzh((int) (zzakzVar.zza - zzn));
                        zzerVar.zzk(4);
                        int zzC = zzerVar.zzC();
                        Charset charset = StandardCharsets.UTF_8;
                        String zzK = zzerVar.zzK(zzC, charset);
                        switch (zzK.hashCode()) {
                            case -1711564334:
                                if (!zzK.equals("SlowMotion_Data")) {
                                    break;
                                } else {
                                    c5 = 2192;
                                    int i8 = zzakzVar.zzb - (zzC + 8);
                                    if (c5 == 2192) {
                                        ArrayList arrayList = new ArrayList();
                                        List zze = zzb.zze(zzerVar.zzK(i8, charset));
                                        for (int i9 = 0; i9 < zze.size(); i9++) {
                                            List zze2 = zza.zze((CharSequence) zze.get(i9));
                                            if (zze2.size() != 3) {
                                                throw zzat.zzb(null, null);
                                            }
                                            try {
                                                arrayList.add(new zzaiv(Long.parseLong((String) zze2.get(0)), Long.parseLong((String) zze2.get(1)), 1 << (Integer.parseInt((String) zze2.get(2)) - 1)));
                                            } catch (NumberFormatException e4) {
                                                throw zzat.zzb(null, e4);
                                            }
                                        }
                                        list.add(new zzaiw(arrayList));
                                    } else if (c5 != 2816 && c5 != 2817 && c5 != 2819 && c5 != 2820) {
                                        throw new IllegalStateException();
                                    }
                                    i7++;
                                }
                            case -1332107749:
                                if (!zzK.equals("Super_SlowMotion_Edit_Data")) {
                                    break;
                                } else {
                                    c5 = 2819;
                                    int i82 = zzakzVar.zzb - (zzC + 8);
                                    if (c5 == 2192) {
                                    }
                                    i7++;
                                }
                                break;
                            case -1251387154:
                                if (!zzK.equals("Super_SlowMotion_Data")) {
                                    break;
                                } else {
                                    c5 = 2816;
                                    int i822 = zzakzVar.zzb - (zzC + 8);
                                    if (c5 == 2192) {
                                    }
                                    i7++;
                                }
                                break;
                            case -830665521:
                                if (!zzK.equals("Super_SlowMotion_Deflickering_On")) {
                                    break;
                                } else {
                                    c5 = 2820;
                                    int i8222 = zzakzVar.zzb - (zzC + 8);
                                    if (c5 == 2192) {
                                    }
                                    i7++;
                                }
                                break;
                            case 1760745220:
                                if (!zzK.equals("Super_SlowMotion_BGM")) {
                                    break;
                                } else {
                                    c5 = 2817;
                                    int i82222 = zzakzVar.zzb - (zzC + 8);
                                    if (c5 == 2192) {
                                    }
                                    i7++;
                                }
                                break;
                        }
                    } else {
                        zzafvVar.zza = 0L;
                    }
                }
                throw zzat.zzb("Invalid SEF name", null);
            }
            long zzo3 = zzaevVar.zzo();
            int i10 = this.zze - 20;
            zzer zzerVar2 = new zzer(i10);
            zzaevVar.zzc(zzerVar2.zzi(), 0, i10);
            int i11 = 0;
            while (i11 < i10 / 12) {
                zzerVar2.zzk(2);
                short zzw = zzerVar2.zzw();
                if (zzw == s9 || zzw == s8 || zzw == s7 || zzw == s6 || zzw == s5) {
                    this.zzc.add(new zzakz(zzw, (zzo3 - this.zze) - zzerVar2.zzC(), zzerVar2.zzC()));
                } else {
                    zzerVar2.zzk(i6);
                }
                i11++;
                i6 = 8;
                s5 = 2820;
                s6 = 2819;
                s7 = 2817;
                s8 = 2816;
                s9 = 2192;
            }
            List list3 = this.zzc;
            if (list3.isEmpty()) {
                zzafvVar.zza = 0L;
            } else {
                this.zzd = 3;
                zzafvVar.zza = ((zzakz) list3.get(0)).zza;
            }
        } else {
            zzer zzerVar3 = new zzer(8);
            zzaevVar.zzc(zzerVar3.zzi(), 0, 8);
            this.zze = zzerVar3.zzC() + 8;
            if (zzerVar3.zzB() != 1397048916) {
                zzafvVar.zza = 0L;
            } else {
                zzafvVar.zza = zzaevVar.zzn() - (this.zze - 12);
                this.zzd = 2;
            }
        }
        return 1;
    }
}
