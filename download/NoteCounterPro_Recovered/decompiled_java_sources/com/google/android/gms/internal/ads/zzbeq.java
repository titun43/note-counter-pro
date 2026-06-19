package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.RequestConfiguration;
import java.io.IOException;
import java.text.Normalizer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;

/* loaded from: classes.dex */
public final class zzbeq {
    private final zzbeg zza;
    private final int zzb;
    private final int zzc;

    public zzbeq(int i5, int i6, int i7) {
        this.zzb = i5;
        i6 = (i6 > 64 || i6 < 0) ? 64 : i6;
        if (i7 <= 0) {
            this.zzc = 1;
        } else {
            this.zzc = i7;
        }
        this.zza = new zzbeo(i6);
    }

    public final String zza(ArrayList arrayList, ArrayList arrayList2) {
        Collections.sort(arrayList2, new zzbep(this));
        HashSet hashSet = new HashSet();
        loop0: for (int i5 = 0; i5 < arrayList2.size(); i5++) {
            String[] split = Normalizer.normalize((CharSequence) arrayList.get(((zzbef) arrayList2.get(i5)).zze()), Normalizer.Form.NFKC).toLowerCase(Locale.US).split("\n");
            if (split.length != 0) {
                for (String str : split) {
                    if (str.contains("'")) {
                        StringBuilder sb = new StringBuilder(str);
                        int i6 = 1;
                        boolean z4 = false;
                        while (true) {
                            int i7 = i6 + 2;
                            if (i7 > sb.length()) {
                                break;
                            }
                            if (sb.charAt(i6) == '\'') {
                                if (sb.charAt(i6 - 1) != ' ') {
                                    int i8 = i6 + 1;
                                    if ((sb.charAt(i8) == 's' || sb.charAt(i8) == 'S') && (i7 == sb.length() || sb.charAt(i7) == ' ')) {
                                        sb.insert(i6, ' ');
                                        i6 = i7;
                                        z4 = true;
                                    }
                                }
                                sb.setCharAt(i6, ' ');
                                z4 = true;
                            }
                            i6++;
                        }
                        String sb2 = z4 ? sb.toString() : null;
                        if (sb2 != null) {
                            str = sb2;
                        }
                    }
                    String[] zzb = zzbek.zzb(str, true);
                    int length = zzb.length;
                    int i9 = this.zzc;
                    if (length >= i9) {
                        for (int i10 = 0; i10 < zzb.length; i10++) {
                            String str2 = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
                            for (int i11 = 0; i11 < i9; i11++) {
                                int i12 = i10 + i11;
                                if (i12 >= zzb.length) {
                                    break;
                                }
                                if (i11 > 0) {
                                    str2 = str2.concat(" ");
                                }
                                str2 = str2.concat(String.valueOf(zzb[i12]));
                            }
                            hashSet.add(str2);
                            if (hashSet.size() >= this.zzb) {
                                break loop0;
                            }
                        }
                        if (hashSet.size() >= this.zzb) {
                            break loop0;
                        }
                    }
                }
            }
        }
        zzbei zzbeiVar = new zzbei();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            try {
                zzbeiVar.zzb.write(this.zza.zza((String) it.next()));
            } catch (IOException e4) {
                int i13 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzg("Error while writing hash to byteStream", e4);
            }
        }
        return zzbeiVar.toString();
    }
}
