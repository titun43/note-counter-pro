package androidx.work;

import android.app.Notification;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final int f637a;

    /* renamed from: b, reason: collision with root package name */
    public final int f638b;

    /* renamed from: c, reason: collision with root package name */
    public final Notification f639c;

    public h(int i5, Notification notification, int i6) {
        this.f637a = i5;
        this.f639c = notification;
        this.f638b = i6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || h.class != obj.getClass()) {
            return false;
        }
        h hVar = (h) obj;
        if (this.f637a == hVar.f637a && this.f638b == hVar.f638b) {
            return this.f639c.equals(hVar.f639c);
        }
        return false;
    }

    public final int hashCode() {
        return this.f639c.hashCode() + (((this.f637a * 31) + this.f638b) * 31);
    }

    public final String toString() {
        return "ForegroundInfo{mNotificationId=" + this.f637a + ", mForegroundServiceType=" + this.f638b + ", mNotification=" + this.f639c + '}';
    }
}
