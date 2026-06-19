package com.google.android.gms.internal.ads;

import java.io.UnsupportedEncodingException;
import java.util.Map;

/* loaded from: classes.dex */
public class zzatb extends zzary {
    private final Object zza;
    private final zzasd zzb;

    public zzatb(int i5, String str, zzasd zzasdVar, zzasc zzascVar) {
        super(i5, str, zzascVar);
        this.zza = new Object();
        this.zzb = zzasdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzary
    public final zzase zzr(zzaru zzaruVar) {
        String str;
        String str2;
        try {
            byte[] bArr = zzaruVar.zzb;
            Map map = zzaruVar.zzc;
            String str3 = "ISO-8859-1";
            if (map != null && (str2 = (String) map.get("Content-Type")) != null) {
                String[] split = str2.split(";", 0);
                int i5 = 1;
                while (true) {
                    if (i5 >= split.length) {
                        break;
                    }
                    String[] split2 = split[i5].trim().split("=", 0);
                    if (split2.length == 2 && split2[0].equals("charset")) {
                        str3 = split2[1];
                        break;
                    }
                    i5++;
                }
            }
            str = new String(bArr, str3);
        } catch (UnsupportedEncodingException unused) {
            str = new String(zzaruVar.zzb);
        }
        return zzase.zza(str, zzasv.zza(zzaruVar));
    }

    @Override // com.google.android.gms.internal.ads.zzary
    /* renamed from: zzz, reason: merged with bridge method [inline-methods] */
    public void zzs(String str) {
        zzasd zzasdVar;
        synchronized (this.zza) {
            zzasdVar = this.zzb;
        }
        zzasdVar.zza(str);
    }
}
