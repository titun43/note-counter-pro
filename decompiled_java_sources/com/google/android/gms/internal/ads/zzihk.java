package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.RequestConfiguration;

/* loaded from: classes.dex */
public final class zzihk extends zzibr implements zzidd {
    private static final zzihk zzl;
    private static volatile zzidk zzm;
    private int zza;
    private int zzb;
    private zzigl zzd;
    private zzigp zze;
    private int zzf;
    private int zzi;
    private byte zzk = 2;
    private String zzc = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    private zzibz zzg = zzibr.zzbC();
    private String zzh = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    private zzicd zzj = zzibr.zzbM();

    static {
        zzihk zzihkVar = new zzihk();
        zzl = zzihkVar;
        zzibr.zzbu(zzihk.class, zzihkVar);
    }

    private zzihk() {
    }

    public static zzihj zze() {
        return (zzihj) zzl.zzbn();
    }

    public final String zzc() {
        return this.zzc;
    }

    public final int zzd() {
        return this.zzj.size();
    }

    @Override // com.google.android.gms.internal.ads.zzibr
    public final Object zzdc(zzibq zzibqVar, Object obj, Object obj2) {
        zzidk zzidkVar;
        byte[] bArr = null;
        switch (zzibqVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.zzk);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.zzk = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return zzibr.zzbv(zzl, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0002\u0003\u0001ᔄ\u0000\u0002ဈ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005င\u0004\u0006\u0016\u0007ဈ\u0005\b᠌\u0006\t\u001a", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf", "zzg", "zzh", "zzi", zzihh.zza, "zzj"});
            case NEW_MUTABLE_INSTANCE:
                return new zzihk();
            case NEW_BUILDER:
                return new zzihj(bArr);
            case GET_DEFAULT_INSTANCE:
                return zzl;
            case GET_PARSER:
                zzidk zzidkVar2 = zzm;
                if (zzidkVar2 != null) {
                    return zzidkVar2;
                }
                synchronized (zzihk.class) {
                    try {
                        zzidkVar = zzm;
                        if (zzidkVar == null) {
                            zzidkVar = new zzibm(zzl);
                            zzm = zzidkVar;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return zzidkVar;
            default:
                throw null;
        }
    }

    public final /* synthetic */ void zzg(int i5) {
        this.zza |= 1;
        this.zzb = i5;
    }

    public final /* synthetic */ void zzh(String str) {
        str.getClass();
        this.zza |= 2;
        this.zzc = str;
    }

    public final /* synthetic */ void zzi(zzigl zziglVar) {
        zziglVar.getClass();
        this.zzd = zziglVar;
        this.zza |= 4;
    }

    public final /* synthetic */ void zzj(String str) {
        str.getClass();
        zzicd zzicdVar = this.zzj;
        if (!zzicdVar.zza()) {
            this.zzj = zzibr.zzbN(zzicdVar);
        }
        this.zzj.add(str);
    }

    public final /* synthetic */ void zzl(int i5) {
        this.zzi = i5 - 1;
        this.zza |= 64;
    }
}
