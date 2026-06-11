package com.google.android.gms.internal.ads;

import android.net.Uri;
import com.google.android.gms.internal.ads.zzbgj;
import java.io.InterruptedIOException;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes.dex */
final class zzxh implements zzabb, zzvz {
    final /* synthetic */ zzxq zza;
    private final long zzb;
    private final Uri zzc;
    private final zzhy zzd;
    private final zzxd zze;
    private final zzaex zzf;
    private final zzdq zzg;
    private final zzafv zzh;
    private volatile boolean zzi;
    private boolean zzj;
    private long zzk;
    private zzhf zzl;
    private zzagh zzm;
    private boolean zzn;

    public zzxh(zzxq zzxqVar, Uri uri, zzhb zzhbVar, zzxd zzxdVar, zzaex zzaexVar, zzdq zzdqVar) {
        Objects.requireNonNull(zzxqVar);
        this.zza = zzxqVar;
        this.zzc = uri;
        this.zzd = new zzhy(zzhbVar);
        this.zze = zzxdVar;
        this.zzf = zzaexVar;
        this.zzg = zzdqVar;
        this.zzh = new zzafv();
        this.zzj = true;
        this.zzb = zzwb.zza();
        this.zzl = zzi(0L, null);
    }

    private final zzhf zzi(long j2, String str) {
        Map map;
        map = zzxq.zzb;
        if (str != null && !str.startsWith("W/")) {
            zzguh zzguhVar = new zzguh();
            zzguhVar.zzb(map.entrySet());
            zzguhVar.zza("If-Range", str);
            map = zzguhVar.zzd();
        }
        zzhe zzheVar = new zzhe();
        zzheVar.zza(this.zzc);
        zzheVar.zzc(j2);
        zzheVar.zzd(6);
        zzheVar.zzb(map);
        return zzheVar.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzvz
    public final void zza(zzer zzerVar) {
        long max = !this.zzn ? this.zzk : Math.max(this.zza.zzI(true), this.zzk);
        int zzd = zzerVar.zzd();
        zzagh zzaghVar = this.zzm;
        zzaghVar.getClass();
        zzaghVar.zzc(zzerVar, zzd);
        zzaghVar.zze(max, 1, zzd, 0, null);
        this.zzn = true;
    }

    @Override // com.google.android.gms.internal.ads.zzabb
    public final void zzb() {
        this.zzi = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00cf A[Catch: all -> 0x00b2, TryCatch #3 {all -> 0x00b2, blocks: (B:116:0x0080, B:118:0x0086, B:21:0x00c5, B:23:0x00cf, B:24:0x00dc, B:26:0x00e6, B:27:0x00f3, B:29:0x00fd, B:30:0x010a, B:32:0x0114, B:33:0x0127, B:35:0x0131, B:37:0x0138, B:41:0x0171, B:42:0x017a, B:44:0x0187, B:46:0x0190, B:47:0x01ab, B:49:0x01c0, B:50:0x01c3, B:52:0x01c7, B:104:0x0142, B:107:0x0162, B:123:0x0092, B:126:0x00b7), top: B:115:0x0080 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00e6 A[Catch: all -> 0x00b2, TryCatch #3 {all -> 0x00b2, blocks: (B:116:0x0080, B:118:0x0086, B:21:0x00c5, B:23:0x00cf, B:24:0x00dc, B:26:0x00e6, B:27:0x00f3, B:29:0x00fd, B:30:0x010a, B:32:0x0114, B:33:0x0127, B:35:0x0131, B:37:0x0138, B:41:0x0171, B:42:0x017a, B:44:0x0187, B:46:0x0190, B:47:0x01ab, B:49:0x01c0, B:50:0x01c3, B:52:0x01c7, B:104:0x0142, B:107:0x0162, B:123:0x0092, B:126:0x00b7), top: B:115:0x0080 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00fd A[Catch: all -> 0x00b2, TryCatch #3 {all -> 0x00b2, blocks: (B:116:0x0080, B:118:0x0086, B:21:0x00c5, B:23:0x00cf, B:24:0x00dc, B:26:0x00e6, B:27:0x00f3, B:29:0x00fd, B:30:0x010a, B:32:0x0114, B:33:0x0127, B:35:0x0131, B:37:0x0138, B:41:0x0171, B:42:0x017a, B:44:0x0187, B:46:0x0190, B:47:0x01ab, B:49:0x01c0, B:50:0x01c3, B:52:0x01c7, B:104:0x0142, B:107:0x0162, B:123:0x0092, B:126:0x00b7), top: B:115:0x0080 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0114 A[Catch: all -> 0x00b2, TryCatch #3 {all -> 0x00b2, blocks: (B:116:0x0080, B:118:0x0086, B:21:0x00c5, B:23:0x00cf, B:24:0x00dc, B:26:0x00e6, B:27:0x00f3, B:29:0x00fd, B:30:0x010a, B:32:0x0114, B:33:0x0127, B:35:0x0131, B:37:0x0138, B:41:0x0171, B:42:0x017a, B:44:0x0187, B:46:0x0190, B:47:0x01ab, B:49:0x01c0, B:50:0x01c3, B:52:0x01c7, B:104:0x0142, B:107:0x0162, B:123:0x0092, B:126:0x00b7), top: B:115:0x0080 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0131 A[Catch: all -> 0x00b2, TRY_LEAVE, TryCatch #3 {all -> 0x00b2, blocks: (B:116:0x0080, B:118:0x0086, B:21:0x00c5, B:23:0x00cf, B:24:0x00dc, B:26:0x00e6, B:27:0x00f3, B:29:0x00fd, B:30:0x010a, B:32:0x0114, B:33:0x0127, B:35:0x0131, B:37:0x0138, B:41:0x0171, B:42:0x017a, B:44:0x0187, B:46:0x0190, B:47:0x01ab, B:49:0x01c0, B:50:0x01c3, B:52:0x01c7, B:104:0x0142, B:107:0x0162, B:123:0x0092, B:126:0x00b7), top: B:115:0x0080 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0171 A[Catch: all -> 0x00b2, TryCatch #3 {all -> 0x00b2, blocks: (B:116:0x0080, B:118:0x0086, B:21:0x00c5, B:23:0x00cf, B:24:0x00dc, B:26:0x00e6, B:27:0x00f3, B:29:0x00fd, B:30:0x010a, B:32:0x0114, B:33:0x0127, B:35:0x0131, B:37:0x0138, B:41:0x0171, B:42:0x017a, B:44:0x0187, B:46:0x0190, B:47:0x01ab, B:49:0x01c0, B:50:0x01c3, B:52:0x01c7, B:104:0x0142, B:107:0x0162, B:123:0x0092, B:126:0x00b7), top: B:115:0x0080 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0187 A[Catch: all -> 0x00b2, TryCatch #3 {all -> 0x00b2, blocks: (B:116:0x0080, B:118:0x0086, B:21:0x00c5, B:23:0x00cf, B:24:0x00dc, B:26:0x00e6, B:27:0x00f3, B:29:0x00fd, B:30:0x010a, B:32:0x0114, B:33:0x0127, B:35:0x0131, B:37:0x0138, B:41:0x0171, B:42:0x017a, B:44:0x0187, B:46:0x0190, B:47:0x01ab, B:49:0x01c0, B:50:0x01c3, B:52:0x01c7, B:104:0x0142, B:107:0x0162, B:123:0x0092, B:126:0x00b7), top: B:115:0x0080 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01c0 A[Catch: all -> 0x00b2, TryCatch #3 {all -> 0x00b2, blocks: (B:116:0x0080, B:118:0x0086, B:21:0x00c5, B:23:0x00cf, B:24:0x00dc, B:26:0x00e6, B:27:0x00f3, B:29:0x00fd, B:30:0x010a, B:32:0x0114, B:33:0x0127, B:35:0x0131, B:37:0x0138, B:41:0x0171, B:42:0x017a, B:44:0x0187, B:46:0x0190, B:47:0x01ab, B:49:0x01c0, B:50:0x01c3, B:52:0x01c7, B:104:0x0142, B:107:0x0162, B:123:0x0092, B:126:0x00b7), top: B:115:0x0080 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01c7 A[Catch: all -> 0x00b2, TRY_LEAVE, TryCatch #3 {all -> 0x00b2, blocks: (B:116:0x0080, B:118:0x0086, B:21:0x00c5, B:23:0x00cf, B:24:0x00dc, B:26:0x00e6, B:27:0x00f3, B:29:0x00fd, B:30:0x010a, B:32:0x0114, B:33:0x0127, B:35:0x0131, B:37:0x0138, B:41:0x0171, B:42:0x017a, B:44:0x0187, B:46:0x0190, B:47:0x01ab, B:49:0x01c0, B:50:0x01c3, B:52:0x01c7, B:104:0x0142, B:107:0x0162, B:123:0x0092, B:126:0x00b7), top: B:115:0x0080 }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01d7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x020e A[EDGE_INSN: B:96:0x020e->B:76:0x020e BREAK  A[LOOP:1: B:57:0x01d5->B:68:0x01d5], SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zzabb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzc() {
        int i5;
        long j2;
        int i6;
        int i7;
        int i8;
        boolean z4;
        List list;
        String str;
        List list2;
        String str2;
        List list3;
        String str3;
        List list4;
        boolean z5;
        List list5;
        int i9;
        zzhy zzhyVar;
        zzxq zzxqVar;
        zzhb zzhbVar;
        int i10;
        zzv zzvVar;
        int i11;
        int i12 = 0;
        String str4 = null;
        for (int i13 = 0; i13 == 0 && !this.zzi; i13 = i10) {
            try {
                long j5 = this.zzh.zza;
                zzhf zzi = zzi(j5, str4);
                this.zzl = zzi;
                zzhy zzhyVar2 = this.zzd;
                long zzb = zzhyVar2.zzb(zzi);
                if (this.zzi) {
                    zzxd zzxdVar = this.zze;
                    if (zzxdVar.zzd() != -1) {
                        this.zzh.zza = zzxdVar.zzd();
                    }
                    zzhd.zza(this.zzd);
                    return;
                }
                List list6 = (List) zzhyVar2.zzj().get("ETag");
                str4 = (list6 == null || list6.isEmpty()) ? null : (String) list6.get(i12);
                if (zzb != -1) {
                    zzb += j5;
                    this.zza.zzH();
                }
                long j6 = zzb;
                zzxq zzxqVar2 = this.zza;
                Map zzj = zzhyVar2.zzj();
                List list7 = (List) zzj.get("icy-br");
                j2 = -1;
                if (list7 != null) {
                    try {
                        String str5 = (String) list7.get(i12);
                        try {
                            i7 = Integer.parseInt(str5) * zzbgj.zzq.zzf;
                        } catch (NumberFormatException unused) {
                            i7 = -1;
                        }
                        if (i7 > 0) {
                            i8 = i7;
                            z4 = true;
                            list = (List) zzj.get("icy-genre");
                            if (list != null) {
                                str = (String) list.get(0);
                                z4 = true;
                            } else {
                                str = null;
                            }
                            list2 = (List) zzj.get("icy-name");
                            if (list2 != null) {
                                str2 = (String) list2.get(0);
                                z4 = true;
                            } else {
                                str2 = null;
                            }
                            list3 = (List) zzj.get("icy-url");
                            if (list3 != null) {
                                str3 = (String) list3.get(0);
                                z4 = true;
                            } else {
                                str3 = null;
                            }
                            list4 = (List) zzj.get("icy-pub");
                            if (list4 != null) {
                                z5 = ((String) list4.get(0)).equals("1");
                                z4 = true;
                            } else {
                                z5 = false;
                            }
                            list5 = (List) zzj.get("icy-metaint");
                            if (list5 != null) {
                                String str6 = (String) list5.get(0);
                                try {
                                    i11 = Integer.parseInt(str6);
                                } catch (NumberFormatException unused2) {
                                    i11 = -1;
                                }
                                if (i11 > 0) {
                                    i9 = i11;
                                    z4 = true;
                                    zzxqVar2.zzP(z4 ? new zzaic(i8, str, str2, str3, z5, i9) : null);
                                    zzhyVar = this.zzd;
                                    zzxqVar = this.zza;
                                    if (zzxqVar.zzO() != null || zzxqVar.zzO().zzf == -1) {
                                        zzhbVar = zzhyVar;
                                    } else {
                                        zzhb zzwaVar = new zzwa(zzhyVar, zzxqVar.zzO().zzf, this);
                                        zzagh zzx = zzxqVar.zzx();
                                        this.zzm = zzx;
                                        zzvVar = zzxq.zzc;
                                        zzx.zzz(zzvVar);
                                        zzhbVar = zzwaVar;
                                    }
                                    zzxd zzxdVar2 = this.zze;
                                    zzxdVar2.zza(zzhbVar, this.zzc, zzhyVar.zzj(), j5, j6, this.zzf);
                                    if (zzxqVar.zzO() != null) {
                                        zzxdVar2.zzc();
                                    }
                                    if (this.zzj) {
                                        zzxdVar2.zze(j5, this.zzk);
                                        i5 = 0;
                                        try {
                                            this.zzj = false;
                                        } catch (Throwable th) {
                                            th = th;
                                            i6 = i5;
                                            if (i6 != 1) {
                                                zzxd zzxdVar3 = this.zze;
                                                if (zzxdVar3.zzd() != j2) {
                                                    this.zzh.zza = zzxdVar3.zzd();
                                                }
                                            }
                                            zzhd.zza(this.zzd);
                                            throw th;
                                        }
                                    } else {
                                        i5 = 0;
                                    }
                                    i10 = i5;
                                    while (true) {
                                        if (i10 != 0) {
                                            break;
                                        }
                                        try {
                                            if (this.zzi) {
                                                i10 = i5;
                                                break;
                                            }
                                            try {
                                                zzdq zzdqVar = this.zzg;
                                                zzdqVar.zzc();
                                                i10 = zzxdVar2.zzf(this.zzh);
                                                long zzd = zzxdVar2.zzd();
                                                if (zzd > zzxqVar.zzL() + j5) {
                                                    zzdqVar.zzb();
                                                    zzxqVar.zzN().post(zzxqVar.zzM());
                                                    j5 = zzd;
                                                }
                                            } catch (InterruptedException unused3) {
                                                throw new InterruptedIOException();
                                            }
                                        } catch (Throwable th2) {
                                            th = th2;
                                            i6 = i10;
                                            if (i6 != 1) {
                                            }
                                            zzhd.zza(this.zzd);
                                            throw th;
                                        }
                                    }
                                    if (i10 == 1) {
                                        i10 = i5;
                                    } else if (zzxdVar2.zzd() != -1) {
                                        this.zzh.zza = zzxdVar2.zzd();
                                    }
                                    zzhd.zza(zzhyVar);
                                    i12 = i5;
                                } else {
                                    try {
                                        StringBuilder sb = new StringBuilder(String.valueOf(str6).length() + 27);
                                        sb.append("Invalid metadata interval: ");
                                        sb.append(str6);
                                        zzee.zzc("IcyHeaders", sb.toString());
                                    } catch (NumberFormatException unused4) {
                                        zzee.zzc("IcyHeaders", "Invalid metadata interval: ".concat(String.valueOf(str6)));
                                        i9 = i11;
                                        zzxqVar2.zzP(z4 ? new zzaic(i8, str, str2, str3, z5, i9) : null);
                                        zzhyVar = this.zzd;
                                        zzxqVar = this.zza;
                                        if (zzxqVar.zzO() != null) {
                                        }
                                        zzhbVar = zzhyVar;
                                        zzxd zzxdVar22 = this.zze;
                                        zzxdVar22.zza(zzhbVar, this.zzc, zzhyVar.zzj(), j5, j6, this.zzf);
                                        if (zzxqVar.zzO() != null) {
                                        }
                                        if (this.zzj) {
                                        }
                                        i10 = i5;
                                        while (true) {
                                            if (i10 != 0) {
                                            }
                                        }
                                        if (i10 == 1) {
                                        }
                                        zzhd.zza(zzhyVar);
                                        i12 = i5;
                                    }
                                }
                            }
                            i9 = -1;
                            zzxqVar2.zzP(z4 ? new zzaic(i8, str, str2, str3, z5, i9) : null);
                            zzhyVar = this.zzd;
                            zzxqVar = this.zza;
                            if (zzxqVar.zzO() != null) {
                            }
                            zzhbVar = zzhyVar;
                            zzxd zzxdVar222 = this.zze;
                            zzxdVar222.zza(zzhbVar, this.zzc, zzhyVar.zzj(), j5, j6, this.zzf);
                            if (zzxqVar.zzO() != null) {
                            }
                            if (this.zzj) {
                            }
                            i10 = i5;
                            while (true) {
                                if (i10 != 0) {
                                }
                            }
                            if (i10 == 1) {
                            }
                            zzhd.zza(zzhyVar);
                            i12 = i5;
                        } else {
                            try {
                                StringBuilder sb2 = new StringBuilder(String.valueOf(str5).length() + 17);
                                sb2.append("Invalid bitrate: ");
                                sb2.append(str5);
                                zzee.zzc("IcyHeaders", sb2.toString());
                            } catch (NumberFormatException unused5) {
                                zzee.zzc("IcyHeaders", "Invalid bitrate header: ".concat(String.valueOf(str5)));
                                i8 = i7;
                                z4 = false;
                                list = (List) zzj.get("icy-genre");
                                if (list != null) {
                                }
                                list2 = (List) zzj.get("icy-name");
                                if (list2 != null) {
                                }
                                list3 = (List) zzj.get("icy-url");
                                if (list3 != null) {
                                }
                                list4 = (List) zzj.get("icy-pub");
                                if (list4 != null) {
                                }
                                list5 = (List) zzj.get("icy-metaint");
                                if (list5 != null) {
                                }
                                i9 = -1;
                                zzxqVar2.zzP(z4 ? new zzaic(i8, str, str2, str3, z5, i9) : null);
                                zzhyVar = this.zzd;
                                zzxqVar = this.zza;
                                if (zzxqVar.zzO() != null) {
                                }
                                zzhbVar = zzhyVar;
                                zzxd zzxdVar2222 = this.zze;
                                zzxdVar2222.zza(zzhbVar, this.zzc, zzhyVar.zzj(), j5, j6, this.zzf);
                                if (zzxqVar.zzO() != null) {
                                }
                                if (this.zzj) {
                                }
                                i10 = i5;
                                while (true) {
                                    if (i10 != 0) {
                                    }
                                }
                                if (i10 == 1) {
                                }
                                zzhd.zza(zzhyVar);
                                i12 = i5;
                            }
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        i5 = 0;
                        i6 = i5;
                        if (i6 != 1) {
                        }
                        zzhd.zza(this.zzd);
                        throw th;
                    }
                }
                z4 = false;
                i8 = -1;
                list = (List) zzj.get("icy-genre");
                if (list != null) {
                }
                list2 = (List) zzj.get("icy-name");
                if (list2 != null) {
                }
                list3 = (List) zzj.get("icy-url");
                if (list3 != null) {
                }
                list4 = (List) zzj.get("icy-pub");
                if (list4 != null) {
                }
                list5 = (List) zzj.get("icy-metaint");
                if (list5 != null) {
                }
                i9 = -1;
                zzxqVar2.zzP(z4 ? new zzaic(i8, str, str2, str3, z5, i9) : null);
                zzhyVar = this.zzd;
                zzxqVar = this.zza;
                if (zzxqVar.zzO() != null) {
                }
                zzhbVar = zzhyVar;
                zzxd zzxdVar22222 = this.zze;
                zzxdVar22222.zza(zzhbVar, this.zzc, zzhyVar.zzj(), j5, j6, this.zzf);
                if (zzxqVar.zzO() != null) {
                }
                if (this.zzj) {
                }
                i10 = i5;
                while (true) {
                    if (i10 != 0) {
                    }
                }
                if (i10 == 1) {
                }
                zzhd.zza(zzhyVar);
                i12 = i5;
            } catch (Throwable th4) {
                th = th4;
                i5 = i12;
                j2 = -1;
            }
        }
    }

    public final /* synthetic */ void zzd(long j2, long j5) {
        this.zzh.zza = j2;
        this.zzk = j5;
        this.zzj = true;
        this.zzn = false;
    }

    public final /* synthetic */ long zze() {
        return this.zzb;
    }

    public final /* synthetic */ zzhy zzf() {
        return this.zzd;
    }

    public final /* synthetic */ long zzg() {
        return this.zzk;
    }

    public final /* synthetic */ zzhf zzh() {
        return this.zzl;
    }
}
