package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import android.os.Looper;
import android.util.Pair;
import android.util.SparseArray;
import android.view.Surface;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class zzaco implements zzbt {
    private final Context zza;
    private final zzbs zzb;
    private final SparseArray zzc;
    private final boolean zzd;
    private final zzadr zze;
    private final zzdn zzf;
    private final CopyOnWriteArraySet zzg;
    private final long zzh;
    private final zzact zzi;
    private zzff zzj = new zzff(10);
    private zzv zzk;
    private zzdx zzl;
    private Pair zzm;
    private int zzn;
    private int zzo;
    private long zzp;
    private long zzq;
    private int zzr;

    public /* synthetic */ zzaco(zzacg zzacgVar, byte[] bArr) {
        this.zza = zzacgVar.zze();
        zzbs zzg = zzacgVar.zzg();
        zzg.getClass();
        this.zzb = zzg;
        this.zzc = new SparseArray();
        zzguf.zzi();
        this.zzd = zzacgVar.zzh();
        zzdn zzi = zzacgVar.zzi();
        this.zzf = zzi;
        this.zzh = zzacgVar.zzj() != -9223372036854775807L ? -zzacgVar.zzj() : -9223372036854775807L;
        zzact zzk = zzacgVar.zzk();
        this.zzi = zzk;
        this.zze = new zzabt(zzacgVar.zzf(), zzk, zzi);
        new zzacf(this);
        this.zzg = new CopyOnWriteArraySet();
        this.zzk = new zzt().zzM();
        this.zzp = -9223372036854775807L;
        this.zzq = -9223372036854775807L;
        this.zzr = -1;
        this.zzo = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zzi zzC(zzi zziVar) {
        return (zziVar == null || !zziVar.zzf()) ? zzi.zza : zziVar;
    }

    public final /* synthetic */ void zzA(long j2) {
        this.zzq = j2;
    }

    public final void zza(int i5) {
        this.zzr = 1;
    }

    public final zzadr zzb(int i5) {
        SparseArray sparseArray = this.zzc;
        if (zzfj.zza(sparseArray, 0)) {
            return (zzadr) sparseArray.get(0);
        }
        zzaci zzaciVar = new zzaci(this, this.zza, 0);
        this.zzg.add(zzaciVar);
        sparseArray.put(0, zzaciVar);
        return zzaciVar;
    }

    public final void zzc(Surface surface, zzes zzesVar) {
        Pair pair = this.zzm;
        if (pair != null && ((Surface) pair.first).equals(surface) && ((zzes) this.zzm.second).equals(zzesVar)) {
            return;
        }
        this.zzm = Pair.create(surface, zzesVar);
        zzesVar.zza();
        zzesVar.zzb();
    }

    public final void zzd() {
        zzes zzesVar = zzes.zza;
        zzesVar.zza();
        zzesVar.zzb();
        this.zzm = null;
    }

    public final void zze() {
        this.zze.zza();
    }

    public final void zzf() {
        this.zze.zzb();
    }

    public final void zzg() {
        if (this.zzo == 2) {
            return;
        }
        zzdx zzdxVar = this.zzl;
        if (zzdxVar != null) {
            zzdxVar.zzm(null);
        }
        this.zzm = null;
        this.zzo = 2;
    }

    public final /* synthetic */ void zzh() {
        this.zzn--;
    }

    public final /* synthetic */ boolean zzi(zzv zzvVar, int i5) {
        zzgrc.zzi(this.zzo == 0);
        zzi zzC = zzC(zzvVar.zzE);
        try {
            int i6 = zzC.zzd;
            try {
                if (i6 == 7) {
                    if (Build.VERSION.SDK_INT < 34 && zzdv.zzd()) {
                        zzh zzd = zzC.zzd();
                        zzd.zzc(6);
                        zzC = zzd.zzg();
                        zzi zziVar = zzC;
                        zzdn zzdnVar = this.zzf;
                        Looper myLooper = Looper.myLooper();
                        myLooper.getClass();
                        final zzdx zzd2 = zzdnVar.zzd(myLooper, null);
                        this.zzl = zzd2;
                        zzbs zzbsVar = this.zzb;
                        Context context = this.zza;
                        zzl zzlVar = zzl.zzb;
                        Objects.requireNonNull(zzd2);
                        zzbsVar.zza(context, zziVar, zzlVar, this, new Executor() { // from class: com.google.android.gms.internal.ads.zzach
                            @Override // java.util.concurrent.Executor
                            public final /* synthetic */ void execute(Runnable runnable) {
                                zzdx.this.zzn(runnable);
                            }
                        }, 0L, false);
                        throw null;
                    }
                    i6 = 7;
                }
                if (!zzdv.zzc(i6) && Build.VERSION.SDK_INT >= 29) {
                    String str = zzfj.zza;
                    Locale locale = Locale.US;
                    zzee.zzc("PlaybackVidGraphWrapper", "Color transfer " + i6 + " is not supported. Falling back to OpenGl tone mapping.");
                    zzC = zzi.zza;
                    zzi zziVar2 = zzC;
                    zzdn zzdnVar2 = this.zzf;
                    Looper myLooper2 = Looper.myLooper();
                    myLooper2.getClass();
                    final zzdx zzd22 = zzdnVar2.zzd(myLooper2, null);
                    this.zzl = zzd22;
                    zzbs zzbsVar2 = this.zzb;
                    Context context2 = this.zza;
                    zzl zzlVar2 = zzl.zzb;
                    Objects.requireNonNull(zzd22);
                    zzbsVar2.zza(context2, zziVar2, zzlVar2, this, new Executor() { // from class: com.google.android.gms.internal.ads.zzach
                        @Override // java.util.concurrent.Executor
                        public final /* synthetic */ void execute(Runnable runnable) {
                            zzdx.this.zzn(runnable);
                        }
                    }, 0L, false);
                    throw null;
                }
                zzbs zzbsVar22 = this.zzb;
                Context context22 = this.zza;
                zzl zzlVar22 = zzl.zzb;
                Objects.requireNonNull(zzd22);
                zzbsVar22.zza(context22, zziVar2, zzlVar22, this, new Executor() { // from class: com.google.android.gms.internal.ads.zzach
                    @Override // java.util.concurrent.Executor
                    public final /* synthetic */ void execute(Runnable runnable) {
                        zzdx.this.zzn(runnable);
                    }
                }, 0L, false);
                throw null;
            } catch (zzbo e4) {
                throw new zzadq(e4, zzvVar);
            }
            if (i6 == 2 || i6 == 10) {
                zzC = zzi.zza;
            }
            zzi zziVar22 = zzC;
            zzdn zzdnVar22 = this.zzf;
            Looper myLooper22 = Looper.myLooper();
            myLooper22.getClass();
            final zzdx zzd222 = zzdnVar22.zzd(myLooper22, null);
            this.zzl = zzd222;
        } catch (zzdu e5) {
            throw new zzadq(e5, zzvVar);
        }
    }

    public final /* synthetic */ boolean zzj(boolean z4) {
        return this.zze.zzh(false);
    }

    public final /* synthetic */ void zzk() {
        this.zze.zzi();
    }

    public final /* synthetic */ void zzl(long j2, long j5) {
        this.zze.zzv(j2, j5);
    }

    public final /* synthetic */ void zzm(boolean z4) {
        if (this.zzo == 1) {
            this.zzn++;
            zzadr zzadrVar = this.zze;
            zzadrVar.zzg(z4);
            while (this.zzj.zzc() > 1) {
                this.zzj.zzd();
            }
            if (this.zzj.zzc() == 1) {
                zzacn zzacnVar = (zzacn) this.zzj.zzd();
                zzacnVar.getClass();
                zzadrVar.zzs(1, this.zzk, zzacnVar.zza, zzacnVar.zzb, zzguf.zzi());
            }
            this.zzp = -9223372036854775807L;
            if (z4) {
                this.zzq = -9223372036854775807L;
            }
            zzdx zzdxVar = this.zzl;
            zzdxVar.getClass();
            zzdxVar.zzn(new Runnable() { // from class: com.google.android.gms.internal.ads.zzacj
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzaco.this.zzh();
                }
            });
        }
    }

    public final /* synthetic */ void zzn(boolean z4) {
        this.zze.zzw(z4);
    }

    public final /* synthetic */ void zzo() {
        this.zze.zzt();
    }

    public final /* synthetic */ void zzp(zzacp zzacpVar) {
        this.zze.zzl(zzacpVar);
    }

    public final /* synthetic */ void zzq(float f5) {
        this.zzi.zzc(f5);
        this.zze.zzm(f5);
    }

    public final /* synthetic */ void zzr(int i5) {
        this.zze.zzr(i5);
    }

    public final /* synthetic */ boolean zzs() {
        int i5 = this.zzr;
        return i5 != -1 && i5 == 0;
    }

    public final /* synthetic */ boolean zzt() {
        return this.zzd;
    }

    public final /* synthetic */ long zzu() {
        return this.zzh;
    }

    public final /* synthetic */ zzact zzv() {
        return this.zzi;
    }

    public final /* synthetic */ zzff zzw() {
        return this.zzj;
    }

    public final /* synthetic */ void zzx(zzff zzffVar) {
        this.zzj = zzffVar;
    }

    public final /* synthetic */ long zzy() {
        return this.zzp;
    }

    public final /* synthetic */ long zzz() {
        return this.zzq;
    }
}
