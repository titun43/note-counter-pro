package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.DeniedByServerException;
import android.media.MediaCodec;
import android.media.MediaDrm;
import android.media.MediaDrmResetException;
import android.media.NotProvisionedException;
import android.media.metrics.LogSessionId;
import android.media.metrics.MediaMetricsManager;
import android.media.metrics.NetworkEvent;
import android.media.metrics.PlaybackErrorEvent;
import android.media.metrics.PlaybackMetrics;
import android.media.metrics.PlaybackSession;
import android.media.metrics.PlaybackStateEvent;
import android.media.metrics.TrackChangeEvent;
import android.os.SystemClock;
import android.system.ErrnoException;
import android.system.OsConstants;
import android.util.Pair;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class zzpm implements zzna, zzpn {
    private boolean zzA;
    private final Context zza;
    private final zzpo zzc;
    private final PlaybackSession zzd;
    private String zzj;
    private PlaybackMetrics.Builder zzk;
    private int zzl;
    private zzau zzo;
    private zzpl zzp;
    private zzpl zzq;
    private zzpl zzr;
    private zzv zzs;
    private zzv zzt;
    private zzv zzu;
    private boolean zzv;
    private boolean zzw;
    private int zzx;
    private int zzy;
    private int zzz;
    private final Executor zzb = zzdh.zza();
    private final zzbe zzf = new zzbe();
    private final zzbd zzg = new zzbd();
    private final HashMap zzi = new HashMap();
    private final HashMap zzh = new HashMap();
    private final long zze = SystemClock.elapsedRealtime();
    private int zzm = 0;
    private int zzn = 0;

    private zzpm(Context context, PlaybackSession playbackSession) {
        this.zza = context.getApplicationContext();
        this.zzd = playbackSession;
        zzpf zzpfVar = new zzpf(zzpf.zza);
        this.zzc = zzpfVar;
        zzpfVar.zza(this);
    }

    private final void zzA(int i5, long j2, zzv zzvVar, int i6) {
        TrackChangeEvent.Builder timeSinceCreatedMillis;
        final TrackChangeEvent build;
        timeSinceCreatedMillis = f.s(i5).setTimeSinceCreatedMillis(j2 - this.zze);
        if (zzvVar != null) {
            timeSinceCreatedMillis.setTrackState(1);
            timeSinceCreatedMillis.setTrackChangeReason(i6 != 1 ? 1 : 2);
            String str = zzvVar.zzn;
            if (str != null) {
                timeSinceCreatedMillis.setContainerMimeType(str);
            }
            String str2 = zzvVar.zzo;
            if (str2 != null) {
                timeSinceCreatedMillis.setSampleMimeType(str2);
            }
            String str3 = zzvVar.zzk;
            if (str3 != null) {
                timeSinceCreatedMillis.setCodecName(str3);
            }
            int i7 = zzvVar.zzj;
            if (i7 != -1) {
                timeSinceCreatedMillis.setBitrate(i7);
            }
            int i8 = zzvVar.zzv;
            if (i8 != -1) {
                timeSinceCreatedMillis.setWidth(i8);
            }
            int i9 = zzvVar.zzw;
            if (i9 != -1) {
                timeSinceCreatedMillis.setHeight(i9);
            }
            int i10 = zzvVar.zzG;
            if (i10 != -1) {
                timeSinceCreatedMillis.setChannelCount(i10);
            }
            int i11 = zzvVar.zzH;
            if (i11 != -1) {
                timeSinceCreatedMillis.setAudioSampleRate(i11);
            }
            String str4 = zzvVar.zzd;
            if (str4 != null) {
                String str5 = zzfj.zza;
                String[] split = str4.split("-", -1);
                Pair create = Pair.create(split[0], split.length >= 2 ? split[1] : null);
                timeSinceCreatedMillis.setLanguage((String) create.first);
                Object obj = create.second;
                if (obj != null) {
                    timeSinceCreatedMillis.setLanguageRegion((String) obj);
                }
            }
            float f5 = zzvVar.zzz;
            if (f5 != -1.0f) {
                timeSinceCreatedMillis.setVideoFrameRate(f5);
            }
        } else {
            timeSinceCreatedMillis.setTrackState(0);
        }
        this.zzA = true;
        build = timeSinceCreatedMillis.build();
        this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzpi
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzpm.this.zzu(build);
            }
        });
    }

    private final void zzB(zzbf zzbfVar, zzwk zzwkVar) {
        int zze;
        PlaybackMetrics.Builder builder = this.zzk;
        if (zzwkVar == null || (zze = zzbfVar.zze(zzwkVar.zza)) == -1) {
            return;
        }
        zzbd zzbdVar = this.zzg;
        int i5 = 0;
        zzbfVar.zzd(zze, zzbdVar, false);
        zzbe zzbeVar = this.zzf;
        zzbfVar.zzb(zzbdVar.zzc, zzbeVar, 0L);
        zzag zzagVar = zzbeVar.zzd.zzb;
        if (zzagVar != null) {
            int zzF = zzfj.zzF(zzagVar.zza);
            i5 = zzF != 0 ? zzF != 1 ? zzF != 2 ? 1 : 4 : 5 : 3;
        }
        builder.setStreamType(i5);
        long j2 = zzbeVar.zzm;
        if (j2 != -9223372036854775807L && !zzbeVar.zzk && !zzbeVar.zzi && !zzbeVar.zzb()) {
            builder.setMediaDurationMillis(zzfj.zzp(j2));
        }
        builder.setPlaybackType(true != zzbeVar.zzb() ? 1 : 2);
        this.zzA = true;
    }

    private final void zzC() {
        final PlaybackMetrics build;
        PlaybackMetrics.Builder builder = this.zzk;
        if (builder != null && this.zzA) {
            builder.setAudioUnderrunCount(this.zzz);
            this.zzk.setVideoFramesDropped(this.zzx);
            this.zzk.setVideoFramesPlayed(this.zzy);
            Long l5 = (Long) this.zzh.get(this.zzj);
            this.zzk.setNetworkTransferDurationMillis(l5 == null ? 0L : l5.longValue());
            Long l6 = (Long) this.zzi.get(this.zzj);
            this.zzk.setNetworkBytesRead(l6 == null ? 0L : l6.longValue());
            this.zzk.setStreamSource((l6 == null || l6.longValue() <= 0) ? 0 : 1);
            build = this.zzk.build();
            this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzpj
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzpm.this.zzv(build);
                }
            });
        }
        this.zzk = null;
        this.zzj = null;
        this.zzz = 0;
        this.zzx = 0;
        this.zzy = 0;
        this.zzs = null;
        this.zzt = null;
        this.zzu = null;
        this.zzA = false;
    }

    private static int zzD(int i5) {
        switch (zzfj.zzE(i5)) {
            case 6002:
                return 24;
            case 6003:
                return 28;
            case 6004:
                return 25;
            case 6005:
                return 26;
            default:
                return 27;
        }
    }

    public static zzpm zza(Context context) {
        PlaybackSession createPlaybackSession;
        MediaMetricsManager b2 = f.b(context.getSystemService("media_metrics"));
        if (b2 == null) {
            return null;
        }
        createPlaybackSession = b2.createPlaybackSession();
        return new zzpm(context, createPlaybackSession);
    }

    private final boolean zzw(zzpl zzplVar) {
        if (zzplVar != null) {
            return zzplVar.zzc.equals(this.zzc.zzf());
        }
        return false;
    }

    private final void zzx(long j2, zzv zzvVar, int i5) {
        if (Objects.equals(this.zzs, zzvVar)) {
            return;
        }
        int i6 = this.zzs == null ? 1 : 0;
        this.zzs = zzvVar;
        zzA(1, j2, zzvVar, i6);
    }

    private final void zzy(long j2, zzv zzvVar, int i5) {
        if (Objects.equals(this.zzt, zzvVar)) {
            return;
        }
        int i6 = this.zzt == null ? 1 : 0;
        this.zzt = zzvVar;
        zzA(0, j2, zzvVar, i6);
    }

    private final void zzz(long j2, zzv zzvVar, int i5) {
        if (Objects.equals(this.zzu, zzvVar)) {
            return;
        }
        int i6 = this.zzu == null ? 1 : 0;
        this.zzu = zzvVar;
        zzA(2, j2, zzvVar, i6);
    }

    public final LogSessionId zzb() {
        LogSessionId sessionId;
        sessionId = this.zzd.getSessionId();
        return sessionId;
    }

    @Override // com.google.android.gms.internal.ads.zzpn
    public final void zzc(zzmy zzmyVar, String str) {
        PlaybackMetrics.Builder playerName;
        PlaybackMetrics.Builder playerVersion;
        zzwk zzwkVar = zzmyVar.zzd;
        if (zzwkVar == null || !zzwkVar.zzb()) {
            zzC();
            this.zzj = str;
            playerName = f.l().setPlayerName("AndroidXMedia3");
            playerVersion = playerName.setPlayerVersion("1.9.0-beta01");
            this.zzk = playerVersion;
            zzB(zzmyVar.zzb, zzwkVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzpn
    public final void zzd(zzmy zzmyVar, String str, boolean z4) {
        zzwk zzwkVar = zzmyVar.zzd;
        if ((zzwkVar == null || !zzwkVar.zzb()) && str.equals(this.zzj)) {
            zzC();
        }
        this.zzh.remove(str);
        this.zzi.remove(str);
    }

    @Override // com.google.android.gms.internal.ads.zzna
    public final void zzde(zzmy zzmyVar, zzba zzbaVar, zzba zzbaVar2, int i5) {
        if (i5 == 1) {
            this.zzv = true;
            i5 = 1;
        }
        this.zzl = i5;
    }

    @Override // com.google.android.gms.internal.ads.zzna
    public final void zzdf(zzmy zzmyVar, zzwg zzwgVar) {
        zzwk zzwkVar = zzmyVar.zzd;
        if (zzwkVar == null) {
            return;
        }
        zzv zzvVar = zzwgVar.zzb;
        zzvVar.getClass();
        zzpl zzplVar = new zzpl(zzvVar, 0, this.zzc.zzb(zzmyVar.zzb, zzwkVar));
        int i5 = zzwgVar.zza;
        if (i5 != 0) {
            if (i5 == 1) {
                this.zzq = zzplVar;
                return;
            } else if (i5 != 2) {
                if (i5 != 3) {
                    return;
                }
                this.zzr = zzplVar;
                return;
            }
        }
        this.zzp = zzplVar;
    }

    @Override // com.google.android.gms.internal.ads.zzna
    public final void zzdg(zzmy zzmyVar, int i5, long j2, long j5) {
        zzwk zzwkVar = zzmyVar.zzd;
        if (zzwkVar != null) {
            String zzb = this.zzc.zzb(zzmyVar.zzb, zzwkVar);
            HashMap hashMap = this.zzi;
            Long l5 = (Long) hashMap.get(zzb);
            HashMap hashMap2 = this.zzh;
            Long l6 = (Long) hashMap2.get(zzb);
            hashMap.put(zzb, Long.valueOf((l5 == null ? 0L : l5.longValue()) + j2));
            hashMap2.put(zzb, Long.valueOf((l6 != null ? l6.longValue() : 0L) + i5));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzna
    public final void zzdh(zzmy zzmyVar, zzin zzinVar) {
        this.zzx += zzinVar.zzg;
        this.zzy += zzinVar.zze;
    }

    /* JADX WARN: Code restructure failed: missing block: B:143:0x01eb, code lost:
    
        if (r12 != 1) goto L137;
     */
    @Override // com.google.android.gms.internal.ads.zzna
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzdi(zzbb zzbbVar, zzmz zzmzVar) {
        int i5;
        int i6;
        PlaybackStateEvent.Builder state;
        PlaybackStateEvent.Builder timeSinceCreatedMillis;
        final PlaybackStateEvent build;
        NetworkEvent.Builder networkType;
        NetworkEvent.Builder timeSinceCreatedMillis2;
        final NetworkEvent build2;
        int i7;
        int i8;
        int errorCode;
        int zzQ;
        PlaybackErrorEvent.Builder timeSinceCreatedMillis3;
        PlaybackErrorEvent.Builder errorCode2;
        PlaybackErrorEvent.Builder subErrorCode;
        PlaybackErrorEvent.Builder exception;
        final PlaybackErrorEvent build3;
        zzq zzqVar;
        int i9;
        int i10;
        if (zzmzVar.zzc() == 0) {
            return;
        }
        for (int i11 = 0; i11 < zzmzVar.zzc(); i11++) {
            int zzd = zzmzVar.zzd(i11);
            zzmy zza = zzmzVar.zza(zzd);
            if (zzd == 0) {
                this.zzc.zzd(zza);
            } else if (zzd == 11) {
                this.zzc.zze(zza, this.zzl);
            } else {
                this.zzc.zzc(zza);
            }
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (zzmzVar.zzb(0)) {
            zzmy zza2 = zzmzVar.zza(0);
            if (this.zzk != null) {
                zzB(zza2.zzb, zza2.zzd);
            }
        }
        if (zzmzVar.zzb(2) && this.zzk != null) {
            zzguf zza3 = zzbbVar.zzp().zza();
            int size = zza3.size();
            int i12 = 0;
            loop1: while (true) {
                if (i12 >= size) {
                    zzqVar = null;
                    break;
                }
                zzbm zzbmVar = (zzbm) zza3.get(i12);
                int i13 = 0;
                while (true) {
                    i10 = i12 + 1;
                    if (i13 < zzbmVar.zza) {
                        if (zzbmVar.zzc(i13) && (zzqVar = zzbmVar.zza(i13).zzs) != null) {
                            break loop1;
                        } else {
                            i13++;
                        }
                    }
                }
                i12 = i10;
            }
            if (zzqVar != null) {
                PlaybackMetrics.Builder builder = this.zzk;
                String str = zzfj.zza;
                PlaybackMetrics.Builder d5 = c.d(builder);
                int i14 = 0;
                while (true) {
                    if (i14 >= zzqVar.zzb) {
                        i9 = 1;
                        break;
                    }
                    UUID uuid = zzqVar.zza(i14).zza;
                    if (uuid.equals(zzg.zzd)) {
                        i9 = 3;
                        break;
                    } else if (uuid.equals(zzg.zze)) {
                        i9 = 2;
                        break;
                    } else {
                        if (uuid.equals(zzg.zzc)) {
                            i9 = 6;
                            break;
                        }
                        i14++;
                    }
                }
                d5.setDrmType(i9);
            }
        }
        if (zzmzVar.zzb(1011)) {
            this.zzz++;
        }
        zzau zzauVar = this.zzo;
        if (zzauVar != null) {
            Context context = this.zza;
            int i15 = zzauVar.zza;
            if (i15 == 1001) {
                i8 = 20;
            } else {
                zziw zziwVar = (zziw) zzauVar;
                boolean z4 = zziwVar.zzc == 1;
                int i16 = zziwVar.zzg;
                Throwable cause = zzauVar.getCause();
                cause.getClass();
                if (cause instanceof IOException) {
                    if (cause instanceof zzhs) {
                        zzQ = ((zzhs) cause).zzc;
                        i8 = 5;
                    } else if ((cause instanceof zzhr) || (cause instanceof zzat)) {
                        zzQ = 0;
                        i8 = 11;
                    } else {
                        boolean z5 = cause instanceof zzhq;
                        if (z5 || (cause instanceof zzia)) {
                            if (zzep.zza(context).zzc() == 1) {
                                zzQ = 0;
                                i8 = 3;
                            } else {
                                Throwable cause2 = cause.getCause();
                                if (cause2 instanceof UnknownHostException) {
                                    zzQ = 0;
                                    i8 = 6;
                                } else if (cause2 instanceof SocketTimeoutException) {
                                    zzQ = 0;
                                    i8 = 7;
                                } else if (z5 && ((zzhq) cause).zzb == 1) {
                                    zzQ = 0;
                                    i8 = 4;
                                } else {
                                    zzQ = 0;
                                    i8 = 8;
                                }
                            }
                        } else if (i15 == 1002) {
                            i8 = 21;
                        } else if (cause instanceof zztg) {
                            Throwable cause3 = cause.getCause();
                            cause3.getClass();
                            if (cause3 instanceof MediaDrm.MediaDrmStateException) {
                                errorCode = zzfj.zzQ(((MediaDrm.MediaDrmStateException) cause3).getDiagnosticInfo());
                                i7 = zzD(errorCode);
                                int i17 = i7;
                                zzQ = errorCode;
                                i8 = i17;
                            } else if (cause3 instanceof MediaDrmResetException) {
                                i8 = 27;
                            } else if (cause3 instanceof NotProvisionedException) {
                                i8 = 24;
                            } else if (cause3 instanceof DeniedByServerException) {
                                i8 = 29;
                            } else {
                                if (!(cause3 instanceof zztq)) {
                                    i8 = cause3 instanceof zztf ? 28 : 30;
                                }
                                zzQ = 0;
                                i8 = 23;
                            }
                        } else if ((cause instanceof zzhn) && (cause.getCause() instanceof FileNotFoundException)) {
                            Throwable cause4 = cause.getCause();
                            cause4.getClass();
                            Throwable cause5 = cause4.getCause();
                            if ((cause5 instanceof ErrnoException) && ((ErrnoException) cause5).errno == OsConstants.EACCES) {
                                i8 = 32;
                            } else {
                                zzQ = 0;
                                i8 = 31;
                            }
                        } else {
                            zzQ = 0;
                            i8 = 9;
                        }
                    }
                    timeSinceCreatedMillis3 = f.g().setTimeSinceCreatedMillis(elapsedRealtime - this.zze);
                    errorCode2 = timeSinceCreatedMillis3.setErrorCode(i8);
                    subErrorCode = errorCode2.setSubErrorCode(zzQ);
                    exception = subErrorCode.setException(zzauVar);
                    build3 = exception.build();
                    this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzpk
                        @Override // java.lang.Runnable
                        public final /* synthetic */ void run() {
                            zzpm.this.zzr(build3);
                        }
                    });
                    this.zzA = true;
                    this.zzo = null;
                } else {
                    if (z4) {
                        i8 = 35;
                        if (i16 != 0) {
                        }
                    }
                    if (z4 && i16 == 3) {
                        i8 = 15;
                    } else {
                        if (!z4 || i16 != 2) {
                            if (cause instanceof zzuq) {
                                zzQ = zzfj.zzQ(((zzuq) cause).zzd);
                                i8 = 13;
                                timeSinceCreatedMillis3 = f.g().setTimeSinceCreatedMillis(elapsedRealtime - this.zze);
                                errorCode2 = timeSinceCreatedMillis3.setErrorCode(i8);
                                subErrorCode = errorCode2.setSubErrorCode(zzQ);
                                exception = subErrorCode.setException(zzauVar);
                                build3 = exception.build();
                                this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzpk
                                    @Override // java.lang.Runnable
                                    public final /* synthetic */ void run() {
                                        zzpm.this.zzr(build3);
                                    }
                                });
                                this.zzA = true;
                                this.zzo = null;
                            } else {
                                i7 = 14;
                                if (cause instanceof zzum) {
                                    errorCode = ((zzum) cause).zza;
                                } else if (cause instanceof OutOfMemoryError) {
                                    i8 = 14;
                                } else if (cause instanceof zzrf) {
                                    i8 = 17;
                                } else if (cause instanceof zzri) {
                                    errorCode = ((zzri) cause).zza;
                                    i7 = 18;
                                } else if (cause instanceof MediaCodec.CryptoException) {
                                    errorCode = ((MediaCodec.CryptoException) cause).getErrorCode();
                                    i7 = zzD(errorCode);
                                } else {
                                    i8 = 22;
                                }
                                int i172 = i7;
                                zzQ = errorCode;
                                i8 = i172;
                                timeSinceCreatedMillis3 = f.g().setTimeSinceCreatedMillis(elapsedRealtime - this.zze);
                                errorCode2 = timeSinceCreatedMillis3.setErrorCode(i8);
                                subErrorCode = errorCode2.setSubErrorCode(zzQ);
                                exception = subErrorCode.setException(zzauVar);
                                build3 = exception.build();
                                this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzpk
                                    @Override // java.lang.Runnable
                                    public final /* synthetic */ void run() {
                                        zzpm.this.zzr(build3);
                                    }
                                });
                                this.zzA = true;
                                this.zzo = null;
                            }
                        }
                        zzQ = 0;
                        i8 = 23;
                        timeSinceCreatedMillis3 = f.g().setTimeSinceCreatedMillis(elapsedRealtime - this.zze);
                        errorCode2 = timeSinceCreatedMillis3.setErrorCode(i8);
                        subErrorCode = errorCode2.setSubErrorCode(zzQ);
                        exception = subErrorCode.setException(zzauVar);
                        build3 = exception.build();
                        this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzpk
                            @Override // java.lang.Runnable
                            public final /* synthetic */ void run() {
                                zzpm.this.zzr(build3);
                            }
                        });
                        this.zzA = true;
                        this.zzo = null;
                    }
                }
            }
            zzQ = 0;
            timeSinceCreatedMillis3 = f.g().setTimeSinceCreatedMillis(elapsedRealtime - this.zze);
            errorCode2 = timeSinceCreatedMillis3.setErrorCode(i8);
            subErrorCode = errorCode2.setSubErrorCode(zzQ);
            exception = subErrorCode.setException(zzauVar);
            build3 = exception.build();
            this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzpk
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzpm.this.zzr(build3);
                }
            });
            this.zzA = true;
            this.zzo = null;
        }
        if (zzmzVar.zzb(2)) {
            zzbn zzp = zzbbVar.zzp();
            boolean zzb = zzp.zzb(2);
            boolean zzb2 = zzp.zzb(1);
            boolean zzb3 = zzp.zzb(3);
            if (!zzb && !zzb2) {
                if (zzb3) {
                    zzb3 = true;
                }
            }
            if (!zzb) {
                zzx(elapsedRealtime, null, 0);
            }
            if (!zzb2) {
                zzy(elapsedRealtime, null, 0);
            }
            if (!zzb3) {
                zzz(elapsedRealtime, null, 0);
            }
        }
        if (zzw(this.zzp)) {
            zzv zzvVar = this.zzp.zza;
            if (zzvVar.zzw != -1) {
                zzx(elapsedRealtime, zzvVar, 0);
                this.zzp = null;
            }
        }
        if (zzw(this.zzq)) {
            zzy(elapsedRealtime, this.zzq.zza, 0);
            this.zzq = null;
        }
        if (zzw(this.zzr)) {
            zzz(elapsedRealtime, this.zzr.zza, 0);
            this.zzr = null;
        }
        switch (zzep.zza(this.zza).zzc()) {
            case 0:
                i5 = 0;
                break;
            case 1:
                i5 = 9;
                break;
            case 2:
                i5 = 2;
                break;
            case 3:
                i5 = 4;
                break;
            case 4:
                i5 = 5;
                break;
            case 5:
                i5 = 6;
                break;
            case 6:
            case 8:
            default:
                i5 = 1;
                break;
            case 7:
                i5 = 3;
                break;
            case 9:
                i5 = 8;
                break;
            case 10:
                i5 = 7;
                break;
        }
        if (i5 != this.zzn) {
            this.zzn = i5;
            networkType = f.c().setNetworkType(i5);
            timeSinceCreatedMillis2 = networkType.setTimeSinceCreatedMillis(elapsedRealtime - this.zze);
            build2 = timeSinceCreatedMillis2.build();
            this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzpg
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzpm.this.zzs(build2);
                }
            });
        }
        if (zzbbVar.zzh() != 2) {
            this.zzv = false;
        }
        if (((zzmv) zzbbVar).zzI() == null) {
            this.zzw = false;
        } else if (zzmzVar.zzb(10)) {
            this.zzw = true;
        }
        int zzh = zzbbVar.zzh();
        if (this.zzv) {
            i6 = 5;
        } else if (this.zzw) {
            i6 = 13;
        } else {
            i6 = 4;
            if (zzh == 4) {
                i6 = 11;
            } else if (zzh == 2) {
                int i18 = this.zzm;
                i6 = (i18 == 0 || i18 == 2 || i18 == 12) ? 2 : !zzbbVar.zzk() ? 7 : zzbbVar.zzi() != 0 ? 10 : 6;
            } else if (zzh != 3) {
                i6 = (zzh != 1 || this.zzm == 0) ? this.zzm : 12;
            } else if (zzbbVar.zzk()) {
                i6 = zzbbVar.zzi() != 0 ? 9 : 3;
            }
        }
        if (this.zzm != i6) {
            this.zzm = i6;
            this.zzA = true;
            state = f.o().setState(this.zzm);
            timeSinceCreatedMillis = state.setTimeSinceCreatedMillis(elapsedRealtime - this.zze);
            build = timeSinceCreatedMillis.build();
            this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzph
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzpm.this.zzt(build);
                }
            });
        }
        if (zzmzVar.zzb(1028)) {
            this.zzc.zzg(zzmzVar.zza(1028));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzna
    public final void zzg(zzmy zzmyVar, zzau zzauVar) {
        this.zzo = zzauVar;
    }

    @Override // com.google.android.gms.internal.ads.zzna
    public final void zzh(zzmy zzmyVar, zzwb zzwbVar, zzwg zzwgVar, IOException iOException, boolean z4) {
    }

    @Override // com.google.android.gms.internal.ads.zzna
    public final void zzp(zzmy zzmyVar, zzbv zzbvVar) {
        zzpl zzplVar = this.zzp;
        if (zzplVar != null) {
            zzv zzvVar = zzplVar.zza;
            if (zzvVar.zzw == -1) {
                zzt zza = zzvVar.zza();
                zza.zzt(zzbvVar.zzb);
                zza.zzu(zzbvVar.zzc);
                this.zzp = new zzpl(zza.zzM(), 0, zzplVar.zzc);
            }
        }
    }

    public final /* synthetic */ void zzr(PlaybackErrorEvent playbackErrorEvent) {
        this.zzd.reportPlaybackErrorEvent(playbackErrorEvent);
    }

    public final /* synthetic */ void zzs(NetworkEvent networkEvent) {
        this.zzd.reportNetworkEvent(networkEvent);
    }

    public final /* synthetic */ void zzt(PlaybackStateEvent playbackStateEvent) {
        this.zzd.reportPlaybackStateEvent(playbackStateEvent);
    }

    public final /* synthetic */ void zzu(TrackChangeEvent trackChangeEvent) {
        this.zzd.reportTrackChangeEvent(trackChangeEvent);
    }

    public final /* synthetic */ void zzv(PlaybackMetrics playbackMetrics) {
        this.zzd.reportPlaybackMetrics(playbackMetrics);
    }
}
