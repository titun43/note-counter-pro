package androidx.activity;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Handler;
import android.os.Trace;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import com.getcapacitor.plugin.SystemBars;
import java.lang.reflect.Method;
import java.nio.MappedByteBuffer;
import k.u0;

/* loaded from: classes.dex */
public final /* synthetic */ class o implements Runnable {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f56g;
    public final /* synthetic */ Object h;

    public /* synthetic */ o(Object obj, int i5) {
        this.f56g = i5;
        this.h = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        ?? r2 = 1;
        r2 = 1;
        u.c cVar = null;
        switch (this.f56g) {
            case 0:
                p pVar = (p) this.h;
                Runnable runnable = pVar.h;
                if (runnable != null) {
                    runnable.run();
                    pVar.h = null;
                    return;
                }
                return;
            case 1:
                u.a((u) this.h);
                return;
            case 2:
                androidx.emoji2.text.v vVar = (androidx.emoji2.text.v) this.h;
                synchronized (vVar.f288j) {
                    try {
                        if (vVar.f292n == null) {
                            return;
                        }
                        try {
                            c0.k b2 = vVar.b();
                            int i5 = b2.f770f;
                            if (i5 == 2) {
                                synchronized (vVar.f288j) {
                                }
                            }
                            if (i5 != 0) {
                                throw new RuntimeException("fetchFonts result is not OK. (" + i5 + ")");
                            }
                            try {
                                int i6 = b0.i.f691a;
                                Trace.beginSection("EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface");
                                t2.i iVar = vVar.f287i;
                                Context context = vVar.f286g;
                                iVar.getClass();
                                c0.k[] kVarArr = {b2};
                                b3.g gVar = y.f.f3734a;
                                a.a.e("TypefaceCompat.createFromFontInfo");
                                try {
                                    Typeface i7 = y.f.f3734a.i(context, kVarArr, 0);
                                    Trace.endSection();
                                    MappedByteBuffer A = y4.b.A(vVar.f286g, b2.f765a);
                                    if (A == null || i7 == null) {
                                        throw new RuntimeException("Unable to open file.");
                                    }
                                    try {
                                        Trace.beginSection("EmojiCompat.MetadataRepo.create");
                                        r1.h hVar = new r1.h(i7, b3.g.w(A));
                                        Trace.endSection();
                                        synchronized (vVar.f288j) {
                                            try {
                                                z2.b bVar = vVar.f292n;
                                                if (bVar != null) {
                                                    bVar.t(hVar);
                                                }
                                            } finally {
                                            }
                                        }
                                        vVar.a();
                                        return;
                                    } finally {
                                        int i8 = b0.i.f691a;
                                    }
                                } finally {
                                    Trace.endSection();
                                }
                            } finally {
                            }
                        } catch (Throwable th) {
                            synchronized (vVar.f288j) {
                                try {
                                    z2.b bVar2 = vVar.f292n;
                                    if (bVar2 != null) {
                                        bVar2.s(th);
                                    }
                                    vVar.a();
                                    return;
                                } finally {
                                }
                            }
                        }
                    } finally {
                    }
                }
            case 3:
                androidx.lifecycle.e0 e0Var = (androidx.lifecycle.e0) this.h;
                androidx.lifecycle.v vVar2 = e0Var.f538l;
                if (e0Var.h == 0) {
                    e0Var.f535i = true;
                    vVar2.e(androidx.lifecycle.m.ON_PAUSE);
                }
                if (e0Var.f534g == 0 && e0Var.f535i) {
                    vVar2.e(androidx.lifecycle.m.ON_STOP);
                    e0Var.f536j = true;
                    return;
                }
                return;
            case 4:
                ((SystemBars) this.h).lambda$onDOMReady$5();
                return;
            case 5:
                View view = (View) this.h;
                ((InputMethodManager) view.getContext().getSystemService("input_method")).showSoftInput(view, 0);
                return;
            case 6:
                r1.h hVar2 = (r1.h) this.h;
                ((m2.h) ((n2.c) hVar2.f3163j)).g(new com.getcapacitor.plugin.c(hVar2, 8));
                return;
            case 7:
                Activity activity = (Activity) this.h;
                if (activity.isFinishing()) {
                    return;
                }
                Handler handler = u.d.f3459g;
                Method method = u.d.f3458f;
                int i9 = Build.VERSION.SDK_INT;
                if (i9 >= 28) {
                    activity.recreate();
                    return;
                }
                if (((i9 != 26 && i9 != 27) || method != null) && (u.d.f3457e != null || u.d.f3456d != null)) {
                    try {
                        Object obj2 = u.d.f3455c.get(activity);
                        if (obj2 != null && (obj = u.d.f3454b.get(activity)) != null) {
                            Application application = activity.getApplication();
                            u.c cVar2 = new u.c(activity);
                            application.registerActivityLifecycleCallbacks(cVar2);
                            handler.post(new c0.a(18, cVar2, obj2));
                            if (i9 != 26 && i9 != 27) {
                                r2 = 0;
                            }
                            int i10 = 19;
                            try {
                                if (r2 != 0) {
                                    try {
                                        Boolean bool = Boolean.FALSE;
                                        r2 = application;
                                        cVar = cVar2;
                                        method.invoke(obj, obj2, null, null, 0, bool, null, null, bool, bool);
                                    } catch (Throwable th2) {
                                        th = th2;
                                        Application application2 = application;
                                        cVar = cVar2;
                                        handler.post(new c0.a(i10, application2, cVar));
                                        throw th;
                                    }
                                } else {
                                    r2 = application;
                                    cVar = cVar2;
                                    activity.recreate();
                                }
                                handler.post(new c0.a(i10, r2, cVar));
                                return;
                            } catch (Throwable th3) {
                                th = th3;
                            }
                        }
                    } catch (Throwable unused) {
                    }
                }
                activity.recreate();
                return;
            default:
                ((u0) this.h).getClass();
                return;
        }
    }
}
