package u;

import android.app.Notification;
import android.content.Context;

/* loaded from: classes.dex */
public abstract class f {
    public static String a(Context context) {
        return context.getOpPackageName();
    }

    public static void b(Notification.Builder builder, boolean z4) {
        builder.setAllowSystemGeneratedContextualActions(z4);
    }

    public static void c(Notification.Builder builder) {
        builder.setBubbleMetadata(null);
    }

    public static void d(Notification.Action.Builder builder) {
        builder.setContextual(false);
    }
}
