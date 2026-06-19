package w0;

import android.adservices.measurement.MeasurementManager;
import android.content.Context;
import android.net.Uri;
import android.view.InputEvent;
import g4.i;
import o4.f;
import t3.h;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final MeasurementManager f3624a;

    public b(Context context) {
        i.e(context, "context");
        Object systemService = context.getSystemService((Class<Object>) com.google.android.gms.internal.ads.a.z());
        i.d(systemService, "context.getSystemService…:class.java\n            )");
        this.f3624a = com.google.android.gms.internal.ads.a.e(systemService);
    }

    public Object a(a aVar, w3.c cVar) {
        new f(1, a.a.o(cVar)).r();
        com.google.android.gms.internal.ads.a.q();
        throw null;
    }

    public Object b(w3.c cVar) {
        f fVar = new f(1, a.a.o(cVar));
        fVar.r();
        this.f3624a.getMeasurementApiStatus(new l.a(1), new b0.c(fVar));
        Object q5 = fVar.q();
        x3.a aVar = x3.a.f3712g;
        return q5;
    }

    public Object c(Uri uri, InputEvent inputEvent, w3.c cVar) {
        f fVar = new f(1, a.a.o(cVar));
        fVar.r();
        this.f3624a.registerSource(uri, inputEvent, new l.a(1), new b0.c(fVar));
        Object q5 = fVar.q();
        return q5 == x3.a.f3712g ? q5 : h.f3400a;
    }

    public Object d(Uri uri, w3.c cVar) {
        f fVar = new f(1, a.a.o(cVar));
        fVar.r();
        this.f3624a.registerTrigger(uri, new l.a(1), new b0.c(fVar));
        Object q5 = fVar.q();
        return q5 == x3.a.f3712g ? q5 : h.f3400a;
    }

    public Object e(c cVar, w3.c cVar2) {
        new f(1, a.a.o(cVar2)).r();
        com.google.android.gms.internal.ads.a.A();
        throw null;
    }

    public Object f(d dVar, w3.c cVar) {
        new f(1, a.a.o(cVar)).r();
        com.google.android.gms.internal.ads.a.C();
        throw null;
    }
}
