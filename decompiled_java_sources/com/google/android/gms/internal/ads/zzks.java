package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import android.view.Surface;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: classes.dex */
final class zzks extends zzf implements zzjh {
    public static final /* synthetic */ int zzd = 0;
    private final long zzA;
    private final zzdm zzB;
    private final zzfa zzC;
    private final zzkr zzD;
    private final Map zzE;
    private int zzF;
    private int zzG;
    private boolean zzH;
    private zzms zzI;
    private zzmt zzJ;
    private zzjg zzK;
    private zzax zzL;
    private zzan zzM;
    private Object zzN;
    private Surface zzO;
    private int zzP;
    private zzes zzQ;
    private zzd zzR;
    private float zzS;
    private boolean zzT;
    private boolean zzU;
    private boolean zzV;
    private int zzW;
    private boolean zzX;
    private zzil zzY;
    private zzan zzZ;
    private zzmd zzaa;
    private int zzab;
    private long zzac;
    private zzyf zzad;
    final zzaak zzb;
    final zzax zzc;
    private final zzdq zze = new zzdq(zzdn.zza);
    private final Context zzf;
    private final zzbb zzg;
    private final zzml[] zzh;
    private final zzml[] zzi;
    private final zzaaj zzj;
    private final zzdx zzk;
    private final zzld zzl;
    private final zzlf zzm;
    private final zzed zzn;
    private final CopyOnWriteArraySet zzo;
    private final zzbd zzp;
    private final List zzq;
    private final boolean zzr;
    private final zzmx zzs;
    private final Looper zzt;
    private final zzaas zzu;
    private final zzdn zzv;
    private final zzjo zzw;
    private final zzkn zzx;
    private final zzfo zzy;
    private final zzfp zzz;

    static {
        zzal.zzb("media3.exoplayer");
    }

    public zzks(zzjf zzjfVar, zzbb zzbbVar) {
        try {
            String hexString = Integer.toHexString(System.identityHashCode(this));
            String str = zzfj.zza;
            StringBuilder sb = new StringBuilder(String.valueOf(hexString).length() + 37 + String.valueOf(str).length() + 1);
            sb.append("Init ");
            sb.append(hexString);
            sb.append(" [AndroidXMedia3/1.9.0-beta01] [");
            sb.append(str);
            sb.append("]");
            zzee.zzb("ExoPlayerImpl", sb.toString());
            this.zzf = zzjfVar.zza.getApplicationContext();
            this.zzs = (zzmx) zzjfVar.zzh.apply(zzjfVar.zzb);
            this.zzW = zzjfVar.zzj;
            this.zzR = zzjfVar.zzk;
            this.zzP = zzjfVar.zzl;
            this.zzT = false;
            this.zzA = zzjfVar.zzq;
            zzjo zzjoVar = new zzjo(this, null);
            this.zzw = zzjoVar;
            this.zzx = new zzkn(null);
            zzml[] zza = ((zzmq) zzjfVar.zzc.zza()).zza(new Handler(zzjfVar.zzi), zzjoVar, zzjoVar, zzjoVar, zzjoVar);
            this.zzh = zza;
            int length = zza.length;
            this.zzi = new zzml[2];
            int i5 = 0;
            while (true) {
                zzml[] zzmlVarArr = this.zzi;
                int length2 = zzmlVarArr.length;
                if (i5 >= 2) {
                    break;
                }
                zzml zzmlVar = this.zzh[i5];
                zzmlVarArr[i5] = null;
                i5++;
            }
            zzaaj zzaajVar = (zzaaj) zzjfVar.zze.zza();
            this.zzj = zzaajVar;
            zzaas zzaasVar = (zzaas) zzjfVar.zzg.zza();
            this.zzu = zzaasVar;
            this.zzr = zzjfVar.zzm;
            this.zzJ = zzjfVar.zzn;
            this.zzI = zzjfVar.zzo;
            Looper looper = zzjfVar.zzi;
            this.zzt = looper;
            zzdn zzdnVar = zzjfVar.zzb;
            this.zzv = zzdnVar;
            this.zzg = zzbbVar;
            this.zzn = new zzed(looper, zzdnVar, new zzdz() { // from class: com.google.android.gms.internal.ads.zzkm
                @Override // com.google.android.gms.internal.ads.zzdz
                public final /* synthetic */ void zza(Object obj, zzs zzsVar) {
                    zzks.this.zzJ((zzaz) obj, zzsVar);
                }
            });
            CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet();
            this.zzo = copyOnWriteArraySet;
            this.zzq = new ArrayList();
            this.zzad = new zzyf(0);
            this.zzK = zzjg.zza;
            int length3 = this.zzh.length;
            zzaak zzaakVar = new zzaak(new zzmo[2], new zzaac[2], zzbn.zza, null);
            this.zzb = zzaakVar;
            this.zzp = new zzbd();
            zzaw zzawVar = new zzaw();
            zzawVar.zzc(1, 2, 3, 13, 14, 15, 16, 17, 18, 19, 31, 20, 30, 21, 35, 22, 24, 27, 28, 32);
            zzaajVar.zzd();
            zzawVar.zzb(29, true);
            zzawVar.zzb(23, false);
            zzawVar.zzb(25, false);
            zzawVar.zzb(33, false);
            zzawVar.zzb(26, false);
            zzawVar.zzb(34, false);
            zzax zze = zzawVar.zze();
            this.zzc = zze;
            zzaw zzawVar2 = new zzaw();
            zzawVar2.zzd(zze);
            zzawVar2.zza(4);
            zzawVar2.zza(10);
            this.zzL = zzawVar2.zze();
            this.zzk = zzdnVar.zzd(looper, null);
            zzld zzldVar = new zzld() { // from class: com.google.android.gms.internal.ads.zzjp
                @Override // com.google.android.gms.internal.ads.zzld
                public final /* synthetic */ void zza(zzlc zzlcVar) {
                    zzks.this.zzK(zzlcVar);
                }
            };
            this.zzl = zzldVar;
            this.zzaa = zzmd.zza(zzaakVar);
            this.zzs.zzx(zzbbVar, looper);
            final zzpq zzpqVar = new zzpq(zzjfVar.zzx);
            zzlf zzlfVar = new zzlf(this.zzf, this.zzh, this.zzi, zzaajVar, zzaakVar, (zzlj) zzjfVar.zzf.zza(), zzaasVar, 0, false, this.zzs, this.zzJ, zzjfVar.zzy, zzjfVar.zzp, false, false, looper, zzdnVar, zzldVar, zzpqVar, null, this.zzK, this.zzx);
            this.zzm = zzlfVar;
            Looper zzn = zzlfVar.zzn();
            this.zzS = 1.0f;
            zzan zzanVar = zzan.zza;
            this.zzM = zzanVar;
            this.zzZ = zzanVar;
            this.zzab = -1;
            int i6 = zzcz.zza;
            this.zzU = true;
            zze(this.zzs);
            zzaasVar.zzf(new Handler(looper), this.zzs);
            copyOnWriteArraySet.add(this.zzw);
            int i7 = Build.VERSION.SDK_INT;
            if (i7 >= 31) {
                final Context context = this.zzf;
                final boolean z4 = zzjfVar.zzv;
                zzdnVar.zzd(zzlfVar.zzn(), null).zzn(new Runnable() { // from class: com.google.android.gms.internal.ads.zzji
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        zzpm zza2 = zzpm.zza(context);
                        if (zza2 == null) {
                            zzee.zzc("ExoPlayerImpl", "MediaMetricsService unavailable.");
                            return;
                        }
                        if (z4) {
                            this.zzD(zza2);
                        }
                        zzpqVar.zzb(zza2.zzb());
                    }
                });
            }
            zzdm zzdmVar = new zzdm(0, zzn, looper, zzdnVar, new zzdl() { // from class: com.google.android.gms.internal.ads.zzka
                @Override // com.google.android.gms.internal.ads.zzdl
                public final /* synthetic */ void zza(Object obj, Object obj2) {
                    int intValue = ((Integer) obj2).intValue();
                    zzks.this.zzL(((Integer) obj).intValue(), intValue);
                }
            });
            this.zzB = zzdmVar;
            zzdmVar.zzc(new Runnable() { // from class: com.google.android.gms.internal.ads.zzkf
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzks.this.zzM();
                }
            });
            new zzbz(zzjfVar.zza, zzn, zzjfVar.zzi, this.zzw, zzdnVar);
            boolean z5 = (zzjfVar.zzs == Integer.MAX_VALUE || zzjfVar.zzt == Integer.MAX_VALUE) ? false : true;
            zzfo zzfoVar = new zzfo(zzjfVar.zza, zzn, zzdnVar);
            this.zzy = zzfoVar;
            zzfoVar.zza(z5);
            this.zzz = new zzfp(zzjfVar.zza, zzn, zzdnVar);
            int i8 = zzm.zza;
            zzbv zzbvVar = zzbv.zza;
            this.zzQ = zzes.zza;
            this.zzD = i7 >= 34 ? new zzkr(this, zzjfVar.zza, null) : null;
            this.zzE = new HashMap();
            this.zzY = zzil.zza;
            this.zzC = new zzfa(this, this.zzw, zzdnVar, zzjfVar.zzr, zzjfVar.zzs, zzjfVar.zzt, zzjfVar.zzu);
            zzlfVar.zzg(this.zzI);
            zzlfVar.zzi(this.zzR, false);
            zzaw(1, 3, this.zzR);
            zzaw(2, 4, Integer.valueOf(this.zzP));
            zzaw(2, 5, 0);
            zzaw(1, 9, Boolean.valueOf(this.zzT));
            zzaw(6, 8, this.zzx);
            zzaw(-1, 16, Integer.valueOf(this.zzW));
            this.zze.zza();
        } catch (Throwable th) {
            this.zze.zza();
            throw th;
        }
    }

    public static /* synthetic */ zzil zzU(zzil zzilVar, List list) {
        zzik zzikVar = new zzik(zzilVar, null);
        HashSet hashSet = new HashSet(list);
        for (String str : zzilVar.zza()) {
            if (!hashSet.contains(str)) {
                zzikVar.zzf(str);
            }
        }
        return zzikVar.zzg();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzah, reason: merged with bridge method [inline-methods] */
    public final void zzP(zziw zziwVar) {
        zzmd zzmdVar = this.zzaa;
        zzmd zzh = zzmdVar.zzh(zzmdVar.zzb);
        zzh.zzq = zzh.zzs;
        zzh.zzr = 0L;
        zzmd zzao = zzao(zzh, 1);
        if (zziwVar != null) {
            zzao = zzao.zzf(zziwVar);
        }
        this.zzF++;
        this.zzm.zzh();
        zzal(zzao, 0, false, 5, -9223372036854775807L, -1, false);
    }

    private final int zzai(zzmd zzmdVar) {
        zzbf zzbfVar = zzmdVar.zza;
        return zzbfVar.zzg() ? this.zzab : zzbfVar.zzo(zzmdVar.zzb.zza, this.zzp).zzc;
    }

    private final long zzaj(zzmd zzmdVar) {
        zzwk zzwkVar = zzmdVar.zzb;
        if (!zzwkVar.zzb()) {
            return zzfj.zzp(zzak(zzmdVar));
        }
        zzbf zzbfVar = zzmdVar.zza;
        zzbfVar.zzo(zzwkVar.zza, this.zzp);
        long j2 = zzmdVar.zzc;
        if (j2 == -9223372036854775807L) {
            long j5 = zzbfVar.zzb(zzai(zzmdVar), this.zza, 0L).zzl;
            return zzfj.zzp(0L);
        }
        return zzfj.zzp(j2) + zzfj.zzp(0L);
    }

    private final long zzak(zzmd zzmdVar) {
        zzbf zzbfVar = zzmdVar.zza;
        if (zzbfVar.zzg()) {
            return zzfj.zzq(this.zzac);
        }
        long j2 = zzmdVar.zzs;
        zzwk zzwkVar = zzmdVar.zzb;
        if (zzwkVar.zzb()) {
            return j2;
        }
        zzaq(zzbfVar, zzwkVar, j2);
        return j2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0473 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:107:0x047d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0487 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:119:0x049a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:123:0x04a6 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:130:0x04be A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:134:0x04cc A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:138:0x04e0  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x043c  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0409  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x03e6  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x03d4  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x02e7  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x02d2  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x02db  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x02f0  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x030a  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x031e  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x032e  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x034c  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0370  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0385  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x039b  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x03be  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x03e1  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0424  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x044b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00e7  */
    /* JADX WARN: Type inference failed for: r15v16 */
    /* JADX WARN: Type inference failed for: r15v6 */
    /* JADX WARN: Type inference failed for: r15v7, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r15v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void zzal(final zzmd zzmdVar, final int i5, boolean z4, int i6, long j2, int i7, boolean z5) {
        int i8;
        int i9;
        final int i10;
        boolean z6;
        Pair pair;
        boolean z7;
        boolean z8;
        int i11;
        boolean booleanValue;
        final zzak zzakVar;
        List list;
        int i12;
        zzbf zzq;
        zzan zzw;
        int i13;
        int i14;
        boolean z9;
        int i15;
        int i16;
        boolean z10;
        zziw zziwVar;
        zziw zziwVar2;
        zzaak zzaakVar;
        zzaak zzaakVar2;
        zzax zzaxVar;
        zzf zzfVar;
        zzbf zzq2;
        zzbb zzbbVar;
        boolean z11;
        zzbf zzq3;
        ?? r15;
        int i17;
        boolean z12;
        zzbf zzq4;
        boolean z13;
        zzbf zzq5;
        boolean z14;
        long j5;
        boolean z15;
        boolean z16;
        int i18;
        zzax zze;
        int i19;
        int i20;
        Object obj;
        zzak zzakVar2;
        Object obj2;
        long j6;
        long zzam;
        Object obj3;
        zzak zzakVar3;
        Object obj4;
        int i21 = i6;
        zzmd zzmdVar2 = this.zzaa;
        this.zzaa = zzmdVar;
        zzbf zzbfVar = zzmdVar2.zza;
        zzbf zzbfVar2 = zzmdVar.zza;
        boolean equals = zzbfVar.equals(zzbfVar2);
        if (zzbfVar2.zzg() && zzbfVar.zzg()) {
            i8 = 3;
            pair = new Pair(Boolean.FALSE, -1);
        } else {
            i8 = 3;
            if (zzbfVar2.zzg() == zzbfVar.zzg()) {
                zzwk zzwkVar = zzmdVar2.zzb;
                Object obj5 = zzwkVar.zza;
                zzbd zzbdVar = this.zzp;
                int i22 = zzbfVar.zzo(obj5, zzbdVar).zzc;
                zzbe zzbeVar = this.zza;
                Object obj6 = zzbfVar.zzb(i22, zzbeVar, 0L).zzb;
                i9 = 0;
                zzwk zzwkVar2 = zzmdVar.zzb;
                if (obj6.equals(zzbfVar2.zzb(zzbfVar2.zzo(zzwkVar2.zza, zzbdVar).zzc, zzbeVar, 0L).zzb)) {
                    if (z4) {
                        if (i21 != 0) {
                            i10 = i21;
                        } else if (zzwkVar.zzd < zzwkVar2.zzd) {
                            pair = new Pair(Boolean.TRUE, 0);
                            i10 = 0;
                            z6 = true;
                        } else {
                            i10 = 0;
                        }
                        z6 = true;
                    } else {
                        i10 = i21;
                        z6 = false;
                    }
                    pair = new Pair(Boolean.FALSE, -1);
                } else {
                    if (!z4) {
                        z7 = false;
                        z8 = false;
                    } else if (i21 == 0) {
                        i21 = 0;
                        z7 = true;
                        i11 = 1;
                        Pair pair2 = new Pair(Boolean.TRUE, Integer.valueOf(i11));
                        boolean z17 = z7;
                        i10 = i21;
                        z6 = z17;
                        pair = pair2;
                    } else {
                        z7 = true;
                        z8 = true;
                    }
                    if (z7 && i21 == 1) {
                        z7 = z8;
                        i11 = 2;
                    } else {
                        if (equals) {
                            throw new IllegalStateException();
                        }
                        i11 = 3;
                    }
                    Pair pair22 = new Pair(Boolean.TRUE, Integer.valueOf(i11));
                    boolean z172 = z7;
                    i10 = i21;
                    z6 = z172;
                    pair = pair22;
                }
                booleanValue = ((Boolean) pair.first).booleanValue();
                final int intValue = ((Integer) pair.second).intValue();
                if (booleanValue) {
                    zzakVar = null;
                } else {
                    zzakVar = !zzbfVar2.zzg() ? zzbfVar2.zzb(zzbfVar2.zzo(zzmdVar.zzb.zza, this.zzp).zzc, this.zza, 0L).zzd : null;
                    this.zzZ = zzan.zza;
                }
                if (!booleanValue || !zzmdVar2.zzj.equals(zzmdVar.zzj)) {
                    zzam zza = this.zzZ.zza();
                    list = zzmdVar.zzj;
                    for (i12 = i9; i12 < list.size(); i12++) {
                        zzap zzapVar = (zzap) list.get(i12);
                        for (int i23 = i9; i23 < zzapVar.zza(); i23++) {
                            zzapVar.zzb(i23).zza(zza);
                        }
                    }
                    this.zzZ = zza.zzw();
                }
                zzq = zzq();
                if (zzq.zzg()) {
                    zzak zzakVar4 = zzq.zzb(zzs(), this.zza, 0L).zzd;
                    zzam zza2 = this.zzZ.zza();
                    zza2.zzv(zzakVar4.zzd);
                    zzw = zza2.zzw();
                } else {
                    zzw = this.zzZ;
                }
                boolean equals2 = zzw.equals(this.zzM);
                this.zzM = zzw;
                int i24 = zzmdVar2.zzl == zzmdVar.zzl ? 1 : i9;
                i13 = zzmdVar2.zze == zzmdVar.zze ? 1 : i9;
                if (i13 == 0 || i24 != 0) {
                    zzau();
                }
                int i25 = zzmdVar2.zzg == zzmdVar.zzg ? 1 : i9;
                if (!equals) {
                    this.zzn.zzd(i9, new zzdy() { // from class: com.google.android.gms.internal.ads.zzki
                        @Override // com.google.android.gms.internal.ads.zzdy
                        public final /* synthetic */ void zza(Object obj7) {
                            int i26 = zzks.zzd;
                            ((zzaz) obj7).zzb(zzmd.this.zza, i5);
                        }
                    });
                }
                if (z6) {
                    i14 = i24;
                    z9 = equals2;
                    i15 = i13;
                    i16 = i25;
                } else {
                    zzbd zzbdVar2 = new zzbd();
                    if (zzbfVar.zzg()) {
                        i14 = i24;
                        z9 = equals2;
                        i19 = i7;
                        i20 = i19;
                        obj = null;
                        zzakVar2 = null;
                        obj2 = null;
                    } else {
                        Object obj7 = zzmdVar2.zzb.zza;
                        zzbfVar.zzo(obj7, zzbdVar2);
                        int i26 = zzbdVar2.zzc;
                        int zze2 = zzbfVar.zze(obj7);
                        zzbe zzbeVar2 = this.zza;
                        i14 = i24;
                        z9 = equals2;
                        obj = zzbfVar.zzb(i26, zzbeVar2, 0L).zzb;
                        zzakVar2 = zzbeVar2.zzd;
                        obj2 = obj7;
                        i19 = i26;
                        i20 = zze2;
                    }
                    if (i10 == 0) {
                        zzwk zzwkVar3 = zzmdVar2.zzb;
                        if (zzwkVar3.zzb()) {
                            j6 = zzbdVar2.zzh(zzwkVar3.zzb, zzwkVar3.zzc);
                            zzam = zzam(zzmdVar2);
                            String str = zzfj.zza;
                            zzwk zzwkVar4 = zzmdVar2.zzb;
                            final zzba zzbaVar = new zzba(obj, i19, zzakVar2, obj2, i20, zzfj.zzp(j6), zzfj.zzp(zzam), zzwkVar4.zzb, zzwkVar4.zzc);
                            int zzs = zzs();
                            int zzr = zzr();
                            if (this.zzaa.zza.zzg()) {
                                zzmd zzmdVar3 = this.zzaa;
                                Object obj8 = zzmdVar3.zzb.zza;
                                zzmdVar3.zza.zzo(obj8, this.zzp);
                                zzr = this.zzaa.zza.zze(obj8);
                                zzbf zzbfVar3 = this.zzaa.zza;
                                zzbe zzbeVar3 = this.zza;
                                i15 = i13;
                                i16 = i25;
                                obj4 = obj8;
                                obj3 = zzbfVar3.zzb(zzs, zzbeVar3, 0L).zzb;
                                zzakVar3 = zzbeVar3.zzd;
                            } else {
                                i15 = i13;
                                i16 = i25;
                                obj3 = null;
                                zzakVar3 = null;
                                obj4 = null;
                            }
                            int i27 = zzr;
                            long zzp = zzfj.zzp(j2);
                            long zzp2 = !this.zzaa.zzb.zzb() ? zzfj.zzp(zzam(this.zzaa)) : zzp;
                            zzwk zzwkVar5 = this.zzaa.zzb;
                            final zzba zzbaVar2 = new zzba(obj3, zzs, zzakVar3, obj4, i27, zzp, zzp2, zzwkVar5.zzb, zzwkVar5.zzc);
                            this.zzn.zzd(11, new zzdy() { // from class: com.google.android.gms.internal.ads.zzkj
                                @Override // com.google.android.gms.internal.ads.zzdy
                                public final /* synthetic */ void zza(Object obj9) {
                                    int i28 = zzks.zzd;
                                    ((zzaz) obj9).zzo(zzbaVar, zzbaVar2, i10);
                                }
                            });
                        } else {
                            j6 = zzwkVar3.zze != -1 ? zzam(this.zzaa) : zzbdVar2.zzd;
                            zzam = j6;
                            String str2 = zzfj.zza;
                            zzwk zzwkVar42 = zzmdVar2.zzb;
                            final zzba zzbaVar3 = new zzba(obj, i19, zzakVar2, obj2, i20, zzfj.zzp(j6), zzfj.zzp(zzam), zzwkVar42.zzb, zzwkVar42.zzc);
                            int zzs2 = zzs();
                            int zzr2 = zzr();
                            if (this.zzaa.zza.zzg()) {
                            }
                            int i272 = zzr2;
                            long zzp3 = zzfj.zzp(j2);
                            if (!this.zzaa.zzb.zzb()) {
                            }
                            zzwk zzwkVar52 = this.zzaa.zzb;
                            final zzba zzbaVar22 = new zzba(obj3, zzs2, zzakVar3, obj4, i272, zzp3, zzp2, zzwkVar52.zzb, zzwkVar52.zzc);
                            this.zzn.zzd(11, new zzdy() { // from class: com.google.android.gms.internal.ads.zzkj
                                @Override // com.google.android.gms.internal.ads.zzdy
                                public final /* synthetic */ void zza(Object obj9) {
                                    int i28 = zzks.zzd;
                                    ((zzaz) obj9).zzo(zzbaVar3, zzbaVar22, i10);
                                }
                            });
                        }
                    } else if (zzmdVar2.zzb.zzb()) {
                        j6 = zzmdVar2.zzs;
                        zzam = zzam(zzmdVar2);
                        String str22 = zzfj.zza;
                        zzwk zzwkVar422 = zzmdVar2.zzb;
                        final zzba zzbaVar32 = new zzba(obj, i19, zzakVar2, obj2, i20, zzfj.zzp(j6), zzfj.zzp(zzam), zzwkVar422.zzb, zzwkVar422.zzc);
                        int zzs22 = zzs();
                        int zzr22 = zzr();
                        if (this.zzaa.zza.zzg()) {
                        }
                        int i2722 = zzr22;
                        long zzp32 = zzfj.zzp(j2);
                        if (!this.zzaa.zzb.zzb()) {
                        }
                        zzwk zzwkVar522 = this.zzaa.zzb;
                        final zzba zzbaVar222 = new zzba(obj3, zzs22, zzakVar3, obj4, i2722, zzp32, zzp2, zzwkVar522.zzb, zzwkVar522.zzc);
                        this.zzn.zzd(11, new zzdy() { // from class: com.google.android.gms.internal.ads.zzkj
                            @Override // com.google.android.gms.internal.ads.zzdy
                            public final /* synthetic */ void zza(Object obj9) {
                                int i28 = zzks.zzd;
                                ((zzaz) obj9).zzo(zzbaVar32, zzbaVar222, i10);
                            }
                        });
                    } else {
                        j6 = zzmdVar2.zzs;
                        zzam = j6;
                        String str222 = zzfj.zza;
                        zzwk zzwkVar4222 = zzmdVar2.zzb;
                        final zzba zzbaVar322 = new zzba(obj, i19, zzakVar2, obj2, i20, zzfj.zzp(j6), zzfj.zzp(zzam), zzwkVar4222.zzb, zzwkVar4222.zzc);
                        int zzs222 = zzs();
                        int zzr222 = zzr();
                        if (this.zzaa.zza.zzg()) {
                        }
                        int i27222 = zzr222;
                        long zzp322 = zzfj.zzp(j2);
                        if (!this.zzaa.zzb.zzb()) {
                        }
                        zzwk zzwkVar5222 = this.zzaa.zzb;
                        final zzba zzbaVar2222 = new zzba(obj3, zzs222, zzakVar3, obj4, i27222, zzp322, zzp2, zzwkVar5222.zzb, zzwkVar5222.zzc);
                        this.zzn.zzd(11, new zzdy() { // from class: com.google.android.gms.internal.ads.zzkj
                            @Override // com.google.android.gms.internal.ads.zzdy
                            public final /* synthetic */ void zza(Object obj9) {
                                int i28 = zzks.zzd;
                                ((zzaz) obj9).zzo(zzbaVar322, zzbaVar2222, i10);
                            }
                        });
                    }
                }
                if (booleanValue) {
                    z10 = true;
                } else {
                    zzed zzedVar = this.zzn;
                    zzdy zzdyVar = new zzdy() { // from class: com.google.android.gms.internal.ads.zzkk
                        @Override // com.google.android.gms.internal.ads.zzdy
                        public final /* synthetic */ void zza(Object obj9) {
                            int i28 = zzks.zzd;
                            ((zzaz) obj9).zzc(zzak.this, intValue);
                        }
                    };
                    z10 = true;
                    zzedVar.zzd(1, zzdyVar);
                }
                zziwVar = zzmdVar2.zzf;
                zziwVar2 = zzmdVar.zzf;
                if (zziwVar != zziwVar2) {
                    zzed zzedVar2 = this.zzn;
                    zzedVar2.zzd(10, new zzdy() { // from class: com.google.android.gms.internal.ads.zzkl
                        @Override // com.google.android.gms.internal.ads.zzdy
                        public final /* synthetic */ void zza(Object obj9) {
                            int i28 = zzks.zzd;
                            ((zzaz) obj9).zzn(zzmd.this.zzf);
                        }
                    });
                    if (zziwVar2 != null) {
                        zzedVar2.zzd(10, new zzdy() { // from class: com.google.android.gms.internal.ads.zzjq
                            @Override // com.google.android.gms.internal.ads.zzdy
                            public final /* synthetic */ void zza(Object obj9) {
                                int i28 = zzks.zzd;
                                ((zzaz) obj9).zzm(zzmd.this.zzf);
                            }
                        });
                    }
                }
                zzaakVar = zzmdVar2.zzi;
                zzaakVar2 = zzmdVar.zzi;
                if (zzaakVar != zzaakVar2) {
                    this.zzj.zzp(zzaakVar2.zze);
                    this.zzn.zzd(2, new zzdy() { // from class: com.google.android.gms.internal.ads.zzjr
                        @Override // com.google.android.gms.internal.ads.zzdy
                        public final /* synthetic */ void zza(Object obj9) {
                            int i28 = zzks.zzd;
                            ((zzaz) obj9).zzd(zzmd.this.zzi.zzd);
                        }
                    });
                }
                if (!z9) {
                    final zzan zzanVar = this.zzM;
                    this.zzn.zzd(14, new zzdy() { // from class: com.google.android.gms.internal.ads.zzjs
                        @Override // com.google.android.gms.internal.ads.zzdy
                        public final /* synthetic */ void zza(Object obj9) {
                            int i28 = zzks.zzd;
                            ((zzaz) obj9).zze(zzan.this);
                        }
                    });
                }
                if (i16 != 0) {
                    this.zzn.zzd(i8, new zzdy() { // from class: com.google.android.gms.internal.ads.zzjt
                        @Override // com.google.android.gms.internal.ads.zzdy
                        public final /* synthetic */ void zza(Object obj9) {
                            int i28 = zzks.zzd;
                            ((zzaz) obj9).zzf(zzmd.this.zzg);
                        }
                    });
                }
                if (i15 == 0 || i14 != 0) {
                    this.zzn.zzd(-1, new zzdy() { // from class: com.google.android.gms.internal.ads.zzju
                        @Override // com.google.android.gms.internal.ads.zzdy
                        public final /* synthetic */ void zza(Object obj9) {
                            int i28 = zzks.zzd;
                            zzmd zzmdVar4 = zzmd.this;
                            ((zzaz) obj9).zzh(zzmdVar4.zzl, zzmdVar4.zze);
                        }
                    });
                }
                if (i15 != 0) {
                    this.zzn.zzd(4, new zzdy() { // from class: com.google.android.gms.internal.ads.zzjv
                        @Override // com.google.android.gms.internal.ads.zzdy
                        public final /* synthetic */ void zza(Object obj9) {
                            int i28 = zzks.zzd;
                            ((zzaz) obj9).zzi(zzmd.this.zze);
                        }
                    });
                }
                if (i14 == 0 || zzmdVar2.zzm != zzmdVar.zzm) {
                    this.zzn.zzd(5, new zzdy() { // from class: com.google.android.gms.internal.ads.zzjw
                        @Override // com.google.android.gms.internal.ads.zzdy
                        public final /* synthetic */ void zza(Object obj9) {
                            int i28 = zzks.zzd;
                            zzmd zzmdVar4 = zzmd.this;
                            ((zzaz) obj9).zzj(zzmdVar4.zzl, zzmdVar4.zzm);
                        }
                    });
                }
                if (zzmdVar2.zzn != zzmdVar.zzn) {
                    this.zzn.zzd(6, new zzdy() { // from class: com.google.android.gms.internal.ads.zzjx
                        @Override // com.google.android.gms.internal.ads.zzdy
                        public final /* synthetic */ void zza(Object obj9) {
                            int i28 = zzks.zzd;
                            ((zzaz) obj9).zzk(zzmd.this.zzn);
                        }
                    });
                }
                if (zzmdVar2.zzj() != zzmdVar.zzj()) {
                    this.zzn.zzd(7, new zzdy() { // from class: com.google.android.gms.internal.ads.zzjy
                        @Override // com.google.android.gms.internal.ads.zzdy
                        public final /* synthetic */ void zza(Object obj9) {
                            int i28 = zzks.zzd;
                            ((zzaz) obj9).zzl(zzmd.this.zzj());
                        }
                    });
                }
                if (!zzmdVar2.zzo.equals(zzmdVar.zzo)) {
                    this.zzn.zzd(12, new zzdy() { // from class: com.google.android.gms.internal.ads.zzjz
                        @Override // com.google.android.gms.internal.ads.zzdy
                        public final /* synthetic */ void zza(Object obj9) {
                            int i28 = zzks.zzd;
                            ((zzaz) obj9).zzp(zzmd.this.zzo);
                        }
                    });
                }
                zzaxVar = this.zzL;
                zzbb zzbbVar2 = this.zzg;
                zzax zzaxVar2 = this.zzc;
                String str3 = zzfj.zza;
                boolean zzx = zzbbVar2.zzx();
                zzfVar = (zzf) zzbbVar2;
                zzq2 = zzfVar.zzq();
                if (zzq2.zzg()) {
                    zzbbVar = zzbbVar2;
                    if (zzq2.zzb(zzfVar.zzs(), zzfVar.zza, 0L).zzh) {
                        z11 = z10;
                        zzq3 = zzfVar.zzq();
                        if (zzq3.zzg()) {
                            i17 = -1;
                            r15 = 0;
                            z12 = false;
                        } else {
                            int zzs3 = zzfVar.zzs();
                            zzfVar.zzl();
                            zzfVar.zzm();
                            r15 = 0;
                            r15 = 0;
                            int zzi = zzq3.zzi(zzs3, 0, false);
                            i17 = -1;
                            z12 = zzi != -1 ? z10 : false;
                        }
                        zzq4 = zzfVar.zzq();
                        if (!zzq4.zzg()) {
                            int zzs4 = zzfVar.zzs();
                            zzfVar.zzl();
                            zzfVar.zzm();
                            if (zzq4.zzh(zzs4, r15, r15) != i17) {
                                z13 = z10;
                                zzq5 = zzfVar.zzq();
                                if (zzq5.zzg()) {
                                    z14 = zzx;
                                    j5 = 0;
                                    if (zzq5.zzb(zzfVar.zzs(), zzfVar.zza, 0L).zzb()) {
                                        z15 = true;
                                        zzbf zzq6 = zzfVar.zzq();
                                        boolean z18 = (zzq6.zzg() && zzq6.zzb(zzfVar.zzs(), zzfVar.zza, j5).zzi) ? true : r15;
                                        boolean zzg = zzbbVar.zzq().zzg();
                                        zzaw zzawVar = new zzaw();
                                        zzawVar.zzd(zzaxVar2);
                                        boolean z19 = !z14;
                                        zzawVar.zzb(4, z19);
                                        zzawVar.zzb(5, (z11 || z14) ? r15 : true);
                                        zzawVar.zzb(6, (z12 || z14) ? r15 : true);
                                        zzawVar.zzb(7, (!zzg || !(z12 || !z15 || z11) || z14) ? r15 : true);
                                        zzawVar.zzb(8, (z13 || z14) ? r15 : true);
                                        zzawVar.zzb(9, (!zzg || !(z13 || (z15 && z18)) || z14) ? r15 : true);
                                        zzawVar.zzb(10, z19);
                                        if (z11 || z14) {
                                            z16 = r15;
                                            i18 = 11;
                                        } else {
                                            i18 = 11;
                                            z16 = true;
                                        }
                                        zzawVar.zzb(i18, z16);
                                        zzawVar.zzb(12, (z11 || z14) ? r15 : true);
                                        zze = zzawVar.zze();
                                        this.zzL = zze;
                                        if (!zze.equals(zzaxVar)) {
                                            this.zzn.zzd(13, new zzdy() { // from class: com.google.android.gms.internal.ads.zzkb
                                                @Override // com.google.android.gms.internal.ads.zzdy
                                                public final /* synthetic */ void zza(Object obj9) {
                                                    zzks.this.zzN((zzaz) obj9);
                                                }
                                            });
                                        }
                                        this.zzn.zze();
                                    }
                                } else {
                                    z14 = zzx;
                                    j5 = 0;
                                }
                                z15 = r15;
                                zzbf zzq62 = zzfVar.zzq();
                                if (zzq62.zzg()) {
                                }
                                boolean zzg2 = zzbbVar.zzq().zzg();
                                zzaw zzawVar2 = new zzaw();
                                zzawVar2.zzd(zzaxVar2);
                                boolean z192 = !z14;
                                zzawVar2.zzb(4, z192);
                                zzawVar2.zzb(5, (z11 || z14) ? r15 : true);
                                zzawVar2.zzb(6, (z12 || z14) ? r15 : true);
                                zzawVar2.zzb(7, (!zzg2 || !(z12 || !z15 || z11) || z14) ? r15 : true);
                                zzawVar2.zzb(8, (z13 || z14) ? r15 : true);
                                zzawVar2.zzb(9, (!zzg2 || !(z13 || (z15 && z18)) || z14) ? r15 : true);
                                zzawVar2.zzb(10, z192);
                                if (z11) {
                                }
                                z16 = r15;
                                i18 = 11;
                                zzawVar2.zzb(i18, z16);
                                zzawVar2.zzb(12, (z11 || z14) ? r15 : true);
                                zze = zzawVar2.zze();
                                this.zzL = zze;
                                if (!zze.equals(zzaxVar)) {
                                }
                                this.zzn.zze();
                            }
                        }
                        z13 = r15;
                        zzq5 = zzfVar.zzq();
                        if (zzq5.zzg()) {
                        }
                        z15 = r15;
                        zzbf zzq622 = zzfVar.zzq();
                        if (zzq622.zzg()) {
                        }
                        boolean zzg22 = zzbbVar.zzq().zzg();
                        zzaw zzawVar22 = new zzaw();
                        zzawVar22.zzd(zzaxVar2);
                        boolean z1922 = !z14;
                        zzawVar22.zzb(4, z1922);
                        zzawVar22.zzb(5, (z11 || z14) ? r15 : true);
                        zzawVar22.zzb(6, (z12 || z14) ? r15 : true);
                        zzawVar22.zzb(7, (!zzg22 || !(z12 || !z15 || z11) || z14) ? r15 : true);
                        zzawVar22.zzb(8, (z13 || z14) ? r15 : true);
                        zzawVar22.zzb(9, (!zzg22 || !(z13 || (z15 && z18)) || z14) ? r15 : true);
                        zzawVar22.zzb(10, z1922);
                        if (z11) {
                        }
                        z16 = r15;
                        i18 = 11;
                        zzawVar22.zzb(i18, z16);
                        zzawVar22.zzb(12, (z11 || z14) ? r15 : true);
                        zze = zzawVar22.zze();
                        this.zzL = zze;
                        if (!zze.equals(zzaxVar)) {
                        }
                        this.zzn.zze();
                    }
                } else {
                    zzbbVar = zzbbVar2;
                }
                z11 = false;
                zzq3 = zzfVar.zzq();
                if (zzq3.zzg()) {
                }
                zzq4 = zzfVar.zzq();
                if (!zzq4.zzg()) {
                }
                z13 = r15;
                zzq5 = zzfVar.zzq();
                if (zzq5.zzg()) {
                }
                z15 = r15;
                zzbf zzq6222 = zzfVar.zzq();
                if (zzq6222.zzg()) {
                }
                boolean zzg222 = zzbbVar.zzq().zzg();
                zzaw zzawVar222 = new zzaw();
                zzawVar222.zzd(zzaxVar2);
                boolean z19222 = !z14;
                zzawVar222.zzb(4, z19222);
                zzawVar222.zzb(5, (z11 || z14) ? r15 : true);
                zzawVar222.zzb(6, (z12 || z14) ? r15 : true);
                zzawVar222.zzb(7, (!zzg222 || !(z12 || !z15 || z11) || z14) ? r15 : true);
                zzawVar222.zzb(8, (z13 || z14) ? r15 : true);
                zzawVar222.zzb(9, (!zzg222 || !(z13 || (z15 && z18)) || z14) ? r15 : true);
                zzawVar222.zzb(10, z19222);
                if (z11) {
                }
                z16 = r15;
                i18 = 11;
                zzawVar222.zzb(i18, z16);
                zzawVar222.zzb(12, (z11 || z14) ? r15 : true);
                zze = zzawVar222.zze();
                this.zzL = zze;
                if (!zze.equals(zzaxVar)) {
                }
                this.zzn.zze();
            }
            pair = new Pair(Boolean.TRUE, 3);
        }
        i10 = i21;
        i9 = 0;
        z6 = z4;
        booleanValue = ((Boolean) pair.first).booleanValue();
        final int intValue2 = ((Integer) pair.second).intValue();
        if (booleanValue) {
        }
        if (!booleanValue) {
        }
        zzam zza3 = this.zzZ.zza();
        list = zzmdVar.zzj;
        while (i12 < list.size()) {
        }
        this.zzZ = zza3.zzw();
        zzq = zzq();
        if (zzq.zzg()) {
        }
        boolean equals22 = zzw.equals(this.zzM);
        this.zzM = zzw;
        if (zzmdVar2.zzl == zzmdVar.zzl) {
        }
        if (zzmdVar2.zze == zzmdVar.zze) {
        }
        if (i13 == 0) {
        }
        zzau();
        if (zzmdVar2.zzg == zzmdVar.zzg) {
        }
        if (!equals) {
        }
        if (z6) {
        }
        if (booleanValue) {
        }
        zziwVar = zzmdVar2.zzf;
        zziwVar2 = zzmdVar.zzf;
        if (zziwVar != zziwVar2) {
        }
        zzaakVar = zzmdVar2.zzi;
        zzaakVar2 = zzmdVar.zzi;
        if (zzaakVar != zzaakVar2) {
        }
        if (!z9) {
        }
        if (i16 != 0) {
        }
        if (i15 == 0) {
        }
        this.zzn.zzd(-1, new zzdy() { // from class: com.google.android.gms.internal.ads.zzju
            @Override // com.google.android.gms.internal.ads.zzdy
            public final /* synthetic */ void zza(Object obj9) {
                int i28 = zzks.zzd;
                zzmd zzmdVar4 = zzmd.this;
                ((zzaz) obj9).zzh(zzmdVar4.zzl, zzmdVar4.zze);
            }
        });
        if (i15 != 0) {
        }
        if (i14 == 0) {
        }
        this.zzn.zzd(5, new zzdy() { // from class: com.google.android.gms.internal.ads.zzjw
            @Override // com.google.android.gms.internal.ads.zzdy
            public final /* synthetic */ void zza(Object obj9) {
                int i28 = zzks.zzd;
                zzmd zzmdVar4 = zzmd.this;
                ((zzaz) obj9).zzj(zzmdVar4.zzl, zzmdVar4.zzm);
            }
        });
        if (zzmdVar2.zzn != zzmdVar.zzn) {
        }
        if (zzmdVar2.zzj() != zzmdVar.zzj()) {
        }
        if (!zzmdVar2.zzo.equals(zzmdVar.zzo)) {
        }
        zzaxVar = this.zzL;
        zzbb zzbbVar22 = this.zzg;
        zzax zzaxVar22 = this.zzc;
        String str32 = zzfj.zza;
        boolean zzx2 = zzbbVar22.zzx();
        zzfVar = (zzf) zzbbVar22;
        zzq2 = zzfVar.zzq();
        if (zzq2.zzg()) {
        }
        z11 = false;
        zzq3 = zzfVar.zzq();
        if (zzq3.zzg()) {
        }
        zzq4 = zzfVar.zzq();
        if (!zzq4.zzg()) {
        }
        z13 = r15;
        zzq5 = zzfVar.zzq();
        if (zzq5.zzg()) {
        }
        z15 = r15;
        zzbf zzq62222 = zzfVar.zzq();
        if (zzq62222.zzg()) {
        }
        boolean zzg2222 = zzbbVar.zzq().zzg();
        zzaw zzawVar2222 = new zzaw();
        zzawVar2222.zzd(zzaxVar22);
        boolean z192222 = !z14;
        zzawVar2222.zzb(4, z192222);
        zzawVar2222.zzb(5, (z11 || z14) ? r15 : true);
        zzawVar2222.zzb(6, (z12 || z14) ? r15 : true);
        zzawVar2222.zzb(7, (!zzg2222 || !(z12 || !z15 || z11) || z14) ? r15 : true);
        zzawVar2222.zzb(8, (z13 || z14) ? r15 : true);
        zzawVar2222.zzb(9, (!zzg2222 || !(z13 || (z15 && z18)) || z14) ? r15 : true);
        zzawVar2222.zzb(10, z192222);
        if (z11) {
        }
        z16 = r15;
        i18 = 11;
        zzawVar2222.zzb(i18, z16);
        zzawVar2222.zzb(12, (z11 || z14) ? r15 : true);
        zze = zzawVar2222.zze();
        this.zzL = zze;
        if (!zze.equals(zzaxVar)) {
        }
        this.zzn.zze();
    }

    private static long zzam(zzmd zzmdVar) {
        zzbe zzbeVar = new zzbe();
        zzbd zzbdVar = new zzbd();
        zzbf zzbfVar = zzmdVar.zza;
        zzbfVar.zzo(zzmdVar.zzb.zza, zzbdVar);
        long j2 = zzmdVar.zzc;
        if (j2 != -9223372036854775807L) {
            return j2;
        }
        long j5 = zzbfVar.zzb(zzbdVar.zzc, zzbeVar, 0L).zzl;
        return 0L;
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x013f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final zzmd zzan(zzmd zzmdVar, zzbf zzbfVar, Pair pair) {
        boolean z4;
        zzgrc.zza(zzbfVar.zzg() || pair != null);
        zzbf zzbfVar2 = zzmdVar.zza;
        long zzaj = zzaj(zzmdVar);
        zzmd zzd2 = zzmdVar.zzd(zzbfVar);
        if (zzbfVar.zzg()) {
            zzwk zzb = zzmd.zzb();
            long zzq = zzfj.zzq(this.zzac);
            zzmd zzh = zzd2.zzc(zzb, zzq, zzq, zzq, 0L, zzyn.zza, this.zzb, zzguf.zzi()).zzh(zzb);
            zzh.zzq = zzh.zzs;
            return zzh;
        }
        zzwk zzwkVar = zzd2.zzb;
        Object obj = zzwkVar.zza;
        String str = zzfj.zza;
        boolean equals = obj.equals(pair.first);
        zzwk zzwkVar2 = !equals ? new zzwk(pair.first, -1L) : zzwkVar;
        long longValue = ((Long) pair.second).longValue();
        long zzq2 = zzfj.zzq(zzaj);
        if (!zzbfVar2.zzg()) {
            zzbd zzbdVar = this.zzp;
            zzbfVar2.zzo(obj, zzbdVar);
            if (equals && zzq2 - longValue == 1) {
                zzbd zzo = zzbfVar2.zzo(obj, zzbdVar);
                z4 = true;
                if (zzq2 == zzo.zzd) {
                    zzq2--;
                }
                if (equals || longValue < zzq2) {
                    zzgrc.zzi(zzwkVar2.zzb() ^ z4);
                    zzwk zzwkVar3 = zzwkVar2;
                    zzmd zzh2 = zzd2.zzc(zzwkVar3, longValue, longValue, longValue, 0L, equals ? zzyn.zza : zzd2.zzh, equals ? this.zzb : zzd2.zzi, equals ? zzguf.zzi() : zzd2.zzj).zzh(zzwkVar3);
                    zzh2.zzq = longValue;
                    return zzh2;
                }
                if (longValue != zzq2) {
                    zzgrc.zzi(zzwkVar2.zzb() ^ z4);
                    long max = Math.max(0L, zzd2.zzr - (longValue - zzq2));
                    long j2 = zzd2.zzq;
                    if (zzd2.zzk.equals(zzwkVar)) {
                        j2 = longValue + max;
                    }
                    zzmd zzc = zzd2.zzc(zzwkVar2, longValue, longValue, longValue, max, zzd2.zzh, zzd2.zzi, zzd2.zzj);
                    zzc.zzq = j2;
                    return zzc;
                }
                int zze = zzbfVar.zze(zzd2.zzk.zza);
                if (zze != -1) {
                    zzbd zzbdVar2 = this.zzp;
                    if (zzbfVar.zzd(zze, zzbdVar2, false).zzc == zzbfVar.zzo(zzwkVar2.zza, zzbdVar2).zzc) {
                        return zzd2;
                    }
                }
                Object obj2 = zzwkVar2.zza;
                zzbd zzbdVar3 = this.zzp;
                zzbfVar.zzo(obj2, zzbdVar3);
                long zzh3 = zzwkVar2.zzb() ? zzbdVar3.zzh(zzwkVar2.zzb, zzwkVar2.zzc) : zzbdVar3.zzd;
                zzwk zzwkVar4 = zzwkVar2;
                zzmd zzh4 = zzd2.zzc(zzwkVar4, zzd2.zzs, zzd2.zzs, zzd2.zzd, zzh3 - zzd2.zzs, zzd2.zzh, zzd2.zzi, zzd2.zzj).zzh(zzwkVar4);
                zzh4.zzq = zzh3;
                return zzh4;
            }
        }
        z4 = true;
        if (equals) {
        }
        zzgrc.zzi(zzwkVar2.zzb() ^ z4);
        zzwk zzwkVar32 = zzwkVar2;
        zzmd zzh22 = zzd2.zzc(zzwkVar32, longValue, longValue, longValue, 0L, equals ? zzyn.zza : zzd2.zzh, equals ? this.zzb : zzd2.zzi, equals ? zzguf.zzi() : zzd2.zzj).zzh(zzwkVar32);
        zzh22.zzq = longValue;
        return zzh22;
    }

    private static zzmd zzao(zzmd zzmdVar, int i5) {
        zzmd zze = zzmdVar.zze(i5);
        return (i5 == 1 || i5 == 4) ? zze.zzg(false) : zze;
    }

    private final Pair zzap(zzbf zzbfVar, int i5, long j2) {
        if (zzbfVar.zzg()) {
            this.zzab = i5;
            if (j2 == -9223372036854775807L) {
                j2 = 0;
            }
            this.zzac = j2;
            return null;
        }
        if (i5 == -1 || i5 >= zzbfVar.zza()) {
            i5 = zzbfVar.zzk(false);
            long j5 = zzbfVar.zzb(i5, this.zza, 0L).zzl;
            j2 = zzfj.zzp(0L);
        }
        return zzbfVar.zzm(this.zza, this.zzp, i5, zzfj.zzq(j2));
    }

    private final long zzaq(zzbf zzbfVar, zzwk zzwkVar, long j2) {
        zzbfVar.zzo(zzwkVar.zza, this.zzp);
        return j2;
    }

    private final zzmh zzar(zzmg zzmgVar) {
        int zzai = zzai(this.zzaa);
        zzbf zzbfVar = this.zzaa.zza;
        if (zzai == -1) {
            zzai = 0;
        }
        zzdn zzdnVar = this.zzv;
        zzlf zzlfVar = this.zzm;
        return new zzmh(zzlfVar, zzmgVar, zzbfVar, zzai, zzdnVar, zzlfVar.zzn());
    }

    private final void zzas(Object obj) {
        Object obj2 = this.zzN;
        boolean z4 = false;
        if (obj2 != null && obj2 != obj) {
            z4 = true;
        }
        boolean zzl = this.zzm.zzl(obj, z4 ? this.zzA : -9223372036854775807L);
        if (z4) {
            Object obj3 = this.zzN;
            Surface surface = this.zzO;
            if (obj3 == surface) {
                surface.release();
                this.zzO = null;
            }
        }
        this.zzN = obj;
        if (zzl) {
            return;
        }
        zzP(zziw.zzc(new zzlg(3), 1003));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzat, reason: merged with bridge method [inline-methods] */
    public final void zzS(final int i5, final int i6) {
        if (i5 == this.zzQ.zza() && i6 == this.zzQ.zzb()) {
            return;
        }
        this.zzQ = new zzes(i5, i6);
        zzed zzedVar = this.zzn;
        zzedVar.zzd(24, new zzdy() { // from class: com.google.android.gms.internal.ads.zzkc
            @Override // com.google.android.gms.internal.ads.zzdy
            public final /* synthetic */ void zza(Object obj) {
                int i7 = zzks.zzd;
                ((zzaz) obj).zzu(i5, i6);
            }
        });
        zzedVar.zze();
        zzaw(2, 14, new zzes(i5, i6));
    }

    private final void zzau() {
        int zzh = zzh();
        if (zzh != 2 && zzh != 3) {
            this.zzy.zzb(false);
            this.zzz.zza(false);
        } else {
            zzav();
            boolean z4 = this.zzaa.zzp;
            this.zzy.zzb(zzk());
            this.zzz.zza(zzk());
        }
    }

    private final void zzav() {
        this.zze.zzd();
        Looper looper = this.zzt;
        if (Thread.currentThread() != looper.getThread()) {
            String name = Thread.currentThread().getName();
            String name2 = looper.getThread().getName();
            String str = zzfj.zza;
            Locale locale = Locale.US;
            String str2 = "Player is accessed on the wrong thread.\nCurrent thread: '" + name + "'\nExpected thread: '" + name2 + "'\nSee https://developer.android.com/guide/topics/media/issues/player-accessed-on-wrong-thread";
            if (this.zzU) {
                throw new IllegalStateException(str2);
            }
            zzee.zzd("ExoPlayerImpl", str2, this.zzV ? null : new IllegalStateException());
            this.zzV = true;
        }
    }

    private final void zzaw(int i5, int i6, Object obj) {
        zzml[] zzmlVarArr = this.zzh;
        int length = zzmlVarArr.length;
        for (int i7 = 0; i7 < 2; i7++) {
            zzml zzmlVar = zzmlVarArr[i7];
            if (i5 == -1 || zzmlVar.zza() == i5) {
                zzmh zzar = zzar(zzmlVar);
                zzar.zzb(i6);
                zzar.zzd(obj);
                zzar.zzg();
            }
        }
        zzml[] zzmlVarArr2 = this.zzi;
        int length2 = zzmlVarArr2.length;
        for (int i8 = 0; i8 < 2; i8++) {
            zzml zzmlVar2 = zzmlVarArr2[i8];
            if (zzmlVar2 != null && (i5 == -1 || zzmlVar2.zza() == i5)) {
                zzmh zzar2 = zzar(zzmlVar2);
                zzar2.zzb(i6);
                zzar2.zzd(obj);
                zzar2.zzg();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final long zzA() {
        zzav();
        return zzaj(this.zzaa);
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final void zzB(float f5) {
        zzav();
        String str = zzfj.zza;
        final float max = Math.max(0.0f, Math.min(f5, 1.0f));
        if (this.zzS == max) {
            return;
        }
        this.zzS = max;
        this.zzm.zzj(max);
        zzed zzedVar = this.zzn;
        zzedVar.zzd(22, new zzdy() { // from class: com.google.android.gms.internal.ads.zzkh
            @Override // com.google.android.gms.internal.ads.zzdy
            public final /* synthetic */ void zza(Object obj) {
                int i5 = zzks.zzd;
                ((zzaz) obj).zzr(max);
            }
        });
        zzedVar.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final void zzC(Surface surface) {
        zzav();
        zzas(surface);
        int i5 = surface == null ? 0 : -1;
        zzS(i5, i5);
    }

    @Override // com.google.android.gms.internal.ads.zzjh
    public final void zzD(zzna zznaVar) {
        this.zzs.zzv(zznaVar);
    }

    @Override // com.google.android.gms.internal.ads.zzjh
    public final void zzE(zzna zznaVar) {
        zzav();
        this.zzs.zzw(zznaVar);
    }

    @Override // com.google.android.gms.internal.ads.zzjh
    public final int zzF() {
        zzav();
        int length = this.zzh.length;
        return 2;
    }

    @Override // com.google.android.gms.internal.ads.zzjh
    public final void zzG(zzwm zzwmVar) {
        zzav();
        List singletonList = Collections.singletonList(zzwmVar);
        zzav();
        zzav();
        zzai(this.zzaa);
        zzu();
        this.zzF++;
        List list = this.zzq;
        list.clear();
        ArrayList arrayList = new ArrayList();
        for (int i5 = 0; i5 < singletonList.size(); i5++) {
            zzlz zzlzVar = new zzlz((zzwm) singletonList.get(i5), this.zzr);
            arrayList.add(zzlzVar);
            list.add(i5, new zzko(zzlzVar.zzb, zzlzVar.zza));
        }
        this.zzad = this.zzad.zzg().zzf(0, arrayList.size());
        zzmj zzmjVar = new zzmj(list, this.zzad);
        if (!zzmjVar.zzg() && zzmjVar.zza() < 0) {
            throw new zzw(zzmjVar, -1, -9223372036854775807L);
        }
        int zzk = zzmjVar.zzk(false);
        zzmd zzan = zzan(this.zzaa, zzmjVar, zzap(zzmjVar, zzk, -9223372036854775807L));
        int i6 = zzan.zze;
        if (i6 == 1) {
            i6 = 1;
        } else {
            if (!zzmjVar.zzg()) {
                if (zzk != -1) {
                    if (zzk < zzmjVar.zza()) {
                        i6 = 2;
                    }
                }
            }
            i6 = 4;
        }
        zzmd zzao = zzao(zzan, i6);
        this.zzm.zzy(arrayList, zzk, zzfj.zzq(-9223372036854775807L), this.zzad);
        zzal(zzao, 0, (this.zzaa.zzb.zza.equals(zzao.zzb.zza) || this.zzaa.zza.zzg()) ? false : true, 4, zzak(zzao), -1, false);
    }

    @Override // com.google.android.gms.internal.ads.zzjh
    public final void zzH() {
        String hexString = Integer.toHexString(System.identityHashCode(this));
        String str = zzfj.zza;
        String zza = zzal.zza();
        int length = String.valueOf(hexString).length();
        StringBuilder sb = new StringBuilder(length + 40 + String.valueOf(str).length() + 3 + String.valueOf(zza).length() + 1);
        s.c.e(sb, "Release ", hexString, " [AndroidXMedia3/1.9.0-beta01] [", str);
        sb.append("] [");
        sb.append(zza);
        sb.append("]");
        zzee.zzb("ExoPlayerImpl", sb.toString());
        zzav();
        this.zzy.zzb(false);
        this.zzz.zza(false);
        zzkr zzkrVar = this.zzD;
        if (zzkrVar != null && Build.VERSION.SDK_INT >= 34) {
            zzkrVar.zza();
        }
        this.zzC.zza();
        if (!this.zzm.zzm()) {
            zzed zzedVar = this.zzn;
            zzedVar.zzd(10, zzkg.zza);
            zzedVar.zze();
        }
        this.zzn.zzf();
        this.zzk.zzm(null);
        zzaas zzaasVar = this.zzu;
        zzmx zzmxVar = this.zzs;
        zzaasVar.zzg(zzmxVar);
        zzmd zzmdVar = this.zzaa;
        boolean z4 = zzmdVar.zzp;
        zzmd zzao = zzao(zzmdVar, 1);
        this.zzaa = zzao;
        zzmd zzh = zzao.zzh(zzao.zzb);
        this.zzaa = zzh;
        zzh.zzq = zzh.zzs;
        this.zzaa.zzr = 0L;
        zzmxVar.zzy();
        Surface surface = this.zzO;
        if (surface != null) {
            surface.release();
            this.zzO = null;
        }
        int i5 = zzcz.zza;
        this.zzX = true;
    }

    public final zziw zzI() {
        zzav();
        return this.zzaa.zzf;
    }

    public final /* synthetic */ void zzJ(zzaz zzazVar, zzs zzsVar) {
        zzazVar.zza(this.zzg, new zzay(zzsVar));
    }

    public final /* synthetic */ void zzK(final zzlc zzlcVar) {
        this.zzk.zzn(new Runnable() { // from class: com.google.android.gms.internal.ads.zzke
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzks.this.zzO(zzlcVar);
            }
        });
    }

    public final /* synthetic */ void zzL(int i5, final int i6) {
        zzav();
        Integer valueOf = Integer.valueOf(i6);
        zzaw(1, 10, valueOf);
        zzaw(2, 10, valueOf);
        zzdy zzdyVar = new zzdy() { // from class: com.google.android.gms.internal.ads.zzkd
            @Override // com.google.android.gms.internal.ads.zzdy
            public final /* synthetic */ void zza(Object obj) {
                int i7 = zzks.zzd;
                ((zzaz) obj).zzq(i6);
            }
        };
        zzed zzedVar = this.zzn;
        zzedVar.zzd(21, zzdyVar);
        zzedVar.zze();
    }

    public final /* synthetic */ void zzM() {
        String str = zzfj.zza;
        int generateAudioSessionId = zzcj.zza(this.zzf).generateAudioSessionId();
        if (generateAudioSessionId == -1) {
            generateAudioSessionId = 0;
        }
        this.zzB.zzb(Integer.valueOf(generateAudioSessionId));
    }

    public final /* synthetic */ void zzN(zzaz zzazVar) {
        zzazVar.zzg(this.zzL);
    }

    public final /* synthetic */ void zzO(zzlc zzlcVar) {
        int i5;
        long j2;
        boolean z4;
        int i6 = this.zzF - zzlcVar.zzb;
        this.zzF = i6;
        boolean z5 = true;
        if (zzlcVar.zzc) {
            this.zzG = zzlcVar.zzd;
            this.zzH = true;
        }
        if (i6 == 0) {
            zzbf zzbfVar = zzlcVar.zza.zza;
            int i7 = -1;
            if (!this.zzaa.zza.zzg() && zzbfVar.zzg()) {
                this.zzab = -1;
                this.zzac = 0L;
            }
            if (!zzbfVar.zzg()) {
                List zzw = ((zzmj) zzbfVar).zzw();
                int size = zzw.size();
                List list = this.zzq;
                zzgrc.zzi(size == list.size());
                for (int i8 = 0; i8 < zzw.size(); i8++) {
                    ((zzko) list.get(i8)).zzc((zzbf) zzw.get(i8));
                }
            }
            long j5 = -9223372036854775807L;
            if (this.zzH) {
                boolean z6 = zzlcVar.zza.zza.zzg() && this.zzaa.zza.zzg();
                boolean equals = zzlcVar.zza.zzb.equals(this.zzaa.zzb);
                long j6 = zzlcVar.zza.zzd;
                long j7 = this.zzaa.zzs;
                if (z6 || (equals && j6 == j7)) {
                    z5 = false;
                }
                if (z5) {
                    i7 = zzs();
                    if (zzbfVar.zzg() || zzlcVar.zza.zzb.zzb()) {
                        j5 = zzlcVar.zza.zzd;
                    } else {
                        zzmd zzmdVar = zzlcVar.zza;
                        zzwk zzwkVar = zzmdVar.zzb;
                        long j8 = zzmdVar.zzd;
                        zzaq(zzbfVar, zzwkVar, j8);
                        j5 = j8;
                    }
                }
                z4 = z5;
                long j9 = j5;
                i5 = i7;
                j2 = j9;
            } else {
                i5 = -1;
                j2 = -9223372036854775807L;
                z4 = false;
            }
            this.zzH = false;
            zzal(zzlcVar.zza, 1, z4, this.zzG, j2, i5, false);
        }
    }

    public final /* synthetic */ void zzQ(SurfaceTexture surfaceTexture) {
        Surface surface = new Surface(surfaceTexture);
        zzas(surface);
        this.zzO = surface;
    }

    public final /* synthetic */ void zzR(Object obj) {
        zzas(null);
    }

    public final /* synthetic */ void zzT(int i5, int i6, Object obj) {
        zzaw(1, 19, obj);
    }

    public final /* synthetic */ zzed zzV() {
        return this.zzn;
    }

    public final /* synthetic */ zzmx zzW() {
        return this.zzs;
    }

    public final /* synthetic */ Looper zzX() {
        return this.zzt;
    }

    public final /* synthetic */ zzdn zzY() {
        return this.zzv;
    }

    public final /* synthetic */ zzdm zzZ() {
        return this.zzB;
    }

    public final /* synthetic */ Map zzaa() {
        return this.zzE;
    }

    public final /* synthetic */ Object zzab() {
        return this.zzN;
    }

    public final /* synthetic */ boolean zzac() {
        return this.zzT;
    }

    public final /* synthetic */ void zzad(boolean z4) {
        this.zzT = z4;
    }

    public final /* synthetic */ boolean zzae() {
        return this.zzX;
    }

    public final /* synthetic */ zzil zzaf() {
        return this.zzY;
    }

    public final /* synthetic */ void zzag(zzil zzilVar) {
        this.zzY = zzilVar;
    }

    @Override // com.google.android.gms.internal.ads.zzf
    public final void zzc(int i5, long j2, int i6, boolean z4) {
        zzav();
        if (i5 == -1) {
            return;
        }
        zzgrc.zza(i5 >= 0);
        zzbf zzbfVar = this.zzaa.zza;
        if (zzbfVar.zzg() || i5 < zzbfVar.zza()) {
            this.zzs.zzA();
            this.zzF++;
            if (zzx()) {
                zzee.zzc("ExoPlayerImpl", "seekTo ignored because an ad is playing");
                zzlc zzlcVar = new zzlc(this.zzaa);
                zzlcVar.zza(1);
                this.zzl.zza(zzlcVar);
                return;
            }
            zzmd zzmdVar = this.zzaa;
            int i7 = zzmdVar.zze;
            if (i7 == 3 || (i7 == 4 && !zzbfVar.zzg())) {
                zzmdVar = zzao(this.zzaa, 2);
            }
            int zzs = zzs();
            zzmd zzan = zzan(zzmdVar, zzbfVar, zzap(zzbfVar, i5, j2));
            this.zzm.zzf(zzbfVar, i5, zzfj.zzq(j2));
            zzal(zzan, 0, true, 1, zzak(zzan), zzs, false);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final Looper zzd() {
        return this.zzt;
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final void zze(zzaz zzazVar) {
        zzazVar.getClass();
        this.zzn.zzb(zzazVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final void zzf(zzaz zzazVar) {
        zzav();
        zzazVar.getClass();
        this.zzn.zzc(zzazVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final void zzg() {
        zzav();
        zzmd zzmdVar = this.zzaa;
        if (zzmdVar.zze != 1) {
            return;
        }
        zzmd zzf = zzmdVar.zzf(null);
        zzmd zzao = zzao(zzf, true != zzf.zza.zzg() ? 2 : 4);
        this.zzF++;
        this.zzm.zzd();
        zzal(zzao, 1, false, 5, -9223372036854775807L, -1, false);
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final int zzh() {
        zzav();
        return this.zzaa.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final int zzi() {
        zzav();
        return this.zzaa.zzn;
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final void zzj(boolean z4) {
        zzav();
        zzmd zzmdVar = this.zzaa;
        int i5 = zzmdVar.zzn;
        int i6 = 0;
        if (i5 == 1) {
            if (z4) {
                i5 = 1;
            } else {
                i5 = 1;
                i6 = 1;
            }
        }
        if (zzmdVar.zzl == z4 && i5 == i6 && zzmdVar.zzm == 1) {
            return;
        }
        this.zzF++;
        zzmd zzi = zzmdVar.zzi(z4, 1, i6);
        this.zzm.zze(z4, 1, i6);
        zzal(zzi, 0, false, 5, -9223372036854775807L, -1, false);
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final boolean zzk() {
        zzav();
        return this.zzaa.zzl;
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final int zzl() {
        zzav();
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final boolean zzm() {
        zzav();
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final zzav zzn() {
        zzav();
        return this.zzaa.zzo;
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final void zzo() {
        zzav();
        zzP(null);
        new zzcz(zzguf.zzi(), this.zzaa.zzs);
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final zzbn zzp() {
        zzav();
        return this.zzaa.zzi.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final zzbf zzq() {
        zzav();
        return this.zzaa.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final int zzr() {
        zzav();
        if (!this.zzaa.zza.zzg()) {
            zzmd zzmdVar = this.zzaa;
            return zzmdVar.zza.zze(zzmdVar.zzb.zza);
        }
        int i5 = this.zzab;
        if (i5 == -1) {
            return 0;
        }
        return i5;
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final int zzs() {
        zzav();
        int zzai = zzai(this.zzaa);
        if (zzai == -1) {
            return 0;
        }
        return zzai;
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final long zzt() {
        zzav();
        if (!zzx()) {
            zzbf zzq = zzq();
            if (zzq.zzg()) {
                return -9223372036854775807L;
            }
            return zzfj.zzp(zzq.zzb(zzs(), this.zza, 0L).zzm);
        }
        zzmd zzmdVar = this.zzaa;
        zzwk zzwkVar = zzmdVar.zzb;
        zzbf zzbfVar = zzmdVar.zza;
        Object obj = zzwkVar.zza;
        zzbd zzbdVar = this.zzp;
        zzbfVar.zzo(obj, zzbdVar);
        return zzfj.zzp(zzbdVar.zzh(zzwkVar.zzb, zzwkVar.zzc));
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final long zzu() {
        zzav();
        return zzfj.zzp(zzak(this.zzaa));
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final long zzv() {
        zzav();
        if (zzx()) {
            zzmd zzmdVar = this.zzaa;
            return zzmdVar.zzk.equals(zzmdVar.zzb) ? zzfj.zzp(this.zzaa.zzq) : zzt();
        }
        zzav();
        if (this.zzaa.zza.zzg()) {
            return this.zzac;
        }
        zzmd zzmdVar2 = this.zzaa;
        long j2 = 0;
        if (zzmdVar2.zzk.zzd != zzmdVar2.zzb.zzd) {
            return zzfj.zzp(zzmdVar2.zza.zzb(zzs(), this.zza, 0L).zzm);
        }
        long j5 = zzmdVar2.zzq;
        if (this.zzaa.zzk.zzb()) {
            zzmd zzmdVar3 = this.zzaa;
            zzmdVar3.zza.zzo(zzmdVar3.zzk.zza, this.zzp).zzc(this.zzaa.zzk.zzb);
        } else {
            j2 = j5;
        }
        zzmd zzmdVar4 = this.zzaa;
        zzaq(zzmdVar4.zza, zzmdVar4.zzk, j2);
        return zzfj.zzp(j2);
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final long zzw() {
        zzav();
        return zzfj.zzp(this.zzaa.zzr);
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final boolean zzx() {
        zzav();
        return this.zzaa.zzb.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final int zzy() {
        zzav();
        if (zzx()) {
            return this.zzaa.zzb.zzb;
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final int zzz() {
        zzav();
        if (zzx()) {
            return this.zzaa.zzb.zzc;
        }
        return -1;
    }
}
