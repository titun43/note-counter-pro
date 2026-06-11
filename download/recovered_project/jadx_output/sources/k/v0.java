package k;

import android.app.Notification;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.os.Parcelable;
import android.widget.TextView;
import androidx.work.impl.foreground.SystemForegroundService;

/* loaded from: classes.dex */
public final class v0 implements Runnable {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f2256g;
    public final int h;

    /* renamed from: i, reason: collision with root package name */
    public final Object f2257i;

    /* renamed from: j, reason: collision with root package name */
    public final Object f2258j;

    public /* synthetic */ v0(Object obj, int i5, int i6, Object obj2) {
        this.f2256g = i6;
        this.f2257i = obj;
        this.f2258j = obj2;
        this.h = i5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2256g) {
            case 0:
                ((TextView) this.f2257i).setTypeface((Typeface) this.f2258j, this.h);
                break;
            case 1:
                ((n.g) this.f2258j).h.onNavigationEvent(this.h, (Bundle) this.f2257i);
                break;
            case 2:
                ((n1.g) this.f2257i).a((Intent) this.f2258j, this.h);
                break;
            default:
                ((SystemForegroundService) this.f2258j).f661k.notify(this.h, (Notification) this.f2257i);
                break;
        }
    }

    public /* synthetic */ v0(Object obj, int i5, Parcelable parcelable, int i6) {
        this.f2256g = i6;
        this.f2258j = obj;
        this.h = i5;
        this.f2257i = parcelable;
    }
}
