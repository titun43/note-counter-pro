package y1;

import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.internal.play_billing.zze;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public int f3832a;

    /* renamed from: b, reason: collision with root package name */
    public String f3833b;

    public static c0.j a() {
        c0.j jVar = new c0.j();
        jVar.f764b = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        return jVar;
    }

    public final String toString() {
        return "Response Code: " + zze.zzi(this.f3832a) + ", Debug Message: " + this.f3833b;
    }
}
