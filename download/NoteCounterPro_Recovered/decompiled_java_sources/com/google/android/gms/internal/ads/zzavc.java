package com.google.android.gms.internal.ads;

import androidx.emoji2.text.u;
import java.util.Comparator;

/* loaded from: classes.dex */
public final class zzavc implements Comparator {
    private final boolean zza;

    public zzavc(boolean z4) {
        this.zza = z4;
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        Comparator comparator;
        Object zzn;
        Object zzn2;
        int[] iArr = {446703183, 1862618146, 1081639777, -1087935358, -803036955, 1104011716, 5522510, 2017461929, 496612959};
        int i5 = iArr[0];
        int i6 = iArr[1];
        int i7 = iArr[2];
        int i8 = iArr[3];
        int i9 = iArr[4];
        int i10 = iArr[5];
        int i11 = iArr[6];
        int i12 = iArr[7];
        int d5 = u.d((i6 & (~i5)) | i7, (i5 & i8) | i9, i10, i11);
        int i13 = i12 % 496612959;
        zzavg zzavgVar = (zzavg) obj;
        zzavg zzavgVar2 = (zzavg) obj2;
        int i14 = zzavgVar.zza;
        if (i14 != zzavgVar2.zza) {
            throw new IllegalArgumentException();
        }
        int i15 = i13 ^ d5;
        try {
            if (i14 == 0) {
                throw null;
            }
            switch (i14 + i15) {
                case 0:
                    return 0;
                case 1:
                    if (this.zza) {
                        return zzavgVar.zzl() != zzavgVar2.zzl() ? 1 : 0;
                    }
                    throw new IllegalArgumentException();
                case 2:
                    return Long.compare(zzavgVar.zzm(), zzavgVar2.zzm());
                case 3:
                    comparator = zzauk.zzc;
                    zzn = zzavgVar.zzn();
                    zzn2 = zzavgVar2.zzn();
                    break;
                case 4:
                    zzn = zzavgVar.zzo();
                    zzn2 = zzavgVar2.zzo();
                    comparator = zzgtp.zza(this);
                    break;
                case 5:
                    if (this.zza) {
                        return zzavgVar.zzp() != zzavgVar2.zzp() ? 1 : 0;
                    }
                    throw new IllegalArgumentException();
                case 6:
                    return Double.compare(zzavgVar.zzq(), zzavgVar2.zzq());
                default:
                    return 0;
            }
            return comparator.compare(zzn, zzn2);
        } catch (zzavd e4) {
            throw new AssertionError(zzaui.zza("CEiv6BFfPnitUE+D"), e4);
        }
    }
}
