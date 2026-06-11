package com.google.android.gms.internal.ads;

import androidx.emoji2.text.u;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes.dex */
final class zzalv extends zzalt {
    private zzalu zza;
    private int zzb;
    private boolean zzc;
    private zzagm zzd;
    private zzagk zze;

    @Override // com.google.android.gms.internal.ads.zzalt
    public final void zza(boolean z4) {
        super.zza(z4);
        if (z4) {
            this.zza = null;
            this.zzd = null;
            this.zze = null;
        }
        this.zzb = 0;
        this.zzc = false;
    }

    @Override // com.google.android.gms.internal.ads.zzalt
    public final long zzb(zzer zzerVar) {
        if ((zzerVar.zzi()[0] & 1) == 1) {
            return -1L;
        }
        byte b2 = zzerVar.zzi()[0];
        zzalu zzaluVar = this.zza;
        zzaluVar.getClass();
        int i5 = !zzaluVar.zzd[(b2 >> 1) & (255 >>> (8 - zzaluVar.zze))].zza ? zzaluVar.zza.zze : zzaluVar.zza.zzf;
        int i6 = this.zzc ? (this.zzb + i5) / 4 : 0;
        if (zzerVar.zzj() < zzerVar.zze() + 4) {
            byte[] copyOf = Arrays.copyOf(zzerVar.zzi(), zzerVar.zze() + 4);
            zzerVar.zzb(copyOf, copyOf.length);
        } else {
            zzerVar.zzf(zzerVar.zze() + 4);
        }
        long j2 = i6;
        byte[] zzi = zzerVar.zzi();
        zzi[zzerVar.zze() - 4] = (byte) (j2 & 255);
        zzi[zzerVar.zze() - 3] = (byte) ((j2 >>> 8) & 255);
        zzi[zzerVar.zze() - 2] = (byte) ((j2 >>> 16) & 255);
        zzi[zzerVar.zze() - 1] = (byte) ((j2 >>> 24) & 255);
        this.zzc = true;
        this.zzb = i5;
        return j2;
    }

    @Override // com.google.android.gms.internal.ads.zzalt
    public final boolean zzc(zzer zzerVar, long j2, zzalr zzalrVar) {
        zzalu zzaluVar;
        int i5;
        int i6;
        int i7;
        int i8;
        long j5;
        if (this.zza != null) {
            zzalrVar.zza.getClass();
            return false;
        }
        zzagm zzagmVar = this.zzd;
        int i9 = 1;
        if (zzagmVar == null) {
            zzagn.zzd(1, zzerVar, false);
            int zzI = zzerVar.zzI();
            int zzs = zzerVar.zzs();
            int zzI2 = zzerVar.zzI();
            int zzC = zzerVar.zzC();
            int i10 = zzC <= 0 ? -1 : zzC;
            int zzC2 = zzerVar.zzC();
            int i11 = zzC2 <= 0 ? -1 : zzC2;
            int zzC3 = zzerVar.zzC();
            int i12 = zzC3 <= 0 ? -1 : zzC3;
            int zzs2 = zzerVar.zzs();
            this.zzd = new zzagm(zzI, zzs, zzI2, i10, i11, i12, (int) Math.pow(2.0d, zzs2 & 15), (int) Math.pow(2.0d, (zzs2 & 240) >> 4), 1 == (zzerVar.zzs() & 1), Arrays.copyOf(zzerVar.zzi(), zzerVar.zze()));
        } else {
            int i13 = 4;
            zzagk zzagkVar = this.zze;
            if (zzagkVar == null) {
                this.zze = zzagn.zzb(zzerVar, true, true);
            } else {
                byte[] bArr = new byte[zzerVar.zze()];
                System.arraycopy(zzerVar.zzi(), 0, bArr, 0, zzerVar.zze());
                int i14 = zzagmVar.zza;
                int i15 = 5;
                zzagn.zzd(5, zzerVar, false);
                int zzs3 = zzerVar.zzs() + 1;
                zzagj zzagjVar = new zzagj(zzerVar.zzi());
                zzagjVar.zzc(zzerVar.zzg() * 8);
                int i16 = 0;
                while (true) {
                    int i17 = 2;
                    int i18 = 16;
                    if (i16 >= zzs3) {
                        int i19 = i9;
                        int i20 = 6;
                        int zzb = zzagjVar.zzb(6) + i19;
                        for (int i21 = 0; i21 < zzb; i21++) {
                            if (zzagjVar.zzb(16) != 0) {
                                throw zzat.zzb("placeholder of time domain transforms not zeroed out", null);
                            }
                        }
                        int zzb2 = zzagjVar.zzb(6) + i19;
                        int i22 = 0;
                        while (true) {
                            int i23 = 3;
                            if (i22 < zzb2) {
                                int zzb3 = zzagjVar.zzb(i18);
                                if (zzb3 == 0) {
                                    int i24 = 8;
                                    zzagjVar.zzc(8);
                                    zzagjVar.zzc(16);
                                    zzagjVar.zzc(16);
                                    zzagjVar.zzc(6);
                                    zzagjVar.zzc(8);
                                    int zzb4 = zzagjVar.zzb(4) + 1;
                                    int i25 = 0;
                                    while (i25 < zzb4) {
                                        zzagjVar.zzc(i24);
                                        i25++;
                                        i24 = 8;
                                    }
                                } else {
                                    if (zzb3 != 1) {
                                        StringBuilder sb = new StringBuilder(u.b(zzb3, 41));
                                        sb.append("floor type greater than 1 not decodable: ");
                                        sb.append(zzb3);
                                        throw zzat.zzb(sb.toString(), null);
                                    }
                                    int zzb5 = zzagjVar.zzb(5);
                                    int[] iArr = new int[zzb5];
                                    int i26 = -1;
                                    for (int i27 = 0; i27 < zzb5; i27++) {
                                        int zzb6 = zzagjVar.zzb(4);
                                        iArr[i27] = zzb6;
                                        if (zzb6 > i26) {
                                            i26 = zzb6;
                                        }
                                    }
                                    int i28 = i26 + 1;
                                    int[] iArr2 = new int[i28];
                                    int i29 = 0;
                                    while (i29 < i28) {
                                        iArr2[i29] = zzagjVar.zzb(i23) + 1;
                                        int zzb7 = zzagjVar.zzb(2);
                                        if (zzb7 > 0) {
                                            i7 = 8;
                                            zzagjVar.zzc(8);
                                        } else {
                                            i7 = 8;
                                        }
                                        int i30 = i28;
                                        int i31 = 0;
                                        for (int i32 = 1; i31 < (i32 << zzb7); i32 = 1) {
                                            zzagjVar.zzc(i7);
                                            i31++;
                                            i7 = 8;
                                        }
                                        i29++;
                                        i28 = i30;
                                        i23 = 3;
                                    }
                                    zzagjVar.zzc(2);
                                    int zzb8 = zzagjVar.zzb(4);
                                    int i33 = 0;
                                    int i34 = 0;
                                    for (int i35 = 0; i35 < zzb5; i35++) {
                                        i33 += iArr2[iArr[i35]];
                                        while (i34 < i33) {
                                            zzagjVar.zzc(zzb8);
                                            i34++;
                                        }
                                    }
                                }
                                i22++;
                                i20 = 6;
                                i18 = 16;
                            } else {
                                int i36 = 1;
                                int zzb9 = zzagjVar.zzb(i20) + 1;
                                int i37 = 0;
                                while (i37 < zzb9) {
                                    if (zzagjVar.zzb(16) > 2) {
                                        throw zzat.zzb("residueType greater than 2 is not decodable", null);
                                    }
                                    zzagjVar.zzc(24);
                                    zzagjVar.zzc(24);
                                    zzagjVar.zzc(24);
                                    int zzb10 = zzagjVar.zzb(i20) + i36;
                                    int i38 = 8;
                                    zzagjVar.zzc(8);
                                    int[] iArr3 = new int[zzb10];
                                    for (int i39 = 0; i39 < zzb10; i39++) {
                                        iArr3[i39] = ((zzagjVar.zza() ? zzagjVar.zzb(5) : 0) * 8) + zzagjVar.zzb(3);
                                    }
                                    int i40 = 0;
                                    while (i40 < zzb10) {
                                        int i41 = 0;
                                        while (i41 < i38) {
                                            if ((iArr3[i40] & (1 << i41)) != 0) {
                                                zzagjVar.zzc(i38);
                                            }
                                            i41++;
                                            i38 = 8;
                                        }
                                        i40++;
                                        i38 = 8;
                                    }
                                    i37++;
                                    i20 = 6;
                                    i36 = 1;
                                }
                                int zzb11 = zzagjVar.zzb(i20) + 1;
                                for (int i42 = 0; i42 < zzb11; i42++) {
                                    int zzb12 = zzagjVar.zzb(16);
                                    if (zzb12 != 0) {
                                        StringBuilder sb2 = new StringBuilder(u.b(zzb12, 41));
                                        sb2.append("mapping type other than 0 not supported: ");
                                        sb2.append(zzb12);
                                        zzee.zze("VorbisUtil", sb2.toString());
                                    } else {
                                        if (zzagjVar.zza()) {
                                            i5 = 1;
                                            i6 = zzagjVar.zzb(4) + 1;
                                        } else {
                                            i5 = 1;
                                            i6 = 1;
                                        }
                                        if (zzagjVar.zza()) {
                                            int zzb13 = zzagjVar.zzb(8) + i5;
                                            for (int i43 = 0; i43 < zzb13; i43++) {
                                                int i44 = i14 - 1;
                                                zzagjVar.zzc(zzagn.zza(i44));
                                                zzagjVar.zzc(zzagn.zza(i44));
                                            }
                                        }
                                        if (zzagjVar.zzb(2) != 0) {
                                            throw zzat.zzb("to reserved bits must be zero after mapping coupling steps", null);
                                        }
                                        if (i6 > 1) {
                                            for (int i45 = 0; i45 < i14; i45++) {
                                                zzagjVar.zzc(4);
                                            }
                                        }
                                        for (int i46 = 0; i46 < i6; i46++) {
                                            zzagjVar.zzc(8);
                                            zzagjVar.zzc(8);
                                            zzagjVar.zzc(8);
                                        }
                                    }
                                }
                                int zzb14 = zzagjVar.zzb(6);
                                int i47 = zzb14 + 1;
                                zzagl[] zzaglVarArr = new zzagl[i47];
                                for (int i48 = 0; i48 < i47; i48++) {
                                    zzaglVarArr[i48] = new zzagl(zzagjVar.zza(), zzagjVar.zzb(16), zzagjVar.zzb(16), zzagjVar.zzb(8));
                                }
                                if (!zzagjVar.zza()) {
                                    throw zzat.zzb("framing bit after modes not set as expected", null);
                                }
                                zzaluVar = new zzalu(zzagmVar, zzagkVar, bArr, zzaglVarArr, zzagn.zza(zzb14));
                            }
                        }
                    } else {
                        if (zzagjVar.zzb(24) != 5653314) {
                            int zzd = zzagjVar.zzd();
                            StringBuilder sb3 = new StringBuilder(String.valueOf(zzd).length() + 55);
                            sb3.append("expected code book to start with [0x56, 0x43, 0x42] at ");
                            sb3.append(zzd);
                            throw zzat.zzb(sb3.toString(), null);
                        }
                        int zzb15 = zzagjVar.zzb(16);
                        int zzb16 = zzagjVar.zzb(24);
                        if (zzagjVar.zza()) {
                            zzagjVar.zzc(i15);
                            for (int i49 = 0; i49 < zzb16; i49 += zzagjVar.zzb(zzagn.zza(zzb16 - i49))) {
                            }
                        } else {
                            boolean zza = zzagjVar.zza();
                            for (int i50 = 0; i50 < zzb16; i50++) {
                                if (!zza) {
                                    zzagjVar.zzc(i15);
                                } else if (zzagjVar.zza()) {
                                    zzagjVar.zzc(i15);
                                }
                            }
                        }
                        int i51 = i13;
                        int zzb17 = zzagjVar.zzb(i51);
                        if (zzb17 > 2) {
                            StringBuilder sb4 = new StringBuilder(String.valueOf(zzb17).length() + 42);
                            sb4.append("lookup type greater than 2 not decodable: ");
                            sb4.append(zzb17);
                            throw zzat.zzb(sb4.toString(), null);
                        }
                        if (zzb17 == i9) {
                            i17 = zzb17;
                        } else if (zzb17 != 2) {
                            i8 = i9;
                            i16++;
                            i9 = i8;
                            i13 = 4;
                            i15 = 5;
                        }
                        zzagjVar.zzc(32);
                        zzagjVar.zzc(32);
                        int zzb18 = zzagjVar.zzb(i51) + i9;
                        zzagjVar.zzc(i9);
                        if (i17 != i9) {
                            i8 = i9;
                            j5 = zzb15 * zzb16;
                        } else if (zzb15 != 0) {
                            i8 = i9;
                            j5 = (long) Math.floor(Math.pow(zzb16, 1.0d / zzb15));
                        } else {
                            i8 = i9;
                            j5 = 0;
                        }
                        zzagjVar.zzc((int) (j5 * zzb18));
                        i16++;
                        i9 = i8;
                        i13 = 4;
                        i15 = 5;
                    }
                }
            }
        }
        zzaluVar = null;
        this.zza = zzaluVar;
        if (zzaluVar == null) {
            return true;
        }
        ArrayList arrayList = new ArrayList();
        zzagm zzagmVar2 = zzaluVar.zza;
        arrayList.add(zzagmVar2.zzg);
        arrayList.add(zzaluVar.zzc);
        zzap zzc = zzagn.zzc(zzguf.zzr(zzaluVar.zzb.zza));
        zzt zztVar = new zzt();
        zztVar.zzl("audio/ogg");
        zztVar.zzm("audio/vorbis");
        zztVar.zzh(zzagmVar2.zzd);
        zztVar.zzi(zzagmVar2.zzc);
        zztVar.zzE(zzagmVar2.zza);
        zztVar.zzF(zzagmVar2.zzb);
        zztVar.zzp(arrayList);
        zztVar.zzk(zzc);
        zzalrVar.zza = zztVar.zzM();
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzalt
    public final void zzj(long j2) {
        super.zzj(j2);
        this.zzc = j2 != 0;
        zzagm zzagmVar = this.zzd;
        this.zzb = zzagmVar != null ? zzagmVar.zze : 0;
    }
}
