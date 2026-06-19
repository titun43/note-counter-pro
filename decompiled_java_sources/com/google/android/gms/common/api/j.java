package com.google.android.gms.common.api;

import com.google.android.gms.ads.RequestConfiguration;

/* loaded from: classes.dex */
public class j extends Exception {

    /* renamed from: g, reason: collision with root package name */
    public final Status f1032g;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public j(Status status) {
        super(r4.toString());
        int i5 = status.f929g;
        String str = status.h;
        str = str == null ? RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED : str;
        StringBuilder sb = new StringBuilder(String.valueOf(i5).length() + 2 + String.valueOf(str).length());
        sb.append(i5);
        sb.append(": ");
        sb.append(str);
        this.f1032g = status;
    }
}
