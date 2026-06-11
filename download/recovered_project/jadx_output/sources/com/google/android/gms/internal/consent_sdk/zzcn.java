package com.google.android.gms.internal.consent_sdk;

import android.util.JsonReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class zzcn {
    public String zza;
    public String zzb;
    public String zzc;
    public List zzd;
    public List zze;
    public String zzf;
    public int zzg = 1;
    public int zzh;

    public zzcn() {
        List list = Collections.EMPTY_LIST;
        this.zzd = list;
        this.zze = list;
        this.zzh = 1;
    }

    public static zzcn zza(JsonReader jsonReader) {
        int i5;
        zzcn zzcnVar = new zzcn();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            int i6 = 3;
            switch (nextName.hashCode()) {
                case -2001388947:
                    if (nextName.equals("consent_signal")) {
                        String nextString = jsonReader.nextString();
                        switch (nextString.hashCode()) {
                            case -2058725357:
                                if (!nextString.equals("CONSENT_SIGNAL_COLLECT_CONSENT")) {
                                    throw new IOException("Failed to parse contentads.contributor.direct.serving.appswitchboard.proto.ApplicationGdprResponse.ConsentSignalfrom: ".concat(nextString));
                                }
                                i6 = 5;
                                zzcnVar.zzg = i6;
                            case -1969035850:
                                if (!nextString.equals("CONSENT_SIGNAL_ERROR")) {
                                    throw new IOException("Failed to parse contentads.contributor.direct.serving.appswitchboard.proto.ApplicationGdprResponse.ConsentSignalfrom: ".concat(nextString));
                                }
                                i6 = 7;
                                zzcnVar.zzg = i6;
                            case -1263695752:
                                if (!nextString.equals("CONSENT_SIGNAL_UNKNOWN")) {
                                    throw new IOException("Failed to parse contentads.contributor.direct.serving.appswitchboard.proto.ApplicationGdprResponse.ConsentSignalfrom: ".concat(nextString));
                                }
                                i6 = 1;
                                zzcnVar.zzg = i6;
                            case -954325659:
                                if (!nextString.equals("CONSENT_SIGNAL_NON_PERSONALIZED_ADS")) {
                                    throw new IOException("Failed to parse contentads.contributor.direct.serving.appswitchboard.proto.ApplicationGdprResponse.ConsentSignalfrom: ".concat(nextString));
                                }
                                zzcnVar.zzg = i6;
                            case -918677260:
                                if (!nextString.equals("CONSENT_SIGNAL_PUBLISHER_MISCONFIGURATION")) {
                                    throw new IOException("Failed to parse contentads.contributor.direct.serving.appswitchboard.proto.ApplicationGdprResponse.ConsentSignalfrom: ".concat(nextString));
                                }
                                i6 = 8;
                                zzcnVar.zzg = i6;
                            case 429411856:
                                if (!nextString.equals("CONSENT_SIGNAL_SUFFICIENT")) {
                                    throw new IOException("Failed to parse contentads.contributor.direct.serving.appswitchboard.proto.ApplicationGdprResponse.ConsentSignalfrom: ".concat(nextString));
                                }
                                i6 = 4;
                                zzcnVar.zzg = i6;
                            case 467888915:
                                if (!nextString.equals("CONSENT_SIGNAL_PERSONALIZED_ADS")) {
                                    throw new IOException("Failed to parse contentads.contributor.direct.serving.appswitchboard.proto.ApplicationGdprResponse.ConsentSignalfrom: ".concat(nextString));
                                }
                                i6 = 2;
                                zzcnVar.zzg = i6;
                            case 1725474845:
                                if (!nextString.equals("CONSENT_SIGNAL_NOT_REQUIRED")) {
                                    throw new IOException("Failed to parse contentads.contributor.direct.serving.appswitchboard.proto.ApplicationGdprResponse.ConsentSignalfrom: ".concat(nextString));
                                }
                                i6 = 6;
                                zzcnVar.zzg = i6;
                            default:
                                throw new IOException("Failed to parse contentads.contributor.direct.serving.appswitchboard.proto.ApplicationGdprResponse.ConsentSignalfrom: ".concat(nextString));
                        }
                    } else {
                        jsonReader.skipValue();
                    }
                case -1938755376:
                    if (nextName.equals("error_message")) {
                        zzcnVar.zzc = jsonReader.nextString();
                    } else {
                        jsonReader.skipValue();
                    }
                case -1851537225:
                    if (nextName.equals("consent_form_base_url")) {
                        zzcnVar.zzb = jsonReader.nextString();
                    } else {
                        jsonReader.skipValue();
                    }
                case -1734348803:
                    if (nextName.equals("client_side_pingback_url")) {
                        zzcnVar.zzf = jsonReader.nextString();
                    } else {
                        jsonReader.skipValue();
                    }
                case -1324537865:
                    if (nextName.equals("privacy_options_required")) {
                        String nextString2 = jsonReader.nextString();
                        int hashCode = nextString2.hashCode();
                        if (hashCode == -1888946261) {
                            if (!nextString2.equals("NOT_REQUIRED")) {
                                throw new IOException("Failed to parse contentads.contributor.direct.serving.appswitchboard.proto.ApplicationGdprResponse.PrivacyOptionsRequirementStatusfrom: ".concat(nextString2));
                            }
                            zzcnVar.zzh = i6;
                        } else {
                            if (hashCode != 389487519) {
                                if (hashCode == 433141802 && nextString2.equals("UNKNOWN")) {
                                    i6 = 1;
                                    zzcnVar.zzh = i6;
                                }
                                throw new IOException("Failed to parse contentads.contributor.direct.serving.appswitchboard.proto.ApplicationGdprResponse.PrivacyOptionsRequirementStatusfrom: ".concat(nextString2));
                            }
                            if (!nextString2.equals("REQUIRED")) {
                                throw new IOException("Failed to parse contentads.contributor.direct.serving.appswitchboard.proto.ApplicationGdprResponse.PrivacyOptionsRequirementStatusfrom: ".concat(nextString2));
                            }
                            i6 = 2;
                            zzcnVar.zzh = i6;
                        }
                    } else {
                        jsonReader.skipValue();
                    }
                    break;
                case -1161803523:
                    if (nextName.equals("actions")) {
                        zzcnVar.zze = new ArrayList();
                        jsonReader.beginArray();
                        while (jsonReader.hasNext()) {
                            zzcm zzcmVar = new zzcm();
                            jsonReader.beginObject();
                            while (jsonReader.hasNext()) {
                                String nextName2 = jsonReader.nextName();
                                int hashCode2 = nextName2.hashCode();
                                if (hashCode2 != -2105551094) {
                                    if (hashCode2 == 1583758243 && nextName2.equals("action_type")) {
                                        String nextString3 = jsonReader.nextString();
                                        int hashCode3 = nextString3.hashCode();
                                        if (hashCode3 != 64208429) {
                                            if (hashCode3 != 82862015) {
                                                if (hashCode3 == 1856333582 && nextString3.equals("UNKNOWN_ACTION_TYPE")) {
                                                    i5 = 1;
                                                    zzcmVar.zzb = i5;
                                                }
                                                throw new IOException("Failed to parse contentads.contributor.direct.serving.appswitchboard.proto.ApplicationGdprResponse.Action.ActionTypefrom: ".concat(nextString3));
                                            }
                                            if (!nextString3.equals("WRITE")) {
                                                throw new IOException("Failed to parse contentads.contributor.direct.serving.appswitchboard.proto.ApplicationGdprResponse.Action.ActionTypefrom: ".concat(nextString3));
                                            }
                                            i5 = 2;
                                            zzcmVar.zzb = i5;
                                        } else {
                                            if (!nextString3.equals("CLEAR")) {
                                                throw new IOException("Failed to parse contentads.contributor.direct.serving.appswitchboard.proto.ApplicationGdprResponse.Action.ActionTypefrom: ".concat(nextString3));
                                            }
                                            i5 = 3;
                                            zzcmVar.zzb = i5;
                                        }
                                    }
                                    jsonReader.skipValue();
                                } else if (nextName2.equals("args_json")) {
                                    zzcmVar.zza = jsonReader.nextString();
                                } else {
                                    jsonReader.skipValue();
                                }
                            }
                            jsonReader.endObject();
                            zzcnVar.zze.add(zzcmVar);
                        }
                        jsonReader.endArray();
                    } else {
                        jsonReader.skipValue();
                    }
                    break;
                case -986806987:
                    if (nextName.equals("request_info_keys")) {
                        zzcnVar.zzd = new ArrayList();
                        jsonReader.beginArray();
                        while (jsonReader.hasNext()) {
                            zzcnVar.zzd.add(jsonReader.nextString());
                        }
                        jsonReader.endArray();
                    } else {
                        jsonReader.skipValue();
                    }
                case -790907624:
                    if (nextName.equals("consent_form_payload")) {
                        zzcnVar.zza = jsonReader.nextString();
                    } else {
                        jsonReader.skipValue();
                    }
                default:
                    jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        return zzcnVar;
    }
}
