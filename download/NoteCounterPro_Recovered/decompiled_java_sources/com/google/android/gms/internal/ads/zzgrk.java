package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class zzgrk extends zzgrp {
    public zzgrk(zzgrr zzgrrVar, CharSequence charSequence, int i5) {
        super(zzgrrVar, charSequence);
    }

    @Override // com.google.android.gms.internal.ads.zzgrp
    public final int zzc(int i5) {
        int i6 = i5 + 4000;
        if (i6 < ((zzgrp) this).zzb.length()) {
            return i6;
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzgrp
    public final int zzd(int i5) {
        return i5;
    }
}
