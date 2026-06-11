package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;

/* loaded from: classes.dex */
public final class zzflv {
    private final zzfkz zza;
    private final zzfls zzb;
    private final zzfkv zzc;
    private zzfmb zze;
    private int zzf = 1;
    private final ArrayDeque zzd = new ArrayDeque();

    public zzflv(zzfkz zzfkzVar, zzfkv zzfkvVar, zzfls zzflsVar) {
        this.zza = zzfkzVar;
        this.zzc = zzfkvVar;
        this.zzb = zzflsVar;
        zzfkvVar.zza(new zzfku() { // from class: com.google.android.gms.internal.ads.zzflu
            @Override // com.google.android.gms.internal.ads.zzfku
            public final /* synthetic */ void zza() {
                zzflv.this.zzc();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0057, code lost:
    
        r3 = new com.google.android.gms.internal.ads.zzfmb(r4.zza, r4.zzb, r0);
        r4.zze = r3;
        r3.zza(new com.google.android.gms.internal.ads.zzflq(r4, r0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x006b, code lost:
    
        return;
     */
    /* renamed from: zzh, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized void zzd() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzhi)).booleanValue() && !com.google.android.gms.ads.internal.zzt.zzh().zzo().zzi().zzi()) {
            this.zzd.clear();
            return;
        }
        if (zzi()) {
            while (true) {
                ArrayDeque arrayDeque = this.zzd;
                if (arrayDeque.isEmpty()) {
                    break;
                }
                zzflt zzfltVar = (zzflt) arrayDeque.pollFirst();
                if (zzfltVar == null || (zzfltVar.zzb() != null && this.zza.zzc(zzfltVar.zzb()))) {
                    break;
                }
            }
        }
    }

    private final synchronized boolean zzi() {
        return this.zze == null;
    }

    public final synchronized void zza(zzflt zzfltVar) {
        this.zzd.add(zzfltVar);
    }

    public final synchronized j3.a zzb(zzflt zzfltVar) {
        this.zzf = 2;
        if (zzi()) {
            return null;
        }
        return this.zze.zzb(zzfltVar);
    }

    public final /* synthetic */ void zzc() {
        synchronized (this) {
            this.zzf = 1;
            zzd();
        }
    }

    public final /* synthetic */ ArrayDeque zze() {
        return this.zzd;
    }

    public final /* synthetic */ void zzf(zzfmb zzfmbVar) {
        this.zze = null;
    }

    public final /* synthetic */ int zzg() {
        return this.zzf;
    }
}
