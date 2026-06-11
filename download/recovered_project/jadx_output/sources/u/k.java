package u;

import android.app.PendingIntent;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;
import com.lokhnathtechnical.notecounterpro.R;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final Bundle f3462a;

    /* renamed from: b, reason: collision with root package name */
    public IconCompat f3463b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f3464c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f3465d;

    /* renamed from: e, reason: collision with root package name */
    public final int f3466e;

    /* renamed from: f, reason: collision with root package name */
    public final CharSequence f3467f;

    /* renamed from: g, reason: collision with root package name */
    public final PendingIntent f3468g;

    public k(String str, PendingIntent pendingIntent) {
        IconCompat b2 = IconCompat.b(R.drawable.common_full_open_on_phone);
        Bundle bundle = new Bundle();
        this.f3465d = true;
        this.f3463b = b2;
        if (b2.d() == 2) {
            this.f3466e = b2.c();
        }
        this.f3467f = p.b(str);
        this.f3468g = pendingIntent;
        this.f3462a = bundle;
        this.f3464c = true;
        this.f3465d = true;
    }
}
