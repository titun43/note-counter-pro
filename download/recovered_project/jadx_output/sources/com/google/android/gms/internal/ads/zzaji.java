package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class zzaji {
    private final zzer zza = new zzer(8);
    private int zzb;

    private final long zzb(zzaev zzaevVar) {
        int i5;
        zzer zzerVar = this.zza;
        zzael zzaelVar = (zzael) zzaevVar;
        int i6 = 0;
        zzaelVar.zzh(zzerVar.zzi(), 0, 1, false);
        int i7 = zzerVar.zzi()[0] & 255;
        if (i7 == 0) {
            return Long.MIN_VALUE;
        }
        int i8 = 128;
        int i9 = 0;
        while (true) {
            i5 = i9 + 1;
            if ((i7 & i8) != 0) {
                break;
            }
            i8 >>= 1;
            i9 = i5;
        }
        int i10 = i7 & (~i8);
        zzaelVar.zzh(zzerVar.zzi(), 1, i9, false);
        while (i6 < i9) {
            i6++;
            i10 = (zzerVar.zzi()[i6] & 255) + (i10 << 8);
        }
        this.zzb += i5;
        return i10;
    }

    public final boolean zza(zzaev zzaevVar) {
        long zzo = zzaevVar.zzo();
        long j2 = 1024;
        if (zzo != -1 && zzo <= 1024) {
            j2 = zzo;
        }
        zzer zzerVar = this.zza;
        zzael zzaelVar = (zzael) zzaevVar;
        zzaelVar.zzh(zzerVar.zzi(), 0, 4, false);
        this.zzb = 4;
        for (long zzz = zzerVar.zzz(); zzz != 440786851; zzz = ((zzz << 8) & (-256)) | (zzerVar.zzi()[0] & 255)) {
            int i5 = (int) j2;
            int i6 = this.zzb + 1;
            this.zzb = i6;
            if (i6 == i5) {
                return false;
            }
            zzaelVar.zzh(zzerVar.zzi(), 0, 1, false);
        }
        long zzb = zzb(zzaevVar);
        long j5 = this.zzb;
        if (zzb != Long.MIN_VALUE) {
            long j6 = j5 + zzb;
            if (zzo == -1 || j6 < zzo) {
                while (true) {
                    long j7 = this.zzb;
                    if (j7 < j6) {
                        if (zzb(zzaevVar) == Long.MIN_VALUE) {
                            return false;
                        }
                        long zzb2 = zzb(zzaevVar);
                        if (zzb2 < 0) {
                            return false;
                        }
                        if (zzb2 != 0) {
                            int i7 = (int) zzb2;
                            zzaelVar.zzj(i7, false);
                            this.zzb += i7;
                        }
                    } else if (j7 == j6) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
