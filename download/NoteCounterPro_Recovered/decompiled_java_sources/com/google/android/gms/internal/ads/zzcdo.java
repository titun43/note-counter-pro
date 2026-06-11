package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcelable;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

/* loaded from: classes.dex */
public final class zzcdo {
    private final x2.b zza;
    private final zzcdz zzb;
    private final String zze;
    private final String zzf;
    private final Object zzd = new Object();
    private long zzg = -1;
    private long zzh = -1;
    private long zzi = 0;
    private long zzj = -1;
    private long zzk = -1;
    private final LinkedList zzc = new LinkedList();

    public zzcdo(x2.b bVar, zzcdz zzcdzVar, String str, String str2) {
        this.zza = bVar;
        this.zzb = zzcdzVar;
        this.zze = str;
        this.zzf = str2;
    }

    public final void zza(com.google.android.gms.ads.internal.client.zzm zzmVar) {
        synchronized (this.zzd) {
            ((x2.c) this.zza).getClass();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            this.zzj = elapsedRealtime;
            this.zzb.zzf(zzmVar, elapsedRealtime);
        }
    }

    public final void zzb() {
        synchronized (this.zzd) {
            this.zzb.zzg();
        }
    }

    public final void zzc() {
        synchronized (this.zzd) {
            this.zzb.zzh();
        }
    }

    public final void zzd(long j2) {
        synchronized (this.zzd) {
            try {
                this.zzk = j2;
                if (j2 != -1) {
                    this.zzb.zzb(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zze() {
        synchronized (this.zzd) {
            try {
                if (this.zzk != -1 && this.zzg == -1) {
                    ((x2.c) this.zza).getClass();
                    this.zzg = SystemClock.elapsedRealtime();
                    this.zzb.zzb(this);
                }
                this.zzb.zze();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zzf() {
        synchronized (this.zzd) {
            try {
                if (this.zzk != -1) {
                    zzcdn zzcdnVar = new zzcdn(this);
                    zzcdnVar.zzc();
                    this.zzc.add(zzcdnVar);
                    this.zzi++;
                    zzcdz zzcdzVar = this.zzb;
                    zzcdzVar.zzd();
                    zzcdzVar.zzb(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zzg() {
        synchronized (this.zzd) {
            try {
                if (this.zzk != -1) {
                    LinkedList linkedList = this.zzc;
                    if (!linkedList.isEmpty()) {
                        zzcdn zzcdnVar = (zzcdn) linkedList.getLast();
                        if (zzcdnVar.zza() == -1) {
                            zzcdnVar.zzb();
                            this.zzb.zzb(this);
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zzh(boolean z4) {
        synchronized (this.zzd) {
            try {
                if (this.zzk != -1) {
                    ((x2.c) this.zza).getClass();
                    this.zzh = SystemClock.elapsedRealtime();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final Bundle zzi() {
        Bundle bundle;
        synchronized (this.zzd) {
            try {
                bundle = new Bundle();
                bundle.putString("seq_num", this.zze);
                bundle.putString("slotid", this.zzf);
                bundle.putBoolean("ismediation", false);
                bundle.putLong("treq", this.zzj);
                bundle.putLong("tresponse", this.zzk);
                bundle.putLong("timp", this.zzg);
                bundle.putLong("tload", this.zzh);
                bundle.putLong("pcc", this.zzi);
                bundle.putLong("tfetch", -1L);
                ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
                Iterator it = this.zzc.iterator();
                while (it.hasNext()) {
                    arrayList.add(((zzcdn) it.next()).zzd());
                }
                bundle.putParcelableArrayList("tclick", arrayList);
            } catch (Throwable th) {
                throw th;
            }
        }
        return bundle;
    }

    public final String zzj() {
        return this.zze;
    }

    public final /* synthetic */ x2.b zzk() {
        return this.zza;
    }
}
