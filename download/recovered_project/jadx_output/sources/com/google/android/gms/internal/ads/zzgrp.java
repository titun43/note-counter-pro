package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
abstract class zzgrp extends zzgqk {
    final CharSequence zzb;
    int zzc = 0;
    int zzd = com.google.android.gms.common.api.f.API_PRIORITY_OTHER;

    public zzgrp(zzgrr zzgrrVar, CharSequence charSequence) {
        this.zzb = charSequence;
    }

    @Override // com.google.android.gms.internal.ads.zzgqk
    public final /* bridge */ /* synthetic */ Object zza() {
        int zzd;
        int i5 = this.zzc;
        while (true) {
            int i6 = this.zzc;
            if (i6 == -1) {
                zzb();
                return null;
            }
            int zzc = zzc(i6);
            if (zzc == -1) {
                zzc = this.zzb.length();
                this.zzc = -1;
                zzd = -1;
            } else {
                zzd = zzd(zzc);
                this.zzc = zzd;
            }
            if (zzd != i5) {
                if (i5 < zzc) {
                    this.zzb.charAt(i5);
                }
                if (i5 < zzc) {
                    this.zzb.charAt(zzc - 1);
                }
                int i7 = this.zzd;
                if (i7 == 1) {
                    CharSequence charSequence = this.zzb;
                    int length = charSequence.length();
                    this.zzc = -1;
                    if (length > i5) {
                        charSequence.charAt(length - 1);
                    }
                    zzc = length;
                } else {
                    this.zzd = i7 - 1;
                }
                return this.zzb.subSequence(i5, zzc).toString();
            }
            int i8 = zzd + 1;
            this.zzc = i8;
            if (i8 > this.zzb.length()) {
                this.zzc = -1;
            }
        }
    }

    public abstract int zzc(int i5);

    public abstract int zzd(int i5);
}
