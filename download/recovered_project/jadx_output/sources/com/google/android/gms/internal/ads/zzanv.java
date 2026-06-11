package com.google.android.gms.internal.ads;

import android.text.Layout;
import androidx.emoji2.text.u;

/* loaded from: classes.dex */
final class zzanv {
    public CharSequence zzc;
    public long zza = 0;
    public long zzb = 0;
    public int zzd = 2;
    public float zze = -3.4028235E38f;
    public int zzf = 1;
    public int zzg = 0;
    public float zzh = -3.4028235E38f;
    public int zzi = Integer.MIN_VALUE;
    public float zzj = 1.0f;
    public int zzk = Integer.MIN_VALUE;

    /* JADX WARN: Code restructure failed: missing block: B:51:0x007f, code lost:
    
        if (r6 == 0) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0082  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final zzcw zza() {
        Layout.Alignment alignment;
        float f5;
        CharSequence charSequence;
        float f6 = this.zzh;
        float f7 = -3.4028235E38f;
        if (f6 == -3.4028235E38f) {
            int i5 = this.zzd;
            f6 = i5 != 4 ? i5 != 5 ? 0.5f : 1.0f : 0.0f;
        }
        int i6 = this.zzi;
        if (i6 == Integer.MIN_VALUE) {
            int i7 = this.zzd;
            if (i7 != 1) {
                if (i7 != 3) {
                    if (i7 != 4) {
                        if (i7 != 5) {
                            i6 = 1;
                        }
                    }
                }
                i6 = 2;
            }
            i6 = 0;
        }
        zzcw zzcwVar = new zzcw();
        int i8 = this.zzd;
        if (i8 != 1) {
            if (i8 != 2) {
                if (i8 != 3) {
                    if (i8 != 4) {
                        if (i8 != 5) {
                            u.r(new StringBuilder(String.valueOf(i8).length() + 23), "Unknown textAlignment: ", i8, "WebvttCueParser");
                            alignment = null;
                        }
                    }
                }
                alignment = Layout.Alignment.ALIGN_OPPOSITE;
            } else {
                alignment = Layout.Alignment.ALIGN_CENTER;
            }
            zzcwVar.zzd(alignment);
            f5 = this.zze;
            int i9 = this.zzf;
            if (f5 != -3.4028235E38f || i9 != 0 || (f5 >= 0.0f && f5 <= 1.0f)) {
                if (f5 == -3.4028235E38f) {
                    f7 = f5;
                }
                zzcwVar.zzf(f7, i9);
                zzcwVar.zzg(this.zzg);
                zzcwVar.zzi(f6);
                zzcwVar.zzj(i6);
                float f8 = this.zzj;
                if (i6 == 0) {
                    f6 = 1.0f - f6;
                } else if (i6 != 1) {
                    if (i6 != 2) {
                        throw new IllegalStateException(String.valueOf(i6));
                    }
                } else if (f6 <= 0.5f) {
                    f6 += f6;
                } else {
                    float f9 = 1.0f - f6;
                    f6 = f9 + f9;
                }
                zzcwVar.zzm(Math.min(f8, f6));
                zzcwVar.zzo(this.zzk);
                charSequence = this.zzc;
                if (charSequence != null) {
                    zzcwVar.zza(charSequence);
                }
                return zzcwVar;
            }
            f7 = 1.0f;
            zzcwVar.zzf(f7, i9);
            zzcwVar.zzg(this.zzg);
            zzcwVar.zzi(f6);
            zzcwVar.zzj(i6);
            float f82 = this.zzj;
            if (i6 == 0) {
            }
            zzcwVar.zzm(Math.min(f82, f6));
            zzcwVar.zzo(this.zzk);
            charSequence = this.zzc;
            if (charSequence != null) {
            }
            return zzcwVar;
        }
        alignment = Layout.Alignment.ALIGN_NORMAL;
        zzcwVar.zzd(alignment);
        f5 = this.zze;
        int i92 = this.zzf;
        if (f5 != -3.4028235E38f) {
        }
        if (f5 == -3.4028235E38f) {
        }
        zzcwVar.zzf(f7, i92);
        zzcwVar.zzg(this.zzg);
        zzcwVar.zzi(f6);
        zzcwVar.zzj(i6);
        float f822 = this.zzj;
        if (i6 == 0) {
        }
        zzcwVar.zzm(Math.min(f822, f6));
        zzcwVar.zzo(this.zzk);
        charSequence = this.zzc;
        if (charSequence != null) {
        }
        return zzcwVar;
    }
}
