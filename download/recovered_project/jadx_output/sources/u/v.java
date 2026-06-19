package u;

import android.app.NotificationManager;
import android.content.Context;
import java.util.HashSet;

/* loaded from: classes.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public final NotificationManager f3490a;

    static {
        new HashSet();
    }

    public v(Context context) {
        this.f3490a = (NotificationManager) context.getSystemService("notification");
    }
}
