package u1;

import android.content.ComponentName;
import android.content.Context;
import androidx.emoji2.text.u;

/* loaded from: classes.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    public static final String f3504a = androidx.work.n.g("PackageManagerHelper");

    public static void a(Context context, Class cls, boolean z4) {
        String str = f3504a;
        try {
            context.getPackageManager().setComponentEnabledSetting(new ComponentName(context, cls.getName()), z4 ? 1 : 2, 1);
            androidx.work.n.e().b(str, cls.getName() + " " + (z4 ? "enabled" : "disabled"), new Throwable[0]);
        } catch (Exception e4) {
            androidx.work.n.e().b(str, u.k(cls.getName(), " could not be ", z4 ? "enabled" : "disabled"), e4);
        }
    }
}
