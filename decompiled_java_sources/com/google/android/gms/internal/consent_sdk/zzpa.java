package com.google.android.gms.internal.consent_sdk;

import com.google.android.gms.internal.consent_sdk.zzoz;
import com.google.android.gms.internal.consent_sdk.zzpa;
import java.io.IOException;
import java.io.OutputStream;
import s.c;

/* loaded from: classes.dex */
public abstract class zzpa<MessageType extends zzpa<MessageType, BuilderType>, BuilderType extends zzoz<MessageType, BuilderType>> implements zzrq {
    protected int zza = 0;

    public final void zzE(OutputStream outputStream) {
        int zzn = zzn();
        int i5 = zzpv.zzf;
        if (zzn > 4096) {
            zzn = 4096;
        }
        zzpt zzptVar = new zzpt(outputStream, zzn);
        zzB(zzptVar);
        zzptVar.zzI();
    }

    public int zzj(zzsa zzsaVar) {
        throw null;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzrq
    public final zzpm zzk() {
        try {
            int zzn = zzn();
            zzpm zzpmVar = zzpm.zzb;
            byte[] bArr = new byte[zzn];
            int i5 = zzpv.zzf;
            zzpr zzprVar = new zzpr(bArr, 0, zzn);
            zzB(zzprVar);
            if (zzprVar.zzb() == 0) {
                return new zzpk(bArr);
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e4) {
            throw new RuntimeException(c.b("Serializing ", getClass().getName(), " to a ByteString threw an IOException (should never happen)."), e4);
        }
    }
}
