package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioDeviceInfo;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.util.Pair;
import com.google.android.gms.ads.AdRequest;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

/* loaded from: classes.dex */
public final class zzta extends zzuu implements zzlm {
    private final Context zzb;
    private final zzrb zzc;
    private final zzrj zzd;
    private final zzug zze;
    private final Set zzf;
    private int zzg;
    private boolean zzh;
    private boolean zzi;
    private zzv zzj;
    private final zzil zzk;
    private zzil zzl;
    private zzv zzm;
    private long zzn;
    private boolean zzo;
    private boolean zzp;
    private boolean zzq;
    private int zzr;
    private boolean zzs;
    private long zzt;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzta(Context context, zzui zzuiVar, zzuw zzuwVar, boolean z4, Handler handler, zzrc zzrcVar, zzrj zzrjVar) {
        super(1, zzuiVar, zzuwVar, false, 44100.0f);
        zzug zzugVar = Build.VERSION.SDK_INT >= 35 ? new zzug(zzuf.zzb) : null;
        this.zzb = context.getApplicationContext();
        this.zzd = zzrjVar;
        this.zze = zzugVar;
        this.zzr = -1000;
        this.zzc = new zzrb(handler, zzrcVar);
        this.zzt = -9223372036854775807L;
        zzrjVar.zza(new zzsz(this, null));
        this.zzf = new HashSet();
        zzil zzilVar = zzil.zza;
        this.zzk = zzilVar;
        this.zzl = zzilVar;
    }

    private static List zzbg(zzuw zzuwVar, zzv zzvVar, boolean z4, zzrj zzrjVar) {
        zzun zza;
        return zzvVar.zzo == null ? zzguf.zzi() : (!zzrjVar.zzd(zzvVar) || (zza = zzvg.zza()) == null) ? zzvg.zzc(zzuwVar, zzvVar, false, false) : zzguf.zzj(zza);
    }

    private final int zzbh(zzun zzunVar, zzv zzvVar) {
        "OMX.google.raw.decoder".equals(zzunVar.zza);
        return zzvVar.zzp;
    }

    private final void zzbi() {
        long zzg = this.zzd.zzg(zzZ());
        if (zzg != Long.MIN_VALUE) {
            if (!this.zzo) {
                zzg = Math.max(this.zzn, zzg);
            }
            this.zzn = zzg;
            this.zzo = false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzuu, com.google.android.gms.internal.ads.zzij
    public final void zzA(long j2, boolean z4, boolean z5) {
        super.zzA(j2, z4, z5);
        this.zzd.zzA();
        this.zzn = j2;
        this.zzt = -9223372036854775807L;
        this.zzq = false;
        this.zzo = true;
    }

    @Override // com.google.android.gms.internal.ads.zzij
    public final void zzB() {
        this.zzd.zzi();
        this.zzs = true;
    }

    @Override // com.google.android.gms.internal.ads.zzij
    public final void zzC() {
        zzbi();
        this.zzs = false;
        this.zzd.zzz();
    }

    @Override // com.google.android.gms.internal.ads.zzuu, com.google.android.gms.internal.ads.zzij
    public final void zzD() {
        this.zzp = true;
        this.zzj = null;
        this.zzt = -9223372036854775807L;
        try {
            this.zzd.zzA();
            super.zzD();
        } catch (Throwable th) {
            super.zzD();
            throw th;
        } finally {
            this.zzc.zzg(((zzuu) this).zza);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzuu, com.google.android.gms.internal.ads.zzij
    public final void zzE() {
        this.zzq = false;
        this.zzt = -9223372036854775807L;
        try {
            super.zzE();
            if (this.zzp) {
                this.zzp = false;
                this.zzd.zzB();
            }
        } catch (Throwable th) {
            if (this.zzp) {
                this.zzp = false;
                this.zzd.zzB();
            }
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzij
    public final void zzF() {
        zzug zzugVar;
        this.zzd.zzC();
        if (Build.VERSION.SDK_INT < 35 || (zzugVar = this.zze) == null) {
            return;
        }
        zzugVar.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzml, com.google.android.gms.internal.ads.zzmn
    public final String zzS() {
        return "MediaCodecAudioRenderer";
    }

    @Override // com.google.android.gms.internal.ads.zzuu, com.google.android.gms.internal.ads.zzml
    public final boolean zzY() {
        return this.zzd.zzn();
    }

    @Override // com.google.android.gms.internal.ads.zzuu, com.google.android.gms.internal.ads.zzml
    public final boolean zzZ() {
        return super.zzZ() && this.zzd.zzm();
    }

    @Override // com.google.android.gms.internal.ads.zzuu
    public final int zzac(zzuw zzuwVar, zzv zzvVar) {
        int i5;
        boolean z4;
        String str = zzvVar.zzo;
        if (!zzas.zza(str)) {
            return 128;
        }
        int i6 = zzvVar.zzN;
        boolean zzbd = zzuu.zzbd(zzvVar);
        int i7 = 1;
        if (!zzbd || (i6 != 0 && zzvg.zza() == null)) {
            i5 = 0;
        } else {
            zzrj zzrjVar = this.zzd;
            zzpz zzf = zzrjVar.zzf(zzvVar);
            if (zzf.zzb) {
                i5 = true != zzf.zzc ? AdRequest.MAX_CONTENT_URL_LENGTH : 1536;
                if (zzf.zzd) {
                    i5 |= 2048;
                }
            } else {
                i5 = 0;
            }
            if (zzrjVar.zzd(zzvVar)) {
                return i5 | 172;
            }
        }
        if (!"audio/raw".equals(str) || this.zzd.zzd(zzvVar)) {
            zzrj zzrjVar2 = this.zzd;
            if (zzrjVar2.zzd(zzfj.zzy(2, zzvVar.zzG, zzvVar.zzH))) {
                List zzbg = zzbg(zzuwVar, zzvVar, false, zzrjVar2);
                if (!zzbg.isEmpty()) {
                    if (zzbd) {
                        zzun zzunVar = (zzun) zzbg.get(0);
                        boolean zzc = zzunVar.zzc(zzvVar);
                        if (!zzc) {
                            for (int i8 = 1; i8 < zzbg.size(); i8++) {
                                zzun zzunVar2 = (zzun) zzbg.get(i8);
                                if (zzunVar2.zzc(zzvVar)) {
                                    z4 = false;
                                    zzc = true;
                                    zzunVar = zzunVar2;
                                    break;
                                }
                            }
                        }
                        z4 = true;
                        int i9 = true != zzc ? 3 : 4;
                        int i10 = 8;
                        if (zzc && zzunVar.zze(zzvVar)) {
                            i10 = 16;
                        }
                        return i9 | i10 | 32 | (true != zzunVar.zzg ? 0 : 64) | (true != z4 ? 0 : 128) | i5;
                    }
                    i7 = 2;
                }
            }
        }
        return i7 | 128;
    }

    @Override // com.google.android.gms.internal.ads.zzuu
    public final List zzad(zzuw zzuwVar, zzv zzvVar, boolean z4) {
        return zzvg.zze(zzbg(zzuwVar, zzvVar, false, this.zzd), zzvVar);
    }

    @Override // com.google.android.gms.internal.ads.zzuu
    public final boolean zzae(zzv zzvVar) {
        zzJ();
        return this.zzd.zzd(zzvVar);
    }

    @Override // com.google.android.gms.internal.ads.zzuu
    public final zzuh zzaf(zzun zzunVar, zzv zzvVar, MediaCrypto mediaCrypto, float f5) {
        zzv[] zzI = zzI();
        int length = zzI.length;
        int zzbh = zzbh(zzunVar, zzvVar);
        if (length != 1) {
            for (zzv zzvVar2 : zzI) {
                if (zzunVar.zzf(zzvVar, zzvVar2).zzd != 0) {
                    zzbh = Math.max(zzbh, zzbh(zzunVar, zzvVar2));
                }
            }
        }
        this.zzg = zzbh;
        String str = zzunVar.zza;
        int i5 = Build.VERSION.SDK_INT;
        this.zzh = false;
        this.zzi = str.equals("OMX.google.opus.decoder") || str.equals("c2.android.opus.decoder") || str.equals("OMX.google.vorbis.decoder") || str.equals("c2.android.vorbis.decoder");
        String str2 = zzunVar.zzc;
        int i6 = this.zzg;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str2);
        int i7 = zzvVar.zzG;
        mediaFormat.setInteger("channel-count", i7);
        int i8 = zzvVar.zzH;
        mediaFormat.setInteger("sample-rate", i8);
        zzeh.zza(mediaFormat, zzvVar.zzr);
        zzeh.zzb(mediaFormat, "max-input-size", i6);
        mediaFormat.setInteger("priority", 0);
        if (f5 != -1.0f) {
            mediaFormat.setFloat("operating-rate", f5);
        }
        String str3 = zzvVar.zzo;
        if ("audio/ac4".equals(str3)) {
            Pair zzd = zzdo.zzd(zzvVar);
            if (zzd != null) {
                zzeh.zzb(mediaFormat, "profile", ((Integer) zzd.first).intValue());
                zzeh.zzb(mediaFormat, "level", ((Integer) zzd.second).intValue());
            }
            if (i5 <= 28) {
                mediaFormat.setInteger("ac4-is-sync", 1);
            }
        }
        if (this.zzd.zze(zzfj.zzy(4, i7, i8)) == 2) {
            mediaFormat.setInteger("pcm-encoding", 4);
        }
        if (i5 >= 32) {
            mediaFormat.setInteger("max-output-channel-count", 99);
        }
        if (i5 >= 35) {
            mediaFormat.setInteger("importance", Math.max(0, -this.zzr));
        }
        if (i5 >= 29) {
            this.zzk.zzb(mediaFormat);
        }
        this.zzm = (!"audio/raw".equals(zzunVar.zzb) || "audio/raw".equals(str3)) ? null : zzvVar;
        return zzuh.zza(zzunVar, mediaFormat, zzvVar, null, this.zze);
    }

    @Override // com.google.android.gms.internal.ads.zzuu
    public final zzio zzag(zzun zzunVar, zzv zzvVar, zzv zzvVar2) {
        int i5;
        int i6;
        zzio zzf = zzunVar.zzf(zzvVar, zzvVar2);
        int i7 = zzf.zze;
        if (zzaB(zzvVar2)) {
            i7 |= 32768;
        }
        if (zzbh(zzunVar, zzvVar2) > this.zzg) {
            i7 |= 64;
        }
        String str = zzunVar.zza;
        if (i7 != 0) {
            i6 = 0;
            i5 = i7;
        } else {
            i5 = 0;
            i6 = zzf.zzd;
        }
        return new zzio(str, zzvVar, zzvVar2, i6, i5);
    }

    @Override // com.google.android.gms.internal.ads.zzuu
    public final long zzah(long j2, long j5, boolean z4) {
        zzrj zzrjVar = this.zzd;
        boolean z5 = false;
        if (zzrjVar.zzn() && this.zzt != -9223372036854775807L) {
            z5 = true;
        }
        if (!this.zzs) {
            return (z5 || super.zzZ()) ? 1000000L : 10000L;
        }
        long zzw = zzrjVar.zzw();
        if (!z5 || zzw == -9223372036854775807L) {
            return 10000L;
        }
        return Math.max(10000L, ((long) ((Math.min(zzw, this.zzt - j2) / (zzj() != null ? zzj().zzb : 1.0f)) / 2.0f)) - (zzfj.zzq(zzL().zzb()) - j5));
    }

    @Override // com.google.android.gms.internal.ads.zzuu
    public final float zzai(float f5, zzv zzvVar, zzv[] zzvVarArr) {
        int i5 = -1;
        for (zzv zzvVar2 : zzvVarArr) {
            int i6 = zzvVar2.zzH;
            if (i6 != -1) {
                i5 = Math.max(i5, i6);
            }
        }
        if (i5 == -1) {
            return -1.0f;
        }
        return i5 * f5;
    }

    @Override // com.google.android.gms.internal.ads.zzuu
    public final void zzaj(String str, zzuh zzuhVar, long j2, long j5) {
        this.zzc.zzb(str, j2, j5);
        if (Build.VERSION.SDK_INT >= 31) {
            Set set = this.zzf;
            if (set.isEmpty()) {
                return;
            }
            zzuk zzaE = zzaE();
            zzaE.getClass();
            zzaE.zzr(new ArrayList(set));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzuu
    public final void zzak(String str) {
        this.zzc.zzf(str);
    }

    @Override // com.google.android.gms.internal.ads.zzuu
    public final void zzal(Exception exc) {
        zzee.zzf("MediaCodecAudioRenderer", "Audio codec error", exc);
        this.zzc.zzj(exc);
    }

    @Override // com.google.android.gms.internal.ads.zzuu
    public final zzio zzam(zzlh zzlhVar) {
        zzv zzvVar = zzlhVar.zzb;
        zzvVar.getClass();
        this.zzj = zzvVar;
        zzio zzam = super.zzam(zzlhVar);
        this.zzc.zzc(zzvVar, zzam);
        return zzam;
    }

    @Override // com.google.android.gms.internal.ads.zzuu
    public final void zzan(zzv zzvVar, MediaFormat mediaFormat) {
        int i5;
        int valueTypeForKey;
        boolean z4 = true;
        if (Build.VERSION.SDK_INT >= 29 && mediaFormat != null) {
            Set<String> set = this.zzf;
            if (!set.isEmpty()) {
                zzil zzilVar = zzil.zza;
                zzik zzikVar = new zzik();
                for (String str : set) {
                    if (mediaFormat.containsKey(str)) {
                        valueTypeForKey = mediaFormat.getValueTypeForKey(str);
                        if (valueTypeForKey == 1) {
                            zzikVar.zza(str, mediaFormat.getInteger(str));
                        } else if (valueTypeForKey == 2) {
                            zzikVar.zzb(str, mediaFormat.getLong(str));
                        } else if (valueTypeForKey == 3) {
                            zzikVar.zzc(str, mediaFormat.getFloat(str));
                        } else if (valueTypeForKey == 4) {
                            zzikVar.zzd(str, mediaFormat.getString(str));
                        } else if (valueTypeForKey == 5) {
                            zzikVar.zze(str, mediaFormat.getByteBuffer(str));
                        }
                    }
                }
                zzil zzg = zzikVar.zzg();
                if (!zzg.equals(this.zzl)) {
                    this.zzl = zzg;
                    this.zzc.zzn(zzg);
                }
            }
        }
        zzv zzvVar2 = this.zzm;
        int[] iArr = null;
        if (zzvVar2 != null) {
            zzvVar = zzvVar2;
        } else if (zzaE() != null) {
            mediaFormat.getClass();
            int integer = "audio/raw".equals(zzvVar.zzo) ? zzvVar.zzI : mediaFormat.containsKey("pcm-encoding") ? mediaFormat.getInteger("pcm-encoding") : mediaFormat.containsKey("v-bits-per-sample") ? zzfj.zzz(mediaFormat.getInteger("v-bits-per-sample"), ByteOrder.LITTLE_ENDIAN) : 2;
            zzt zztVar = new zzt();
            zztVar.zzm("audio/raw");
            zztVar.zzG(integer);
            zztVar.zzH(zzvVar.zzJ);
            zztVar.zzI(zzvVar.zzK);
            zztVar.zzk(zzvVar.zzl);
            zztVar.zza(zzvVar.zza);
            zztVar.zzc(zzvVar.zzb);
            zztVar.zzd(zzvVar.zzc);
            zztVar.zze(zzvVar.zzd);
            zztVar.zzf(zzvVar.zze);
            zztVar.zzg(zzvVar.zzf);
            zztVar.zzE(mediaFormat.getInteger("channel-count"));
            zztVar.zzF(mediaFormat.getInteger("sample-rate"));
            zzv zzM = zztVar.zzM();
            if (this.zzh && zzM.zzG == 6 && (i5 = zzvVar.zzG) < 6) {
                iArr = new int[i5];
                for (int i6 = 0; i6 < i5; i6++) {
                    iArr[i6] = i6;
                }
            } else if (this.zzi) {
                int i7 = zzM.zzG;
                if (i7 == 3) {
                    iArr = new int[]{0, 2, 1};
                } else if (i7 == 5) {
                    iArr = new int[]{0, 2, 1, 3, 4};
                } else if (i7 == 6) {
                    iArr = new int[]{0, 2, 1, 5, 3, 4};
                } else if (i7 == 7) {
                    iArr = new int[]{0, 2, 1, 6, 5, 3, 4};
                } else if (i7 == 8) {
                    iArr = new int[]{0, 2, 1, 7, 5, 6, 3, 4};
                }
            }
            zzvVar = zzM;
        }
        try {
            int i8 = Build.VERSION.SDK_INT;
            if (i8 >= 29) {
                if (zzaD()) {
                    zzJ();
                }
                if (i8 < 29) {
                    z4 = false;
                }
                zzgrc.zzi(z4);
            }
            this.zzd.zzh(zzvVar, 0, iArr);
        } catch (zzre e4) {
            throw zzN(e4, e4.zza, false, 5001);
        }
    }

    public final void zzao() {
        this.zzo = true;
    }

    @Override // com.google.android.gms.internal.ads.zzuu
    public final void zzap() {
        this.zzd.zzj();
    }

    @Override // com.google.android.gms.internal.ads.zzuu
    public final boolean zzaq(long j2, long j5, zzuk zzukVar, ByteBuffer byteBuffer, int i5, int i6, int i7, long j6, boolean z4, boolean z5, zzv zzvVar) {
        byteBuffer.getClass();
        this.zzt = -9223372036854775807L;
        if (this.zzm != null && (i6 & 2) != 0) {
            zzukVar.getClass();
            zzukVar.zzc(i5, false);
            return true;
        }
        if (z4) {
            if (zzukVar != null) {
                zzukVar.zzc(i5, false);
            }
            ((zzuu) this).zza.zzf += i7;
            this.zzd.zzj();
            return true;
        }
        try {
            if (!this.zzd.zzk(byteBuffer, j6, i7)) {
                this.zzt = j6;
                return false;
            }
            if (zzukVar != null) {
                zzukVar.zzc(i5, false);
            }
            ((zzuu) this).zza.zze += i7;
            return true;
        } catch (zzrf e4) {
            zzv zzvVar2 = this.zzj;
            if (zzaD()) {
                zzJ();
            }
            throw zzN(e4, zzvVar2, false, 5001);
        } catch (zzri e5) {
            if (zzaD()) {
                zzJ();
            }
            throw zzN(e5, zzvVar, e5.zzb, 5002);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzuu
    public final void zzar() {
        try {
            this.zzd.zzl();
            if (zzba() != -9223372036854775807L) {
                this.zzt = zzba();
            }
        } catch (zzri e4) {
            throw zzN(e4, e4.zzc, e4.zzb, true != zzaD() ? 5002 : 5003);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzuu
    public final void zzas(zzih zzihVar) {
        zzv zzvVar;
        if (Build.VERSION.SDK_INT < 29 || (zzvVar = zzihVar.zza) == null || !Objects.equals(zzvVar.zzo, "audio/opus") || !zzaD()) {
            return;
        }
        ByteBuffer byteBuffer = zzihVar.zzf;
        byteBuffer.getClass();
        zzv zzvVar2 = zzihVar.zza;
        zzvVar2.getClass();
        int i5 = zzvVar2.zzJ;
        if (byteBuffer.remaining() == 8) {
            this.zzd.zzx(i5, (int) ((byteBuffer.order(ByteOrder.LITTLE_ENDIAN).getLong() * 48000) / 1000000000));
        }
    }

    public final /* synthetic */ zzrb zzaw() {
        return this.zzc;
    }

    public final /* synthetic */ zzug zzax() {
        return this.zze;
    }

    public final /* synthetic */ void zzay(boolean z4) {
        this.zzq = true;
    }

    @Override // com.google.android.gms.internal.ads.zzij, com.google.android.gms.internal.ads.zzml
    public final zzlm zzd() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzlm
    public final long zzg() {
        if (zze() == 2) {
            zzbi();
        }
        return this.zzn;
    }

    @Override // com.google.android.gms.internal.ads.zzlm
    public final boolean zzh() {
        boolean z4 = this.zzq;
        this.zzq = false;
        return z4;
    }

    @Override // com.google.android.gms.internal.ads.zzlm
    public final void zzi(zzav zzavVar) {
        this.zzd.zzo(zzavVar);
    }

    @Override // com.google.android.gms.internal.ads.zzlm
    public final zzav zzj() {
        return this.zzd.zzp();
    }

    @Override // com.google.android.gms.internal.ads.zzuu, com.google.android.gms.internal.ads.zzij, com.google.android.gms.internal.ads.zzmg
    public final void zzx(int i5, Object obj) {
        zzug zzugVar;
        if (i5 == 2) {
            zzrj zzrjVar = this.zzd;
            obj.getClass();
            zzrjVar.zzy(((Float) obj).floatValue());
            return;
        }
        if (i5 == 3) {
            zzd zzdVar = (zzd) obj;
            zzrj zzrjVar2 = this.zzd;
            zzdVar.getClass();
            zzrjVar2.zzr(zzdVar);
            return;
        }
        if (i5 == 6) {
            zze zzeVar = (zze) obj;
            zzrj zzrjVar3 = this.zzd;
            zzeVar.getClass();
            zzrjVar3.zzt(zzeVar);
            return;
        }
        if (i5 == 12) {
            this.zzd.zzu((AudioDeviceInfo) obj);
            return;
        }
        if (i5 == 16) {
            obj.getClass();
            this.zzr = ((Integer) obj).intValue();
            zzuk zzaE = zzaE();
            if (zzaE == null || Build.VERSION.SDK_INT < 35) {
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putInt("importance", Math.max(0, -this.zzr));
            zzaE.zzp(bundle);
            return;
        }
        if (i5 == 19) {
            zzrj zzrjVar4 = this.zzd;
            obj.getClass();
            zzrjVar4.zzv(((Integer) obj).intValue());
            return;
        }
        if (i5 == 9) {
            zzrj zzrjVar5 = this.zzd;
            obj.getClass();
            zzrjVar5.zzq(((Boolean) obj).booleanValue());
        } else {
            if (i5 != 10) {
                super.zzx(i5, obj);
                return;
            }
            obj.getClass();
            int intValue = ((Integer) obj).intValue();
            this.zzd.zzs(intValue);
            if (Build.VERSION.SDK_INT < 35 || (zzugVar = this.zze) == null) {
                return;
            }
            zzugVar.zza(intValue);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzuu, com.google.android.gms.internal.ads.zzij
    public final void zzy(boolean z4, boolean z5) {
        super.zzy(z4, z5);
        this.zzc.zza(((zzuu) this).zza);
        zzJ();
        zzrj zzrjVar = this.zzd;
        zzrjVar.zzb(zzK());
        zzrjVar.zzc(zzL());
    }
}
