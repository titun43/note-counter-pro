package com.google.android.gms.internal.ads;

import android.util.Base64;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class zzagn {
    public static int zza(int i5) {
        int i6 = 0;
        while (i5 > 0) {
            i5 >>>= 1;
            i6++;
        }
        return i6;
    }

    public static zzagk zzb(zzer zzerVar, boolean z4, boolean z5) {
        if (z4) {
            zzd(3, zzerVar, false);
        }
        String zzK = zzerVar.zzK((int) zzerVar.zzA(), StandardCharsets.UTF_8);
        int length = zzK.length();
        long zzA = zzerVar.zzA();
        String[] strArr = new String[(int) zzA];
        int i5 = length + 15;
        for (int i6 = 0; i6 < zzA; i6++) {
            String zzK2 = zzerVar.zzK((int) zzerVar.zzA(), StandardCharsets.UTF_8);
            strArr[i6] = zzK2;
            i5 = i5 + 4 + zzK2.length();
        }
        if (z5 && (zzerVar.zzs() & 1) == 0) {
            throw zzat.zzb("framing bit expected to be set", null);
        }
        return new zzagk(zzK, strArr, i5 + 1);
    }

    public static zzap zzc(List list) {
        ArrayList arrayList = new ArrayList();
        for (int i5 = 0; i5 < list.size(); i5++) {
            String str = (String) list.get(i5);
            String str2 = zzfj.zza;
            String[] split = str.split("=", 2);
            if (split.length != 2) {
                zzee.zzc("VorbisUtil", "Failed to parse Vorbis comment: ".concat(str));
            } else if (split[0].equals("METADATA_BLOCK_PICTURE")) {
                try {
                    arrayList.add(zzaia.zzb(new zzer(Base64.decode(split[1], 0))));
                } catch (RuntimeException e4) {
                    zzee.zzd("VorbisUtil", "Failed to parse vorbis picture", e4);
                }
            } else {
                arrayList.add(new zzaiy(split[0], split[1]));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new zzap(arrayList);
    }

    public static boolean zzd(int i5, zzer zzerVar, boolean z4) {
        if (zzerVar.zzd() < 7) {
            if (z4) {
                return false;
            }
            int zzd = zzerVar.zzd();
            StringBuilder sb = new StringBuilder(String.valueOf(zzd).length() + 18);
            sb.append("too short header: ");
            sb.append(zzd);
            throw zzat.zzb(sb.toString(), null);
        }
        if (zzerVar.zzs() != i5) {
            if (z4) {
                return false;
            }
            throw zzat.zzb("expected header type ".concat(String.valueOf(Integer.toHexString(i5))), null);
        }
        if (zzerVar.zzs() == 118 && zzerVar.zzs() == 111 && zzerVar.zzs() == 114 && zzerVar.zzs() == 98 && zzerVar.zzs() == 105 && zzerVar.zzs() == 115) {
            return true;
        }
        if (z4) {
            return false;
        }
        throw zzat.zzb("expected characters 'vorbis'", null);
    }
}
