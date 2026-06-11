package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import androidx.fragment.app.h1;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class zzary implements Comparable {
    private final zzasj zza;
    private final int zzb;
    private final String zzc;
    private final int zzd;
    private final Object zze;
    private final zzasc zzf;
    private Integer zzg;
    private zzasb zzh;
    private boolean zzi;
    private zzarh zzj;
    private zzarx zzk;
    private final zzarm zzl;

    public zzary(int i5, String str, zzasc zzascVar) {
        Uri parse;
        String host;
        this.zza = zzasj.zza ? new zzasj() : null;
        this.zze = new Object();
        int i6 = 0;
        this.zzi = false;
        this.zzj = null;
        this.zzb = i5;
        this.zzc = str;
        this.zzf = zzascVar;
        this.zzl = new zzarm();
        if (!TextUtils.isEmpty(str) && (parse = Uri.parse(str)) != null && (host = parse.getHost()) != null) {
            i6 = host.hashCode();
        }
        this.zzd = i6;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.zzg.intValue() - ((zzary) obj).zzg.intValue();
    }

    public final String toString() {
        String valueOf = String.valueOf(Integer.toHexString(this.zzd));
        zzl();
        Integer num = this.zzg;
        String str = this.zzc;
        int length = String.valueOf(str).length();
        int length2 = String.valueOf(num).length();
        String concat = "0x".concat(valueOf);
        StringBuilder sb = new StringBuilder(concat.length() + length + 5 + 8 + length2);
        s.c.e(sb, "[ ] ", str, " ", concat);
        sb.append(" NORMAL ");
        sb.append(num);
        return sb.toString();
    }

    public final int zza() {
        return this.zzb;
    }

    public final int zzb() {
        return this.zzd;
    }

    public final void zzc(String str) {
        if (zzasj.zza) {
            this.zza.zza(str, Thread.currentThread().getId());
        }
    }

    public final void zzd(String str) {
        zzasb zzasbVar = this.zzh;
        if (zzasbVar != null) {
            zzasbVar.zzc(this);
        }
        if (zzasj.zza) {
            long id = Thread.currentThread().getId();
            if (Looper.myLooper() != Looper.getMainLooper()) {
                new Handler(Looper.getMainLooper()).post(new zzarw(this, str, id));
                return;
            }
            zzasj zzasjVar = this.zza;
            zzasjVar.zza(str, id);
            zzasjVar.zzb(toString());
        }
    }

    public final void zze(int i5) {
        zzasb zzasbVar = this.zzh;
        if (zzasbVar != null) {
            zzasbVar.zzd(this, i5);
        }
    }

    public final zzary zzf(zzasb zzasbVar) {
        this.zzh = zzasbVar;
        return this;
    }

    public final zzary zzg(int i5) {
        this.zzg = Integer.valueOf(i5);
        return this;
    }

    public final String zzh() {
        return this.zzc;
    }

    public final String zzi() {
        int i5 = this.zzb;
        String str = this.zzc;
        if (i5 == 0) {
            return str;
        }
        String num = Integer.toString(1);
        return h1.b(new StringBuilder(String.valueOf(num).length() + 1 + String.valueOf(str).length()), num, "-", str);
    }

    public final zzary zzj(zzarh zzarhVar) {
        this.zzj = zzarhVar;
        return this;
    }

    public final zzarh zzk() {
        return this.zzj;
    }

    public final boolean zzl() {
        synchronized (this.zze) {
        }
        return false;
    }

    public Map zzm() {
        return Collections.EMPTY_MAP;
    }

    public byte[] zzn() {
        return null;
    }

    public final int zzo() {
        return this.zzl.zza();
    }

    public final void zzp() {
        synchronized (this.zze) {
            this.zzi = true;
        }
    }

    public final boolean zzq() {
        boolean z4;
        synchronized (this.zze) {
            z4 = this.zzi;
        }
        return z4;
    }

    public abstract zzase zzr(zzaru zzaruVar);

    public abstract void zzs(Object obj);

    public final void zzt(zzash zzashVar) {
        zzasc zzascVar;
        synchronized (this.zze) {
            zzascVar = this.zzf;
        }
        zzascVar.zza(zzashVar);
    }

    public final void zzu(zzarx zzarxVar) {
        synchronized (this.zze) {
            this.zzk = zzarxVar;
        }
    }

    public final void zzv(zzase zzaseVar) {
        zzarx zzarxVar;
        synchronized (this.zze) {
            zzarxVar = this.zzk;
        }
        if (zzarxVar != null) {
            zzarxVar.zza(this, zzaseVar);
        }
    }

    public final void zzw() {
        zzarx zzarxVar;
        synchronized (this.zze) {
            zzarxVar = this.zzk;
        }
        if (zzarxVar != null) {
            zzarxVar.zzb(this);
        }
    }

    public final /* synthetic */ zzasj zzx() {
        return this.zza;
    }

    public final zzarm zzy() {
        return this.zzl;
    }
}
