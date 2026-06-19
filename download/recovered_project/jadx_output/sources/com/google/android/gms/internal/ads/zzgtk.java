package com.google.android.gms.internal.ads;

import java.util.Map;
import java.util.Objects;

/* loaded from: classes.dex */
final class zzgtk extends zzgsw {
    final /* synthetic */ zzgtm zza;
    private final Object zzb;
    private int zzc;

    public zzgtk(zzgtm zzgtmVar, int i5) {
        Objects.requireNonNull(zzgtmVar);
        this.zza = zzgtmVar;
        this.zzb = zzgtmVar.zzo(i5);
        this.zzc = i5;
    }

    private final void zza() {
        int i5 = this.zzc;
        if (i5 != -1) {
            zzgtm zzgtmVar = this.zza;
            if (i5 < zzgtmVar.size() && Objects.equals(this.zzb, zzgtmVar.zzo(this.zzc))) {
                return;
            }
        }
        this.zzc = this.zza.zzi(this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzgsw, java.util.Map.Entry
    public final Object getKey() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzgsw, java.util.Map.Entry
    public final Object getValue() {
        zzgtm zzgtmVar = this.zza;
        Map zzc = zzgtmVar.zzc();
        if (zzc != null) {
            return zzc.get(this.zzb);
        }
        zza();
        int i5 = this.zzc;
        if (i5 == -1) {
            return null;
        }
        return zzgtmVar.zzp(i5);
    }

    @Override // com.google.android.gms.internal.ads.zzgsw, java.util.Map.Entry
    public final Object setValue(Object obj) {
        zzgtm zzgtmVar = this.zza;
        Map zzc = zzgtmVar.zzc();
        if (zzc != null) {
            return zzc.put(this.zzb, obj);
        }
        zza();
        int i5 = this.zzc;
        if (i5 == -1) {
            zzgtmVar.put(this.zzb, obj);
            return null;
        }
        Object zzp = zzgtmVar.zzp(i5);
        zzgtmVar.zzq(this.zzc, obj);
        return zzp;
    }
}
