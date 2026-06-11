package com.google.android.gms.internal.ads;

import android.media.AudioFormat;
import android.media.AudioTrack;
import android.os.Build;
import androidx.emoji2.text.u;
import androidx.fragment.app.h1;
import java.util.Objects;
import java.util.Set;

/* loaded from: classes.dex */
final class zzpr {
    public static final zzpr zza;
    public final int zzb;
    public final int zzc;
    private final zzgup zzd;

    static {
        zzpr zzprVar;
        if (Build.VERSION.SDK_INT >= 33) {
            zzguo zzguoVar = new zzguo();
            for (int i5 = 1; i5 <= 10; i5++) {
                zzguoVar.zzf(Integer.valueOf(zzfj.zzB(i5)));
            }
            zzprVar = new zzpr(2, zzguoVar.zzi());
        } else {
            zzprVar = new zzpr(2, 10);
        }
        zza = zzprVar;
    }

    public zzpr(int i5, int i6) {
        this.zzb = i5;
        this.zzc = i6;
        this.zzd = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzpr)) {
            return false;
        }
        zzpr zzprVar = (zzpr) obj;
        return this.zzb == zzprVar.zzb && this.zzc == zzprVar.zzc && Objects.equals(this.zzd, zzprVar.zzd);
    }

    public final int hashCode() {
        zzgup zzgupVar = this.zzd;
        return (((this.zzb * 31) + this.zzc) * 31) + (zzgupVar == null ? 0 : zzgupVar.hashCode());
    }

    public final String toString() {
        String valueOf = String.valueOf(this.zzd);
        int i5 = this.zzb;
        int length = String.valueOf(i5).length();
        int i6 = this.zzc;
        StringBuilder sb = new StringBuilder(length + 38 + String.valueOf(i6).length() + 15 + valueOf.length() + 1);
        u.s(sb, "AudioProfile[format=", i5, ", maxChannelCount=", i6);
        return h1.b(sb, ", channelMasks=", valueOf, "]");
    }

    public final boolean zza(int i5) {
        zzgup zzgupVar = this.zzd;
        if (zzgupVar == null) {
            return i5 <= this.zzc;
        }
        int zzB = zzfj.zzB(i5);
        if (zzB == 0) {
            return false;
        }
        return zzgupVar.contains(Integer.valueOf(zzB));
    }

    public final int zzb(int i5, zzd zzdVar) {
        boolean isDirectPlaybackSupported;
        if (this.zzd != null) {
            return this.zzc;
        }
        if (Build.VERSION.SDK_INT < 29) {
            Integer num = (Integer) zzps.zzb.getOrDefault(Integer.valueOf(this.zzb), 0);
            num.getClass();
            return num.intValue();
        }
        int i6 = this.zzb;
        for (int i7 = 10; i7 > 0; i7--) {
            int zzB = zzfj.zzB(i7);
            if (zzB != 0) {
                isDirectPlaybackSupported = AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setEncoding(i6).setSampleRate(i5).setChannelMask(zzB).build(), zzdVar.zza());
                if (isDirectPlaybackSupported) {
                    return i7;
                }
            }
        }
        return 0;
    }

    public zzpr(int i5, Set set) {
        this.zzb = i5;
        zzgup zzo = zzgup.zzo(set);
        this.zzd = zzo;
        zzgwt it = zzo.iterator();
        int i6 = 0;
        while (it.hasNext()) {
            i6 = Math.max(i6, Integer.bitCount(((Integer) it.next()).intValue()));
        }
        this.zzc = i6;
    }
}
