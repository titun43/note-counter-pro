package com.google.android.gms.common.internal;

import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.util.Log;
import com.google.android.gms.common.api.GoogleApiActivity;

/* loaded from: classes.dex */
public final class w implements DialogInterface.OnClickListener {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f1125g;
    public final /* synthetic */ Intent h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f1126i;

    public /* synthetic */ w(Intent intent, Object obj, int i5) {
        this.f1125g = i5;
        this.h = intent;
        this.f1126i = obj;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [com.google.android.gms.common.api.internal.i, java.lang.Object] */
    public final void a() {
        switch (this.f1125g) {
            case 0:
                Intent intent = this.h;
                if (intent != null) {
                    ((GoogleApiActivity) this.f1126i).startActivityForResult(intent, 2);
                    break;
                }
                break;
            default:
                Intent intent2 = this.h;
                if (intent2 != null) {
                    this.f1126i.a(intent2, 2);
                    break;
                }
                break;
        }
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i5) {
        try {
            try {
                a();
            } catch (ActivityNotFoundException e4) {
                Log.e("DialogRedirect", true == Build.FINGERPRINT.contains("generic") ? "Failed to start resolution intent. This may occur when resolving Google Play services connection issues on emulators with Google APIs but not Google Play Store." : "Failed to start resolution intent.", e4);
            }
        } finally {
            dialogInterface.dismiss();
        }
    }
}
