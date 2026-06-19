package com.google.android.gms.internal.ads;

import android.net.Uri;
import androidx.emoji2.text.u;
import androidx.fragment.app.h1;
import com.google.android.gms.ads.RequestConfiguration;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class zzchx extends zzchr implements zzhz {
    private static final AtomicInteger zzo = new AtomicInteger(0);
    private String zzd;
    private final zzcgd zze;
    private boolean zzf;
    private final zzchw zzg;
    private final zzcha zzh;
    private ByteBuffer zzi;
    private boolean zzj;
    private final Object zzk;
    private final String zzl;
    private final int zzm;
    private boolean zzn;

    public zzchx(zzcge zzcgeVar, zzcgd zzcgdVar) {
        super(zzcgeVar);
        this.zze = zzcgdVar;
        this.zzg = new zzchw();
        this.zzh = new zzcha();
        this.zzk = new Object();
        this.zzl = (String) zzgra.zzd(zzcgeVar != null ? zzcgeVar.zzn() : null).zza(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
        this.zzm = zzcgeVar != null ? zzcgeVar.zzp() : 0;
        zzo.incrementAndGet();
    }

    public static int zzr() {
        return zzo.get();
    }

    public static final String zzv(String str) {
        return "cache:".concat(String.valueOf(com.google.android.gms.ads.internal.util.client.zzf.zzf(str)));
    }

    private final void zzx() {
        int zza = (int) this.zzg.zza();
        int zza2 = (int) this.zzh.zza(this.zzi);
        int position = this.zzi.position();
        int round = Math.round((position / zza) * zza2);
        int zzP = zzcfv.zzP();
        int zzQ = zzcfv.zzQ();
        String str = this.zzd;
        zzn(str, zzv(str), position, zza, round, zza2, round > 0, zzP, zzQ);
    }

    @Override // com.google.android.gms.internal.ads.zzchr
    public final void release() {
        zzo.decrementAndGet();
    }

    @Override // com.google.android.gms.internal.ads.zzhz
    public final void zza(zzhb zzhbVar, zzhf zzhfVar, boolean z4) {
    }

    @Override // com.google.android.gms.internal.ads.zzhz
    public final void zzb(zzhb zzhbVar, zzhf zzhfVar, boolean z4) {
        if (zzhbVar instanceof zzhm) {
            this.zzg.zzb((zzhm) zzhbVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhz
    public final void zzc(zzhb zzhbVar, zzhf zzhfVar, boolean z4, int i5) {
    }

    @Override // com.google.android.gms.internal.ads.zzhz
    public final void zzd(zzhb zzhbVar, zzhf zzhfVar, boolean z4) {
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x00c1, code lost:
    
        r28.zzn = true;
        zzp(r29, r4, (int) r28.zzh.zza(r28.zzi));
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v8, types: [boolean] */
    @Override // com.google.android.gms.internal.ads.zzchr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean zze(String str) {
        String str2;
        String str3;
        long j2;
        this.zzd = str;
        String str4 = "error";
        String zzv = zzv(str);
        try {
            zzhi zzhiVar = new zzhi();
            zzhiVar.zzb(this.zzb);
            zzcgd zzcgdVar = this.zze;
            zzhiVar.zzc(zzcgdVar.zzd);
            zzhiVar.zzd(zzcgdVar.zze);
            zzhiVar.zze(true);
            zzhiVar.zzf(this);
            zzhb zza = zzhiVar.zza();
            if (zzcgdVar.zzi) {
                zza = new zzcgy(this.zza, zza, this.zzl, this.zzm, null, null);
            }
            zza.zzb(new zzhf(Uri.parse(str), 0L, -1L, null));
            zzcge zzcgeVar = (zzcge) this.zzc.get();
            if (zzcgeVar != null) {
                zzcgeVar.zzt(zzv, this);
            }
            ((x2.c) com.google.android.gms.ads.internal.zzt.zzk()).getClass();
            long currentTimeMillis = System.currentTimeMillis();
            long longValue = ((Long) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzai)).longValue();
            long longValue2 = ((Long) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzah)).longValue();
            this.zzi = ByteBuffer.allocate(zzcgdVar.zzc);
            int i5 = 8192;
            byte[] bArr = new byte[8192];
            long j5 = currentTimeMillis;
            while (true) {
                int zza2 = zza.zza(bArr, 0, Math.min(this.zzi.remaining(), i5));
                if (zza2 == -1) {
                    break;
                }
                synchronized (this.zzk) {
                    str2 = str4;
                    try {
                        if (this.zzf) {
                            j2 = currentTimeMillis;
                        } else {
                            j2 = currentTimeMillis;
                            this.zzi.put(bArr, 0, zza2);
                        }
                    } finally {
                    }
                }
                if (this.zzi.remaining() <= 0) {
                    zzx();
                    break;
                }
                try {
                    str3 = this.zzf;
                } catch (Exception e4) {
                    e = e4;
                    str3 = str2;
                    String canonicalName = e.getClass().getCanonicalName();
                    String message = e.getMessage();
                    String b2 = h1.b(new StringBuilder(String.valueOf(canonicalName).length() + 1 + String.valueOf(message).length()), canonicalName, ":", message);
                    String n5 = u.n(new StringBuilder(b2.length() + String.valueOf(str).length() + 34), "Failed to preload url ", str, " Exception: ", b2);
                    int i6 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzi(n5);
                    zzq(str, zzv, str3, b2);
                    return false;
                }
                try {
                    if (str3 != 0) {
                        int limit = this.zzi.limit();
                        StringBuilder sb = new StringBuilder(String.valueOf(limit).length() + 24);
                        sb.append("Precache abort at ");
                        sb.append(limit);
                        sb.append(" bytes");
                        throw new IOException(sb.toString());
                    }
                    long currentTimeMillis2 = System.currentTimeMillis();
                    if (currentTimeMillis2 - j5 >= longValue) {
                        zzx();
                        j5 = currentTimeMillis2;
                    }
                    if (currentTimeMillis2 - j2 > 1000 * longValue2) {
                        StringBuilder sb2 = new StringBuilder(String.valueOf(longValue2).length() + 29);
                        sb2.append("Timeout exceeded. Limit: ");
                        sb2.append(longValue2);
                        sb2.append(" sec");
                        throw new IOException(sb2.toString());
                    }
                    str4 = str2;
                    currentTimeMillis = j2;
                    i5 = 8192;
                } catch (Exception e5) {
                    e = e5;
                    String canonicalName2 = e.getClass().getCanonicalName();
                    String message2 = e.getMessage();
                    String b22 = h1.b(new StringBuilder(String.valueOf(canonicalName2).length() + 1 + String.valueOf(message2).length()), canonicalName2, ":", message2);
                    String n52 = u.n(new StringBuilder(b22.length() + String.valueOf(str).length() + 34), "Failed to preload url ", str, " Exception: ", b22);
                    int i62 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzi(n52);
                    zzq(str, zzv, str3, b22);
                    return false;
                }
            }
            return true;
        } catch (Exception e6) {
            e = e6;
            str2 = str4;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzchr
    public final void zzl() {
        this.zzf = true;
    }

    public final String zzs() {
        return this.zzd;
    }

    public final boolean zzt() {
        return this.zzn;
    }

    public final ByteBuffer zzu() {
        synchronized (this.zzk) {
            try {
                ByteBuffer byteBuffer = this.zzi;
                if (byteBuffer != null && !this.zzj) {
                    byteBuffer.flip();
                    this.zzj = true;
                }
                this.zzf = true;
            } catch (Throwable th) {
                throw th;
            }
        }
        return this.zzi;
    }
}
