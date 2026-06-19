package com.google.android.gms.internal.ads;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;

/* loaded from: classes.dex */
public final class zzhay implements zzhbl {
    private static final Charset zza = Charset.forName("UTF-8");
    private final InputStream zzb;

    private zzhay(InputStream inputStream) {
        this.zzb = inputStream;
    }

    public static zzhay zza(String str) {
        return new zzhay(new ByteArrayInputStream(str.getBytes(zza)));
    }

    private static int zzc(zzhyl zzhylVar) {
        if (!(zzhylVar instanceof zzhyp)) {
            throw new IOException("invalid key id: not a JSON primitive");
        }
        if (!zzhylVar.zzg().zzc()) {
            throw new IOException("invalid key id: not a JSON number");
        }
        try {
            long zzc = zzhja.zzc(zzhylVar.zzg().zzh());
            if (zzc > 4294967295L || zzc < -2147483648L) {
                throw new IOException("invalid key id");
            }
            return (int) zzc;
        } catch (NumberFormatException e4) {
            throw new IOException(e4);
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /* JADX WARN: Removed duplicated region for block: B:42:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0144 A[Catch: all -> 0x0033, IllegalStateException -> 0x0036, zzhyo -> 0x0039, TryCatch #1 {all -> 0x0033, blocks: (B:3:0x0014, B:4:0x0023, B:6:0x002d, B:8:0x003c, B:10:0x0053, B:12:0x005b, B:14:0x0065, B:16:0x006f, B:18:0x007b, B:20:0x0081, B:22:0x008f, B:24:0x0095, B:26:0x009b, B:28:0x00a1, B:30:0x00a9, B:40:0x00eb, B:44:0x0114, B:45:0x0137, B:47:0x0144, B:49:0x014a, B:51:0x0150, B:55:0x0191, B:57:0x01b4, B:64:0x019c, B:69:0x01a7, B:74:0x01b2, B:59:0x01d2, B:60:0x01db, B:79:0x01dc, B:80:0x01e3, B:88:0x011f, B:92:0x012a, B:96:0x0135, B:84:0x01e4, B:85:0x01ed, B:100:0x01ee, B:101:0x01f7, B:112:0x01f8, B:113:0x01ff, B:115:0x0200, B:116:0x0207, B:121:0x0208, B:124:0x0214, B:125:0x021b, B:126:0x021c, B:127:0x0223, B:128:0x0224, B:129:0x022b, B:136:0x022c, B:137:0x0231), top: B:2:0x0014 }] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01dc A[ADDED_TO_REGION, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01e4 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zzhbl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final zzhql zzb() {
        int i5;
        String zzd;
        zzhqy zzhqyVar;
        zzhyn zze;
        zzhqb zzhqbVar;
        String str = "status";
        String str2 = "keyData";
        try {
            try {
                InputStream inputStream = this.zzb;
                int i6 = zzhbw.zza;
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                byte[] bArr = new byte[1024];
                while (true) {
                    int read = inputStream.read(bArr);
                    InputStream inputStream2 = inputStream;
                    if (read == -1) {
                        break;
                    }
                    byteArrayOutputStream.write(bArr, 0, read);
                    inputStream = inputStream2;
                }
                zzhyn zze2 = zzhja.zzb(new String(byteArrayOutputStream.toByteArray(), zza)).zze();
                if (!zze2.zzc("key")) {
                    throw new zzhyo("invalid keyset: no key");
                }
                zzhyl zzh = zze2.zzh("key");
                if (!(zzh instanceof zzhyk)) {
                    throw new zzhyo("invalid keyset: key must be an array");
                }
                zzhyk zzf = zzh.zzf();
                if (zzf.zzb() == 0) {
                    throw new zzhyo("invalid keyset: key is empty");
                }
                zzhqi zzh2 = zzhql.zzh();
                if (zze2.zzc("primaryKeyId")) {
                    zzh2.zza(zzc(zze2.zzh("primaryKeyId")));
                }
                int i7 = 0;
                while (i7 < zzf.zzb()) {
                    zzhyn zze3 = zzf.zzc(i7).zze();
                    if (!zze3.zzc(str2) || !zze3.zzc(str) || !zze3.zzc("keyId") || !zze3.zzc("outputPrefixType")) {
                        throw new zzhyo("invalid key");
                    }
                    zzhyl zzh3 = zze3.zzh(str2);
                    if (!(zzh3 instanceof zzhyn)) {
                        throw new zzhyo("invalid key: keyData must be an object");
                    }
                    zzhqj zze4 = zzhqk.zze();
                    String zzd2 = zze3.zzh(str).zzd();
                    String str3 = str;
                    int hashCode = zzd2.hashCode();
                    String str4 = str2;
                    if (hashCode == -891611359) {
                        if (!zzd2.equals("ENABLED")) {
                            throw new zzhyo("unknown status: ".concat(zzd2));
                        }
                        i5 = 3;
                        zze4.zze(i5);
                        zze4.zzc(zzc(zze3.zzh("keyId")));
                        zzd = zze3.zzh("outputPrefixType").zzd();
                        switch (zzd.hashCode()) {
                            case -2053249079:
                                break;
                            case 80904:
                                break;
                            case 2575090:
                                break;
                            case 1761684556:
                                break;
                        }
                        throw new zzhyo("unknown output prefix type: ".concat(zzd));
                    }
                    if (hashCode == 478389753) {
                        if (!zzd2.equals("DESTROYED")) {
                            throw new zzhyo("unknown status: ".concat(zzd2));
                        }
                        i5 = 5;
                        zze4.zze(i5);
                        zze4.zzc(zzc(zze3.zzh("keyId")));
                        zzd = zze3.zzh("outputPrefixType").zzd();
                        switch (zzd.hashCode()) {
                            case -2053249079:
                                break;
                            case 80904:
                                break;
                            case 2575090:
                                break;
                            case 1761684556:
                                break;
                        }
                        throw new zzhyo("unknown output prefix type: ".concat(zzd));
                    }
                    if (hashCode == 1053567612 && zzd2.equals("DISABLED")) {
                        i5 = 4;
                        zze4.zze(i5);
                        zze4.zzc(zzc(zze3.zzh("keyId")));
                        zzd = zze3.zzh("outputPrefixType").zzd();
                        switch (zzd.hashCode()) {
                            case -2053249079:
                                if (!zzd.equals("LEGACY")) {
                                    break;
                                } else {
                                    zzhqyVar = zzhqy.LEGACY;
                                    zze4.zzd(zzhqyVar);
                                    zze = zzh3.zze();
                                    if (zze.zzc("typeUrl") || !zze.zzc("value") || !zze.zzc("keyMaterialType")) {
                                        throw new zzhyo("invalid keyData");
                                    }
                                    byte[] zza2 = zzhwq.zza(zze.zzh("value").zzd(), 2);
                                    zzhqa zzd3 = zzhqc.zzd();
                                    zzd3.zza(zze.zzh("typeUrl").zzd());
                                    zzian zzianVar = zzian.zza;
                                    zzd3.zzb(zzian.zzs(zza2, 0, zza2.length));
                                    String zzd4 = zze.zzh("keyMaterialType").zzd();
                                    switch (zzd4.hashCode()) {
                                        case -1881281466:
                                            if (!zzd4.equals("REMOTE")) {
                                                throw new zzhyo("unknown key material type: ".concat(zzd4));
                                            }
                                            zzhqbVar = zzhqb.REMOTE;
                                            break;
                                        case -1609477353:
                                            if (!zzd4.equals("SYMMETRIC")) {
                                                throw new zzhyo("unknown key material type: ".concat(zzd4));
                                            }
                                            zzhqbVar = zzhqb.SYMMETRIC;
                                            break;
                                        case 249237018:
                                            if (!zzd4.equals("ASYMMETRIC_PRIVATE")) {
                                                throw new zzhyo("unknown key material type: ".concat(zzd4));
                                            }
                                            zzhqbVar = zzhqb.ASYMMETRIC_PRIVATE;
                                            break;
                                        case 1534613202:
                                            if (!zzd4.equals("ASYMMETRIC_PUBLIC")) {
                                                throw new zzhyo("unknown key material type: ".concat(zzd4));
                                            }
                                            zzhqbVar = zzhqb.ASYMMETRIC_PUBLIC;
                                            break;
                                        default:
                                            throw new zzhyo("unknown key material type: ".concat(zzd4));
                                    }
                                    zzd3.zzc(zzhqbVar);
                                    zze4.zza((zzhqc) zzd3.zzbu());
                                    zzh2.zzb((zzhqk) zze4.zzbu());
                                    i7++;
                                    str = str3;
                                    str2 = str4;
                                }
                                break;
                            case 80904:
                                if (!zzd.equals("RAW")) {
                                    break;
                                } else {
                                    zzhqyVar = zzhqy.RAW;
                                    zze4.zzd(zzhqyVar);
                                    zze = zzh3.zze();
                                    if (zze.zzc("typeUrl")) {
                                        break;
                                    }
                                    throw new zzhyo("invalid keyData");
                                }
                            case 2575090:
                                if (!zzd.equals("TINK")) {
                                    break;
                                } else {
                                    zzhqyVar = zzhqy.TINK;
                                    zze4.zzd(zzhqyVar);
                                    zze = zzh3.zze();
                                    if (zze.zzc("typeUrl")) {
                                    }
                                    throw new zzhyo("invalid keyData");
                                }
                                break;
                            case 1761684556:
                                if (!zzd.equals("CRUNCHY")) {
                                    break;
                                } else {
                                    zzhqyVar = zzhqy.CRUNCHY;
                                    zze4.zzd(zzhqyVar);
                                    zze = zzh3.zze();
                                    if (zze.zzc("typeUrl")) {
                                    }
                                    throw new zzhyo("invalid keyData");
                                }
                                break;
                        }
                        throw new zzhyo("unknown output prefix type: ".concat(zzd));
                    }
                    throw new zzhyo("unknown status: ".concat(zzd2));
                }
                zzhql zzhqlVar = (zzhql) zzh2.zzbu();
                this.zzb.close();
                return zzhqlVar;
            } catch (Throwable th) {
                this.zzb.close();
                throw th;
            }
        } catch (zzhyo e4) {
            e = e4;
            throw new IOException(e);
        } catch (IllegalStateException e5) {
            e = e5;
            throw new IOException(e);
        }
    }
}
