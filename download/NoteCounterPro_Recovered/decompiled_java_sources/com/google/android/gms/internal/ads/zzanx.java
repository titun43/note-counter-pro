package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class zzanx implements zzamf {
    private final zzer zza = new zzer();
    private final zzano zzb = new zzano();

    @Override // com.google.android.gms.internal.ads.zzamf
    public final void zza(byte[] bArr, int i5, int i6, zzame zzameVar, zzdr zzdrVar) {
        zzer zzerVar = this.zza;
        zzerVar.zzb(bArr, i6 + i5);
        zzerVar.zzh(i5);
        ArrayList arrayList = new ArrayList();
        try {
            int zzg = zzerVar.zzg();
            Charset charset = StandardCharsets.UTF_8;
            String zzN = zzerVar.zzN(charset);
            if (zzN == null || !zzN.startsWith("WEBVTT")) {
                zzerVar.zzh(zzg);
                throw zzat.zzb("Expected WEBVTT. Got ".concat(String.valueOf(zzerVar.zzN(charset))), null);
            }
            while (!TextUtils.isEmpty(zzerVar.zzN(StandardCharsets.UTF_8))) {
            }
            ArrayList arrayList2 = new ArrayList();
            while (true) {
                char c5 = 65535;
                int i7 = 0;
                while (c5 == 65535) {
                    i7 = zzerVar.zzg();
                    String zzN2 = zzerVar.zzN(StandardCharsets.UTF_8);
                    c5 = zzN2 == null ? (char) 0 : "STYLE".equals(zzN2) ? (char) 2 : zzN2.startsWith("NOTE") ? (char) 1 : (char) 3;
                }
                zzerVar.zzh(i7);
                if (c5 == 0) {
                    zzalz.zza(new zzaoa(arrayList2), zzameVar, zzdrVar);
                    return;
                }
                if (c5 == 1) {
                    while (!TextUtils.isEmpty(zzerVar.zzN(StandardCharsets.UTF_8))) {
                    }
                } else if (c5 != 2) {
                    zzanq zza = zzanw.zza(zzerVar, arrayList);
                    if (zza != null) {
                        arrayList2.add(zza);
                    }
                } else {
                    if (!arrayList2.isEmpty()) {
                        throw new IllegalArgumentException("A style block was found after the first cue.");
                    }
                    zzerVar.zzN(StandardCharsets.UTF_8);
                    arrayList.addAll(this.zzb.zza(zzerVar));
                }
            }
        } catch (zzat e4) {
            throw new IllegalArgumentException(e4);
        }
    }
}
