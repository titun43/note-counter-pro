package u;

import android.app.Notification;

/* loaded from: classes.dex */
public final class o extends q {

    /* renamed from: b, reason: collision with root package name */
    public CharSequence f3472b;

    @Override // u.q
    public final void a(r1.h hVar) {
        new Notification.BigTextStyle((Notification.Builder) hVar.h).setBigContentTitle(null).bigText(this.f3472b);
    }

    @Override // u.q
    public final String b() {
        return "androidx.core.app.NotificationCompat$BigTextStyle";
    }
}
