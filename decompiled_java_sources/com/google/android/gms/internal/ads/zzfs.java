package com.google.android.gms.internal.ads;

import androidx.emoji2.text.u;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public final class zzfs implements zzao {
    public final String zza;
    public final byte[] zzb;
    public final int zzc;
    public final int zzd;

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0032, code lost:
    
        if (r8 != 78) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0037, code lost:
    
        if (r6.length != 8) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0039, code lost:
    
        r8 = 78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x003d, code lost:
    
        com.google.android.gms.internal.ads.zzgrc.zza(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003b, code lost:
    
        r8 = 78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003c, code lost:
    
        r1 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x002e, code lost:
    
        if (r5.equals("auxiliary.tracks.length") != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0025, code lost:
    
        if (r5.equals("auxiliary.tracks.offset") != false) goto L16;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public zzfs(String str, byte[] bArr, int i5, int i6) {
        byte b2;
        switch (str.hashCode()) {
            case -1949883051:
                if (str.equals("com.android.capture.fps")) {
                    if (i6 == 23) {
                        if (bArr.length == 4) {
                            i6 = 23;
                            zzgrc.zza(r1);
                            break;
                        } else {
                            i6 = 23;
                        }
                    }
                    r1 = false;
                    zzgrc.zza(r1);
                }
                break;
            case -269399509:
                if (str.equals("auxiliary.tracks.interleaved")) {
                    if (i6 == 75) {
                        if (bArr.length == 1 && ((b2 = bArr[0]) == 0 || b2 == 1)) {
                            i6 = 75;
                            zzgrc.zza(r1);
                            break;
                        } else {
                            i6 = 75;
                        }
                    }
                    r1 = false;
                    zzgrc.zza(r1);
                }
                break;
            case 1011693540:
                break;
            case 1098277265:
                break;
            case 2002123038:
                if (str.equals("auxiliary.tracks.map")) {
                    zzgrc.zza(i6 == 0);
                    break;
                }
                break;
        }
        this.zza = str;
        this.zzb = bArr;
        this.zzc = i5;
        this.zzd = i6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzfs.class == obj.getClass()) {
            zzfs zzfsVar = (zzfs) obj;
            if (this.zza.equals(zzfsVar.zza) && Arrays.equals(this.zzb, zzfsVar.zzb) && this.zzc == zzfsVar.zzc && this.zzd == zzfsVar.zzd) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.zza.hashCode() + 527;
        return ((((Arrays.hashCode(this.zzb) + (hashCode * 31)) * 31) + this.zzc) * 31) + this.zzd;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0087 A[LOOP:0: B:18:0x0084->B:20:0x0087, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String toString() {
        String sb;
        byte[] bArr;
        int i5 = this.zzd;
        if (i5 == 0) {
            if (this.zza.equals("auxiliary.tracks.map")) {
                List zzb = zzb();
                StringBuilder sb2 = new StringBuilder();
                sb2.append("track types = ");
                zzgqw.zzb(sb2, zzb, ",");
                sb = sb2.toString();
            }
            bArr = this.zzb;
            String str = zzfj.zza;
            int length = bArr.length;
            StringBuilder sb3 = new StringBuilder(length + length);
            while (r1 < bArr.length) {
            }
            sb = sb3.toString();
        } else if (i5 == 1) {
            sb = zzfj.zzi(this.zzb);
        } else if (i5 == 23) {
            sb = String.valueOf(Float.intBitsToFloat(zzgxz.zzd(this.zzb)));
        } else if (i5 == 67) {
            sb = String.valueOf(zzgxz.zzd(this.zzb));
        } else if (i5 != 75) {
            if (i5 == 78) {
                sb = String.valueOf(new zzer(this.zzb).zzJ());
            }
            bArr = this.zzb;
            String str2 = zzfj.zza;
            int length2 = bArr.length;
            StringBuilder sb32 = new StringBuilder(length2 + length2);
            for (int i6 = 0; i6 < bArr.length; i6++) {
                sb32.append(Character.forDigit((bArr[i6] >> 4) & 15, 16));
                sb32.append(Character.forDigit(bArr[i6] & 15, 16));
            }
            sb = sb32.toString();
        } else {
            sb = String.valueOf(this.zzb[0] & 255);
        }
        String str3 = this.zza;
        return u.n(new StringBuilder(String.valueOf(str3).length() + 18 + String.valueOf(sb).length()), "mdta: key=", str3, ", value=", sb);
    }

    public final List zzb() {
        zzgrc.zzj(this.zza.equals("auxiliary.tracks.map"), "Metadata is not an auxiliary tracks map");
        byte[] bArr = this.zzb;
        byte b2 = bArr[1];
        ArrayList arrayList = new ArrayList();
        for (int i5 = 0; i5 < b2; i5++) {
            arrayList.add(Integer.valueOf(bArr[i5 + 2]));
        }
        return arrayList;
    }
}
