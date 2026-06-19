package com.google.android.gms.ads;

import a3.b;
import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.ads.internal.client.zzbb;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.internal.ads.zzbxs;

/* loaded from: classes.dex */
public final class AdActivity extends Activity {
    public static final String CLASS_NAME = "com.google.android.gms.ads.AdActivity";
    private zzbxs zza;

    private final void zza() {
        zzbxs zzbxsVar = this.zza;
        if (zzbxsVar != null) {
            try {
                zzbxsVar.zzs();
            } catch (RemoteException e4) {
                zzo.zzl("#007 Could not call remote method.", e4);
            }
        }
    }

    @Override // android.app.Activity
    public final void onActivityResult(int i5, int i6, Intent intent) {
        try {
            zzbxs zzbxsVar = this.zza;
            if (zzbxsVar != null) {
                zzbxsVar.zzm(i5, i6, intent);
            }
        } catch (Exception e4) {
            zzo.zzl("#007 Could not call remote method.", e4);
        }
        super.onActivityResult(i5, i6, intent);
    }

    @Override // android.app.Activity
    public final void onBackPressed() {
        try {
            zzbxs zzbxsVar = this.zza;
            if (zzbxsVar != null) {
                if (!zzbxsVar.zzg()) {
                    return;
                }
            }
        } catch (RemoteException e4) {
            zzo.zzl("#007 Could not call remote method.", e4);
        }
        super.onBackPressed();
        try {
            zzbxs zzbxsVar2 = this.zza;
            if (zzbxsVar2 != null) {
                zzbxsVar2.zze();
            }
        } catch (RemoteException e5) {
            zzo.zzl("#007 Could not call remote method.", e5);
        }
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        try {
            zzbxs zzbxsVar = this.zza;
            if (zzbxsVar != null) {
                zzbxsVar.zzn(new b(configuration));
            }
        } catch (RemoteException e4) {
            zzo.zzl("#007 Could not call remote method.", e4);
        }
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        zzo.zzd("AdActivity onCreate");
        zzbxs zzh = zzbb.zzb().zzh(this);
        this.zza = zzh;
        if (zzh == null) {
            zzo.zzl("#007 Could not call remote method.", null);
            finish();
            return;
        }
        try {
            zzh.zzh(bundle);
        } catch (RemoteException e4) {
            zzo.zzl("#007 Could not call remote method.", e4);
            finish();
        }
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        zzo.zzd("AdActivity onDestroy");
        try {
            zzbxs zzbxsVar = this.zza;
            if (zzbxsVar != null) {
                zzbxsVar.zzq();
            }
        } catch (RemoteException e4) {
            zzo.zzl("#007 Could not call remote method.", e4);
        }
        super.onDestroy();
    }

    @Override // android.app.Activity
    public final void onPause() {
        zzo.zzd("AdActivity onPause");
        try {
            zzbxs zzbxsVar = this.zza;
            if (zzbxsVar != null) {
                zzbxsVar.zzl();
            }
        } catch (RemoteException e4) {
            zzo.zzl("#007 Could not call remote method.", e4);
            finish();
        }
        super.onPause();
    }

    @Override // android.app.Activity
    public final void onRequestPermissionsResult(int i5, String[] strArr, int[] iArr) {
        try {
            zzbxs zzbxsVar = this.zza;
            if (zzbxsVar != null) {
                zzbxsVar.zzH(i5, strArr, iArr);
            }
        } catch (RemoteException e4) {
            zzo.zzl("#007 Could not call remote method.", e4);
        }
    }

    @Override // android.app.Activity
    public final void onRestart() {
        super.onRestart();
        zzo.zzd("AdActivity onRestart");
        try {
            zzbxs zzbxsVar = this.zza;
            if (zzbxsVar != null) {
                zzbxsVar.zzi();
            }
        } catch (RemoteException e4) {
            zzo.zzl("#007 Could not call remote method.", e4);
            finish();
        }
    }

    @Override // android.app.Activity
    public final void onResume() {
        zzo.zzd("AdActivity onResume");
        super.onResume();
        try {
            zzbxs zzbxsVar = this.zza;
            if (zzbxsVar != null) {
                zzbxsVar.zzk();
            }
        } catch (RemoteException e4) {
            zzo.zzl("#007 Could not call remote method.", e4);
            finish();
        }
    }

    @Override // android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        try {
            zzbxs zzbxsVar = this.zza;
            if (zzbxsVar != null) {
                zzbxsVar.zzo(bundle);
            }
        } catch (RemoteException e4) {
            zzo.zzl("#007 Could not call remote method.", e4);
            finish();
        }
        super.onSaveInstanceState(bundle);
    }

    @Override // android.app.Activity
    public final void onStart() {
        super.onStart();
        zzo.zzd("AdActivity onStart");
        try {
            zzbxs zzbxsVar = this.zza;
            if (zzbxsVar != null) {
                zzbxsVar.zzj();
            }
        } catch (RemoteException e4) {
            zzo.zzl("#007 Could not call remote method.", e4);
            finish();
        }
    }

    @Override // android.app.Activity
    public final void onStop() {
        zzo.zzd("AdActivity onStop");
        try {
            zzbxs zzbxsVar = this.zza;
            if (zzbxsVar != null) {
                zzbxsVar.zzp();
            }
        } catch (RemoteException e4) {
            zzo.zzl("#007 Could not call remote method.", e4);
            finish();
        }
        super.onStop();
    }

    @Override // android.app.Activity
    public final void onUserLeaveHint() {
        super.onUserLeaveHint();
        try {
            zzbxs zzbxsVar = this.zza;
            if (zzbxsVar != null) {
                zzbxsVar.zzf();
            }
        } catch (RemoteException e4) {
            zzo.zzl("#007 Could not call remote method.", e4);
        }
    }

    @Override // android.app.Activity
    public final void setContentView(int i5) {
        super.setContentView(i5);
        zza();
    }

    @Override // android.app.Activity
    public final void setContentView(View view) {
        super.setContentView(view);
        zza();
    }

    @Override // android.app.Activity
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(view, layoutParams);
        zza();
    }
}
