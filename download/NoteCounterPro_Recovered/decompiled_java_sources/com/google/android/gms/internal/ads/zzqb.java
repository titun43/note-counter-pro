package com.google.android.gms.internal.ads;

import androidx.emoji2.text.u;

/* loaded from: classes.dex */
public final class zzqb extends Exception {
    public final int zza;
    public final boolean zzb;

    public zzqb(int i5, boolean z4) {
        super(u.l(new StringBuilder(String.valueOf(i5).length() + 26), "AudioOutput write failed: ", i5));
        this.zzb = z4;
        this.zza = i5;
    }
}
