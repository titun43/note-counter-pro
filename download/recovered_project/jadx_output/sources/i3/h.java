package i3;

import android.app.Activity;

/* loaded from: classes.dex */
public interface h {
    boolean canRequestAds();

    int getConsentStatus();

    g getPrivacyOptionsRequirementStatus();

    boolean isConsentFormAvailable();

    void requestConsentInfoUpdate(Activity activity, i iVar, f fVar, e eVar);

    void reset();
}
