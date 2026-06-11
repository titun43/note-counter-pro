package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import android.content.Context;
import android.location.Location;
import com.google.android.gms.common.api.internal.j;
import com.google.android.gms.common.api.internal.l;
import com.google.android.gms.common.internal.b0;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationRequest;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class zzav {
    private final zzbg<zzam> zza;
    private final Context zzb;
    private boolean zzc = false;
    private final Map<j, zzau> zzd = new HashMap();
    private final Map<j, zzas> zze = new HashMap();
    private final Map<j, zzar> zzf = new HashMap();

    public zzav(Context context, zzbg<zzam> zzbgVar) {
        this.zzb = context;
        this.zza = zzbgVar;
    }

    public final Location zza(String str) {
        ((zzh) this.zza).zza.checkConnected();
        return ((zzh) this.zza).zza().zzn(str);
    }

    @Deprecated
    public final Location zzb() {
        ((zzh) this.zza).zza.checkConnected();
        return ((zzh) this.zza).zza().zzm();
    }

    public final LocationAvailability zzc() {
        ((zzh) this.zza).zza.checkConnected();
        return ((zzh) this.zza).zza().zzs(this.zzb.getPackageName());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void zzd(LocationRequest locationRequest, l lVar, zzai zzaiVar) {
        zzau zzauVar;
        zzau zzauVar2;
        ((zzh) this.zza).zza.checkConnected();
        j jVar = lVar.f1006c;
        if (jVar == null) {
            zzauVar2 = null;
        } else {
            synchronized (this.zzd) {
                try {
                    zzauVar = this.zzd.get(jVar);
                    if (zzauVar == null) {
                        zzauVar = new zzau(lVar);
                    }
                    this.zzd.put(jVar, zzauVar);
                } catch (Throwable th) {
                    throw th;
                }
            }
            zzauVar2 = zzauVar;
        }
        if (zzauVar2 == null) {
            return;
        }
        ((zzh) this.zza).zza().zzo(new zzbc(1, zzba.zza(null, locationRequest), zzauVar2, null, null, zzaiVar));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void zze(zzba zzbaVar, l lVar, zzai zzaiVar) {
        zzar zzarVar;
        ((zzh) this.zza).zza.checkConnected();
        j jVar = lVar.f1006c;
        if (jVar == null) {
            zzarVar = null;
        } else {
            synchronized (this.zzf) {
                try {
                    zzar zzarVar2 = this.zzf.get(jVar);
                    if (zzarVar2 == null) {
                        zzarVar2 = new zzar(lVar);
                    }
                    zzarVar = zzarVar2;
                    this.zzf.put(jVar, zzarVar);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        zzar zzarVar3 = zzarVar;
        if (zzarVar3 == null) {
            return;
        }
        ((zzh) this.zza).zza().zzo(new zzbc(1, zzbaVar, null, null, zzarVar3, zzaiVar));
    }

    public final void zzf(zzba zzbaVar, PendingIntent pendingIntent, zzai zzaiVar) {
        ((zzh) this.zza).zza.checkConnected();
        ((zzh) this.zza).zza().zzo(zzbc.zzb(zzbaVar, pendingIntent, zzaiVar));
    }

    public final void zzg(LocationRequest locationRequest, PendingIntent pendingIntent, zzai zzaiVar) {
        ((zzh) this.zza).zza.checkConnected();
        ((zzh) this.zza).zza().zzo(zzbc.zzb(zzba.zza(null, locationRequest), pendingIntent, zzaiVar));
    }

    public final void zzh(j jVar, zzai zzaiVar) {
        ((zzh) this.zza).zza.checkConnected();
        b0.h(jVar, "Invalid null listener key");
        synchronized (this.zzd) {
            try {
                zzau remove = this.zzd.remove(jVar);
                if (remove != null) {
                    remove.zzc();
                    ((zzh) this.zza).zza().zzo(zzbc.zza(remove, zzaiVar));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zzi(j jVar, zzai zzaiVar) {
        ((zzh) this.zza).zza.checkConnected();
        b0.h(jVar, "Invalid null listener key");
        synchronized (this.zzf) {
            try {
                zzar remove = this.zzf.remove(jVar);
                if (remove != null) {
                    remove.zzc();
                    ((zzh) this.zza).zza().zzo(zzbc.zzc(remove, zzaiVar));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void zzj(PendingIntent pendingIntent, zzai zzaiVar) {
        ((zzh) this.zza).zza.checkConnected();
        ((zzh) this.zza).zza().zzo(new zzbc(2, null, null, pendingIntent, null, zzaiVar));
    }

    public final void zzk(boolean z4) {
        ((zzh) this.zza).zza.checkConnected();
        ((zzh) this.zza).zza().zzp(z4);
        this.zzc = z4;
    }

    public final void zzl(Location location) {
        ((zzh) this.zza).zza.checkConnected();
        ((zzh) this.zza).zza().zzq(location);
    }

    public final void zzm(zzai zzaiVar) {
        ((zzh) this.zza).zza.checkConnected();
        ((zzh) this.zza).zza().zzr(zzaiVar);
    }

    public final void zzn() {
        synchronized (this.zzd) {
            try {
                for (zzau zzauVar : this.zzd.values()) {
                    if (zzauVar != null) {
                        ((zzh) this.zza).zza().zzo(zzbc.zza(zzauVar, null));
                    }
                }
                this.zzd.clear();
            } finally {
            }
        }
        synchronized (this.zzf) {
            try {
                for (zzar zzarVar : this.zzf.values()) {
                    if (zzarVar != null) {
                        ((zzh) this.zza).zza().zzo(zzbc.zzc(zzarVar, null));
                    }
                }
                this.zzf.clear();
            } finally {
            }
        }
        synchronized (this.zze) {
            try {
                for (zzas zzasVar : this.zze.values()) {
                    if (zzasVar != null) {
                        ((zzh) this.zza).zza().zzu(new zzl(2, null, zzasVar, null));
                    }
                }
                this.zze.clear();
            } finally {
            }
        }
    }

    public final void zzo() {
        if (this.zzc) {
            zzk(false);
        }
    }
}
