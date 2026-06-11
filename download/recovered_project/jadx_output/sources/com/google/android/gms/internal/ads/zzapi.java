package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbgj;

/* loaded from: classes.dex */
final class zzapi extends zzaeg {
    public zzapi(zzfg zzfgVar, long j2, long j5) {
        super(new zzaeb(), new zzaph(zzfgVar, null), j2, 0L, j2 + 1, 0L, j5, 188L, zzbgj.zzq.zzf);
    }

    public static /* synthetic */ int zzh(byte[] bArr, int i5) {
        return (bArr[i5 + 3] & 255) | ((bArr[i5] & 255) << 24) | ((bArr[i5 + 1] & 255) << 16) | ((bArr[i5 + 2] & 255) << 8);
    }
}
