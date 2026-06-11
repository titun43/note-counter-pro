package com.google.android.gms.ads.internal.adaptersettings;

import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.internal.ads.zzbgn;

/* loaded from: classes.dex */
class AdapterSettings {
    private static volatile AdapterSettings instance;
    private final zzbgn adapterSettingsInternal = zzbd.zzd();

    private boolean getBoolean(String str, boolean z4) {
        return this.adapterSettingsInternal.zzf(str, z4);
    }

    private float getFloat(String str, float f5) {
        return this.adapterSettingsInternal.zze(str, f5);
    }

    public static AdapterSettings getInstance() {
        if (instance == null) {
            synchronized (AdapterSettings.class) {
                try {
                    if (instance == null) {
                        instance = new AdapterSettings();
                    }
                } finally {
                }
            }
        }
        return instance;
    }

    private int getInt(String str, int i5) {
        return this.adapterSettingsInternal.zzd(str, i5);
    }

    private long getLong(String str, long j2) {
        return this.adapterSettingsInternal.zzc(str, j2);
    }

    private String getString(String str, String str2) {
        return this.adapterSettingsInternal.zzb(str, str2);
    }
}
