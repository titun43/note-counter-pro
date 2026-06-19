package com.google.android.gms.ads.rewarded;

import com.google.android.gms.ads.RequestConfiguration;

/* loaded from: classes.dex */
public class ServerSideVerificationOptions {
    private final String zza;
    private final String zzb;

    public static final class Builder {
        private String zza = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        private String zzb = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;

        public ServerSideVerificationOptions build() {
            return new ServerSideVerificationOptions(this, null);
        }

        public Builder setCustomData(String str) {
            this.zzb = str;
            return this;
        }

        public Builder setUserId(String str) {
            this.zza = str;
            return this;
        }

        public final /* synthetic */ String zza() {
            return this.zza;
        }

        public final /* synthetic */ String zzb() {
            return this.zzb;
        }
    }

    public /* synthetic */ ServerSideVerificationOptions(Builder builder, byte[] bArr) {
        this.zza = builder.zza();
        this.zzb = builder.zzb();
    }

    public String getCustomData() {
        return this.zzb;
    }

    public String getUserId() {
        return this.zza;
    }
}
