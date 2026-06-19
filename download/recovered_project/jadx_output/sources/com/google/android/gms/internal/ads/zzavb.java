package com.google.android.gms.internal.ads;

import androidx.emoji2.text.u;
import java.util.ArrayDeque;
import java.util.Optional;

/* loaded from: classes.dex */
public final class zzavb {
    public final zzatw zza;
    public final zzaux zzb;
    public final zzauu zzc;
    public final zzaup zzd;

    public zzavb(zzatw zzatwVar, zzaux zzauxVar, zzaup zzaupVar) {
        int[] iArr = {343945053, 300943123, 276960570, 1098387973, 1376531620, 1545514151, 271059426, 857490000, 454333378};
        int i5 = iArr[0];
        int i6 = iArr[1];
        int i7 = iArr[2];
        int i8 = iArr[3];
        int i9 = iArr[4];
        int i10 = iArr[5];
        int i11 = iArr[6];
        int i12 = iArr[7];
        this.zza = zzatwVar;
        this.zzb = zzauxVar;
        this.zzd = zzaupVar;
        this.zzc = new zzauu(u.d((i6 & (~i5)) | i7, (i5 & i8) | i9, i10, i11) ^ (i12 % 454333378));
    }

    public final Optional zza() {
        zzatq zzatqVar;
        try {
            ArrayDeque arrayDeque = this.zzc.zza;
            if (arrayDeque.isEmpty()) {
                throw new zzaut();
            }
            zzaur zzaurVar = (zzaur) arrayDeque.pop();
            long j2 = zzaurVar.zza;
            long j5 = zzaurVar.zzb;
            long j6 = zzaurVar.zzc;
            zzaux zzauxVar = this.zzb;
            if (zzauxVar.zzb < j5) {
                return Optional.of(zzatq.zzG);
            }
            this.zzd.zza(j2);
            if (j6 == 0) {
                while (zzauxVar.zzb > j5) {
                    zzauxVar.zzc();
                }
            }
            return Optional.empty();
        } catch (zzaun e4) {
            e = e4;
            throw new AssertionError(zzaui.zza("CEiv6BFfPnitUE+D"), e);
        } catch (zzauo e5) {
            e = e5;
            throw new AssertionError(zzaui.zza("CEiv6BFfPnitUE+D"), e);
        } catch (zzaut unused) {
            zzatqVar = zzatq.zzw;
            return Optional.of(zzatqVar);
        } catch (zzauv unused2) {
            zzatqVar = zzatq.zzG;
            return Optional.of(zzatqVar);
        }
    }
}
