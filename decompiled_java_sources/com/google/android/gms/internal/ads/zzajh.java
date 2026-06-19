package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import com.google.android.gms.internal.ads.zzbgj;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;

/* loaded from: classes.dex */
public final class zzajh implements zzaeu {
    public static final /* synthetic */ int zza = 0;
    private static final byte[] zzb = {49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};
    private static final byte[] zzc;
    private static final byte[] zzd;
    private static final byte[] zze;
    private static final UUID zzf;
    private static final Map zzg;
    private long zzA;
    private long zzB;
    private boolean zzC;
    private boolean zzD;
    private zzajg zzE;
    private boolean zzF;
    private int zzG;
    private long zzH;
    private final SparseArray zzI;
    private boolean zzJ;
    private long zzK;
    private int zzL;
    private long zzM;
    private long zzN;
    private int zzO;
    private boolean zzP;
    private long zzQ;
    private long zzR;
    private long zzS;
    private boolean zzT;
    private int zzU;
    private long zzV;
    private long zzW;
    private int zzX;
    private int zzY;
    private int[] zzZ;
    private int zzaa;
    private int zzab;
    private int zzac;
    private int zzad;
    private boolean zzae;
    private long zzaf;
    private int zzag;
    private int zzah;
    private int zzai;
    private boolean zzaj;
    private boolean zzak;
    private boolean zzal;
    private int zzam;
    private byte zzan;
    private boolean zzao;
    private zzaex zzap;
    private final zzaja zzaq;
    private final zzajj zzh;
    private final SparseArray zzi;
    private final boolean zzj;
    private final boolean zzk;
    private final zzamd zzl;
    private final zzer zzm;
    private final zzer zzn;
    private final zzer zzo;
    private final zzer zzp;
    private final zzer zzq;
    private final zzer zzr;
    private final zzer zzs;
    private final zzer zzt;
    private final zzer zzu;
    private final zzer zzv;
    private ByteBuffer zzw;
    private long zzx;
    private long zzy;
    private long zzz;

    static {
        String str = zzfj.zza;
        zzc = "Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text".getBytes(StandardCharsets.UTF_8);
        zzd = new byte[]{68, 105, 97, 108, 111, 103, 117, 101, 58, 32, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44};
        zze = new byte[]{87, 69, 66, 86, 84, 84, 10, 10, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 10};
        zzf = new UUID(72057594037932032L, -9223371306706625679L);
        HashMap hashMap = new HashMap();
        hashMap.put("htc_video_rotA-000", 0);
        hashMap.put("htc_video_rotA-090", 90);
        hashMap.put("htc_video_rotA-180", 180);
        hashMap.put("htc_video_rotA-270", 270);
        zzg = Collections.unmodifiableMap(hashMap);
    }

    @Deprecated
    public zzajh() {
        this(new zzaja(), 2, zzamd.zza);
    }

    private static int[] zzA(int[] iArr, int i5) {
        if (iArr == null) {
            return new int[i5];
        }
        int length = iArr.length;
        return length >= i5 ? iArr : new int[Math.max(length + length, i5)];
    }

    private final void zzB() {
        if (!this.zzD) {
            return;
        }
        int i5 = 0;
        while (true) {
            SparseArray sparseArray = this.zzi;
            if (i5 >= sparseArray.size()) {
                zzaex zzaexVar = this.zzap;
                zzaexVar.getClass();
                zzaexVar.zzv();
                this.zzD = false;
                return;
            }
            if (((zzajg) sparseArray.valueAt(i5)).zzV) {
                return;
            } else {
                i5++;
            }
        }
    }

    private final void zzq(int i5) {
        if (this.zzE != null) {
            return;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(i5).length() + 32);
        sb.append("Element ");
        sb.append(i5);
        sb.append(" must be in a TrackEntry");
        throw zzat.zzb(sb.toString(), null);
    }

    private final void zzr(int i5) {
        if (this.zzJ) {
            return;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(i5).length() + 26);
        sb.append("Element ");
        sb.append(i5);
        sb.append(" must be in a Cues");
        throw zzat.zzb(sb.toString(), null);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0092, code lost:
    
        if (r2.equals("S_TEXT/SSA") != false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x009b, code lost:
    
        r2 = zzx(r11, "%01d:%02d:%02d:%02d", 10000);
        r3 = 21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0099, code lost:
    
        if (r2.equals("S_TEXT/ASS") != false) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00c2 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void zzs(zzajg zzajgVar, long j2, int i5, int i6, int i7) {
        byte[] zzx;
        int i8;
        int zzg2;
        int zze2;
        zzagi zzagiVar = zzajgVar.zzU;
        if (zzagiVar != null) {
            zzagiVar.zzc(zzajgVar.zzY, j2, i5, i6, i7, zzajgVar.zzj);
        } else {
            String str = zzajgVar.zzc;
            if ("S_TEXT/UTF8".equals(str) || "S_TEXT/ASS".equals(str) || "S_TEXT/SSA".equals(str) || "S_TEXT/WEBVTT".equals(str)) {
                if (this.zzY > 1) {
                    zzee.zzc("MatroskaExtractor", "Skipping subtitle sample in laced block.");
                } else {
                    long j5 = this.zzW;
                    if (j5 == -9223372036854775807L) {
                        zzee.zzc("MatroskaExtractor", "Skipping subtitle sample with no duration.");
                    } else {
                        zzer zzerVar = this.zzs;
                        byte[] zzi = zzerVar.zzi();
                        switch (str.hashCode()) {
                            case 738597099:
                                break;
                            case 738614379:
                                break;
                            case 1045209816:
                                if (str.equals("S_TEXT/WEBVTT")) {
                                    zzx = zzx(j5, "%02d:%02d:%02d.%03d", 1000L);
                                    i8 = 25;
                                    System.arraycopy(zzx, 0, zzi, i8, zzx.length);
                                    zzg2 = zzerVar.zzg();
                                    while (true) {
                                        if (zzg2 < zzerVar.zze()) {
                                            if (zzerVar.zzi()[zzg2] == 0) {
                                                zzerVar.zzf(zzg2);
                                            } else {
                                                zzg2++;
                                            }
                                        }
                                    }
                                    zzajgVar.zzY.zzc(zzerVar, zzerVar.zze());
                                    zze2 = zzerVar.zze() + i6;
                                    if ((i5 & 268435456) != 0) {
                                        if (this.zzY > 1) {
                                            this.zzv.zza(0);
                                        } else {
                                            zzer zzerVar2 = this.zzv;
                                            int zze3 = zzerVar2.zze();
                                            zzajgVar.zzY.zzd(zzerVar2, zze3, 2);
                                            zze2 += zze3;
                                        }
                                    }
                                    zzajgVar.zzY.zze(j2, i5, zze2, i7, zzajgVar.zzj);
                                    break;
                                }
                                throw new IllegalArgumentException();
                            case 1422270023:
                                if (str.equals("S_TEXT/UTF8")) {
                                    zzx = zzx(j5, "%02d:%02d:%02d,%03d", 1000L);
                                    i8 = 19;
                                    System.arraycopy(zzx, 0, zzi, i8, zzx.length);
                                    zzg2 = zzerVar.zzg();
                                    while (true) {
                                        if (zzg2 < zzerVar.zze()) {
                                        }
                                        zzg2++;
                                    }
                                    zzajgVar.zzY.zzc(zzerVar, zzerVar.zze());
                                    zze2 = zzerVar.zze() + i6;
                                    if ((i5 & 268435456) != 0) {
                                    }
                                    zzajgVar.zzY.zze(j2, i5, zze2, i7, zzajgVar.zzj);
                                    break;
                                }
                                throw new IllegalArgumentException();
                            default:
                                throw new IllegalArgumentException();
                        }
                    }
                }
            }
            zze2 = i6;
            if ((i5 & 268435456) != 0) {
            }
            zzajgVar.zzY.zze(j2, i5, zze2, i7, zzajgVar.zzj);
        }
        this.zzT = true;
    }

    private final void zzt(zzaev zzaevVar, int i5) {
        zzer zzerVar = this.zzo;
        if (zzerVar.zze() >= i5) {
            return;
        }
        if (zzerVar.zzj() < i5) {
            int zzj = zzerVar.zzj();
            zzerVar.zzc(Math.max(zzj + zzj, i5));
        }
        zzaevVar.zzc(zzerVar.zzi(), zzerVar.zze(), i5 - zzerVar.zze());
        zzerVar.zzf(i5);
    }

    private final int zzu(zzaev zzaevVar, zzajg zzajgVar, int i5, boolean z4) {
        int i6;
        String str = zzajgVar.zzc;
        if ("S_TEXT/UTF8".equals(str)) {
            zzw(zzaevVar, zzb, i5);
            int i7 = this.zzah;
            zzv();
            return i7;
        }
        if ("S_TEXT/ASS".equals(str) || "S_TEXT/SSA".equals(str)) {
            zzw(zzaevVar, zzd, i5);
            int i8 = this.zzah;
            zzv();
            return i8;
        }
        if ("S_TEXT/WEBVTT".equals(str)) {
            zzw(zzaevVar, zze, i5);
            int i9 = this.zzah;
            zzv();
            return i9;
        }
        if (zzajgVar.zzV) {
            zzajgVar.zzZ.getClass();
            zzer zzerVar = new zzer(i5);
            if (zzaevVar.zzh(zzerVar.zzi(), 0, i5, true)) {
                zzaevVar.zzl();
                if (zzaet.zza(zzerVar.zzr()) == 1 && zzerVar.zzd() >= 10) {
                    byte[] bArr = new byte[10];
                    zzerVar.zzm(bArr, 0, 10);
                    zzerVar.zzh(0);
                    int zzc2 = zzaet.zzc(bArr);
                    if (zzerVar.zzd() >= zzc2 + 4) {
                        zzerVar.zzk(zzc2);
                        if (zzaet.zza(zzerVar.zzB()) == 2) {
                            zzt zza2 = zzajgVar.zzZ.zza();
                            zza2.zzm("audio/vnd.dts.hd");
                            zzajgVar.zzZ = zza2.zzM();
                        }
                    }
                }
            }
            zzajgVar.zzY.zzz(zzajgVar.zzZ);
            zzajgVar.zzV = false;
            zzB();
        }
        zzagh zzaghVar = zzajgVar.zzY;
        if (!this.zzaj) {
            if (zzajgVar.zzh) {
                this.zzac &= -1073741825;
                if (!this.zzak) {
                    zzer zzerVar2 = this.zzo;
                    zzaevVar.zzc(zzerVar2.zzi(), 0, 1);
                    this.zzag++;
                    if ((zzerVar2.zzi()[0] & 128) == 128) {
                        throw zzat.zzb("Extension bit is set in signal byte", null);
                    }
                    this.zzan = zzerVar2.zzi()[0];
                    this.zzak = true;
                }
                byte b2 = this.zzan;
                if ((b2 & 1) == 1) {
                    int i10 = b2 & 2;
                    this.zzac |= 1073741824;
                    if (!this.zzao) {
                        zzer zzerVar3 = this.zzt;
                        zzaevVar.zzc(zzerVar3.zzi(), 0, 8);
                        this.zzag += 8;
                        this.zzao = true;
                        zzer zzerVar4 = this.zzo;
                        zzerVar4.zzi()[0] = (byte) ((i10 != 2 ? 0 : 128) | 8);
                        zzerVar4.zzh(0);
                        zzaghVar.zzd(zzerVar4, 1, 1);
                        this.zzah++;
                        zzerVar3.zzh(0);
                        zzaghVar.zzd(zzerVar3, 8, 1);
                        this.zzah += 8;
                    }
                    if (i10 == 2) {
                        if (!this.zzal) {
                            zzer zzerVar5 = this.zzo;
                            zzaevVar.zzc(zzerVar5.zzi(), 0, 1);
                            this.zzag++;
                            zzerVar5.zzh(0);
                            this.zzam = zzerVar5.zzs();
                            this.zzal = true;
                        }
                        int i11 = this.zzam * 4;
                        zzer zzerVar6 = this.zzo;
                        zzerVar6.zza(i11);
                        zzaevVar.zzc(zzerVar6.zzi(), 0, i11);
                        this.zzag += i11;
                        int i12 = (this.zzam >> 1) + 1;
                        int i13 = (i12 * 6) + 2;
                        ByteBuffer byteBuffer = this.zzw;
                        if (byteBuffer == null || byteBuffer.capacity() < i13) {
                            this.zzw = ByteBuffer.allocate(i13);
                        }
                        this.zzw.position(0);
                        this.zzw.putShort((short) i12);
                        int i14 = 0;
                        int i15 = 0;
                        while (true) {
                            i6 = this.zzam;
                            if (i14 >= i6) {
                                break;
                            }
                            int zzH = zzerVar6.zzH();
                            int i16 = zzH - i15;
                            if (i14 % 2 == 0) {
                                this.zzw.putShort((short) i16);
                            } else {
                                this.zzw.putInt(i16);
                            }
                            i14++;
                            i15 = zzH;
                        }
                        int i17 = (i5 - this.zzag) - i15;
                        if ((i6 & 1) == 1) {
                            this.zzw.putInt(i17);
                        } else {
                            this.zzw.putShort((short) i17);
                            this.zzw.putInt(0);
                        }
                        zzer zzerVar7 = this.zzu;
                        zzerVar7.zzb(this.zzw.array(), i13);
                        zzaghVar.zzd(zzerVar7, i13, 1);
                        this.zzah += i13;
                    }
                }
            } else {
                byte[] bArr2 = zzajgVar.zzi;
                if (bArr2 != null) {
                    this.zzr.zzb(bArr2, bArr2.length);
                }
            }
            if (!"A_OPUS".equals(zzajgVar.zzc) ? zzajgVar.zzg > 0 : z4) {
                this.zzac |= 268435456;
                this.zzv.zza(0);
                int zze2 = (this.zzr.zze() + i5) - this.zzag;
                zzer zzerVar8 = this.zzo;
                zzerVar8.zza(4);
                zzerVar8.zzi()[0] = (byte) ((zze2 >> 24) & 255);
                zzerVar8.zzi()[1] = (byte) ((zze2 >> 16) & 255);
                zzerVar8.zzi()[2] = (byte) ((zze2 >> 8) & 255);
                zzerVar8.zzi()[3] = (byte) (zze2 & 255);
                zzaghVar.zzd(zzerVar8, 4, 2);
                this.zzah += 4;
            }
            this.zzaj = true;
        }
        zzer zzerVar9 = this.zzr;
        int zze3 = zzerVar9.zze() + i5;
        String str2 = zzajgVar.zzc;
        if (!"V_MPEG4/ISO/AVC".equals(str2) && !"V_MPEGH/ISO/HEVC".equals(str2)) {
            if (zzajgVar.zzU != null) {
                zzgrc.zzi(zzerVar9.zze() == 0);
                zzajgVar.zzU.zzb(zzaevVar);
            }
            while (true) {
                int i18 = this.zzag;
                if (i18 >= zze3) {
                    break;
                }
                int zzy = zzy(zzaevVar, zzaghVar, zze3 - i18);
                this.zzag += zzy;
                this.zzah += zzy;
            }
        } else {
            zzer zzerVar10 = this.zzn;
            byte[] zzi = zzerVar10.zzi();
            zzi[0] = 0;
            zzi[1] = 0;
            zzi[2] = 0;
            int i19 = zzajgVar.zzaa;
            int i20 = 4 - i19;
            while (this.zzag < zze3) {
                int i21 = this.zzai;
                if (i21 == 0) {
                    int min = Math.min(i19, zzerVar9.zzd());
                    zzaevVar.zzc(zzi, i20 + min, i19 - min);
                    if (min > 0) {
                        zzerVar9.zzm(zzi, i20, min);
                    }
                    this.zzag += i19;
                    zzerVar10.zzh(0);
                    this.zzai = zzerVar10.zzH();
                    zzer zzerVar11 = this.zzm;
                    zzerVar11.zzh(0);
                    zzaghVar.zzc(zzerVar11, 4);
                    this.zzah += 4;
                } else {
                    int zzy2 = zzy(zzaevVar, zzaghVar, i21);
                    this.zzag += zzy2;
                    this.zzah += zzy2;
                    this.zzai -= zzy2;
                }
            }
        }
        if ("A_VORBIS".equals(zzajgVar.zzc)) {
            zzer zzerVar12 = this.zzp;
            zzerVar12.zzh(0);
            zzaghVar.zzc(zzerVar12, 4);
            this.zzah += 4;
        }
        int i22 = this.zzah;
        zzv();
        return i22;
    }

    private final void zzv() {
        this.zzag = 0;
        this.zzah = 0;
        this.zzai = 0;
        this.zzaj = false;
        this.zzak = false;
        this.zzal = false;
        this.zzam = 0;
        this.zzan = (byte) 0;
        this.zzao = false;
        this.zzr.zza(0);
    }

    private final void zzw(zzaev zzaevVar, byte[] bArr, int i5) {
        int length = bArr.length;
        int i6 = length + i5;
        zzer zzerVar = this.zzs;
        if (zzerVar.zzj() < i6) {
            byte[] copyOf = Arrays.copyOf(bArr, i6 + i5);
            zzerVar.zzb(copyOf, copyOf.length);
        } else {
            System.arraycopy(bArr, 0, zzerVar.zzi(), 0, length);
        }
        zzaevVar.zzc(zzerVar.zzi(), length, i5);
        zzerVar.zzh(0);
        zzerVar.zzf(i6);
    }

    private static byte[] zzx(long j2, String str, long j5) {
        zzgrc.zza(j2 != -9223372036854775807L);
        Locale locale = Locale.US;
        int i5 = (int) (j2 / 3600000000L);
        Integer valueOf = Integer.valueOf(i5);
        long j6 = j2 - (i5 * 3600000000L);
        int i6 = (int) (j6 / 60000000);
        Integer valueOf2 = Integer.valueOf(i6);
        long j7 = j6 - (i6 * 60000000);
        int i7 = (int) (j7 / 1000000);
        String format = String.format(locale, str, valueOf, valueOf2, Integer.valueOf(i7), Integer.valueOf((int) ((j7 - (i7 * 1000000)) / j5)));
        String str2 = zzfj.zza;
        return format.getBytes(StandardCharsets.UTF_8);
    }

    private final int zzy(zzaev zzaevVar, zzagh zzaghVar, int i5) {
        zzer zzerVar = this.zzr;
        int zzd2 = zzerVar.zzd();
        if (zzd2 <= 0) {
            return zzaghVar.zza(zzaevVar, i5, false);
        }
        int min = Math.min(i5, zzd2);
        zzaghVar.zzc(zzerVar, min);
        return min;
    }

    private final long zzz(long j2) {
        long j5 = this.zzz;
        if (j5 != -9223372036854775807L) {
            return zzfj.zzt(j2, j5, 1000L, RoundingMode.DOWN);
        }
        throw zzat.zzb("Can't scale timecode prior to timecodeScale being set.", null);
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final boolean zza(zzaev zzaevVar) {
        return new zzaji().zza(zzaevVar);
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final void zzc(zzaex zzaexVar) {
        if (this.zzk) {
            zzaexVar = new zzamg(zzaexVar, this.zzl);
        }
        this.zzap = zzaexVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final int zzd(zzaev zzaevVar, zzafv zzafvVar) {
        int i5 = 0;
        this.zzT = false;
        while (!this.zzT) {
            if (this.zzaq.zzc(zzaevVar)) {
                long zzn = zzaevVar.zzn();
                if (this.zzP) {
                    this.zzR = zzn;
                    zzafvVar.zza = this.zzQ;
                    this.zzP = false;
                    return 1;
                }
                if (this.zzF) {
                    long j2 = this.zzR;
                    if (j2 != -1) {
                        zzafvVar.zza = j2;
                        this.zzR = -1L;
                        return 1;
                    }
                }
            } else {
                while (true) {
                    SparseArray sparseArray = this.zzi;
                    if (i5 >= sparseArray.size()) {
                        return -1;
                    }
                    zzajg zzajgVar = (zzajg) sparseArray.valueAt(i5);
                    zzajgVar.zzb();
                    zzagi zzagiVar = zzajgVar.zzU;
                    if (zzagiVar != null) {
                        zzagiVar.zzd(zzajgVar.zzY, zzajgVar.zzj);
                    }
                    i5++;
                }
            }
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final void zze(long j2, long j5) {
        this.zzS = -9223372036854775807L;
        int i5 = 0;
        this.zzU = 0;
        this.zzaq.zzb();
        this.zzh.zza();
        zzv();
        this.zzJ = false;
        this.zzK = -9223372036854775807L;
        this.zzL = -1;
        this.zzM = -1L;
        this.zzN = -1L;
        if (!this.zzF) {
            this.zzI.clear();
        }
        while (true) {
            SparseArray sparseArray = this.zzi;
            if (i5 >= sparseArray.size()) {
                return;
            }
            zzagi zzagiVar = ((zzajg) sparseArray.valueAt(i5)).zzU;
            if (zzagiVar != null) {
                zzagiVar.zza();
            }
            i5++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final void zzf() {
    }

    public final void zzh(int i5, long j2, long j5) {
        zzaex zzaexVar = this.zzap;
        zzaexVar.getClass();
        if (i5 == 160) {
            this.zzae = false;
            this.zzaf = 0L;
            return;
        }
        if (i5 == 174) {
            zzajg zzajgVar = new zzajg();
            this.zzE = zzajgVar;
            zzajgVar.zza = this.zzC;
            return;
        }
        if (i5 == 183) {
            if (this.zzF) {
                return;
            }
            zzr(i5);
            this.zzL = -1;
            this.zzM = -1L;
            this.zzN = -1L;
            return;
        }
        if (i5 == 187) {
            if (this.zzF) {
                return;
            }
            zzr(i5);
            this.zzK = -9223372036854775807L;
            return;
        }
        if (i5 == 19899) {
            this.zzG = -1;
            this.zzH = -1L;
            return;
        }
        if (i5 == 20533) {
            zzq(i5);
            this.zzE.zzh = true;
            return;
        }
        if (i5 == 21968) {
            zzq(i5);
            this.zzE.zzy = true;
            return;
        }
        if (i5 == 408125543) {
            long j6 = this.zzy;
            if (j6 != -1 && j6 != j2) {
                throw zzat.zzb("Multiple Segment elements not supported", null);
            }
            this.zzy = j2;
            this.zzx = j5;
            return;
        }
        if (i5 == 475249515) {
            if (this.zzF) {
                return;
            }
            this.zzJ = true;
        } else if (i5 == 524531317 && !this.zzF) {
            if (this.zzj && this.zzQ != -1) {
                this.zzP = true;
            } else {
                zzaexVar.zzw(new zzafx(this.zzB, 0L));
                this.zzF = true;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:206:0x0340, code lost:
    
        if (r2.equals("A_OPUS") != false) goto L283;
     */
    /* JADX WARN: Code restructure failed: missing block: B:207:0x0482, code lost:
    
        r1.zza(r1.zzd);
        r1.zzY = r39.zzap.zzu(r1.zzd, r1.zze);
        r39.zzi.put(r1.zzd, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:209:0x034a, code lost:
    
        if (r2.equals("A_FLAC") != false) goto L283;
     */
    /* JADX WARN: Code restructure failed: missing block: B:211:0x0354, code lost:
    
        if (r2.equals("A_EAC3") != false) goto L283;
     */
    /* JADX WARN: Code restructure failed: missing block: B:213:0x035e, code lost:
    
        if (r2.equals("V_MPEG2") != false) goto L283;
     */
    /* JADX WARN: Code restructure failed: missing block: B:215:0x0368, code lost:
    
        if (r2.equals("S_TEXT/UTF8") != false) goto L283;
     */
    /* JADX WARN: Code restructure failed: missing block: B:217:0x0372, code lost:
    
        if (r2.equals("S_TEXT/WEBVTT") != false) goto L283;
     */
    /* JADX WARN: Code restructure failed: missing block: B:219:0x037c, code lost:
    
        if (r2.equals("V_MPEGH/ISO/HEVC") != false) goto L283;
     */
    /* JADX WARN: Code restructure failed: missing block: B:221:0x0386, code lost:
    
        if (r2.equals("S_TEXT/SSA") != false) goto L283;
     */
    /* JADX WARN: Code restructure failed: missing block: B:223:0x0390, code lost:
    
        if (r2.equals("S_TEXT/ASS") != false) goto L283;
     */
    /* JADX WARN: Code restructure failed: missing block: B:225:0x039a, code lost:
    
        if (r2.equals("A_PCM/INT/LIT") != false) goto L283;
     */
    /* JADX WARN: Code restructure failed: missing block: B:227:0x03a4, code lost:
    
        if (r2.equals("A_PCM/INT/BIG") != false) goto L283;
     */
    /* JADX WARN: Code restructure failed: missing block: B:229:0x03ae, code lost:
    
        if (r2.equals("A_PCM/FLOAT/IEEE") != false) goto L283;
     */
    /* JADX WARN: Code restructure failed: missing block: B:231:0x03b8, code lost:
    
        if (r2.equals("A_DTS/EXPRESS") != false) goto L283;
     */
    /* JADX WARN: Code restructure failed: missing block: B:233:0x03c2, code lost:
    
        if (r2.equals("V_THEORA") != false) goto L283;
     */
    /* JADX WARN: Code restructure failed: missing block: B:235:0x03cc, code lost:
    
        if (r2.equals("S_HDMV/PGS") != false) goto L283;
     */
    /* JADX WARN: Code restructure failed: missing block: B:237:0x03d6, code lost:
    
        if (r2.equals("V_VP9") != false) goto L283;
     */
    /* JADX WARN: Code restructure failed: missing block: B:239:0x03e0, code lost:
    
        if (r2.equals("V_VP8") != false) goto L283;
     */
    /* JADX WARN: Code restructure failed: missing block: B:241:0x03ea, code lost:
    
        if (r2.equals("V_AV1") != false) goto L283;
     */
    /* JADX WARN: Code restructure failed: missing block: B:243:0x03f4, code lost:
    
        if (r2.equals("A_DTS") != false) goto L283;
     */
    /* JADX WARN: Code restructure failed: missing block: B:245:0x03fe, code lost:
    
        if (r2.equals("A_AC3") != false) goto L283;
     */
    /* JADX WARN: Code restructure failed: missing block: B:247:0x0408, code lost:
    
        if (r2.equals("A_AAC") != false) goto L283;
     */
    /* JADX WARN: Code restructure failed: missing block: B:249:0x0412, code lost:
    
        if (r2.equals("A_DTS/LOSSLESS") != false) goto L283;
     */
    /* JADX WARN: Code restructure failed: missing block: B:251:0x041c, code lost:
    
        if (r2.equals("S_VOBSUB") != false) goto L283;
     */
    /* JADX WARN: Code restructure failed: missing block: B:253:0x0426, code lost:
    
        if (r2.equals("V_MPEG4/ISO/AVC") != false) goto L283;
     */
    /* JADX WARN: Code restructure failed: missing block: B:255:0x042f, code lost:
    
        if (r2.equals("V_MPEG4/ISO/ASP") != false) goto L283;
     */
    /* JADX WARN: Code restructure failed: missing block: B:257:0x0438, code lost:
    
        if (r2.equals("S_DVBSUB") != false) goto L283;
     */
    /* JADX WARN: Code restructure failed: missing block: B:259:0x0441, code lost:
    
        if (r2.equals("V_MS/VFW/FOURCC") != false) goto L283;
     */
    /* JADX WARN: Code restructure failed: missing block: B:261:0x044a, code lost:
    
        if (r2.equals("A_MPEG/L3") != false) goto L283;
     */
    /* JADX WARN: Code restructure failed: missing block: B:263:0x0453, code lost:
    
        if (r2.equals("A_MPEG/L2") != false) goto L283;
     */
    /* JADX WARN: Code restructure failed: missing block: B:265:0x045c, code lost:
    
        if (r2.equals("A_VORBIS") != false) goto L283;
     */
    /* JADX WARN: Code restructure failed: missing block: B:267:0x0465, code lost:
    
        if (r2.equals("A_TRUEHD") != false) goto L283;
     */
    /* JADX WARN: Code restructure failed: missing block: B:269:0x046e, code lost:
    
        if (r2.equals("A_MS/ACM") != false) goto L283;
     */
    /* JADX WARN: Code restructure failed: missing block: B:271:0x0477, code lost:
    
        if (r2.equals("V_MPEG4/ISO/SP") != false) goto L283;
     */
    /* JADX WARN: Code restructure failed: missing block: B:273:0x0480, code lost:
    
        if (r2.equals("V_MPEG4/ISO/AP") != false) goto L283;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0181  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzi(int i5) {
        int i6;
        int i7;
        SparseArray sparseArray;
        long j2;
        List list;
        int i8;
        long zza2;
        long j5;
        long zzb2;
        long zza3;
        zzap zzg2;
        this.zzap.getClass();
        int i9 = 2;
        long j6 = 0;
        int i10 = 0;
        if (i5 == 160) {
            if (this.zzU == 2) {
                zzajg zzajgVar = (zzajg) this.zzi.get(this.zzaa);
                zzajgVar.zzb();
                if (this.zzaf > 0 && "A_OPUS".equals(zzajgVar.zzc)) {
                    zzer zzerVar = this.zzv;
                    byte[] array = ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(this.zzaf).array();
                    zzerVar.zzb(array, array.length);
                }
                int i11 = 0;
                for (int i12 = 0; i12 < this.zzY; i12++) {
                    i11 += this.zzZ[i12];
                }
                int i13 = 0;
                while (i13 < this.zzY) {
                    long j7 = this.zzV + ((zzajgVar.zzf * i13) / zzbgj.zzq.zzf);
                    int i14 = this.zzac;
                    if (i13 == 0) {
                        if (!this.zzae) {
                            i14 |= 1;
                        }
                        i6 = 0;
                    } else {
                        i6 = i13;
                    }
                    int i15 = this.zzZ[i6];
                    int i16 = i11 - i15;
                    zzs(zzajgVar, j7, i14, i15, i16);
                    i13 = i6 + 1;
                    i11 = i16;
                }
                this.zzU = 0;
                return;
            }
            return;
        }
        if (i5 == 174) {
            zzajg zzajgVar2 = this.zzE;
            zzajgVar2.getClass();
            String str = zzajgVar2.zzc;
            if (str == null) {
                throw zzat.zzb("CodecId is missing in TrackEntry element", null);
            }
            switch (str.hashCode()) {
                case -2095576542:
                    break;
                case -2095575984:
                    break;
                case -1985379776:
                    break;
                case -1784763192:
                    break;
                case -1730367663:
                    break;
                case -1482641358:
                    break;
                case -1482641357:
                    break;
                case -1373388978:
                    break;
                case -933872740:
                    break;
                case -538363189:
                    break;
                case -538363109:
                    break;
                case -425012669:
                    break;
                case -356037306:
                    break;
                case 62923557:
                    break;
                case 62923603:
                    break;
                case 62927045:
                    break;
                case 82318131:
                    break;
                case 82338133:
                    break;
                case 82338134:
                    break;
                case 99146302:
                    break;
                case 444813526:
                    break;
                case 542569478:
                    break;
                case 635596514:
                    break;
                case 725948237:
                    break;
                case 725957860:
                    break;
                case 738597099:
                    break;
                case 738614379:
                    break;
                case 855502857:
                    break;
                case 1045209816:
                    break;
                case 1422270023:
                    break;
                case 1809237540:
                    break;
                case 1950749482:
                    break;
                case 1950789798:
                    break;
                case 1951062397:
                    break;
            }
            this.zzE = null;
            return;
        }
        if (i5 == 183) {
            if (this.zzF) {
                return;
            }
            zzr(i5);
            if (this.zzK == -9223372036854775807L || (i7 = this.zzL) == -1 || this.zzM == -1) {
                return;
            }
            SparseArray sparseArray2 = this.zzI;
            List list2 = (List) sparseArray2.get(i7);
            if (list2 == null) {
                list2 = new ArrayList();
                sparseArray2.put(this.zzL, list2);
            }
            list2.add(new zzaje(this.zzK, this.zzy + this.zzM, this.zzN, null));
            return;
        }
        if (i5 == 19899) {
            int i17 = this.zzG;
            if (i17 != -1) {
                long j8 = this.zzH;
                if (j8 != -1) {
                    if (i17 == 475249515) {
                        this.zzQ = j8;
                        return;
                    }
                    return;
                }
            }
            throw zzat.zzb("Mandatory element SeekID or SeekPosition not found", null);
        }
        if (i5 == 25152) {
            zzq(i5);
            zzajg zzajgVar3 = this.zzE;
            if (zzajgVar3.zzh) {
                if (zzajgVar3.zzj == null) {
                    throw zzat.zzb("Encrypted Track found but ContentEncKeyID was not found", null);
                }
                zzajgVar3.zzl = new zzq(null, new zzp(zzg.zza, null, "video/webm", this.zzE.zzj.zzb));
                return;
            }
            return;
        }
        if (i5 == 28032) {
            zzq(i5);
            zzajg zzajgVar4 = this.zzE;
            if (zzajgVar4.zzh && zzajgVar4.zzi != null) {
                throw zzat.zzb("Combining encryption and compression is not supported", null);
            }
            return;
        }
        if (i5 == 357149030) {
            if (this.zzz == -9223372036854775807L) {
                this.zzz = 1000000L;
            }
            long j9 = this.zzA;
            if (j9 != -9223372036854775807L) {
                this.zzB = zzz(j9);
                return;
            }
            return;
        }
        if (i5 == 374648427) {
            SparseArray sparseArray3 = this.zzi;
            if (sparseArray3.size() == 0) {
                throw zzat.zzb("No valid tracks were found", null);
            }
            boolean z4 = !this.zzj || this.zzQ == -1;
            int i18 = -1;
            int i19 = -1;
            int i20 = -1;
            int i21 = -1;
            for (int i22 = 0; i22 < sparseArray3.size(); i22++) {
                zzajg zzajgVar5 = (zzajg) sparseArray3.valueAt(i22);
                int i23 = zzajgVar5.zze;
                if (i23 == 2) {
                    if (zzajgVar5.zzX) {
                        i18 = zzajgVar5.zzd;
                    }
                    if (i19 == -1) {
                        i19 = zzajgVar5.zzd;
                    }
                } else if (i23 == 1) {
                    if (zzajgVar5.zzX) {
                        i20 = zzajgVar5.zzd;
                    }
                    if (i21 == -1) {
                        i21 = zzajgVar5.zzd;
                    }
                }
                if (z4) {
                    zzajgVar5.zzb();
                    if (!zzajgVar5.zzV) {
                        zzagh zzaghVar = zzajgVar5.zzY;
                        zzv zzvVar = zzajgVar5.zzZ;
                        zzvVar.getClass();
                        zzaghVar.zzz(zzvVar);
                    }
                }
            }
            if (i18 != -1) {
                this.zzO = i18;
            } else if (i19 != -1) {
                this.zzO = i19;
            } else if (i20 != -1) {
                this.zzO = i20;
            } else if (i21 != -1) {
                this.zzO = i21;
            } else {
                this.zzO = sparseArray3.size() > 0 ? ((zzajg) sparseArray3.valueAt(0)).zzd : -1;
            }
            if (z4) {
                zzB();
                return;
            }
            return;
        }
        if (i5 != 475249515 || this.zzF) {
            return;
        }
        int i24 = 0;
        while (true) {
            sparseArray = this.zzI;
            if (i24 >= sparseArray.size()) {
                break;
            }
            if (((List) sparseArray.valueAt(i24)).isEmpty()) {
                i24++;
            } else if (this.zzB != -9223372036854775807L) {
                for (int i25 = 0; i25 < sparseArray.size(); i25++) {
                    Collections.sort((List) sparseArray.valueAt(i25));
                }
                j2 = -9223372036854775807L;
                this.zzap.zzw(new zzajf(sparseArray, this.zzB, this.zzO, this.zzy, this.zzx));
            }
        }
        j2 = -9223372036854775807L;
        this.zzap.zzw(new zzafx(this.zzB, 0L));
        this.zzF = true;
        this.zzJ = false;
        int i26 = 0;
        while (true) {
            SparseArray sparseArray4 = this.zzi;
            if (i26 >= sparseArray4.size()) {
                zzB();
                return;
            }
            zzajg zzajgVar6 = (zzajg) sparseArray4.valueAt(i26);
            long j10 = this.zzB;
            long j11 = this.zzy;
            long j12 = this.zzx;
            long j13 = j6;
            if (zzajgVar6.zze != i9 || (list = (List) sparseArray.get(zzajgVar6.zzd)) == null || list.isEmpty()) {
                i8 = i10;
            } else {
                if (list.isEmpty()) {
                    i8 = i10;
                } else {
                    i8 = i10;
                    int min = Math.min(list.size(), 20);
                    double d5 = 0.0d;
                    int i27 = i8;
                    int i28 = -1;
                    while (i27 < min) {
                        zzaje zzajeVar = (zzaje) list.get(i27);
                        if (zzajeVar.zza() > 10000000) {
                            break;
                        }
                        int i29 = i27 + 1;
                        if (i27 < list.size() - 1) {
                            zzaje zzajeVar2 = (zzaje) list.get(i29);
                            j5 = zzajeVar2.zzb() + zzajeVar2.zzc();
                            zzb2 = zzajeVar.zzb() + zzajeVar.zzc();
                            zza3 = zzajeVar2.zza() - zzajeVar.zza();
                        } else {
                            j5 = j11 + j12;
                            zzb2 = zzajeVar.zzb() + zzajeVar.zzc();
                            zza3 = j10 - zzajeVar.zza();
                        }
                        long j14 = j5 - zzb2;
                        int i30 = min;
                        long j15 = j10;
                        int i31 = i27;
                        long j16 = zza3;
                        if (j16 > j13) {
                            double d6 = j14 / j16;
                            if (d6 > d5) {
                                d5 = d6;
                                i28 = i31;
                            }
                        }
                        min = i30;
                        i27 = i29;
                        j10 = j15;
                    }
                    if (i28 != -1) {
                        zza2 = ((zzaje) list.get(i28)).zza();
                        if (zza2 != j2) {
                            zzv zzvVar2 = zzajgVar6.zzZ;
                            zzvVar2.getClass();
                            zzap zzapVar = zzvVar2.zzl;
                            zzahx zzahxVar = new zzahx(zza2);
                            if (zzapVar == null) {
                                zzao[] zzaoVarArr = new zzao[1];
                                zzaoVarArr[i8] = zzahxVar;
                                zzg2 = new zzap(j2, zzaoVarArr);
                            } else {
                                zzao[] zzaoVarArr2 = new zzao[1];
                                zzaoVarArr2[i8] = zzahxVar;
                                zzg2 = zzapVar.zzg(zzaoVarArr2);
                            }
                            zzt zza4 = zzajgVar6.zzZ.zza();
                            zza4.zzk(zzg2);
                            zzajgVar6.zzZ = zza4.zzM();
                        }
                    }
                }
                zza2 = j2;
                if (zza2 != j2) {
                }
            }
            if (!zzajgVar6.zzV) {
                zzajgVar6.zzb();
                zzagh zzaghVar2 = zzajgVar6.zzY;
                zzv zzvVar3 = zzajgVar6.zzZ;
                zzvVar3.getClass();
                zzaghVar2.zzz(zzvVar3);
            }
            i26++;
            j6 = j13;
            i10 = i8;
            i9 = 2;
            j2 = -9223372036854775807L;
        }
    }

    public final void zzj(int i5, long j2) {
        boolean z4;
        if (i5 == 240) {
            if (this.zzF) {
                return;
            }
            zzr(i5);
            if (this.zzN == -1) {
                this.zzN = j2;
                return;
            }
            return;
        }
        if (i5 == 241) {
            if (this.zzF) {
                return;
            }
            zzr(i5);
            if (this.zzM == -1) {
                this.zzM = j2;
                return;
            }
            return;
        }
        if (i5 == 20529) {
            if (j2 == 0) {
                return;
            }
            StringBuilder sb = new StringBuilder(String.valueOf(j2).length() + 35);
            sb.append("ContentEncodingOrder ");
            sb.append(j2);
            sb.append(" not supported");
            throw zzat.zzb(sb.toString(), null);
        }
        if (i5 == 20530) {
            if (j2 == 1) {
                return;
            }
            StringBuilder sb2 = new StringBuilder(String.valueOf(j2).length() + 35);
            sb2.append("ContentEncodingScope ");
            sb2.append(j2);
            sb2.append(" not supported");
            throw zzat.zzb(sb2.toString(), null);
        }
        switch (i5) {
            case 131:
                int i6 = (int) j2;
                if (i6 == 1) {
                    zzq(i5);
                    this.zzE.zze = 2;
                    return;
                }
                if (i6 == 2) {
                    zzq(i5);
                    this.zzE.zze = 1;
                    return;
                } else if (i6 == 17) {
                    zzq(i5);
                    this.zzE.zze = 3;
                    return;
                } else if (i6 != 33) {
                    zzq(i5);
                    this.zzE.zze = -1;
                    return;
                } else {
                    zzq(i5);
                    this.zzE.zze = 5;
                    return;
                }
            case 136:
                z4 = j2 == 1;
                zzq(i5);
                this.zzE.zzX = z4;
                return;
            case 155:
                this.zzW = zzz(j2);
                return;
            case 159:
                zzq(i5);
                this.zzE.zzP = (int) j2;
                return;
            case 176:
                zzq(i5);
                this.zzE.zzm = (int) j2;
                return;
            case 179:
                if (this.zzF) {
                    return;
                }
                zzr(i5);
                this.zzK = zzz(j2);
                return;
            case 186:
                zzq(i5);
                this.zzE.zzn = (int) j2;
                return;
            case 215:
                zzq(i5);
                this.zzE.zzd = (int) j2;
                return;
            case 231:
                this.zzS = zzz(j2);
                return;
            case 238:
                this.zzad = (int) j2;
                return;
            case 247:
                if (this.zzF) {
                    return;
                }
                zzr(i5);
                this.zzL = (int) j2;
                return;
            case 251:
                this.zzae = true;
                return;
            case 16871:
                zzq(i5);
                this.zzE.zzd((int) j2);
                return;
            case 16980:
                if (j2 == 3) {
                    return;
                }
                StringBuilder sb3 = new StringBuilder(String.valueOf(j2).length() + 30);
                sb3.append("ContentCompAlgo ");
                sb3.append(j2);
                sb3.append(" not supported");
                throw zzat.zzb(sb3.toString(), null);
            case 17029:
                if (j2 < 1 || j2 > 2) {
                    StringBuilder sb4 = new StringBuilder(String.valueOf(j2).length() + 33);
                    sb4.append("DocTypeReadVersion ");
                    sb4.append(j2);
                    sb4.append(" not supported");
                    throw zzat.zzb(sb4.toString(), null);
                }
                return;
            case 17143:
                if (j2 == 1) {
                    return;
                }
                StringBuilder sb5 = new StringBuilder(String.valueOf(j2).length() + 30);
                sb5.append("EBMLReadVersion ");
                sb5.append(j2);
                sb5.append(" not supported");
                throw zzat.zzb(sb5.toString(), null);
            case 18401:
                if (j2 == 5) {
                    return;
                }
                StringBuilder sb6 = new StringBuilder(String.valueOf(j2).length() + 29);
                sb6.append("ContentEncAlgo ");
                sb6.append(j2);
                sb6.append(" not supported");
                throw zzat.zzb(sb6.toString(), null);
            case 18408:
                if (j2 == 1) {
                    return;
                }
                StringBuilder sb7 = new StringBuilder(String.valueOf(j2).length() + 36);
                sb7.append("AESSettingsCipherMode ");
                sb7.append(j2);
                sb7.append(" not supported");
                throw zzat.zzb(sb7.toString(), null);
            case 21420:
                this.zzH = j2 + this.zzy;
                return;
            case 21432:
                int i7 = (int) j2;
                zzq(i5);
                if (i7 == 0) {
                    this.zzE.zzx = 0;
                    return;
                }
                if (i7 == 1) {
                    this.zzE.zzx = 2;
                    return;
                } else if (i7 == 3) {
                    this.zzE.zzx = 1;
                    return;
                } else {
                    if (i7 != 15) {
                        return;
                    }
                    this.zzE.zzx = 3;
                    return;
                }
            case 21680:
                zzq(i5);
                this.zzE.zzp = (int) j2;
                return;
            case 21682:
                zzq(i5);
                this.zzE.zzr = (int) j2;
                return;
            case 21690:
                zzq(i5);
                this.zzE.zzq = (int) j2;
                return;
            case 21930:
                z4 = j2 == 1;
                zzq(i5);
                this.zzE.zzW = z4;
                return;
            case 21938:
                zzq(i5);
                zzajg zzajgVar = this.zzE;
                zzajgVar.zzy = true;
                zzajgVar.zzo = (int) j2;
                return;
            case 21998:
                zzq(i5);
                this.zzE.zzg = (int) j2;
                return;
            case 22186:
                zzq(i5);
                this.zzE.zzS = j2;
                return;
            case 22203:
                zzq(i5);
                this.zzE.zzT = j2;
                return;
            case 25188:
                zzq(i5);
                this.zzE.zzQ = (int) j2;
                return;
            case 30114:
                this.zzaf = j2;
                return;
            case 30321:
                int i8 = (int) j2;
                zzq(i5);
                if (i8 == 0) {
                    this.zzE.zzs = 0;
                    return;
                }
                if (i8 == 1) {
                    this.zzE.zzs = 1;
                    return;
                } else if (i8 == 2) {
                    this.zzE.zzs = 2;
                    return;
                } else {
                    if (i8 != 3) {
                        return;
                    }
                    this.zzE.zzs = 3;
                    return;
                }
            case 2352003:
                zzq(i5);
                this.zzE.zzf = (int) j2;
                return;
            case 2807729:
                this.zzz = j2;
                return;
            default:
                switch (i5) {
                    case 21945:
                        int i9 = (int) j2;
                        zzq(i5);
                        if (i9 == 1) {
                            this.zzE.zzB = 2;
                            return;
                        } else {
                            if (i9 != 2) {
                                return;
                            }
                            this.zzE.zzB = 1;
                            return;
                        }
                    case 21946:
                        zzq(i5);
                        int zzc2 = zzi.zzc((int) j2);
                        if (zzc2 != -1) {
                            this.zzE.zzA = zzc2;
                            return;
                        }
                        return;
                    case 21947:
                        zzq(i5);
                        this.zzE.zzy = true;
                        int zzb2 = zzi.zzb((int) j2);
                        if (zzb2 != -1) {
                            this.zzE.zzz = zzb2;
                            return;
                        }
                        return;
                    case 21948:
                        zzq(i5);
                        this.zzE.zzC = (int) j2;
                        return;
                    case 21949:
                        zzq(i5);
                        this.zzE.zzD = (int) j2;
                        return;
                    default:
                        return;
                }
        }
    }

    public final void zzk(int i5, double d5) {
        if (i5 == 181) {
            zzq(i5);
            this.zzE.zzR = (int) d5;
            return;
        }
        if (i5 == 17545) {
            this.zzA = (long) d5;
            return;
        }
        switch (i5) {
            case 21969:
                zzq(i5);
                this.zzE.zzE = (float) d5;
                break;
            case 21970:
                zzq(i5);
                this.zzE.zzF = (float) d5;
                break;
            case 21971:
                zzq(i5);
                this.zzE.zzG = (float) d5;
                break;
            case 21972:
                zzq(i5);
                this.zzE.zzH = (float) d5;
                break;
            case 21973:
                zzq(i5);
                this.zzE.zzI = (float) d5;
                break;
            case 21974:
                zzq(i5);
                this.zzE.zzJ = (float) d5;
                break;
            case 21975:
                zzq(i5);
                this.zzE.zzK = (float) d5;
                break;
            case 21976:
                zzq(i5);
                this.zzE.zzL = (float) d5;
                break;
            case 21977:
                zzq(i5);
                this.zzE.zzM = (float) d5;
                break;
            case 21978:
                zzq(i5);
                this.zzE.zzN = (float) d5;
                break;
            default:
                switch (i5) {
                    case 30323:
                        zzq(i5);
                        this.zzE.zzt = (float) d5;
                        break;
                    case 30324:
                        zzq(i5);
                        this.zzE.zzu = (float) d5;
                        break;
                    case 30325:
                        zzq(i5);
                        this.zzE.zzv = (float) d5;
                        break;
                }
        }
    }

    public final void zzl(int i5, String str) {
        if (i5 == 134) {
            zzq(i5);
            this.zzE.zzc = str;
            return;
        }
        if (i5 != 17026) {
            if (i5 == 21358) {
                zzq(i5);
                this.zzE.zzb = str;
                return;
            } else {
                if (i5 != 2274716) {
                    return;
                }
                zzq(i5);
                this.zzE.zze(str);
                return;
            }
        }
        if ("webm".equals(str) || "matroska".equals(str)) {
            this.zzC = Objects.equals(str, "webm");
            return;
        }
        StringBuilder sb = new StringBuilder(str.length() + 22);
        sb.append("DocType ");
        sb.append(str);
        sb.append(" not supported");
        throw zzat.zzb(sb.toString(), null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:133:0x0276, code lost:
    
        throw com.google.android.gms.internal.ads.zzat.zzb("EBML lacing sample size out of range.", null);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzm(int i5, int i6, zzaev zzaevVar) {
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        long j2;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18 = i5;
        int i19 = 2;
        int i20 = 1;
        int i21 = 0;
        if (i18 != 161 && i18 != 163) {
            if (i18 == 165) {
                if (this.zzU != 2) {
                    return;
                }
                zzajg zzajgVar = (zzajg) this.zzi.get(this.zzaa);
                if (this.zzad != 4 || !"V_VP9".equals(zzajgVar.zzc)) {
                    zzaevVar.zzf(i6);
                    return;
                }
                zzer zzerVar = this.zzv;
                zzerVar.zza(i6);
                zzaevVar.zzc(zzerVar.zzi(), 0, i6);
                return;
            }
            if (i18 == 16877) {
                zzq(i5);
                zzajg zzajgVar2 = this.zzE;
                if (zzajgVar2.zzc() != 1685485123 && zzajgVar2.zzc() != 1685480259) {
                    zzaevVar.zzf(i6);
                    return;
                }
                byte[] bArr = new byte[i6];
                zzajgVar2.zzO = bArr;
                zzaevVar.zzc(bArr, 0, i6);
                return;
            }
            if (i18 == 16981) {
                zzq(i5);
                byte[] bArr2 = new byte[i6];
                this.zzE.zzi = bArr2;
                zzaevVar.zzc(bArr2, 0, i6);
                return;
            }
            if (i18 == 18402) {
                byte[] bArr3 = new byte[i6];
                zzaevVar.zzc(bArr3, 0, i6);
                zzq(i5);
                this.zzE.zzj = new zzagg(1, bArr3, 0, 0);
                return;
            }
            if (i18 == 21419) {
                zzer zzerVar2 = this.zzq;
                Arrays.fill(zzerVar2.zzi(), (byte) 0);
                zzaevVar.zzc(zzerVar2.zzi(), 4 - i6, i6);
                zzerVar2.zzh(0);
                this.zzG = (int) zzerVar2.zzz();
                return;
            }
            if (i18 == 25506) {
                zzq(i5);
                byte[] bArr4 = new byte[i6];
                this.zzE.zzk = bArr4;
                zzaevVar.zzc(bArr4, 0, i6);
                return;
            }
            if (i18 != 30322) {
                StringBuilder sb = new StringBuilder(String.valueOf(i18).length() + 15);
                sb.append("Unexpected id: ");
                sb.append(i18);
                throw zzat.zzb(sb.toString(), null);
            }
            zzq(i5);
            byte[] bArr5 = new byte[i6];
            this.zzE.zzw = bArr5;
            zzaevVar.zzc(bArr5, 0, i6);
            return;
        }
        int i22 = 8;
        if (this.zzU == 0) {
            zzajj zzajjVar = this.zzh;
            this.zzaa = (int) zzajjVar.zzb(zzaevVar, false, true, 8);
            this.zzab = zzajjVar.zzc();
            this.zzW = -9223372036854775807L;
            this.zzU = 1;
            this.zzo.zza(0);
        }
        zzajg zzajgVar3 = (zzajg) this.zzi.get(this.zzaa);
        if (zzajgVar3 == null) {
            zzaevVar.zzf(i6 - this.zzab);
            this.zzU = 0;
            return;
        }
        zzajgVar3.zzb();
        if (this.zzU == 1) {
            zzt(zzaevVar, 3);
            zzer zzerVar3 = this.zzo;
            int i23 = (zzerVar3.zzi()[2] & 6) >> 1;
            if (i23 == 0) {
                this.zzY = 1;
                int[] zzA = zzA(this.zzZ, 1);
                this.zzZ = zzA;
                zzA[0] = (i6 - this.zzab) - 3;
            } else {
                zzt(zzaevVar, 4);
                int i24 = (zzerVar3.zzi()[3] & 255) + 1;
                this.zzY = i24;
                int[] zzA2 = zzA(this.zzZ, i24);
                this.zzZ = zzA2;
                if (i23 == 2) {
                    int i25 = (i6 - this.zzab) - 4;
                    int i26 = this.zzY;
                    Arrays.fill(zzA2, 0, i26, i25 / i26);
                } else if (i23 == 1) {
                    int i27 = 0;
                    int i28 = 0;
                    int i29 = 4;
                    while (true) {
                        i14 = this.zzY - 1;
                        if (i27 >= i14) {
                            break;
                        }
                        this.zzZ[i27] = 0;
                        while (true) {
                            i15 = i29 + 1;
                            zzt(zzaevVar, i15);
                            int i30 = zzerVar3.zzi()[i29] & 255;
                            int[] iArr = this.zzZ;
                            i16 = iArr[i27] + i30;
                            iArr[i27] = i16;
                            if (i30 != 255) {
                                break;
                            } else {
                                i29 = i15;
                            }
                        }
                        i28 += i16;
                        i27++;
                        i29 = i15;
                    }
                    this.zzZ[i14] = ((i6 - this.zzab) - i29) - i28;
                } else {
                    if (i23 != 3) {
                        throw zzat.zzb("Unexpected lacing value: 2", null);
                    }
                    int i31 = 0;
                    int i32 = 0;
                    int i33 = 4;
                    while (true) {
                        int i34 = this.zzY - 1;
                        if (i31 >= i34) {
                            i8 = i19;
                            i9 = i20;
                            i10 = i21;
                            this.zzZ[i34] = ((i6 - this.zzab) - i33) - i32;
                            break;
                        }
                        this.zzZ[i31] = i21;
                        int i35 = i33 + 1;
                        zzt(zzaevVar, i35);
                        if (zzerVar3.zzi()[i33] == 0) {
                            throw zzat.zzb("No valid varint length mask found", null);
                        }
                        int i36 = i21;
                        while (true) {
                            if (i21 >= i22) {
                                i11 = i19;
                                i12 = i20;
                                i13 = i22;
                                j2 = 0;
                                break;
                            }
                            i13 = i22;
                            int i37 = i20 << (7 - i21);
                            if ((zzerVar3.zzi()[i33] & i37) != 0) {
                                i35 += i21;
                                zzt(zzaevVar, i35);
                                int i38 = i33 + 1;
                                int i39 = zzerVar3.zzi()[i33] & 255 & (~i37);
                                int i40 = i19;
                                j2 = i39;
                                i11 = i40;
                                int i41 = i38;
                                while (i41 < i35) {
                                    j2 = (j2 << i13) | (zzerVar3.zzi()[i41] & 255);
                                    i20 = i20;
                                    i41++;
                                    i21 = i21;
                                }
                                i12 = i20;
                                int i42 = i21;
                                if (i31 > 0) {
                                    j2 -= (1 << ((i42 * 7) + 6)) - 1;
                                }
                            } else {
                                i21++;
                                i22 = i13;
                            }
                        }
                        if (j2 < -2147483648L || j2 > 2147483647L) {
                            break;
                        }
                        int[] iArr2 = this.zzZ;
                        int i43 = (int) j2;
                        if (i31 != 0) {
                            i43 += iArr2[i31 - 1];
                        }
                        iArr2[i31] = i43;
                        i32 += i43;
                        i31++;
                        i33 = i35;
                        i21 = i36;
                        i19 = i11;
                        i22 = i13;
                        i20 = i12;
                    }
                }
            }
            i8 = 2;
            i9 = 1;
            i10 = 0;
            this.zzV = this.zzS + zzz((zzerVar3.zzi()[i10] << 8) | (zzerVar3.zzi()[i9] & 255));
            if (zzajgVar3.zze != i9) {
                if (i18 != 163) {
                    i17 = i10;
                } else if ((zzerVar3.zzi()[i8] & 128) == 128) {
                    i18 = 163;
                } else {
                    i17 = i10;
                    i18 = 163;
                }
                this.zzac = i17;
                this.zzU = i8;
                this.zzX = i10;
                i7 = 163;
            }
            i17 = 1;
            this.zzac = i17;
            this.zzU = i8;
            this.zzX = i10;
            i7 = 163;
        } else {
            i7 = 163;
        }
        if (i18 == i7) {
            while (true) {
                int i44 = this.zzX;
                if (i44 >= this.zzY) {
                    this.zzU = 0;
                    return;
                }
                int zzu = zzu(zzaevVar, zzajgVar3, this.zzZ[i44], false);
                zzajg zzajgVar4 = zzajgVar3;
                zzs(zzajgVar4, this.zzV + ((this.zzX * zzajgVar3.zzf) / zzbgj.zzq.zzf), this.zzac, zzu, 0);
                this.zzX++;
                zzajgVar3 = zzajgVar4;
            }
        } else {
            while (true) {
                int i45 = this.zzX;
                if (i45 >= this.zzY) {
                    return;
                }
                int[] iArr3 = this.zzZ;
                iArr3[i45] = zzu(zzaevVar, zzajgVar3, iArr3[i45], true);
                this.zzX++;
            }
        }
    }

    public zzajh(zzaja zzajaVar, int i5, zzamd zzamdVar) {
        this.zzy = -1L;
        this.zzz = -9223372036854775807L;
        this.zzA = -9223372036854775807L;
        this.zzB = -9223372036854775807L;
        this.zzK = -9223372036854775807L;
        this.zzL = -1;
        this.zzM = -1L;
        this.zzN = -1L;
        this.zzO = -1;
        this.zzQ = -1L;
        this.zzR = -1L;
        this.zzS = -9223372036854775807L;
        this.zzaq = zzajaVar;
        zzajaVar.zza(new zzajc(this, null));
        this.zzl = zzamdVar;
        this.zzI = new SparseArray();
        this.zzj = 1 == ((i5 & 1) ^ 1);
        this.zzk = (i5 & 2) == 0;
        this.zzh = new zzajj();
        this.zzi = new SparseArray();
        this.zzo = new zzer(4);
        this.zzp = new zzer(ByteBuffer.allocate(4).putInt(-1).array());
        this.zzq = new zzer(4);
        this.zzm = new zzer(zzgm.zza);
        this.zzn = new zzer(4);
        this.zzr = new zzer();
        this.zzs = new zzer();
        this.zzt = new zzer(8);
        this.zzu = new zzer();
        this.zzv = new zzer();
        this.zzZ = new int[1];
        this.zzD = true;
    }

    public zzajh(zzamd zzamdVar, int i5) {
        this(new zzaja(), 0, zzamdVar);
    }
}
