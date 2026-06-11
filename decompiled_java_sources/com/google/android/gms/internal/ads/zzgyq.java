package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.logging.Level;

/* loaded from: classes.dex */
abstract class zzgyq extends zzgyu {
    private static final zzgzw zza = new zzgzw(zzgyq.class);
    private zzgub zzb;
    private final boolean zzc;
    private final boolean zzd;

    public zzgyq(zzgub zzgubVar, boolean z4, boolean z5) {
        super(zzgubVar.size());
        this.zzb = zzgubVar;
        this.zzc = z4;
        this.zzd = z5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzD, reason: merged with bridge method [inline-methods] */
    public final void zzy(int i5, j3.a aVar) {
        try {
            if (aVar.isCancelled()) {
                this.zzb = null;
                cancel(false);
            } else {
                zzG(i5, aVar);
            }
            zzz(null);
        } catch (Throwable th) {
            zzz(null);
            throw th;
        }
    }

    private final void zzE(Throwable th) {
        th.getClass();
        if (this.zzc && !zzb(th) && zzI(zzB(), th)) {
            zzF(th);
        } else if (th instanceof Error) {
            zzF(th);
        }
    }

    private static void zzF(Throwable th) {
        zza.zza().logp(Level.SEVERE, "com.google.common.util.concurrent.AggregateFuture", "log", true != (th instanceof Error) ? "Got more than one input Future failure. Logging failures after the first" : "Input Future failed with Error", th);
    }

    private final void zzG(int i5, Future future) {
        try {
            zzw(i5, zzhap.zza(future));
        } catch (ExecutionException e4) {
            zzE(e4.getCause());
        } catch (Throwable th) {
            zzE(th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzH, reason: merged with bridge method [inline-methods] */
    public final void zzz(zzgub zzgubVar) {
        int zzC = zzC();
        int i5 = 0;
        zzgrc.zzj(zzC >= 0, "Less than 0 remaining futures");
        if (zzC == 0) {
            if (zzgubVar != null) {
                zzgwt it = zzgubVar.iterator();
                while (it.hasNext()) {
                    Future future = (Future) it.next();
                    if (!future.isCancelled()) {
                        zzG(i5, future);
                    }
                    i5++;
                }
            }
            this.seenExceptionsField = null;
            zzx();
            zzA(2);
        }
    }

    private static boolean zzI(Set set, Throwable th) {
        while (th != null) {
            if (!set.add(th)) {
                return false;
            }
            th = th.getCause();
        }
        return true;
    }

    public void zzA(int i5) {
        this.zzb = null;
    }

    @Override // com.google.android.gms.internal.ads.zzgyh
    public final void zzc() {
        zzgub zzgubVar = this.zzb;
        zzA(1);
        if ((zzgubVar != null) && isCancelled()) {
            boolean zzj = zzj();
            zzgwt it = zzgubVar.iterator();
            while (it.hasNext()) {
                ((Future) it.next()).cancel(zzj);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgyh
    public final String zzd() {
        zzgub zzgubVar = this.zzb;
        return zzgubVar != null ? "futures=".concat(zzgubVar.toString()) : super.zzd();
    }

    public final void zze() {
        Objects.requireNonNull(this.zzb);
        if (this.zzb.isEmpty()) {
            zzx();
            return;
        }
        if (this.zzc) {
            zzgwt it = this.zzb.iterator();
            final int i5 = 0;
            while (it.hasNext()) {
                final j3.a aVar = (j3.a) it.next();
                int i6 = i5 + 1;
                if (aVar.isDone()) {
                    zzy(i5, aVar);
                } else {
                    aVar.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzgyp
                        @Override // java.lang.Runnable
                        public final /* synthetic */ void run() {
                            zzgyq.this.zzy(i5, aVar);
                        }
                    }, zzgzd.INSTANCE);
                }
                i5 = i6;
            }
            return;
        }
        zzgub zzgubVar = this.zzb;
        final zzgub zzgubVar2 = true != this.zzd ? null : zzgubVar;
        Runnable runnable = new Runnable() { // from class: com.google.android.gms.internal.ads.zzgyo
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzgyq.this.zzz(zzgubVar2);
            }
        };
        zzgwt it2 = zzgubVar.iterator();
        while (it2.hasNext()) {
            j3.a aVar2 = (j3.a) it2.next();
            if (aVar2.isDone()) {
                zzz(zzgubVar2);
            } else {
                aVar2.addListener(runnable, zzgzd.INSTANCE);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgyu
    public final void zzf(Set set) {
        set.getClass();
        if (isCancelled()) {
            return;
        }
        Throwable zzl = zzl();
        Objects.requireNonNull(zzl);
        zzI(set, zzl);
    }

    public abstract void zzw(int i5, Object obj);

    public abstract void zzx();
}
