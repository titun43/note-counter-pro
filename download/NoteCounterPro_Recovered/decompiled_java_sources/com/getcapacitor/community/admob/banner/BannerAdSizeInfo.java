package com.getcapacitor.community.admob.banner;

import com.getcapacitor.JSObject;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import g4.i;
import java.util.Objects;

/* loaded from: classes.dex */
public final class BannerAdSizeInfo extends JSObject {
    private final int height;
    private final int width;

    public BannerAdSizeInfo(int i5, int i6) {
        this.width = i5;
        this.height = i6;
        super.put("width", i5);
        super.put("height", i6);
    }

    public static /* synthetic */ BannerAdSizeInfo copy$default(BannerAdSizeInfo bannerAdSizeInfo, int i5, int i6, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            i5 = bannerAdSizeInfo.width;
        }
        if ((i7 & 2) != 0) {
            i6 = bannerAdSizeInfo.height;
        }
        return bannerAdSizeInfo.copy(i5, i6);
    }

    public final int component1() {
        return this.width;
    }

    public final int component2() {
        return this.height;
    }

    public final BannerAdSizeInfo copy(int i5, int i6) {
        return new BannerAdSizeInfo(i5, i6);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BannerAdSizeInfo)) {
            return false;
        }
        BannerAdSizeInfo bannerAdSizeInfo = (BannerAdSizeInfo) obj;
        return this.width == bannerAdSizeInfo.width && this.height == bannerAdSizeInfo.height;
    }

    public final int getHeight() {
        return this.height;
    }

    public final int getWidth() {
        return this.width;
    }

    public int hashCode() {
        return Integer.hashCode(this.height) + (Integer.hashCode(this.width) * 31);
    }

    @Override // org.json.JSONObject
    public String toString() {
        return "BannerAdSizeInfo(width=" + this.width + ", height=" + this.height + ")";
    }

    @Override // com.getcapacitor.JSObject, org.json.JSONObject
    public JSObject put(String str, int i5) {
        i.e(str, "key");
        throw new Exception("Do not put elements directly here use the constructor");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public BannerAdSizeInfo(AdView adView) {
        this(r0, r2.getHeight());
        i.e(adView, "mAdView");
        AdSize adSize = adView.getAdSize();
        Objects.requireNonNull(adSize);
        int width = adSize.getWidth();
        AdSize adSize2 = adView.getAdSize();
        Objects.requireNonNull(adSize2);
    }
}
