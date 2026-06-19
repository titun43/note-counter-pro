package u;

import android.app.Notification;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import androidx.core.graphics.drawable.IconCompat;

/* loaded from: classes.dex */
public final class n extends q {

    /* renamed from: b, reason: collision with root package name */
    public IconCompat f3469b;

    /* renamed from: c, reason: collision with root package name */
    public IconCompat f3470c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f3471d;

    @Override // u.q
    public final void a(r1.h hVar) {
        Bitmap a5;
        Notification.Builder builder = (Notification.Builder) hVar.h;
        Context context = (Context) hVar.f3161g;
        Notification.BigPictureStyle bigContentTitle = new Notification.BigPictureStyle(builder).setBigContentTitle(null);
        IconCompat iconCompat = this.f3469b;
        if (iconCompat != null) {
            if (Build.VERSION.SDK_INT >= 31) {
                m.a(bigContentTitle, iconCompat.f(context));
            } else if (iconCompat.d() == 1) {
                IconCompat iconCompat2 = this.f3469b;
                int i5 = iconCompat2.f215a;
                if (i5 == -1) {
                    Object obj = iconCompat2.f216b;
                    a5 = obj instanceof Bitmap ? (Bitmap) obj : null;
                } else if (i5 == 1) {
                    a5 = (Bitmap) iconCompat2.f216b;
                } else {
                    if (i5 != 5) {
                        throw new IllegalStateException("called getBitmap() on " + iconCompat2);
                    }
                    a5 = IconCompat.a((Bitmap) iconCompat2.f216b, true);
                }
                bigContentTitle = bigContentTitle.bigPicture(a5);
            }
        }
        if (this.f3471d) {
            IconCompat iconCompat3 = this.f3470c;
            if (iconCompat3 == null) {
                bigContentTitle.bigLargeIcon((Bitmap) null);
            } else {
                l.a(bigContentTitle, iconCompat3.f(context));
            }
        }
        if (Build.VERSION.SDK_INT >= 31) {
            m.c(bigContentTitle, false);
            m.b(bigContentTitle, null);
        }
    }

    @Override // u.q
    public final String b() {
        return "androidx.core.app.NotificationCompat$BigPictureStyle";
    }
}
