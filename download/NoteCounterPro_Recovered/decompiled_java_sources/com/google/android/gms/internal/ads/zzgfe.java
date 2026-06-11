package com.google.android.gms.internal.ads;

import android.util.Base64;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class zzgfe {
    private MessageDigest zza;
    private final zzgoe zzb;
    private final Object zzc = new Object();
    private boolean zzd = false;
    private SecureRandom zze;

    public zzgfe(zzgoe zzgoeVar) {
        this.zzb = zzgoeVar;
    }

    public final void zza() {
        if (zzc()) {
            return;
        }
        zzb(new SecureRandom());
    }

    public final synchronized void zzb(SecureRandom secureRandom) {
        zzgoc zza = this.zzb.zza(202);
        try {
            try {
                try {
                    zza.zza();
                    this.zze = secureRandom;
                    this.zza = MessageDigest.getInstance("MD5");
                    this.zzd = true;
                } catch (Throwable th) {
                    zza.zzb(th);
                    throw th;
                }
            } catch (NoSuchAlgorithmException e4) {
                zza.zzb(e4);
            }
            zza.zzc();
        } catch (Throwable th2) {
            zza.zzc();
            throw th2;
        }
    }

    public final synchronized boolean zzc() {
        return this.zzd;
    }

    public final byte[] zzd(byte[] bArr, String str, boolean z4) {
        int length = bArr.length;
        int i5 = true != z4 ? 255 : 239;
        zzgrc.zza(length <= i5);
        ByteBuffer put = ByteBuffer.allocate(i5 + 1).put((byte) length);
        if (length < i5) {
            int i6 = i5 - length;
            byte[] bArr2 = new byte[i6];
            this.zze.nextBytes(bArr2);
            bArr = Arrays.copyOf(bArr, length + i6);
            System.arraycopy(bArr2, 0, bArr, length, i6);
        }
        byte[] array = put.put(bArr).array();
        if (z4) {
            array = ByteBuffer.allocate(256).put(zze(array)).put(array).array();
        }
        byte[] bArr3 = new byte[256];
        zzgfh[] zzgfhVarArr = new zzgfu().zzcK;
        int length2 = zzgfhVarArr.length;
        for (int i7 = 0; i7 < 12; i7++) {
            zzgfhVarArr[i7].zza(array, bArr3);
        }
        if (!zzgrt.zzc(str)) {
            new zzgfg(str.length() > 32 ? str.substring(0, 32).getBytes(StandardCharsets.UTF_8) : str.getBytes(StandardCharsets.UTF_8)).zza(bArr3);
        }
        return bArr3;
    }

    public final byte[] zze(byte[] bArr) {
        byte[] digest;
        synchronized (this.zzc) {
            this.zza.reset();
            this.zza.update(bArr);
            digest = this.zza.digest();
        }
        return digest;
    }

    public final zzaxw zzf(byte[] bArr, String str) {
        zzaxw zza = zzaxx.zza();
        byte[] zze = zze(bArr);
        zzian zzianVar = zzian.zza;
        zza.zzb(zzian.zzs(zze, 0, zze.length));
        ArrayList arrayList = new ArrayList();
        int i5 = 0;
        while (true) {
            int length = bArr.length;
            if (i5 >= ((length - 1) / 255) + 1) {
                break;
            }
            int i6 = i5 * 255;
            int i7 = i6 + 255;
            if (length > i7) {
                length = i7;
            }
            arrayList.add(Arrays.copyOfRange(bArr, i6, length));
            i5++;
        }
        int size = arrayList.size();
        int i8 = 0;
        while (i8 < size) {
            Object obj = arrayList.get(i8);
            i8++;
            zza.zza(zzian.zzs(zzd((byte[]) obj, str, false), 0, 256));
        }
        return zza;
    }

    public final String zzg(int i5, String str) {
        zzawg zzj = zzaxg.zzj();
        zzj.zzl(i5);
        return Base64.encodeToString(zzd(((zzaxg) zzj.zzbu()).zzaN(), str, true), 11);
    }
}
