package com.google.android.gms.internal.ads;

import java.io.InputStream;
import java.io.OutputStream;
import k0.i;
import t3.h;

/* loaded from: classes.dex */
public final class zzfzb implements i {
    public static final zzfzb zza = new zzfzb();
    private static final zzfyy zzb;

    static {
        zzfyy zzd = zzfyy.zzd();
        g4.i.d(zzd, "getDefaultInstance(...)");
        zzb = zzd;
    }

    private zzfzb() {
    }

    @Override // k0.i
    public final /* synthetic */ Object getDefaultValue() {
        return zzb;
    }

    @Override // k0.i
    public final Object readFrom(InputStream inputStream, w3.c cVar) {
        try {
            zzfyy zzc = zzfyy.zzc(inputStream);
            g4.i.b(zzc);
            return zzc;
        } catch (Exception unused) {
            return zzb;
        }
    }

    @Override // k0.i
    public final /* synthetic */ Object writeTo(Object obj, OutputStream outputStream, w3.c cVar) {
        ((zzfyy) obj).zzaO(outputStream);
        return h.f3400a;
    }
}
