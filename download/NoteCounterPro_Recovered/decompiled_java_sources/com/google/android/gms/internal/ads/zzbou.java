package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import com.getcapacitor.Bridge;
import com.google.android.gms.ads.RequestConfiguration;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import n.h;
import u.v;

/* loaded from: classes.dex */
public final class zzbou implements zzboh {
    private final com.google.android.gms.ads.internal.zzb zza;
    private final zzdxz zzb;
    private final zzbwr zzd;
    private final zzeiu zze;
    private final zzcrv zzf;
    private final zzdae zzg;
    private com.google.android.gms.ads.internal.util.client.zzu zzc = null;
    private com.google.android.gms.ads.internal.overlay.zzaa zzh = null;
    private final zzgzy zzi = zzcei.zzg;

    public zzbou(com.google.android.gms.ads.internal.zzb zzbVar, zzbwr zzbwrVar, zzeiu zzeiuVar, zzdxz zzdxzVar, zzcrv zzcrvVar, zzdae zzdaeVar) {
        this.zza = zzbVar;
        this.zzd = zzbwrVar;
        this.zze = zzeiuVar;
        this.zzb = zzdxzVar;
        this.zzf = zzcrvVar;
        this.zzg = zzdaeVar;
    }

    public static boolean zzb(Map map) {
        return "1".equals(map.get("custom_close"));
    }

    public static int zzc(Map map) {
        String str = (String) map.get("o");
        if (str == null) {
            return -1;
        }
        if ("p".equalsIgnoreCase(str)) {
            return 7;
        }
        if ("l".equalsIgnoreCase(str)) {
            return 6;
        }
        return "c".equalsIgnoreCase(str) ? 14 : -1;
    }

    public static Uri zzd(Context context, zzazh zzazhVar, Uri uri, View view, Activity activity, zzfjo zzfjoVar) {
        if (zzazhVar != null) {
            try {
                if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zznv)).booleanValue() || zzfjoVar == null) {
                    if (zzazhVar.zze(uri)) {
                        return zzazhVar.zzd(uri, context, view, activity);
                    }
                } else if (zzazhVar.zze(uri)) {
                    return zzfjoVar.zza(uri, context, view, activity);
                }
            } catch (zzazi unused) {
            } catch (Exception e4) {
                com.google.android.gms.ads.internal.zzt.zzh().zzg(e4, "OpenGmsgHandler.maybeAddClickSignalsToUri");
            }
        }
        return uri;
    }

    public static Uri zze(Uri uri) {
        try {
            if (uri.getQueryParameter("aclk_ms") == null) {
                return uri;
            }
            return uri.buildUpon().appendQueryParameter("aclk_upms", String.valueOf(SystemClock.uptimeMillis())).build();
        } catch (UnsupportedOperationException e4) {
            String valueOf = String.valueOf(uri.toString());
            int i5 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Error adding click uptime parameter to url: ".concat(valueOf), e4);
            return uri;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzh, reason: merged with bridge method [inline-methods] */
    public final void zzf(String str, com.google.android.gms.ads.internal.client.zza zzaVar, Map map, String str2) {
        String str3;
        boolean z4;
        zzdae zzdaeVar;
        zzcjl zzcjlVar = (zzcjl) zzaVar;
        zzfir zzC = zzcjlVar.zzC();
        zzfiu zzaC = zzcjlVar.zzaC();
        boolean z5 = false;
        if (zzC == null || zzaC == null) {
            str3 = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
            z4 = false;
        } else {
            str3 = zzaC.zzb;
            z4 = zzC.zzb();
        }
        boolean z6 = (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzmh)).booleanValue() && map.containsKey("sc") && ((String) map.get("sc")).equals("0")) ? false : true;
        boolean z7 = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzoj)).booleanValue() && map.containsKey("ig_cl") && ((String) map.get("ig_cl")).equals("true");
        if ("expand".equalsIgnoreCase(str2)) {
            if (zzcjlVar.zzW()) {
                int i5 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzi("Cannot expand WebView that is already expanded.");
                return;
            } else {
                zzl(false);
                ((zzclb) zzaVar).zzaI(zzb(map), zzc(map), z6);
                return;
            }
        }
        if ("webapp".equalsIgnoreCase(str2)) {
            zzl(false);
            boolean z8 = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zznr)).booleanValue() && Objects.equals(map.get("is_allowed_for_lock_screen"), "1");
            if (str != null) {
                ((zzclb) zzaVar).zzaJ(zzb(map), zzc(map), str, z6, z8);
                return;
            } else {
                ((zzclb) zzaVar).zzaK(zzb(map), zzc(map), (String) map.get("html"), (String) map.get("baseurl"), z6);
                return;
            }
        }
        if ("chrome_custom_tab".equalsIgnoreCase(str2)) {
            Context context = zzcjlVar.getContext();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzfF)).booleanValue()) {
                com.google.android.gms.ads.internal.util.zze.zza("User opt out chrome custom tab.");
                zzg(10);
            } else {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzfz)).booleanValue()) {
                    String a5 = h.a(context);
                    if (a5 != null && !context.getPackageName().equals(a5)) {
                        z5 = true;
                    }
                } else {
                    z5 = zzbif.zza(context);
                }
                if (z5) {
                    boolean z9 = z7;
                    boolean z10 = z6;
                    String str4 = str3;
                    zzl(true);
                    if (TextUtils.isEmpty(str)) {
                        int i6 = com.google.android.gms.ads.internal.util.zze.zza;
                        com.google.android.gms.ads.internal.util.client.zzo.zzi("Cannot open browser with null or empty url");
                        zzg(7);
                        return;
                    }
                    Uri zze = zze(zzd(zzcjlVar.getContext(), zzcjlVar.zzS(), Uri.parse(str), zzcjlVar.zzE(), zzcjlVar.zzj(), zzcjlVar.zzT()));
                    if (z4 && this.zze != null && zzi(zzaVar, zzcjlVar.getContext(), zze.toString(), str4)) {
                        return;
                    }
                    this.zzh = new zzbor(this);
                    zzclb zzclbVar = (zzclb) zzaVar;
                    String uri = zze.toString();
                    com.google.android.gms.ads.internal.overlay.zzaa zzaaVar = this.zzh;
                    Bundle bundle = new Bundle();
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzfE)).booleanValue()) {
                        if (map.containsKey("cct_init_h")) {
                            try {
                                bundle.putInt("h", Integer.parseInt((String) map.get("cct_init_h")));
                            } catch (NumberFormatException e4) {
                                com.google.android.gms.ads.internal.util.zze.zzb("Invalid cct initial height parameter.", e4);
                                com.google.android.gms.ads.internal.zzt.zzh().zzg(e4, "OpenGmsgHandler.getChromeCustomTabConfigBundle");
                            }
                        }
                        if (map.containsKey("cct_bp")) {
                            try {
                                bundle.putInt("cbp", Integer.parseInt((String) map.get("cct_bp")));
                            } catch (NumberFormatException e5) {
                                com.google.android.gms.ads.internal.util.zze.zzb("Invalid cct close button position parameter.", e5);
                                com.google.android.gms.ads.internal.zzt.zzh().zzg(e5, "OpenGmsgHandler.getChromeCustomTabConfigBundle");
                            }
                        }
                    }
                    zzclbVar.zzaH(new com.google.android.gms.ads.internal.overlay.zzc(null, uri, null, null, null, null, null, null, new a3.b(zzaaVar).asBinder(), true, bundle), z10, z9, str4);
                    return;
                }
                zzg(4);
            }
            map.put("use_first_package", "true");
            map.put("use_running_process", "true");
            zzk(zzaVar, map, z4, str3, z6, z7);
            return;
        }
        boolean z11 = z7;
        boolean z12 = z6;
        String str5 = str3;
        if ("app".equalsIgnoreCase(str2) && "true".equalsIgnoreCase((String) map.get("system_browser"))) {
            zzk(zzaVar, map, z4, str5, z12, z11);
            return;
        }
        boolean z13 = z4;
        com.google.android.gms.ads.internal.client.zza zzaVar2 = zzaVar;
        Map map2 = map;
        if ("open_app".equalsIgnoreCase(str2)) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzjA)).booleanValue()) {
                zzl(true);
                String str6 = (String) map2.get("p");
                if (str6 == null) {
                    int i7 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzi("Package name missing from open app action.");
                    return;
                }
                if (z13 && this.zze != null && zzi(zzaVar2, zzcjlVar.getContext(), str6, str5)) {
                    return;
                }
                PackageManager packageManager = zzcjlVar.getContext().getPackageManager();
                if (packageManager == null) {
                    int i8 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzi("Cannot get package manager from open app action.");
                    return;
                } else {
                    Intent launchIntentForPackage = packageManager.getLaunchIntentForPackage(str6);
                    if (launchIntentForPackage != null) {
                        ((zzclb) zzaVar2).zzaH(new com.google.android.gms.ads.internal.overlay.zzc(launchIntentForPackage, this.zzh), z12, z11, str5);
                        return;
                    }
                    return;
                }
            }
            return;
        }
        zzl(true);
        String str7 = (String) map2.get("intent_url");
        Intent intent = null;
        if (!TextUtils.isEmpty(str7)) {
            try {
                intent = Intent.parseUri(str7, 0);
            } catch (URISyntaxException e6) {
                String valueOf = String.valueOf(str7);
                int i9 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzg("Error parsing the url: ".concat(valueOf), e6);
            }
        }
        if (intent != null && intent.getData() != null) {
            Uri data = intent.getData();
            if (!Uri.EMPTY.equals(data)) {
                Uri zze2 = zze(zzd(zzcjlVar.getContext(), zzcjlVar.zzS(), data, zzcjlVar.zzE(), zzcjlVar.zzj(), zzcjlVar.zzT()));
                if (!TextUtils.isEmpty(intent.getType())) {
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzjB)).booleanValue()) {
                        intent.setDataAndType(zze2, intent.getType());
                    }
                }
                intent.setData(zze2);
            }
        }
        boolean z14 = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzjW)).booleanValue() && "intent_async".equalsIgnoreCase(str2) && map2.containsKey("event_id");
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzoo)).booleanValue() && (zzdaeVar = this.zzg) != null) {
            zzdaeVar.zzl();
        }
        HashMap hashMap = new HashMap();
        if (z14) {
            zzbos zzbosVar = new zzbos(this, z12, zzaVar2, hashMap, map2);
            zzaVar2 = zzaVar2;
            map2 = map2;
            this.zzh = zzbosVar;
        } else {
            z5 = z12;
        }
        if (intent != null) {
            if (!z13 || this.zze == null || !zzi(zzaVar2, zzcjlVar.getContext(), intent.getData().toString(), str5)) {
                ((zzclb) zzaVar2).zzaH(new com.google.android.gms.ads.internal.overlay.zzc(intent, this.zzh), z5, z11, str5);
                return;
            } else {
                if (z14) {
                    hashMap.put((String) map2.get("event_id"), Boolean.TRUE);
                    ((zzbrd) zzaVar2).zze("openIntentAsync", hashMap);
                    return;
                }
                return;
            }
        }
        String uri2 = !TextUtils.isEmpty(str) ? zze(zzd(zzcjlVar.getContext(), zzcjlVar.zzS(), Uri.parse(str), zzcjlVar.zzE(), zzcjlVar.zzj(), zzcjlVar.zzT())).toString() : str;
        if (!z13 || this.zze == null || !zzi(zzaVar2, zzcjlVar.getContext(), uri2, str5)) {
            ((zzclb) zzaVar2).zzaH(new com.google.android.gms.ads.internal.overlay.zzc((String) map2.get("i"), uri2, (String) map2.get("m"), (String) map2.get("p"), (String) map2.get("c"), (String) map2.get("f"), (String) map2.get("e"), this.zzh), z5, z11, str5);
        } else if (z14) {
            hashMap.put((String) map2.get("event_id"), Boolean.TRUE);
            ((zzbrd) zzaVar2).zze("openIntentAsync", hashMap);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x006e, code lost:
    
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(com.google.android.gms.internal.ads.zzbhe.zzjQ)).booleanValue() != false) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00de, code lost:
    
        if ((android.os.Build.VERSION.SDK_INT < 33 ? ((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(com.google.android.gms.internal.ads.zzbhe.zzjL)).booleanValue() : ((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(com.google.android.gms.internal.ads.zzbhe.zzjK)).booleanValue()) != false) goto L54;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final boolean zzi(com.google.android.gms.ads.internal.client.zza zzaVar, Context context, String str, String str2) {
        zzbxy zzbxyVar;
        com.google.android.gms.ads.internal.util.client.zzw zzwVar;
        zzdxz zzdxzVar = this.zzb;
        if (zzdxzVar != null) {
            zzejf.zzd(context, zzdxzVar, this.zze, str2, "offline_open");
        }
        if (com.google.android.gms.ads.internal.zzt.zzh().zzs(context)) {
            if (this.zzc == null) {
                this.zzc = new com.google.android.gms.ads.internal.util.client.zzu(context.getApplicationContext(), null);
            }
            this.zze.zzc(this.zzc, str2);
            return false;
        }
        zzcjl zzcjlVar = (zzcjl) zzaVar;
        zzfir zzC = zzcjlVar.zzC();
        boolean z4 = (zzC == null || (zzwVar = zzC.zzay) == null || zzwVar.zzc()) ? false : true;
        boolean z5 = (zzC == null || (zzbxyVar = zzC.zzad) == null || !zzbxyVar.zza || zzbxyVar.zzb == null || !zzbxyVar.zzc) ? false : true;
        if (!z4) {
            if (z5) {
            }
            com.google.android.gms.ads.internal.zzt.zzc();
            com.google.android.gms.ads.internal.util.zzbo zzE = com.google.android.gms.ads.internal.util.zzs.zzE(context);
            com.google.android.gms.ads.internal.zzt.zzc();
            boolean areNotificationsEnabled = new v(context).f3490a.areNotificationsEnabled();
            boolean zzh = com.google.android.gms.ads.internal.zzt.zzf().zzh(context, "offline_notification_channel");
            boolean z6 = zzcjlVar.zzN().zzg() && zzcjlVar.zzj() == null;
            if (!areNotificationsEnabled) {
                com.google.android.gms.ads.internal.zzt.zzc();
                if (!new v(context).f3490a.areNotificationsEnabled()) {
                }
                zzj(context, str2, "notifications_disabled");
                return false;
            }
            if (zzh) {
                zzj(context, str2, "notification_channel_disabled");
                return false;
            }
            if (zzE == null) {
                zzj(context, str2, "work_manager_unavailable");
                return false;
            }
            if (z6) {
                zzj(context, str2, "ad_no_activity");
                return false;
            }
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzjI)).booleanValue()) {
                zzj(context, str2, "notification_flow_disabled");
                return false;
            }
            if (zzcjlVar.zzL() == null || zzcjlVar.zzj() == null) {
                ((zzclb) zzaVar).zzaL(str2, str, 14);
            } else {
                zzejg zze = zzejh.zze();
                zze.zza(zzcjlVar.zzj());
                zze.zzb(null);
                zze.zzc(str2);
                zze.zzd(str);
                try {
                    zzcjlVar.zzL().zzG(zze.zze());
                } catch (Exception e4) {
                    zzj(context, str2, e4.getMessage());
                    return false;
                }
            }
            zzaVar.onAdClicked();
            return true;
        }
        zzdxz zzdxzVar2 = this.zzb;
        if (zzdxzVar2 != null) {
            zzejf.zzd(context, zzdxzVar2, this.zze, str2, "onfs");
        }
        return false;
    }

    private final void zzj(Context context, String str, String str2) {
        zzeiu zzeiuVar = this.zze;
        zzeiuVar.zzd(str);
        zzdxz zzdxzVar = this.zzb;
        if (zzdxzVar != null) {
            zzejf.zzk(context, zzdxzVar, zzeiuVar, str, "dialog_not_shown", zzgui.zzb("dialog_not_shown_reason", str2));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00fe, code lost:
    
        if (com.google.android.gms.internal.ads.zzbot.zzb(r13, r8, r9, r10, r11) == null) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x014b, code lost:
    
        r15 = r18;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00a7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void zzk(com.google.android.gms.ads.internal.client.zza zzaVar, Map map, boolean z4, String str, boolean z5, boolean z6) {
        boolean z7;
        ResolveInfo zzc;
        zzcjl zzcjlVar;
        Intent zzd;
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        ResolveInfo zzb;
        zzl(true);
        zzcjl zzcjlVar2 = (zzcjl) zzaVar;
        Context context = zzcjlVar2.getContext();
        zzazh zzS = zzcjlVar2.zzS();
        View zzE = zzcjlVar2.zzE();
        zzfjo zzT = zzcjlVar2.zzT();
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        String str2 = (String) map.get(Bridge.CAPACITOR_HTTP_INTERCEPTOR_URL_PARAM);
        if (TextUtils.isEmpty(str2)) {
            zzcjlVar = zzcjlVar2;
            zzd = null;
        } else {
            Uri zze = zze(zzd(context, zzS, Uri.parse(str2), zzE, null, zzT));
            boolean parseBoolean = Boolean.parseBoolean((String) map.get("use_first_package"));
            boolean parseBoolean2 = Boolean.parseBoolean((String) map.get("use_running_process"));
            if (!Boolean.parseBoolean((String) map.get("use_custom_tabs"))) {
                if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzfv)).booleanValue()) {
                    z7 = false;
                    Uri build = !Bridge.CAPACITOR_HTTP_SCHEME.equalsIgnoreCase(zze.getScheme()) ? zze.buildUpon().scheme(Bridge.CAPACITOR_HTTPS_SCHEME).build() : Bridge.CAPACITOR_HTTPS_SCHEME.equalsIgnoreCase(zze.getScheme()) ? zze.buildUpon().scheme(Bridge.CAPACITOR_HTTP_SCHEME).build() : null;
                    ArrayList arrayList = new ArrayList();
                    Intent zza = zzbot.zza(zze, context, zzS, zzE, zzT);
                    Intent zza2 = zzbot.zza(build, context, zzS, zzE, zzT);
                    if (z7) {
                        com.google.android.gms.ads.internal.zzt.zzc();
                        com.google.android.gms.ads.internal.util.zzs.zzs(context, zza);
                        com.google.android.gms.ads.internal.zzt.zzc();
                        com.google.android.gms.ads.internal.util.zzs.zzs(context, zza2);
                    }
                    zzc = zzbot.zzc(zza, arrayList, context, zzS, zzE, zzT);
                    if (zzc == null) {
                        zzd = zzbot.zzd(zza, zzc, context, zzS, zzE, zzT);
                    } else {
                        if (zza2 != null && (zzb = zzbot.zzb(zza2, context, zzS, zzE, zzT)) != null) {
                            zzd = zzbot.zzd(zza, zzb, context, zzS, zzE, zzT);
                        }
                        if (arrayList.isEmpty()) {
                            zzcjlVar = zzcjlVar2;
                        } else {
                            if (parseBoolean2 && activityManager != null && (runningAppProcesses = activityManager.getRunningAppProcesses()) != null) {
                                int size = arrayList.size();
                                int i5 = 0;
                                loop0: while (i5 < size) {
                                    ResolveInfo resolveInfo = (ResolveInfo) arrayList.get(i5);
                                    Iterator<ActivityManager.RunningAppProcessInfo> it = runningAppProcesses.iterator();
                                    while (true) {
                                        int i6 = i5 + 1;
                                        if (it.hasNext()) {
                                            zzcjlVar = zzcjlVar2;
                                            if (it.next().processName.equals(resolveInfo.activityInfo.packageName)) {
                                                zzd = zzbot.zzd(zza, resolveInfo, context, zzS, zzE, zzT);
                                                break loop0;
                                            }
                                            zzcjlVar2 = zzcjlVar;
                                        }
                                    }
                                }
                            }
                            zzcjlVar = zzcjlVar2;
                            if (parseBoolean) {
                                zzd = zzbot.zzd(zza, (ResolveInfo) arrayList.get(0), context, zzS, zzE, zzT);
                            }
                        }
                        zzd = zza;
                    }
                    zzcjlVar = zzcjlVar2;
                }
            }
            z7 = true;
            if (!Bridge.CAPACITOR_HTTP_SCHEME.equalsIgnoreCase(zze.getScheme())) {
            }
            ArrayList arrayList2 = new ArrayList();
            Intent zza3 = zzbot.zza(zze, context, zzS, zzE, zzT);
            Intent zza22 = zzbot.zza(build, context, zzS, zzE, zzT);
            if (z7) {
            }
            zzc = zzbot.zzc(zza3, arrayList2, context, zzS, zzE, zzT);
            if (zzc == null) {
            }
            zzcjlVar = zzcjlVar2;
        }
        if (!z4 || this.zze == null || zzd == null || !zzi(zzaVar, zzcjlVar.getContext(), zzd.getData().toString(), str)) {
            try {
                ((zzclb) zzaVar).zzaH(new com.google.android.gms.ads.internal.overlay.zzc(zzd, this.zzh), z5, z6, str);
            } catch (ActivityNotFoundException e4) {
                String message = e4.getMessage();
                int i7 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzi(message);
            }
        }
    }

    private final void zzl(boolean z4) {
        zzbwr zzbwrVar = this.zzd;
        if (zzbwrVar != null) {
            zzbwrVar.zzb(z4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzm, reason: merged with bridge method [inline-methods] */
    public final void zzg(int i5) {
        zzdxz zzdxzVar;
        String str;
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzfy)).booleanValue() || (zzdxzVar = this.zzb) == null) {
            return;
        }
        zzdxy zza = zzdxzVar.zza();
        zza.zzc("action", "cct_action");
        switch (i5) {
            case 2:
                str = "CONTEXT_NOT_AN_ACTIVITY";
                break;
            case 3:
                str = "CONTEXT_NULL";
                break;
            case 4:
                str = "CCT_NOT_SUPPORTED";
                break;
            case 5:
                str = "CCT_READY_TO_OPEN";
                break;
            case 6:
                str = "ACTIVITY_NOT_FOUND";
                break;
            case 7:
                str = "EMPTY_URL";
                break;
            case 8:
                str = "UNKNOWN";
                break;
            case 9:
                str = "WRONG_EXP_SETUP";
                break;
            default:
                str = "OPT_OUT";
                break;
        }
        zza.zzc("cct_open_status", str);
        zza.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzboh
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzcrv zzcrvVar;
        com.google.android.gms.ads.internal.client.zza zzaVar = (com.google.android.gms.ads.internal.client.zza) obj;
        String str = (String) map.get(Bridge.CAPACITOR_HTTP_INTERCEPTOR_URL_PARAM);
        Map hashMap = new HashMap();
        zzcjl zzcjlVar = (zzcjl) zzaVar;
        if (zzcjlVar.zzC() != null) {
            hashMap = zzcjlVar.zzC().zzaw;
        }
        String zza = zzccs.zza(str, zzcjlVar.getContext(), true, hashMap);
        String str2 = (String) map.get("a");
        if (str2 == null) {
            int i5 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Action missing from an open GMSG.");
            return;
        }
        com.google.android.gms.ads.internal.zzb zzbVar = this.zza;
        if (zzbVar == null || zzbVar.zzb()) {
            zzgzo.zzr((((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzly)).booleanValue() && (zzcrvVar = this.zzf) != null && zzcrv.zzc(zza)) ? zzcrvVar.zzb(zza, com.google.android.gms.ads.internal.client.zzbb.zzh()) : zzgzo.zza(zza), new zzboq(this, map, zzaVar, str2), this.zzi);
        } else {
            zzbVar.zzc(zza);
        }
    }
}
