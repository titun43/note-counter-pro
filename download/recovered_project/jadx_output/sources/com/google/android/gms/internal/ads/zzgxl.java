package com.google.android.gms.internal.ads;

import androidx.fragment.app.h1;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

/* loaded from: classes.dex */
final class zzgxl extends zzgxc {
    private final File zza;

    public final String toString() {
        String obj = this.zza.toString();
        return h1.b(new StringBuilder(obj.length() + 20), "Files.asByteSource(", obj, ")");
    }

    @Override // com.google.android.gms.internal.ads.zzgxc
    public final /* bridge */ /* synthetic */ InputStream zza() {
        return new FileInputStream(this.zza);
    }
}
