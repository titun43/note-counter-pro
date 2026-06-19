package g;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public abstract class r {

    /* renamed from: g, reason: collision with root package name */
    public static final p f1612g = new p(new q(0));
    public static final int h = -100;

    /* renamed from: i, reason: collision with root package name */
    public static b0.g f1613i = null;

    /* renamed from: j, reason: collision with root package name */
    public static b0.g f1614j = null;

    /* renamed from: k, reason: collision with root package name */
    public static Boolean f1615k = null;

    /* renamed from: l, reason: collision with root package name */
    public static boolean f1616l = false;

    /* renamed from: m, reason: collision with root package name */
    public static final o.g f1617m = new o.g(0);

    /* renamed from: n, reason: collision with root package name */
    public static final Object f1618n = new Object();

    /* renamed from: o, reason: collision with root package name */
    public static final Object f1619o = new Object();

    public static b0.g a() {
        Object obj;
        Context context;
        if (Build.VERSION.SDK_INT >= 33) {
            o.g gVar = f1617m;
            gVar.getClass();
            o.b bVar = new o.b(gVar);
            while (true) {
                if (!bVar.hasNext()) {
                    obj = null;
                    break;
                }
                r rVar = (r) ((WeakReference) bVar.next()).get();
                if (rVar != null && (context = ((f0) rVar).f1544q) != null) {
                    obj = context.getSystemService("locale");
                    break;
                }
            }
            if (obj != null) {
                return new b0.g(new b0.h(o.a(obj)));
            }
        } else {
            b0.g gVar2 = f1613i;
            if (gVar2 != null) {
                return gVar2;
            }
        }
        return b0.g.f688b;
    }

    public static boolean d(Context context) {
        if (f1615k == null) {
            try {
                int i5 = k0.f1589g;
                Bundle bundle = context.getPackageManager().getServiceInfo(new ComponentName(context, (Class<?>) k0.class), j0.a() | 128).metaData;
                if (bundle != null) {
                    f1615k = Boolean.valueOf(bundle.getBoolean("autoStoreLocales"));
                }
            } catch (PackageManager.NameNotFoundException unused) {
                Log.d("AppCompatDelegate", "Checking for metadata for AppLocalesMetadataHolderService : Service not found");
                f1615k = Boolean.FALSE;
            }
        }
        return f1615k.booleanValue();
    }

    public static void i(f0 f0Var) {
        synchronized (f1618n) {
            try {
                o.g gVar = f1617m;
                gVar.getClass();
                o.b bVar = new o.b(gVar);
                while (bVar.hasNext()) {
                    r rVar = (r) ((WeakReference) bVar.next()).get();
                    if (rVar == f0Var || rVar == null) {
                        bVar.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public abstract void b();

    public abstract void c();

    public abstract void e();

    public abstract void h();

    public abstract boolean j(int i5);

    public abstract void k(int i5);

    public abstract void l(View view);

    public abstract void m(View view, ViewGroup.LayoutParams layoutParams);

    public abstract void n(CharSequence charSequence);

    public abstract i.b o(i.a aVar);
}
