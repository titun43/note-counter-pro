package com.google.android.gms.internal.ads;

import android.util.Base64;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public final class zzfka {
    public zzfka() {
        try {
            zzhbx.zza();
        } catch (GeneralSecurityException e4) {
            com.google.android.gms.ads.internal.util.zze.zza("Failed to Configure Aead. ".concat(e4.toString()));
            com.google.android.gms.ads.internal.zzt.zzh().zzg(e4, "CryptoUtils.registerAead");
        }
    }

    public static final String zza() {
        byte[] bArr;
        try {
            zzhbk zzf = zzhbk.zzf(zzhbc.zzb(zzhkc.zza().zzc("AES128_GCM")));
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                zzhav.zzb(zzf, zzhau.zzb(byteArrayOutputStream));
                bArr = byteArrayOutputStream.toByteArray();
            } catch (IOException unused) {
                throw new GeneralSecurityException("Serialize keyset failed");
            }
        } catch (GeneralSecurityException e4) {
            com.google.android.gms.ads.internal.util.zze.zza("Failed to generate key".concat(e4.toString()));
            com.google.android.gms.ads.internal.zzt.zzh().zzg(e4, "CryptoUtils.generateKey");
            bArr = new byte[0];
        }
        return Base64.encodeToString(bArr, 11);
    }

    public static final String zzb(byte[] bArr, byte[] bArr2, String str, zzdxt zzdxtVar) {
        zzhbk zzc;
        if (str != null && (zzc = zzc(str)) != null) {
            try {
                byte[] zza = ((zzhas) zzc.zzg(zzhif.zza(), zzhas.class)).zza(bArr, bArr2);
                zzdxtVar.zzc().put("ds", "1");
                return new String(zza, "UTF-8");
            } catch (UnsupportedEncodingException | UnsupportedOperationException | GeneralSecurityException e4) {
                com.google.android.gms.ads.internal.util.zze.zza("Failed to decrypt ".concat(e4.toString()));
                com.google.android.gms.ads.internal.zzt.zzh().zzg(e4, "CryptoUtils.decrypt");
                zzdxtVar.zzc().put("dsf", e4.toString());
            }
        }
        return null;
    }

    private static final zzhbk zzc(String str) {
        try {
            try {
                return zzhav.zza(zzhat.zza(Base64.decode(str, 11)));
            } catch (IOException unused) {
                throw new GeneralSecurityException("Parse keyset failed");
            }
        } catch (GeneralSecurityException e4) {
            com.google.android.gms.ads.internal.util.zze.zza("Failed to get keysethandle".concat(e4.toString()));
            com.google.android.gms.ads.internal.zzt.zzh().zzg(e4, "CryptoUtils.getHandle");
            return null;
        }
    }
}
