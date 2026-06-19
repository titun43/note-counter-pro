package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class zzck {
    private final zzguf zza;
    private final List zzb = new ArrayList();
    private ByteBuffer[] zzc = new ByteBuffer[0];
    private boolean zzd;

    public zzck(zzguf zzgufVar) {
        this.zza = zzgufVar;
        zzcl zzclVar = zzcl.zza;
        this.zzd = false;
    }

    private final void zzi(ByteBuffer byteBuffer) {
        boolean z4;
        do {
            int i5 = 0;
            z4 = false;
            while (i5 <= zzj()) {
                if (!this.zzc[i5].hasRemaining()) {
                    List list = this.zzb;
                    zzco zzcoVar = (zzco) list.get(i5);
                    if (!zzcoVar.zzg()) {
                        ByteBuffer byteBuffer2 = i5 > 0 ? this.zzc[i5 - 1] : byteBuffer.hasRemaining() ? byteBuffer : zzco.zza;
                        long remaining = byteBuffer2.remaining();
                        zzcoVar.zzd(byteBuffer2);
                        this.zzc[i5] = zzcoVar.zzf();
                        boolean z5 = true;
                        if (remaining - byteBuffer2.remaining() <= 0 && !this.zzc[i5].hasRemaining()) {
                            z5 = false;
                        }
                        z4 |= z5;
                    } else if (!this.zzc[i5].hasRemaining() && i5 < zzj()) {
                        ((zzco) list.get(i5 + 1)).zze();
                    }
                }
                i5++;
            }
        } while (z4);
    }

    private final int zzj() {
        return this.zzc.length - 1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzck)) {
            return false;
        }
        zzguf zzgufVar = this.zza;
        int size = zzgufVar.size();
        zzguf zzgufVar2 = ((zzck) obj).zza;
        if (size != zzgufVar2.size()) {
            return false;
        }
        for (int i5 = 0; i5 < zzgufVar.size(); i5++) {
            if (zzgufVar.get(i5) != zzgufVar2.get(i5)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final zzcl zza(zzcl zzclVar) {
        if (zzclVar.equals(zzcl.zza)) {
            throw new zzcn("Unhandled input format:", zzclVar);
        }
        int i5 = 0;
        while (true) {
            zzguf zzgufVar = this.zza;
            if (i5 >= zzgufVar.size()) {
                return zzclVar;
            }
            zzco zzcoVar = (zzco) zzgufVar.get(i5);
            zzcl zzb = zzcoVar.zzb(zzclVar);
            if (zzcoVar.zzc()) {
                zzgrc.zzi(!zzb.equals(r0));
                zzclVar = zzb;
            }
            i5++;
        }
    }

    public final void zzb(zzcm zzcmVar) {
        List list = this.zzb;
        list.clear();
        this.zzd = false;
        long j2 = zzcmVar.zzb;
        int i5 = 0;
        while (true) {
            zzguf zzgufVar = this.zza;
            if (i5 >= zzgufVar.size()) {
                break;
            }
            zzco zzcoVar = (zzco) zzgufVar.get(i5);
            zzcoVar.zzi(new zzcm(j2));
            if (zzcoVar.zzc()) {
                j2 = zzcoVar.zza(j2);
                zzgrc.zzi(j2 >= 0);
                list.add(zzcoVar);
            }
            i5++;
        }
        this.zzc = new ByteBuffer[list.size()];
        for (int i6 = 0; i6 <= zzj(); i6++) {
            this.zzc[i6] = ((zzco) list.get(i6)).zzf();
        }
    }

    public final boolean zzc() {
        return !this.zzb.isEmpty();
    }

    public final void zzd(ByteBuffer byteBuffer) {
        if (!zzc() || this.zzd) {
            return;
        }
        zzi(byteBuffer);
    }

    public final ByteBuffer zze() {
        if (!zzc()) {
            return zzco.zza;
        }
        ByteBuffer byteBuffer = this.zzc[zzj()];
        if (byteBuffer.hasRemaining()) {
            return byteBuffer;
        }
        zzi(zzco.zza);
        return this.zzc[zzj()];
    }

    public final void zzf() {
        if (!zzc() || this.zzd) {
            return;
        }
        this.zzd = true;
        ((zzco) this.zzb.get(0)).zze();
    }

    public final boolean zzg() {
        return this.zzd && ((zzco) this.zzb.get(zzj())).zzg() && !this.zzc[zzj()].hasRemaining();
    }

    public final void zzh() {
        int i5 = 0;
        while (true) {
            zzguf zzgufVar = this.zza;
            if (i5 >= zzgufVar.size()) {
                this.zzc = new ByteBuffer[0];
                zzcl zzclVar = zzcl.zza;
                this.zzd = false;
                return;
            } else {
                zzco zzcoVar = (zzco) zzgufVar.get(i5);
                zzcoVar.zzi(zzcm.zza);
                zzcoVar.zzj();
                i5++;
            }
        }
    }
}
