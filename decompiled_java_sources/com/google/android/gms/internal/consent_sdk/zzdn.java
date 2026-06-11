package com.google.android.gms.internal.consent_sdk;

import com.google.android.gms.common.api.f;

/* loaded from: classes.dex */
abstract class zzdn extends zzdc {
    final CharSequence zza;
    int zzb = 0;
    int zzc = f.API_PRIORITY_OTHER;

    public zzdn(zzdo zzdoVar, CharSequence charSequence) {
        this.zza = charSequence;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzdc
    public final /* bridge */ /* synthetic */ Object zza() {
        int zzc;
        int i5 = this.zzb;
        while (true) {
            int i6 = this.zzb;
            if (i6 == -1) {
                zzb();
                return null;
            }
            int zzd = zzd(i6);
            if (zzd == -1) {
                zzd = this.zza.length();
                this.zzb = -1;
                zzc = -1;
            } else {
                zzc = zzc(zzd);
                this.zzb = zzc;
            }
            if (zzc != i5) {
                if (i5 < zzd) {
                    this.zza.charAt(i5);
                }
                if (i5 < zzd) {
                    this.zza.charAt(zzd - 1);
                }
                int i7 = this.zzc;
                if (i7 == 1) {
                    CharSequence charSequence = this.zza;
                    int length = charSequence.length();
                    this.zzb = -1;
                    if (length > i5) {
                        charSequence.charAt(length - 1);
                    }
                    zzd = length;
                } else {
                    this.zzc = i7 - 1;
                }
                return this.zza.subSequence(i5, zzd).toString();
            }
            int i8 = zzc + 1;
            this.zzb = i8;
            if (i8 > this.zza.length()) {
                this.zzb = -1;
            }
        }
    }

    public abstract int zzc(int i5);

    public abstract int zzd(int i5);
}
