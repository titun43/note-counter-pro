package com.google.android.gms.internal.common;

import com.google.android.gms.common.api.f;

/* loaded from: classes.dex */
abstract class zzv extends zzk {
    final CharSequence zzb;
    final zzp zzc;
    final boolean zzd;
    int zze = 0;
    int zzf = f.API_PRIORITY_OTHER;

    public zzv(zzw zzwVar, CharSequence charSequence) {
        this.zzc = zzwVar.zzf();
        this.zzd = zzwVar.zzg();
        this.zzb = charSequence;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0047, code lost:
    
        r3 = r5.zzf;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004a, code lost:
    
        if (r3 != 1) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004c, code lost:
    
        r1 = r5.zzb;
        r3 = r1.length();
        r5.zze = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0054, code lost:
    
        if (r3 <= r0) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0056, code lost:
    
        r1.charAt(r3 - 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x005b, code lost:
    
        r1 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x006a, code lost:
    
        return r5.zzb.subSequence(r0, r1).toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x005d, code lost:
    
        r5.zzf = r3 - 1;
     */
    @Override // com.google.android.gms.internal.common.zzk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final /* bridge */ /* synthetic */ Object zza() {
        int zzd;
        int i5 = this.zze;
        while (true) {
            int i6 = this.zze;
            if (i6 == -1) {
                zzb();
                return null;
            }
            int zzc = zzc(i6);
            if (zzc == -1) {
                zzc = this.zzb.length();
                this.zze = -1;
                zzd = -1;
            } else {
                zzd = zzd(zzc);
                this.zze = zzd;
            }
            if (zzd == i5) {
                int i7 = zzd + 1;
                this.zze = i7;
                if (i7 > this.zzb.length()) {
                    this.zze = -1;
                }
            } else {
                if (i5 < zzc) {
                    this.zzb.charAt(i5);
                }
                if (i5 < zzc) {
                    this.zzb.charAt(zzc - 1);
                }
                if (!this.zzd || i5 != zzc) {
                    break;
                }
                i5 = this.zze;
            }
        }
    }

    public abstract int zzc(int i5);

    public abstract int zzd(int i5);
}
