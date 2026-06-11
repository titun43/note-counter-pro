package androidx.lifecycle;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import java.util.List;

/* loaded from: classes.dex */
public final class ProcessLifecycleInitializer implements f1.b {
    @Override // f1.b
    public final List a() {
        return u3.o.f3547g;
    }

    @Override // f1.b
    public final Object b(Context context) {
        g4.i.e(context, "context");
        f1.a c5 = f1.a.c(context);
        g4.i.d(c5, "getInstance(context)");
        if (!c5.f1437b.contains(ProcessLifecycleInitializer.class)) {
            throw new IllegalStateException("ProcessLifecycleInitializer cannot be initialized lazily.\n               Please ensure that you have:\n               <meta-data\n                   android:name='androidx.lifecycle.ProcessLifecycleInitializer'\n                   android:value='androidx.startup' />\n               under InitializationProvider in your AndroidManifest.xml");
        }
        if (!q.f571a.getAndSet(true)) {
            Context applicationContext = context.getApplicationContext();
            g4.i.c(applicationContext, "null cannot be cast to non-null type android.app.Application");
            ((Application) applicationContext).registerActivityLifecycleCallbacks(new p());
        }
        e0 e0Var = e0.f533o;
        e0Var.getClass();
        e0Var.f537k = new Handler();
        e0Var.f538l.e(m.ON_CREATE);
        Context applicationContext2 = context.getApplicationContext();
        g4.i.c(applicationContext2, "null cannot be cast to non-null type android.app.Application");
        ((Application) applicationContext2).registerActivityLifecycleCallbacks(new d0(e0Var));
        return e0Var;
    }
}
