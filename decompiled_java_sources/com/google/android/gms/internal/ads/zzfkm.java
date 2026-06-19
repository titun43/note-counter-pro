package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.MobileAds;

/* loaded from: classes.dex */
public final class zzfkm {
    public static com.google.android.gms.ads.internal.client.zze zza(Throwable th) {
        if (th instanceof zzekk) {
            zzekk zzekkVar = (zzekk) th;
            return zzc(zzekkVar.zza(), zzekkVar.zzb());
        }
        if (th instanceof zzecr) {
            return th.getMessage() == null ? zzd(((zzecr) th).zza(), null, null) : zzd(((zzecr) th).zza(), th.getMessage(), null);
        }
        if (!(th instanceof com.google.android.gms.ads.internal.util.zzaz)) {
            return zzd(1, null, null);
        }
        com.google.android.gms.ads.internal.util.zzaz zzazVar = (com.google.android.gms.ads.internal.util.zzaz) th;
        return new com.google.android.gms.ads.internal.client.zze(zzazVar.zza(), zzgrt.zza(zzazVar.getMessage()), MobileAds.ERROR_DOMAIN, null, null);
    }

    public static com.google.android.gms.ads.internal.client.zze zzb(Throwable th, zzekl zzeklVar) {
        com.google.android.gms.ads.internal.client.zze zzeVar;
        com.google.android.gms.ads.internal.client.zze zza = zza(th);
        int i5 = zza.zza;
        if ((i5 == 3 || i5 == 0) && (zzeVar = zza.zzd) != null && !zzeVar.zzc.equals(MobileAds.ERROR_DOMAIN)) {
            zza.zzd = null;
        }
        if (zzeklVar != null) {
            zza.zze = zzeklVar.zzf();
        }
        return zza;
    }

    public static com.google.android.gms.ads.internal.client.zze zzc(int i5, com.google.android.gms.ads.internal.client.zze zzeVar) {
        if (i5 == 0) {
            throw null;
        }
        if (i5 == 8) {
            if (((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzjC)).intValue() > 0) {
                return zzeVar;
            }
            i5 = 8;
        }
        return zzd(i5, null, zzeVar);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static com.google.android.gms.ads.internal.client.zze zzd(int i5, String str, com.google.android.gms.ads.internal.client.zze zzeVar) {
        String str2;
        int i6 = i5 - 1;
        if (str == null) {
            if (i5 == 0) {
                throw null;
            }
            str = "No fill.";
            switch (i6) {
                case 1:
                    str = "Invalid request.";
                    break;
                case 2:
                    break;
                case 3:
                    str = "App ID missing.";
                    break;
                case 4:
                    str = "Network error.";
                    break;
                case 5:
                    str = "Invalid request: Invalid ad unit ID.";
                    break;
                case 6:
                    str = "Invalid request: Invalid ad size.";
                    break;
                case 7:
                    str = "A mediation adapter failed to show the ad.";
                    break;
                case 8:
                    str = "The ad is not ready.";
                    break;
                case 9:
                    str = "The ad has already been shown.";
                    break;
                case 10:
                    str = "The ad can not be shown when app is not in foreground.";
                    break;
                case 11:
                default:
                    str = "Internal error.";
                    break;
                case 12:
                    if (((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzjF)).intValue() <= 0) {
                        str = "The mediation adapter did not return an ad.";
                        break;
                    }
                    break;
                case 13:
                    str = "Mismatch request IDs.";
                    break;
                case 14:
                    str = "Invalid ad string.";
                    break;
                case 15:
                    str = "Ad inspector had an internal error.";
                    break;
                case 16:
                    str = "Ad inspector failed to load.";
                    break;
                case 17:
                    str = "Ad inspector cannot be opened because the device is not in test mode. See https://developers.google.com/admob/android/test-ads#enable_test_devices for more information.";
                    break;
                case 18:
                    str = "Ad inspector cannot be opened because it is already open.";
                    break;
            }
        }
        String str3 = str;
        if (i5 == 0) {
            throw null;
        }
        int i7 = 0;
        int i8 = 2;
        switch (i6) {
            case 0:
            case 11:
            case 15:
                i8 = i7;
                return new com.google.android.gms.ads.internal.client.zze(i8, str3, MobileAds.ERROR_DOMAIN, zzeVar, null);
            case 1:
            case 5:
            case 6:
            case 9:
            case 16:
                i8 = 1;
                return new com.google.android.gms.ads.internal.client.zze(i8, str3, MobileAds.ERROR_DOMAIN, zzeVar, null);
            case 2:
            case 10:
            case 18:
                i8 = 3;
                return new com.google.android.gms.ads.internal.client.zze(i8, str3, MobileAds.ERROR_DOMAIN, zzeVar, null);
            case 3:
                i7 = 8;
                i8 = i7;
                return new com.google.android.gms.ads.internal.client.zze(i8, str3, MobileAds.ERROR_DOMAIN, zzeVar, null);
            case 4:
            case 8:
            case 17:
                return new com.google.android.gms.ads.internal.client.zze(i8, str3, MobileAds.ERROR_DOMAIN, zzeVar, null);
            case 7:
                i7 = 4;
                i8 = i7;
                return new com.google.android.gms.ads.internal.client.zze(i8, str3, MobileAds.ERROR_DOMAIN, zzeVar, null);
            case 12:
                if (((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzjF)).intValue() <= 0) {
                    i7 = 9;
                    i8 = i7;
                    return new com.google.android.gms.ads.internal.client.zze(i8, str3, MobileAds.ERROR_DOMAIN, zzeVar, null);
                }
                i8 = 3;
                return new com.google.android.gms.ads.internal.client.zze(i8, str3, MobileAds.ERROR_DOMAIN, zzeVar, null);
            case 13:
                i7 = 10;
                i8 = i7;
                return new com.google.android.gms.ads.internal.client.zze(i8, str3, MobileAds.ERROR_DOMAIN, zzeVar, null);
            case 14:
                i7 = 11;
                i8 = i7;
                return new com.google.android.gms.ads.internal.client.zze(i8, str3, MobileAds.ERROR_DOMAIN, zzeVar, null);
            default:
                switch (i5) {
                    case 1:
                        str2 = "INTERNAL_ERROR";
                        break;
                    case 2:
                        str2 = "INVALID_REQUEST";
                        break;
                    case 3:
                        str2 = "NO_FILL";
                        break;
                    case 4:
                        str2 = "APP_ID_MISSING";
                        break;
                    case 5:
                        str2 = "NETWORK_ERROR";
                        break;
                    case 6:
                        str2 = "INVALID_AD_UNIT_ID";
                        break;
                    case 7:
                        str2 = "INVALID_AD_SIZE";
                        break;
                    case 8:
                        str2 = "MEDIATION_SHOW_ERROR";
                        break;
                    case 9:
                        str2 = "NOT_READY";
                        break;
                    case 10:
                        str2 = "AD_REUSED";
                        break;
                    case 11:
                        str2 = "APP_NOT_FOREGROUND";
                        break;
                    case 12:
                        str2 = "INTERNAL_SHOW_ERROR";
                        break;
                    case 13:
                        str2 = "MEDIATION_NO_FILL";
                        break;
                    case 14:
                        str2 = "REQUEST_ID_MISMATCH";
                        break;
                    case 15:
                        str2 = "INVALID_AD_STRING";
                        break;
                    case 16:
                        str2 = "AD_INSPECTOR_INTERNAL_ERROR";
                        break;
                    case 17:
                        str2 = "AD_INSPECTOR_FAILED_TO_LOAD";
                        break;
                    case 18:
                        str2 = "AD_INSPECTOR_NOT_IN_TEST_MODE";
                        break;
                    default:
                        str2 = "AD_INSPECTOR_ALREADY_OPEN";
                        break;
                }
                throw new AssertionError("Unknown SdkError: ".concat(str2));
        }
    }
}
