package com.google.android.gms.internal.ads;

import androidx.emoji2.text.u;

/* loaded from: classes.dex */
public final class zzri extends Exception {
    public final int zza;
    public final boolean zzb;
    public final zzv zzc;

    public zzri(int i5, zzv zzvVar, boolean z4) {
        super(u.l(new StringBuilder(String.valueOf(i5).length() + 25), "AudioTrack write failed: ", i5));
        this.zzb = z4;
        this.zza = i5;
        this.zzc = zzvVar;
    }
}
