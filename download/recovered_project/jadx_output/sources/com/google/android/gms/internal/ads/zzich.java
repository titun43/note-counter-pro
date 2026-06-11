package com.google.android.gms.internal.ads;

import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Iterator;

/* loaded from: classes.dex */
final class zzich extends InputStream {
    private Iterator zza;
    private ByteBuffer zzb;
    private int zzc = 0;
    private int zzd;
    private int zze;
    private boolean zzf;
    private byte[] zzg;
    private int zzh;
    private long zzi;

    public zzich(Iterable iterable) {
        this.zza = iterable.iterator();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            this.zzc++;
        }
        this.zzd = -1;
        if (zza()) {
            return;
        }
        this.zzb = zzice.zzc;
        this.zze = 0;
        this.zzi = 0L;
    }

    private final boolean zza() {
        ByteBuffer byteBuffer;
        do {
            this.zzd++;
            if (!this.zza.hasNext()) {
                return false;
            }
            byteBuffer = (ByteBuffer) this.zza.next();
            this.zzb = byteBuffer;
        } while (!byteBuffer.hasRemaining());
        this.zze = this.zzb.position();
        if (this.zzb.hasArray()) {
            this.zzf = true;
            this.zzg = this.zzb.array();
            this.zzh = this.zzb.arrayOffset();
        } else {
            this.zzf = false;
            this.zzi = zziem.zzr(this.zzb);
            this.zzg = null;
        }
        return true;
    }

    private final void zzb(int i5) {
        int i6 = this.zze + i5;
        this.zze = i6;
        if (i6 == this.zzb.limit()) {
            zza();
        }
    }

    @Override // java.io.InputStream
    public final int read() {
        if (this.zzd == this.zzc) {
            return -1;
        }
        if (this.zzf) {
            int i5 = this.zzg[this.zze + this.zzh] & 255;
            zzb(1);
            return i5;
        }
        int zzq = zziem.zzq(this.zze + this.zzi) & 255;
        zzb(1);
        return zzq;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i5, int i6) {
        if (this.zzd == this.zzc) {
            return -1;
        }
        int limit = this.zzb.limit();
        int i7 = this.zze;
        int i8 = limit - i7;
        if (i6 > i8) {
            i6 = i8;
        }
        if (this.zzf) {
            System.arraycopy(this.zzg, i7 + this.zzh, bArr, i5, i6);
            zzb(i6);
            return i6;
        }
        int position = this.zzb.position();
        this.zzb.position(this.zze);
        this.zzb.get(bArr, i5, i6);
        this.zzb.position(position);
        zzb(i6);
        return i6;
    }
}
