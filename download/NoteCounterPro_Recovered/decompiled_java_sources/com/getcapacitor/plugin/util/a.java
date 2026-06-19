package com.getcapacitor.plugin.util;

import android.app.NotificationChannel;
import android.media.AudioFocusRequest;

/* loaded from: classes.dex */
public abstract /* synthetic */ class a {
    public static /* synthetic */ NotificationChannel e(int i5) {
        return new NotificationChannel("offline_notification_channel", "AdMob Offline Notifications", i5);
    }

    public static /* synthetic */ AudioFocusRequest.Builder i() {
        return new AudioFocusRequest.Builder(1);
    }

    public static /* bridge */ /* synthetic */ AudioFocusRequest n(Object obj) {
        return (AudioFocusRequest) obj;
    }

    public static /* synthetic */ void r() {
    }
}
