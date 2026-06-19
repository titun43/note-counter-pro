package com.google.android.gms.ads.internal.util;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.internal.ads.zzbhe;
import com.google.android.gms.internal.ads.zzebe;
import com.google.android.gms.internal.ads.zzebf;
import j3.a;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONException;
import org.json.JSONObject;
import x2.d;

/* loaded from: classes.dex */
public final class zzax {
    private zzebf zzg;
    private final Object zzb = new Object();
    private String zzc = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    private String zzd = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    private boolean zze = false;
    private boolean zzf = false;
    protected String zza = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;

    public static final String zzo(Context context, String str, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put("User-Agent", com.google.android.gms.ads.internal.zzt.zzc().zze(context, str2));
        a zzb = new zzbl(context).zzb(0, str, hashMap, null);
        try {
            return (String) zzb.get(((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzfV)).intValue(), TimeUnit.MILLISECONDS);
        } catch (InterruptedException e4) {
            String valueOf = String.valueOf(str);
            int i5 = zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Interrupted while retrieving a response from: ".concat(valueOf), e4);
            zzb.cancel(true);
            return null;
        } catch (TimeoutException e5) {
            String valueOf2 = String.valueOf(str);
            int i6 = zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Timeout while retrieving a response from: ".concat(valueOf2), e5);
            zzb.cancel(true);
            return null;
        } catch (Exception e6) {
            String valueOf3 = String.valueOf(str);
            int i7 = zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Error retrieving a response from: ".concat(valueOf3), e6);
            return null;
        }
    }

    private final Uri zzp(Context context, String str, String str2, String str3) {
        String str4;
        String str5;
        Uri.Builder buildUpon = Uri.parse(str).buildUpon();
        synchronized (this.zzb) {
            if (TextUtils.isEmpty(this.zzc)) {
                com.google.android.gms.ads.internal.zzt.zzc();
                try {
                    FileInputStream openFileInput = context.openFileInput("debug_signals_id.txt");
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    d.e(openFileInput, byteArrayOutputStream, true);
                    str5 = new String(byteArrayOutputStream.toByteArray(), "UTF-8");
                } catch (IOException unused) {
                    int i5 = zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzd("Error reading from internal storage.");
                    str5 = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
                }
                this.zzc = str5;
                if (TextUtils.isEmpty(str5)) {
                    com.google.android.gms.ads.internal.zzt.zzc();
                    this.zzc = UUID.randomUUID().toString();
                    com.google.android.gms.ads.internal.zzt.zzc();
                    String str6 = this.zzc;
                    try {
                        FileOutputStream openFileOutput = context.openFileOutput("debug_signals_id.txt", 0);
                        openFileOutput.write(str6.getBytes(StandardCharsets.UTF_8));
                        openFileOutput.close();
                    } catch (Exception e4) {
                        int i6 = zze.zza;
                        com.google.android.gms.ads.internal.util.client.zzo.zzg("Error writing to file in internal storage.", e4);
                    }
                }
            }
            str4 = this.zzc;
        }
        buildUpon.appendQueryParameter("linkedDeviceId", str4);
        buildUpon.appendQueryParameter("adSlotPath", str2);
        buildUpon.appendQueryParameter("afmaVersion", str3);
        return buildUpon.build();
    }

    public final void zza(zzebf zzebfVar) {
        this.zzg = zzebfVar;
    }

    public final zzebf zzb() {
        return this.zzg;
    }

    public final void zzc(Context context) {
        zzebf zzebfVar;
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzkF)).booleanValue() || (zzebfVar = this.zzg) == null) {
            return;
        }
        zzebfVar.zzo(new zzau(this, context), zzebe.DEBUG_MENU);
    }

    public final boolean zzd(Context context, String str, String str2) {
        String zzo = zzo(context, zzp(context, (String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzfS), str, str2).toString(), str2);
        if (TextUtils.isEmpty(zzo)) {
            int i5 = zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzd("Not linked for in app preview.");
            return false;
        }
        try {
            JSONObject jSONObject = new JSONObject(zzo.trim());
            String optString = jSONObject.optString("gct");
            this.zza = jSONObject.optString("status");
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzkF)).booleanValue()) {
                String str3 = this.zza;
                boolean z4 = "0".equals(str3) || "2".equals(str3);
                zzj(z4);
                zzg zzo2 = com.google.android.gms.ads.internal.zzt.zzh().zzo();
                if (!z4) {
                    str = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
                }
                zzo2.zzM(str);
            }
            synchronized (this.zzb) {
                this.zzd = optString;
            }
            return true;
        } catch (JSONException e4) {
            int i6 = zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Fail to get in app preview response json.", e4);
            return false;
        }
    }

    public final boolean zze(Context context, String str, String str2) {
        String zzo = zzo(context, zzp(context, (String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzfT), str, str2).toString(), str2);
        if (TextUtils.isEmpty(zzo)) {
            int i5 = zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzd("Not linked for debug signals.");
            return false;
        }
        try {
            boolean equals = "1".equals(new JSONObject(zzo.trim()).optString("debug_mode"));
            zzj(equals);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzkF)).booleanValue()) {
                zzg zzo2 = com.google.android.gms.ads.internal.zzt.zzh().zzo();
                if (true != equals) {
                    str = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
                }
                zzo2.zzM(str);
            }
            return equals;
        } catch (JSONException e4) {
            int i6 = zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Fail to get debug mode response json.", e4);
            return false;
        }
    }

    public final void zzf(Context context, String str, String str2) {
        com.google.android.gms.ads.internal.zzt.zzc();
        zzs.zzab(context, zzp(context, (String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzfR), str, str2));
    }

    public final boolean zzg(Context context, String str, String str2, String str3) {
        if (TextUtils.isEmpty(str2) || !zzm()) {
            return false;
        }
        int i5 = zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzd("Sending troubleshooting signals to the server.");
        zzh(context, str, str2, str3);
        return true;
    }

    public final void zzh(Context context, String str, String str2, String str3) {
        Uri.Builder buildUpon = zzp(context, (String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzfU), str3, str).buildUpon();
        buildUpon.appendQueryParameter("debugData", str2);
        com.google.android.gms.ads.internal.zzt.zzc();
        zzs.zzQ(context, str, buildUpon.build().toString());
    }

    public final String zzi() {
        String str;
        synchronized (this.zzb) {
            str = this.zzd;
        }
        return str;
    }

    public final void zzj(boolean z4) {
        synchronized (this.zzb) {
            try {
                this.zzf = z4;
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzkF)).booleanValue()) {
                    com.google.android.gms.ads.internal.zzt.zzh().zzo().zzK(z4);
                    zzebf zzebfVar = this.zzg;
                    if (zzebfVar != null) {
                        zzebfVar.zzb(z4);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean zzk() {
        boolean z4;
        synchronized (this.zzb) {
            z4 = this.zzf;
        }
        return z4;
    }

    public final void zzl(boolean z4) {
        synchronized (this.zzb) {
            this.zze = z4;
        }
    }

    public final boolean zzm() {
        boolean z4;
        synchronized (this.zzb) {
            z4 = this.zze;
        }
        return z4;
    }

    public final void zzn(Context context, String str, boolean z4, boolean z5) {
        if (context instanceof Activity) {
            zzs.zza.post(new zzaw(this, context, str, z4, z5));
        } else {
            int i5 = zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzh("Can not create dialog without Activity Context");
        }
    }
}
