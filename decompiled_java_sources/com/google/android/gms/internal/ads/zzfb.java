package com.google.android.gms.internal.ads;

import androidx.emoji2.text.u;

/* loaded from: classes.dex */
public final class zzfb extends IllegalStateException {
    public final int zza;
    public final int zzb;

    public zzfb(int i5, int i6) {
        super(i5 != 0 ? i5 != 1 ? i5 != 2 ? i5 != 3 ? u.m(new StringBuilder(String.valueOf(i6).length() + 31), "Player stuck suppressed for ", i6, " ms") : u.m(new StringBuilder(String.valueOf(i6).length() + 43), "Player stuck playing without ending for ", i6, " ms") : u.m(new StringBuilder(String.valueOf(i6).length() + 45), "Player stuck playing with no progress for ", i6, " ms") : u.m(new StringBuilder(String.valueOf(i6).length() + 47), "Player stuck buffering with no progress for ", i6, " ms") : u.m(new StringBuilder(String.valueOf(i6).length() + 46), "Player stuck buffering and not loading for ", i6, " ms"));
        this.zza = i5;
        this.zzb = i6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzfb.class == obj.getClass()) {
            zzfb zzfbVar = (zzfb) obj;
            if (this.zza == zzfbVar.zza && this.zzb == zzfbVar.zzb) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.zza + 527) * 31) + this.zzb;
    }
}
