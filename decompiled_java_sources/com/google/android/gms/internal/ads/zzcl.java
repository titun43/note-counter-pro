package com.google.android.gms.internal.ads;

import androidx.emoji2.text.u;
import java.util.Objects;

/* loaded from: classes.dex */
public final class zzcl {
    public static final zzcl zza = new zzcl(-1, -1, -1);
    public final int zzb;
    public final int zzc;
    public final int zzd;
    public final int zze;

    public zzcl(int i5, int i6, int i7) {
        this.zzb = i5;
        this.zzc = i6;
        this.zzd = i7;
        this.zze = zzfj.zzA(i7) ? zzfj.zzD(i7) * i6 : -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzcl)) {
            return false;
        }
        zzcl zzclVar = (zzcl) obj;
        return this.zzb == zzclVar.zzb && this.zzc == zzclVar.zzc && this.zzd == zzclVar.zzd;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.zzb), Integer.valueOf(this.zzc), Integer.valueOf(this.zzd));
    }

    public final String toString() {
        int i5 = this.zzb;
        int length = String.valueOf(i5).length();
        int i6 = this.zzc;
        int length2 = String.valueOf(i6).length();
        int i7 = this.zzd;
        StringBuilder sb = new StringBuilder(length + 38 + length2 + 11 + String.valueOf(i7).length() + 1);
        u.s(sb, "AudioFormat[sampleRate=", i5, ", channelCount=", i6);
        return u.m(sb, ", encoding=", i7, "]");
    }
}
