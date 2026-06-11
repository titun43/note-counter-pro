package com.google.android.gms.ads;

import android.app.Activity;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzbb;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.internal.ads.zzbtp;
import com.google.android.gms.internal.ads.zzbxl;

/* loaded from: classes.dex */
public final class NotificationHandlerActivity extends Activity {
    public static final String CLASS_NAME = "com.google.android.gms.ads.NotificationHandlerActivity";

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        try {
            zzbxl zzk = zzbb.zzb().zzk(this, new zzbtp());
            if (zzk == null) {
                zzo.zzf("OfflineUtils is null");
            } else {
                zzk.zze(getIntent());
            }
        } catch (RemoteException e4) {
            zzo.zzf("RemoteException calling handleNotificationIntent: ".concat(e4.toString()));
        }
    }

    @Override // android.app.Activity
    public final void onResume() {
        super.onResume();
        finish();
    }
}
