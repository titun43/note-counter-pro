package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import androidx.emoji2.text.u;
import com.google.android.gms.ads.AdSize;
import u2.a;
import z2.b;

/* loaded from: classes.dex */
public final class zzr extends a {
    public static final Parcelable.Creator<zzr> CREATOR = new zzs();
    public final String zza;
    public final int zzb;
    public final int zzc;
    public final boolean zzd;
    public final int zze;
    public final int zzf;
    public final zzr[] zzg;
    public final boolean zzh;
    public final boolean zzi;
    public boolean zzj;
    public boolean zzk;
    public boolean zzl;
    public boolean zzm;
    public boolean zzn;
    public boolean zzo;

    /* JADX WARN: Removed duplicated region for block: B:27:0x00fd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public zzr(Context context, AdSize[] adSizeArr) {
        int height;
        int i5;
        String sb;
        int i6;
        double d5;
        AdSize adSize = adSizeArr[0];
        this.zzd = false;
        boolean isFluid = adSize.isFluid();
        this.zzi = isFluid;
        this.zzm = com.google.android.gms.ads.zzc.zzf(adSize);
        this.zzn = com.google.android.gms.ads.zzc.zzg(adSize);
        boolean zzd = com.google.android.gms.ads.zzc.zzd(adSize);
        this.zzo = zzd;
        if (isFluid) {
            AdSize adSize2 = AdSize.BANNER;
            this.zze = adSize2.getWidth();
            height = adSize2.getHeight();
            this.zzb = height;
        } else if (this.zzn) {
            this.zze = adSize.getWidth();
            height = com.google.android.gms.ads.zzc.zzh(adSize);
            this.zzb = height;
        } else if (zzd) {
            this.zze = adSize.getWidth();
            height = com.google.android.gms.ads.zzc.zze(adSize);
            this.zzb = height;
        } else {
            this.zze = adSize.getWidth();
            height = adSize.getHeight();
            this.zzb = height;
        }
        boolean z4 = this.zze == -1;
        boolean z5 = height == -2;
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        if (z4) {
            zzbb.zza();
            if (context.getResources().getConfiguration().orientation == 2) {
                if (((int) (r7.heightPixels / context.getResources().getDisplayMetrics().density)) < 600) {
                    zzbb.zza();
                    DisplayMetrics displayMetrics2 = context.getResources().getDisplayMetrics();
                    WindowManager windowManager = (WindowManager) context.getSystemService("window");
                    if (windowManager != null) {
                        Display defaultDisplay = windowManager.getDefaultDisplay();
                        defaultDisplay.getRealMetrics(displayMetrics2);
                        int i7 = displayMetrics2.heightPixels;
                        int i8 = displayMetrics2.widthPixels;
                        defaultDisplay.getMetrics(displayMetrics2);
                        int i9 = displayMetrics2.heightPixels;
                        int i10 = displayMetrics2.widthPixels;
                        if (i9 == i7 && i10 == i8) {
                            int i11 = displayMetrics.widthPixels;
                            zzbb.zza();
                            int identifier = context.getResources().getIdentifier("navigation_bar_width", "dimen", "android");
                            i6 = i11 - (identifier > 0 ? context.getResources().getDimensionPixelSize(identifier) : 0);
                            this.zzf = i6;
                            d5 = i6 / displayMetrics.density;
                            i5 = (int) d5;
                            if (d5 - i5 >= 0.01d) {
                                i5++;
                            }
                        }
                    }
                }
            }
            i6 = displayMetrics.widthPixels;
            this.zzf = i6;
            d5 = i6 / displayMetrics.density;
            i5 = (int) d5;
            if (d5 - i5 >= 0.01d) {
            }
        } else {
            i5 = this.zze;
            zzbb.zza();
            this.zzf = com.google.android.gms.ads.internal.util.client.zzf.zzu(displayMetrics, this.zze);
        }
        int zze = z5 ? zze(displayMetrics) : this.zzb;
        zzbb.zza();
        this.zzc = com.google.android.gms.ads.internal.util.client.zzf.zzu(displayMetrics, zze);
        if (z4 || z5) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(zze).length() + u.b(i5, 1) + 3);
            sb2.append(i5);
            sb2.append("x");
            sb2.append(zze);
            sb2.append("_as");
            this.zza = sb2.toString();
        } else {
            if (this.zzn || this.zzo) {
                int i12 = this.zze;
                int i13 = this.zzb;
                StringBuilder sb3 = new StringBuilder(String.valueOf(i13).length() + u.b(i12, 1) + 3);
                sb3.append(i12);
                sb3.append("x");
                sb3.append(i13);
                sb3.append("_as");
                sb = sb3.toString();
            } else if (isFluid) {
                sb = "320x50_mb";
            } else {
                this.zza = adSize.toString();
            }
            this.zza = sb;
        }
        int length = adSizeArr.length;
        if (length > 1) {
            this.zzg = new zzr[length];
            for (int i14 = 0; i14 < adSizeArr.length; i14++) {
                this.zzg[i14] = new zzr(context, adSizeArr[i14]);
            }
        } else {
            this.zzg = null;
        }
        this.zzh = false;
        this.zzj = false;
    }

    public static int zza(DisplayMetrics displayMetrics) {
        return (int) (zze(displayMetrics) * displayMetrics.density);
    }

    public static zzr zzb() {
        return new zzr("320x50_mb", 0, 0, false, 0, 0, null, true, false, false, false, false, false, false, false);
    }

    public static zzr zzc() {
        return new zzr("reward_mb", 0, 0, true, 0, 0, null, false, false, false, false, false, false, false, false);
    }

    public static zzr zzd() {
        return new zzr("interstitial_mb", 0, 0, false, 0, 0, null, false, false, false, false, true, false, false, false);
    }

    private static int zze(DisplayMetrics displayMetrics) {
        int i5 = (int) (displayMetrics.heightPixels / displayMetrics.density);
        if (i5 <= 400) {
            return 32;
        }
        return i5 <= 720 ? 50 : 90;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        String str = this.zza;
        int O = b.O(parcel, 20293);
        b.I(parcel, 2, str);
        int i6 = this.zzb;
        b.N(parcel, 3, 4);
        parcel.writeInt(i6);
        int i7 = this.zzc;
        b.N(parcel, 4, 4);
        parcel.writeInt(i7);
        boolean z4 = this.zzd;
        b.N(parcel, 5, 4);
        parcel.writeInt(z4 ? 1 : 0);
        int i8 = this.zze;
        b.N(parcel, 6, 4);
        parcel.writeInt(i8);
        int i9 = this.zzf;
        b.N(parcel, 7, 4);
        parcel.writeInt(i9);
        b.L(parcel, 8, this.zzg, i5);
        boolean z5 = this.zzh;
        b.N(parcel, 9, 4);
        parcel.writeInt(z5 ? 1 : 0);
        boolean z6 = this.zzi;
        b.N(parcel, 10, 4);
        parcel.writeInt(z6 ? 1 : 0);
        boolean z7 = this.zzj;
        b.N(parcel, 11, 4);
        parcel.writeInt(z7 ? 1 : 0);
        boolean z8 = this.zzk;
        b.N(parcel, 12, 4);
        parcel.writeInt(z8 ? 1 : 0);
        boolean z9 = this.zzl;
        b.N(parcel, 13, 4);
        parcel.writeInt(z9 ? 1 : 0);
        boolean z10 = this.zzm;
        b.N(parcel, 14, 4);
        parcel.writeInt(z10 ? 1 : 0);
        boolean z11 = this.zzn;
        b.N(parcel, 15, 4);
        parcel.writeInt(z11 ? 1 : 0);
        boolean z12 = this.zzo;
        b.N(parcel, 16, 4);
        parcel.writeInt(z12 ? 1 : 0);
        b.P(parcel, O);
    }

    public zzr(String str, int i5, int i6, boolean z4, int i7, int i8, zzr[] zzrVarArr, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12) {
        this.zza = str;
        this.zzb = i5;
        this.zzc = i6;
        this.zzd = z4;
        this.zze = i7;
        this.zzf = i8;
        this.zzg = zzrVarArr;
        this.zzh = z5;
        this.zzi = z6;
        this.zzj = z7;
        this.zzk = z8;
        this.zzl = z9;
        this.zzm = z10;
        this.zzn = z11;
        this.zzo = z12;
    }

    public zzr() {
        this("interstitial_mb", 0, 0, true, 0, 0, null, false, false, false, false, false, false, false, false);
    }

    public zzr(Context context, AdSize adSize) {
        this(context, new AdSize[]{adSize});
    }
}
