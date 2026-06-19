package g0;

import android.app.NotificationChannel;
import java.nio.file.attribute.BasicFileAttributes;

/* loaded from: classes.dex */
public abstract /* synthetic */ class b {
    public static /* synthetic */ NotificationChannel c(String str) {
        return new NotificationChannel("com.google.android.gms.availability", str, 4);
    }

    public static /* bridge */ /* synthetic */ Class j() {
        return BasicFileAttributes.class;
    }
}
