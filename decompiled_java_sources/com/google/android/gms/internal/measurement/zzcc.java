package com.google.android.gms.internal.measurement;

import a3.a;
import android.os.Bundle;
import android.os.IInterface;
import java.util.Map;

/* loaded from: classes.dex */
public interface zzcc extends IInterface {
    void beginAdUnitExposure(String str, long j2);

    void clearConditionalUserProperty(String str, String str2, Bundle bundle);

    void clearMeasurementEnabled(long j2);

    void endAdUnitExposure(String str, long j2);

    void generateEventId(zzcf zzcfVar);

    void getAppInstanceId(zzcf zzcfVar);

    void getCachedAppInstanceId(zzcf zzcfVar);

    void getConditionalUserProperties(String str, String str2, zzcf zzcfVar);

    void getCurrentScreenClass(zzcf zzcfVar);

    void getCurrentScreenName(zzcf zzcfVar);

    void getGmpAppId(zzcf zzcfVar);

    void getMaxUserProperties(String str, zzcf zzcfVar);

    void getTestFlag(zzcf zzcfVar, int i5);

    void getUserProperties(String str, String str2, boolean z4, zzcf zzcfVar);

    void initForTests(Map map);

    void initialize(a aVar, zzcl zzclVar, long j2);

    void isDataCollectionEnabled(zzcf zzcfVar);

    void logEvent(String str, String str2, Bundle bundle, boolean z4, boolean z5, long j2);

    void logEventAndBundle(String str, String str2, Bundle bundle, zzcf zzcfVar, long j2);

    void logHealthData(int i5, String str, a aVar, a aVar2, a aVar3);

    void onActivityCreated(a aVar, Bundle bundle, long j2);

    void onActivityDestroyed(a aVar, long j2);

    void onActivityPaused(a aVar, long j2);

    void onActivityResumed(a aVar, long j2);

    void onActivitySaveInstanceState(a aVar, zzcf zzcfVar, long j2);

    void onActivityStarted(a aVar, long j2);

    void onActivityStopped(a aVar, long j2);

    void performAction(Bundle bundle, zzcf zzcfVar, long j2);

    void registerOnMeasurementEventListener(zzci zzciVar);

    void resetAnalyticsData(long j2);

    void setConditionalUserProperty(Bundle bundle, long j2);

    void setConsent(Bundle bundle, long j2);

    void setConsentThirdParty(Bundle bundle, long j2);

    void setCurrentScreen(a aVar, String str, String str2, long j2);

    void setDataCollectionEnabled(boolean z4);

    void setDefaultEventParameters(Bundle bundle);

    void setEventInterceptor(zzci zzciVar);

    void setInstanceIdProvider(zzck zzckVar);

    void setMeasurementEnabled(boolean z4, long j2);

    void setMinimumSessionDuration(long j2);

    void setSessionTimeoutDuration(long j2);

    void setUserId(String str, long j2);

    void setUserProperty(String str, String str2, a aVar, boolean z4, long j2);

    void unregisterOnMeasurementEventListener(zzci zzciVar);
}
