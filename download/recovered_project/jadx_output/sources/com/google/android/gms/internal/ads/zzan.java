package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbgj;
import java.util.Arrays;
import java.util.Objects;

/* loaded from: classes.dex */
public final class zzan {
    public static final zzan zza = new zzan(new zzam());
    public final Integer zzA;
    public final zzguf zzB;
    public final CharSequence zzb;
    public final CharSequence zzc;
    public final CharSequence zzd;
    public final CharSequence zze;
    public final CharSequence zzf;
    public final byte[] zzg;
    public final Integer zzh;
    public final Integer zzi;
    public final Integer zzj;

    @Deprecated
    public final Integer zzk;
    public final Boolean zzl;

    @Deprecated
    public final Integer zzm;
    public final Integer zzn;
    public final Integer zzo;
    public final Integer zzp;
    public final Integer zzq;
    public final Integer zzr;
    public final Integer zzs;
    public final CharSequence zzt;
    public final CharSequence zzu;
    public final CharSequence zzv;
    public final Integer zzw;
    public final Integer zzx;
    public final CharSequence zzy;
    public final CharSequence zzz;

    static {
        String str = zzfj.zza;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
        Integer.toString(5, 36);
        Integer.toString(6, 36);
        Integer.toString(8, 36);
        Integer.toString(9, 36);
        Integer.toString(10, 36);
        Integer.toString(11, 36);
        Integer.toString(12, 36);
        Integer.toString(13, 36);
        Integer.toString(14, 36);
        Integer.toString(15, 36);
        Integer.toString(16, 36);
        Integer.toString(17, 36);
        Integer.toString(18, 36);
        Integer.toString(19, 36);
        Integer.toString(20, 36);
        Integer.toString(21, 36);
        Integer.toString(22, 36);
        Integer.toString(23, 36);
        Integer.toString(24, 36);
        Integer.toString(25, 36);
        Integer.toString(26, 36);
        Integer.toString(27, 36);
        Integer.toString(28, 36);
        Integer.toString(29, 36);
        Integer.toString(30, 36);
        Integer.toString(31, 36);
        Integer.toString(32, 36);
        Integer.toString(33, 36);
        Integer.toString(34, 36);
        Integer.toString(zzbgj.zzq.zzf, 36);
    }

    public /* synthetic */ zzan(zzam zzamVar, byte[] bArr) {
        this(zzamVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzan.class == obj.getClass()) {
            zzan zzanVar = (zzan) obj;
            if (Objects.equals(this.zzb, zzanVar.zzb) && Objects.equals(this.zzc, zzanVar.zzc) && Objects.equals(this.zzd, zzanVar.zzd) && Objects.equals(this.zze, zzanVar.zze) && Objects.equals(this.zzf, zzanVar.zzf) && Arrays.equals(this.zzg, zzanVar.zzg) && Objects.equals(this.zzh, zzanVar.zzh) && Objects.equals(this.zzi, zzanVar.zzi) && Objects.equals(this.zzj, zzanVar.zzj) && Objects.equals(this.zzk, zzanVar.zzk) && Objects.equals(this.zzl, zzanVar.zzl) && Objects.equals(this.zzn, zzanVar.zzn) && Objects.equals(this.zzo, zzanVar.zzo) && Objects.equals(this.zzp, zzanVar.zzp) && Objects.equals(this.zzq, zzanVar.zzq) && Objects.equals(this.zzr, zzanVar.zzr) && Objects.equals(this.zzs, zzanVar.zzs) && Objects.equals(this.zzt, zzanVar.zzt) && Objects.equals(this.zzu, zzanVar.zzu) && Objects.equals(this.zzv, zzanVar.zzv) && Objects.equals(this.zzw, zzanVar.zzw) && Objects.equals(this.zzx, zzanVar.zzx) && Objects.equals(this.zzy, zzanVar.zzy) && Objects.equals(this.zzz, zzanVar.zzz) && Objects.equals(this.zzA, zzanVar.zzA) && Objects.equals(this.zzB, zzanVar.zzB)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.zzb, this.zzc, this.zzd, this.zze, null, null, this.zzf, null, null, null, Integer.valueOf(Arrays.hashCode(this.zzg)), this.zzh, null, this.zzi, this.zzj, this.zzk, this.zzl, null, this.zzn, this.zzo, this.zzp, this.zzq, this.zzr, this.zzs, this.zzt, this.zzu, this.zzv, this.zzw, this.zzx, this.zzy, null, this.zzz, this.zzA, Boolean.TRUE, this.zzB);
    }

    public final zzam zza() {
        return new zzam(this, null);
    }

    private zzan(zzam zzamVar) {
        Boolean zzH = zzamVar.zzH();
        Integer zzV = zzamVar.zzV();
        Integer zzG = zzamVar.zzG();
        int i5 = 1;
        int i6 = 0;
        if (zzH != null) {
            if (!zzH.booleanValue()) {
                zzG = -1;
            } else if (zzG == null || zzG.intValue() == -1) {
                if (zzV != null) {
                    switch (zzV.intValue()) {
                        case zzbgj.zzt.zzm /* 21 */:
                            i5 = 2;
                            break;
                        case 22:
                            i5 = 3;
                            break;
                        case 23:
                            i5 = 4;
                            break;
                        case 24:
                            i5 = 5;
                            break;
                        case 25:
                            i5 = 6;
                            break;
                    }
                    zzG = Integer.valueOf(i5);
                }
                i5 = 0;
                zzG = Integer.valueOf(i5);
            }
        } else if (zzG != null) {
            boolean z4 = zzG.intValue() != -1;
            zzH = Boolean.valueOf(z4);
            if (z4 && zzV == null) {
                switch (zzG.intValue()) {
                    case 1:
                        break;
                    case 2:
                        i6 = 21;
                        break;
                    case 3:
                        i6 = 22;
                        break;
                    case 4:
                        i6 = 23;
                        break;
                    case 5:
                        i6 = 24;
                        break;
                    case 6:
                        i6 = 25;
                        break;
                    default:
                        i6 = 20;
                        break;
                }
                zzV = Integer.valueOf(i6);
            }
        } else {
            zzG = null;
        }
        this.zzb = zzamVar.zzx();
        this.zzc = zzamVar.zzy();
        this.zzd = zzamVar.zzz();
        this.zze = zzamVar.zzA();
        this.zzf = zzamVar.zzB();
        this.zzg = zzamVar.zzC();
        this.zzh = zzamVar.zzD();
        this.zzi = zzamVar.zzE();
        this.zzj = zzamVar.zzF();
        this.zzk = zzG;
        this.zzl = zzH;
        this.zzm = zzamVar.zzI();
        this.zzn = zzamVar.zzI();
        this.zzo = zzamVar.zzJ();
        this.zzp = zzamVar.zzK();
        this.zzq = zzamVar.zzL();
        this.zzr = zzamVar.zzM();
        this.zzs = zzamVar.zzN();
        this.zzt = zzamVar.zzO();
        this.zzu = zzamVar.zzP();
        this.zzv = zzamVar.zzQ();
        this.zzw = zzamVar.zzR();
        this.zzx = zzamVar.zzS();
        this.zzy = zzamVar.zzT();
        this.zzz = zzamVar.zzU();
        this.zzA = zzV;
        this.zzB = zzamVar.zzW();
    }
}
