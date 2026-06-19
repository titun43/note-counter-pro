package com.google.android.gms.internal.ads;

import android.os.ParcelFileDescriptor;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public final class zzfkl {
    public static ParcelFileDescriptor zza(final InputStream inputStream) {
        ParcelFileDescriptor[] createPipe = ParcelFileDescriptor.createPipe();
        ParcelFileDescriptor parcelFileDescriptor = createPipe[0];
        final ParcelFileDescriptor parcelFileDescriptor2 = createPipe[1];
        zzcei.zza.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfkk
            @Override // java.lang.Runnable
            public final void run() {
                ParcelFileDescriptor parcelFileDescriptor3 = parcelFileDescriptor2;
                InputStream inputStream2 = inputStream;
                try {
                    try {
                        ParcelFileDescriptor.AutoCloseOutputStream autoCloseOutputStream = new ParcelFileDescriptor.AutoCloseOutputStream(parcelFileDescriptor3);
                        try {
                            x2.d.e(inputStream2, autoCloseOutputStream, false);
                            autoCloseOutputStream.close();
                            inputStream2.close();
                        } finally {
                        }
                    } finally {
                    }
                } catch (IOException unused) {
                }
            }
        });
        return parcelFileDescriptor;
    }
}
