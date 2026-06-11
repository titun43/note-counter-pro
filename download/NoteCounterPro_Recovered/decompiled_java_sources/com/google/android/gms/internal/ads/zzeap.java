package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.RemoteException;
import android.util.Base64;
import com.google.android.gms.ads.RequestConfiguration;
import f2.k;
import java.io.ByteArrayOutputStream;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class zzeap {
    private final Context zza;
    private final ApplicationInfo zzb;
    private String zze = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    private final int zzc = ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzkD)).intValue();
    private final int zzd = ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzkE)).intValue();

    public zzeap(Context context) {
        this.zza = context;
        this.zzb = context.getApplicationInfo();
    }

    public final JSONObject zza() {
        String str;
        String encodeToString;
        JSONObject jSONObject = new JSONObject();
        try {
            Context context = this.zza;
            String str2 = this.zzb.packageName;
            zzfyn zzfynVar = com.google.android.gms.ads.internal.util.zzs.zza;
            Context context2 = z2.c.a(context).f1474g;
            jSONObject.put("name", context2.getPackageManager().getApplicationLabel(context2.getPackageManager().getApplicationInfo(str2, 0)));
        } catch (PackageManager.NameNotFoundException unused) {
        }
        jSONObject.put("packageName", this.zzb.packageName);
        com.google.android.gms.ads.internal.zzt.zzc();
        Drawable drawable = null;
        try {
            str = com.google.android.gms.ads.internal.util.zzs.zzt(this.zza);
        } catch (RemoteException unused2) {
            str = null;
        }
        jSONObject.put("adMobAppId", str);
        if (this.zze.isEmpty()) {
            try {
                k a5 = z2.c.a(this.zza);
                String str3 = this.zzb.packageName;
                Context context3 = a5.f1474g;
                ApplicationInfo applicationInfo = context3.getPackageManager().getApplicationInfo(str3, 0);
                context3.getPackageManager().getApplicationLabel(applicationInfo);
                drawable = context3.getPackageManager().getApplicationIcon(applicationInfo);
            } catch (PackageManager.NameNotFoundException unused3) {
            }
            if (drawable == null) {
                encodeToString = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
            } else {
                int i5 = this.zzc;
                int i6 = this.zzd;
                drawable.setBounds(0, 0, i5, i6);
                Bitmap createBitmap = Bitmap.createBitmap(i5, i6, Bitmap.Config.ARGB_8888);
                drawable.draw(new Canvas(createBitmap));
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                createBitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
                encodeToString = Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2);
            }
            this.zze = encodeToString;
        }
        if (!this.zze.isEmpty()) {
            jSONObject.put("icon", this.zze);
            jSONObject.put("iconWidthPx", this.zzc);
            jSONObject.put("iconHeightPx", this.zzd);
        }
        return jSONObject;
    }
}
