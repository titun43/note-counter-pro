package com.google.android.gms.internal.ads;

import androidx.emoji2.text.u;

@Deprecated
/* loaded from: classes.dex */
public class zzaib implements zzao {
    public final String zza;
    public final String zzb;

    public zzaib(String str, String str2) {
        this.zza = zzgql.zzb(str);
        this.zzb = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzaib zzaibVar = (zzaib) obj;
            if (this.zza.equals(zzaibVar.zza) && this.zzb.equals(zzaibVar.zzb)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.zza.hashCode() + 527;
        return this.zzb.hashCode() + (hashCode * 31);
    }

    public final String toString() {
        String str = this.zza;
        int length = String.valueOf(str).length();
        String str2 = this.zzb;
        return u.n(new StringBuilder(length + 5 + String.valueOf(str2).length()), "VC: ", str, "=", str2);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.android.gms.internal.ads.zzao
    public final void zza(zzam zzamVar) {
        Integer zzh;
        Integer zzh2;
        Integer zzh3;
        Integer zzh4;
        String str = this.zza;
        switch (str.hashCode()) {
            case -1935137620:
                if (str.equals("TOTALTRACKS") && (zzh = zzgxz.zzh(this.zzb, 10)) != null) {
                    zzamVar.zzh(zzh);
                    break;
                }
                break;
            case -215998278:
                if (str.equals("TOTALDISCS") && (zzh2 = zzgxz.zzh(this.zzb, 10)) != null) {
                    zzamVar.zzs(zzh2);
                    break;
                }
                break;
            case -113312716:
                if (str.equals("TRACKNUMBER") && (zzh3 = zzgxz.zzh(this.zzb, 10)) != null) {
                    zzamVar.zzg(zzh3);
                    break;
                }
                break;
            case 62359119:
                if (str.equals("ALBUM")) {
                    zzamVar.zzc(this.zzb);
                    break;
                }
                break;
            case 67703139:
                if (str.equals("GENRE")) {
                    zzamVar.zzt(this.zzb);
                    break;
                }
                break;
            case 79833656:
                if (str.equals("TITLE")) {
                    zzamVar.zza(this.zzb);
                    break;
                }
                break;
            case 428414940:
                if (str.equals("DESCRIPTION")) {
                    zzamVar.zze(this.zzb);
                    break;
                }
                break;
            case 993300766:
                if (str.equals("DISCNUMBER") && (zzh4 = zzgxz.zzh(this.zzb, 10)) != null) {
                    zzamVar.zzr(zzh4);
                    break;
                }
                break;
            case 1746739798:
                if (str.equals("ALBUMARTIST")) {
                    zzamVar.zzd(this.zzb);
                    break;
                }
                break;
            case 1939198791:
                if (str.equals("ARTIST")) {
                    zzamVar.zzb(this.zzb);
                    break;
                }
                break;
        }
    }
}
