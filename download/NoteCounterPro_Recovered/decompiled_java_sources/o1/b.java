package o1;

import android.content.ComponentName;
import android.content.Context;
import androidx.work.impl.background.systemjob.SystemJobService;
import androidx.work.n;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: b, reason: collision with root package name */
    public static final String f2738b = n.g("SystemJobInfoConverter");

    /* renamed from: a, reason: collision with root package name */
    public final ComponentName f2739a;

    public b(Context context) {
        this.f2739a = new ComponentName(context.getApplicationContext(), (Class<?>) SystemJobService.class);
    }
}
