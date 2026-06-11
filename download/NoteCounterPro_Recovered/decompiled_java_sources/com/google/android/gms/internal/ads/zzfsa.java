package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.getcapacitor.PluginMethod;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.internal.ClientApi;
import com.google.android.gms.common.internal.b0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public abstract class zzfsa {
    protected final ClientApi zza;
    protected final Context zzb;
    protected final int zzc;
    protected final zzfkg zzd;
    protected com.google.android.gms.ads.internal.client.zzft zze;
    protected final zzfqr zzf;
    protected AtomicBoolean zzg;
    protected com.google.android.gms.ads.internal.client.zzch zzh;
    private com.google.android.gms.ads.internal.client.zzce zzi;
    private final Queue zzj;
    private final zzfra zzk;
    private final String zzl;
    private AtomicBoolean zzm;
    private final ScheduledExecutorService zzn;
    private final zzfmy zzo;
    private AtomicBoolean zzp;
    private AtomicBoolean zzq;
    private zzfrf zzr;
    private final x2.b zzs;
    private final zzfrm zzt;

    public zzfsa(ClientApi clientApi, Context context, int i5, zzfkg zzfkgVar, com.google.android.gms.ads.internal.client.zzft zzftVar, com.google.android.gms.ads.internal.client.zzce zzceVar, ScheduledExecutorService scheduledExecutorService, zzfmy zzfmyVar, zzfra zzfraVar, x2.b bVar) {
        this(PluginMethod.RETURN_NONE, clientApi, context, i5, zzfkgVar, zzftVar, scheduledExecutorService, zzfmyVar, zzfraVar, bVar, null);
        this.zzi = zzceVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzM, reason: merged with bridge method [inline-methods] */
    public final synchronized void zzB(Object obj) {
        try {
            this.zzm.set(false);
            if (obj != null) {
                this.zzk.zza();
                this.zzq.set(true);
                zzP(obj);
            }
            if (obj == null || this.zzf == null) {
                zzQ(obj == null);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzN, reason: merged with bridge method [inline-methods] */
    public final synchronized void zzC(Throwable th) {
        try {
            this.zzm.set(false);
            if ((th instanceof zzfqs) && ((zzfqs) th).zza() == 0) {
                throw null;
            }
            zzQ(true);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzO, reason: merged with bridge method [inline-methods] */
    public final synchronized void zzD(com.google.android.gms.ads.internal.client.zze zzeVar) {
        try {
            if (this.zzp.get()) {
                com.google.android.gms.ads.internal.util.zzs.zza.post(new zzfrt(this, zzeVar));
            }
            this.zzm.set(false);
            int i5 = zzeVar.zza;
            if (i5 != 1 && i5 != 8 && i5 != 10 && i5 != 11) {
                zzQ(true);
                return;
            }
            com.google.android.gms.ads.internal.client.zzft zzftVar = this.zze;
            int i6 = zzftVar.zzb;
            String str = zzftVar.zza;
            StringBuilder sb = new StringBuilder(String.valueOf(i6).length() + 26 + String.valueOf(str).length() + 61);
            sb.append("Preloading ");
            sb.append(i6);
            sb.append(", for adUnitId:");
            sb.append(str);
            sb.append(", Ad load failed. Stop preloading due to non-retriable error:");
            String sb2 = sb.toString();
            int i7 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzh(sb2);
            this.zzg.set(false);
            zzfqr zzfqrVar = this.zzf;
            if (zzfqrVar != null) {
                zzfqrVar.zza(this);
            }
            zzfrl zzfrlVar = new zzfrl(this.zze.zza, zzo());
            zzfrlVar.zza(this.zzl);
            zzfrm zzfrmVar = new zzfrm(zzfrlVar, null);
            zzfrf zzfrfVar = this.zzr;
            ((x2.c) this.zzs).getClass();
            zzfrfVar.zzk(System.currentTimeMillis(), zzfrmVar, zzeVar, this.zze.zzd, zzp(), zzH());
        } catch (Throwable th) {
            throw th;
        }
    }

    private final synchronized void zzP(Object obj) {
        try {
            com.google.android.gms.ads.internal.client.zzea zzc = zzc(obj);
            double zzl = !(zzc instanceof zzday) ? 0.0d : ((zzday) zzc).zzl();
            com.google.android.gms.ads.internal.client.zzea zzc2 = zzc(obj);
            int zzm = zzc2 instanceof zzday ? ((zzday) zzc2).zzm() : 2;
            x2.b bVar = this.zzs;
            zzfro zzfroVar = new zzfro(obj, bVar, zzl, zzm);
            this.zzj.add(zzfroVar);
            com.google.android.gms.ads.internal.client.zzea zzc3 = zzc(obj);
            ((x2.c) bVar).getClass();
            long currentTimeMillis = System.currentTimeMillis();
            if (this.zzp.get()) {
                com.google.android.gms.ads.internal.util.zzs.zza.post(new zzfrr(this, zzc3));
            }
            ScheduledExecutorService scheduledExecutorService = this.zzn;
            scheduledExecutorService.execute(new zzfrs(this, currentTimeMillis, zzc3));
            if (this.zzf != null) {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzE)).booleanValue()) {
                    this.zzo.zzb(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfry
                        @Override // java.lang.Runnable
                        public final /* synthetic */ void run() {
                            zzfsa.this.zzA();
                        }
                    }, zzfroVar.zzc(), TimeUnit.MILLISECONDS);
                    return;
                } else {
                    scheduledExecutorService.schedule(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfrx
                        @Override // java.lang.Runnable
                        public final /* synthetic */ void run() {
                            zzfsa.this.zzz();
                        }
                    }, zzfroVar.zzc(), TimeUnit.MILLISECONDS);
                    return;
                }
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzE)).booleanValue()) {
                this.zzo.zzb(new zzfrq(this), zzfroVar.zzc(), TimeUnit.MILLISECONDS);
            } else {
                scheduledExecutorService.schedule(new zzfrq(this), zzfroVar.zzc(), TimeUnit.MILLISECONDS);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    private final synchronized void zzQ(boolean z4) {
        try {
            zzfqr zzfqrVar = this.zzf;
            if (zzfqrVar != null) {
                if (z4) {
                    this.zzk.zzc();
                }
                zzfqrVar.zza(this);
            } else {
                zzfra zzfraVar = this.zzk;
                if (zzfraVar.zze()) {
                    return;
                }
                if (z4) {
                    zzfraVar.zzc();
                }
                this.zzn.schedule(new zzfrq(this), zzfraVar.zzb(), TimeUnit.MILLISECONDS);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzR, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final synchronized void zzz() {
        Iterator it = this.zzj.iterator();
        while (it.hasNext()) {
            if (((zzfro) it.next()).zzb()) {
                it.remove();
                zzfqr zzfqrVar = this.zzf;
                if (zzfqrVar != null) {
                    zzfqrVar.zza(this);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzS, reason: merged with bridge method [inline-methods] */
    public final synchronized void zzE(com.google.android.gms.ads.internal.client.zze zzeVar) {
        com.google.android.gms.ads.internal.client.zzch zzchVar = this.zzh;
        if (zzchVar != null) {
            try {
                zzchVar.zzg(this.zzl, zzeVar);
            } catch (RemoteException unused) {
                int i5 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzi("Failed to call onAdFailedToPreload");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzT, reason: merged with bridge method [inline-methods] */
    public final synchronized void zzF(com.google.android.gms.ads.internal.client.zzea zzeaVar) {
        com.google.android.gms.ads.internal.client.zzce zzceVar = this.zzi;
        if (zzceVar != null) {
            try {
                zzceVar.zze(this.zze);
            } catch (RemoteException unused) {
                int i5 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzi("Failed to call onAdsAvailable");
            }
        }
        com.google.android.gms.ads.internal.client.zzch zzchVar = this.zzh;
        if (zzchVar != null) {
            try {
                zzchVar.zze(this.zzl, zzeaVar);
            } catch (RemoteException unused2) {
                int i6 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzi("Failed to call onAdPreloaded");
            }
        }
    }

    private final synchronized void zzU() {
        try {
            if (this.zzq.get() && this.zzj.isEmpty()) {
                this.zzq.set(false);
                if (this.zzp.get()) {
                    com.google.android.gms.ads.internal.util.zzs.zza.post(new zzfru(this));
                }
                this.zzn.execute(new zzfrv(this));
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzV, reason: merged with bridge method [inline-methods] */
    public final synchronized void zzG() {
        com.google.android.gms.ads.internal.client.zzce zzceVar = this.zzi;
        if (zzceVar != null) {
            try {
                zzceVar.zzf(this.zze);
            } catch (RemoteException unused) {
                int i5 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzi("Failed to call onAdsExhausted");
            }
        }
        com.google.android.gms.ads.internal.client.zzch zzchVar = this.zzh;
        if (zzchVar != null) {
            try {
                zzchVar.zzf(this.zzl);
            } catch (RemoteException unused2) {
                int i6 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzi("Failed to call onAdsExhausted");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzW, reason: merged with bridge method [inline-methods] */
    public final String zzH() {
        return true != PluginMethod.RETURN_NONE.equals(this.zzl) ? "2" : "1";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String zzX(com.google.android.gms.ads.internal.client.zzea zzeaVar) {
        if (zzeaVar instanceof zzday) {
            return ((zzday) zzeaVar).zzk();
        }
        return null;
    }

    public final /* synthetic */ zzfrf zzI() {
        return this.zzr;
    }

    public final /* synthetic */ x2.b zzJ() {
        return this.zzs;
    }

    public final /* synthetic */ zzfrm zzK() {
        return this.zzt;
    }

    public abstract j3.a zza(Context context);

    public long zzb() {
        throw null;
    }

    public abstract com.google.android.gms.ads.internal.client.zzea zzc(Object obj);

    public final synchronized zzfsa zzd() {
        this.zzn.submit(new zzfrq(this));
        return this;
    }

    public final synchronized void zze() {
        if (!this.zzm.get() && this.zzg.get() && this.zzj.size() < this.zze.zzd) {
            this.zzm.set(true);
            this.zzn.submit(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfrz
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzfsa.this.zzv();
                }
            });
        }
    }

    public final synchronized boolean zzf() {
        try {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzK)).booleanValue()) {
                this.zzk.zza();
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzD)).booleanValue() && this.zzf == null) {
                zzu();
            } else {
                zzz();
            }
        } catch (Throwable th) {
            throw th;
        }
        return !this.zzj.isEmpty();
    }

    public final synchronized Object zzg() {
        try {
            boolean z4 = true;
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzN)).booleanValue()) {
                if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzL)).booleanValue()) {
                    this.zzk.zza();
                } else if (this.zzj.size() == 1) {
                    this.zzk.zza();
                }
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzM)).booleanValue()) {
                zzz();
            }
            Queue queue = this.zzj;
            zzfro zzfroVar = (zzfro) queue.poll();
            AtomicBoolean atomicBoolean = this.zzq;
            if (zzfroVar == null) {
                z4 = false;
            }
            atomicBoolean.set(z4);
            if (zzfroVar == null) {
                zzfroVar = null;
            } else if (!queue.isEmpty()) {
                zzfro zzfroVar2 = (zzfro) queue.peek();
                AdFormat adFormat = AdFormat.getAdFormat(this.zze.zzb);
                String zzX = zzX(zzc(zzfroVar.zza()));
                if (zzfroVar2 != null && adFormat != null && zzX != null && zzfroVar2.zzd() < zzfroVar.zzd()) {
                    zzfrf zzfrfVar = this.zzr;
                    ((x2.c) this.zzs).getClass();
                    zzfrfVar.zzg(System.currentTimeMillis(), this.zze.zzd, zzp(), zzX, this.zzt, zzH());
                }
            }
            zzfqr zzfqrVar = this.zzf;
            if (zzfqrVar != null) {
                zzfqrVar.zzb(this);
            } else {
                long zzy = zzy();
                if (zzy > 0) {
                    this.zzn.schedule(new zzfrq(this), zzy, TimeUnit.MILLISECONDS);
                } else {
                    zzu();
                }
            }
            if (zzfroVar == null) {
                return null;
            }
            return zzfroVar.zza();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void zzh() {
        this.zzg.set(false);
        this.zzp.set(false);
    }

    public final void zzi() {
        this.zzg.set(false);
    }

    public final synchronized void zzj() {
        this.zzg.set(true);
        this.zzp.set(true);
        if (this.zzf == null) {
            this.zzn.submit(new zzfrq(this));
        }
    }

    public final synchronized String zzk() {
        Object zzs;
        zzs = zzs();
        return zzX(zzs == null ? null : zzc(zzs));
    }

    public final void zzl(zzfrf zzfrfVar) {
        this.zzr = zzfrfVar;
    }

    public final synchronized void zzm(int i5) {
        b0.b(i5 >= 5);
        this.zzk.zzf(i5);
    }

    public final String zzn() {
        return this.zzl;
    }

    public final AdFormat zzo() {
        return AdFormat.getAdFormat(this.zze.zzb);
    }

    public final synchronized int zzp() {
        return this.zzj.size();
    }

    public final boolean zzq() {
        return this.zzg.get() && !this.zzm.get() && zzp() < this.zze.zzd && !this.zzk.zzd();
    }

    public final synchronized void zzr() {
        this.zzj.clear();
    }

    public final synchronized Object zzs() {
        zzfro zzfroVar = (zzfro) this.zzj.peek();
        if (zzfroVar == null) {
            return null;
        }
        return zzfroVar.zza();
    }

    public final boolean zzt() {
        return this.zzm.get();
    }

    public final synchronized void zzu() {
        zzz();
        zzU();
        if (!this.zzm.get() && this.zzg.get() && this.zzj.size() < this.zze.zzd) {
            this.zzm.set(true);
            zzv();
        }
    }

    public final synchronized void zzv() {
        j3.a zza;
        try {
            Activity zzd = com.google.android.gms.ads.internal.zzt.zzg().zzd();
            if (zzd == null) {
                String valueOf = String.valueOf(this.zze.zza);
                int i5 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzi("Empty activity context at preloading: ".concat(valueOf));
                zza = zza(this.zzb);
            } else {
                zza = zza(zzd);
            }
            zzgzo.zzr(zza, new zzfrp(this), this.zzn);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void zzw(int i5) {
        zzfqr zzfqrVar;
        b0.b(i5 > 0);
        AdFormat adFormat = AdFormat.getAdFormat(this.zze.zzb);
        int i6 = this.zze.zzd;
        int size = this.zzj.size();
        synchronized (this) {
            try {
                com.google.android.gms.ads.internal.client.zzft zzftVar = this.zze;
                this.zze = new com.google.android.gms.ads.internal.client.zzft(zzftVar.zza, zzftVar.zzb, zzftVar.zzc, i5 > 0 ? i5 : zzftVar.zzd);
                Queue queue = this.zzj;
                if (queue.size() > i5) {
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzx)).booleanValue()) {
                        ArrayList arrayList = new ArrayList();
                        for (int i7 = 0; i7 < i5; i7++) {
                            zzfro zzfroVar = (zzfro) queue.poll();
                            if (zzfroVar != null) {
                                arrayList.add(zzfroVar);
                            }
                        }
                        queue.clear();
                        queue.addAll(arrayList);
                        if (size > arrayList.size() && (zzfqrVar = this.zzf) != null) {
                            int size2 = size - arrayList.size();
                            if (arrayList.isEmpty()) {
                                size2--;
                            }
                            zzfqrVar.zzc(this, size2);
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        zzfrf zzfrfVar = this.zzr;
        if (zzfrfVar == null || adFormat == null) {
            return;
        }
        ((x2.c) this.zzs).getClass();
        zzfrfVar.zzc(i6, i5, System.currentTimeMillis(), new zzfrm(new zzfrl(this.zze.zza, adFormat), null));
    }

    public final void zzx(com.google.android.gms.ads.internal.client.zzm zzmVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzC)).booleanValue()) {
            Bundle bundle = zzmVar.zzB;
            bundle.putInt("plcs", zzp());
            bundle.putInt("plbs", this.zze.zzd);
            bundle.putString("plid", this.zzl);
        }
    }

    public final long zzy() {
        long zzb = zzb();
        if (zzb >= 0) {
            return zzb;
        }
        return ((Long) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzP)).longValue();
    }

    public zzfsa(String str, ClientApi clientApi, Context context, int i5, zzfkg zzfkgVar, com.google.android.gms.ads.internal.client.zzft zzftVar, com.google.android.gms.ads.internal.client.zzch zzchVar, ScheduledExecutorService scheduledExecutorService, zzfmy zzfmyVar, zzfra zzfraVar, x2.b bVar, zzfqr zzfqrVar) {
        this(str, clientApi, context, i5, zzfkgVar, zzftVar, scheduledExecutorService, zzfmyVar, zzfraVar, bVar, zzfqrVar);
        this.zzh = zzchVar;
    }

    private zzfsa(String str, ClientApi clientApi, Context context, int i5, zzfkg zzfkgVar, com.google.android.gms.ads.internal.client.zzft zzftVar, ScheduledExecutorService scheduledExecutorService, zzfmy zzfmyVar, zzfra zzfraVar, x2.b bVar, zzfqr zzfqrVar) {
        Queue priorityQueue;
        this.zzl = str;
        this.zza = clientApi;
        this.zzb = context;
        this.zzc = i5;
        this.zzd = zzfkgVar;
        this.zze = zzftVar;
        int max = Math.max(1, zzftVar.zzd);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzX)).booleanValue()) {
            priorityQueue = new zzfsd();
        } else {
            priorityQueue = new PriorityQueue(max, zzfrw.zza);
        }
        this.zzj = priorityQueue;
        this.zzg = new AtomicBoolean(true);
        this.zzm = new AtomicBoolean(false);
        this.zzn = scheduledExecutorService;
        this.zzo = zzfmyVar;
        this.zzk = zzfraVar;
        this.zzp = new AtomicBoolean(true);
        this.zzq = new AtomicBoolean(false);
        this.zzs = bVar;
        zzfrl zzfrlVar = new zzfrl(zzftVar.zza, AdFormat.getAdFormat(this.zze.zzb));
        zzfrlVar.zza(str);
        this.zzt = new zzfrm(zzfrlVar, null);
        this.zzf = zzfqrVar;
    }
}
