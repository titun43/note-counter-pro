package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Point;
import android.os.Build;
import android.text.TextUtils;
import android.util.Pair;
import android.view.accessibility.CaptioningManager;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public final class zzaaa extends zzaag implements zzmm {
    public static final /* synthetic */ int zzb = 0;
    private static final zzgvz zzc = zzgvz.zzc(zzzg.zza);
    public final Context zza;
    private final Object zzd;
    private zzzl zze;
    private Thread zzf;
    private zzzp zzg;
    private zzd zzh;
    private Boolean zzi;
    private final zzyt zzj;

    public zzaaa(Context context) {
        zzyt zzytVar = new zzyt();
        zzzl zzzlVar = zzzl.zzJ;
        this.zzd = new Object();
        byte[] bArr = null;
        this.zza = context != null ? context.getApplicationContext() : null;
        this.zzj = zzytVar;
        if (zzzlVar != null) {
            this.zze = zzzlVar;
        } else {
            zzzk zzzkVar = new zzzk(zzzlVar, bArr);
            zzzkVar.zzx((zzbl) zzzlVar);
            this.zze = new zzzl(zzzkVar, bArr);
        }
        this.zzh = zzd.zza;
        if (this.zze.zzU && context == null) {
            zzee.zzc("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
        }
    }

    public static String zzi(String str) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, "und")) {
            return null;
        }
        return str;
    }

    public static int zzj(zzv zzvVar, String str, boolean z4) {
        if (!TextUtils.isEmpty(str) && str.equals(zzvVar.zzd)) {
            return 4;
        }
        String zzi = zzi(str);
        String zzi2 = zzi(zzvVar.zzd);
        if (zzi2 == null || zzi == null) {
            return (z4 && zzi2 == null) ? 1 : 0;
        }
        if (zzi2.startsWith(zzi) || zzi.startsWith(zzi2)) {
            return 3;
        }
        String str2 = zzfj.zza;
        return zzi2.split("-", 2)[0].equals(zzi.split("-", 2)[0]) ? 2 : 0;
    }

    public static /* synthetic */ int zzm(int i5, int i6) {
        return (i5 == 0 || i5 != i6) ? Integer.bitCount(i5 & i6) : com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0027, code lost:
    
        r1 = r1 + 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ int zzn(zzv zzvVar, zzguf zzgufVar) {
        int i5 = 0;
        while (i5 < zzgufVar.size()) {
            int i6 = 0;
            while (true) {
                List list = zzvVar.zzc;
                if (i6 < list.size()) {
                    if (((zzx) list.get(i6)).zzb.equals(zzgufVar.get(i5))) {
                        return i5;
                    }
                    i6++;
                }
            }
        }
        return com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzu, reason: merged with bridge method [inline-methods] */
    public final void zzl() {
        boolean z4;
        zzzp zzzpVar;
        synchronized (this.zzd) {
            try {
                z4 = false;
                if (this.zze.zzU && Build.VERSION.SDK_INT >= 32 && (zzzpVar = this.zzg) != null && zzzpVar.zza()) {
                    z4 = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z4) {
            zzs();
        }
    }

    private static void zzv(zzyn zzynVar, zzbl zzblVar, Map map) {
        for (int i5 = 0; i5 < zzynVar.zzb; i5++) {
            if (((zzbh) zzblVar.zzH.get(zzynVar.zza(i5))) != null) {
                throw null;
            }
        }
    }

    private static final Pair zzw(int i5, zzaaf zzaafVar, int[][][] iArr, zzzr zzzrVar, Comparator comparator) {
        RandomAccess randomAccess;
        zzaaf zzaafVar2 = zzaafVar;
        ArrayList arrayList = new ArrayList();
        int i6 = 0;
        while (i6 < 2) {
            if (i5 == zzaafVar2.zza(i6)) {
                zzyn zzb2 = zzaafVar2.zzb(i6);
                for (int i7 = 0; i7 < zzb2.zzb; i7++) {
                    zzbg zza = zzb2.zza(i7);
                    List zza2 = zzzrVar.zza(i6, zza, iArr[i6][i7]);
                    int i8 = zza.zza;
                    boolean[] zArr = new boolean[i8];
                    int i9 = 0;
                    while (i9 < i8) {
                        int i10 = i9 + 1;
                        zzzs zzzsVar = (zzzs) zza2.get(i9);
                        int zza3 = zzzsVar.zza();
                        if (!zArr[i9] && zza3 != 0) {
                            if (zza3 == 1) {
                                randomAccess = zzguf.zzj(zzzsVar);
                            } else {
                                ArrayList arrayList2 = new ArrayList();
                                arrayList2.add(zzzsVar);
                                for (int i11 = i10; i11 < i8; i11++) {
                                    zzzs zzzsVar2 = (zzzs) zza2.get(i11);
                                    if (zzzsVar2.zza() == 2 && zzzsVar.zzc(zzzsVar2)) {
                                        arrayList2.add(zzzsVar2);
                                        zArr[i11] = true;
                                    }
                                }
                                randomAccess = arrayList2;
                            }
                            arrayList.add(randomAccess);
                        }
                        i9 = i10;
                    }
                }
            }
            i6++;
            zzaafVar2 = zzaafVar;
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        List list = (List) Collections.max(arrayList, comparator);
        int[] iArr2 = new int[list.size()];
        for (int i12 = 0; i12 < list.size(); i12++) {
            iArr2[i12] = ((zzzs) list.get(i12)).zzc;
        }
        zzzs zzzsVar3 = (zzzs) list.get(0);
        return Pair.create(new zzaab(zzzsVar3.zzb, iArr2, 0), Integer.valueOf(zzzsVar3.zza));
    }

    @Override // com.google.android.gms.internal.ads.zzmm
    public final void zza(zzml zzmlVar) {
        synchronized (this.zzd) {
            boolean z4 = this.zze.zzY;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaaj
    public final void zzb() {
        zzzp zzzpVar;
        synchronized (this.zzd) {
            try {
                Thread thread = this.zzf;
                if (thread != null) {
                    zzgrc.zzj(thread == Thread.currentThread(), "DefaultTrackSelector is accessed on the wrong thread.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (Build.VERSION.SDK_INT >= 32 && (zzzpVar = this.zzg) != null) {
            zzzpVar.zze();
            this.zzg = null;
        }
        super.zzb();
    }

    public final zzzl zzc() {
        zzzl zzzlVar;
        synchronized (this.zzd) {
            zzzlVar = this.zze;
        }
        return zzzlVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaaj
    public final boolean zzd() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzaaj
    public final void zze(zzd zzdVar) {
        if (this.zzh.equals(zzdVar)) {
            return;
        }
        this.zzh = zzdVar;
        zzl();
    }

    public final void zzf(zzzk zzzkVar) {
        boolean equals;
        zzzl zzzlVar = new zzzl(zzzkVar, null);
        synchronized (this.zzd) {
            equals = this.zze.equals(zzzlVar);
            this.zze = zzzlVar;
        }
        if (equals) {
            return;
        }
        if (zzzlVar.zzU && this.zza == null) {
            zzee.zzc("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
        }
        zzs();
    }

    @Override // com.google.android.gms.internal.ads.zzaaj
    public final zzmm zzg() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzaag
    public final Pair zzh(zzaaf zzaafVar, int[][][] iArr, final int[] iArr2, zzwk zzwkVar, zzbf zzbfVar) {
        final zzzl zzzlVar;
        int i5;
        final boolean z4;
        final String str;
        final String str2;
        int[] iArr3;
        int length;
        Context context;
        CaptioningManager captioningManager;
        Locale locale;
        Context context2;
        Context context3;
        synchronized (this.zzd) {
            this.zzf = Thread.currentThread();
            zzzlVar = this.zze;
        }
        if (this.zzi == null && (context3 = this.zza) != null) {
            this.zzi = Boolean.valueOf(zzfj.zzM(context3));
        }
        if (zzzlVar.zzU && Build.VERSION.SDK_INT >= 32 && this.zzg == null) {
            this.zzg = new zzzp(this.zza, this, this.zzi);
        }
        int i6 = 2;
        zzaab[] zzaabVarArr = new zzaab[2];
        int i7 = 0;
        int i8 = 0;
        while (true) {
            i5 = 1;
            if (i8 >= 2) {
                z4 = false;
                break;
            }
            if (zzaafVar.zza(i8) == 2 && zzaafVar.zzb(i8).zzb > 0) {
                z4 = true;
                break;
            }
            i8++;
        }
        Pair zzw = zzw(1, zzaafVar, iArr, new zzzr() { // from class: com.google.android.gms.internal.ads.zzzc
            @Override // com.google.android.gms.internal.ads.zzzr
            public final /* synthetic */ List zza(int i9, zzbg zzbgVar, int[] iArr4) {
                final zzaaa zzaaaVar = zzaaa.this;
                final zzzl zzzlVar2 = zzzlVar;
                zzgrd zzgrdVar = new zzgrd() { // from class: com.google.android.gms.internal.ads.zzzf
                    @Override // com.google.android.gms.internal.ads.zzgrd
                    public final /* synthetic */ boolean zza(Object obj) {
                        return zzaaa.this.zzk(zzzlVar2, (zzv) obj);
                    }
                };
                int i10 = iArr2[i9];
                int i11 = zzguf.zzd;
                zzguc zzgucVar = new zzguc();
                for (int i12 = 0; i12 < zzbgVar.zza; i12++) {
                    zzgucVar.zzf(new zzyx(i9, zzbgVar, i12, zzzlVar2, iArr4[i12], z4, zzgrdVar, i10));
                }
                return zzgucVar.zzi();
            }
        }, zzyy.zza);
        if (zzw != null) {
            zzaabVarArr[((Integer) zzw.second).intValue()] = (zzaab) zzw.first;
        }
        if (zzw == null) {
            str = null;
        } else {
            Object obj = zzw.first;
            str = ((zzaab) obj).zza.zza(((zzaab) obj).zzb[0]).zzd;
        }
        int i9 = zzzlVar.zzw.zzb;
        final Point zzO = (!zzzlVar.zzk || (context2 = this.zza) == null) ? null : zzfj.zzO(context2);
        Pair zzw2 = zzw(2, zzaafVar, iArr, new zzzr() { // from class: com.google.android.gms.internal.ads.zzzh
            /* JADX WARN: Removed duplicated region for block: B:44:0x0057  */
            /* JADX WARN: Removed duplicated region for block: B:56:0x0063  */
            @Override // com.google.android.gms.internal.ads.zzzr
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final /* synthetic */ List zza(int i10, zzbg zzbgVar, int[] iArr4) {
                int i11;
                int i12;
                int i13;
                boolean z5;
                int i14;
                int i15;
                int i16;
                Point point;
                int i17;
                zzbg zzbgVar2 = zzbgVar;
                int i18 = zzaaa.zzb;
                Point point2 = zzO;
                int i19 = iArr2[i10];
                zzzl zzzlVar2 = zzzl.this;
                int i20 = point2 != null ? point2.x : zzzlVar2.zzi;
                int i21 = point2 != null ? point2.y : zzzlVar2.zzj;
                boolean z6 = zzzlVar2.zzl;
                if (i20 == Integer.MAX_VALUE) {
                    i11 = -1;
                    i12 = Integer.MAX_VALUE;
                } else if (i21 == Integer.MAX_VALUE) {
                    i12 = Integer.MAX_VALUE;
                    i11 = -1;
                } else {
                    int i22 = Integer.MAX_VALUE;
                    for (int i23 = 0; i23 < zzbgVar2.zza; i23++) {
                        zzv zza = zzbgVar2.zza(i23);
                        int i24 = zza.zzv;
                        if (i24 > 0 && (i14 = zza.zzw) > 0) {
                            if (z6) {
                                if ((i24 > i14) != (i20 > i21)) {
                                    i16 = i21;
                                    i15 = i20;
                                    if (i24 * i15 < i14 * i16) {
                                        String str3 = zzfj.zza;
                                        point = new Point(i16, ((r10 + i24) - 1) / i24);
                                    } else {
                                        String str4 = zzfj.zza;
                                        point = new Point(((r12 + i14) - 1) / i14, i15);
                                    }
                                    i17 = i24 * i14;
                                    if (i24 >= ((int) (point.x * 0.98f)) && i14 >= ((int) (point.y * 0.98f)) && i17 < i22) {
                                        i22 = i17;
                                    }
                                }
                            }
                            i15 = i21;
                            i16 = i20;
                            if (i24 * i15 < i14 * i16) {
                            }
                            i17 = i24 * i14;
                            if (i24 >= ((int) (point.x * 0.98f))) {
                                i22 = i17;
                            }
                        }
                    }
                    i11 = -1;
                    i12 = i22;
                }
                int i25 = zzguf.zzd;
                zzguc zzgucVar = new zzguc();
                int i26 = 0;
                while (i26 < zzbgVar2.zza) {
                    int zzc2 = zzbgVar2.zza(i26).zzc();
                    if (i12 != Integer.MAX_VALUE) {
                        i13 = i11;
                        if (zzc2 == i13 || zzc2 > i12) {
                            z5 = false;
                            zzgucVar.zzf(new zzzz(i10, zzbgVar2, i26, zzzlVar2, iArr4[i26], str, i19, z5));
                            i26++;
                            zzbgVar2 = zzbgVar;
                            i11 = i13;
                        }
                    } else {
                        i13 = i11;
                    }
                    z5 = true;
                    zzgucVar.zzf(new zzzz(i10, zzbgVar2, i26, zzzlVar2, iArr4[i26], str, i19, z5));
                    i26++;
                    zzbgVar2 = zzbgVar;
                    i11 = i13;
                }
                return zzgucVar.zzi();
            }
        }, zzzb.zza);
        int i10 = 4;
        Pair zzw3 = zzw2 == null ? zzw(4, zzaafVar, iArr, new zzzr() { // from class: com.google.android.gms.internal.ads.zzze
            @Override // com.google.android.gms.internal.ads.zzzr
            public final /* synthetic */ List zza(int i11, zzbg zzbgVar, int[] iArr4) {
                int i12 = zzaaa.zzb;
                int i13 = zzguf.zzd;
                zzguc zzgucVar = new zzguc();
                for (int i14 = 0; i14 < zzbgVar.zza; i14++) {
                    zzgucVar.zzf(new zzzi(i11, zzbgVar, i14, zzzl.this, iArr4[i14]));
                }
                return zzgucVar.zzi();
            }
        }, zzyz.zza) : null;
        if (zzw3 != null) {
            zzaabVarArr[((Integer) zzw3.second).intValue()] = (zzaab) zzw3.first;
        } else if (zzw2 != null) {
            zzaabVarArr[((Integer) zzw2.second).intValue()] = (zzaab) zzw2.first;
        }
        if (!zzzlVar.zzB || (context = this.zza) == null || (captioningManager = (CaptioningManager) context.getSystemService("captioning")) == null || !captioningManager.isEnabled() || (locale = captioningManager.getLocale()) == null) {
            str2 = null;
        } else {
            String str3 = zzfj.zza;
            str2 = locale.toLanguageTag();
        }
        int i11 = 3;
        Pair zzw4 = zzw(3, zzaafVar, iArr, new zzzr() { // from class: com.google.android.gms.internal.ads.zzzd
            @Override // com.google.android.gms.internal.ads.zzzr
            public final /* synthetic */ List zza(int i12, zzbg zzbgVar, int[] iArr4) {
                int i13 = zzaaa.zzb;
                int i14 = zzguf.zzd;
                zzguc zzgucVar = new zzguc();
                for (int i15 = 0; i15 < zzbgVar.zza; i15++) {
                    zzgucVar.zzf(new zzzq(i12, zzbgVar, i15, zzzl.this, iArr4[i15], str, str2));
                }
                return zzgucVar.zzi();
            }
        }, zzza.zza);
        if (zzw4 != null) {
            zzaabVarArr[((Integer) zzw4.second).intValue()] = (zzaab) zzw4.first;
        }
        int i12 = 0;
        while (i12 < i6) {
            int zza = zzaafVar.zza(i12);
            if (zza != i6 && zza != i5 && zza != i11 && zza != i10) {
                zzyn zzb2 = zzaafVar.zzb(i12);
                int[][] iArr4 = iArr[i12];
                int i13 = i7;
                int i14 = i13;
                zzbg zzbgVar = null;
                zzzj zzzjVar = null;
                while (i13 < zzb2.zzb) {
                    zzbg zza2 = zzb2.zza(i13);
                    int[] iArr5 = iArr4[i13];
                    zzzj zzzjVar2 = zzzjVar;
                    for (int i15 = i7; i15 < zza2.zza; i15++) {
                        if (zzmn.zzaa(iArr5[i15], zzzlVar.zzV)) {
                            zzzj zzzjVar3 = new zzzj(zza2.zza(i15), iArr5[i15]);
                            if (zzzjVar2 == null || zzzjVar3.compareTo(zzzjVar2) > 0) {
                                zzbgVar = zza2;
                                zzzjVar2 = zzzjVar3;
                                i14 = i15;
                            }
                        }
                    }
                    i13++;
                    zzzjVar = zzzjVar2;
                    i7 = 0;
                }
                zzaabVarArr[i12] = zzbgVar == null ? null : new zzaab(zzbgVar, new int[]{i14}, 0);
            }
            i12++;
            i6 = 2;
            i7 = 0;
            i11 = 3;
            i5 = 1;
            i10 = 4;
        }
        HashMap hashMap = new HashMap();
        int i16 = 2;
        for (int i17 = 0; i17 < 2; i17++) {
            zzv(zzaafVar.zzb(i17), zzzlVar, hashMap);
        }
        zzv(zzaafVar.zze(), zzzlVar, hashMap);
        for (int i18 = 0; i18 < 2; i18++) {
            if (((zzbh) hashMap.get(Integer.valueOf(zzaafVar.zza(i18)))) != null) {
                throw null;
            }
        }
        int i19 = 0;
        while (i19 < i16) {
            zzyn zzb3 = zzaafVar.zzb(i19);
            if (zzzlVar.zzb(i19, zzb3)) {
                if (zzzlVar.zzc(i19, zzb3) != null) {
                    throw null;
                }
                zzaabVarArr[i19] = null;
            }
            i19++;
            i16 = 2;
        }
        int i20 = 0;
        while (i20 < i16) {
            int zza3 = zzaafVar.zza(i20);
            if (zzzlVar.zza(i20) || zzzlVar.zzI.contains(Integer.valueOf(zza3))) {
                zzaabVarArr[i20] = null;
            }
            i20++;
            i16 = 2;
        }
        zzyt zzytVar = this.zzj;
        zzaas zzt = zzt();
        zzguf zzd = zzyu.zzd(zzaabVarArr);
        int i21 = 2;
        zzaac[] zzaacVarArr = new zzaac[2];
        int i22 = 0;
        while (i22 < i21) {
            zzaab zzaabVar = zzaabVarArr[i22];
            if (zzaabVar != null && (length = (iArr3 = zzaabVar.zzb).length) != 0) {
                zzaacVarArr[i22] = length == 1 ? new zzaad(zzaabVar.zza, iArr3[0], 0, 0, null) : zzytVar.zza(zzaabVar.zza, iArr3, 0, zzt, (zzguf) zzd.get(i22));
            }
            i22++;
            i21 = 2;
        }
        zzmo[] zzmoVarArr = new zzmo[i21];
        for (int i23 = 0; i23 < i21; i23++) {
            zzmoVarArr[i23] = (zzzlVar.zza(i23) || zzzlVar.zzI.contains(Integer.valueOf(zzaafVar.zza(i23))) || (zzaafVar.zza(i23) != -2 && zzaacVarArr[i23] == null)) ? null : zzmo.zza;
        }
        return Pair.create(zzmoVarArr, zzaacVarArr);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x002e, code lost:
    
        if (r4.equals("audio/eac3") != false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x004d, code lost:
    
        if (android.os.Build.VERSION.SDK_INT < 32) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004f, code lost:
    
        r4 = r3.zzg;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0051, code lost:
    
        if (r4 == null) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0057, code lost:
    
        if (r4.zza() != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0037, code lost:
    
        if (r4.equals("audio/ac4") != false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0040, code lost:
    
        if (r4.equals("audio/ac3") != false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0049, code lost:
    
        if (r4.equals("audio/eac3-joc") != false) goto L31;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final /* synthetic */ boolean zzk(zzzl zzzlVar, zzv zzvVar) {
        Boolean bool;
        int i5;
        zzzp zzzpVar;
        if (!zzzlVar.zzU || (((bool = this.zzi) != null && bool.booleanValue()) || (i5 = zzvVar.zzG) == -1 || i5 <= 2)) {
            return true;
        }
        String str = zzvVar.zzo;
        if (str != null) {
            switch (str.hashCode()) {
                case -2123537834:
                    break;
                case 187078296:
                    break;
                case 187078297:
                    break;
                case 1504578661:
                    break;
            }
            return true;
        }
        return Build.VERSION.SDK_INT >= 32 && (zzzpVar = this.zzg) != null && zzzpVar.zza() && zzzpVar.zzb() && this.zzg.zzc() && this.zzg.zzd(this.zzh, zzvVar);
    }
}
