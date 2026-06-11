package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.io.EOFException;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
final class zzami implements zzagh {
    private final zzagh zza;
    private final zzamd zzb;
    private zzamf zzg;
    private zzv zzh;
    private boolean zzi;
    private int zzd = 0;
    private int zze = 0;
    private byte[] zzf = zzfj.zzb;
    private final zzer zzc = new zzer();

    public zzami(zzagh zzaghVar, zzamd zzamdVar) {
        this.zza = zzaghVar;
        this.zzb = zzamdVar;
    }

    private final void zzi(int i5) {
        int length = this.zzf.length;
        int i6 = this.zze;
        if (length - i6 >= i5) {
            return;
        }
        int i7 = i6 - this.zzd;
        int max = Math.max(i7 + i7, i5 + i7);
        byte[] bArr = this.zzf;
        byte[] bArr2 = max <= bArr.length ? bArr : new byte[max];
        System.arraycopy(bArr, this.zzd, bArr2, 0, i7);
        this.zzd = 0;
        this.zze = i7;
        this.zzf = bArr2;
    }

    @Override // com.google.android.gms.internal.ads.zzagh
    public final int zzb(zzj zzjVar, int i5, boolean z4, int i6) {
        if (this.zzg == null) {
            return this.zza.zzb(zzjVar, i5, z4, 0);
        }
        zzi(i5);
        int zza = zzjVar.zza(this.zzf, this.zze, i5);
        if (zza != -1) {
            this.zze += zza;
            return zza;
        }
        if (z4) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // com.google.android.gms.internal.ads.zzagh
    public final void zzd(zzer zzerVar, int i5, int i6) {
        if (this.zzg == null) {
            this.zza.zzd(zzerVar, i5, i6);
            return;
        }
        zzi(i5);
        zzerVar.zzm(this.zzf, this.zze, i5);
        this.zze += i5;
    }

    @Override // com.google.android.gms.internal.ads.zzagh
    public final void zze(final long j2, final int i5, int i6, int i7, zzagg zzaggVar) {
        if (this.zzg == null) {
            this.zza.zze(j2, i5, i6, i7, zzaggVar);
            return;
        }
        zzgrc.zzb(zzaggVar == null, "DRM on subtitles is not supported");
        int i8 = (this.zze - i7) - i6;
        try {
            this.zzg.zza(this.zzf, i8, i6, zzame.zza(), new zzdr() { // from class: com.google.android.gms.internal.ads.zzamh
                @Override // com.google.android.gms.internal.ads.zzdr
                public final /* synthetic */ void zza(Object obj) {
                    zzami.this.zzh(j2, i5, (zzalx) obj);
                }
            });
        } catch (RuntimeException e4) {
            if (!this.zzi) {
                throw e4;
            }
            zzee.zzd("SubtitleTranscodingTO", "Parsing subtitles failed, ignoring sample.", e4);
        }
        int i9 = i8 + i6;
        this.zzd = i9;
        if (i9 == this.zze) {
            this.zzd = 0;
            this.zze = 0;
        }
    }

    public final void zzf(boolean z4) {
        this.zzi = true;
    }

    public final /* synthetic */ void zzh(long j2, int i5, zzalx zzalxVar) {
        this.zzh.getClass();
        zzguf zzgufVar = zzalxVar.zza;
        long j5 = zzalxVar.zzc;
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>(zzgufVar.size());
        Iterator<E> it = zzgufVar.iterator();
        while (it.hasNext()) {
            arrayList.add(((zzcx) it.next()).zzb());
        }
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("c", arrayList);
        bundle.putLong("d", j5);
        Parcel obtain = Parcel.obtain();
        obtain.writeBundle(bundle);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        zzer zzerVar = this.zzc;
        int length = marshall.length;
        zzerVar.zzb(marshall, length);
        zzagh zzaghVar = this.zza;
        zzaghVar.zzc(zzerVar, length);
        long j6 = zzalxVar.zzb;
        if (j6 == -9223372036854775807L) {
            zzgrc.zzi(this.zzh.zzt == Long.MAX_VALUE);
        } else {
            long j7 = this.zzh.zzt;
            j2 = j7 == Long.MAX_VALUE ? j2 + j6 : j6 + j7;
        }
        zzaghVar.zze(j2, i5 | 1, length, 0, null);
    }

    @Override // com.google.android.gms.internal.ads.zzagh
    public final void zzz(zzv zzvVar) {
        String str = zzvVar.zzo;
        str.getClass();
        zzgrc.zza(zzas.zzf(str) == 3);
        if (!zzvVar.equals(this.zzh)) {
            this.zzh = zzvVar;
            zzamd zzamdVar = this.zzb;
            this.zzg = zzamdVar.zza(zzvVar) ? zzamdVar.zzc(zzvVar) : null;
        }
        if (this.zzg == null) {
            this.zza.zzz(zzvVar);
            return;
        }
        zzagh zzaghVar = this.zza;
        zzt zza = zzvVar.zza();
        zza.zzm("application/x-media3-cues");
        zza.zzj(str);
        zza.zzr(Long.MAX_VALUE);
        zza.zzK(this.zzb.zzb(zzvVar));
        zzaghVar.zzz(zza.zzM());
    }
}
