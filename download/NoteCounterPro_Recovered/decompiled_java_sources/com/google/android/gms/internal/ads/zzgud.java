package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class zzgud extends zzgsc {
    private final zzguf zza;

    public zzgud(zzguf zzgufVar, int i5) {
        super(zzgufVar.size(), i5);
        this.zza = zzgufVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgsc
    public final Object zza(int i5) {
        return this.zza.get(i5);
    }
}
