package com.google.android.gms.internal.ads;

import g4.i;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

/* loaded from: classes.dex */
final class zzgmx implements zzgmu {
    private final zzgoe zza;
    private final long zzb;

    public zzgmx(zzgao zzgaoVar, zzgoe zzgoeVar, long j2) {
        this.zza = zzgoeVar;
        this.zzb = j2;
    }

    private static boolean zzc(zzgdu zzgduVar) {
        int zza = zzgduVar.zzb().zza().zza();
        int zzb = zzgduVar.zzb().zza().zzb();
        byte[] zza2 = zzatu.zza();
        i.e(zza2, "versionArray");
        ByteBuffer allocate = ByteBuffer.allocate(6);
        i.d(allocate, "allocate(...)");
        allocate.order(ByteOrder.LITTLE_ENDIAN);
        allocate.putShort((short) zza);
        allocate.putInt(zzb);
        byte[] array = allocate.array();
        i.d(array, "array(...)");
        return Arrays.equals(array, zza2);
    }

    @Override // com.google.android.gms.internal.ads.zzgmu
    public final boolean zza(zzgdu zzgduVar) {
        if (zzgduVar == null || zzgduVar.equals(zzgdu.zzg())) {
            this.zza.zzb(20202);
            return true;
        }
        if (!zzc(zzgduVar)) {
            this.zza.zzb(20205);
            return true;
        }
        boolean z4 = zzgduVar.zzb().zzc() - System.currentTimeMillis() <= this.zzb;
        if (z4) {
            this.zza.zzb(20203);
        }
        return z4;
    }

    @Override // com.google.android.gms.internal.ads.zzgmu
    public final boolean zzb(zzgdu zzgduVar) {
        if (zzgduVar == null || zzgduVar.equals(zzgdu.zzg())) {
            this.zza.zzb(20204);
            return false;
        }
        if (zzc(zzgduVar)) {
            return true;
        }
        this.zza.zzb(20206);
        return false;
    }
}
