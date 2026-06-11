package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.AdRequest;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;

/* loaded from: classes.dex */
public final class zzahz {
    private final ByteArrayOutputStream zza;
    private final DataOutputStream zzb;

    public zzahz() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(AdRequest.MAX_CONTENT_URL_LENGTH);
        this.zza = byteArrayOutputStream;
        this.zzb = new DataOutputStream(byteArrayOutputStream);
    }

    private static void zzb(DataOutputStream dataOutputStream, String str) {
        dataOutputStream.writeBytes(str);
        dataOutputStream.writeByte(0);
    }

    public final byte[] zza(zzahy zzahyVar) {
        ByteArrayOutputStream byteArrayOutputStream = this.zza;
        byteArrayOutputStream.reset();
        try {
            DataOutputStream dataOutputStream = this.zzb;
            zzb(dataOutputStream, zzahyVar.zza);
            zzb(dataOutputStream, zzahyVar.zzb);
            dataOutputStream.writeLong(zzahyVar.zzc);
            dataOutputStream.writeLong(zzahyVar.zzd);
            dataOutputStream.write(zzahyVar.zze);
            dataOutputStream.flush();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e4) {
            throw new RuntimeException(e4);
        }
    }
}
