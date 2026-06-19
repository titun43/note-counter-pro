package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.view.Surface;
import com.google.android.gms.ads.RequestConfiguration;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class zzcit extends zzcfv implements zzhz, zzna {
    public static final /* synthetic */ int zza = 0;
    private final Context zzb;
    private final zzcid zzc;
    private final zzaaa zzd;
    private final zzcgd zze;
    private final WeakReference zzf;
    private final zzxt zzg;
    private zzjh zzh;
    private ByteBuffer zzi;
    private boolean zzj;
    private zzcfu zzk;
    private int zzl;
    private int zzm;
    private long zzn;
    private final String zzo;
    private final int zzp;
    private Integer zzr;
    private final ArrayList zzs;
    private volatile zzcig zzt;
    private final Object zzq = new Object();
    private final Set zzu = new HashSet();

    /* JADX WARN: Code restructure failed: missing block: B:25:0x00e3, code lost:
    
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(com.google.android.gms.internal.ads.zzbhe.zzcw)).booleanValue() == false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00e6, code lost:
    
        r7 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00ef, code lost:
    
        if (r5.zzl == false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00f1, code lost:
    
        r6 = new com.google.android.gms.internal.ads.zzcij(r3, r4, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0108, code lost:
    
        if (r5.zzi == false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x010a, code lost:
    
        r5 = new com.google.android.gms.internal.ads.zzcim(r3, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0112, code lost:
    
        r4 = r3.zzi;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0114, code lost:
    
        if (r4 == null) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x011a, code lost:
    
        if (r4.limit() <= 0) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x011c, code lost:
    
        r4 = new byte[r3.zzi.limit()];
        r3.zzi.get(r4);
        r5 = new com.google.android.gms.internal.ads.zzcin(r5, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0111, code lost:
    
        r5 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00f9, code lost:
    
        if (r5.zzh <= 0) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00fb, code lost:
    
        r6 = new com.google.android.gms.internal.ads.zzcil(r3, r4, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0101, code lost:
    
        r6 = new com.google.android.gms.internal.ads.zzcik(r3, r4, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00ea, code lost:
    
        if (r5.zzi == false) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public zzcit(Context context, zzcgd zzcgdVar, zzcge zzcgeVar, Integer num) {
        final zzha zzhaVar;
        this.zzb = context;
        this.zze = zzcgdVar;
        this.zzr = num;
        this.zzf = new WeakReference(zzcgeVar);
        zzcid zzcidVar = new zzcid();
        this.zzc = zzcidVar;
        zzaaa zzaaaVar = new zzaaa(context);
        this.zzd = zzaaaVar;
        if (com.google.android.gms.ads.internal.util.zze.zzc()) {
            com.google.android.gms.ads.internal.util.zze.zza("SimpleExoPlayerAdapter initialize ".concat(toString()));
        }
        zzcfv.zzf().incrementAndGet();
        zzmu zzmuVar = new zzmu(context, new zzmq() { // from class: com.google.android.gms.internal.ads.zzcio
            @Override // com.google.android.gms.internal.ads.zzmq
            public final /* synthetic */ zzml[] zza(Handler handler, zzadm zzadmVar, zzrc zzrcVar, zzyq zzyqVar, zzvi zzviVar) {
                return zzcit.this.zzW(handler, zzadmVar, zzrcVar, zzyqVar, zzviVar);
            }
        });
        zzmuVar.zza(zzaaaVar);
        zzmuVar.zzb(zzcidVar);
        zzmv zzc = zzmuVar.zzc();
        this.zzh = zzc;
        zzc.zzD(this);
        final boolean z4 = false;
        this.zzl = 0;
        this.zzn = 0L;
        this.zzm = 0;
        this.zzs = new ArrayList();
        this.zzt = null;
        this.zzo = (String) zzgra.zzd(zzcgeVar != null ? zzcgeVar.zzn() : null).zza(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
        this.zzp = zzcgeVar != null ? zzcgeVar.zzp() : 0;
        final String zze = com.google.android.gms.ads.internal.zzt.zzc().zze(context, zzcgeVar.zzs().afmaVersion);
        if (!this.zzj || this.zzi.limit() <= 0) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzcE)).booleanValue()) {
            }
        } else {
            final byte[] bArr = new byte[this.zzi.limit()];
            this.zzi.get(bArr);
            zzhaVar = new zzha() { // from class: com.google.android.gms.internal.ads.zzcii
                @Override // com.google.android.gms.internal.ads.zzha
                public final /* synthetic */ zzhb zza() {
                    int i5 = zzcit.zza;
                    return new zzgw(bArr);
                }
            };
        }
        this.zzg = new zzxt(zzhaVar, ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzp)).booleanValue() ? zzciq.zza : zzcip.zza);
    }

    private final boolean zzY() {
        return this.zzt != null && this.zzt.zzl();
    }

    public final void finalize() {
        zzcfv.zzf().decrementAndGet();
        if (com.google.android.gms.ads.internal.util.zze.zzc()) {
            com.google.android.gms.ads.internal.util.zze.zza("SimpleExoPlayerAdapter finalize ".concat(toString()));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcfv
    public final void zzA(int i5) {
        Iterator it = this.zzu.iterator();
        while (it.hasNext()) {
            zzcic zzcicVar = (zzcic) ((WeakReference) it.next()).get();
            if (zzcicVar != null) {
                zzcicVar.zzk(i5);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcfv
    public final boolean zzB() {
        return this.zzh != null;
    }

    @Override // com.google.android.gms.internal.ads.zzcfv
    public final int zzC() {
        return this.zzh.zzh();
    }

    @Override // com.google.android.gms.internal.ads.zzcfv
    public final long zzD() {
        return this.zzh.zzu();
    }

    @Override // com.google.android.gms.internal.ads.zzcfv
    public final void zzE(boolean z4) {
        this.zzh.zzj(z4);
    }

    @Override // com.google.android.gms.internal.ads.zzcfv
    public final void zzF(int i5) {
        this.zzc.zzk(i5);
    }

    @Override // com.google.android.gms.internal.ads.zzcfv
    public final void zzG(int i5) {
        this.zzc.zzl(i5);
    }

    @Override // com.google.android.gms.internal.ads.zzcfv
    public final long zzH() {
        return this.zzh.zzt();
    }

    @Override // com.google.android.gms.internal.ads.zzcfv
    public final long zzI() {
        if (zzY()) {
            return 0L;
        }
        return this.zzl;
    }

    @Override // com.google.android.gms.internal.ads.zzcfv
    public final long zzJ() {
        if (zzY() && this.zzt.zzm()) {
            return Math.min(this.zzl, this.zzt.zzo());
        }
        return 0L;
    }

    @Override // com.google.android.gms.internal.ads.zzcfv
    public final long zzK() {
        if (zzY()) {
            return this.zzt.zzp();
        }
        synchronized (this.zzq) {
            while (true) {
                ArrayList arrayList = this.zzs;
                if (!arrayList.isEmpty()) {
                    long j2 = this.zzn;
                    Map zzj = ((zzhu) arrayList.remove(0)).zzj();
                    long j5 = 0;
                    if (zzj != null) {
                        Iterator it = zzj.entrySet().iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            Map.Entry entry = (Map.Entry) it.next();
                            if (entry != null) {
                                try {
                                    if (entry.getKey() != null && zzgql.zze("content-length", (CharSequence) entry.getKey()) && entry.getValue() != null && ((List) entry.getValue()).get(0) != null) {
                                        j5 = Long.parseLong((String) ((List) entry.getValue()).get(0));
                                        break;
                                    }
                                } catch (NumberFormatException unused) {
                                    continue;
                                }
                            }
                        }
                    }
                    this.zzn = j2 + j5;
                }
            }
        }
        return this.zzn;
    }

    @Override // com.google.android.gms.internal.ads.zzcfv
    public final int zzL() {
        return this.zzm;
    }

    @Override // com.google.android.gms.internal.ads.zzcfv
    public final void zzM(boolean z4) {
        if (this.zzh == null) {
            return;
        }
        int i5 = 0;
        while (true) {
            this.zzh.zzF();
            if (i5 >= 2) {
                return;
            }
            zzaaa zzaaaVar = this.zzd;
            zzzk zzd = zzaaaVar.zzc().zzd();
            zzd.zzy(i5, !z4);
            zzaaaVar.zzf(zzd);
            i5++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcfv
    public final long zzN() {
        return this.zzh.zzv();
    }

    @Override // com.google.android.gms.internal.ads.zzcfv
    public final long zzO() {
        return this.zzl;
    }

    public final zzwm zzR(Uri uri) {
        zzz zzzVar = new zzz();
        zzzVar.zzb(uri);
        zzak zzc = zzzVar.zzc();
        zzxt zzxtVar = this.zzg;
        zzxtVar.zza(this.zze.zzf);
        return zzxtVar.zzb(zzc);
    }

    public final /* synthetic */ zzhb zzS(String str, boolean z4) {
        zzcit zzcitVar = true != z4 ? null : this;
        zzcgd zzcgdVar = this.zze;
        return new zzciw(str, zzcitVar, zzcgdVar.zzd, zzcgdVar.zze, zzcgdVar.zzm, zzcgdVar.zzn);
    }

    public final /* synthetic */ zzhb zzT(String str, boolean z4) {
        zzhi zzhiVar = new zzhi();
        zzhiVar.zzb(str);
        zzhiVar.zzf(true != z4 ? null : this);
        zzcgd zzcgdVar = this.zze;
        zzhiVar.zzc(zzcgdVar.zzd);
        zzhiVar.zzd(zzcgdVar.zze);
        zzhiVar.zze(true);
        return zzhiVar.zza();
    }

    public final /* synthetic */ zzhb zzU(String str, boolean z4) {
        zzcit zzcitVar = true != z4 ? null : this;
        zzcgd zzcgdVar = this.zze;
        zzcic zzcicVar = new zzcic(str, zzcitVar, zzcgdVar.zzd, zzcgdVar.zze, zzcgdVar.zzh);
        this.zzu.add(new WeakReference(zzcicVar));
        return zzcicVar;
    }

    public final /* synthetic */ zzhb zzV(zzha zzhaVar) {
        zzhb zza2 = zzhaVar.zza();
        zzcie zzcieVar = new zzcie() { // from class: com.google.android.gms.internal.ads.zzcir
            @Override // com.google.android.gms.internal.ads.zzcie
            public final /* synthetic */ void zza(boolean z4, long j2) {
                zzcit.this.zzX(z4, j2);
            }
        };
        return new zzcig(this.zzb, zza2, this.zzo, this.zzp, this, zzcieVar);
    }

    public final /* synthetic */ zzml[] zzW(Handler handler, zzadm zzadmVar, zzrc zzrcVar, zzyq zzyqVar, zzvi zzviVar) {
        zzuw zzuwVar = zzuw.zzb;
        Context context = this.zzb;
        zzta zztaVar = new zzta(context, new zzuc(context, null, null), zzuwVar, false, handler, zzrcVar, new zzsp(context).zza());
        zzaca zzacaVar = new zzaca(context);
        zzacaVar.zza(zzuwVar);
        zzacaVar.zzb(handler);
        zzacaVar.zzc(zzadmVar);
        return new zzml[]{zztaVar, zzacaVar.zzd()};
    }

    public final /* synthetic */ void zzX(boolean z4, long j2) {
        zzcfu zzcfuVar = this.zzk;
        if (zzcfuVar != null) {
            zzcfuVar.zzr(z4, j2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhz
    public final void zza(zzhb zzhbVar, zzhf zzhfVar, boolean z4) {
    }

    @Override // com.google.android.gms.internal.ads.zzhz
    public final void zzb(zzhb zzhbVar, zzhf zzhfVar, boolean z4) {
        if (zzhbVar instanceof zzhu) {
            synchronized (this.zzq) {
                this.zzs.add((zzhu) zzhbVar);
            }
        } else if (zzhbVar instanceof zzcig) {
            this.zzt = (zzcig) zzhbVar;
            final zzcge zzcgeVar = (zzcge) this.zzf.get();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzcw)).booleanValue() && zzcgeVar != null && this.zzt.zzk()) {
                final HashMap hashMap = new HashMap();
                hashMap.put("gcacheHit", String.valueOf(this.zzt.zzm()));
                hashMap.put("gcacheDownloaded", String.valueOf(this.zzt.zzn()));
                com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcis
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        int i5 = zzcit.zza;
                        zzcge.this.zze("onGcacheInfoEvent", hashMap);
                    }
                });
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhz
    public final void zzc(zzhb zzhbVar, zzhf zzhfVar, boolean z4, int i5) {
        this.zzl += i5;
    }

    @Override // com.google.android.gms.internal.ads.zzhz
    public final void zzd(zzhb zzhbVar, zzhf zzhfVar, boolean z4) {
    }

    @Override // com.google.android.gms.internal.ads.zzna
    public final void zze(zzmy zzmyVar, int i5) {
        zzcfu zzcfuVar = this.zzk;
        if (zzcfuVar != null) {
            zzcfuVar.zzs(i5);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzna
    public final void zzg(zzmy zzmyVar, zzau zzauVar) {
        zzcfu zzcfuVar = this.zzk;
        if (zzcfuVar != null) {
            zzcfuVar.zzu("onPlayerError", zzauVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzna
    public final void zzh(zzmy zzmyVar, zzwb zzwbVar, zzwg zzwgVar, IOException iOException, boolean z4) {
        zzcfu zzcfuVar = this.zzk;
        if (zzcfuVar != null) {
            if (this.zze.zzj) {
                zzcfuVar.zzv("onLoadException", iOException);
            } else {
                zzcfuVar.zzu("onLoadError", iOException);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcfv
    public final Integer zzj() {
        return this.zzr;
    }

    @Override // com.google.android.gms.internal.ads.zzna
    public final void zzk(zzmy zzmyVar, zzv zzvVar, zzio zzioVar) {
        zzcge zzcgeVar = (zzcge) this.zzf.get();
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzcw)).booleanValue() || zzcgeVar == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        String str = zzvVar.zzn;
        if (str != null) {
            hashMap.put("audioMime", str);
        }
        String str2 = zzvVar.zzo;
        if (str2 != null) {
            hashMap.put("audioSampleMime", str2);
        }
        String str3 = zzvVar.zzk;
        if (str3 != null) {
            hashMap.put("audioCodec", str3);
        }
        zzcgeVar.zze("onMetadataEvent", hashMap);
    }

    @Override // com.google.android.gms.internal.ads.zzna
    public final void zzl(zzmy zzmyVar, zzv zzvVar, zzio zzioVar) {
        zzcge zzcgeVar = (zzcge) this.zzf.get();
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzcw)).booleanValue() || zzcgeVar == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("frameRate", String.valueOf(zzvVar.zzz));
        hashMap.put("bitRate", String.valueOf(zzvVar.zzj));
        int i5 = zzvVar.zzv;
        int i6 = zzvVar.zzw;
        StringBuilder sb = new StringBuilder(String.valueOf(i5).length() + 1 + String.valueOf(i6).length());
        sb.append(i5);
        sb.append("x");
        sb.append(i6);
        hashMap.put("resolution", sb.toString());
        String str = zzvVar.zzn;
        if (str != null) {
            hashMap.put("videoMime", str);
        }
        String str2 = zzvVar.zzo;
        if (str2 != null) {
            hashMap.put("videoSampleMime", str2);
        }
        String str3 = zzvVar.zzk;
        if (str3 != null) {
            hashMap.put("videoCodec", str3);
        }
        zzcgeVar.zze("onMetadataEvent", hashMap);
    }

    @Override // com.google.android.gms.internal.ads.zzna
    public final void zzm(zzmy zzmyVar, int i5, long j2) {
        this.zzm += i5;
    }

    @Override // com.google.android.gms.internal.ads.zzcfv
    public final void zzn(Integer num) {
        this.zzr = num;
    }

    @Override // com.google.android.gms.internal.ads.zzna
    public final void zzo(zzmy zzmyVar, Object obj, long j2) {
        zzcfu zzcfuVar = this.zzk;
        if (zzcfuVar != null) {
            zzcfuVar.zzD();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzna
    public final void zzp(zzmy zzmyVar, zzbv zzbvVar) {
        zzcfu zzcfuVar = this.zzk;
        if (zzcfuVar != null) {
            zzcfuVar.zzt(zzbvVar.zzb, zzbvVar.zzc);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcfv
    public final void zzq(Uri[] uriArr, String str) {
        zzr(uriArr, str, ByteBuffer.allocate(0), false);
    }

    @Override // com.google.android.gms.internal.ads.zzcfv
    public final void zzr(Uri[] uriArr, String str, ByteBuffer byteBuffer, boolean z4) {
        zzwm zzxbVar;
        if (this.zzh != null) {
            this.zzi = byteBuffer;
            this.zzj = z4;
            int length = uriArr.length;
            if (length == 1) {
                zzxbVar = zzR(uriArr[0]);
            } else {
                zzwm[] zzwmVarArr = new zzwm[length];
                for (int i5 = 0; i5 < uriArr.length; i5++) {
                    zzwmVarArr[i5] = zzR(uriArr[i5]);
                }
                zzxbVar = new zzxb(false, false, new zzvv(), zzwmVarArr);
            }
            this.zzh.zzG(zzxbVar);
            this.zzh.zzg();
            zzcfv.zzi().incrementAndGet();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcfv
    public final void zzs(zzcfu zzcfuVar) {
        this.zzk = zzcfuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcfv
    public final void zzt() {
        zzjh zzjhVar = this.zzh;
        if (zzjhVar != null) {
            zzjhVar.zzE(this);
            this.zzh.zzH();
            this.zzh = null;
            zzcfv.zzi().decrementAndGet();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcfv
    public final void zzu(Surface surface, boolean z4) {
        zzjh zzjhVar = this.zzh;
        if (zzjhVar != null) {
            zzjhVar.zzC(surface);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcfv
    public final void zzv(float f5, boolean z4) {
        zzjh zzjhVar = this.zzh;
        if (zzjhVar != null) {
            zzjhVar.zzB(f5);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcfv
    public final void zzw() {
        this.zzh.zzo();
    }

    @Override // com.google.android.gms.internal.ads.zzcfv
    public final void zzx(long j2) {
        this.zzh.zzb(j2);
    }

    @Override // com.google.android.gms.internal.ads.zzcfv
    public final void zzy(int i5) {
        this.zzc.zzm(i5);
    }

    @Override // com.google.android.gms.internal.ads.zzcfv
    public final void zzz(int i5) {
        this.zzc.zzn(i5);
    }
}
