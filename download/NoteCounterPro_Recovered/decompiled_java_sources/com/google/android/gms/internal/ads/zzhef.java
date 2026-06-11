package com.google.android.gms.internal.ads;

import androidx.fragment.app.h1;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes.dex */
public final class zzhef implements zzhas {
    public static final /* synthetic */ int zza = 0;
    private static final byte[] zzb = new byte[0];
    private static final Set zze;
    private final String zzc;
    private final zzhas zzd;

    static {
        HashSet hashSet = new HashSet();
        hashSet.add("type.googleapis.com/google.crypto.tink.AesGcmKey");
        hashSet.add("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key");
        hashSet.add("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key");
        hashSet.add("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey");
        hashSet.add("type.googleapis.com/google.crypto.tink.AesGcmSivKey");
        hashSet.add("type.googleapis.com/google.crypto.tink.AesEaxKey");
        zze = Collections.unmodifiableSet(hashSet);
    }

    @Deprecated
    public zzhef(zzhqf zzhqfVar, zzhas zzhasVar) {
        if (!zze.contains(zzhqfVar.zza())) {
            String zza2 = zzhqfVar.zza();
            throw new IllegalArgumentException(h1.b(new StringBuilder(String.valueOf(zza2).length() + 67), "Unsupported DEK key type: ", zza2, ". Only Tink AEAD key types are supported."));
        }
        this.zzc = zzhqfVar.zza();
        zzhqe zzg = zzhqf.zzg(zzhqfVar);
        zzg.zzc(zzhqy.RAW);
        zzhbv.zzb(((zzhqf) zzg.zzbu()).zzaN());
        this.zzd = zzhasVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhas
    public final byte[] zza(byte[] bArr, byte[] bArr2) {
        try {
            ByteBuffer wrap = ByteBuffer.wrap(bArr);
            int i5 = wrap.getInt();
            if (i5 <= 0 || i5 > 4096 || i5 > bArr.length - 4) {
                throw new GeneralSecurityException("length of encrypted DEK too large");
            }
            byte[] bArr3 = new byte[i5];
            wrap.get(bArr3, 0, i5);
            byte[] bArr4 = new byte[wrap.remaining()];
            wrap.get(bArr4, 0, wrap.remaining());
            byte[] zza2 = this.zzd.zza(bArr3, zzb);
            String str = this.zzc;
            zzian zzianVar = zzian.zza;
            return ((zzhas) zzhkd.zza().zzd(zzhkg.zza().zzg(zzhlb.zza(str, zzian.zzs(zza2, 0, zza2.length), zzhqb.SYMMETRIC, zzhqy.RAW, null), zzhax.zza()), zzhas.class)).zza(bArr4, bArr2);
        } catch (IndexOutOfBoundsException e4) {
            e = e4;
            throw new GeneralSecurityException("invalid ciphertext", e);
        } catch (NegativeArraySizeException e5) {
            e = e5;
            throw new GeneralSecurityException("invalid ciphertext", e);
        } catch (BufferUnderflowException e6) {
            e = e6;
            throw new GeneralSecurityException("invalid ciphertext", e);
        }
    }
}
