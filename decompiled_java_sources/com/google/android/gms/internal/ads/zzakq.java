package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class zzakq {
    public static void zza(int i5, zzap zzapVar, zzt zztVar, zzap zzapVar2, zzap... zzapVarArr) {
        if (zzapVar2 == null) {
            zzapVar2 = new zzap(-9223372036854775807L, new zzao[0]);
        }
        if (zzapVar != null) {
            zzguf zzd = zzapVar.zzd(zzfs.class);
            int size = zzd.size();
            for (int i6 = 0; i6 < size; i6++) {
                zzfs zzfsVar = (zzfs) zzd.get(i6);
                if (!zzfsVar.zza.equals("com.android.capture.fps") || i5 == 2) {
                    zzapVar2 = zzapVar2.zzg(zzfsVar);
                }
            }
        }
        for (zzap zzapVar3 : zzapVarArr) {
            zzapVar2 = zzapVar2.zzf(zzapVar3);
        }
        if (zzapVar2.zza() > 0) {
            zztVar.zzk(zzapVar2);
        }
    }

    public static void zzb(int i5, zzafn zzafnVar, zzt zztVar) {
        if (i5 == 1 && zzafnVar.zzb()) {
            zztVar.zzH(zzafnVar.zza);
            zztVar.zzI(zzafnVar.zzb);
        }
    }

    public static zzao zzc(zzer zzerVar) {
        String str;
        zzao zzaidVar;
        int zzB = zzerVar.zzB() + zzerVar.zzg();
        int zzB2 = zzerVar.zzB();
        int i5 = (zzB2 >> 24) & 255;
        zzao zzaoVar = null;
        try {
            if (i5 == 169 || i5 == 253) {
                int i6 = zzB2 & 16777215;
                if (i6 == 6516084) {
                    int zzB3 = zzerVar.zzB();
                    if (zzerVar.zzB() == 1684108385) {
                        zzerVar.zzk(8);
                        String zzL = zzerVar.zzL(zzB3 - 16);
                        zzaoVar = new zzaih("und", zzL, zzL);
                    } else {
                        zzee.zzc("MetadataUtil", "Failed to parse comment attribute: ".concat(zzfw.zze(zzB2)));
                    }
                } else {
                    if (i6 != 7233901 && i6 != 7631467) {
                        if (i6 != 6516589 && i6 != 7828084) {
                            if (i6 == 6578553) {
                                zzaoVar = zzd(zzB2, "TDRC", zzerVar);
                            } else if (i6 == 4280916) {
                                zzaoVar = zzd(zzB2, "TPE1", zzerVar);
                            } else if (i6 == 7630703) {
                                zzaoVar = zzd(zzB2, "TSSE", zzerVar);
                            } else if (i6 == 6384738) {
                                zzaoVar = zzd(zzB2, "TALB", zzerVar);
                            } else if (i6 == 7108978) {
                                zzaoVar = zzd(zzB2, "USLT", zzerVar);
                            } else if (i6 == 6776174) {
                                zzaoVar = zzd(zzB2, "TCON", zzerVar);
                            } else if (i6 == 6779504) {
                                zzaoVar = zzd(zzB2, "TIT1", zzerVar);
                            } else if (i6 == 7173742) {
                                zzaoVar = zzd(zzB2, "MVNM", zzerVar);
                            } else {
                                if (i6 == 7173737) {
                                    zzaoVar = zze(zzB2, "MVIN", zzerVar, true, false);
                                }
                                String zze = zzfw.zze(zzB2);
                                StringBuilder sb = new StringBuilder(zze.length() + 32);
                                sb.append("Skipped unknown metadata entry: ");
                                sb.append(zze);
                                zzee.zza("MetadataUtil", sb.toString());
                            }
                        }
                        zzaoVar = zzd(zzB2, "TCOM", zzerVar);
                    }
                    zzaoVar = zzd(zzB2, "TIT2", zzerVar);
                }
            } else if (zzB2 == 1735291493) {
                String zza = zzaio.zza(zzf(zzerVar) - 1);
                if (zza != null) {
                    zzaidVar = new zzais("TCON", null, zzguf.zzj(zza));
                    zzaoVar = zzaidVar;
                } else {
                    zzee.zzc("MetadataUtil", "Failed to parse standard genre code");
                }
            } else if (zzB2 == 1684632427) {
                zzaoVar = zzg(1684632427, "TPOS", zzerVar);
            } else if (zzB2 == 1953655662) {
                zzaoVar = zzg(1953655662, "TRCK", zzerVar);
            } else if (zzB2 == 1953329263) {
                zzaoVar = zze(1953329263, "TBPM", zzerVar, true, false);
            } else if (zzB2 == 1668311404) {
                zzaoVar = zze(1668311404, "TCMP", zzerVar, true, true);
            } else if (zzB2 == 1668249202) {
                int zzB4 = zzerVar.zzB();
                if (zzerVar.zzB() == 1684108385) {
                    int zzB5 = zzerVar.zzB();
                    int i7 = zzakh.zza;
                    int i8 = zzB5 & 16777215;
                    if (i8 == 13) {
                        str = "image/jpeg";
                    } else if (i8 == 14) {
                        str = "image/png";
                        i8 = 14;
                    } else {
                        str = null;
                    }
                    if (str == null) {
                        StringBuilder sb2 = new StringBuilder(String.valueOf(i8).length() + 30);
                        sb2.append("Unrecognized cover art flags: ");
                        sb2.append(i8);
                        zzee.zzc("MetadataUtil", sb2.toString());
                    } else {
                        zzerVar.zzk(4);
                        int i9 = zzB4 - 16;
                        byte[] bArr = new byte[i9];
                        zzerVar.zzm(bArr, 0, i9);
                        zzaidVar = new zzaid(str, null, 3, bArr);
                        zzaoVar = zzaidVar;
                    }
                } else {
                    zzee.zzc("MetadataUtil", "Failed to parse cover art attribute");
                }
            } else if (zzB2 == 1631670868) {
                zzaoVar = zzd(1631670868, "TPE2", zzerVar);
            } else if (zzB2 == 1936682605) {
                zzaoVar = zzd(1936682605, "TSOT", zzerVar);
            } else if (zzB2 == 1936679276) {
                zzaoVar = zzd(1936679276, "TSOA", zzerVar);
            } else if (zzB2 == 1936679282) {
                zzaoVar = zzd(1936679282, "TSOP", zzerVar);
            } else if (zzB2 == 1936679265) {
                zzaoVar = zzd(1936679265, "TSO2", zzerVar);
            } else if (zzB2 == 1936679791) {
                zzaoVar = zzd(1936679791, "TSOC", zzerVar);
            } else if (zzB2 == 1920233063) {
                zzaoVar = zze(1920233063, "ITUNESADVISORY", zzerVar, false, false);
            } else if (zzB2 == 1885823344) {
                zzaoVar = zze(1885823344, "ITUNESGAPLESS", zzerVar, false, true);
            } else if (zzB2 == 1936683886) {
                zzaoVar = zzd(1936683886, "TVSHOWSORT", zzerVar);
            } else if (zzB2 == 1953919848) {
                zzaoVar = zzd(1953919848, "TVSHOW", zzerVar);
            } else {
                if (zzB2 == 757935405) {
                    int i10 = -1;
                    int i11 = -1;
                    String str2 = null;
                    String str3 = null;
                    while (zzerVar.zzg() < zzB) {
                        int zzg = zzerVar.zzg();
                        int zzB6 = zzerVar.zzB();
                        int zzB7 = zzerVar.zzB();
                        zzerVar.zzk(4);
                        if (zzB7 == 1835360622) {
                            str2 = zzerVar.zzL(zzB6 - 12);
                        } else {
                            int i12 = zzB6 - 12;
                            if (zzB7 == 1851878757) {
                                str3 = zzerVar.zzL(i12);
                            } else {
                                if (zzB7 == 1684108385) {
                                    i11 = zzB6;
                                }
                                if (zzB7 == 1684108385) {
                                    i10 = zzg;
                                }
                                zzerVar.zzk(i12);
                            }
                        }
                    }
                    if (str2 != null && str3 != null && i10 != -1) {
                        zzerVar.zzh(i10);
                        zzerVar.zzk(16);
                        zzaoVar = new zzaip(str2, str3, zzerVar.zzL(i11 - 16));
                    }
                }
                String zze2 = zzfw.zze(zzB2);
                StringBuilder sb3 = new StringBuilder(zze2.length() + 32);
                sb3.append("Skipped unknown metadata entry: ");
                sb3.append(zze2);
                zzee.zza("MetadataUtil", sb3.toString());
            }
            return zzaoVar;
        } finally {
            zzerVar.zzh(zzB);
        }
    }

    private static zzais zzd(int i5, String str, zzer zzerVar) {
        int zzB = zzerVar.zzB();
        if (zzerVar.zzB() == 1684108385) {
            zzerVar.zzk(8);
            return new zzais(str, null, zzguf.zzj(zzerVar.zzL(zzB - 16)));
        }
        zzee.zzc("MetadataUtil", "Failed to parse text attribute: ".concat(zzfw.zze(i5)));
        return null;
    }

    private static zzain zze(int i5, String str, zzer zzerVar, boolean z4, boolean z5) {
        int zzf = zzf(zzerVar);
        if (z5) {
            zzf = Math.min(1, zzf);
        }
        if (zzf >= 0) {
            return z4 ? new zzais(str, null, zzguf.zzj(Integer.toString(zzf))) : new zzaih("und", str, Integer.toString(zzf));
        }
        zzee.zzc("MetadataUtil", "Failed to parse uint8 attribute: ".concat(zzfw.zze(i5)));
        return null;
    }

    private static int zzf(zzer zzerVar) {
        int zzB = zzerVar.zzB();
        if (zzerVar.zzB() == 1684108385) {
            zzerVar.zzk(8);
            int i5 = zzB - 16;
            if (i5 == 1) {
                return zzerVar.zzs();
            }
            if (i5 == 2) {
                return zzerVar.zzt();
            }
            if (i5 == 3) {
                return zzerVar.zzx();
            }
            if (i5 == 4 && (zzerVar.zzn() & 128) == 0) {
                return zzerVar.zzH();
            }
        }
        zzee.zzc("MetadataUtil", "Failed to parse data atom to int");
        return -1;
    }

    private static zzais zzg(int i5, String str, zzer zzerVar) {
        int zzB = zzerVar.zzB();
        if (zzerVar.zzB() == 1684108385 && zzB >= 22) {
            zzerVar.zzk(10);
            int zzt = zzerVar.zzt();
            if (zzt > 0) {
                StringBuilder sb = new StringBuilder(String.valueOf(zzt).length());
                sb.append(zzt);
                String sb2 = sb.toString();
                int zzt2 = zzerVar.zzt();
                if (zzt2 > 0) {
                    StringBuilder sb3 = new StringBuilder(sb2.length() + 1 + String.valueOf(zzt2).length());
                    sb3.append(sb2);
                    sb3.append("/");
                    sb3.append(zzt2);
                    sb2 = sb3.toString();
                }
                return new zzais(str, null, zzguf.zzj(sb2));
            }
        }
        zzee.zzc("MetadataUtil", "Failed to parse index/count attribute: ".concat(zzfw.zze(i5)));
        return null;
    }
}
