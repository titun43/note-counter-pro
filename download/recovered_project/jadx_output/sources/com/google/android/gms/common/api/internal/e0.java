package com.google.android.gms.common.api.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;

/* loaded from: classes.dex */
public final class e0 extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public Context f965a;

    /* renamed from: b, reason: collision with root package name */
    public final androidx.emoji2.text.p f966b;

    public e0(androidx.emoji2.text.p pVar) {
        this.f966b = pVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Uri data = intent.getData();
        if ("com.google.android.gms".equals(data != null ? data.getSchemeSpecificPart() : null)) {
            Object obj = this.f966b.f274i;
            throw null;
        }
    }
}
