package com.google.android.gms.internal.ads;

import androidx.emoji2.text.u;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class zzhbk implements zzhjj {
    private final List zza;
    private final zzhjr zzb;
    private final zzhbk zzc;

    private zzhbk(List list, zzhjr zzhjrVar, zzhbk zzhbkVar) {
        this.zza = list;
        this.zzb = zzhjrVar;
        this.zzc = zzhbkVar;
    }

    public static final zzhbk zza(zzhql zzhqlVar) {
        if (zzhqlVar == null || zzhqlVar.zzc() <= 0) {
            throw new GeneralSecurityException("empty keyset");
        }
        return new zzhbk(zzi(zzhqlVar), zzhjr.zza);
    }

    public static final zzhbk zzf(zzhbp zzhbpVar) {
        zzhbf zzhbfVar = new zzhbf();
        zzhbd zzhbdVar = new zzhbd(zzhbpVar, null);
        zzhbdVar.zzb();
        zzhbdVar.zza();
        zzhbfVar.zza(zzhbdVar);
        return zzhbfVar.zzb();
    }

    public static /* synthetic */ zzhbk zzh(final zzhbk zzhbkVar) {
        final zzhjr zzhjrVar = zzhbkVar.zzb;
        if (zzhjrVar.zza()) {
            return zzhbkVar;
        }
        zzhbg zzhbgVar = new zzhbg() { // from class: com.google.android.gms.internal.ads.zzhbj
            @Override // com.google.android.gms.internal.ads.zzhbg
            public final /* synthetic */ void zza(zzhbi zzhbiVar) {
                zzhkb.zza().zzb().zza(zzhbk.this, zzhjrVar, "keyset_handle", "get_key");
            }
        };
        List<zzhbi> list = zzhbkVar.zza;
        ArrayList arrayList = new ArrayList(list.size());
        for (zzhbi zzhbiVar : list) {
            arrayList.add(new zzhbi(zzhbiVar.zzf(), zzhbiVar.zzj(), zzhbiVar.zzg(), zzhbiVar.zzh(), zzhbiVar.zzi(), zzhbgVar, null));
        }
        return new zzhbk(arrayList, zzhjrVar, zzhbkVar);
    }

    private static List zzi(zzhql zzhqlVar) {
        zzhaz zzhjoVar;
        boolean z4;
        zzhbg zzhbgVar;
        ArrayList arrayList = new ArrayList(zzhqlVar.zzc());
        for (zzhqk zzhqkVar : zzhqlVar.zzb()) {
            int zzc = zzhqkVar.zzc();
            try {
                zzhlb zzk = zzk(zzhqkVar);
                zzhkg zza = zzhkg.zza();
                zzhbt zza2 = zzhbt.zza();
                zzhjoVar = !zza.zzf(zzk) ? new zzhjo(zzk, zza2) : zza.zzg(zzk, zza2);
                z4 = false;
            } catch (GeneralSecurityException e4) {
                if (zzhib.zza.zza()) {
                    throw e4;
                }
                zzhjoVar = new zzhjo(zzk(zzhqkVar), zzhbt.zza());
                z4 = true;
            }
            if (zzhib.zza.zza() && !zzl(zzhqkVar.zzk())) {
                throw new GeneralSecurityException("Parsing of a single key failed (wrong status) and Tink is configured via validateKeysetsOnParsing to reject such keysets.");
            }
            boolean z5 = true;
            int zzk2 = zzhqkVar.zzk();
            if (zzc != zzhqlVar.zza()) {
                z5 = false;
            }
            zzhbgVar = zzhbi.zza;
            arrayList.add(new zzhbi(zzhjoVar, zzk2, zzc, z5, z4, zzhbgVar, null));
        }
        return Collections.unmodifiableList(arrayList);
    }

    private final zzhbk zzj() {
        zzhbk zzhbkVar = this.zzc;
        return zzhbkVar == null ? this : zzhbkVar;
    }

    private static zzhlb zzk(zzhqk zzhqkVar) {
        return zzhlb.zza(zzhqkVar.zzb().zza(), zzhqkVar.zzb().zzb(), zzhqkVar.zzb().zzc(), zzhqkVar.zzd(), zzhqkVar.zzd() == zzhqy.RAW ? null : Integer.valueOf(zzhqkVar.zzc()));
    }

    private static boolean zzl(int i5) {
        int i6 = i5 - 2;
        return i6 == 1 || i6 == 2 || i6 == 3;
    }

    public final String toString() {
        zzhql zzb = zzb();
        int i5 = zzhbw.zza;
        zzhqm zza = zzhqp.zza();
        zza.zza(zzb.zza());
        for (zzhqk zzhqkVar : zzb.zzb()) {
            zzhqn zza2 = zzhqo.zza();
            zza2.zza(zzhqkVar.zzb().zza());
            zza2.zzd(zzhqkVar.zzk());
            zza2.zzc(zzhqkVar.zzd());
            zza2.zzb(zzhqkVar.zzc());
            zza.zzb((zzhqo) zza2.zzbu());
        }
        return ((zzhqp) zza.zzbu()).toString();
    }

    public final zzhql zzb() {
        try {
            zzhqi zzh = zzhql.zzh();
            for (zzhbi zzhbiVar : this.zza) {
                zzhaz zza = zzhbiVar.zza();
                int zzj = zzhbiVar.zzj();
                int zzc = zzhbiVar.zzc();
                zzhlb zzhlbVar = (zzhlb) zzhkg.zza().zzh(zza, zzhlb.class, zzhbt.zza());
                Integer zzb = zza.zzb();
                if (zzb != null && zzb.intValue() != zzc) {
                    throw new GeneralSecurityException("Wrong ID set for key with ID requirement");
                }
                zzhqj zze = zzhqk.zze();
                zzhqa zzd = zzhqc.zzd();
                zzd.zza(zzhlbVar.zzg());
                zzd.zzb(zzhlbVar.zzb());
                zzd.zzc(zzhlbVar.zzc());
                zze.zzb(zzd);
                zze.zze(zzj);
                zze.zzc(zzc);
                zze.zzd(zzhlbVar.zzd());
                zzh.zzb((zzhqk) zze.zzbu());
                if (zzhbiVar.zzd()) {
                    zzh.zza(zzhbiVar.zzc());
                }
            }
            return (zzhql) zzh.zzbu();
        } catch (GeneralSecurityException e4) {
            throw new zzhlm(e4);
        }
    }

    public final zzhbi zzc() {
        for (zzhbi zzhbiVar : this.zza) {
            if (zzhbiVar != null && zzhbiVar.zzd()) {
                if (zzhbiVar.zzb() == zzhbb.zza) {
                    return zzhbiVar;
                }
                throw new IllegalStateException("Keyset has primary which isn't enabled");
            }
        }
        throw new IllegalStateException("Keyset has no valid primary");
    }

    @Override // com.google.android.gms.internal.ads.zzhjj
    public final int zzd() {
        return this.zza.size();
    }

    public final zzhbi zze(int i5) {
        if (i5 < 0 || i5 >= zzd()) {
            int zzd = zzd();
            throw new IndexOutOfBoundsException(s.c.c(new StringBuilder(String.valueOf(i5).length() + 34 + String.valueOf(zzd).length()), "Invalid index ", i5, " for keyset of size ", zzd));
        }
        List list = this.zza;
        zzhbi zzhbiVar = (zzhbi) list.get(i5);
        if (!zzl(zzhbiVar.zzj())) {
            throw new IllegalStateException(u.m(new StringBuilder(String.valueOf(i5).length() + 42), "Keyset-Entry at position ", i5, " has wrong status"));
        }
        if (zzhbiVar.zzi()) {
            throw new IllegalStateException(u.m(new StringBuilder(String.valueOf(i5).length() + 48), "Keyset-Entry at position ", i5, " didn't parse correctly"));
        }
        return (zzhbi) list.get(i5);
    }

    public final Object zzg(zzhaw zzhawVar, Class cls) {
        if (!(zzhawVar instanceof zzhix)) {
            throw new GeneralSecurityException("Currently only subclasses of InternalConfiguration are accepted");
        }
        zzhix zzhixVar = (zzhix) zzhawVar;
        zzhql zzb = zzj().zzb();
        int i5 = zzhbw.zza;
        int zza = zzb.zza();
        boolean z4 = true;
        int i6 = 0;
        boolean z5 = false;
        for (zzhqk zzhqkVar : zzb.zzb()) {
            if (zzhqkVar.zzk() == 3) {
                if (!zzhqkVar.zza()) {
                    throw new GeneralSecurityException(String.format("key %d has no key data", Integer.valueOf(zzhqkVar.zzc())));
                }
                if (zzhqkVar.zzd() == zzhqy.UNKNOWN_PREFIX) {
                    throw new GeneralSecurityException(String.format("key %d has unknown prefix", Integer.valueOf(zzhqkVar.zzc())));
                }
                if (zzhqkVar.zzk() == 2) {
                    throw new GeneralSecurityException(String.format("key %d has unknown status", Integer.valueOf(zzhqkVar.zzc())));
                }
                if (zzhqkVar.zzc() == zza) {
                    if (z5) {
                        throw new GeneralSecurityException("keyset contains multiple primary keys");
                    }
                    z5 = true;
                }
                z4 &= zzhqkVar.zzb().zzc() == zzhqb.ASYMMETRIC_PUBLIC;
                i6++;
            }
        }
        if (i6 == 0) {
            throw new GeneralSecurityException("keyset must contain at least one ENABLED key");
        }
        if (!z5 && !z4) {
            throw new GeneralSecurityException("keyset doesn't contain a valid primary key");
        }
        for (int i7 = 0; i7 < zzd(); i7++) {
            List list = this.zza;
            if (((zzhbi) list.get(i7)).zzi() || !zzl(((zzhbi) list.get(i7)).zzj())) {
                String zza2 = zzb.zzd(i7).zzb().zza();
                StringBuilder sb = new StringBuilder(String.valueOf(zza2).length() + String.valueOf(i7).length() + 44 + 32);
                sb.append("Key parsing of key with index ");
                sb.append(i7);
                sb.append(" and type_url ");
                sb.append(zza2);
                sb.append(" failed, unable to get primitive");
                throw new GeneralSecurityException(sb.toString());
            }
        }
        return zzhixVar.zza(zzj(), this.zzb, cls);
    }

    public /* synthetic */ zzhbk(List list, zzhjr zzhjrVar, byte[] bArr) {
        this(list, zzhjrVar);
    }

    private zzhbk(List list, zzhjr zzhjrVar) {
        this.zza = list;
        this.zzb = zzhjrVar;
        if (zzhib.zza.zza()) {
            HashSet hashSet = new HashSet();
            Iterator it = list.iterator();
            boolean z4 = false;
            while (it.hasNext()) {
                zzhbi zzhbiVar = (zzhbi) it.next();
                if (!hashSet.contains(Integer.valueOf(zzhbiVar.zzc()))) {
                    hashSet.add(Integer.valueOf(zzhbiVar.zzc()));
                    z4 |= zzhbiVar.zzd();
                } else {
                    int zzc = zzhbiVar.zzc();
                    throw new GeneralSecurityException(u.m(new StringBuilder(String.valueOf(zzc).length() + 121), "KeyID ", zzc, " is duplicated in the keyset, and Tink is configured to reject such keysets with the flag validateKeysetsOnParsing."));
                }
            }
            if (!z4) {
                throw new GeneralSecurityException("Primary key id not found in keyset, and Tink is configured to reject such keysets with the flag validateKeysetsOnParsing.");
            }
        }
        this.zzc = null;
    }
}
