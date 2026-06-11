package com.google.android.gms.internal.ads;

import android.util.Base64OutputStream;
import com.google.android.gms.ads.RequestConfiguration;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* loaded from: classes.dex */
final class zzbei {
    ByteArrayOutputStream zza = new ByteArrayOutputStream(4096);
    Base64OutputStream zzb = new Base64OutputStream(this.zza, 10);

    /* JADX WARN: Multi-variable type inference failed */
    public final String toString() {
        String str;
        try {
            this.zzb.close();
        } catch (IOException e4) {
            int i5 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("HashManager: Unable to convert to Base64.", e4);
        }
        try {
            try {
                this.zza.close();
                str = this.zza.toString();
            } catch (IOException e5) {
                int i6 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzg("HashManager: Unable to convert to Base64.", e5);
                str = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
            }
            return str;
        } finally {
            this.zza = null;
            this.zzb = null;
        }
    }
}
