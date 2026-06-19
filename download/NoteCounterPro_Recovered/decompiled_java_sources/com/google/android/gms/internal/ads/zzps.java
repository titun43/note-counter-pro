package com.google.android.gms.internal.ads;

import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioDeviceInfo;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioProfile;
import android.media.AudioTrack;
import android.net.Uri;
import android.os.Build;
import android.provider.Settings;
import android.util.Pair;
import android.util.SparseArray;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* loaded from: classes.dex */
public final class zzps {
    static final zzgui zzb;
    private final SparseArray zzd = new SparseArray();
    private final int zze;
    public static final zzps zza = new zzps(zzguf.zzj(zzpr.zza));
    private static final zzguf zzc = zzguf.zzl(2, 5, 6);

    static {
        zzguh zzguhVar = new zzguh();
        zzguhVar.zza(5, 6);
        zzguhVar.zza(17, 6);
        zzguhVar.zza(7, 6);
        zzguhVar.zza(30, 10);
        zzguhVar.zza(18, 6);
        zzguhVar.zza(6, 8);
        zzguhVar.zza(8, 8);
        zzguhVar.zza(14, 8);
        zzb = zzguhVar.zzc();
    }

    private zzps(List list) {
        for (int i5 = 0; i5 < list.size(); i5++) {
            zzpr zzprVar = (zzpr) list.get(i5);
            this.zzd.put(zzprVar.zzb, zzprVar);
        }
        int i6 = 0;
        for (int i7 = 0; i7 < this.zzd.size(); i7++) {
            i6 = Math.max(i6, ((zzpr) this.zzd.valueAt(i7)).zzc);
        }
        this.zze = i6;
    }

    public static zzps zza(Context context, zzd zzdVar, AudioDeviceInfo audioDeviceInfo) {
        return zzb(context, context.registerReceiver(null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG")), zzdVar, audioDeviceInfo);
    }

    public static zzps zzb(Context context, Intent intent, zzd zzdVar, AudioDeviceInfo audioDeviceInfo) {
        boolean isDirectPlaybackSupported;
        List directProfilesForAttributes;
        int encapsulationType;
        int format;
        int[] channelMasks;
        int[] channelMasks2;
        List audioDevicesForAttributes;
        AudioManager zza2 = zzcj.zza(context);
        if (audioDeviceInfo == null) {
            if (Build.VERSION.SDK_INT >= 33) {
                audioDevicesForAttributes = zza2.getAudioDevicesForAttributes(zzdVar.zza());
                if (!audioDevicesForAttributes.isEmpty()) {
                    audioDeviceInfo = (AudioDeviceInfo) audioDevicesForAttributes.get(0);
                }
            }
            audioDeviceInfo = null;
        }
        int i5 = Build.VERSION.SDK_INT;
        if (i5 >= 33 && (zzfj.zzM(context) || zzfj.zzN(context))) {
            directProfilesForAttributes = zza2.getDirectProfilesForAttributes(zzdVar.zza());
            HashMap hashMap = new HashMap();
            hashMap.put(2, new HashSet(zzgxz.zzg(12)));
            for (int i6 = 0; i6 < directProfilesForAttributes.size(); i6++) {
                AudioProfile h = g.h(directProfilesForAttributes.get(i6));
                encapsulationType = h.getEncapsulationType();
                if (encapsulationType != 1) {
                    format = h.getFormat();
                    if (zzfj.zzA(format) || zzb.containsKey(Integer.valueOf(format))) {
                        Integer valueOf = Integer.valueOf(format);
                        if (hashMap.containsKey(valueOf)) {
                            Set set = (Set) hashMap.get(valueOf);
                            set.getClass();
                            channelMasks2 = h.getChannelMasks();
                            set.addAll(zzgxz.zzg(channelMasks2));
                        } else {
                            channelMasks = h.getChannelMasks();
                            hashMap.put(valueOf, new HashSet(zzgxz.zzg(channelMasks)));
                        }
                    }
                }
            }
            int i7 = zzguf.zzd;
            zzguc zzgucVar = new zzguc();
            for (Map.Entry entry : hashMap.entrySet()) {
                zzgucVar.zzf(new zzpr(((Integer) entry.getKey()).intValue(), (Set) entry.getValue()));
            }
            return new zzps(zzgucVar.zzi());
        }
        AudioDeviceInfo[] devices = audioDeviceInfo == null ? zza2.getDevices(2) : new AudioDeviceInfo[]{audioDeviceInfo};
        zzguo zzguoVar = new zzguo();
        zzguoVar.zzg(8, 7);
        if (i5 >= 31) {
            zzguoVar.zzg(26, 27);
        }
        if (i5 >= 33) {
            zzguoVar.zzf((Object) 30);
        }
        zzgup zzi = zzguoVar.zzi();
        for (AudioDeviceInfo audioDeviceInfo2 : devices) {
            if (zzi.contains(Integer.valueOf(audioDeviceInfo2.getType()))) {
                return zza;
            }
        }
        zzguo zzguoVar2 = new zzguo();
        zzguoVar2.zzf((Object) 2);
        if (Build.VERSION.SDK_INT >= 29 && (zzfj.zzM(context) || zzfj.zzN(context))) {
            int i8 = zzguf.zzd;
            zzguc zzgucVar2 = new zzguc();
            zzgwt it = zzb.keySet().iterator();
            while (it.hasNext()) {
                Integer num = (Integer) it.next();
                int intValue = num.intValue();
                if (Build.VERSION.SDK_INT >= zzfj.zzC(intValue)) {
                    isDirectPlaybackSupported = AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setChannelMask(12).setEncoding(intValue).setSampleRate(48000).build(), zzdVar.zza());
                    if (isDirectPlaybackSupported) {
                        zzgucVar2.zzf(num);
                    }
                }
            }
            zzgucVar2.zzf((Object) 2);
            zzguoVar2.zzh(zzgucVar2.zzi());
            return new zzps(zzf(zzgxz.zzf(zzguoVar2.zzi()), 10));
        }
        ContentResolver contentResolver = context.getContentResolver();
        boolean z4 = Settings.Global.getInt(contentResolver, "use_external_surround_sound_flag", 0) == 1;
        if ((z4 || zze()) && Settings.Global.getInt(contentResolver, "external_surround_sound_enabled", 0) == 1) {
            zzguoVar2.zzh(zzc);
        }
        if (intent == null || z4 || intent.getIntExtra("android.media.extra.AUDIO_PLUG_STATE", 0) != 1) {
            return new zzps(zzf(zzgxz.zzf(zzguoVar2.zzi()), 10));
        }
        int[] intArrayExtra = intent.getIntArrayExtra("android.media.extra.ENCODINGS");
        if (intArrayExtra != null) {
            zzguoVar2.zzh(zzgxz.zzg(intArrayExtra));
        }
        return new zzps(zzf(zzgxz.zzf(zzguoVar2.zzi()), intent.getIntExtra("android.media.extra.MAX_CHANNEL_COUNT", 10)));
    }

    public static Uri zzc() {
        if (zze()) {
            return Settings.Global.getUriFor("external_surround_sound_enabled");
        }
        return null;
    }

    private static boolean zze() {
        String str = Build.MANUFACTURER;
        return str.equals("Amazon") || str.equals("Xiaomi");
    }

    private static zzguf zzf(int[] iArr, int i5) {
        int i6 = zzguf.zzd;
        zzguc zzgucVar = new zzguc();
        if (iArr == null) {
            iArr = new int[0];
        }
        for (int i7 : iArr) {
            zzgucVar.zzf(new zzpr(i7, i5));
        }
        return zzgucVar.zzi();
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x001b, code lost:
    
        if (r0 != false) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean equals(Object obj) {
        boolean contentEquals;
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzps) {
            zzps zzpsVar = (zzps) obj;
            SparseArray sparseArray = this.zzd;
            SparseArray sparseArray2 = zzpsVar.zzd;
            String str = zzfj.zza;
            if (Build.VERSION.SDK_INT >= 31) {
                contentEquals = sparseArray.contentEquals(sparseArray2);
            } else {
                int size = sparseArray.size();
                if (size == sparseArray2.size()) {
                    for (int i5 = 0; i5 < size; i5++) {
                        if (!Objects.equals(sparseArray.valueAt(i5), sparseArray2.get(sparseArray.keyAt(i5)))) {
                            break;
                        }
                    }
                    if (this.zze == zzpsVar.zze) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i5;
        String str = zzfj.zza;
        int i6 = Build.VERSION.SDK_INT;
        SparseArray sparseArray = this.zzd;
        if (i6 >= 31) {
            i5 = sparseArray.contentHashCode();
        } else {
            int i7 = 17;
            for (int i8 = 0; i8 < sparseArray.size(); i8++) {
                i7 = Objects.hashCode(sparseArray.valueAt(i8)) + ((sparseArray.keyAt(i8) + (i7 * 31)) * 31);
            }
            i5 = i7;
        }
        return (i5 * 31) + this.zze;
    }

    public final String toString() {
        String obj = this.zzd.toString();
        int i5 = this.zze;
        StringBuilder sb = new StringBuilder(String.valueOf(i5).length() + 50 + obj.length() + 1);
        sb.append("AudioCapabilities[maxChannelCount=");
        sb.append(i5);
        sb.append(", audioProfiles=");
        sb.append(obj);
        sb.append("]");
        return sb.toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:61:0x0044, code lost:
    
        if (com.google.android.gms.internal.ads.zzfj.zza(r9.zzd, 30) == false) goto L15;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00bf A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Pair zzd(zzv zzvVar, zzd zzdVar) {
        SparseArray sparseArray;
        int zzB;
        String str = zzvVar.zzo;
        str.getClass();
        int zzg = zzas.zzg(str, zzvVar.zzk);
        if (!zzb.containsKey(Integer.valueOf(zzg))) {
            return null;
        }
        int i5 = 8;
        if (zzg == 18) {
            if (zzfj.zza(this.zzd, 18)) {
                zzg = 18;
            } else {
                zzg = 6;
                sparseArray = this.zzd;
                if (!zzfj.zza(sparseArray, zzg)) {
                    return null;
                }
                zzpr zzprVar = (zzpr) sparseArray.get(zzg);
                zzprVar.getClass();
                int i6 = zzvVar.zzG;
                if (i6 == -1 || zzg == 18) {
                    int i7 = zzvVar.zzH;
                    if (i7 == -1) {
                        i7 = 48000;
                    }
                    i6 = zzprVar.zzb(i7, zzdVar);
                } else if (!str.equals("audio/vnd.dts.uhd;profile=p2") || Build.VERSION.SDK_INT >= 33) {
                    if (!zzprVar.zza(i6)) {
                        return null;
                    }
                } else if (i6 > 10) {
                    return null;
                }
                int i8 = Build.VERSION.SDK_INT;
                if (i8 <= 28) {
                    if (i6 != 7) {
                        if (i6 == 3 || i6 == 4 || i6 == 5) {
                            i5 = 6;
                        }
                    }
                    if (i8 <= 26 && "fugu".equals(Build.DEVICE) && i5 == 1) {
                        i5 = 2;
                    }
                    zzB = zzfj.zzB(i5);
                    if (zzB == 0) {
                        return Pair.create(Integer.valueOf(zzg), Integer.valueOf(zzB));
                    }
                    return null;
                }
                i5 = i6;
                if (i8 <= 26) {
                    i5 = 2;
                }
                zzB = zzfj.zzB(i5);
                if (zzB == 0) {
                }
            }
        }
        if (zzg == 8) {
            if (zzfj.zza(this.zzd, 8)) {
                zzg = 8;
            }
            zzg = 7;
            sparseArray = this.zzd;
            if (!zzfj.zza(sparseArray, zzg)) {
            }
        }
        if (zzg == 30) {
        }
        sparseArray = this.zzd;
        if (!zzfj.zza(sparseArray, zzg)) {
        }
    }
}
