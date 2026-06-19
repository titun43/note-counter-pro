package com.google.android.gms.internal.ads;

import android.net.Uri;
import androidx.fragment.app.h1;
import java.io.EOFException;
import java.util.Map;

/* loaded from: classes.dex */
public final class zzvm implements zzxd {
    private final zzafa zza;
    private zzaeu zzb;
    private zzaev zzc;

    public zzvm(zzafa zzafaVar) {
        this.zza = zzafaVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x004b, code lost:
    
        if (r1.zzn() != r11) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x004f, code lost:
    
        r0 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0075, code lost:
    
        if (r1.zzn() != r11) goto L23;
     */
    @Override // com.google.android.gms.internal.ads.zzxd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zza(zzj zzjVar, Uri uri, Map map, long j2, long j5, zzaex zzaexVar) {
        zzael zzaelVar = new zzael(zzjVar, j2, j5);
        this.zzc = zzaelVar;
        if (this.zzb != null) {
            return;
        }
        zzaeu[] zzb = this.zza.zzb(uri, map);
        int length = zzb.length;
        zzguc zzv = zzguf.zzv(length);
        if (length == 1) {
            this.zzb = zzb[0];
        } else {
            int i5 = 0;
            while (true) {
                if (i5 >= length) {
                    break;
                }
                zzaeu zzaeuVar = zzb[i5];
                try {
                } catch (EOFException unused) {
                    if (this.zzb == null) {
                    }
                } catch (Throwable th) {
                    zzgrc.zzi(this.zzb != null || zzaelVar.zzn() == j2);
                    zzaelVar.zzl();
                    throw th;
                }
                if (zzaeuVar.zza(zzaelVar)) {
                    this.zzb = zzaeuVar;
                    zzgrc.zzi(true);
                    zzaelVar.zzl();
                    break;
                } else {
                    zzv.zzh(zzaeuVar.zzb());
                    if (this.zzb == null) {
                    }
                    boolean z4 = true;
                    zzgrc.zzi(z4);
                    zzaelVar.zzl();
                    i5++;
                }
            }
            if (this.zzb == null) {
                String zzd = zzgqw.zzd(zzgvf.zzc(zzguf.zzr(zzb), zzvl.zza), ", ");
                throw new zzyo(h1.b(new StringBuilder(zzd.length() + 58), "None of the available extractors (", zzd, ") could read the stream."), uri, zzv.zzi());
            }
        }
        this.zzb.zzc(zzaexVar);
    }

    @Override // com.google.android.gms.internal.ads.zzxd
    public final void zzb() {
        zzaeu zzaeuVar = this.zzb;
        if (zzaeuVar != null) {
            zzaeuVar.zzf();
            this.zzb = null;
        }
        this.zzc = null;
    }

    @Override // com.google.android.gms.internal.ads.zzxd
    public final void zzc() {
        zzaeu zzaeuVar = this.zzb;
        if (zzaeuVar != null && (zzaeuVar instanceof zzajp)) {
            ((zzajp) zzaeuVar).zzh();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzxd
    public final long zzd() {
        zzaev zzaevVar = this.zzc;
        if (zzaevVar != null) {
            return zzaevVar.zzn();
        }
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.zzxd
    public final void zze(long j2, long j5) {
        zzaeu zzaeuVar = this.zzb;
        zzaeuVar.getClass();
        zzaeuVar.zze(j2, j5);
    }

    @Override // com.google.android.gms.internal.ads.zzxd
    public final int zzf(zzafv zzafvVar) {
        zzaev zzaevVar;
        zzaeu zzaeuVar = this.zzb;
        if (zzaeuVar == null || (zzaevVar = this.zzc) == null) {
            throw null;
        }
        return zzaeuVar.zzd(zzaevVar, zzafvVar);
    }
}
