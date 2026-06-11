package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* loaded from: classes.dex */
public final class zzasp {
    protected static final Comparator zza = new zzaso();
    private final List zzb = new ArrayList();
    private final List zzc = new ArrayList(64);
    private int zzd = 0;

    public zzasp(int i5) {
    }

    private final synchronized void zzc() {
        while (this.zzd > 4096) {
            byte[] bArr = (byte[]) this.zzb.remove(0);
            this.zzc.remove(bArr);
            this.zzd -= bArr.length;
        }
    }

    public final synchronized byte[] zza(int i5) {
        int i6 = 0;
        while (true) {
            List list = this.zzc;
            if (i6 >= list.size()) {
                return new byte[i5];
            }
            byte[] bArr = (byte[]) list.get(i6);
            int length = bArr.length;
            if (length >= i5) {
                this.zzd -= length;
                list.remove(i6);
                this.zzb.remove(bArr);
                return bArr;
            }
            i6++;
        }
    }

    public final synchronized void zzb(byte[] bArr) {
        if (bArr != null) {
            int length = bArr.length;
            if (length <= 4096) {
                this.zzb.add(bArr);
                List list = this.zzc;
                int binarySearch = Collections.binarySearch(list, bArr, zza);
                if (binarySearch < 0) {
                    binarySearch = (-binarySearch) - 1;
                }
                list.add(binarySearch, bArr);
                this.zzd += length;
                zzc();
            }
        }
    }
}
