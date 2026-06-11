package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;

/* loaded from: classes.dex */
public class zzhq extends zzhc {
    public final int zzb;

    public zzhq(zzhf zzhfVar, int i5, int i6) {
        super(zzb(2008, 1));
        this.zzb = 1;
    }

    public static zzhq zza(IOException iOException, zzhf zzhfVar, int i5) {
        String message = iOException.getMessage();
        int i6 = iOException instanceof SocketTimeoutException ? 2002 : iOException instanceof InterruptedIOException ? 1004 : (message == null || !zzgql.zza(message).matches("cleartext.*not permitted.*")) ? 2001 : 2007;
        return i6 == 2007 ? new zzhp(iOException, zzhfVar) : new zzhq(iOException, zzhfVar, i6, i5);
    }

    private static int zzb(int i5, int i6) {
        return i5 == 2000 ? i6 != 1 ? 2000 : 2001 : i5;
    }

    public zzhq(IOException iOException, zzhf zzhfVar, int i5, int i6) {
        super(iOException, zzb(i5, i6));
        this.zzb = i6;
    }

    public zzhq(String str, zzhf zzhfVar, int i5, int i6) {
        super(str, zzb(i5, i6));
        this.zzb = i6;
    }

    public zzhq(String str, IOException iOException, zzhf zzhfVar, int i5, int i6) {
        super(str, iOException, zzb(i5, i6));
        this.zzb = i6;
    }
}
