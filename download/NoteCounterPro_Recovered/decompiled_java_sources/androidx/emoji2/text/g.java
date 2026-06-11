package androidx.emoji2.text;

import android.content.Context;
import com.google.android.gms.internal.play_billing.zze;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public volatile Object f256a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f257b;

    /* renamed from: c, reason: collision with root package name */
    public volatile Object f258c;

    public /* synthetic */ g(Object obj) {
        this.f257b = obj;
    }

    public boolean a() {
        Context context = (Context) this.f257b;
        try {
            return context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData.getBoolean("com.google.android.play.billingclient.enableBillingOverridesTesting", false);
        } catch (Exception e4) {
            zze.zzm("BillingClient", "Unable to retrieve metadata value for enableBillingOverridesTesting.", e4);
            return false;
        }
    }
}
