package n;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.emoji2.text.p;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final Intent f2632a;

    /* renamed from: b, reason: collision with root package name */
    public final t2.i f2633b;

    /* renamed from: c, reason: collision with root package name */
    public ActivityOptions f2634c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f2635d;

    public l() {
        this.f2632a = new Intent("android.intent.action.VIEW");
        this.f2633b = new t2.i(20);
        this.f2635d = true;
    }

    public final p a() {
        Intent intent = this.f2632a;
        if (!intent.hasExtra("android.support.customtabs.extra.SESSION")) {
            Bundle bundle = new Bundle();
            bundle.putBinder("android.support.customtabs.extra.SESSION", null);
            intent.putExtras(bundle);
        }
        intent.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", this.f2635d);
        this.f2633b.getClass();
        intent.putExtras(new Bundle());
        intent.putExtra("androidx.browser.customtabs.extra.SHARE_STATE", 0);
        int i5 = Build.VERSION.SDK_INT;
        String a5 = j.a();
        if (!TextUtils.isEmpty(a5)) {
            Bundle bundleExtra = intent.hasExtra("com.android.browser.headers") ? intent.getBundleExtra("com.android.browser.headers") : new Bundle();
            if (!bundleExtra.containsKey("Accept-Language")) {
                bundleExtra.putString("Accept-Language", a5);
                intent.putExtra("com.android.browser.headers", bundleExtra);
            }
        }
        if (i5 >= 34) {
            if (this.f2634c == null) {
                this.f2634c = i.a();
            }
            k.a(this.f2634c, false);
        }
        ActivityOptions activityOptions = this.f2634c;
        return new p(14, intent, activityOptions != null ? activityOptions.toBundle() : null);
    }

    public l(o oVar) {
        Intent intent = new Intent("android.intent.action.VIEW");
        this.f2632a = intent;
        this.f2633b = new t2.i(20);
        this.f2635d = true;
        if (oVar != null) {
            intent.setPackage(oVar.f2639d.getPackageName());
            g gVar = oVar.f2638c;
            Bundle bundle = new Bundle();
            bundle.putBinder("android.support.customtabs.extra.SESSION", gVar);
            intent.putExtras(bundle);
        }
    }
}
