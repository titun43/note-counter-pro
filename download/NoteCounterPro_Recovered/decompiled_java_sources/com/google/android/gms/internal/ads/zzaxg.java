package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.internal.ads.zzbgj;

/* loaded from: classes.dex */
public final class zzaxg extends zzibr implements zzidd {
    private static final zzaxg zzbl;
    private static volatile zzidk zzbm;
    private long zzA;
    private long zzB;
    private long zzC;
    private long zzD;
    private long zzH;
    private long zzI;
    private long zzJ;
    private long zzL;
    private zzaxi zzO;
    private int zza;
    private zzaxb zzaF;
    private zzawz zzaG;
    private long zzaM;
    private long zzaN;
    private long zzaQ;
    private zzawq zzaR;
    private zzaws zzaS;
    private int zzaV;
    private zzaxd zzag;
    private zzaxf zzai;
    private int zzat;
    private int zzau;
    private int zzav;
    private int zzaw;
    private zzaxv zzax;
    private int zzb;
    private int zzba;
    private zzawo zzbb;
    private long zzbc;
    private boolean zzbf;
    private long zzbh;
    private zzaxt zzbi;
    private int zzc;
    private int zzd;
    private long zzg;
    private long zzh;
    private long zzi;
    private long zzj;
    private long zzk;
    private long zzl;
    private long zzm;
    private long zzn;
    private long zzo;
    private long zzp;
    private long zzv;
    private long zzw;
    private long zzx;
    private long zzy;
    private long zzz;
    private String zze = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    private String zzf = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    private String zzu = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    private String zzE = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    private String zzF = "D";
    private String zzG = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    private String zzK = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    private long zzM = -1;
    private long zzN = -1;
    private long zzP = -1;
    private long zzQ = -1;
    private long zzR = -1;
    private long zzS = -1;
    private long zzT = -1;
    private long zzU = -1;
    private String zzV = "D";
    private String zzW = "D";
    private long zzX = -1;
    private int zzY = zzbgj.zzq.zzf;
    private int zzZ = zzbgj.zzq.zzf;
    private long zzaa = -1;
    private long zzab = -1;
    private long zzac = -1;
    private long zzad = -1;
    private long zzae = -1;
    private int zzaf = zzbgj.zzq.zzf;
    private zzicd zzah = zzibr.zzbM();
    private long zzaj = -1;
    private long zzak = -1;
    private long zzal = -1;
    private long zzam = -1;
    private long zzan = -1;
    private long zzao = -1;
    private long zzap = -1;
    private long zzaq = -1;
    private String zzar = "D";
    private long zzas = -1;
    private long zzay = -1;
    private int zzaz = zzbgj.zzq.zzf;
    private int zzaA = zzbgj.zzq.zzf;
    private String zzaB = "D";
    private zzicd zzaC = zzibr.zzbM();
    private int zzaD = zzbgj.zzq.zzf;
    private zzicd zzaE = zzibr.zzbM();
    private String zzaH = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    private long zzaI = -1;
    private long zzaJ = -1;
    private long zzaK = -1;
    private long zzaL = -1;
    private long zzaO = -1;
    private String zzaP = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    private long zzaT = -1;
    private long zzaU = -1;
    private String zzaW = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    private String zzaX = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    private long zzaY = -1;
    private long zzaZ = -1;
    private String zzbd = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    private int zzbe = 2;
    private String zzbg = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    private long zzbj = -1;
    private String zzbk = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;

    static {
        zzaxg zzaxgVar = new zzaxg();
        zzbl = zzaxgVar;
        zzibr.zzbu(zzaxg.class, zzaxgVar);
    }

    private zzaxg() {
    }

    public static zzaxg zzi(byte[] bArr, zzibb zzibbVar) {
        return (zzaxg) zzibr.zzbV(zzbl, bArr, zzibbVar);
    }

    public static zzawg zzj() {
        return (zzawg) zzbl.zzbn();
    }

    public static zzaxg zzk() {
        return zzbl;
    }

    public final /* synthetic */ void zzA(String str) {
        str.getClass();
        this.zza |= 16777216;
        this.zzG = str;
    }

    public final /* synthetic */ void zzB(long j2) {
        this.zza |= 33554432;
        this.zzH = j2;
    }

    public final /* synthetic */ void zzC(long j2) {
        this.zza |= 67108864;
        this.zzI = j2;
    }

    public final /* synthetic */ void zzD(long j2) {
        this.zza |= 134217728;
        this.zzJ = j2;
    }

    public final /* synthetic */ void zzE(String str) {
        str.getClass();
        this.zza |= 268435456;
        this.zzK = str;
    }

    public final /* synthetic */ void zzF(long j2) {
        this.zza |= 536870912;
        this.zzL = j2;
    }

    public final /* synthetic */ void zzG(long j2) {
        this.zza |= 1073741824;
        this.zzM = j2;
    }

    public final /* synthetic */ void zzH(long j2) {
        this.zza |= Integer.MIN_VALUE;
        this.zzN = j2;
    }

    public final /* synthetic */ void zzI(long j2) {
        this.zzb |= 2;
        this.zzP = j2;
    }

    public final /* synthetic */ void zzJ(long j2) {
        this.zzb |= 4;
        this.zzQ = j2;
    }

    public final /* synthetic */ void zzK(long j2) {
        this.zzb |= 8;
        this.zzR = j2;
    }

    public final /* synthetic */ void zzL(long j2) {
        this.zzb |= 16;
        this.zzS = j2;
    }

    public final /* synthetic */ void zzM(long j2) {
        this.zzb |= 32;
        this.zzT = j2;
    }

    public final /* synthetic */ void zzN(long j2) {
        this.zzb |= 64;
        this.zzU = j2;
    }

    public final /* synthetic */ void zzO(String str) {
        str.getClass();
        this.zzb |= 128;
        this.zzV = str;
    }

    public final /* synthetic */ void zzP(String str) {
        str.getClass();
        this.zzb |= 256;
        this.zzW = str;
    }

    public final /* synthetic */ void zzQ(long j2) {
        this.zzb |= 4096;
        this.zzaa = j2;
    }

    public final /* synthetic */ void zzR(long j2) {
        this.zzb |= 8192;
        this.zzab = j2;
    }

    public final /* synthetic */ void zzS(long j2) {
        this.zzb |= 16384;
        this.zzac = j2;
    }

    public final /* synthetic */ void zzT(zzaxd zzaxdVar) {
        zzaxdVar.getClass();
        this.zzag = zzaxdVar;
        this.zzb |= 262144;
    }

    public final /* synthetic */ void zzU(zzaxd zzaxdVar) {
        zzaxdVar.getClass();
        zzicd zzicdVar = this.zzah;
        if (!zzicdVar.zza()) {
            this.zzah = zzibr.zzbN(zzicdVar);
        }
        this.zzah.add(zzaxdVar);
    }

    public final /* synthetic */ void zzV() {
        this.zzah = zzibr.zzbM();
    }

    public final /* synthetic */ void zzW(zzaxf zzaxfVar) {
        zzaxfVar.getClass();
        this.zzai = zzaxfVar;
        this.zzb |= 524288;
    }

    public final /* synthetic */ void zzX(long j2) {
        this.zzb |= 1048576;
        this.zzaj = j2;
    }

    public final /* synthetic */ void zzY(long j2) {
        this.zzb |= 2097152;
        this.zzak = j2;
    }

    public final /* synthetic */ void zzZ(long j2) {
        this.zzb |= 4194304;
        this.zzal = j2;
    }

    public final boolean zza() {
        return (this.zza & 4194304) != 0;
    }

    public final /* synthetic */ void zzaa(long j2) {
        this.zzb |= 8388608;
        this.zzam = j2;
    }

    public final /* synthetic */ void zzab(long j2) {
        this.zzb |= 16777216;
        this.zzan = j2;
    }

    public final /* synthetic */ void zzac(long j2) {
        this.zzb |= 67108864;
        this.zzap = j2;
    }

    public final /* synthetic */ void zzad(long j2) {
        this.zzb |= 134217728;
        this.zzaq = j2;
    }

    public final /* synthetic */ void zzae(String str) {
        str.getClass();
        this.zzb |= 268435456;
        this.zzar = str;
    }

    public final /* synthetic */ void zzaf(String str) {
        str.getClass();
        this.zzc |= 1024;
        this.zzaH = str;
    }

    public final /* synthetic */ void zzag(long j2) {
        this.zzc |= 2048;
        this.zzaI = j2;
    }

    public final /* synthetic */ void zzah(long j2) {
        this.zzc |= 4096;
        this.zzaJ = j2;
    }

    public final /* synthetic */ void zzai(long j2) {
        this.zzc |= 8192;
        this.zzaK = j2;
    }

    public final /* synthetic */ void zzaj(long j2) {
        this.zzc |= 16384;
        this.zzaL = j2;
    }

    public final /* synthetic */ void zzak(String str) {
        str.getClass();
        this.zzc |= 262144;
        this.zzaP = str;
    }

    public final /* synthetic */ void zzal(long j2) {
        this.zzc |= 8388608;
        this.zzaU = j2;
    }

    public final /* synthetic */ void zzam(long j2) {
        this.zzd |= 16;
        this.zzbh = j2;
    }

    public final /* synthetic */ void zzan(zzaxt zzaxtVar) {
        zzaxtVar.getClass();
        this.zzbi = zzaxtVar;
        this.zzd |= 32;
    }

    public final /* synthetic */ void zzap(int i5) {
        this.zzY = i5 - 1;
        this.zzb |= 1024;
    }

    public final /* synthetic */ void zzaq(int i5) {
        this.zzZ = i5 - 1;
        this.zzb |= 2048;
    }

    public final /* synthetic */ void zzar(int i5) {
        this.zzaf = i5 - 1;
        this.zzb |= 131072;
    }

    public final /* synthetic */ void zzas(int i5) {
        this.zzaz = i5 - 1;
        this.zzc |= 16;
    }

    public final /* synthetic */ void zzat(int i5) {
        this.zzaA = i5 - 1;
        this.zzc |= 32;
    }

    public final /* synthetic */ void zzau(int i5) {
        this.zzaV = i5 - 1;
        this.zzc |= 16777216;
    }

    public final String zzb() {
        return this.zzE;
    }

    public final boolean zzc() {
        return (this.zzb & 1048576) != 0;
    }

    public final long zzd() {
        return this.zzaj;
    }

    @Override // com.google.android.gms.internal.ads.zzibr
    public final Object zzdc(zzibq zzibqVar, Object obj, Object obj2) {
        zzidk zzidkVar;
        int ordinal = zzibqVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            zzibx zzibxVar = zzawk.zza;
            zzibx zzibxVar2 = zzaxo.zza;
            return zzibr.zzbv(zzbl, "\u0001k\u0000\u0004\u0001Įk\u0000\u0003\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u0007ဂ\u0006\bဂ\u0007\tဂ\b\nဂ\t\u000bဂ\n\fဂ\u000b\rဈ\f\u000eဂ\r\u000fဂ\u000e\u0010ဂ\u000f\u0011ဂ\u0010\u0012ဂ\u0011\u0013ဂ\u0012\u0014ဂ\u0013\u0015ဂ_\u0016ဂ\u0014\u0017ဂ\u0015\u0018ဈ`\u0019ဂd\u001a᠌a\u001bဈ\u0016\u001cဇb\u001dဈ\u0018\u001eဈc\u001fဂ\u0019 ဂ\u001a!ဂ\u001b\"ဈ\u001c#ဂ\u001d$ဂ\u001e%ဂ\u001f&ဉ 'ဂ!(ဂ\")ဂ#*ဂ$+\u001b,ဂ%-ဂ&.ဈ'/ဈ(0᠌*1᠌+2ဉ23ဂ,4ဂ-5ဂ.6ဂ/7ဂ08᠌19ဉ3:ဂ4;ဂ5<ဂ6=ဂ7>ဂ:?ဂ;@ဂ=A᠌>B᠌?Cဈ<D᠌AEဉBFဂCGဂ8Hဂ9I᠌DJဂ)Kဈ\u0017L᠌EMဈFN\u001bO᠌GP\u001bQဉHRဈJSဂKTဂLUဂMVဂNWဂOXဂQYဈRZဉT[ဉU\\ဂV]ဂW^᠌X_᠌@`ဉIaဂPbဈYcဈZdဂ[eဂ\\f᠌]gဂShဉ^ÉဉeĭဂfĮဈg", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", "zzu", "zzv", "zzw", "zzx", "zzy", "zzz", "zzA", "zzB", "zzbc", "zzC", "zzD", "zzbd", "zzbh", "zzbe", zzibxVar, "zzE", "zzbf", "zzG", "zzbg", "zzH", "zzI", "zzJ", "zzK", "zzL", "zzM", "zzN", "zzO", "zzP", "zzQ", "zzR", "zzS", "zzah", zzaxd.class, "zzT", "zzU", "zzV", "zzW", "zzY", zzibxVar2, "zzZ", zzibxVar2, "zzag", "zzaa", "zzab", "zzac", "zzad", "zzae", "zzaf", zzibxVar2, "zzai", "zzaj", "zzak", "zzal", "zzam", "zzap", "zzaq", "zzas", "zzat", zzaxn.zza, "zzau", zzaxr.zza, "zzar", "zzaw", zzawh.zza, "zzax", "zzay", "zzan", "zzao", "zzaz", zzibxVar2, "zzX", "zzF", "zzaA", zzibxVar2, "zzaB", "zzaC", zzawx.class, "zzaD", zzibxVar2, "zzaE", zzawj.class, "zzaF", "zzaH", "zzaI", "zzaJ", "zzaK", "zzaL", "zzaM", "zzaO", "zzaP", "zzaR", "zzaS", "zzaT", "zzaU", "zzaV", zzawt.zza, "zzav", zzawl.zza, "zzaG", "zzaN", "zzaW", "zzaX", "zzaY", "zzaZ", "zzba", zzawv.zza, "zzaQ", "zzbb", "zzbi", "zzbj", "zzbk"});
        }
        if (ordinal == 3) {
            return new zzaxg();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new zzawg(bArr);
        }
        if (ordinal == 5) {
            return zzbl;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzidk zzidkVar2 = zzbm;
        if (zzidkVar2 != null) {
            return zzidkVar2;
        }
        synchronized (zzaxg.class) {
            try {
                zzidkVar = zzbm;
                if (zzidkVar == null) {
                    zzidkVar = new zzibm(zzbl);
                    zzbm = zzidkVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzidkVar;
    }

    public final long zze() {
        return this.zzan;
    }

    public final boolean zzg() {
        return (this.zzd & 32) != 0;
    }

    public final zzaxt zzh() {
        zzaxt zzaxtVar = this.zzbi;
        return zzaxtVar == null ? zzaxt.zze() : zzaxtVar;
    }

    public final /* synthetic */ void zzl(String str) {
        str.getClass();
        this.zza |= 1;
        this.zze = str;
    }

    public final /* synthetic */ void zzm(String str) {
        str.getClass();
        this.zza |= 2;
        this.zzf = str;
    }

    public final /* synthetic */ void zzn(long j2) {
        this.zza |= 4;
        this.zzg = j2;
    }

    public final /* synthetic */ void zzo(long j2) {
        this.zza |= 16;
        this.zzi = j2;
    }

    public final /* synthetic */ void zzp(long j2) {
        this.zza |= 32;
        this.zzj = j2;
    }

    public final /* synthetic */ void zzq(long j2) {
        this.zza |= 1024;
        this.zzo = j2;
    }

    public final /* synthetic */ void zzr(long j2) {
        this.zza |= 2048;
        this.zzp = j2;
    }

    public final /* synthetic */ void zzs(long j2) {
        this.zza |= 8192;
        this.zzv = j2;
    }

    public final /* synthetic */ void zzt(long j2) {
        this.zza |= 16384;
        this.zzw = j2;
    }

    public final /* synthetic */ void zzu(long j2) {
        this.zza |= 32768;
        this.zzx = j2;
    }

    public final /* synthetic */ void zzv(long j2) {
        this.zza |= 65536;
        this.zzy = j2;
    }

    public final /* synthetic */ void zzw(long j2) {
        this.zza |= 524288;
        this.zzB = j2;
    }

    public final /* synthetic */ void zzx(long j2) {
        this.zza |= 1048576;
        this.zzC = j2;
    }

    public final /* synthetic */ void zzy(long j2) {
        this.zza |= 2097152;
        this.zzD = j2;
    }

    public final /* synthetic */ void zzz(String str) {
        str.getClass();
        this.zza |= 4194304;
        this.zzE = str;
    }
}
