package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioDeviceInfo;
import android.media.AudioFormat;
import android.media.AudioTrack;
import android.os.Build;
import android.os.Looper;
import android.util.Pair;
import androidx.emoji2.text.u;
import java.util.Objects;

/* loaded from: classes.dex */
public final class zzsi implements zzqm {
    private final Context zza;
    private final zzsh zzb;
    private zzed zzc;
    private zzdn zzd;
    private zzps zze;
    private zzpx zzf;
    private Looper zzg;
    private Context zzh;
    private final zzsm zzi;

    public /* synthetic */ zzsi(zzsg zzsgVar, byte[] bArr) {
        this.zza = zzsgVar.zzd();
        zzsm zzg = zzsgVar.zzg();
        zzg.getClass();
        this.zzi = zzg;
        this.zze = zzsgVar.zze();
        this.zzb = zzsgVar.zzd() != null ? new zzsh(this, null) : null;
        this.zzd = zzdn.zza;
    }

    private final void zzj(zzqf zzqfVar) {
        Context context;
        zzk();
        zzpx zzpxVar = this.zzf;
        if (zzpxVar == null && (context = this.zza) != null) {
            zzpx zzpxVar2 = new zzpx(context, new zzpw() { // from class: com.google.android.gms.internal.ads.zzsf
                @Override // com.google.android.gms.internal.ads.zzpw
                public final /* synthetic */ void zza(zzps zzpsVar) {
                    zzsi.this.zzg(zzpsVar);
                }
            }, zzqfVar.zzb, zzqfVar.zzc);
            this.zzf = zzpxVar2;
            this.zze = zzpxVar2.zzd();
        } else if (zzpxVar != null) {
            AudioDeviceInfo audioDeviceInfo = zzqfVar.zzc;
            if (audioDeviceInfo != null) {
                zzpxVar.zzc(audioDeviceInfo);
            }
            this.zzf.zzb(zzqfVar.zzb);
        }
        this.zze.getClass();
    }

    private final void zzk() {
        if (this.zza == null) {
            return;
        }
        Looper myLooper = Looper.myLooper();
        Looper looper = this.zzg;
        boolean z4 = true;
        if (looper != null && looper != myLooper) {
            z4 = false;
        }
        String zzl = zzl(looper);
        String zzl2 = zzl(myLooper);
        if (!z4) {
            throw new IllegalStateException(zzgrt.zzd("AudioTrackAudioOutputProvider accessed on multiple threads: %s and %s", zzl, zzl2));
        }
        this.zzg = myLooper;
    }

    private static String zzl(Looper looper) {
        return looper == null ? "null" : looper.getThread().getName();
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0049, code lost:
    
        if (r6.zze.zzd(r1, r7) != null) goto L9;
     */
    @Override // com.google.android.gms.internal.ads.zzqm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final zzqh zza(zzqf zzqfVar) {
        zzj(zzqfVar);
        zzsm zzsmVar = this.zzi;
        zzv zzvVar = zzqfVar.zza;
        zzd zzdVar = zzqfVar.zzb;
        zzpz zza = zzsmVar.zza(zzvVar, zzdVar);
        zzqg zzqgVar = new zzqg();
        int i5 = 0;
        if (Objects.equals(zzvVar.zzo, "audio/raw")) {
            int i6 = zzvVar.zzI;
            if (zzfj.zzA(i6)) {
                if (i6 != 2) {
                    i5 = 1;
                }
                i5 = 2;
            } else {
                u.r(new StringBuilder(String.valueOf(i6).length() + 22), "Invalid PCM encoding: ", i6, "ATAudioOutputProvider");
            }
        }
        zzqgVar.zzd(i5);
        zzqgVar.zza(zza.zzb);
        zzqgVar.zzb(zza.zzc);
        zzqgVar.zzc(zza.zzd);
        return zzqgVar.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzqm
    public final zzql zzb(zzqf zzqfVar) {
        int i5;
        int intValue;
        int i6;
        int i7;
        int i8;
        zzj(zzqfVar);
        zzv zzvVar = zzqfVar.zza;
        String str = zzvVar.zzo;
        if (Objects.equals(str, "audio/raw")) {
            int i9 = zzvVar.zzI;
            zzgrc.zza(zzfj.zzA(i9));
            i5 = zzvVar.zzH;
            int i10 = zzvVar.zzG;
            intValue = zzfj.zzB(i10);
            i7 = zzfj.zzD(i9) * i10;
            i8 = i9;
            i6 = 0;
        } else {
            i5 = zzvVar.zzH;
            zzpz zzpzVar = zzpz.zza;
            Pair zzd = this.zze.zzd(zzvVar, zzqfVar.zzb);
            if (zzd == null) {
                throw new zzqd("Unable to configure passthrough for: ".concat(String.valueOf(zzvVar)));
            }
            int intValue2 = ((Integer) zzd.first).intValue();
            intValue = ((Integer) zzd.second).intValue();
            i6 = 2;
            i7 = -1;
            i8 = intValue2;
        }
        int i11 = i5;
        int i12 = zzvVar.zzj;
        if (Objects.equals(str, "audio/vnd.dts.hd;profile=lbr") && i12 == -1) {
            i12 = 768000;
        }
        int i13 = i12;
        int i14 = zzqfVar.zzf;
        if (i14 == -1) {
            int i15 = i7;
            zzgrc.zzi(AudioTrack.getMinBufferSize(i11, intValue, i8) != -2);
            int i16 = i15 == -1 ? 1 : i15;
            i14 = (((Math.max(r8, zzsy.zzb(r8, i8, i6, r11, i11, i13)) + i16) - 1) / i16) * i16;
        }
        zzqk zzqkVar = new zzqk();
        zzqkVar.zzb(i11);
        zzqkVar.zzc(intValue);
        zzqkVar.zza(i8);
        zzqkVar.zze(i14);
        zzqkVar.zzg(zzqfVar.zzd);
        zzqkVar.zzf(zzqfVar.zzb);
        zzqkVar.zzd(false);
        zzqkVar.zzh(zzqfVar.zze);
        return new zzql(zzqkVar, null);
    }

    @Override // com.google.android.gms.internal.ads.zzqm
    public final void zzc(zzqj zzqjVar) {
        zzk();
        if (this.zzc == null) {
            zzed zzedVar = new zzed(Thread.currentThread());
            this.zzc = zzedVar;
            zzedVar.zzg(false);
        }
        this.zzc.zzb(zzqjVar);
    }

    @Override // com.google.android.gms.internal.ads.zzqm
    public final void zzd(zzdn zzdnVar) {
        this.zzd = zzdnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzqm
    public final void zze() {
        zzed zzedVar = this.zzc;
        if (zzedVar != null) {
            zzedVar.zzf();
        }
        zzpx zzpxVar = this.zzf;
        if (zzpxVar != null) {
            zzpxVar.zze();
        }
    }

    public final zzsd zzf(zzql zzqlVar) {
        Context context;
        Context createDeviceContext;
        int deviceId;
        try {
            int i5 = zzqlVar.zzg;
            int i6 = zzqlVar.zzh;
            Context context2 = null;
            if (i6 != -1 && (context = this.zza) != null && Build.VERSION.SDK_INT >= 34) {
                Context context3 = this.zzh;
                if (context3 != null) {
                    deviceId = context3.getDeviceId();
                    if (deviceId != i6) {
                    }
                    context2 = this.zzh;
                    i5 = 0;
                }
                createDeviceContext = context.createDeviceContext(i6);
                this.zzh = createDeviceContext;
                context2 = this.zzh;
                i5 = 0;
            }
            AudioTrack.Builder sessionId = new AudioTrack.Builder().setAudioAttributes(zzqlVar.zzf.zza()).setAudioFormat(new AudioFormat.Builder().setSampleRate(zzqlVar.zzb).setChannelMask(zzqlVar.zzc).setEncoding(zzqlVar.zza).build()).setTransferMode(1).setBufferSizeInBytes(zzqlVar.zze).setSessionId(i5);
            int i7 = Build.VERSION.SDK_INT;
            if (i7 >= 29) {
                sessionId.setOffloadedPlayback(false);
            }
            if (i7 >= 34 && context2 != null) {
                sessionId.setContext(context2);
            }
            AudioTrack build = sessionId.build();
            if (build.getState() == 1) {
                return new zzsd(build, zzqlVar, this.zzb, this.zzd);
            }
            try {
                build.release();
            } catch (Exception unused) {
            }
            throw new zzqi();
        } catch (IllegalArgumentException e4) {
            e = e4;
            throw new zzqi(e);
        } catch (UnsupportedOperationException e5) {
            e = e5;
            throw new zzqi(e);
        }
    }

    public final void zzg(zzps zzpsVar) {
        zzk();
        zzps zzpsVar2 = this.zze;
        if (zzpsVar2 == null || zzpsVar.equals(zzpsVar2)) {
            return;
        }
        this.zze = zzpsVar;
        zzed zzedVar = this.zzc;
        if (zzedVar != null) {
            zzedVar.zzd(-1, zzse.zza);
            zzedVar.zze();
        }
    }

    public final /* synthetic */ void zzh(zzps zzpsVar) {
        this.zze = zzpsVar;
    }

    public final /* synthetic */ zzpx zzi() {
        return this.zzf;
    }
}
