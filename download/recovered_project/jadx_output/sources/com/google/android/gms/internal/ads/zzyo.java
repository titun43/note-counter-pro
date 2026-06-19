package com.google.android.gms.internal.ads;

import android.net.Uri;
import androidx.fragment.app.h1;
import java.util.List;

/* loaded from: classes.dex */
public final class zzyo extends zzat {
    public final zzguf zzc;

    public zzyo(String str, Uri uri, List list) {
        super(str, null, false, 1);
        this.zzc = zzguf.zzq(list);
    }

    @Override // com.google.android.gms.internal.ads.zzat, java.lang.Throwable
    public final String getMessage() {
        zzguf zzgufVar = this.zzc;
        String message = super.getMessage();
        if (zzgufVar.isEmpty()) {
            return message;
        }
        int length = message.length();
        String valueOf = String.valueOf(zzgufVar);
        return h1.b(new StringBuilder(length + 17 + valueOf.length()), message, "\nsniff failures: ", valueOf);
    }
}
