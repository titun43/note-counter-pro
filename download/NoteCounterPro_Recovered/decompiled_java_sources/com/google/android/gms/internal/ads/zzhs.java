package com.google.android.gms.internal.ads;

import androidx.emoji2.text.u;
import java.io.IOException;
import java.util.Map;

/* loaded from: classes.dex */
public final class zzhs extends zzhq {
    public final int zzc;

    public zzhs(int i5, String str, IOException iOException, Map map, zzhf zzhfVar, byte[] bArr) {
        super(u.l(new StringBuilder(String.valueOf(i5).length() + 15), "Response code: ", i5), iOException, zzhfVar, 2004, 1);
        this.zzc = i5;
    }
}
