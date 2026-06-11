package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class zzagp implements zzaeu {
    private static final int[] zza = {13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};
    private static final int[] zzb = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};
    private static final byte[] zzc;
    private static final byte[] zzd;
    private final byte[] zze;
    private final zzagh zzf;
    private boolean zzg;
    private long zzh;
    private int zzi;
    private int zzj;
    private int zzk;
    private int zzl;
    private long zzm;
    private zzaex zzn;
    private zzagh zzo;
    private zzagh zzp;
    private zzafy zzq;
    private long zzr;
    private boolean zzs;

    static {
        String str = zzfj.zza;
        Charset charset = StandardCharsets.UTF_8;
        zzc = "#!AMR\n".getBytes(charset);
        zzd = "#!AMR-WB\n".getBytes(charset);
    }

    public zzagp() {
        throw null;
    }

    private final boolean zzh(zzaev zzaevVar) {
        byte[] bArr = zzc;
        if (zzi(zzaevVar, bArr)) {
            this.zzg = false;
            zzaevVar.zzf(bArr.length);
            return true;
        }
        byte[] bArr2 = zzd;
        if (!zzi(zzaevVar, bArr2)) {
            return false;
        }
        this.zzg = true;
        zzaevVar.zzf(bArr2.length);
        return true;
    }

    private static boolean zzi(zzaev zzaevVar, byte[] bArr) {
        zzaevVar.zzl();
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        zzaevVar.zzi(bArr2, 0, length);
        return Arrays.equals(bArr2, bArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x003a A[Catch: EOFException -> 0x009f, TryCatch #0 {EOFException -> 0x009f, blocks: (B:13:0x0007, B:15:0x0018, B:23:0x003a, B:24:0x0043, B:30:0x003f, B:40:0x005d, B:41:0x0080, B:42:0x0081, B:43:0x009e), top: B:12:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x003f A[Catch: EOFException -> 0x009f, TryCatch #0 {EOFException -> 0x009f, blocks: (B:13:0x0007, B:15:0x0018, B:23:0x003a, B:24:0x0043, B:30:0x003f, B:40:0x005d, B:41:0x0080, B:42:0x0081, B:43:0x009e), top: B:12:0x0007 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final int zzj(zzaev zzaevVar) {
        int i5;
        int i6 = this.zzj;
        if (i6 == 0) {
            try {
                zzaevVar.zzl();
                byte[] bArr = this.zze;
                zzaevVar.zzi(bArr, 0, 1);
                byte b2 = bArr[0];
                if ((b2 & 131) > 0) {
                    StringBuilder sb = new StringBuilder(String.valueOf((int) b2).length() + 38);
                    sb.append("Invalid padding bits for frame header ");
                    sb.append((int) b2);
                    throw zzat.zzb(sb.toString(), null);
                }
                boolean z4 = this.zzg;
                int i7 = (b2 >> 3) & 15;
                if (z4) {
                    if (i7 >= 10) {
                        if (i7 > 13) {
                        }
                    }
                    i6 = !z4 ? zzb[i7] : zza[i7];
                    this.zzi = i6;
                    this.zzj = i6;
                    i5 = this.zzk;
                    if (i5 == -1) {
                        this.zzk = i6;
                        i5 = i6;
                    }
                    if (i5 == i6) {
                        this.zzl++;
                    }
                }
                if (!z4) {
                    if (i7 >= 12 && i7 <= 14) {
                    }
                    if (!z4) {
                    }
                    this.zzi = i6;
                    this.zzj = i6;
                    i5 = this.zzk;
                    if (i5 == -1) {
                    }
                    if (i5 == i6) {
                    }
                }
                String str = true != z4 ? "NB" : "WB";
                StringBuilder sb2 = new StringBuilder(String.valueOf(i7).length() + 26);
                sb2.append("Illegal AMR ");
                sb2.append(str);
                sb2.append(" frame type ");
                sb2.append(i7);
                throw zzat.zzb(sb2.toString(), null);
            } catch (EOFException unused) {
                return -1;
            }
        }
        int zza2 = this.zzp.zza(zzaevVar, i6, true);
        if (zza2 == -1) {
            return -1;
        }
        int i8 = this.zzj - zza2;
        this.zzj = i8;
        if (i8 > 0) {
            return 0;
        }
        this.zzp.zze(this.zzh, 1, this.zzi, 0, null);
        this.zzh += 20000;
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final boolean zza(zzaev zzaevVar) {
        return zzh(zzaevVar);
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final void zzc(zzaex zzaexVar) {
        this.zzn = zzaexVar;
        zzagh zzu = zzaexVar.zzu(0, 1);
        this.zzo = zzu;
        this.zzp = zzu;
        zzaexVar.zzv();
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final int zzd(zzaev zzaevVar, zzafv zzafvVar) {
        this.zzo.getClass();
        String str = zzfj.zza;
        if (zzaevVar.zzn() == 0 && !zzh(zzaevVar)) {
            throw zzat.zzb("Could not find AMR header.", null);
        }
        if (!this.zzs) {
            this.zzs = true;
            boolean z4 = this.zzg;
            String str2 = true != z4 ? "audio/amr" : "audio/amr-wb";
            String str3 = true != z4 ? "audio/3gpp" : "audio/amr-wb";
            int i5 = true != z4 ? 8000 : 16000;
            int i6 = z4 ? zzb[8] : zza[7];
            zzagh zzaghVar = this.zzo;
            zzt zztVar = new zzt();
            zztVar.zzl(str2);
            zztVar.zzm(str3);
            zztVar.zzn(i6);
            zztVar.zzE(1);
            zztVar.zzF(i5);
            zzaghVar.zzz(zztVar.zzM());
        }
        int zzj = zzj(zzaevVar);
        if (this.zzq == null) {
            zzafx zzafxVar = new zzafx(-9223372036854775807L, 0L);
            this.zzq = zzafxVar;
            this.zzn.zzw(zzafxVar);
        }
        return zzj == -1 ? -1 : 0;
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final void zze(long j2, long j5) {
        this.zzh = 0L;
        this.zzi = 0;
        this.zzj = 0;
        this.zzr = j5;
        this.zzm = 0L;
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final void zzf() {
    }

    public zzagp(int i5) {
        this.zze = new byte[1];
        this.zzk = -1;
        zzaer zzaerVar = new zzaer();
        this.zzf = zzaerVar;
        this.zzp = zzaerVar;
    }
}
