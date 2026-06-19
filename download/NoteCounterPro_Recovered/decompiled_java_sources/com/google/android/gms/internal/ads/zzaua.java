package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzaua implements zzaty {
    private int zza = (((((~1539942439) & 2070175971) | 1100945533) + ((1539942439 & (-1166483302)) | (-2145608135))) - 96382817) ^ (1143565421 % 981914693);
    private final byte[] zzb = new byte[(((((~991039875) & 475472926) | 1225689584) + ((991039875 & 357672014) | 1805818736)) - (-1256743880)) ^ (1671581032 % 1337434154)];
    private final zzauc zzc;

    public zzaua(zzauc zzaucVar) {
        this.zzc = zzaucVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaty
    public final byte zza(zzauk zzaukVar, int i5) {
        int i6 = ((((~1264448664) & 231739608) | 1128901767) + ((1264448664 & 479203675) | 860794247)) - 1823332376;
        int i7 = 1761855727 % 1384724137;
        int i8 = (((((~143154913) & 992498304) | 439467622) + ((143154913 & 1627930754) | 1212551295)) - (-2089988634)) ^ (2033018190 % 70061690);
        int i9 = ((((~1661299468) & 613450408) | 2017391535) + ((1661299468 & 109051904) | 2071555381)) - (-441392543);
        int i10 = 1694830070 % 1383960411;
        int i11 = i5 >>> i8;
        if (i11 != this.zza) {
            this.zzc.zza(i11, this.zzb);
            this.zza = i11;
        }
        int i12 = i9 ^ i10;
        return (byte) (((zzaukVar.zzb(i5) ^ this.zzb[i5 % (i6 ^ i7)]) << i12) >> i12);
    }

    @Override // com.google.android.gms.internal.ads.zzaty
    public final zzauk zzb(zzauk zzaukVar, int i5, int i6) {
        if (i5 < 0 || i5 > i6 || i6 > zzaukVar.zza.length) {
            throw new IndexOutOfBoundsException();
        }
        byte[] bArr = new byte[i6 - i5];
        int i7 = 0;
        while (i5 < i6) {
            bArr[i7] = zza(zzaukVar, i5);
            i5++;
            i7++;
        }
        return zzauk.zze(bArr);
    }

    @Override // com.google.android.gms.internal.ads.zzaty
    public final /* bridge */ /* synthetic */ zzaty zzc() {
        return new zzaua(this.zzc);
    }
}
