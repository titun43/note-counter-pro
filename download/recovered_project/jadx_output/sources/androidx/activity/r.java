package androidx.activity;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;

/* loaded from: classes.dex */
public final class r extends d.h {
    public final /* synthetic */ s h;

    public r(s sVar) {
        this.h = sVar;
    }

    @Override // d.h
    public final void b(int i5, e.a aVar, Object obj) {
        Bundle bundle;
        int i6;
        g4.i.e(aVar, "contract");
        s sVar = this.h;
        k1.j b2 = aVar.b(sVar, obj);
        if (b2 != null) {
            new Handler(Looper.getMainLooper()).post(new q(this, i5, 0, b2));
            return;
        }
        Intent a5 = aVar.a(sVar, obj);
        if (a5.getExtras() != null) {
            Bundle extras = a5.getExtras();
            g4.i.b(extras);
            if (extras.getClassLoader() == null) {
                a5.setExtrasClassLoader(sVar.getClassLoader());
            }
        }
        if (a5.hasExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) {
            bundle = a5.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
            a5.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
        } else {
            bundle = null;
        }
        Bundle bundle2 = bundle;
        if ("androidx.activity.result.contract.action.REQUEST_PERMISSIONS".equals(a5.getAction())) {
            String[] stringArrayExtra = a5.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
            if (stringArrayExtra == null) {
                stringArrayExtra = new String[0];
            }
            u.b.a(sVar, stringArrayExtra, i5);
            return;
        }
        if (!"androidx.activity.result.contract.action.INTENT_SENDER_REQUEST".equals(a5.getAction())) {
            sVar.startActivityForResult(a5, i5, bundle2);
            return;
        }
        d.i iVar = (d.i) a5.getParcelableExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST");
        try {
            g4.i.b(iVar);
            i6 = i5;
        } catch (IntentSender.SendIntentException e4) {
            e = e4;
            i6 = i5;
        }
        try {
            sVar.startIntentSenderForResult(iVar.f1176g, i6, iVar.h, iVar.f1177i, iVar.f1178j, 0, bundle2);
        } catch (IntentSender.SendIntentException e5) {
            e = e5;
            new Handler(Looper.getMainLooper()).post(new q(this, i6, 1, e));
        }
    }
}
