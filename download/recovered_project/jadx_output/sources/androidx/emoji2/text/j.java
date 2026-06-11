package androidx.emoji2.text;

import androidx.work.impl.foreground.SystemForegroundService;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class j implements Runnable {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f259g;
    public final int h;

    /* renamed from: i, reason: collision with root package name */
    public final Object f260i;

    public /* synthetic */ j(Object obj, int i5, int i6) {
        this.f259g = i6;
        this.f260i = obj;
        this.h = i5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f259g) {
            case 0:
                ArrayList arrayList = (ArrayList) this.f260i;
                int size = arrayList.size();
                int i5 = 0;
                if (this.h == 1) {
                    while (i5 < size) {
                        ((i) arrayList.get(i5)).a();
                        i5++;
                    }
                    break;
                } else {
                    while (i5 < size) {
                        ((i) arrayList.get(i5)).getClass();
                        i5++;
                    }
                    break;
                }
            case 1:
                ((com.google.android.gms.common.api.internal.a0) this.f260i).g(this.h);
                break;
            default:
                ((SystemForegroundService) this.f260i).f661k.cancel(this.h);
                break;
        }
    }

    public j(List list, int i5, Throwable th) {
        this.f259g = 0;
        y4.b.g(list, "initCallbacks cannot be null");
        this.f260i = new ArrayList(list);
        this.h = i5;
    }
}
