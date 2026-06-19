package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.util.Arrays;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes.dex */
public final class zzhwz implements zzhas {
    private final zzhxp zza;
    private final zzhbo zzb;
    private final int zzc;
    private final byte[] zzd;

    private zzhwz(zzhxp zzhxpVar, zzhbo zzhboVar, int i5, byte[] bArr) {
        this.zza = zzhxpVar;
        this.zzb = zzhboVar;
        this.zzc = i5;
        this.zzd = bArr;
    }

    public static zzhas zzb(zzhcn zzhcnVar) {
        zzhwk zzhwkVar = new zzhwk(zzhcnVar.zze().zzc(zzhax.zza()), zzhcnVar.zzg().zzf());
        String valueOf = String.valueOf(zzhcnVar.zzg().zzh());
        return new zzhwz(zzhwkVar, new zzhxu(new zzhxt("HMAC".concat(valueOf), new SecretKeySpec(zzhcnVar.zzf().zzc(zzhax.zza()), "HMAC")), zzhcnVar.zzg().zze()), zzhcnVar.zzg().zze(), zzhcnVar.zzc().zzc());
    }

    @Override // com.google.android.gms.internal.ads.zzhas
    public final byte[] zza(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = this.zzd;
        int length = bArr.length;
        int i5 = this.zzc;
        int length2 = bArr3.length;
        if (length < i5 + length2) {
            throw new GeneralSecurityException("Decryption failed (ciphertext too short).");
        }
        if (!zzhln.zze(bArr3, bArr)) {
            throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
        int i6 = length - i5;
        byte[] copyOfRange = Arrays.copyOfRange(bArr, length2, i6);
        byte[] copyOfRange2 = Arrays.copyOfRange(bArr, i6, length);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        if (MessageDigest.isEqual(((zzhxu) this.zzb).zzc(zzhwr.zza(bArr2, copyOfRange, Arrays.copyOf(ByteBuffer.allocate(8).putLong(bArr2.length * 8).array(), 8))), copyOfRange2)) {
            return this.zza.zza(copyOfRange);
        }
        throw new GeneralSecurityException("invalid MAC");
    }
}
