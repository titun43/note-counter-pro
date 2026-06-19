package com.google.android.gms.internal.ads;

import androidx.emoji2.text.u;
import com.google.android.gms.ads.RequestConfiguration;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class zzbdu {
    private final int zza;
    private final int zzb;
    private final int zzc;
    private final boolean zzd;
    private final zzbej zze;
    private final zzbeq zzf;
    private int zzn;
    private final Object zzg = new Object();
    private final ArrayList zzh = new ArrayList();
    private final ArrayList zzi = new ArrayList();
    private final ArrayList zzj = new ArrayList();
    private int zzk = 0;
    private int zzl = 0;
    private int zzm = 0;
    private String zzo = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    private String zzp = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    private String zzq = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;

    public zzbdu(int i5, int i6, int i7, int i8, int i9, int i10, int i11, boolean z4) {
        this.zza = i5;
        this.zzb = i6;
        this.zzc = i7;
        this.zzd = z4;
        this.zze = new zzbej(i8);
        this.zzf = new zzbeq(i9, i10, i11);
    }

    private final void zzm(String str, boolean z4, float f5, float f6, float f7, float f8) {
        if (str != null) {
            if (str.length() < this.zzc) {
                return;
            }
            synchronized (this.zzg) {
                try {
                    this.zzh.add(str);
                    this.zzk += str.length();
                    if (z4) {
                        this.zzi.add(str);
                        this.zzj.add(new zzbef(f5, f6, f7, f8, r10.size() - 1));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    private static final String zzn(ArrayList arrayList, int i5) {
        if (arrayList.isEmpty()) {
            return RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        }
        StringBuilder sb = new StringBuilder();
        int size = arrayList.size();
        int i6 = 0;
        while (i6 < size) {
            sb.append((String) arrayList.get(i6));
            sb.append(' ');
            i6++;
            if (sb.length() > 100) {
                break;
            }
        }
        sb.deleteCharAt(sb.length() - 1);
        String sb2 = sb.toString();
        return sb2.length() < 100 ? sb2 : sb2.substring(0, 100);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzbdu)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        String str = ((zzbdu) obj).zzo;
        return str != null && str.equals(this.zzo);
    }

    public final int hashCode() {
        return this.zzo.hashCode();
    }

    public final String toString() {
        ArrayList arrayList = this.zzh;
        int i5 = this.zzl;
        int i6 = this.zzn;
        int i7 = this.zzk;
        String zzn = zzn(arrayList, 100);
        String zzn2 = zzn(this.zzi, 100);
        String str = this.zzo;
        String str2 = this.zzp;
        String str3 = this.zzq;
        int length = String.valueOf(i5).length();
        int length2 = String.valueOf(i6).length();
        int length3 = String.valueOf(i7).length();
        int length4 = String.valueOf(zzn).length();
        int length5 = String.valueOf(zzn2).length();
        int length6 = String.valueOf(str).length();
        StringBuilder sb = new StringBuilder(length + 32 + length2 + 14 + length3 + 8 + length4 + 14 + length5 + 12 + length6 + 20 + String.valueOf(str2).length() + 32 + String.valueOf(str3).length());
        u.s(sb, "ActivityContent fetchId: ", i5, " score:", i6);
        sb.append(" total_length:");
        sb.append(i7);
        sb.append("\n text: ");
        sb.append(zzn);
        s.c.e(sb, "\n viewableText", zzn2, "\n signture: ", str);
        return u.n(sb, "\n viewableSignture: ", str2, "\n viewableSignatureForVertical: ", str3);
    }

    public final boolean zza() {
        boolean z4;
        synchronized (this.zzg) {
            z4 = this.zzm == 0;
        }
        return z4;
    }

    public final String zzb() {
        return this.zzo;
    }

    public final String zzc() {
        return this.zzq;
    }

    public final void zzd() {
        synchronized (this.zzg) {
            this.zzm--;
        }
    }

    public final void zze() {
        synchronized (this.zzg) {
            this.zzm++;
        }
    }

    public final void zzf(String str, boolean z4, float f5, float f6, float f7, float f8) {
        zzm(str, z4, f5, f6, f7, f8);
        synchronized (this.zzg) {
            try {
                if (this.zzm < 0) {
                    int i5 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzd("ActivityContent: negative number of WebViews.");
                }
                zzi();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zzg(String str, boolean z4, float f5, float f6, float f7, float f8) {
        zzm(str, z4, f5, f6, f7, f8);
    }

    public final void zzh() {
        synchronized (this.zzg) {
            try {
                int zzj = zzj(this.zzk, this.zzl);
                if (zzj > this.zzn) {
                    this.zzn = zzj;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zzi() {
        synchronized (this.zzg) {
            try {
                int zzj = zzj(this.zzk, this.zzl);
                if (zzj > this.zzn) {
                    this.zzn = zzj;
                    if (!com.google.android.gms.ads.internal.zzt.zzh().zzo().zzc()) {
                        zzbej zzbejVar = this.zze;
                        this.zzo = zzbejVar.zza(this.zzh);
                        this.zzp = zzbejVar.zza(this.zzi);
                    }
                    if (!com.google.android.gms.ads.internal.zzt.zzh().zzo().zze()) {
                        this.zzq = this.zzf.zza(this.zzi, this.zzj);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final int zzj(int i5, int i6) {
        if (this.zzd) {
            return this.zzb;
        }
        return (i6 * this.zzb) + (i5 * this.zza);
    }

    public final void zzk(int i5) {
        this.zzl = i5;
    }

    public final int zzl() {
        return this.zzk;
    }
}
