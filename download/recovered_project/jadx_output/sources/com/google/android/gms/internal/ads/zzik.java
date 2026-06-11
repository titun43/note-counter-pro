package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class zzik {
    private final Map zza;

    public zzik() {
        this.zza = new HashMap();
    }

    public final zzik zza(String str, int i5) {
        this.zza.put(str, Integer.valueOf(i5));
        return this;
    }

    public final zzik zzb(String str, long j2) {
        this.zza.put(str, Long.valueOf(j2));
        return this;
    }

    public final zzik zzc(String str, float f5) {
        this.zza.put(str, Float.valueOf(f5));
        return this;
    }

    public final zzik zzd(String str, String str2) {
        this.zza.put(str, str2);
        return this;
    }

    public final zzik zze(String str, ByteBuffer byteBuffer) {
        if (byteBuffer == null) {
            this.zza.put(str, null);
            return this;
        }
        ByteBuffer allocate = ByteBuffer.allocate(byteBuffer.remaining());
        allocate.put(byteBuffer.duplicate());
        allocate.flip();
        this.zza.put(str, allocate);
        return this;
    }

    public final zzik zzf(String str) {
        this.zza.remove(str);
        return this;
    }

    public final zzil zzg() {
        return new zzil(this.zza, null);
    }
}
